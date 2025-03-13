package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import k.f;

public abstract class z implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final float f848a;

    /* renamed from: b  reason: collision with root package name */
    public final int f849b;

    /* renamed from: c  reason: collision with root package name */
    public final int f850c;

    /* renamed from: d  reason: collision with root package name */
    public final View f851d;
    public Runnable e;

    /* renamed from: f  reason: collision with root package name */
    public Runnable f852f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f853g;

    /* renamed from: h  reason: collision with root package name */
    public int f854h;

    /* renamed from: i  reason: collision with root package name */
    public final int[] f855i = new int[2];

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            ViewParent parent = z.this.f851d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            z zVar = z.this;
            zVar.a();
            View view = zVar.f851d;
            if (view.isEnabled() && !view.isLongClickable() && zVar.c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
                zVar.f853g = true;
            }
        }
    }

    public z(View view) {
        this.f851d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f848a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f849b = tapTimeout;
        this.f850c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public final void a() {
        Runnable runnable = this.f852f;
        View view = this.f851d;
        if (runnable != null) {
            view.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            view.removeCallbacks(runnable2);
        }
    }

    public abstract f b();

    public abstract boolean c();

    public boolean d() {
        f b9 = b();
        if (b9 == null || !b9.i()) {
            return true;
        }
        b9.dismiss();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0083, code lost:
        if (r4 != 3) goto L_0x0075;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            r12 = this;
            boolean r13 = r12.f853g
            r0 = 3
            android.view.View r1 = r12.f851d
            r2 = 1
            r3 = 0
            if (r13 == 0) goto L_0x006f
            k.f r4 = r12.b()
            if (r4 == 0) goto L_0x005f
            boolean r5 = r4.i()
            if (r5 != 0) goto L_0x0016
            goto L_0x005f
        L_0x0016:
            android.widget.ListView r4 = r4.f()
            androidx.appcompat.widget.x r4 = (androidx.appcompat.widget.x) r4
            if (r4 == 0) goto L_0x005f
            boolean r5 = r4.isShown()
            if (r5 != 0) goto L_0x0025
            goto L_0x005f
        L_0x0025:
            android.view.MotionEvent r5 = android.view.MotionEvent.obtainNoHistory(r14)
            int[] r6 = r12.f855i
            r1.getLocationOnScreen(r6)
            r1 = r6[r3]
            float r1 = (float) r1
            r7 = r6[r2]
            float r7 = (float) r7
            r5.offsetLocation(r1, r7)
            r4.getLocationOnScreen(r6)
            r1 = r6[r3]
            int r1 = -r1
            float r1 = (float) r1
            r6 = r6[r2]
            int r6 = -r6
            float r6 = (float) r6
            r5.offsetLocation(r1, r6)
            int r1 = r12.f854h
            boolean r1 = r4.b(r5, r1)
            r5.recycle()
            int r14 = r14.getActionMasked()
            if (r14 == r2) goto L_0x0058
            if (r14 == r0) goto L_0x0058
            r14 = r2
            goto L_0x0059
        L_0x0058:
            r14 = r3
        L_0x0059:
            if (r1 == 0) goto L_0x005f
            if (r14 == 0) goto L_0x005f
            r14 = r2
            goto L_0x0060
        L_0x005f:
            r14 = r3
        L_0x0060:
            if (r14 != 0) goto L_0x006c
            boolean r14 = r12.d()
            if (r14 != 0) goto L_0x0069
            goto L_0x006c
        L_0x0069:
            r14 = r3
            goto L_0x0122
        L_0x006c:
            r14 = r2
            goto L_0x0122
        L_0x006f:
            boolean r4 = r1.isEnabled()
            if (r4 != 0) goto L_0x0078
        L_0x0075:
            r14 = r3
            goto L_0x0102
        L_0x0078:
            int r4 = r14.getActionMasked()
            if (r4 == 0) goto L_0x00d4
            if (r4 == r2) goto L_0x00d0
            r5 = 2
            if (r4 == r5) goto L_0x0086
            if (r4 == r0) goto L_0x00d0
            goto L_0x0075
        L_0x0086:
            int r0 = r12.f854h
            int r0 = r14.findPointerIndex(r0)
            if (r0 < 0) goto L_0x0075
            float r4 = r14.getX(r0)
            float r14 = r14.getY(r0)
            float r0 = r12.f848a
            float r5 = -r0
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 < 0) goto L_0x00c1
            int r5 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x00c1
            int r5 = r1.getRight()
            int r6 = r1.getLeft()
            int r5 = r5 - r6
            float r5 = (float) r5
            float r5 = r5 + r0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x00c1
            int r4 = r1.getBottom()
            int r5 = r1.getTop()
            int r4 = r4 - r5
            float r4 = (float) r4
            float r4 = r4 + r0
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 >= 0) goto L_0x00c1
            r14 = r2
            goto L_0x00c2
        L_0x00c1:
            r14 = r3
        L_0x00c2:
            if (r14 != 0) goto L_0x0075
            r12.a()
            android.view.ViewParent r14 = r1.getParent()
            r14.requestDisallowInterceptTouchEvent(r2)
            r14 = r2
            goto L_0x0102
        L_0x00d0:
            r12.a()
            goto L_0x0075
        L_0x00d4:
            int r14 = r14.getPointerId(r3)
            r12.f854h = r14
            java.lang.Runnable r14 = r12.e
            if (r14 != 0) goto L_0x00e5
            androidx.appcompat.widget.z$a r14 = new androidx.appcompat.widget.z$a
            r14.<init>()
            r12.e = r14
        L_0x00e5:
            java.lang.Runnable r14 = r12.e
            int r0 = r12.f849b
            long r4 = (long) r0
            r1.postDelayed(r14, r4)
            java.lang.Runnable r14 = r12.f852f
            if (r14 != 0) goto L_0x00f8
            androidx.appcompat.widget.z$b r14 = new androidx.appcompat.widget.z$b
            r14.<init>()
            r12.f852f = r14
        L_0x00f8:
            java.lang.Runnable r14 = r12.f852f
            int r0 = r12.f850c
            long r4 = (long) r0
            r1.postDelayed(r14, r4)
            goto L_0x0075
        L_0x0102:
            if (r14 == 0) goto L_0x010c
            boolean r14 = r12.c()
            if (r14 == 0) goto L_0x010c
            r14 = r2
            goto L_0x010d
        L_0x010c:
            r14 = r3
        L_0x010d:
            if (r14 == 0) goto L_0x0122
            long r6 = android.os.SystemClock.uptimeMillis()
            r8 = 3
            r9 = 0
            r10 = 0
            r11 = 0
            r4 = r6
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r4, r6, r8, r9, r10, r11)
            r1.onTouchEvent(r0)
            r0.recycle()
        L_0x0122:
            r12.f853g = r14
            if (r14 != 0) goto L_0x012a
            if (r13 == 0) goto L_0x0129
            goto L_0x012a
        L_0x0129:
            r2 = r3
        L_0x012a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.z.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f853g = false;
        this.f854h = -1;
        Runnable runnable = this.e;
        if (runnable != null) {
            this.f851d.removeCallbacks(runnable);
        }
    }
}
