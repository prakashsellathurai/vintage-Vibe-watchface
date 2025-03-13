package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.health.services.client.R;
import androidx.viewpager.widget.ViewPager;
import h4.a;
import j0.t;
import j0.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import k0.c;
import n0.j;
import u4.k;
import u4.n;

@ViewPager.c
public class TabLayout extends HorizontalScrollView {
    public static final i0.e O = new i0.e(16);
    public boolean A;
    public boolean B;
    public int C;
    public boolean D;
    public a E;
    public c F;
    public final ArrayList<c> G = new ArrayList<>();
    public i H;
    public ValueAnimator I;
    public ViewPager J;
    public g K;
    public b L;
    public boolean M;
    public final s.e N = new s.e(12, 1);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<f> f3371a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public f f3372b;

    /* renamed from: c  reason: collision with root package name */
    public final e f3373c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3374d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3375f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3376g;

    /* renamed from: h  reason: collision with root package name */
    public final int f3377h;

    /* renamed from: i  reason: collision with root package name */
    public ColorStateList f3378i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f3379j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f3380k;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f3381l = new GradientDrawable();

    /* renamed from: m  reason: collision with root package name */
    public int f3382m = 0;

    /* renamed from: n  reason: collision with root package name */
    public final PorterDuff.Mode f3383n;

    /* renamed from: o  reason: collision with root package name */
    public final float f3384o;

    /* renamed from: p  reason: collision with root package name */
    public final float f3385p;

    /* renamed from: q  reason: collision with root package name */
    public final int f3386q;
    public int r = Integer.MAX_VALUE;

    /* renamed from: s  reason: collision with root package name */
    public final int f3387s;

    /* renamed from: t  reason: collision with root package name */
    public final int f3388t;

    /* renamed from: u  reason: collision with root package name */
    public final int f3389u;

    /* renamed from: v  reason: collision with root package name */
    public final int f3390v;
    public int w;

    /* renamed from: x  reason: collision with root package name */
    public final int f3391x;
    public int y;

