package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import j0.x;
import java.util.ArrayList;

public final class l extends RecyclerView.k implements RecyclerView.p {
    public static final int[] C = {16842919};
    public static final int[] D = new int[0];
    public int A;
    public final Runnable B;

    /* renamed from: a  reason: collision with root package name */
    public final int f1846a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1847b;

    /* renamed from: c  reason: collision with root package name */
    public final StateListDrawable f1848c;

    /* renamed from: d  reason: collision with root package name */
    public final Drawable f1849d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1850f;

    /* renamed from: g  reason: collision with root package name */
    public final StateListDrawable f1851g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f1852h;

    /* renamed from: i  reason: collision with root package name */
    public final int f1853i;

    /* renamed from: j  reason: collision with root package name */
    public final int f1854j;

    /* renamed from: k  reason: collision with root package name */
    public int f1855k;

    /* renamed from: l  reason: collision with root package name */
    public int f1856l;

    /* renamed from: m  reason: collision with root package name */
    public float f1857m;

    /* renamed from: n  reason: collision with root package name */
    public int f1858n;

    /* renamed from: o  reason: collision with root package name */
    public int f1859o;

    /* renamed from: p  reason: collision with root package name */
    public float f1860p;

    /* renamed from: q  reason: collision with root package name */
    public int f1861q = 0;
    public int r = 0;

    /* renamed from: s  reason: collision with root package name */
    public RecyclerView f1862s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1863t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1864u = false;

    /* renamed from: v  reason: collision with root package name */
    public int f1865v = 0;
    public int w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final int[] f1866x = new int[2];
    public final int[] y = new int[2];

