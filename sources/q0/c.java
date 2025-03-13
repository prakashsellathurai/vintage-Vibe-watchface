package q0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import j0.x;
import java.util.Arrays;

public final class c {

    /* renamed from: v  reason: collision with root package name */
    public static final Interpolator f6395v = new a();

    /* renamed from: a  reason: collision with root package name */
    public int f6396a;

    /* renamed from: b  reason: collision with root package name */
    public int f6397b;

    /* renamed from: c  reason: collision with root package name */
    public int f6398c = -1;

    /* renamed from: d  reason: collision with root package name */
    public float[] f6399d;
    public float[] e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f6400f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f6401g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f6402h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f6403i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f6404j;

    /* renamed from: k  reason: collision with root package name */
    public int f6405k;

    /* renamed from: l  reason: collision with root package name */
    public VelocityTracker f6406l;

    /* renamed from: m  reason: collision with root package name */
    public final float f6407m;

    /* renamed from: n  reason: collision with root package name */
    public final float f6408n;

    /* renamed from: o  reason: collision with root package name */
    public final int f6409o;

    /* renamed from: p  reason: collision with root package name */
    public final OverScroller f6410p;

    /* renamed from: q  reason: collision with root package name */
    public final C0112c f6411q;
    public View r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f6412s;

    /* renamed from: t  reason: collision with root package name */
    public final ViewGroup f6413t;

    /* renamed from: u  reason: collision with root package name */
    public final Runnable f6414u = new b();

    public static class a implements Interpolator {
        public final float getInterpolation(float f9) {
            float f10 = f9 - 1.0f;
            return (f10 * f10 * f10 * f10 * f10) + 1.0f;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            c.this.p(0);
        }
    }

    /* renamed from: q0.c$c  reason: collision with other inner class name */
    public static abstract class C0112c {
        public abstract int a(View view, int i8);

        public abstract int b(View view, int i8);

        public int c(View view) {
            return 0;
        }

        public int d() {
            return 0;
        }

        public void e(View view, int i8) {
        }

        public abstract void f(int i8);

        public abstract void g(View view, int i8, int i9);

        public abstract void h(View view, float f9, float f10);

        public abstract boolean i(View view, int i8);
    }

