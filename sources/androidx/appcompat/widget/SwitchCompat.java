package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.health.services.client.R;
import d0.b;
import j0.v;
import j0.x;

public class SwitchCompat extends CompoundButton {
    public static final Property<SwitchCompat, Float> M = new a();
    public static final int[] N = {16842912};
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public final TextPaint F;
    public ColorStateList G;
    public StaticLayout H;
    public StaticLayout I;
    public TransformationMethod J;
    public ObjectAnimator K;
    public final Rect L = new Rect();

    /* renamed from: a  reason: collision with root package name */
    public Drawable f574a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f575b = null;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f576c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f577d = false;
    public boolean e = false;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f578f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f579g = null;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f580h = null;

    /* renamed from: i  reason: collision with root package name */
    public boolean f581i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f582j = false;

    /* renamed from: k  reason: collision with root package name */
    public int f583k;

    /* renamed from: l  reason: collision with root package name */
    public int f584l;

    /* renamed from: m  reason: collision with root package name */
    public int f585m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f586n;

    /* renamed from: o  reason: collision with root package name */
    public CharSequence f587o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f588p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f589q;
    public int r;

    /* renamed from: s  reason: collision with root package name */
    public final int f590s;

    /* renamed from: t  reason: collision with root package name */
    public float f591t;

    /* renamed from: u  reason: collision with root package name */
    public float f592u;

    /* renamed from: v  reason: collision with root package name */
    public final VelocityTracker f593v = VelocityTracker.obtain();
    public final int w;

    /* renamed from: x  reason: collision with root package name */
    public float f594x;
    public int y;

    /* renamed from: z  reason: collision with root package name */
    public int f595z;

    public class a extends Property<SwitchCompat, Float> {
        public a() {
            super(Float.class, "thumbPos");
        }

        public final Object get(Object obj) {
            return Float.valueOf(((SwitchCompat) obj).f594x);
        }

