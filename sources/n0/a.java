package n0;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import j0.x;

public abstract class a implements View.OnTouchListener {

    /* renamed from: q  reason: collision with root package name */
    public static final int f5469q = ViewConfiguration.getTapTimeout();

    /* renamed from: a  reason: collision with root package name */
    public final C0083a f5470a;

    /* renamed from: b  reason: collision with root package name */
    public final AccelerateInterpolator f5471b = new AccelerateInterpolator();

    /* renamed from: c  reason: collision with root package name */
    public final View f5472c;

    /* renamed from: d  reason: collision with root package name */
    public Runnable f5473d;
    public final float[] e;

    /* renamed from: f  reason: collision with root package name */
    public final float[] f5474f;

    /* renamed from: g  reason: collision with root package name */
    public int f5475g;

    /* renamed from: h  reason: collision with root package name */
    public int f5476h;

    /* renamed from: i  reason: collision with root package name */
    public final float[] f5477i;

    /* renamed from: j  reason: collision with root package name */
    public final float[] f5478j;

    /* renamed from: k  reason: collision with root package name */
    public final float[] f5479k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5480l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f5481m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f5482n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f5483o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5484p;

    /* renamed from: n0.a$a  reason: collision with other inner class name */
    public static class C0083a {

        /* renamed from: a  reason: collision with root package name */
        public int f5485a;

        /* renamed from: b  reason: collision with root package name */
        public int f5486b;

        /* renamed from: c  reason: collision with root package name */
        public float f5487c;

        /* renamed from: d  reason: collision with root package name */
        public float f5488d;
        public long e = Long.MIN_VALUE;

        /* renamed from: f  reason: collision with root package name */
        public long f5489f = 0;

        /* renamed from: g  reason: collision with root package name */
        public long f5490g = -1;

        /* renamed from: h  reason: collision with root package name */
        public float f5491h;

        /* renamed from: i  reason: collision with root package name */
        public int f5492i;