    /* renamed from: z  reason: collision with root package name */
    public final ValueAnimator f1867z;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            l lVar = l.this;
            int i8 = lVar.A;
            ValueAnimator valueAnimator = lVar.f1867z;
            if (i8 == 1) {
                valueAnimator.cancel();
            } else if (i8 != 2) {
                return;
            }
            lVar.A = 3;
            valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
            valueAnimator.setDuration((long) 500);
            valueAnimator.start();
        }
    }

    public class b extends RecyclerView.q {
        public b() {
        }

        public final void b(RecyclerView recyclerView, int i8, int i9) {
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            l lVar = l.this;
            int computeVerticalScrollRange = lVar.f1862s.computeVerticalScrollRange();
            int i10 = lVar.r;
            int i11 = computeVerticalScrollRange - i10;
            int i12 = lVar.f1846a;
            lVar.f1863t = i11 > 0 && i10 >= i12;
            int computeHorizontalScrollRange = lVar.f1862s.computeHorizontalScrollRange();
            int i13 = lVar.f1861q;
            boolean z8 = computeHorizontalScrollRange - i13 > 0 && i13 >= i12;
            lVar.f1864u = z8;
            boolean z9 = lVar.f1863t;
            if (z9 || z8) {
                if (z9) {
                    float f9 = (float) i10;
                    lVar.f1856l = (int) ((f9 * (((float) computeVerticalScrollOffset) + (f9 / 2.0f))) / ((float) computeVerticalScrollRange));
                    lVar.f1855k = Math.min(i10, (i10 * i10) / computeVerticalScrollRange);
                }
                if (lVar.f1864u) {
                    float f10 = (float) computeHorizontalScrollOffset;
                    float f11 = (float) i13;
                    lVar.f1859o = (int) ((f11 * (f10 + (f11 / 2.0f))) / ((float) computeHorizontalScrollRange));
                    lVar.f1858n = Math.min(i13, (i13 * i13) / computeHorizontalScrollRange);
                }
                int i14 = lVar.f1865v;
                if (i14 == 0 || i14 == 1) {
                    lVar.i(1);
                }
            } else if (lVar.f1865v != 0) {
                lVar.i(0);
            }
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1870a = false;

        public c() {
        }

        public final void onAnimationCancel(Animator animator) {
            this.f1870a = true;
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f1870a) {
                this.f1870a = false;
                return;
            }
            l lVar = l.this;
            if (((Float) lVar.f1867z.getAnimatedValue()).floatValue() == 0.0f) {
                lVar.A = 0;
                lVar.i(0);
                return;
            }
            lVar.A = 2;
            lVar.f1862s.invalidate();
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            l lVar = l.this;
            lVar.f1848c.setAlpha(floatValue);
            lVar.f1849d.setAlpha(floatValue);
            lVar.f1862s.invalidate();
        }
    }

    public l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i8, int i9, int i10) {
        boolean z8 = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f1867z = ofFloat;
        this.A = 0;
        a aVar = new a();
        this.B = aVar;
        b bVar = new b();
        this.f1848c = stateListDrawable;
        this.f1849d = drawable;
        this.f1851g = stateListDrawable2;
        this.f1852h = drawable2;
        this.e = Math.max(i8, stateListDrawable.getIntrinsicWidth());
        this.f1850f = Math.max(i8, drawable.getIntrinsicWidth());
        this.f1853i = Math.max(i8, stateListDrawable2.getIntrinsicWidth());
        this.f1854j = Math.max(i8, drawable2.getIntrinsicWidth());
        this.f1846a = i9;
        this.f1847b = i10;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.f1862s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                RecyclerView.l lVar = recyclerView2.f1606l;
                if (lVar != null) {
                    lVar.c("Cannot remove item decoration during a scroll  or layout");
                }
                ArrayList<RecyclerView.k> arrayList = recyclerView2.f1612o;
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2 ? true : z8);
                }
                recyclerView2.M();
                recyclerView2.requestLayout();
                RecyclerView recyclerView3 = this.f1862s;
                recyclerView3.f1614p.remove(this);
                if (recyclerView3.f1616q == this) {
                    recyclerView3.f1616q = null;
                }
                ArrayList arrayList2 = this.f1862s.f1599h0;
                if (arrayList2 != null) {
                    arrayList2.remove(bVar);
                }
                this.f1862s.removeCallbacks(aVar);
            }
            this.f1862s = recyclerView;
            if (recyclerView != null) {
                recyclerView.f(this);
                this.f1862s.f1614p.add(this);
                this.f1862s.g(bVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bb, code lost:
        if (r9 >= 0) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0112, code lost:
        if (r5 >= 0) goto L_0x0114;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r0 = r12.f1865v
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r0 = r13.getAction()
            r1 = 1
            r2 = 2
            if (r0 != 0) goto L_0x0047
            float r0 = r13.getX()
            float r3 = r13.getY()
            boolean r0 = r12.g(r0, r3)
            float r3 = r13.getX()
            float r4 = r13.getY()
            boolean r3 = r12.f(r3, r4)
            if (r0 != 0) goto L_0x0029
            if (r3 == 0) goto L_0x011d
        L_0x0029:
            if (r3 == 0) goto L_0x0036
            r12.w = r1
            float r13 = r13.getX()
            int r13 = (int) r13
            float r13 = (float) r13
            r12.f1860p = r13
            goto L_0x0042
        L_0x0036:
            if (r0 == 0) goto L_0x0042
            r12.w = r2
            float r13 = r13.getY()
            int r13 = (int) r13
            float r13 = (float) r13
            r12.f1857m = r13
        L_0x0042:
            r12.i(r2)
            goto L_0x011d
        L_0x0047:
            int r0 = r13.getAction()
            r3 = 0
            if (r0 != r1) goto L_0x005e
            int r0 = r12.f1865v
            if (r0 != r2) goto L_0x005e
            r13 = 0
            r12.f1857m = r13
            r12.f1860p = r13
            r12.i(r1)
            r12.w = r3
            goto L_0x011d
        L_0x005e:
            int r0 = r13.getAction()
            if (r0 != r2) goto L_0x011d
            int r0 = r12.f1865v
            if (r0 != r2) goto L_0x011d
            r12.j()
            int r0 = r12.w
            r4 = 1073741824(0x40000000, float:2.0)
            int r5 = r12.f1847b
            if (r0 != r1) goto L_0x00c6
            float r0 = r13.getX()
            int[] r6 = r12.y
            r6[r3] = r5
            int r7 = r12.f1861q
            int r7 = r7 - r5
            r6[r1] = r7
            float r8 = (float) r5
            float r7 = (float) r7
            float r0 = java.lang.Math.min(r7, r0)
            float r0 = java.lang.Math.max(r8, r0)
            int r7 = r12.f1859o
            float r7 = (float) r7
            float r7 = r7 - r0
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x0097
            goto L_0x00c6
        L_0x0097:
            float r7 = r12.f1860p
            androidx.recyclerview.widget.RecyclerView r8 = r12.f1862s
            int r8 = r8.computeHorizontalScrollRange()
            androidx.recyclerview.widget.RecyclerView r9 = r12.f1862s
            int r9 = r9.computeHorizontalScrollOffset()
            int r10 = r12.f1861q
            r11 = r6[r1]
            r6 = r6[r3]
            int r11 = r11 - r6
            if (r11 != 0) goto L_0x00b0
        L_0x00ae:
            r6 = r3
            goto L_0x00bd
        L_0x00b0:
            float r6 = r0 - r7
            float r7 = (float) r11
            float r6 = r6 / r7
            int r8 = r8 - r10
            float r7 = (float) r8
            float r6 = r6 * r7
            int r6 = (int) r6
            int r9 = r9 + r6
            if (r9 >= r8) goto L_0x00ae
            if (r9 < 0) goto L_0x00ae
        L_0x00bd:
            if (r6 == 0) goto L_0x00c4
            androidx.recyclerview.widget.RecyclerView r7 = r12.f1862s
            r7.scrollBy(r6, r3)
        L_0x00c4:
            r12.f1860p = r0
        L_0x00c6:
            int r0 = r12.w
            if (r0 != r2) goto L_0x011d
            float r13 = r13.getY()
            int[] r0 = r12.f1866x
            r0[r3] = r5
            int r2 = r12.r
            int r2 = r2 - r5
            r0[r1] = r2
            float r5 = (float) r5
            float r2 = (float) r2
            float r13 = java.lang.Math.min(r2, r13)
            float r13 = java.lang.Math.max(r5, r13)
            int r2 = r12.f1856l
            float r2 = (float) r2
            float r2 = r2 - r13
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x00ee
            goto L_0x011d
        L_0x00ee:
            float r2 = r12.f1857m
            androidx.recyclerview.widget.RecyclerView r4 = r12.f1862s
            int r4 = r4.computeVerticalScrollRange()
            androidx.recyclerview.widget.RecyclerView r5 = r12.f1862s
            int r5 = r5.computeVerticalScrollOffset()
            int r6 = r12.r
            r1 = r0[r1]
            r0 = r0[r3]
            int r1 = r1 - r0
            if (r1 != 0) goto L_0x0107
        L_0x0105:
            r0 = r3
            goto L_0x0114
        L_0x0107:
            float r0 = r13 - r2
            float r1 = (float) r1
            float r0 = r0 / r1
            int r4 = r4 - r6
            float r1 = (float) r4
            float r0 = r0 * r1
            int r0 = (int) r0
            int r5 = r5 + r0
            if (r5 >= r4) goto L_0x0105
            if (r5 < 0) goto L_0x0105
        L_0x0114:
            if (r0 == 0) goto L_0x011b
            androidx.recyclerview.widget.RecyclerView r1 = r12.f1862s
            r1.scrollBy(r3, r0)
        L_0x011b:
            r12.f1857m = r13
        L_0x011d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.l.a(android.view.MotionEvent):void");
    }

    public final boolean b(MotionEvent motionEvent) {
        int i8 = this.f1865v;
        if (i8 == 1) {
            boolean g9 = g(motionEvent.getX(), motionEvent.getY());
            boolean f9 = f(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (g9 || f9)) {
                if (f9) {
                    this.w = 1;
                    this.f1860p = (float) ((int) motionEvent.getX());
                } else if (g9) {
                    this.w = 2;
                    this.f1857m = (float) ((int) motionEvent.getY());
                }
                i(2);
                return true;
            }
        } else if (i8 == 2) {
            return true;
        }
        return false;
    }

    public final void c() {
    }

    public final void e(Canvas canvas) {
        int i8;
        if (this.f1861q != this.f1862s.getWidth() || this.r != this.f1862s.getHeight()) {
            this.f1861q = this.f1862s.getWidth();
            this.r = this.f1862s.getHeight();
            i(0);
        } else if (this.A != 0) {
            if (this.f1863t) {
                int i9 = this.f1861q;
                int i10 = this.e;
                int i11 = i9 - i10;
                int i12 = this.f1856l;
                int i13 = this.f1855k;
                int i14 = i12 - (i13 / 2);
                StateListDrawable stateListDrawable = this.f1848c;
                stateListDrawable.setBounds(0, 0, i10, i13);
                int i15 = this.r;
                int i16 = this.f1850f;
                Drawable drawable = this.f1849d;
                drawable.setBounds(0, 0, i16, i15);
                RecyclerView recyclerView = this.f1862s;
                int[] iArr = x.f4957a;
                boolean z8 = true;
                if (x.d.d(recyclerView) != 1) {
                    z8 = false;
                }
                if (z8) {
                    drawable.draw(canvas);
                    canvas.translate((float) i10, (float) i14);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    i8 = -i10;
                } else {
                    canvas.translate((float) i11, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, (float) i14);
                    stateListDrawable.draw(canvas);
                    i8 = -i11;
                }
                canvas.translate((float) i8, (float) (-i14));
            }
            if (this.f1864u) {
                int i17 = this.r;
                int i18 = this.f1853i;
                int i19 = i17 - i18;
                int i20 = this.f1859o;
                int i21 = this.f1858n;
                int i22 = i20 - (i21 / 2);
                StateListDrawable stateListDrawable2 = this.f1851g;
                stateListDrawable2.setBounds(0, 0, i21, i18);
                int i23 = this.f1861q;
                int i24 = this.f1854j;
                Drawable drawable2 = this.f1852h;
                drawable2.setBounds(0, 0, i23, i24);
                canvas.translate(0.0f, (float) i19);
                drawable2.draw(canvas);
                canvas.translate((float) i22, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate((float) (-i22), (float) (-i19));
            }
        }
    }

    public final boolean f(float f9, float f10) {
        if (f10 >= ((float) (this.r - this.f1853i))) {
            int i8 = this.f1859o;
            int i9 = this.f1858n;
            return f9 >= ((float) (i8 - (i9 / 2))) && f9 <= ((float) (i8 + (i9 / 2)));
        }
    }

    public final boolean g(float f9, float f10) {
        RecyclerView recyclerView = this.f1862s;
        int[] iArr = x.f4957a;
        boolean z8 = x.d.d(recyclerView) == 1;
        int i8 = this.e;
        if (z8) {
            if (f9 > ((float) i8)) {
                return false;
            }
        } else if (f9 < ((float) (this.f1861q - i8))) {
            return false;
        }
        int i9 = this.f1856l;
        int i10 = this.f1855k / 2;
        return f10 >= ((float) (i9 - i10)) && f10 <= ((float) (i9 + i10));
    }

    public final void h(int i8) {
        RecyclerView recyclerView = this.f1862s;
        Runnable runnable = this.B;
        recyclerView.removeCallbacks(runnable);
        this.f1862s.postDelayed(runnable, (long) i8);
    }

    public final void i(int i8) {
        int i9;
        StateListDrawable stateListDrawable = this.f1848c;
        if (i8 == 2 && this.f1865v != 2) {
            stateListDrawable.setState(C);
            this.f1862s.removeCallbacks(this.B);
        }
        if (i8 == 0) {
            this.f1862s.invalidate();
        } else {
            j();
        }
        if (this.f1865v != 2 || i8 == 2) {
            if (i8 == 1) {
                i9 = 1500;
            }
            this.f1865v = i8;
        }
        stateListDrawable.setState(D);
        i9 = 1200;
        h(i9);
        this.f1865v = i8;
    }

    public final void j() {
        int i8 = this.A;
        ValueAnimator valueAnimator = this.f1867z;
        if (i8 != 0) {
            if (i8 == 3) {
                valueAnimator.cancel();
            } else {
                return;
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        valueAnimator.setDuration(500);
        valueAnimator.setStartDelay(0);
        valueAnimator.start();
    }
}
