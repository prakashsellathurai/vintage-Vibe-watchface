package androidx.fragment.app;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import j0.s;

public final class t {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f1346a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f1347b;

        public a(Animator animator) {
            this.f1346a = null;
            this.f1347b = animator;
        }

        public a(Animation animation) {
            this.f1346a = animation;
            this.f1347b = null;
        }
    }

    public static class b extends AnimationSet implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final ViewGroup f1348f;

        /* renamed from: g  reason: collision with root package name */
        public final View f1349g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f1350h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f1351i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f1352j = true;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f1348f = viewGroup;
            this.f1349g = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public final boolean getTransformation(long j8, Transformation transformation) {
            this.f1352j = true;
            if (this.f1350h) {
                return !this.f1351i;
            }
            if (!super.getTransformation(j8, transformation)) {
                this.f1350h = true;
                s.a(this.f1348f, this);
            }
            return true;
        }

        public final boolean getTransformation(long j8, Transformation transformation, float f9) {
            this.f1352j = true;
            if (this.f1350h) {
                return !this.f1351i;
            }
            if (!super.getTransformation(j8, transformation, f9)) {
                this.f1350h = true;
                s.a(this.f1348f, this);
            }
            return true;
        }

        public final void run() {
            boolean z8 = this.f1350h;
            ViewGroup viewGroup = this.f1348f;
            if (z8 || !this.f1352j) {
                viewGroup.endViewTransition(this.f1349g);
                this.f1351i = true;
                return;
            }
            this.f1352j = false;
            viewGroup.post(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0047 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.fragment.app.t.a a(android.content.Context r5, androidx.fragment.app.n r6, boolean r7, boolean r8) {
        /*
            androidx.fragment.app.n$g r0 = r6.K
            r1 = 0
            if (r0 != 0) goto L_0x0007
            r2 = r1
            goto L_0x0009
        L_0x0007:
            int r2 = r0.f1286f
        L_0x0009:
            if (r8 == 0) goto L_0x001a
            if (r7 == 0) goto L_0x0014
            if (r0 != 0) goto L_0x0011
        L_0x000f:
            r8 = r1
            goto L_0x0027
        L_0x0011:
            int r8 = r0.f1285d
            goto L_0x0027
        L_0x0014:
            if (r0 != 0) goto L_0x0017
            goto L_0x000f
        L_0x0017:
            int r8 = r0.e
            goto L_0x0027
        L_0x001a:
            if (r7 == 0) goto L_0x0022
            if (r0 != 0) goto L_0x001f
            goto L_0x000f
        L_0x001f:
            int r8 = r0.f1283b
            goto L_0x0027
        L_0x0022:
            if (r0 != 0) goto L_0x0025
            goto L_0x000f
        L_0x0025:
            int r8 = r0.f1284c
        L_0x0027:
            r6.m(r1, r1, r1, r1)
            android.view.ViewGroup r0 = r6.G
            r3 = 0
            if (r0 == 0) goto L_0x003d
            r4 = -2146762248(0xffffffff800b01f8, float:-1.010897E-39)
            java.lang.Object r0 = r0.getTag(r4)
            if (r0 == 0) goto L_0x003d
            android.view.ViewGroup r0 = r6.G
            r0.setTag(r4, r3)
        L_0x003d:
            android.view.ViewGroup r0 = r6.G
            if (r0 == 0) goto L_0x0048
            android.animation.LayoutTransition r0 = r0.getLayoutTransition()
            if (r0 == 0) goto L_0x0048
            return r3
        L_0x0048:
            android.view.animation.Animation r0 = r6.onCreateAnimation(r2, r7, r8)
            if (r0 == 0) goto L_0x0054
            androidx.fragment.app.t$a r5 = new androidx.fragment.app.t$a
            r5.<init>((android.view.animation.Animation) r0)
            return r5
        L_0x0054:
            android.animation.Animator r6 = r6.onCreateAnimator(r2, r7, r8)
            if (r6 == 0) goto L_0x0060
            androidx.fragment.app.t$a r5 = new androidx.fragment.app.t$a
            r5.<init>((android.animation.Animator) r6)
            return r5
        L_0x0060:
            if (r8 != 0) goto L_0x0090
            if (r2 == 0) goto L_0x0090
            r6 = 4097(0x1001, float:5.741E-42)
            if (r2 == r6) goto L_0x0086
            r6 = 4099(0x1003, float:5.744E-42)
            if (r2 == r6) goto L_0x007c
            r6 = 8194(0x2002, float:1.1482E-41)
            if (r2 == r6) goto L_0x0072
            r6 = -1
            goto L_0x008f
        L_0x0072:
            if (r7 == 0) goto L_0x0078
            r6 = -2147352573(0xffffffff80020003, float:-1.83675E-40)
            goto L_0x008f
        L_0x0078:
            r6 = -2147352572(0xffffffff80020004, float:-1.83677E-40)
            goto L_0x008f
        L_0x007c:
            if (r7 == 0) goto L_0x0082
            r6 = -2147352571(0xffffffff80020005, float:-1.83678E-40)
            goto L_0x008f
        L_0x0082:
            r6 = -2147352570(0xffffffff80020006, float:-1.8368E-40)
            goto L_0x008f
        L_0x0086:
            if (r7 == 0) goto L_0x008c
            r6 = -2147352569(0xffffffff80020007, float:-1.83681E-40)
            goto L_0x008f
        L_0x008c:
            r6 = -2147352568(0xffffffff80020008, float:-1.83682E-40)
        L_0x008f:
            r8 = r6
        L_0x0090:
            if (r8 == 0) goto L_0x00d0
            android.content.res.Resources r6 = r5.getResources()
            java.lang.String r6 = r6.getResourceTypeName(r8)
            java.lang.String r7 = "anim"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x00b2
            android.view.animation.Animation r7 = android.view.animation.AnimationUtils.loadAnimation(r5, r8)     // Catch:{ NotFoundException -> 0x00b0, RuntimeException -> 0x00b2 }
            if (r7 == 0) goto L_0x00ae
            androidx.fragment.app.t$a r0 = new androidx.fragment.app.t$a     // Catch:{ NotFoundException -> 0x00b0, RuntimeException -> 0x00b2 }
            r0.<init>((android.view.animation.Animation) r7)     // Catch:{ NotFoundException -> 0x00b0, RuntimeException -> 0x00b2 }
            return r0
        L_0x00ae:
            r1 = 1
            goto L_0x00b2
        L_0x00b0:
            r5 = move-exception
            throw r5
        L_0x00b2:
            if (r1 != 0) goto L_0x00d0
            android.animation.Animator r7 = android.animation.AnimatorInflater.loadAnimator(r5, r8)     // Catch:{ RuntimeException -> 0x00c0 }
            if (r7 == 0) goto L_0x00d0
            androidx.fragment.app.t$a r0 = new androidx.fragment.app.t$a     // Catch:{ RuntimeException -> 0x00c0 }
            r0.<init>((android.animation.Animator) r7)     // Catch:{ RuntimeException -> 0x00c0 }
            return r0
        L_0x00c0:
            r7 = move-exception
            if (r6 != 0) goto L_0x00cf
            android.view.animation.Animation r5 = android.view.animation.AnimationUtils.loadAnimation(r5, r8)
            if (r5 == 0) goto L_0x00d0
            androidx.fragment.app.t$a r6 = new androidx.fragment.app.t$a
            r6.<init>((android.view.animation.Animation) r5)
            return r6
        L_0x00cf:
            throw r7
        L_0x00d0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.t.a(android.content.Context, androidx.fragment.app.n, boolean, boolean):androidx.fragment.app.t$a");
    }
}