        public final float a(long j8) {
            long j9 = this.e;
            if (j8 < j9) {
                return 0.0f;
            }
            long j10 = this.f5490g;
            if (j10 < 0 || j8 < j10) {
                return a.b(((float) (j8 - j9)) / ((float) this.f5485a), 0.0f, 1.0f) * 0.5f;
            }
            float f9 = this.f5491h;
            return (1.0f - f9) + (f9 * a.b(((float) (j8 - j10)) / ((float) this.f5492i), 0.0f, 1.0f));
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            a aVar = a.this;
            if (aVar.f5483o) {
                boolean z8 = aVar.f5481m;
                C0083a aVar2 = aVar.f5470a;
                if (z8) {
                    aVar.f5481m = false;
                    aVar2.getClass();
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    aVar2.e = currentAnimationTimeMillis;
                    aVar2.f5490g = -1;
                    aVar2.f5489f = currentAnimationTimeMillis;
                    aVar2.f5491h = 0.5f;
                }
                if ((aVar2.f5490g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar2.f5490g + ((long) aVar2.f5492i)) || !aVar.e()) {
                    aVar.f5483o = false;
                    return;
                }
                boolean z9 = aVar.f5482n;
                View view = aVar.f5472c;
                if (z9) {
                    aVar.f5482n = false;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (aVar2.f5489f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a9 = aVar2.a(currentAnimationTimeMillis2);
                    aVar2.f5489f = currentAnimationTimeMillis2;
                    g.b(((f) aVar).r, (int) (((float) (currentAnimationTimeMillis2 - aVar2.f5489f)) * ((-4.0f * a9 * a9) + (a9 * 4.0f)) * aVar2.f5488d));
                    int[] iArr = x.f4957a;
                    x.c.m(view, this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
        }
    }

    public a(View view) {
        C0083a aVar = new C0083a();
        this.f5470a = aVar;
        float[] fArr = {0.0f, 0.0f};
        this.e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f5474f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f5477i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f5478j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f5479k = fArr5;
        this.f5472c = view;
        float f9 = Resources.getSystem().getDisplayMetrics().density;
        float f10 = ((float) ((int) ((1575.0f * f9) + 0.5f))) / 1000.0f;
        fArr5[0] = f10;
        fArr5[1] = f10;
        float f11 = ((float) ((int) ((f9 * 315.0f) + 0.5f))) / 1000.0f;
        fArr4[0] = f11;
        fArr4[1] = f11;
        this.f5475g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f5476h = f5469q;
        aVar.f5485a = 500;
        aVar.f5486b = 500;
    }

    public static float b(float f9, float f10, float f11) {
        return f9 > f11 ? f11 : f9 < f10 ? f10 : f9;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.e
            r0 = r0[r7]
            float[] r1 = r3.f5474f
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f5471b
            if (r5 >= 0) goto L_0x0025
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L_0x002d
        L_0x0025:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x0036
            float r4 = r0.getInterpolation(r4)
        L_0x002d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = b(r4, r5, r0)
            goto L_0x0037
        L_0x0036:
            r4 = r2
        L_0x0037:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x003c
            return r2
        L_0x003c:
            float[] r0 = r3.f5477i
            r0 = r0[r7]
            float[] r1 = r3.f5478j
            r1 = r1[r7]
            float[] r3 = r3.f5479k
            r3 = r3[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L_0x0051
            float r4 = r4 * r0
            float r3 = b(r4, r1, r3)
            return r3
        L_0x0051:
            float r4 = -r4
            float r4 = r4 * r0
            float r3 = b(r4, r1, r3)
            float r3 = -r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.a.a(float, float, float, int):float");
    }

    public final float c(float f9, float f10) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        int i8 = this.f5475g;
        if (i8 == 0 || i8 == 1) {
            if (f9 < f10) {
                return f9 >= 0.0f ? 1.0f - (f9 / f10) : (!this.f5483o || i8 != 1) ? 0.0f : 1.0f;
            }
        } else if (i8 == 2 && f9 < 0.0f) {
            return f9 / (-f10);
        }
    }

    public final void d() {
        int i8 = 0;
        if (this.f5481m) {
            this.f5483o = false;
            return;
        }
        C0083a aVar = this.f5470a;
        aVar.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i9 = (int) (currentAnimationTimeMillis - aVar.e);
        int i10 = aVar.f5486b;
        if (i9 > i10) {
            i8 = i10;
        } else if (i9 >= 0) {
            i8 = i9;
        }
        aVar.f5492i = i8;
        aVar.f5491h = aVar.a(currentAnimationTimeMillis);
        aVar.f5490g = currentAnimationTimeMillis;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e() {
        /*
            r8 = this;
            n0.a$a r0 = r8.f5470a
            float r1 = r0.f5488d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f5487c
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 0
            if (r1 == 0) goto L_0x0054
            n0.f r8 = (n0.f) r8
            android.widget.ListView r8 = r8.r
            int r3 = r8.getCount()
            r4 = 1
            if (r3 != 0) goto L_0x0022
        L_0x0020:
            r8 = r2
            goto L_0x0050
        L_0x0022:
            int r5 = r8.getChildCount()
            int r6 = r8.getFirstVisiblePosition()
            int r7 = r6 + r5
            if (r1 <= 0) goto L_0x0040
            if (r7 < r3) goto L_0x004f
            int r5 = r5 - r4
            android.view.View r1 = r8.getChildAt(r5)
            int r1 = r1.getBottom()
            int r8 = r8.getHeight()
            if (r1 > r8) goto L_0x004f
            goto L_0x0020
        L_0x0040:
            if (r1 >= 0) goto L_0x0020
            if (r6 > 0) goto L_0x004f
            android.view.View r8 = r8.getChildAt(r2)
            int r8 = r8.getTop()
            if (r8 < 0) goto L_0x004f
            goto L_0x0020
        L_0x004f:
            r8 = r4
        L_0x0050:
            if (r8 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r2 = r4
        L_0x0054:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.a.e():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f5484p
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r8 = 3
            if (r0 == r8) goto L_0x0016
            goto L_0x007d
        L_0x0016:
            r7.d()
            goto L_0x007d
        L_0x001a:
            r7.f5482n = r2
            r7.f5480l = r1
        L_0x001e:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r7.f5472c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r9, r8, r3, r2)
            n0.a$a r9 = r7.f5470a
            r9.f5487c = r0
            r9.f5488d = r8
            boolean r8 = r7.f5483o
            if (r8 != 0) goto L_0x007d
            boolean r8 = r7.e()
            if (r8 == 0) goto L_0x007d
            java.lang.Runnable r8 = r7.f5473d
            if (r8 != 0) goto L_0x005f
            n0.a$b r8 = new n0.a$b
            r8.<init>()
            r7.f5473d = r8
        L_0x005f:
            r7.f5483o = r2
            r7.f5481m = r2
            boolean r8 = r7.f5480l
            if (r8 != 0) goto L_0x0074
            int r8 = r7.f5476h
            if (r8 <= 0) goto L_0x0074
            java.lang.Runnable r9 = r7.f5473d
            long r5 = (long) r8
            int[] r8 = j0.x.f4957a
            j0.x.c.n(r4, r9, r5)
            goto L_0x007b
        L_0x0074:
            java.lang.Runnable r8 = r7.f5473d
            n0.a$b r8 = (n0.a.b) r8
            r8.run()
        L_0x007b:
            r7.f5480l = r2
        L_0x007d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
