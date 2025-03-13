package e1;

import android.animation.AnimatorListenerAdapter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import j0.x;
import java.util.HashMap;

public final class b extends h {
    public static final String[] C = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final Property<i, PointF> D = new C0050b();
    public static final Property<i, PointF> E = new c();
    public static final Property<View, PointF> F = new d();
    public static final Property<View, PointF> G = new e();
    public static final Property<View, PointF> H = new f();

    public static class a extends Property<Drawable, PointF> {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f4166a = new Rect();

        public a() {
            super(PointF.class, "boundsOrigin");
        }

        public final Object get(Object obj) {
            Rect rect = this.f4166a;
            ((Drawable) obj).copyBounds(rect);
            return new PointF((float) rect.left, (float) rect.top);
        }

        public final void set(Object obj, Object obj2) {
            Drawable drawable = (Drawable) obj;
            PointF pointF = (PointF) obj2;
            Rect rect = this.f4166a;
            drawable.copyBounds(rect);
            rect.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(rect);
        }
    }

    /* renamed from: e1.b$b  reason: collision with other inner class name */
    public static class C0050b extends Property<i, PointF> {
        public C0050b() {
            super(PointF.class, "topLeft");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            i iVar = (i) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            i iVar = (i) obj;
            PointF pointF = (PointF) obj2;
            iVar.getClass();
            iVar.f4169a = Math.round(pointF.x);
            int round = Math.round(pointF.y);
            iVar.f4170b = round;
            int i8 = iVar.f4173f + 1;
            iVar.f4173f = i8;
            if (i8 == iVar.f4174g) {
                int i9 = iVar.f4169a;
                int i10 = iVar.f4171c;
                int i11 = iVar.f4172d;
                Property<View, Float> property = o.f4223a;
                iVar.e.setLeftTopRightBottom(i9, round, i10, i11);
                iVar.f4173f = 0;
                iVar.f4174g = 0;
            }
        }
    }

    public static class c extends Property<i, PointF> {
        public c() {
            super(PointF.class, "bottomRight");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            i iVar = (i) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            i iVar = (i) obj;
            PointF pointF = (PointF) obj2;
            iVar.getClass();
            iVar.f4171c = Math.round(pointF.x);
            int round = Math.round(pointF.y);
            iVar.f4172d = round;
            int i8 = iVar.f4174g + 1;
            iVar.f4174g = i8;
            if (iVar.f4173f == i8) {
                int i9 = iVar.f4169a;
                int i10 = iVar.f4170b;
                int i11 = iVar.f4171c;
                Property<View, Float> property = o.f4223a;
                iVar.e.setLeftTopRightBottom(i9, i10, i11, round);
                iVar.f4173f = 0;
                iVar.f4174g = 0;
            }
        }
    }

    public static class d extends Property<View, PointF> {
        public d() {
            super(PointF.class, "bottomRight");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            int left = view.getLeft();
            int top = view.getTop();
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            Property<View, Float> property = o.f4223a;
            view.setLeftTopRightBottom(left, top, round, round2);
        }
    }

    public static class e extends Property<View, PointF> {
        public e() {
            super(PointF.class, "topLeft");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            int right = view.getRight();
            int bottom = view.getBottom();
            Property<View, Float> property = o.f4223a;
            view.setLeftTopRightBottom(round, round2, right, bottom);
        }
    }