        public final void set(Object obj, Object obj2) {
            ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0112, code lost:
        if (r10 != null) goto L_0x0119;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchCompat(android.content.Context r14, android.util.AttributeSet r15) {
        /*
            r13 = this;
            r0 = -2147220596(0xffffffff8004038c, float:-3.68614E-40)
            r13.<init>(r14, r15, r0)
            r1 = 0
            r13.f575b = r1
            r13.f576c = r1
            r2 = 0
            r13.f577d = r2
            r13.e = r2
            r13.f579g = r1
            r13.f580h = r1
            r13.f581i = r2
            r13.f582j = r2
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r13.f593v = r3
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r13.L = r3
            android.content.Context r3 = r13.getContext()
            androidx.appcompat.widget.k0.a(r13, r3)
            android.text.TextPaint r3 = new android.text.TextPaint
            r4 = 1
            r3.<init>(r4)
            r13.F = r3
            android.content.res.Resources r5 = r13.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            r3.density = r5
            int[] r8 = a1.a.E
            androidx.appcompat.widget.o0 r5 = new androidx.appcompat.widget.o0
            android.content.res.TypedArray r10 = r14.obtainStyledAttributes(r15, r8, r0, r2)
            r5.<init>(r14, r10)
            r12 = 0
            int[] r6 = j0.x.f4957a
            r11 = -2147220596(0xffffffff8004038c, float:-3.68614E-40)
            r6 = r13
            r7 = r14
            r9 = r15
            j0.x.m.c(r6, r7, r8, r9, r10, r11, r12)
            r6 = 2
            android.graphics.drawable.Drawable r7 = r5.e(r6)
            r13.f574a = r7
            if (r7 == 0) goto L_0x0063
            r7.setCallback(r13)
        L_0x0063:
            r7 = 11
            android.graphics.drawable.Drawable r7 = r5.e(r7)
            r13.f578f = r7
            if (r7 == 0) goto L_0x0070
            r7.setCallback(r13)
        L_0x0070:
            java.lang.CharSequence r7 = r5.j(r2)
            r13.f587o = r7
            java.lang.CharSequence r7 = r5.j(r4)
            r13.f588p = r7
            r7 = 3
            boolean r8 = r5.a(r7, r4)
            r13.f589q = r8
            r8 = 8
            int r8 = r5.d(r8, r2)
            r13.f583k = r8
            r8 = 5
            int r8 = r5.d(r8, r2)
            r13.f584l = r8
            r8 = 6
            int r8 = r5.d(r8, r2)
            r13.f585m = r8
            r8 = 4
            boolean r8 = r5.a(r8, r2)
            r13.f586n = r8
            r8 = 9
            android.content.res.ColorStateList r8 = r5.b(r8)
            if (r8 == 0) goto L_0x00ac
            r13.f575b = r8
            r13.f577d = r4
        L_0x00ac:
            r8 = 10
            r9 = -1
            int r8 = r5.g(r8, r9)
            android.graphics.PorterDuff$Mode r8 = androidx.appcompat.widget.w.c(r8, r1)
            android.graphics.PorterDuff$Mode r10 = r13.f576c
            if (r10 == r8) goto L_0x00bf
            r13.f576c = r8
            r13.e = r4
        L_0x00bf:
            boolean r8 = r13.f577d
            if (r8 != 0) goto L_0x00c7
            boolean r8 = r13.e
            if (r8 == 0) goto L_0x00ca
        L_0x00c7:
            r13.a()
        L_0x00ca:
            r8 = 12
            android.content.res.ColorStateList r8 = r5.b(r8)
            if (r8 == 0) goto L_0x00d6
            r13.f579g = r8
            r13.f581i = r4
        L_0x00d6:
            r8 = 13
            int r8 = r5.g(r8, r9)
            android.graphics.PorterDuff$Mode r8 = androidx.appcompat.widget.w.c(r8, r1)
            android.graphics.PorterDuff$Mode r10 = r13.f580h
            if (r10 == r8) goto L_0x00e8
            r13.f580h = r8
            r13.f582j = r4
        L_0x00e8:
            boolean r8 = r13.f581i
            if (r8 != 0) goto L_0x00f0
            boolean r8 = r13.f582j
            if (r8 == 0) goto L_0x00f3
        L_0x00f0:
            r13.b()
        L_0x00f3:
            r8 = 7
            int r8 = r5.h(r8, r2)
            if (r8 == 0) goto L_0x019c
            int[] r10 = a1.a.F
            android.content.res.TypedArray r8 = r14.obtainStyledAttributes(r8, r10)
            boolean r10 = r8.hasValue(r7)
            if (r10 == 0) goto L_0x0115
            int r10 = r8.getResourceId(r7, r2)
            if (r10 == 0) goto L_0x0115
            java.lang.Object r11 = g.a.f4440a
            android.content.res.ColorStateList r10 = r14.getColorStateList(r10)
            if (r10 == 0) goto L_0x0115
            goto L_0x0119
        L_0x0115:
            android.content.res.ColorStateList r10 = r8.getColorStateList(r7)
        L_0x0119:
            if (r10 == 0) goto L_0x011c
            goto L_0x0120
        L_0x011c:
            android.content.res.ColorStateList r10 = r13.getTextColors()
        L_0x0120:
            r13.G = r10
            int r10 = r8.getDimensionPixelSize(r2, r2)
            if (r10 == 0) goto L_0x0137
            float r10 = (float) r10
            float r11 = r3.getTextSize()
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x0137
            r3.setTextSize(r10)
            r13.requestLayout()
        L_0x0137:
            int r10 = r8.getInt(r4, r9)
            int r9 = r8.getInt(r6, r9)
            if (r10 == r4) goto L_0x014d
            if (r10 == r6) goto L_0x014a
            if (r10 == r7) goto L_0x0147
            r7 = r1
            goto L_0x014f
        L_0x0147:
            android.graphics.Typeface r7 = android.graphics.Typeface.MONOSPACE
            goto L_0x014f
        L_0x014a:
            android.graphics.Typeface r7 = android.graphics.Typeface.SERIF
            goto L_0x014f
        L_0x014d:
            android.graphics.Typeface r7 = android.graphics.Typeface.SANS_SERIF
        L_0x014f:
            r10 = 0
            if (r9 <= 0) goto L_0x017d
            if (r7 != 0) goto L_0x0159
            android.graphics.Typeface r7 = android.graphics.Typeface.defaultFromStyle(r9)
            goto L_0x015d
        L_0x0159:
            android.graphics.Typeface r7 = android.graphics.Typeface.create(r7, r9)
        L_0x015d:
            r13.setSwitchTypeface(r7)
            if (r7 == 0) goto L_0x0167
            int r7 = r7.getStyle()
            goto L_0x0168
        L_0x0167:
            r7 = r2
        L_0x0168:
            int r7 = ~r7
            r7 = r7 & r9
            r9 = r7 & 1
            if (r9 == 0) goto L_0x016f
            goto L_0x0170
        L_0x016f:
            r4 = r2
        L_0x0170:
            r3.setFakeBoldText(r4)
            r4 = r7 & 2
            if (r4 == 0) goto L_0x0179
            r10 = -1098907648(0xffffffffbe800000, float:-0.25)
        L_0x0179:
            r3.setTextSkewX(r10)
            goto L_0x0186
        L_0x017d:
            r3.setFakeBoldText(r2)
            r3.setTextSkewX(r10)
            r13.setSwitchTypeface(r7)
        L_0x0186:
            r3 = 17
            boolean r2 = r8.getBoolean(r3, r2)
            if (r2 == 0) goto L_0x0197
            i.a r1 = new i.a
            android.content.Context r2 = r13.getContext()
            r1.<init>(r2)
        L_0x0197:
            r13.J = r1
            r8.recycle()
        L_0x019c:
            androidx.appcompat.widget.q r1 = new androidx.appcompat.widget.q
            r1.<init>(r13)
            r1.d(r15, r0)
            r5.m()
            android.view.ViewConfiguration r14 = android.view.ViewConfiguration.get(r14)
            int r15 = r14.getScaledTouchSlop()
            r13.f590s = r15
            int r14 = r14.getScaledMinimumFlingVelocity()
            r13.w = r14
            r13.refreshDrawableState()
            boolean r14 = r13.isChecked()
            r13.setChecked(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private boolean getTargetCheckedState() {
        return this.f594x > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((s0.a(this) ? 1.0f - this.f594x : this.f594x) * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f578f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.L;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f574a;
        Rect b9 = drawable2 != null ? w.b(drawable2) : w.f833a;
        return ((((this.y - this.A) - rect.left) - rect.right) - b9.left) - b9.right;
    }

    public final void a() {
        Drawable drawable = this.f574a;
        if (drawable == null) {
            return;
        }
        if (this.f577d || this.e) {
            Drawable mutate = drawable.mutate();
            this.f574a = mutate;
            if (this.f577d) {
                b.h(mutate, this.f575b);
            }
            if (this.e) {
                b.i(this.f574a, this.f576c);
            }
            if (this.f574a.isStateful()) {
                this.f574a.setState(getDrawableState());
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f578f;
        if (drawable == null) {
            return;
        }
        if (this.f581i || this.f582j) {
            Drawable mutate = drawable.mutate();
            this.f578f = mutate;
            if (this.f581i) {
                b.h(mutate, this.f579g);
            }
            if (this.f582j) {
                b.i(this.f578f, this.f580h);
            }
            if (this.f578f.isStateful()) {
                this.f578f.setState(getDrawableState());
            }
        }
    }

    public final StaticLayout c(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.J;
        if (transformationMethod != null) {
            charSequence = ((i.a) transformationMethod).getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.F;
        return new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public final void draw(Canvas canvas) {
        int i8;
        int i9;
        int i10 = this.B;
        int i11 = this.C;
        int i12 = this.D;
        int i13 = this.E;
        int thumbOffset = getThumbOffset() + i10;
        Drawable drawable = this.f574a;
        Rect b9 = drawable != null ? w.b(drawable) : w.f833a;
        Drawable drawable2 = this.f578f;
        Rect rect = this.L;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i14 = rect.left;
            thumbOffset += i14;
            if (b9 != null) {
                int i15 = b9.left;
                if (i15 > i14) {
                    i10 += i15 - i14;
                }
                int i16 = b9.top;
                int i17 = rect.top;
                i8 = i16 > i17 ? (i16 - i17) + i11 : i11;
                int i18 = b9.right;
                int i19 = rect.right;
                if (i18 > i19) {
                    i12 -= i18 - i19;
                }
                int i20 = b9.bottom;
                int i21 = rect.bottom;
                if (i20 > i21) {
                    i9 = i13 - (i20 - i21);
                    this.f578f.setBounds(i10, i8, i12, i9);
                }
            } else {
                i8 = i11;
            }
            i9 = i13;
            this.f578f.setBounds(i10, i8, i12, i9);
        }
        Drawable drawable3 = this.f574a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i22 = thumbOffset - rect.left;
            int i23 = thumbOffset + this.A + rect.right;
            this.f574a.setBounds(i22, i11, i23, i13);
            Drawable background = getBackground();
            if (background != null) {
                b.f(background, i22, i11, i23, i13);
            }
        }
        super.draw(canvas);
    }

    public final void drawableHotspotChanged(float f9, float f10) {
        super.drawableHotspotChanged(f9, f10);
        Drawable drawable = this.f574a;
        if (drawable != null) {
            b.e(drawable, f9, f10);
        }
        Drawable drawable2 = this.f578f;
        if (drawable2 != null) {
            b.e(drawable2, f9, f10);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f574a;
        boolean z8 = false;
        if (drawable != null && drawable.isStateful()) {
            z8 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f578f;
        if (drawable2 != null && drawable2.isStateful()) {
            z8 |= drawable2.setState(drawableState);
        }
        if (z8) {
            invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        if (!s0.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.y;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f585m : compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (s0.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.y;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f585m : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f589q;
    }

    public boolean getSplitTrack() {
        return this.f586n;
    }

    public int getSwitchMinWidth() {
        return this.f584l;
    }

    public int getSwitchPadding() {
        return this.f585m;
    }

    public CharSequence getTextOff() {
        return this.f588p;
    }

    public CharSequence getTextOn() {
        return this.f587o;
    }

    public Drawable getThumbDrawable() {
        return this.f574a;
    }

    public int getThumbTextPadding() {
        return this.f583k;
    }

    public ColorStateList getThumbTintList() {
        return this.f575b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f576c;
    }

    public Drawable getTrackDrawable() {
        return this.f578f;
    }

    public ColorStateList getTrackTintList() {
        return this.f579g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f580h;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f574a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f578f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.K;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.K.end();
            this.K = null;
        }
    }

    public final int[] onCreateDrawableState(int i8) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i8 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, N);
        }
        return onCreateDrawableState;
    }

    public final void onDraw(Canvas canvas) {
        int i8;
        super.onDraw(canvas);
        Drawable drawable = this.f578f;
        Rect rect = this.L;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i9 = this.C;
        int i10 = this.E;
        int i11 = i9 + rect.top;
        int i12 = i10 - rect.bottom;
        Drawable drawable2 = this.f574a;
        if (drawable != null) {
            if (!this.f586n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect b9 = w.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b9.left;
                rect.right -= b9.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.H : this.I;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.G;
            TextPaint textPaint = this.F;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i8 = bounds.left + bounds.right;
            } else {
                i8 = getWidth();
            }
            canvas.translate((float) ((i8 / 2) - (staticLayout.getWidth() / 2)), (float) (((i11 + i12) / 2) - (staticLayout.getHeight() / 2)));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
    }

    public final void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        super.onLayout(z8, i8, i9, i10, i11);
        int i18 = 0;
        if (this.f574a != null) {
            Drawable drawable = this.f578f;
            Rect rect = this.L;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b9 = w.b(this.f574a);
            i12 = Math.max(0, b9.left - rect.left);
            i18 = Math.max(0, b9.right - rect.right);
        } else {
            i12 = 0;
        }
        if (s0.a(this)) {
            i14 = getPaddingLeft() + i12;
            i13 = ((this.y + i14) - i12) - i18;
        } else {
            i13 = (getWidth() - getPaddingRight()) - i18;
            i14 = (i13 - this.y) + i12 + i18;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i17 = this.f595z;
            i16 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i17 / 2);
        } else if (gravity != 80) {
            i16 = getPaddingTop();
            i17 = this.f595z;
        } else {
            i15 = getHeight() - getPaddingBottom();
            i16 = i15 - this.f595z;
            this.B = i14;
            this.C = i16;
            this.E = i15;
            this.D = i13;
        }
        i15 = i17 + i16;
        this.B = i14;
        this.C = i16;
        this.E = i15;
        this.D = i13;
    }

    public final void onMeasure(int i8, int i9) {
        int i10;
        int i11;
        if (this.f589q) {
            if (this.H == null) {
                this.H = c(this.f587o);
            }
            if (this.I == null) {
                this.I = c(this.f588p);
            }
        }
        Drawable drawable = this.f574a;
        int i12 = 0;
        Rect rect = this.L;
        if (drawable != null) {
            drawable.getPadding(rect);
            i11 = (this.f574a.getIntrinsicWidth() - rect.left) - rect.right;
            i10 = this.f574a.getIntrinsicHeight();
        } else {
            i11 = 0;
            i10 = 0;
        }
        this.A = Math.max(this.f589q ? Math.max(this.H.getWidth(), this.I.getWidth()) + (this.f583k * 2) : 0, i11);
        Drawable drawable2 = this.f578f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i12 = this.f578f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i13 = rect.left;
        int i14 = rect.right;
        Drawable drawable3 = this.f574a;
        if (drawable3 != null) {
            Rect b9 = w.b(drawable3);
            i13 = Math.max(i13, b9.left);
            i14 = Math.max(i14, b9.right);
        }
        int max = Math.max(this.f584l, (this.A * 2) + i13 + i14);
        int max2 = Math.max(i12, i10);
        this.y = max;
        this.f595z = max2;
        super.onMeasure(i8, i9);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f587o : this.f588p;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r1 != 3) goto L_0x0144;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            android.view.VelocityTracker r0 = r10.f593v
            r0.addMovement(r11)
            int r1 = r11.getActionMasked()
            int r2 = r10.f590s
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x00f5
            r5 = 3
            r6 = 0
            r7 = 2
            if (r1 == r4) goto L_0x008e
            if (r1 == r7) goto L_0x001a
            if (r1 == r5) goto L_0x008e
            goto L_0x0144
        L_0x001a:
            int r0 = r10.r
            if (r0 == r4) goto L_0x005e
            if (r0 == r7) goto L_0x0022
            goto L_0x0144
        L_0x0022:
            float r11 = r11.getX()
            int r0 = r10.getThumbScrollRange()
            float r1 = r10.f591t
            float r1 = r11 - r1
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0035
            float r0 = (float) r0
            float r1 = r1 / r0
            goto L_0x003e
        L_0x0035:
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x003b
            r1 = r2
            goto L_0x003e
        L_0x003b:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = r0
        L_0x003e:
            boolean r0 = androidx.appcompat.widget.s0.a(r10)
            if (r0 == 0) goto L_0x0045
            float r1 = -r1
        L_0x0045:
            float r0 = r10.f594x
            float r1 = r1 + r0
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x004d
            goto L_0x0054
        L_0x004d:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0053
            r6 = r2
            goto L_0x0054
        L_0x0053:
            r6 = r1
        L_0x0054:
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x005d
            r10.f591t = r11
            r10.setThumbPosition(r6)
        L_0x005d:
            return r4
        L_0x005e:
            float r0 = r11.getX()
            float r1 = r11.getY()
            float r3 = r10.f591t
            float r3 = r0 - r3
            float r3 = java.lang.Math.abs(r3)
            float r5 = (float) r2
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x0080
            float r3 = r10.f592u
            float r3 = r1 - r3
            float r3 = java.lang.Math.abs(r3)
            float r2 = (float) r2
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0144
        L_0x0080:
            r10.r = r7
            android.view.ViewParent r11 = r10.getParent()
            r11.requestDisallowInterceptTouchEvent(r4)
            r10.f591t = r0
            r10.f592u = r1
            return r4
        L_0x008e:
            int r1 = r10.r
            if (r1 != r7) goto L_0x00ef
            r10.r = r3
            int r1 = r11.getAction()
            if (r1 != r4) goto L_0x00a2
            boolean r1 = r10.isEnabled()
            if (r1 == 0) goto L_0x00a2
            r1 = r4
            goto L_0x00a3
        L_0x00a2:
            r1 = r3
        L_0x00a3:
            boolean r2 = r10.isChecked()
            if (r1 == 0) goto L_0x00d5
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r1)
            float r0 = r0.getXVelocity()
            float r1 = java.lang.Math.abs(r0)
            int r7 = r10.w
            float r7 = (float) r7
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x00d0
            boolean r1 = androidx.appcompat.widget.s0.a(r10)
            if (r1 == 0) goto L_0x00c8
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ce
            goto L_0x00cc
        L_0x00c8:
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ce
        L_0x00cc:
            r0 = r4
            goto L_0x00d6
        L_0x00ce:
            r0 = r3
            goto L_0x00d6
        L_0x00d0:
            boolean r0 = r10.getTargetCheckedState()
            goto L_0x00d6
        L_0x00d5:
            r0 = r2
        L_0x00d6:
            if (r0 == r2) goto L_0x00db
            r10.playSoundEffect(r3)
        L_0x00db:
            r10.setChecked(r0)
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r11)
            r0.setAction(r5)
            super.onTouchEvent(r0)
            r0.recycle()
            super.onTouchEvent(r11)
            return r4
        L_0x00ef:
            r10.r = r3
            r0.clear()
            goto L_0x0144
        L_0x00f5:
            float r0 = r11.getX()
            float r1 = r11.getY()
            boolean r5 = r10.isEnabled()
            if (r5 == 0) goto L_0x0144
            android.graphics.drawable.Drawable r5 = r10.f574a
            if (r5 != 0) goto L_0x0108
            goto L_0x013c
        L_0x0108:
            int r5 = r10.getThumbOffset()
            android.graphics.drawable.Drawable r6 = r10.f574a
            android.graphics.Rect r7 = r10.L
            r6.getPadding(r7)
            int r6 = r10.C
            int r6 = r6 - r2
            int r8 = r10.B
            int r8 = r8 + r5
            int r8 = r8 - r2
            int r5 = r10.A
            int r5 = r5 + r8
            int r9 = r7.left
            int r5 = r5 + r9
            int r7 = r7.right
            int r5 = r5 + r7
            int r5 = r5 + r2
            int r7 = r10.E
            int r7 = r7 + r2
            float r2 = (float) r8
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x013c
            float r2 = (float) r5
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x013c
            float r2 = (float) r6
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x013c
            float r2 = (float) r7
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x013c
            r3 = r4
        L_0x013c:
            if (r3 == 0) goto L_0x0144
            r10.r = r4
            r10.f591t = r0
            r10.f592u = r1
        L_0x0144:
            boolean r10 = super.onTouchEvent(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setChecked(boolean z8) {
        super.setChecked(z8);
        boolean isChecked = isChecked();
        if (isChecked) {
            Object obj = this.f587o;
            if (obj == null) {
                obj = getResources().getString(R.string.abc_capital_on);
            }
            int[] iArr = x.f4957a;
            new v().e(this, obj);
        } else {
            Object obj2 = this.f588p;
            if (obj2 == null) {
                obj2 = getResources().getString(R.string.abc_capital_off);
            }
            int[] iArr2 = x.f4957a;
            new v().e(this, obj2);
        }
        float f9 = 1.0f;
        if (getWindowToken() == null || !x.f.c(this)) {
            ObjectAnimator objectAnimator = this.K;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            if (!isChecked) {
                f9 = 0.0f;
            }
            setThumbPosition(f9);
            return;
        }
        if (!isChecked) {
            f9 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, M, new float[]{f9});
        this.K = ofFloat;
        ofFloat.setDuration(250);
        this.K.setAutoCancel(true);
        this.K.start();
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setShowText(boolean z8) {
        if (this.f589q != z8) {
            this.f589q = z8;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z8) {
        this.f586n = z8;
        invalidate();
    }

    public void setSwitchMinWidth(int i8) {
        this.f584l = i8;
        requestLayout();
    }

    public void setSwitchPadding(int i8) {
        this.f585m = i8;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.F;
        if ((textPaint.getTypeface() != null && !textPaint.getTypeface().equals(typeface)) || (textPaint.getTypeface() == null && typeface != null)) {
            textPaint.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.f588p = charSequence;
        requestLayout();
        if (!isChecked()) {
            Object obj = this.f588p;
            if (obj == null) {
                obj = getResources().getString(R.string.abc_capital_off);
            }
            int[] iArr = x.f4957a;
            new v().e(this, obj);
        }
    }

    public void setTextOn(CharSequence charSequence) {
        this.f587o = charSequence;
        requestLayout();
        if (isChecked()) {
            Object obj = this.f587o;
            if (obj == null) {
                obj = getResources().getString(R.string.abc_capital_on);
            }
            int[] iArr = x.f4957a;
            new v().e(this, obj);
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f574a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f574a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f9) {
        this.f594x = f9;
        invalidate();
    }

    public void setThumbResource(int i8) {
        setThumbDrawable(g.a.a(getContext(), i8));
    }

    public void setThumbTextPadding(int i8) {
        this.f583k = i8;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f575b = colorStateList;
        this.f577d = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f576c = mode;
        this.e = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f578f;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f578f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i8) {
        setTrackDrawable(g.a.a(getContext(), i8));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f579g = colorStateList;
        this.f581i = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f580h = mode;
        this.f582j = true;
        b();
    }

    public final void toggle() {
        setChecked(!isChecked());
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f574a || drawable == this.f578f;
    }
}