    public c(Context context, ViewGroup viewGroup, C0112c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f6413t = viewGroup;
            this.f6411q = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f6409o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f6397b = viewConfiguration.getScaledTouchSlop();
            this.f6407m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f6408n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f6410p = new OverScroller(context, f6395v);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    public final void a() {
        this.f6398c = -1;
        float[] fArr = this.f6399d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f6400f, 0.0f);
            Arrays.fill(this.f6401g, 0.0f);
            Arrays.fill(this.f6402h, 0);
            Arrays.fill(this.f6403i, 0);
            Arrays.fill(this.f6404j, 0);
            this.f6405k = 0;
        }
        VelocityTracker velocityTracker = this.f6406l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f6406l = null;
        }
    }

    public final void b(View view, int i8) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f6413t;
        if (parent == viewGroup) {
            this.r = view;
            this.f6398c = i8;
            this.f6411q.e(view, i8);
            p(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
    }

    public final boolean c(float f9, float f10, int i8, int i9) {
        float abs = Math.abs(f9);
        float abs2 = Math.abs(f10);
        if ((this.f6402h[i8] & i9) != i9 || (0 & i9) == 0 || (this.f6404j[i8] & i9) == i9 || (this.f6403i[i8] & i9) == i9) {
            return false;
        }
        int i10 = this.f6397b;
        if (abs <= ((float) i10) && abs2 <= ((float) i10)) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.f6411q.getClass();
        }
        return (this.f6403i[i8] & i9) == 0 && abs > ((float) this.f6397b);
    }

    public final boolean d(View view, float f9, float f10) {
        if (view == null) {
            return false;
        }
        C0112c cVar = this.f6411q;
        boolean z8 = cVar.c(view) > 0;
        boolean z9 = cVar.d() > 0;
        if (!z8 || !z9) {
            return z8 ? Math.abs(f9) > ((float) this.f6397b) : z9 && Math.abs(f10) > ((float) this.f6397b);
        }
        int i8 = this.f6397b;
        return (f9 * f9) + (f10 * f10) > ((float) (i8 * i8));
    }

    public final void e(int i8) {
        float[] fArr = this.f6399d;
        if (fArr != null) {
            int i9 = this.f6405k;
            boolean z8 = true;
            int i10 = 1 << i8;
            if ((i9 & i10) == 0) {
                z8 = false;
            }
            if (z8) {
                fArr[i8] = 0.0f;
                this.e[i8] = 0.0f;
                this.f6400f[i8] = 0.0f;
                this.f6401g[i8] = 0.0f;
                this.f6402h[i8] = 0;
                this.f6403i[i8] = 0;
                this.f6404j[i8] = 0;
                this.f6405k = (~i10) & i9;
            }
        }
    }

    public final int f(int i8, int i9, int i10) {
        if (i8 == 0) {
            return 0;
        }
        int width = this.f6413t.getWidth();
        float f9 = (float) (width / 2);
        float sin = f9 + (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i8)) / ((float) width)) - 0.5f) * 0.47123894f))) * f9);
        int abs = Math.abs(i9);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i8)) / ((float) i10)) + 1.0f) * 256.0f), 600);
    }

    public final boolean g() {
        if (this.f6396a == 2) {
            OverScroller overScroller = this.f6410p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.r.getLeft();
            int top = currY - this.r.getTop();
            if (left != 0) {
                View view = this.r;
                int[] iArr = x.f4957a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.r;
                int[] iArr2 = x.f4957a;
                view2.offsetTopAndBottom(top);
            }
            if (!(left == 0 && top == 0)) {
                this.f6411q.g(this.r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f6413t.post(this.f6414u);
            }
        }
        return this.f6396a == 2;
    }

    public final View h(int i8, int i9) {
        ViewGroup viewGroup = this.f6413t;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f6411q.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i8 >= childAt.getLeft() && i8 < childAt.getRight() && i9 >= childAt.getTop() && i9 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            android.view.View r0 = r10.r
            int r2 = r0.getLeft()
            android.view.View r0 = r10.r
            int r3 = r0.getTop()
            int r4 = r11 - r2
            int r5 = r12 - r3
            android.widget.OverScroller r1 = r10.f6410p
            r11 = 0
            if (r4 != 0) goto L_0x001e
            if (r5 != 0) goto L_0x001e
            r1.abortAnimation()
            r10.p(r11)
            return r11
        L_0x001e:
            android.view.View r12 = r10.r
            float r0 = r10.f6408n
            int r0 = (int) r0
            float r6 = r10.f6407m
            int r6 = (int) r6
            int r7 = java.lang.Math.abs(r13)
            if (r7 >= r0) goto L_0x002e
            r13 = r11
            goto L_0x0035
        L_0x002e:
            if (r7 <= r6) goto L_0x0035
            if (r13 <= 0) goto L_0x0034
            r13 = r6
            goto L_0x0035
        L_0x0034:
            int r13 = -r6
        L_0x0035:
            int r7 = java.lang.Math.abs(r14)
            if (r7 >= r0) goto L_0x003c
            goto L_0x0043
        L_0x003c:
            if (r7 <= r6) goto L_0x0044
            if (r14 <= 0) goto L_0x0042
            r14 = r6
            goto L_0x0044
        L_0x0042:
            int r11 = -r6
        L_0x0043:
            r14 = r11
        L_0x0044:
            int r11 = java.lang.Math.abs(r4)
            int r0 = java.lang.Math.abs(r5)
            int r6 = java.lang.Math.abs(r13)
            int r7 = java.lang.Math.abs(r14)
            int r8 = r6 + r7
            int r9 = r11 + r0
            if (r13 == 0) goto L_0x005d
            float r11 = (float) r6
            float r6 = (float) r8
            goto L_0x005f
        L_0x005d:
            float r11 = (float) r11
            float r6 = (float) r9
        L_0x005f:
            float r11 = r11 / r6
            if (r14 == 0) goto L_0x0065
            float r0 = (float) r7
            float r6 = (float) r8
            goto L_0x0067
        L_0x0065:
            float r0 = (float) r0
            float r6 = (float) r9
        L_0x0067:
            float r0 = r0 / r6
            q0.c$c r6 = r10.f6411q
            int r12 = r6.c(r12)
            int r12 = r10.f(r4, r13, r12)
            int r13 = r6.d()
            int r13 = r10.f(r5, r14, r13)
            float r12 = (float) r12
            float r12 = r12 * r11
            float r11 = (float) r13
            float r11 = r11 * r0
            float r12 = r12 + r11
            int r6 = (int) r12
            r1.startScroll(r2, r3, r4, r5, r6)
            r11 = 2
            r10.p(r11)
            r10 = 1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.c.i(int, int, int, int):boolean");
    }

    public final boolean j(int i8) {
        if ((this.f6405k & (1 << i8)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i8 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void k(MotionEvent motionEvent) {
        int i8;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f6406l == null) {
            this.f6406l = VelocityTracker.obtain();
        }
        this.f6406l.addMovement(motionEvent);
        int i9 = 0;
        C0112c cVar = this.f6411q;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f6396a != 1) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (i9 < pointerCount) {
                            int pointerId = motionEvent.getPointerId(i9);
                            if (j(pointerId)) {
                                float x8 = motionEvent.getX(i9);
                                float y = motionEvent.getY(i9);
                                float f9 = x8 - this.f6399d[pointerId];
                                float f10 = y - this.e[pointerId];
                                m(f9, f10, pointerId);
                                if (this.f6396a != 1) {
                                    View h8 = h((int) x8, (int) y);
                                    if (d(h8, f9, f10) && s(h8, pointerId)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i9++;
                        }
                    } else if (j(this.f6398c)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f6398c);
                        float x9 = motionEvent.getX(findPointerIndex);
                        float y8 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f6400f;
                        int i10 = this.f6398c;
                        int i11 = (int) (x9 - fArr[i10]);
                        int i12 = (int) (y8 - this.f6401g[i10]);
                        int left = this.r.getLeft() + i11;
                        int top = this.r.getTop() + i12;
                        int left2 = this.r.getLeft();
                        int top2 = this.r.getTop();
                        if (i11 != 0) {
                            left = cVar.a(this.r, left);
                            int[] iArr = x.f4957a;
                            this.r.offsetLeftAndRight(left - left2);
                        }
                        if (i12 != 0) {
                            top = cVar.b(this.r, top);
                            int[] iArr2 = x.f4957a;
                            this.r.offsetTopAndBottom(top - top2);
                        }
                        if (!(i11 == 0 && i12 == 0)) {
                            cVar.g(this.r, left, top);
                        }
                    } else {
                        return;
                    }
                    o(motionEvent);
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        float x10 = motionEvent.getX(actionIndex);
                        float y9 = motionEvent.getY(actionIndex);
                        n(x10, y9, pointerId2);
                        if (this.f6396a == 0) {
                            s(h((int) x10, (int) y9), pointerId2);
                            if ((this.f6402h[pointerId2] & 0) == 0) {
                                return;
                            }
                        } else {
                            int i13 = (int) x10;
                            int i14 = (int) y9;
                            View view = this.r;
                            if (view != null && i13 >= view.getLeft() && i13 < view.getRight() && i14 >= view.getTop() && i14 < view.getBottom()) {
                                i9 = 1;
                            }
                            if (i9 != 0) {
                                s(this.r, pointerId2);
                                return;
                            }
                            return;
                        }
                    } else if (actionMasked == 6) {
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        if (this.f6396a == 1 && pointerId3 == this.f6398c) {
                            int pointerCount2 = motionEvent.getPointerCount();
                            while (true) {
                                if (i9 >= pointerCount2) {
                                    i8 = -1;
                                    break;
                                }
                                int pointerId4 = motionEvent.getPointerId(i9);
                                if (pointerId4 != this.f6398c) {
                                    View h9 = h((int) motionEvent.getX(i9), (int) motionEvent.getY(i9));
                                    View view2 = this.r;
                                    if (h9 == view2 && s(view2, pointerId4)) {
                                        i8 = this.f6398c;
                                        break;
                                    }
                                }
                                i9++;
                            }
                            if (i8 == -1) {
                                l();
                            }
                        }
                        e(pointerId3);
                        return;
                    } else {
                        return;
                    }
                } else if (this.f6396a == 1) {
                    this.f6412s = true;
                    cVar.h(this.r, 0.0f, 0.0f);
                    this.f6412s = false;
                    if (this.f6396a == 1) {
                        p(0);
                    }
                }
            } else if (this.f6396a == 1) {
                l();
            }
            a();
            return;
        }
        float x11 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View h10 = h((int) x11, (int) y10);
        n(x11, y10, pointerId5);
        s(h10, pointerId5);
        if ((this.f6402h[pointerId5] & 0) == 0) {
            return;
        }
        cVar.getClass();
    }

    public final void l() {
        VelocityTracker velocityTracker = this.f6406l;
        float f9 = this.f6407m;
        velocityTracker.computeCurrentVelocity(1000, f9);
        float xVelocity = this.f6406l.getXVelocity(this.f6398c);
        float abs = Math.abs(xVelocity);
        float f10 = this.f6408n;
        float f11 = 0.0f;
        if (abs < f10) {
            xVelocity = 0.0f;
        } else if (abs > f9) {
            xVelocity = xVelocity > 0.0f ? f9 : -f9;
        }
        float yVelocity = this.f6406l.getYVelocity(this.f6398c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f10) {
            if (abs2 > f9) {
                if (yVelocity <= 0.0f) {
                    f9 = -f9;
                }
                f11 = f9;
            } else {
                f11 = yVelocity;
            }
        }
        this.f6412s = true;
        this.f6411q.h(this.r, xVelocity, f11);
        this.f6412s = false;
        if (this.f6396a == 1) {
            p(0);
        }
    }

    public final void m(float f9, float f10, int i8) {
        boolean c9 = c(f9, f10, i8, 1);
        if (c(f10, f9, i8, 4)) {
            c9 |= true;
        }
        if (c(f9, f10, i8, 2)) {
            c9 |= true;
        }
        if (c(f10, f9, i8, 8)) {
            c9 |= true;
        }
        if (c9) {
            int[] iArr = this.f6403i;
            iArr[i8] = iArr[i8] | c9;
            this.f6411q.getClass();
        }
    }

    public final void n(float f9, float f10, int i8) {
        float[] fArr = this.f6399d;
        int i9 = 0;
        if (fArr == null || fArr.length <= i8) {
            int i10 = i8 + 1;
            float[] fArr2 = new float[i10];
            float[] fArr3 = new float[i10];
            float[] fArr4 = new float[i10];
            float[] fArr5 = new float[i10];
            int[] iArr = new int[i10];
            int[] iArr2 = new int[i10];
            int[] iArr3 = new int[i10];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f6400f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f6401g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f6402h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f6403i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f6404j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f6399d = fArr2;
            this.e = fArr3;
            this.f6400f = fArr4;
            this.f6401g = fArr5;
            this.f6402h = iArr;
            this.f6403i = iArr2;
            this.f6404j = iArr3;
        }
        float[] fArr9 = this.f6399d;
        this.f6400f[i8] = f9;
        fArr9[i8] = f9;
        float[] fArr10 = this.e;
        this.f6401g[i8] = f10;
        fArr10[i8] = f10;
        int[] iArr7 = this.f6402h;
        int i11 = (int) f9;
        int i12 = (int) f10;
        ViewGroup viewGroup = this.f6413t;
        int left = viewGroup.getLeft();
        int i13 = this.f6409o;
        if (i11 < left + i13) {
            i9 = 1;
        }
        if (i12 < viewGroup.getTop() + i13) {
            i9 |= 4;
        }
        if (i11 > viewGroup.getRight() - i13) {
            i9 |= 2;
        }
        if (i12 > viewGroup.getBottom() - i13) {
            i9 |= 8;
        }
        iArr7[i8] = i9;
        this.f6405k |= 1 << i8;
    }

    public final void o(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i8 = 0; i8 < pointerCount; i8++) {
            int pointerId = motionEvent.getPointerId(i8);
            if (j(pointerId)) {
                float x8 = motionEvent.getX(i8);
                float y = motionEvent.getY(i8);
                this.f6400f[pointerId] = x8;
                this.f6401g[pointerId] = y;
            }
        }
    }

    public final void p(int i8) {
        this.f6413t.removeCallbacks(this.f6414u);
        if (this.f6396a != i8) {
            this.f6396a = i8;
            this.f6411q.f(i8);
            if (this.f6396a == 0) {
                this.r = null;
            }
        }
    }

    public final boolean q(int i8, int i9) {
        if (this.f6412s) {
            return i(i8, i9, (int) this.f6406l.getXVelocity(this.f6398c), (int) this.f6406l.getYVelocity(this.f6398c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0057, code lost:
        if ((r0.f6402h[r2] & 0) != 0) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d2, code lost:
        if (r13 != r12) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011c, code lost:
        if ((r0.f6402h[r1] & 0) != 0) goto L_0x0059;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r(android.view.MotionEvent r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            int r2 = r19.getActionMasked()
            int r3 = r19.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r18.a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f6406l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f6406l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f6406l
            r4.addMovement(r1)
            r4 = 1
            r5 = 0
            r6 = 2
            q0.c$c r7 = r0.f6411q
            if (r2 == 0) goto L_0x00f7
            if (r2 == r4) goto L_0x00f3
            if (r2 == r6) goto L_0x006f
            r8 = 3
            if (r2 == r8) goto L_0x00f3
            r8 = 5
            if (r2 == r8) goto L_0x003f
            r6 = 6
            if (r2 == r6) goto L_0x0036
            goto L_0x0120
        L_0x0036:
            int r1 = r1.getPointerId(r3)
            r0.e(r1)
            goto L_0x0120
        L_0x003f:
            int r2 = r1.getPointerId(r3)
            float r8 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.n(r8, r1, r2)
            int r3 = r0.f6396a
            if (r3 != 0) goto L_0x005e
            int[] r1 = r0.f6402h
            r1 = r1[r2]
            r1 = r1 & r5
            if (r1 == 0) goto L_0x0120
        L_0x0059:
            r7.getClass()
            goto L_0x0120
        L_0x005e:
            if (r3 != r6) goto L_0x0120
            int r3 = (int) r8
            int r1 = (int) r1
            android.view.View r1 = r0.h(r3, r1)
            android.view.View r3 = r0.r
            if (r1 != r3) goto L_0x0120
            r0.s(r1, r2)
            goto L_0x0120
        L_0x006f:
            float[] r2 = r0.f6399d
            if (r2 == 0) goto L_0x0120
            float[] r2 = r0.e
            if (r2 != 0) goto L_0x0079
            goto L_0x0120
        L_0x0079:
            int r2 = r19.getPointerCount()
            r3 = r5
        L_0x007e:
            if (r3 >= r2) goto L_0x00ef
            int r6 = r1.getPointerId(r3)
            boolean r8 = r0.j(r6)
            if (r8 != 0) goto L_0x008b
            goto L_0x00ec
        L_0x008b:
            float r8 = r1.getX(r3)
            float r9 = r1.getY(r3)
            float[] r10 = r0.f6399d
            r10 = r10[r6]
            float r10 = r8 - r10
            float[] r11 = r0.e
            r11 = r11[r6]
            float r11 = r9 - r11
            int r8 = (int) r8
            int r9 = (int) r9
            android.view.View r8 = r0.h(r8, r9)
            if (r8 == 0) goto L_0x00af
            boolean r9 = r0.d(r8, r10, r11)
            if (r9 == 0) goto L_0x00af
            r9 = r4
            goto L_0x00b0
        L_0x00af:
            r9 = r5
        L_0x00b0:
            if (r9 == 0) goto L_0x00db
            int r12 = r8.getLeft()
            int r13 = (int) r10
            int r13 = r13 + r12
            int r13 = r7.a(r8, r13)
            int r14 = r8.getTop()
            int r15 = (int) r11
            int r15 = r15 + r14
            int r15 = r7.b(r8, r15)
            int r16 = r7.c(r8)
            int r17 = r7.d()
            if (r16 == 0) goto L_0x00d4
            if (r16 <= 0) goto L_0x00db
            if (r13 != r12) goto L_0x00db
        L_0x00d4:
            if (r17 == 0) goto L_0x00ef
            if (r17 <= 0) goto L_0x00db
            if (r15 != r14) goto L_0x00db
            goto L_0x00ef
        L_0x00db:
            r0.m(r10, r11, r6)
            int r10 = r0.f6396a
            if (r10 != r4) goto L_0x00e3
            goto L_0x00ef
        L_0x00e3:
            if (r9 == 0) goto L_0x00ec
            boolean r6 = r0.s(r8, r6)
            if (r6 == 0) goto L_0x00ec
            goto L_0x00ef
        L_0x00ec:
            int r3 = r3 + 1
            goto L_0x007e
        L_0x00ef:
            r18.o(r19)
            goto L_0x0120
        L_0x00f3:
            r18.a()
            goto L_0x0120
        L_0x00f7:
            float r2 = r19.getX()
            float r3 = r19.getY()
            int r1 = r1.getPointerId(r5)
            r0.n(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.h(r2, r3)
            android.view.View r3 = r0.r
            if (r2 != r3) goto L_0x0117
            int r3 = r0.f6396a
            if (r3 != r6) goto L_0x0117
            r0.s(r2, r1)
        L_0x0117:
            int[] r2 = r0.f6402h
            r1 = r2[r1]
            r1 = r1 & r5
            if (r1 == 0) goto L_0x0120
            goto L_0x0059
        L_0x0120:
            int r0 = r0.f6396a
            if (r0 != r4) goto L_0x0125
            goto L_0x0126
        L_0x0125:
            r4 = r5
        L_0x0126:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.c.r(android.view.MotionEvent):boolean");
    }

    public final boolean s(View view, int i8) {
        if (view == this.r && this.f6398c == i8) {
            return true;
        }
        if (view == null || !this.f6411q.i(view, i8)) {
            return false;
        }
        this.f6398c = i8;
        b(view, i8);
        return true;
    }
}
