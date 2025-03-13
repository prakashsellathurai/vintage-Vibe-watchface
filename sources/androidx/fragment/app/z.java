package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class z implements LayoutInflater.Factory2 {

    /* renamed from: a  reason: collision with root package name */
    public final b0 f1363a;

    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h0 f1364a;

        public a(h0 h0Var) {
            this.f1364a = h0Var;
        }

        public final void onViewAttachedToWindow(View view) {
            h0 h0Var = this.f1364a;
            n nVar = h0Var.f1182c;
            h0Var.k();
            s0.f((ViewGroup) nVar.H.getParent(), z.this.f1363a).e();
        }

        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public z(b0 b0Var) {
        this.f1363a = b0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d1, code lost:
        if (androidx.fragment.app.b0.H(2) != false) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ef, code lost:
        if (androidx.fragment.app.b0.H(2) != false) goto L_0x00f1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.View r11, java.lang.String r12, android.content.Context r13, android.util.AttributeSet r14) {
        /*
            r10 = this;
            java.lang.Class<androidx.fragment.app.v> r0 = androidx.fragment.app.v.class
            java.lang.String r0 = r0.getName()
            boolean r0 = r0.equals(r12)
            androidx.fragment.app.b0 r1 = r10.f1363a
            if (r0 == 0) goto L_0x0014
            androidx.fragment.app.v r10 = new androidx.fragment.app.v
            r10.<init>(r13, r14, r1)
            return r10
        L_0x0014:
            java.lang.String r0 = "fragment"
            boolean r12 = r0.equals(r12)
            r0 = 0
            if (r12 != 0) goto L_0x001e
            return r0
        L_0x001e:
            java.lang.String r12 = "class"
            java.lang.String r12 = r14.getAttributeValue(r0, r12)
            int[] r2 = k3.j.f5151f
            android.content.res.TypedArray r2 = r13.obtainStyledAttributes(r14, r2)
            r3 = 0
            if (r12 != 0) goto L_0x0031
            java.lang.String r12 = r2.getString(r3)
        L_0x0031:
            r4 = 1
            r5 = -1
            int r6 = r2.getResourceId(r4, r5)
            r7 = 2
            java.lang.String r8 = r2.getString(r7)
            r2.recycle()
            if (r12 == 0) goto L_0x017b
            java.lang.ClassLoader r2 = r13.getClassLoader()
            java.lang.Class r2 = androidx.fragment.app.x.a(r2, r12)     // Catch:{ ClassNotFoundException -> 0x0050 }
            java.lang.Class<androidx.fragment.app.n> r9 = androidx.fragment.app.n.class
            boolean r2 = r9.isAssignableFrom(r2)     // Catch:{ ClassNotFoundException -> 0x0050 }
            goto L_0x0051
        L_0x0050:
            r2 = r3
        L_0x0051:
            if (r2 != 0) goto L_0x0055
            goto L_0x017b
        L_0x0055:
            if (r11 == 0) goto L_0x005b
            int r3 = r11.getId()
        L_0x005b:
            if (r3 != r5) goto L_0x0080
            if (r6 != r5) goto L_0x0080
            if (r8 == 0) goto L_0x0062
            goto L_0x0080
        L_0x0062:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = r14.getPositionDescription()
            r11.append(r13)
            java.lang.String r13 = ": Must specify unique android:id, android:tag, or have a parent with an id for "
            r11.append(r13)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x0080:
            if (r6 == r5) goto L_0x0087
            androidx.fragment.app.n r2 = r1.C(r6)
            goto L_0x0088
        L_0x0087:
            r2 = r0
        L_0x0088:
            if (r2 != 0) goto L_0x0090
            if (r8 == 0) goto L_0x0090
            androidx.fragment.app.n r2 = r1.D(r8)
        L_0x0090:
            if (r2 != 0) goto L_0x0098
            if (r3 == r5) goto L_0x0098
            androidx.fragment.app.n r2 = r1.C(r3)
        L_0x0098:
            if (r2 != 0) goto L_0x00d4
            androidx.fragment.app.x r2 = r1.F()
            r13.getClassLoader()
            androidx.fragment.app.b0$e r2 = (androidx.fragment.app.b0.e) r2
            androidx.fragment.app.b0 r13 = androidx.fragment.app.b0.this
            androidx.fragment.app.y<?> r13 = r13.f1114o
            android.content.Context r13 = r13.f1360b
            androidx.fragment.app.n r2 = androidx.fragment.app.n.instantiate(r13, r12, r0)
            r2.f1266n = r4
            if (r6 == 0) goto L_0x00b3
            r13 = r6
            goto L_0x00b4
        L_0x00b3:
            r13 = r3
        L_0x00b4:
            r2.w = r13
            r2.f1274x = r3
            r2.y = r8
            r2.f1267o = r4
            r2.f1270s = r1
            androidx.fragment.app.y<?> r13 = r1.f1114o
            r2.f1271t = r13
            android.content.Context r13 = r13.f1360b
            android.os.Bundle r0 = r2.f1255b
            r2.onInflate((android.content.Context) r13, (android.util.AttributeSet) r14, (android.os.Bundle) r0)
            androidx.fragment.app.h0 r13 = r1.a(r2)
            boolean r14 = androidx.fragment.app.b0.H(r7)
            if (r14 == 0) goto L_0x00f7
            goto L_0x00f1
        L_0x00d4:
            boolean r13 = r2.f1267o
            if (r13 != 0) goto L_0x013d
            r2.f1267o = r4
            r2.f1270s = r1
            androidx.fragment.app.y<?> r13 = r1.f1114o
            r2.f1271t = r13
            android.content.Context r13 = r13.f1360b
            android.os.Bundle r0 = r2.f1255b
            r2.onInflate((android.content.Context) r13, (android.util.AttributeSet) r14, (android.os.Bundle) r0)
            androidx.fragment.app.h0 r13 = r1.g(r2)
            boolean r14 = androidx.fragment.app.b0.H(r7)
            if (r14 == 0) goto L_0x00f7
        L_0x00f1:
            r2.toString()
            java.lang.Integer.toHexString(r6)
        L_0x00f7:
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            r2.G = r11
            r13.k()
            r13.j()
            android.view.View r11 = r2.H
            if (r11 == 0) goto L_0x0124
            if (r6 == 0) goto L_0x010a
            r11.setId(r6)
        L_0x010a:
            android.view.View r11 = r2.H
            java.lang.Object r11 = r11.getTag()
            if (r11 != 0) goto L_0x0117
            android.view.View r11 = r2.H
            r11.setTag(r8)
        L_0x0117:
            android.view.View r11 = r2.H
            androidx.fragment.app.z$a r12 = new androidx.fragment.app.z$a
            r12.<init>(r13)
            r11.addOnAttachStateChangeListener(r12)
            android.view.View r10 = r2.H
            return r10
        L_0x0124:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r13 = "Fragment "
            r11.<init>(r13)
            r11.append(r12)
            java.lang.String r12 = " did not create a view."
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x013d:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = r14.getPositionDescription()
            r11.append(r13)
            java.lang.String r13 = ": Duplicate id 0x"
            r11.append(r13)
            java.lang.String r13 = java.lang.Integer.toHexString(r6)
            r11.append(r13)
            java.lang.String r13 = ", tag "
            r11.append(r13)
            r11.append(r8)
            java.lang.String r13 = ", or parent id 0x"
            r11.append(r13)
            java.lang.String r13 = java.lang.Integer.toHexString(r3)
            r11.append(r13)
            java.lang.String r13 = " with another fragment for "
            r11.append(r13)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x017b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.z.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
