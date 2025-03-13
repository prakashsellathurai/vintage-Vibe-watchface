package com.samsung.android.wearable.watchfacestudio.editor;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import u1.m;

public final class a0 extends RecyclerView.d<RecyclerView.a0> {

    /* renamed from: d  reason: collision with root package name */
    public final m f3872d;
    public final ArrayList e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public int f3873f;

    public static class a extends RecyclerView.a0 {

        /* renamed from: u  reason: collision with root package name */
        public m.h f3874u = null;

        public a(View view) {
            super(view);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a0(u1.e r4, u1.m r5) {
        /*
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.e = r0
            r3.f3872d = r5
            java.util.List<u1.m$h> r0 = r5.f7645f
            r4.getClass()
            java.util.Map<u1.m, u1.m$h> r4 = r4.f7613f
            java.lang.Object r4 = r4.get(r5)
            u1.m$h r4 = (u1.m.h) r4
            java.util.List<u1.m$h> r1 = r5.f7645f
            if (r4 != 0) goto L_0x0025
            int r4 = r5.f7646g
            java.lang.Object r4 = r1.get(r4)
            u1.m$h r4 = (u1.m.h) r4
        L_0x0025:
            int r4 = r0.indexOf(r4)
            r3.f3873f = r4
            java.util.Iterator r4 = r1.iterator()
            r5 = 0
        L_0x0030:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x008e
            java.lang.Object r0 = r4.next()
            u1.m$h r0 = (u1.m.h) r0
            java.util.ArrayList r1 = r3.e
            int r5 = r5 + 1
            boolean r2 = r0 instanceof u1.m.f.b
            if (r2 == 0) goto L_0x0064
            u1.m$f$b r0 = (u1.m.f.b) r0
            u1.c r2 = r0.f7686c
            java.lang.CharSequence r2 = r2.a()
            u1.c r0 = r0.f7687d
            if (r0 == 0) goto L_0x0055
            java.lang.CharSequence r0 = r0.a()
            goto L_0x0056
        L_0x0055:
            r0 = 0
        L_0x0056:
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = r0.toString()
            goto L_0x0076
        L_0x005d:
            if (r2 == 0) goto L_0x0074
            java.lang.String r0 = r2.toString()
            goto L_0x0076
        L_0x0064:
            boolean r2 = r0 instanceof u1.m.a.C0128a
            if (r2 == 0) goto L_0x0074
            u1.m$a$a r0 = (u1.m.a.C0128a) r0
            boolean r0 = r0.f7651c
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = "on"
            goto L_0x0076
        L_0x0071:
            java.lang.String r0 = "off"
            goto L_0x0076
        L_0x0074:
            java.lang.String r0 = ""
        L_0x0076:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x008a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "option"
            r0.<init>(r2)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
        L_0x008a:
            r1.add(r0)
            goto L_0x0030
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.android.wearable.watchfacestudio.editor.a0.<init>(u1.e, u1.m):void");
    }

    public final int c() {
        return this.f3872d.f7645f.size();
    }

    public final void f(RecyclerView.a0 a0Var, int i8) {
        ((a) a0Var).f3874u = this.f3872d.f7645f.get(i8);
    }

    public final RecyclerView.a0 g(ViewGroup viewGroup) {
        View view = new View(viewGroup.getContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return new a(view);
    }
}