    public static class f extends Property<View, PointF> {
        public f() {
            super(PointF.class, "position");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            Property<View, Float> property = o.f4223a;
            view.setLeftTopRightBottom(round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    public class g extends AnimatorListenerAdapter {
        private i mViewBounds;

        public g(i iVar) {
            this.mViewBounds = iVar;
        }
    }

    public class h extends k {

        /* renamed from: a  reason: collision with root package name */
        public boolean f4167a = false;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f4168b;

        public h(ViewGroup viewGroup) {
            this.f4168b = viewGroup;
        }

        public final void b() {
            this.f4168b.suppressLayout(false);
        }

        public final void c() {
            this.f4168b.suppressLayout(true);
        }

        public final void d() {
            this.f4168b.suppressLayout(false);
            this.f4167a = true;
        }

        public final void e(h hVar) {
            if (!this.f4167a) {
                this.f4168b.suppressLayout(false);
            }
            hVar.v(this);
        }
    }

    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public int f4169a;

        /* renamed from: b  reason: collision with root package name */
        public int f4170b;

        /* renamed from: c  reason: collision with root package name */
        public int f4171c;

        /* renamed from: d  reason: collision with root package name */
        public int f4172d;
        public final View e;

        /* renamed from: f  reason: collision with root package name */
        public int f4173f;

        /* renamed from: g  reason: collision with root package name */
        public int f4174g;

        public i(View view) {
            this.e = view;
        }
    }

    static {
        new a();
    }

    public final void H(n nVar) {
        int[] iArr = x.f4957a;
        View view = nVar.f4221b;
        if (x.f.c(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            HashMap hashMap = nVar.f4220a;
            hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            hashMap.put("android:changeBounds:parent", view.getParent());
        }
    }

    public final void d(n nVar) {
        H(nVar);
    }

    public final void g(n nVar) {
        H(nVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: android.animation.ObjectAnimator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator k(android.view.ViewGroup r19, e1.n r20, e1.n r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            if (r1 == 0) goto L_0x0126
            if (r2 != 0) goto L_0x000c
            goto L_0x0126
        L_0x000c:
            java.util.HashMap r1 = r1.f4220a
            java.util.HashMap r4 = r2.f4220a
            java.lang.String r5 = "android:changeBounds:parent"
            java.lang.Object r6 = r1.get(r5)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            java.lang.Object r5 = r4.get(r5)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            if (r6 == 0) goto L_0x0124
            if (r5 != 0) goto L_0x0024
            goto L_0x0124
        L_0x0024:
            java.lang.String r5 = "android:changeBounds:bounds"
            java.lang.Object r6 = r1.get(r5)
            android.graphics.Rect r6 = (android.graphics.Rect) r6
            java.lang.Object r5 = r4.get(r5)
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            int r7 = r6.left
            int r8 = r5.left
            int r9 = r6.top
            int r10 = r5.top
            int r11 = r6.right
            int r12 = r5.right
            int r6 = r6.bottom
            int r5 = r5.bottom
            int r13 = r11 - r7
            int r14 = r6 - r9
            int r15 = r12 - r8
            int r3 = r5 - r10
            java.lang.String r0 = "android:changeBounds:clip"
            java.lang.Object r1 = r1.get(r0)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            java.lang.Object r0 = r4.get(r0)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r4 = 1
            if (r13 == 0) goto L_0x005d
            if (r14 != 0) goto L_0x0061
        L_0x005d:
            if (r15 == 0) goto L_0x0072
            if (r3 == 0) goto L_0x0072
        L_0x0061:
            if (r7 != r8) goto L_0x0069
            if (r9 == r10) goto L_0x0066
            goto L_0x0069
        L_0x0066:
            r16 = 0
            goto L_0x006b
        L_0x0069:
            r16 = r4
        L_0x006b:
            if (r11 != r12) goto L_0x006f
            if (r6 == r5) goto L_0x0074
        L_0x006f:
            int r16 = r16 + 1
            goto L_0x0074
        L_0x0072:
            r16 = 0
        L_0x0074:
            if (r1 == 0) goto L_0x007c
            boolean r17 = r1.equals(r0)
            if (r17 == 0) goto L_0x0080
        L_0x007c:
            if (r1 != 0) goto L_0x0082
            if (r0 == 0) goto L_0x0082
        L_0x0080:
            int r16 = r16 + 1
        L_0x0082:
            r0 = r16
            if (r0 <= 0) goto L_0x0122
            android.util.Property<android.view.View, java.lang.Float> r1 = e1.o.f4223a
            android.view.View r1 = r2.f4221b
            r1.setLeftTopRightBottom(r7, r9, r11, r6)
            r2 = 2
            if (r0 != r2) goto L_0x00e3
            if (r13 != r15) goto L_0x00a3
            if (r14 != r3) goto L_0x00a3
            r0 = r18
            androidx.fragment.app.u r2 = r0.y
            float r3 = (float) r7
            float r5 = (float) r9
            float r6 = (float) r8
            float r7 = (float) r10
            android.graphics.Path r2 = r2.d(r3, r5, r6, r7)
            android.util.Property<android.view.View, android.graphics.PointF> r3 = H
            goto L_0x0103
        L_0x00a3:
            r0 = r18
            e1.b$i r3 = new e1.b$i
            r3.<init>(r1)
            androidx.fragment.app.u r13 = r0.y
            float r7 = (float) r7
            float r9 = (float) r9
            float r8 = (float) r8
            float r10 = (float) r10
            android.graphics.Path r7 = r13.d(r7, r9, r8, r10)
            android.util.Property<e1.b$i, android.graphics.PointF> r8 = D
            r9 = 0
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofObject(r3, r8, r9, r7)
            androidx.fragment.app.u r8 = r0.y
            float r10 = (float) r11
            float r6 = (float) r6
            float r11 = (float) r12
            float r5 = (float) r5
            android.graphics.Path r5 = r8.d(r10, r6, r11, r5)
            android.util.Property<e1.b$i, android.graphics.PointF> r6 = E
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofObject(r3, r6, r9, r5)
            android.animation.AnimatorSet r6 = new android.animation.AnimatorSet
            r6.<init>()
            android.animation.Animator[] r2 = new android.animation.Animator[r2]
            r8 = 0
            r2[r8] = r7
            r2[r4] = r5
            r6.playTogether(r2)
            e1.b$g r2 = new e1.b$g
            r2.<init>(r3)
            r6.addListener(r2)
            goto L_0x0108
        L_0x00e3:
            r0 = r18
            if (r7 != r8) goto L_0x00f7
            if (r9 == r10) goto L_0x00ea
            goto L_0x00f7
        L_0x00ea:
            androidx.fragment.app.u r2 = r0.y
            float r3 = (float) r11
            float r6 = (float) r6
            float r7 = (float) r12
            float r5 = (float) r5
            android.graphics.Path r2 = r2.d(r3, r6, r7, r5)
            android.util.Property<android.view.View, android.graphics.PointF> r3 = F
            goto L_0x0103
        L_0x00f7:
            androidx.fragment.app.u r2 = r0.y
            float r3 = (float) r7
            float r5 = (float) r9
            float r6 = (float) r8
            float r7 = (float) r10
            android.graphics.Path r2 = r2.d(r3, r5, r6, r7)
            android.util.Property<android.view.View, android.graphics.PointF> r3 = G
        L_0x0103:
            r5 = 0
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofObject(r1, r3, r5, r2)
        L_0x0108:
            android.view.ViewParent r2 = r1.getParent()
            boolean r2 = r2 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x0121
            android.view.ViewParent r1 = r1.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.suppressLayout(r4)
            e1.b$h r2 = new e1.b$h
            r2.<init>(r1)
            r0.a(r2)
        L_0x0121:
            return r6
        L_0x0122:
            r0 = 0
            return r0
        L_0x0124:
            r0 = 0
            return r0
        L_0x0126:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.b.k(android.view.ViewGroup, e1.n, e1.n):android.animation.Animator");
    }

    public final String[] p() {
        return C;
    }
}
