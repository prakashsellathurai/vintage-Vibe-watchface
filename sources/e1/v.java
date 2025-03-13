package e1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import e1.h;
import java.util.HashMap;

public abstract class v extends h {
    public static final String[] D = {"android:visibility:visibility", "android:visibility:parent"};
    public int C = 3;

    public static class a extends AnimatorListenerAdapter implements h.d {

        /* renamed from: a  reason: collision with root package name */
        public final View f4228a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4229b;

        /* renamed from: c  reason: collision with root package name */
        public final ViewGroup f4230c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f4231d;
        public boolean e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f4232f = false;

        public a(View view, int i8) {
            this.f4228a = view;
            this.f4229b = i8;
            this.f4230c = (ViewGroup) view.getParent();
            this.f4231d = true;
            f(true);
        }

        public final void a() {
        }

        public final void b() {
            f(false);
        }

        public final void c() {
            f(true);
        }

        public final void d() {
        }

        public final void e(h hVar) {
            if (!this.f4232f) {
                Property<View, Float> property = o.f4223a;
                this.f4228a.setTransitionVisibility(this.f4229b);
                ViewGroup viewGroup = this.f4230c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            f(false);
            hVar.v(this);
        }

        public final void f(boolean z8) {
            ViewGroup viewGroup;
            if (this.f4231d && this.e != z8 && (viewGroup = this.f4230c) != null) {
                this.e = z8;
                viewGroup.suppressLayout(z8);
            }
        }

        public final void onAnimationCancel(Animator animator) {
            this.f4232f = true;
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.f4232f) {
                Property<View, Float> property = o.f4223a;
                this.f4228a.setTransitionVisibility(this.f4229b);
                ViewGroup viewGroup = this.f4230c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            f(false);
        }

        public final void onAnimationPause(Animator animator) {
            if (!this.f4232f) {
                Property<View, Float> property = o.f4223a;
                this.f4228a.setTransitionVisibility(this.f4229b);
            }
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationResume(Animator animator) {
            if (!this.f4232f) {
                Property<View, Float> property = o.f4223a;
                this.f4228a.setTransitionVisibility(0);
            }
        }

        public final void onAnimationStart(Animator animator) {
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f4233a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f4234b;

        /* renamed from: c  reason: collision with root package name */
        public int f4235c;

        /* renamed from: d  reason: collision with root package name */
        public int f4236d;
        public ViewGroup e;

        /* renamed from: f  reason: collision with root package name */
        public ViewGroup f4237f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006d, code lost:
        if (r9 == 0) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        if (r0.e == null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0087, code lost:
        if (r0.f4235c == 0) goto L_0x0089;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static e1.v.b I(e1.n r8, e1.n r9) {
        /*
            e1.v$b r0 = new e1.v$b
            r0.<init>()
            r1 = 0
            r0.f4233a = r1
            r0.f4234b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L_0x002f
            java.util.HashMap r6 = r8.f4220a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L_0x002f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f4235c = r7
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.e = r6
            goto L_0x0033
        L_0x002f:
            r0.f4235c = r4
            r0.e = r3
        L_0x0033:
            if (r9 == 0) goto L_0x0052
            java.util.HashMap r6 = r9.f4220a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L_0x0052
            java.lang.Object r3 = r6.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f4236d = r3
            java.lang.Object r2 = r6.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f4237f = r2
            goto L_0x0056
        L_0x0052:
            r0.f4236d = r4
            r0.f4237f = r3
        L_0x0056:
            r2 = 1
            if (r8 == 0) goto L_0x007a
            if (r9 == 0) goto L_0x007a
            int r8 = r0.f4235c
            int r9 = r0.f4236d
            if (r8 != r9) goto L_0x0068
            android.view.ViewGroup r3 = r0.e
            android.view.ViewGroup r4 = r0.f4237f
            if (r3 != r4) goto L_0x0068
            return r0
        L_0x0068:
            if (r8 == r9) goto L_0x0070
            if (r8 != 0) goto L_0x006d
            goto L_0x0089
        L_0x006d:
            if (r9 != 0) goto L_0x008d
            goto L_0x0080
        L_0x0070:
            android.view.ViewGroup r8 = r0.f4237f
            if (r8 != 0) goto L_0x0075
            goto L_0x0089
        L_0x0075:
            android.view.ViewGroup r8 = r0.e
            if (r8 != 0) goto L_0x008d
            goto L_0x0080
        L_0x007a:
            if (r8 != 0) goto L_0x0083
            int r8 = r0.f4236d
            if (r8 != 0) goto L_0x0083
        L_0x0080:
            r0.f4234b = r2
            goto L_0x008b
        L_0x0083:
            if (r9 != 0) goto L_0x008d
            int r8 = r0.f4235c
            if (r8 != 0) goto L_0x008d
        L_0x0089:
            r0.f4234b = r1
        L_0x008b:
            r0.f4233a = r2
        L_0x008d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.v.I(e1.n, e1.n):e1.v$b");
    }

    public final void H(n nVar) {
        View view = nVar.f4221b;
        int visibility = view.getVisibility();
        HashMap hashMap = nVar.f4220a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public final void d(n nVar) {
        H(nVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: e1.v$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: e1.u} */
    /* JADX WARNING: type inference failed for: r16v4, types: [android.view.ViewParent] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        if (I(n(r3, false), q(r3, false)).f4233a != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        r2 = (java.lang.Float) r2.f4220a.get("android:fade:transitionAlpha");
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator k(android.view.ViewGroup r21, e1.n r22, e1.n r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            e1.v$b r4 = I(r22, r23)
            boolean r5 = r4.f4233a
            if (r5 == 0) goto L_0x02ab
            android.view.ViewGroup r5 = r4.e
            if (r5 != 0) goto L_0x0018
            android.view.ViewGroup r5 = r4.f4237f
            if (r5 == 0) goto L_0x02ab
        L_0x0018:
            boolean r5 = r4.f4234b
            r7 = 1
            java.lang.String r8 = "android:fade:transitionAlpha"
            r9 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = 0
            if (r5 == 0) goto L_0x0067
            int r1 = r0.C
            r1 = r1 & r7
            if (r1 != r7) goto L_0x0065
            if (r3 != 0) goto L_0x002b
            goto L_0x0065
        L_0x002b:
            android.view.View r1 = r3.f4221b
            if (r2 != 0) goto L_0x0046
            android.view.ViewParent r3 = r1.getParent()
            android.view.View r3 = (android.view.View) r3
            e1.n r4 = r0.n(r3, r11)
            e1.n r3 = r0.q(r3, r11)
            e1.v$b r3 = I(r4, r3)
            boolean r3 = r3.f4233a
            if (r3 == 0) goto L_0x0046
            goto L_0x0065
        L_0x0046:
            e1.d r0 = (e1.d) r0
            if (r2 == 0) goto L_0x0059
            java.util.HashMap r2 = r2.f4220a
            java.lang.Object r2 = r2.get(r8)
            java.lang.Float r2 = (java.lang.Float) r2
            if (r2 == 0) goto L_0x0059
            float r2 = r2.floatValue()
            goto L_0x005a
        L_0x0059:
            r2 = r9
        L_0x005a:
            int r3 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r9 = r2
        L_0x0060:
            android.animation.ObjectAnimator r6 = r0.J(r1, r9, r10)
            goto L_0x0066
        L_0x0065:
            r6 = 0
        L_0x0066:
            return r6
        L_0x0067:
            int r4 = r4.f4236d
            int r5 = r0.C
            r12 = 2
            r5 = r5 & r12
            if (r5 == r12) goto L_0x0071
            goto L_0x02a9
        L_0x0071:
            if (r2 != 0) goto L_0x0075
            goto L_0x02a9
        L_0x0075:
            if (r3 == 0) goto L_0x007a
            android.view.View r3 = r3.f4221b
            goto L_0x007b
        L_0x007a:
            r3 = 0
        L_0x007b:
            android.view.View r5 = r2.f4221b
            r13 = -2146762378(0xffffffff800b0176, float:-1.010715E-39)
            java.lang.Object r14 = r5.getTag(r13)
            android.view.View r14 = (android.view.View) r14
            if (r14 == 0) goto L_0x0091
            r0 = r2
            r18 = r4
            r19 = r8
            r2 = r10
            r3 = 0
            goto L_0x0201
        L_0x0091:
            if (r3 == 0) goto L_0x00a2
            android.view.ViewParent r14 = r3.getParent()
            if (r14 != 0) goto L_0x009a
            goto L_0x00a2
        L_0x009a:
            r14 = 4
            if (r4 != r14) goto L_0x009e
            goto L_0x00a0
        L_0x009e:
            if (r5 != r3) goto L_0x00a8
        L_0x00a0:
            r14 = 0
            goto L_0x00a6
        L_0x00a2:
            if (r3 == 0) goto L_0x00a8
            r14 = r3
            r3 = 0
        L_0x00a6:
            r15 = r11
            goto L_0x00ab
        L_0x00a8:
            r15 = r7
            r3 = 0
            r14 = 0
        L_0x00ab:
            if (r15 == 0) goto L_0x01f4
            android.view.ViewParent r15 = r5.getParent()
            if (r15 != 0) goto L_0x00bd
            r0 = r2
            r18 = r4
            r14 = r5
            r19 = r8
            r2 = r10
            r7 = r11
            goto L_0x0201
        L_0x00bd:
            android.view.ViewParent r15 = r5.getParent()
            boolean r15 = r15 instanceof android.view.View
            if (r15 == 0) goto L_0x01f4
            android.view.ViewParent r15 = r5.getParent()
            android.view.View r15 = (android.view.View) r15
            e1.n r6 = r0.q(r15, r7)
            e1.n r13 = r0.n(r15, r7)
            e1.v$b r6 = I(r6, r13)
            boolean r6 = r6.f4233a
            if (r6 != 0) goto L_0x01dd
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            int r13 = r15.getScrollX()
            int r13 = -r13
            float r13 = (float) r13
            int r14 = r15.getScrollY()
            int r14 = -r14
            float r14 = (float) r14
            r6.setTranslate(r13, r14)
            android.util.Property<android.view.View, java.lang.Float> r13 = e1.o.f4223a
            r5.transformMatrixToGlobal(r6)
            r1.transformMatrixToLocal(r6)
            android.graphics.RectF r13 = new android.graphics.RectF
            int r14 = r5.getWidth()
            float r14 = (float) r14
            int r15 = r5.getHeight()
            float r15 = (float) r15
            r13.<init>(r9, r9, r14, r15)
            r6.mapRect(r13)
            float r14 = r13.left
            int r14 = java.lang.Math.round(r14)
            float r15 = r13.top
            int r15 = java.lang.Math.round(r15)
            float r9 = r13.right
            int r9 = java.lang.Math.round(r9)
            float r12 = r13.bottom
            int r12 = java.lang.Math.round(r12)
            android.widget.ImageView r11 = new android.widget.ImageView
            android.content.Context r10 = r5.getContext()
            r11.<init>(r10)
            android.widget.ImageView$ScaleType r10 = android.widget.ImageView.ScaleType.CENTER_CROP
            r11.setScaleType(r10)
            boolean r10 = r5.isAttachedToWindow()
            r10 = r10 ^ r7
            boolean r16 = r21.isAttachedToWindow()
            if (r10 == 0) goto L_0x015d
            if (r16 != 0) goto L_0x0145
            r17 = r3
            r18 = r4
            r19 = r8
            r0 = 0
            goto L_0x01c2
        L_0x0145:
            android.view.ViewParent r16 = r5.getParent()
            r7 = r16
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            int r16 = r7.indexOfChild(r5)
            r17 = r3
            android.view.ViewGroupOverlay r3 = r21.getOverlay()
            r3.add(r5)
            r3 = r16
            goto L_0x0161
        L_0x015d:
            r17 = r3
            r3 = 0
            r7 = 0
        L_0x0161:
            float r16 = r13.width()
            r18 = r4
            int r4 = java.lang.Math.round(r16)
            float r16 = r13.height()
            r19 = r8
            int r8 = java.lang.Math.round(r16)
            if (r4 <= 0) goto L_0x01b5
            if (r8 <= 0) goto L_0x01b5
            int r0 = r4 * r8
            float r0 = (float) r0
            r16 = 1233125376(0x49800000, float:1048576.0)
            float r0 = r16 / r0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r2, r0)
            float r4 = (float) r4
            float r4 = r4 * r0
            int r4 = java.lang.Math.round(r4)
            float r8 = (float) r8
            float r8 = r8 * r0
            int r8 = java.lang.Math.round(r8)
            float r2 = r13.left
            float r2 = -r2
            float r13 = r13.top
            float r13 = -r13
            r6.postTranslate(r2, r13)
            r6.postScale(r0, r0)
            android.graphics.Picture r0 = new android.graphics.Picture
            r0.<init>()
            android.graphics.Canvas r2 = r0.beginRecording(r4, r8)
            r2.concat(r6)
            r5.draw(r2)
            r0.endRecording()
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0)
            goto L_0x01b6
        L_0x01b5:
            r0 = 0
        L_0x01b6:
            if (r10 == 0) goto L_0x01c2
            android.view.ViewGroupOverlay r2 = r21.getOverlay()
            r2.remove(r5)
            r7.addView(r5, r3)
        L_0x01c2:
            if (r0 == 0) goto L_0x01c7
            r11.setImageBitmap(r0)
        L_0x01c7:
            int r0 = r9 - r14
            r2 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r3 = r12 - r15
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            r11.measure(r0, r2)
            r11.layout(r14, r15, r9, r12)
            r14 = r11
            goto L_0x01fa
        L_0x01dd:
            r17 = r3
            r18 = r4
            r19 = r8
            int r0 = r15.getId()
            android.view.ViewParent r2 = r15.getParent()
            if (r2 != 0) goto L_0x01fa
            r2 = -1
            if (r0 == r2) goto L_0x01fa
            r1.findViewById(r0)
            goto L_0x01fa
        L_0x01f4:
            r17 = r3
            r18 = r4
            r19 = r8
        L_0x01fa:
            r0 = r22
            r3 = r17
            r2 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
        L_0x0201:
            java.util.HashMap r0 = r0.f4220a
            if (r14 == 0) goto L_0x026c
            if (r7 != 0) goto L_0x0238
            java.lang.String r3 = "android:visibility:screenLocation"
            java.lang.Object r3 = r0.get(r3)
            int[] r3 = (int[]) r3
            r4 = 0
            r6 = r3[r4]
            r8 = 1
            r3 = r3[r8]
            r9 = 2
            int[] r9 = new int[r9]
            r1.getLocationOnScreen(r9)
            r4 = r9[r4]
            int r6 = r6 - r4
            int r4 = r14.getLeft()
            int r6 = r6 - r4
            r14.offsetLeftAndRight(r6)
            r4 = r9[r8]
            int r3 = r3 - r4
            int r4 = r14.getTop()
            int r3 = r3 - r4
            r14.offsetTopAndBottom(r3)
            android.view.ViewGroupOverlay r3 = r21.getOverlay()
            r3.add(r14)
        L_0x0238:
            r4 = r20
            r3 = r4
            e1.d r3 = (e1.d) r3
            android.util.Property<android.view.View, java.lang.Float> r6 = e1.o.f4223a
            r6 = r19
            java.lang.Object r0 = r0.get(r6)
            java.lang.Float r0 = (java.lang.Float) r0
            if (r0 == 0) goto L_0x024e
            float r10 = r0.floatValue()
            goto L_0x024f
        L_0x024e:
            r10 = r2
        L_0x024f:
            r0 = 0
            android.animation.ObjectAnimator r6 = r3.J(r14, r10, r0)
            if (r7 != 0) goto L_0x02aa
            if (r6 != 0) goto L_0x0260
            android.view.ViewGroupOverlay r0 = r21.getOverlay()
            r0.remove(r14)
            goto L_0x02aa
        L_0x0260:
            r0 = -2146762378(0xffffffff800b0176, float:-1.010715E-39)
            r5.setTag(r0, r14)
            e1.u r0 = new e1.u
            r0.<init>(r4, r1, r14, r5)
            goto L_0x02a1
        L_0x026c:
            r4 = r20
            r6 = r19
            if (r3 == 0) goto L_0x02a9
            int r1 = r3.getVisibility()
            android.util.Property<android.view.View, java.lang.Float> r5 = e1.o.f4223a
            r5 = 0
            r3.setTransitionVisibility(r5)
            r5 = r4
            e1.d r5 = (e1.d) r5
            java.lang.Object r0 = r0.get(r6)
            java.lang.Float r0 = (java.lang.Float) r0
            if (r0 == 0) goto L_0x028c
            float r10 = r0.floatValue()
            goto L_0x028d
        L_0x028c:
            r10 = r2
        L_0x028d:
            r0 = 0
            android.animation.ObjectAnimator r6 = r5.J(r3, r10, r0)
            if (r6 == 0) goto L_0x02a5
            e1.v$a r0 = new e1.v$a
            r1 = r18
            r0.<init>(r3, r1)
            r6.addListener(r0)
            r6.addPauseListener(r0)
        L_0x02a1:
            r4.a(r0)
            goto L_0x02aa
        L_0x02a5:
            r3.setTransitionVisibility(r1)
            goto L_0x02aa
        L_0x02a9:
            r6 = 0
        L_0x02aa:
            return r6
        L_0x02ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.v.k(android.view.ViewGroup, e1.n, e1.n):android.animation.Animator");
    }

    public final String[] p() {
        return D;
    }

    public final boolean r(n nVar, n nVar2) {
        if (nVar == null && nVar2 == null) {
            return false;
        }
        if (nVar != null && nVar2 != null && nVar2.f4220a.containsKey("android:visibility:visibility") != nVar.f4220a.containsKey("android:visibility:visibility")) {
            return false;
        }
        b I = I(nVar, nVar2);
        if (I.f4233a) {
            return I.f4235c == 0 || I.f4236d == 0;
        }
        return false;
    }
}