    /* renamed from: z  reason: collision with root package name */
    public int f3392z;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    public class b implements ViewPager.g {
        public b() {
        }

        public final void a(ViewPager viewPager) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.J == viewPager) {
                tabLayout.i();
            }
        }
    }

    @Deprecated
    public interface c<T extends f> {
        void a();

        void b();

        void c(T t8);
    }

    public interface d extends c<f> {
    }

    public class e extends LinearLayout {

        /* renamed from: a  reason: collision with root package name */
        public ValueAnimator f3395a;

        /* renamed from: b  reason: collision with root package name */
        public int f3396b = -1;

        /* renamed from: c  reason: collision with root package name */
        public float f3397c;

        public e(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        public final void a() {
            View childAt = getChildAt(this.f3396b);
            TabLayout tabLayout = TabLayout.this;
            a aVar = tabLayout.E;
            Drawable drawable = tabLayout.f3381l;
            aVar.getClass();
            RectF a9 = a.a(tabLayout, childAt);
            drawable.setBounds((int) a9.left, drawable.getBounds().top, (int) a9.right, drawable.getBounds().bottom);
        }

        public final void b(View view, View view2, float f9) {
            if (view != null && view.getWidth() > 0) {
                TabLayout tabLayout = TabLayout.this;
                tabLayout.E.b(tabLayout, view, view2, f9, tabLayout.f3381l);
            } else {
                TabLayout tabLayout2 = TabLayout.this;
                Drawable drawable = tabLayout2.f3381l;
                drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout2.f3381l.getBounds().bottom);
            }
            int[] iArr = x.f4957a;
            x.c.k(this);
        }

        public final void c(int i8, boolean z8, int i9) {
            View childAt = getChildAt(this.f3396b);
            View childAt2 = getChildAt(i8);
            if (childAt2 == null) {
                a();
                return;
            }
            b bVar = new b(this, childAt, childAt2);
            if (z8) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f3395a = valueAnimator;
                valueAnimator.setInterpolator(f4.a.f4392b);
                valueAnimator.setDuration((long) i9);
                valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                valueAnimator.addUpdateListener(bVar);
                valueAnimator.addListener(new c(this, i8));
                valueAnimator.start();
                return;
            }
            this.f3395a.removeAllUpdateListeners();
            this.f3395a.addUpdateListener(bVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void draw(android.graphics.Canvas r7) {
            /*
                r6 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r1 = r0.f3381l
                android.graphics.Rect r1 = r1.getBounds()
                int r1 = r1.height()
                if (r1 >= 0) goto L_0x0014
                android.graphics.drawable.Drawable r1 = r0.f3381l
                int r1 = r1.getIntrinsicHeight()
            L_0x0014:
                int r2 = r0.y
                if (r2 == 0) goto L_0x0033
                r3 = 1
                r4 = 2
                if (r2 == r3) goto L_0x0024
                r3 = 0
                if (r2 == r4) goto L_0x003d
                r1 = 3
                if (r2 == r1) goto L_0x0039
                r1 = r3
                goto L_0x003d
            L_0x0024:
                int r2 = r6.getHeight()
                int r2 = r2 - r1
                int r3 = r2 / 2
                int r2 = r6.getHeight()
                int r2 = r2 + r1
                int r1 = r2 / 2
                goto L_0x003d
            L_0x0033:
                int r2 = r6.getHeight()
                int r3 = r2 - r1
            L_0x0039:
                int r1 = r6.getHeight()
            L_0x003d:
                android.graphics.drawable.Drawable r2 = r0.f3381l
                android.graphics.Rect r2 = r2.getBounds()
                int r2 = r2.width()
                if (r2 <= 0) goto L_0x0064
                android.graphics.drawable.Drawable r2 = r0.f3381l
                android.graphics.Rect r2 = r2.getBounds()
                android.graphics.drawable.Drawable r4 = r0.f3381l
                int r5 = r2.left
                int r2 = r2.right
                r4.setBounds(r5, r3, r2, r1)
                android.graphics.drawable.Drawable r1 = r0.f3381l
                int r0 = r0.f3382m
                if (r0 == 0) goto L_0x0061
                d0.b.g(r1, r0)
            L_0x0061:
                r1.draw(r7)
            L_0x0064:
                super.draw(r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.e.draw(android.graphics.Canvas):void");
        }

        public final void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
            super.onLayout(z8, i8, i9, i10, i11);
            ValueAnimator valueAnimator = this.f3395a;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                a();
            } else {
                c(this.f3396b, false, -1);
            }
        }

        public final void onMeasure(int i8, int i9) {
            super.onMeasure(i8, i9);
            if (View.MeasureSpec.getMode(i8) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                boolean z8 = true;
                if (tabLayout.w == 1 || tabLayout.f3392z == 2) {
                    int childCount = getChildCount();
                    int i10 = 0;
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = getChildAt(i11);
                        if (childAt.getVisibility() == 0) {
                            i10 = Math.max(i10, childAt.getMeasuredWidth());
                        }
                    }
                    if (i10 > 0) {
                        if (i10 * childCount <= getMeasuredWidth() - (((int) n.a(getContext(), 16)) * 2)) {
                            boolean z9 = false;
                            for (int i12 = 0; i12 < childCount; i12++) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i12).getLayoutParams();
                                if (layoutParams.width != i10 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i10;
                                    layoutParams.weight = 0.0f;
                                    z9 = true;
                                }
                            }
                            z8 = z9;
                        } else {
                            tabLayout.w = 0;
                            tabLayout.m(false);
                        }
                        if (z8) {
                            super.onMeasure(i8, i9);
                        }
                    }
                }
            }
        }

        public final void onRtlPropertiesChanged(int i8) {
            super.onRtlPropertiesChanged(i8);
        }
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public Drawable f3399a;

        /* renamed from: b  reason: collision with root package name */
        public CharSequence f3400b;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f3401c;

        /* renamed from: d  reason: collision with root package name */
        public int f3402d = -1;
        public View e;

        /* renamed from: f  reason: collision with root package name */
        public final int f3403f = 1;

        /* renamed from: g  reason: collision with root package name */
        public TabLayout f3404g;

        /* renamed from: h  reason: collision with root package name */
        public h f3405h;

        /* renamed from: i  reason: collision with root package name */
        public int f3406i = -1;
    }

    public static class g implements ViewPager.h {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<TabLayout> f3407a;

        /* renamed from: b  reason: collision with root package name */
        public int f3408b;

        /* renamed from: c  reason: collision with root package name */
        public int f3409c;

        public g(TabLayout tabLayout) {
            this.f3407a = new WeakReference<>(tabLayout);
        }

        public final void a(int i8) {
            this.f3408b = this.f3409c;
            this.f3409c = i8;
        }

        public final void b(float f9, int i8) {
            TabLayout tabLayout = this.f3407a.get();
            if (tabLayout != null) {
                int i9 = this.f3409c;
                boolean z8 = false;
                boolean z9 = i9 != 2 || this.f3408b == 1;
                if (!(i9 == 2 && this.f3408b == 0)) {
                    z8 = true;
                }
                tabLayout.k(i8, f9, z9, z8);
            }
        }
    }

    public final class h extends LinearLayout {

        /* renamed from: l  reason: collision with root package name */
        public static final /* synthetic */ int f3410l = 0;

        /* renamed from: a  reason: collision with root package name */
        public f f3411a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f3412b;

        /* renamed from: c  reason: collision with root package name */
        public ImageView f3413c;

        /* renamed from: d  reason: collision with root package name */
        public View f3414d;
        public h4.a e;

        /* renamed from: f  reason: collision with root package name */
        public View f3415f;

        /* renamed from: g  reason: collision with root package name */
        public TextView f3416g;

        /* renamed from: h  reason: collision with root package name */
        public ImageView f3417h;

        /* renamed from: i  reason: collision with root package name */
        public Drawable f3418i;

        /* renamed from: j  reason: collision with root package name */
        public int f3419j = 2;

        public h(Context context) {
            super(context);
            f(context);
            int i8 = TabLayout.this.f3374d;
            int[] iArr = x.f4957a;
            x.d.k(this, i8, TabLayout.this.e, TabLayout.this.f3375f, TabLayout.this.f3376g);
            setGravity(17);
            setOrientation(TabLayout.this.A ^ true ? 1 : 0);
            setClickable(true);
            x.j.d(this, t.b(getContext(), 1002));
        }

        private h4.a getBadge() {
            return this.e;
        }

        private h4.a getOrCreateBadge() {
            int max;
            if (this.e == null) {
                Context context = getContext();
                h4.a aVar = new h4.a(context);
                TypedArray d9 = k.d(context, (AttributeSet) null, a1.a.K, R.attr.badgeStyle, -2146303354, new int[0]);
                int i8 = d9.getInt(4, 4);
                a.C0062a aVar2 = aVar.f4757h;
                int i9 = aVar2.f4770j;
                u4.i iVar = aVar.f4753c;
                if (i9 != i8) {
                    aVar2.f4770j = i8;
                    aVar.f4760k = ((int) Math.pow(10.0d, ((double) i8) - 1.0d)) - 1;
                    iVar.f7777d = true;
                    aVar.g();
                    aVar.invalidateSelf();
                }
                if (d9.hasValue(5) && aVar2.f4769i != (max = Math.max(0, d9.getInt(5, 0)))) {
                    aVar2.f4769i = max;
                    iVar.f7777d = true;
                    aVar.g();
                    aVar.invalidateSelf();
                }
                int defaultColor = v4.c.a(context, d9, 0).getDefaultColor();
                aVar2.f4766f = defaultColor;
                ColorStateList valueOf = ColorStateList.valueOf(defaultColor);
                y4.f fVar = aVar.f4752b;
                if (fVar.f8412a.f8435c != valueOf) {
                    fVar.j(valueOf);
                    aVar.invalidateSelf();
                }
                if (d9.hasValue(2)) {
                    int defaultColor2 = v4.c.a(context, d9, 2).getDefaultColor();
                    aVar2.f4767g = defaultColor2;
                    if (iVar.f7774a.getColor() != defaultColor2) {
                        iVar.f7774a.setColor(defaultColor2);
                        aVar.invalidateSelf();
                    }
                }
                int i10 = d9.getInt(1, 8388661);
                if (aVar2.f4774n != i10) {
                    aVar2.f4774n = i10;
                    WeakReference<View> weakReference = aVar.f4764o;
                    if (!(weakReference == null || weakReference.get() == null)) {
                        View view = aVar.f4764o.get();
                        WeakReference<FrameLayout> weakReference2 = aVar.f4765p;
                        aVar.f(view, weakReference2 != null ? weakReference2.get() : null);
                    }
                }
                aVar2.f4776p = d9.getDimensionPixelOffset(3, 0);
                aVar.g();
                aVar2.f4777q = d9.getDimensionPixelOffset(6, 0);
                aVar.g();
                d9.recycle();
                this.e = aVar;
            }
            c();
            h4.a aVar3 = this.e;
            if (aVar3 != null) {
                return aVar3;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        public final void a(View view) {
            if ((this.e != null) && view != null) {
                setClipChildren(false);
                setClipToPadding(false);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(false);
                    viewGroup.setClipToPadding(false);
                }
                h4.a aVar = this.e;
                Rect rect = new Rect();
                view.getDrawingRect(rect);
                aVar.setBounds(rect);
                aVar.f(view, (FrameLayout) null);
                if (aVar.c() != null) {
                    aVar.c().setForeground(aVar);
                } else {
                    view.getOverlay().add(aVar);
                }
                this.f3414d = view;
            }
        }

        public final void b() {
            if (this.e != null) {
                setClipChildren(true);
                setClipToPadding(true);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(true);
                    viewGroup.setClipToPadding(true);
                }
                View view = this.f3414d;
                if (view != null) {
                    h4.a aVar = this.e;
                    if (aVar != null) {
                        if (aVar.c() != null) {
                            aVar.c().setForeground((Drawable) null);
                        } else {
                            view.getOverlay().remove(aVar);
                        }
                    }
                    this.f3414d = null;
                }
            }
        }

        public final void c() {
            View view;
            f fVar;
            f fVar2;
            if (this.e != null) {
                if (this.f3415f == null) {
                    View view2 = this.f3413c;
                    if (view2 == null || (fVar2 = this.f3411a) == null || fVar2.f3399a == null) {
                        view2 = this.f3412b;
                        if (!(view2 == null || (fVar = this.f3411a) == null || fVar.f3403f != 1)) {
                            if (this.f3414d != view2) {
                                b();
                                view = this.f3412b;
                            }
                            d(view2);
                            return;
                        }
                    } else {
                        if (this.f3414d != view2) {
                            b();
                            view = this.f3413c;
                        }
                        d(view2);
                        return;
                    }
                    a(view);
                    return;
                }
                b();
            }
        }

        public final void d(View view) {
            h4.a aVar = this.e;
            if ((aVar != null) && view == this.f3414d) {
                Rect rect = new Rect();
                view.getDrawingRect(rect);
                aVar.setBounds(rect);
                aVar.f(view, (FrameLayout) null);
            }
        }

        public final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f3418i;
            boolean z8 = false;
            if (drawable != null && drawable.isStateful()) {
                z8 = false | this.f3418i.setState(drawableState);
            }
            if (z8) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public final void e() {
            Drawable drawable;
            f fVar = this.f3411a;
            Drawable drawable2 = null;
            View view = fVar != null ? fVar.e : null;
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.f3415f = view;
                TextView textView = this.f3412b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f3413c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f3413c.setImageDrawable((Drawable) null);
                }
                TextView textView2 = (TextView) view.findViewById(16908308);
                this.f3416g = textView2;
                if (textView2 != null) {
                    this.f3419j = j.b(textView2);
                }
                this.f3417h = (ImageView) view.findViewById(16908294);
            } else {
                View view2 = this.f3415f;
                if (view2 != null) {
                    removeView(view2);
                    this.f3415f = null;
                }
                this.f3416g = null;
                this.f3417h = null;
            }
            boolean z8 = false;
            if (this.f3415f == null) {
                if (this.f3413c == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, this, false);
                    this.f3413c = imageView2;
                    addView(imageView2, 0);
                }
                if (!(fVar == null || (drawable = fVar.f3399a) == null)) {
                    drawable2 = drawable.mutate();
                }
                TabLayout tabLayout = TabLayout.this;
                if (drawable2 != null) {
                    d0.b.h(drawable2, tabLayout.f3379j);
                    PorterDuff.Mode mode = tabLayout.f3383n;
                    if (mode != null) {
                        d0.b.i(drawable2, mode);
                    }
                }
                if (this.f3412b == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, this, false);
                    this.f3412b = textView3;
                    addView(textView3);
                    this.f3419j = j.b(this.f3412b);
                }
                this.f3412b.setTextAppearance(tabLayout.f3377h);
                ColorStateList colorStateList = tabLayout.f3378i;
                if (colorStateList != null) {
                    this.f3412b.setTextColor(colorStateList);
                }
                g(this.f3412b, this.f3413c);
                c();
                ImageView imageView3 = this.f3413c;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new d(this, imageView3));
                }
                TextView textView4 = this.f3412b;
                if (textView4 != null) {
                    textView4.addOnLayoutChangeListener(new d(this, textView4));
                }
            } else {
                TextView textView5 = this.f3416g;
                if (!(textView5 == null && this.f3417h == null)) {
                    g(textView5, this.f3417h);
                }
            }
            if (fVar != null && !TextUtils.isEmpty(fVar.f3401c)) {
                setContentDescription(fVar.f3401c);
            }
            if (fVar != null) {
                TabLayout tabLayout2 = fVar.f3404g;
                if (tabLayout2 != null) {
                    if (tabLayout2.getSelectedTabPosition() == fVar.f3402d) {
                        z8 = true;
                    }
                } else {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
            }
            setSelected(z8);
        }

        /* JADX WARNING: type inference failed for: r4v3, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void f(android.content.Context r9) {
            /*
                r8 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                int r1 = r0.f3386q
                r2 = 0
                if (r1 == 0) goto L_0x001f
                android.graphics.drawable.Drawable r9 = g.a.a(r9, r1)
                r8.f3418i = r9
                if (r9 == 0) goto L_0x0021
                boolean r9 = r9.isStateful()
                if (r9 == 0) goto L_0x0021
                android.graphics.drawable.Drawable r9 = r8.f3418i
                int[] r1 = r8.getDrawableState()
                r9.setState(r1)
                goto L_0x0021
            L_0x001f:
                r8.f3418i = r2
            L_0x0021:
                android.graphics.drawable.GradientDrawable r9 = new android.graphics.drawable.GradientDrawable
                r9.<init>()
                r1 = 0
                r9.setColor(r1)
                android.content.res.ColorStateList r3 = r0.f3380k
                if (r3 == 0) goto L_0x0071
                android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
                r3.<init>()
                r4 = 925353388(0x3727c5ac, float:1.0E-5)
                r3.setCornerRadius(r4)
                r4 = -1
                r3.setColor(r4)
                android.content.res.ColorStateList r4 = r0.f3380k
                r5 = 2
                int[][] r6 = new int[r5][]
                int[] r5 = new int[r5]
                int[] r7 = w4.a.f8013c
                r6[r1] = r7
                int[] r7 = w4.a.f8012b
                int r7 = w4.a.a(r4, r7)
                r5[r1] = r7
                int[] r1 = android.util.StateSet.NOTHING
                r7 = 1
                r6[r7] = r1
                int[] r1 = w4.a.f8011a
                int r1 = w4.a.a(r4, r1)
                r5[r7] = r1
                android.content.res.ColorStateList r1 = new android.content.res.ColorStateList
                r1.<init>(r6, r5)
                android.graphics.drawable.RippleDrawable r4 = new android.graphics.drawable.RippleDrawable
                boolean r5 = r0.D
                if (r5 == 0) goto L_0x0069
                r9 = r2
            L_0x0069:
                if (r5 == 0) goto L_0x006c
                goto L_0x006d
            L_0x006c:
                r2 = r3
            L_0x006d:
                r4.<init>(r1, r9, r2)
                r9 = r4
            L_0x0071:
                int[] r1 = j0.x.f4957a
                j0.x.c.q(r8, r9)
                r0.invalidate()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.h.f(android.content.Context):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
            r0 = r0.f3399a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void g(android.widget.TextView r8, android.widget.ImageView r9) {
            /*
                r7 = this;
                com.google.android.material.tabs.TabLayout$f r0 = r7.f3411a
                r1 = 0
                if (r0 == 0) goto L_0x000e
                android.graphics.drawable.Drawable r0 = r0.f3399a
                if (r0 == 0) goto L_0x000e
                android.graphics.drawable.Drawable r0 = r0.mutate()
                goto L_0x000f
            L_0x000e:
                r0 = r1
            L_0x000f:
                com.google.android.material.tabs.TabLayout$f r2 = r7.f3411a
                if (r2 == 0) goto L_0x0016
                java.lang.CharSequence r2 = r2.f3400b
                goto L_0x0017
            L_0x0016:
                r2 = r1
            L_0x0017:
                r3 = 8
                r4 = 0
                if (r9 == 0) goto L_0x002e
                if (r0 == 0) goto L_0x0028
                r9.setImageDrawable(r0)
                r9.setVisibility(r4)
                r7.setVisibility(r4)
                goto L_0x002e
            L_0x0028:
                r9.setVisibility(r3)
                r9.setImageDrawable(r1)
            L_0x002e:
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                r5 = 1
                r0 = r0 ^ r5
                if (r8 == 0) goto L_0x0052
                if (r0 == 0) goto L_0x004c
                r8.setText(r2)
                com.google.android.material.tabs.TabLayout$f r6 = r7.f3411a
                int r6 = r6.f3403f
                if (r6 != r5) goto L_0x0045
                r8.setVisibility(r4)
                goto L_0x0048
            L_0x0045:
                r8.setVisibility(r3)
            L_0x0048:
                r7.setVisibility(r4)
                goto L_0x0052
            L_0x004c:
                r8.setVisibility(r3)
                r8.setText(r1)
            L_0x0052:
                if (r9 == 0) goto L_0x008e
                android.view.ViewGroup$LayoutParams r8 = r9.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
                if (r0 == 0) goto L_0x006c
                int r5 = r9.getVisibility()
                if (r5 != 0) goto L_0x006c
                android.content.Context r5 = r7.getContext()
                float r3 = u4.n.a(r5, r3)
                int r3 = (int) r3
                goto L_0x006d
            L_0x006c:
                r3 = r4
            L_0x006d:
                com.google.android.material.tabs.TabLayout r5 = com.google.android.material.tabs.TabLayout.this
                boolean r5 = r5.A
                if (r5 == 0) goto L_0x007f
                int r5 = j0.g.b(r8)
                if (r3 == r5) goto L_0x008e
                j0.g.g(r8, r3)
                r8.bottomMargin = r4
                goto L_0x0088
            L_0x007f:
                int r5 = r8.bottomMargin
                if (r3 == r5) goto L_0x008e
                r8.bottomMargin = r3
                j0.g.g(r8, r4)
            L_0x0088:
                r9.setLayoutParams(r8)
                r9.requestLayout()
            L_0x008e:
                com.google.android.material.tabs.TabLayout$f r8 = r7.f3411a
                if (r8 == 0) goto L_0x0094
                java.lang.CharSequence r1 = r8.f3401c
            L_0x0094:
                if (r0 == 0) goto L_0x0097
                goto L_0x0098
            L_0x0097:
                r2 = r1
            L_0x0098:
                r7.setTooltipText(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.h.g(android.widget.TextView, android.widget.ImageView):void");
        }

        public int getContentHeight() {
            View[] viewArr = {this.f3412b, this.f3413c, this.f3415f};
            int i8 = 0;
            int i9 = 0;
            boolean z8 = false;
            for (int i10 = 0; i10 < 3; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0) {
                    i9 = z8 ? Math.min(i9, view.getTop()) : view.getTop();
                    i8 = z8 ? Math.max(i8, view.getBottom()) : view.getBottom();
                    z8 = true;
                }
            }
            return i8 - i9;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f3412b, this.f3413c, this.f3415f};
            int i8 = 0;
            int i9 = 0;
            boolean z8 = false;
            for (int i10 = 0; i10 < 3; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0) {
                    i9 = z8 ? Math.min(i9, view.getLeft()) : view.getLeft();
                    i8 = z8 ? Math.max(i8, view.getRight()) : view.getRight();
                    z8 = true;
                }
            }
            return i8 - i9;
        }

        public f getTab() {
            return this.f3411a;
        }

        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            String str;
            Context context;
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            h4.a aVar = this.e;
            if (aVar != null && aVar.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                StringBuilder sb = new StringBuilder();
                sb.append(contentDescription);
                sb.append(", ");
                h4.a aVar2 = this.e;
                if (aVar2.isVisible()) {
                    boolean e4 = aVar2.e();
                    a.C0062a aVar3 = aVar2.f4757h;
                    if (!e4) {
                        str = aVar3.f4771k;
                    } else if (aVar3.f4772l > 0 && (context = aVar2.f4751a.get()) != null) {
                        int d9 = aVar2.d();
                        int i8 = aVar2.f4760k;
                        if (d9 <= i8) {
                            str = context.getResources().getQuantityString(aVar3.f4772l, aVar2.d(), new Object[]{Integer.valueOf(aVar2.d())});
                        } else {
                            str = context.getString(aVar3.f4773m, new Object[]{Integer.valueOf(i8)});
                        }
                    }
                    sb.append(str);
                    accessibilityNodeInfo.setContentDescription(sb.toString());
                }
                str = null;
                sb.append(str);
                accessibilityNodeInfo.setContentDescription(sb.toString());
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) c.C0072c.a(0, 1, this.f3411a.f3402d, 1, isSelected()).f5100a);
            if (isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) c.a.e.f5095a);
            }
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
        }

        public final void onMeasure(int i8, int i9) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i8);
            int mode = View.MeasureSpec.getMode(i8);
            TabLayout tabLayout = TabLayout.this;
            int tabMaxWidth = tabLayout.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i8 = View.MeasureSpec.makeMeasureSpec(tabLayout.r, Integer.MIN_VALUE);
            }
            super.onMeasure(i8, i9);
            if (this.f3412b != null) {
                float f9 = tabLayout.f3384o;
                int i10 = this.f3419j;
                ImageView imageView = this.f3413c;
                boolean z8 = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f3412b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f9 = tabLayout.f3385p;
                    }
                } else {
                    i10 = 1;
                }
                float textSize = this.f3412b.getTextSize();
                int lineCount = this.f3412b.getLineCount();
                int b9 = j.b(this.f3412b);
                int i11 = (f9 > textSize ? 1 : (f9 == textSize ? 0 : -1));
                if (i11 != 0 || (b9 >= 0 && i10 != b9)) {
                    if (tabLayout.f3392z == 1 && i11 > 0 && lineCount == 1 && ((layout = this.f3412b.getLayout()) == null || layout.getLineWidth(0) * (f9 / layout.getPaint().getTextSize()) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())))) {
                        z8 = false;
                    }
                    if (z8) {
                        this.f3412b.setTextSize(0, f9);
                        this.f3412b.setMaxLines(i10);
                        super.onMeasure(i8, i9);
                    }
                }
            }
        }

        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f3411a == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            f fVar = this.f3411a;
            TabLayout tabLayout = fVar.f3404g;
            if (tabLayout != null) {
                tabLayout.j(fVar, true);
                return true;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public void setSelected(boolean z8) {
            if (isSelected() != z8) {
            }
            super.setSelected(z8);
            TextView textView = this.f3412b;
            if (textView != null) {
                textView.setSelected(z8);
            }
            ImageView imageView = this.f3413c;
            if (imageView != null) {
                imageView.setSelected(z8);
            }
            View view = this.f3415f;
            if (view != null) {
                view.setSelected(z8);
            }
        }

        public void setTab(f fVar) {
            if (fVar != this.f3411a) {
                this.f3411a = fVar;
                e();
            }
        }
    }

    public static class i implements d {

        /* renamed from: a  reason: collision with root package name */
        public final ViewPager f3421a;

        public i(ViewPager viewPager) {
            this.f3421a = viewPager;
        }

        public final void a() {
        }

        public final void b() {
        }

        public final void c(f fVar) {
            this.f3421a.setCurrentItem(fVar.f3402d);
        }
    }

    /* JADX INFO: finally extract failed */
    public TabLayout(Context context, AttributeSet attributeSet) {
        super(d5.a.a(context, attributeSet, R.attr.tabStyle, -2146303368), attributeSet, R.attr.tabStyle);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        e eVar = new e(context2);
        this.f3373c = eVar;
        super.addView(eVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray d9 = k.d(context2, attributeSet, a1.a.f23g0, R.attr.tabStyle, -2146303368, 23);
        if (getBackground() instanceof ColorDrawable) {
            y4.f fVar = new y4.f();
            fVar.j(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
            fVar.h(context2);
            int[] iArr = x.f4957a;
            fVar.i(x.h.i(this));
            x.c.q(this, fVar);
        }
        setSelectedTabIndicator(v4.c.c(context2, d9, 5));
        setSelectedTabIndicatorColor(d9.getColor(8, 0));
        int dimensionPixelSize = d9.getDimensionPixelSize(11, -1);
        Rect bounds = this.f3381l.getBounds();
        this.f3381l.setBounds(bounds.left, 0, bounds.right, dimensionPixelSize);
        eVar.requestLayout();
        setSelectedTabIndicatorGravity(d9.getInt(10, 0));
        setTabIndicatorFullWidth(d9.getBoolean(9, true));
        setTabIndicatorAnimationMode(d9.getInt(7, 0));
        int dimensionPixelSize2 = d9.getDimensionPixelSize(16, 0);
        this.f3376g = dimensionPixelSize2;
        this.f3375f = dimensionPixelSize2;
        this.e = dimensionPixelSize2;
        this.f3374d = dimensionPixelSize2;
        this.f3374d = d9.getDimensionPixelSize(19, dimensionPixelSize2);
        this.e = d9.getDimensionPixelSize(20, dimensionPixelSize2);
        this.f3375f = d9.getDimensionPixelSize(18, dimensionPixelSize2);
        this.f3376g = d9.getDimensionPixelSize(17, dimensionPixelSize2);
        int resourceId = d9.getResourceId(23, -2146303601);
        this.f3377h = resourceId;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, a1.a.F);
        try {
            this.f3384o = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f3378i = v4.c.a(context2, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (d9.hasValue(24)) {
                this.f3378i = v4.c.a(context2, d9, 24);
            }
            if (d9.hasValue(22)) {
                int color = d9.getColor(22, 0);
                int defaultColor = this.f3378i.getDefaultColor();
                this.f3378i = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{color, defaultColor});
            }
            this.f3379j = v4.c.a(context2, d9, 3);
            this.f3383n = n.b(d9.getInt(4, -1), (PorterDuff.Mode) null);
            this.f3380k = v4.c.a(context2, d9, 21);
            this.f3391x = d9.getInt(6, 300);
            this.f3387s = d9.getDimensionPixelSize(14, -1);
            this.f3388t = d9.getDimensionPixelSize(13, -1);
            this.f3386q = d9.getResourceId(0, 0);
            this.f3390v = d9.getDimensionPixelSize(1, 0);
            this.f3392z = d9.getInt(15, 1);
            this.w = d9.getInt(2, 0);
            this.A = d9.getBoolean(12, false);
            this.D = d9.getBoolean(25, false);
            d9.recycle();
            Resources resources = getResources();
            this.f3385p = (float) resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.f3389u = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            d();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private int getDefaultHeight() {
        ArrayList<f> arrayList = this.f3371a;
        int size = arrayList.size();
        boolean z8 = false;
        int i8 = 0;
        while (true) {
            if (i8 < size) {
                f fVar = arrayList.get(i8);
                if (fVar != null && fVar.f3399a != null && !TextUtils.isEmpty(fVar.f3400b)) {
                    z8 = true;
                    break;
                }
                i8++;
            } else {
                break;
            }
        }
        return (!z8 || this.A) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i8 = this.f3387s;
        if (i8 != -1) {
            return i8;
        }
        int i9 = this.f3392z;
        if (i9 == 0 || i9 == 2) {
            return this.f3389u;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f3373c.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i8) {
        e eVar = this.f3373c;
        int childCount = eVar.getChildCount();
        if (i8 < childCount) {
            int i9 = 0;
            while (i9 < childCount) {
                View childAt = eVar.getChildAt(i9);
                boolean z8 = true;
                childAt.setSelected(i9 == i8);
                if (i9 != i8) {
                    z8 = false;
                }
                childAt.setActivated(z8);
                i9++;
            }
        }
    }

    public final void a(f fVar, boolean z8) {
        float f9;
        ArrayList<f> arrayList = this.f3371a;
        int size = arrayList.size();
        if (fVar.f3404g == this) {
            fVar.f3402d = size;
            arrayList.add(size, fVar);
            int size2 = arrayList.size();
            while (true) {
                size++;
                if (size >= size2) {
                    break;
                }
                arrayList.get(size).f3402d = size;
            }
            h hVar = fVar.f3405h;
            hVar.setSelected(false);
            hVar.setActivated(false);
            int i8 = fVar.f3402d;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (this.f3392z == 1 && this.w == 0) {
                layoutParams.width = 0;
                f9 = 1.0f;
            } else {
                layoutParams.width = -2;
                f9 = 0.0f;
            }
            layoutParams.weight = f9;
            this.f3373c.addView(hVar, i8, layoutParams);
            if (z8) {
                TabLayout tabLayout = fVar.f3404g;
                if (tabLayout != null) {
                    tabLayout.j(fVar, true);
                    return;
                }
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public final void addView(View view) {
        b(view);
    }

    public final void addView(View view, int i8) {
        b(view);
    }

    public final void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        b(view);
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b(view);
    }

    public final void b(View view) {
        if (view instanceof b5.b) {
            b5.b bVar = (b5.b) view;
            f h8 = h();
            bVar.getClass();
            if (!TextUtils.isEmpty(bVar.getContentDescription())) {
                h8.f3401c = bVar.getContentDescription();
                h hVar = h8.f3405h;
                if (hVar != null) {
                    hVar.e();
                }
            }
            a(h8, this.f3371a.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void c(int i8) {
        boolean z8;
        if (i8 != -1) {
            if (getWindowToken() != null) {
                int[] iArr = x.f4957a;
                if (x.f.c(this)) {
                    e eVar = this.f3373c;
                    int childCount = eVar.getChildCount();
                    int i9 = 0;
                    while (true) {
                        if (i9 >= childCount) {
                            z8 = false;
                            break;
                        } else if (eVar.getChildAt(i9).getWidth() <= 0) {
                            z8 = true;
                            break;
                        } else {
                            i9++;
                        }
                    }
                    if (!z8) {
                        int scrollX = getScrollX();
                        int e4 = e(i8, 0.0f);
                        if (scrollX != e4) {
                            f();
                            this.I.setIntValues(new int[]{scrollX, e4});
                            this.I.start();
                        }
                        ValueAnimator valueAnimator = eVar.f3395a;
                        if (valueAnimator != null && valueAnimator.isRunning()) {
                            eVar.f3395a.cancel();
                        }
                        eVar.c(i8, true, this.f3391x);
                        return;
                    }
                }
            }
            k(i8, 0.0f, true, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (r0 != 2) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r5 = this;
            int r0 = r5.f3392z
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L_0x000b
            if (r0 != r1) goto L_0x0009
            goto L_0x000b
        L_0x0009:
            r0 = r2
            goto L_0x0014
        L_0x000b:
            int r0 = r5.f3390v
            int r3 = r5.f3374d
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L_0x0014:
            int[] r3 = j0.x.f4957a
            com.google.android.material.tabs.TabLayout$e r3 = r5.f3373c
            j0.x.d.k(r3, r0, r2, r2, r2)
            int r0 = r5.f3392z
            java.lang.String r2 = "TabLayout"
            r4 = 1
            if (r0 == 0) goto L_0x0034
            if (r0 == r4) goto L_0x0027
            if (r0 == r1) goto L_0x0027
            goto L_0x004c
        L_0x0027:
            int r0 = r5.w
            if (r0 != r1) goto L_0x0030
            java.lang.String r0 = "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead"
            android.util.Log.w(r2, r0)
        L_0x0030:
            r3.setGravity(r4)
            goto L_0x004c
        L_0x0034:
            int r0 = r5.w
            if (r0 == 0) goto L_0x0041
            if (r0 == r4) goto L_0x003d
            if (r0 == r1) goto L_0x0046
            goto L_0x004c
        L_0x003d:
            r3.setGravity(r4)
            goto L_0x004c
        L_0x0041:
            java.lang.String r0 = "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead"
            android.util.Log.w(r2, r0)
        L_0x0046:
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r3.setGravity(r0)
        L_0x004c:
            r5.m(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.d():void");
    }

    public final int e(int i8, float f9) {
        int i9 = this.f3392z;
        int i10 = 0;
        if (i9 != 0 && i9 != 2) {
            return 0;
        }
        e eVar = this.f3373c;
        View childAt = eVar.getChildAt(i8);
        int i11 = i8 + 1;
        View childAt2 = i11 < eVar.getChildCount() ? eVar.getChildAt(i11) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        if (childAt2 != null) {
            i10 = childAt2.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i12 = (int) (((float) (width + i10)) * 0.5f * f9);
        int[] iArr = x.f4957a;
        return x.d.d(this) == 0 ? left + i12 : left - i12;
    }

    public final void f() {
        if (this.I == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.I = valueAnimator;
            valueAnimator.setInterpolator(f4.a.f4392b);
            this.I.setDuration((long) this.f3391x);
            this.I.addUpdateListener(new a());
        }
    }

    public final f g(int i8) {
        if (i8 < 0 || i8 >= getTabCount()) {
            return null;
        }
        return this.f3371a.get(i8);
    }

    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        f fVar = this.f3372b;
        if (fVar != null) {
            return fVar.f3402d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f3371a.size();
    }

    public int getTabGravity() {
        return this.w;
    }

    public ColorStateList getTabIconTint() {
        return this.f3379j;
    }

    public int getTabIndicatorAnimationMode() {
        return this.C;
    }

    public int getTabIndicatorGravity() {
        return this.y;
    }

    public int getTabMaxWidth() {
        return this.r;
    }

    public int getTabMode() {
        return this.f3392z;
    }

    public ColorStateList getTabRippleColor() {
        return this.f3380k;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f3381l;
    }

    public ColorStateList getTabTextColors() {
        return this.f3378i;
    }

    public final f h() {
        f fVar = (f) O.b();
        if (fVar == null) {
            fVar = new f();
        }
        fVar.f3404g = this;
        s.e eVar = this.N;
        h hVar = eVar != null ? (h) eVar.b() : null;
        if (hVar == null) {
            hVar = new h(getContext());
        }
        hVar.setTab(fVar);
        hVar.setFocusable(true);
        hVar.setMinimumWidth(getTabMinWidth());
        hVar.setContentDescription(TextUtils.isEmpty(fVar.f3401c) ? fVar.f3400b : fVar.f3401c);
        fVar.f3405h = hVar;
        int i8 = fVar.f3406i;
        if (i8 != -1) {
            hVar.setId(i8);
        }
        return fVar;
    }

    public final void i() {
        e eVar = this.f3373c;
        for (int childCount = eVar.getChildCount() - 1; childCount >= 0; childCount--) {
            h hVar = (h) eVar.getChildAt(childCount);
            eVar.removeViewAt(childCount);
            if (hVar != null) {
                hVar.setTab((f) null);
                hVar.setSelected(false);
                this.N.a(hVar);
            }
            requestLayout();
        }
        Iterator<f> it = this.f3371a.iterator();
        while (it.hasNext()) {
            f next = it.next();
            it.remove();
            next.f3404g = null;
            next.f3405h = null;
            next.f3399a = null;
            next.f3406i = -1;
            next.f3400b = null;
            next.f3401c = null;
            next.f3402d = -1;
            next.e = null;
            O.a(next);
        }
        this.f3372b = null;
    }

    public final void j(f fVar, boolean z8) {
        f fVar2 = this.f3372b;
        ArrayList<c> arrayList = this.G;
        if (fVar2 != fVar) {
            int i8 = fVar != null ? fVar.f3402d : -1;
            if (z8) {
                if ((fVar2 == null || fVar2.f3402d == -1) && i8 != -1) {
                    k(i8, 0.0f, true, true);
                } else {
                    c(i8);
                }
                if (i8 != -1) {
                    setSelectedTabView(i8);
                }
            }
            this.f3372b = fVar;
            if (fVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).b();
                }
            }
            if (fVar != null) {
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    arrayList.get(size2).c(fVar);
                }
            }
        } else if (fVar2 != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                arrayList.get(size3).a();
            }
            c(fVar.f3402d);
        }
    }

    public final void k(int i8, float f9, boolean z8, boolean z9) {
        int round = Math.round(((float) i8) + f9);
        if (round >= 0) {
            e eVar = this.f3373c;
            if (round < eVar.getChildCount()) {
                if (z9) {
                    ValueAnimator valueAnimator = eVar.f3395a;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        eVar.f3395a.cancel();
                    }
                    eVar.f3396b = i8;
                    eVar.f3397c = f9;
                    eVar.b(eVar.getChildAt(i8), eVar.getChildAt(eVar.f3396b + 1), eVar.f3397c);
                }
                ValueAnimator valueAnimator2 = this.I;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.I.cancel();
                }
                scrollTo(e(i8, f9), 0);
                if (z8) {
                    setSelectedTabView(round);
                }
            }
        }
    }

    public final void l(ViewPager viewPager, boolean z8) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ViewPager viewPager2 = this.J;
        if (viewPager2 != null) {
            g gVar = this.K;
            if (!(gVar == null || (arrayList2 = viewPager2.D) == null)) {
                arrayList2.remove(gVar);
            }
            b bVar = this.L;
            if (!(bVar == null || (arrayList = this.J.F) == null)) {
                arrayList.remove(bVar);
            }
        }
        i iVar = this.H;
        ArrayList<c> arrayList3 = this.G;
        if (iVar != null) {
            arrayList3.remove(iVar);
            this.H = null;
        }
        if (viewPager != null) {
            this.J = viewPager;
            if (this.K == null) {
                this.K = new g(this);
            }
            g gVar2 = this.K;
            gVar2.f3409c = 0;
            gVar2.f3408b = 0;
            if (viewPager.D == null) {
                viewPager.D = new ArrayList();
            }
            viewPager.D.add(gVar2);
            i iVar2 = new i(viewPager);
            this.H = iVar2;
            if (!arrayList3.contains(iVar2)) {
                arrayList3.add(iVar2);
            }
            viewPager.getAdapter();
            if (this.L == null) {
                this.L = new b();
            }
            b bVar2 = this.L;
            bVar2.getClass();
            if (viewPager.F == null) {
                viewPager.F = new ArrayList();
            }
            viewPager.F.add(bVar2);
            k(viewPager.getCurrentItem(), 0.0f, true, true);
        } else {
            this.J = null;
            i();
        }
        this.M = z8;
    }

    public final void m(boolean z8) {
        float f9;
        int i8 = 0;
        while (true) {
            e eVar = this.f3373c;
            if (i8 < eVar.getChildCount()) {
                View childAt = eVar.getChildAt(i8);
                childAt.setMinimumWidth(getTabMinWidth());
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (this.f3392z == 1 && this.w == 0) {
                    layoutParams.width = 0;
                    f9 = 1.0f;
                } else {
                    layoutParams.width = -2;
                    f9 = 0.0f;
                }
                layoutParams.weight = f9;
                if (z8) {
                    childAt.requestLayout();
                }
                i8++;
            } else {
                return;
            }
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof y4.f) {
            k3.j.b0(this, (y4.f) background);
        }
        if (this.J == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                l((ViewPager) parent, true);
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.M) {
            setupWithViewPager((ViewPager) null);
            this.M = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        r1 = (com.google.android.material.tabs.TabLayout.h) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            r0 = 0
        L_0x0001:
            com.google.android.material.tabs.TabLayout$e r1 = r7.f3373c
            int r2 = r1.getChildCount()
            if (r0 >= r2) goto L_0x0032
            android.view.View r1 = r1.getChildAt(r0)
            boolean r2 = r1 instanceof com.google.android.material.tabs.TabLayout.h
            if (r2 == 0) goto L_0x002f
            com.google.android.material.tabs.TabLayout$h r1 = (com.google.android.material.tabs.TabLayout.h) r1
            android.graphics.drawable.Drawable r2 = r1.f3418i
            if (r2 == 0) goto L_0x002f
            int r3 = r1.getLeft()
            int r4 = r1.getTop()
            int r5 = r1.getRight()
            int r6 = r1.getBottom()
            r2.setBounds(r3, r4, r5, r6)
            android.graphics.drawable.Drawable r1 = r1.f3418i
            r1.draw(r8)
        L_0x002f:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0032:
            super.onDraw(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onDraw(android.graphics.Canvas):void");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) c.b.a(1, getTabCount(), 1).f5099a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        if (r0 != 2) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = u4.n.a(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L_0x002e
            if (r1 == 0) goto L_0x001f
            goto L_0x0041
        L_0x001f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L_0x0041
        L_0x002e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L_0x0041
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L_0x0041
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L_0x0041:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L_0x005f
            int r1 = r6.f3388t
            if (r1 <= 0) goto L_0x0050
            goto L_0x005d
        L_0x0050:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = u4.n.a(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L_0x005d:
            r6.r = r1
        L_0x005f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto L_0x00ad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.f3392z
            if (r0 == 0) goto L_0x0082
            if (r0 == r5) goto L_0x0076
            r1 = 2
            if (r0 == r1) goto L_0x0082
            goto L_0x008d
        L_0x0076:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L_0x008d
        L_0x0080:
            r4 = r5
            goto L_0x008d
        L_0x0082:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L_0x008d
            goto L_0x0080
        L_0x008d:
            if (r4 == 0) goto L_0x00ad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r0, r1)
            int r6 = r6.getMeasuredWidth()
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r3)
            r7.measure(r6, r8)
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    public void setElevation(float f9) {
        super.setElevation(f9);
        Drawable background = getBackground();
        if (background instanceof y4.f) {
            ((y4.f) background).i(f9);
        }
    }

    public void setInlineLabel(boolean z8) {
        ImageView imageView;
        if (this.A != z8) {
            this.A = z8;
            int i8 = 0;
            while (true) {
                e eVar = this.f3373c;
                if (i8 < eVar.getChildCount()) {
                    View childAt = eVar.getChildAt(i8);
                    if (childAt instanceof h) {
                        h hVar = (h) childAt;
                        hVar.setOrientation(TabLayout.this.A ^ true ? 1 : 0);
                        TextView textView = hVar.f3416g;
                        if (textView == null && hVar.f3417h == null) {
                            textView = hVar.f3412b;
                            imageView = hVar.f3413c;
                        } else {
                            imageView = hVar.f3417h;
                        }
                        hVar.g(textView, imageView);
                    }
                    i8++;
                } else {
                    d();
                    return;
                }
            }
        }
    }

    public void setInlineLabelResource(int i8) {
        setInlineLabel(getResources().getBoolean(i8));
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.F;
        ArrayList<c> arrayList = this.G;
        if (cVar2 != null) {
            arrayList.remove(cVar2);
        }
        this.F = cVar;
        if (cVar != null && !arrayList.contains(cVar)) {
            arrayList.add(cVar);
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        f();
        this.I.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(int i8) {
        setSelectedTabIndicator(i8 != 0 ? g.a.a(getContext(), i8) : null);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.f3381l != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.f3381l = drawable;
        }
    }

    public void setSelectedTabIndicatorColor(int i8) {
        this.f3382m = i8;
    }

    public void setSelectedTabIndicatorGravity(int i8) {
        if (this.y != i8) {
            this.y = i8;
            int[] iArr = x.f4957a;
            x.c.k(this.f3373c);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i8) {
        e eVar = this.f3373c;
        TabLayout tabLayout = TabLayout.this;
        Rect bounds = tabLayout.f3381l.getBounds();
        tabLayout.f3381l.setBounds(bounds.left, 0, bounds.right, i8);
        eVar.requestLayout();
    }

    public void setTabGravity(int i8) {
        if (this.w != i8) {
            this.w = i8;
            d();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f3379j != colorStateList) {
            this.f3379j = colorStateList;
            ArrayList<f> arrayList = this.f3371a;
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                h hVar = arrayList.get(i8).f3405h;
                if (hVar != null) {
                    hVar.e();
                }
            }
        }
    }

    public void setTabIconTintResource(int i8) {
        Context context = getContext();
        Object obj = g.a.f4440a;
        setTabIconTint(context.getColorStateList(i8));
    }

    public void setTabIndicatorAnimationMode(int i8) {
        a aVar;
        this.C = i8;
        if (i8 == 0) {
            aVar = new a();
        } else if (i8 == 1) {
            aVar = new b5.a();
        } else {
            throw new IllegalArgumentException(i8 + " is not a valid TabIndicatorAnimationMode");
        }
        this.E = aVar;
    }

    public void setTabIndicatorFullWidth(boolean z8) {
        this.B = z8;
        int[] iArr = x.f4957a;
        x.c.k(this.f3373c);
    }

    public void setTabMode(int i8) {
        if (i8 != this.f3392z) {
            this.f3392z = i8;
            d();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f3380k != colorStateList) {
            this.f3380k = colorStateList;
            int i8 = 0;
            while (true) {
                e eVar = this.f3373c;
                if (i8 < eVar.getChildCount()) {
                    View childAt = eVar.getChildAt(i8);
                    if (childAt instanceof h) {
                        Context context = getContext();
                        int i9 = h.f3410l;
                        ((h) childAt).f(context);
                    }
                    i8++;
                } else {
                    return;
                }
            }
        }
    }

    public void setTabRippleColorResource(int i8) {
        Context context = getContext();
        Object obj = g.a.f4440a;
        setTabRippleColor(context.getColorStateList(i8));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f3378i != colorStateList) {
            this.f3378i = colorStateList;
            ArrayList<f> arrayList = this.f3371a;
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                h hVar = arrayList.get(i8).f3405h;
                if (hVar != null) {
                    hVar.e();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(h1.a aVar) {
        i();
    }

    public void setUnboundedRipple(boolean z8) {
        if (this.D != z8) {
            this.D = z8;
            int i8 = 0;
            while (true) {
                e eVar = this.f3373c;
                if (i8 < eVar.getChildCount()) {
                    View childAt = eVar.getChildAt(i8);
                    if (childAt instanceof h) {
                        Context context = getContext();
                        int i9 = h.f3410l;
                        ((h) childAt).f(context);
                    }
                    i8++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i8) {
        setUnboundedRipple(getResources().getBoolean(i8));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        l(viewPager, false);
    }

    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }
}
