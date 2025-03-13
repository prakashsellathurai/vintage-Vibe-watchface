package androidx.fragment.app;

import android.content.Context;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.s0;
import androidx.fragment.app.t;
import j0.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import p.a;
import p.f;

public final class l extends s0 {

    public static class a extends b {

        /* renamed from: c  reason: collision with root package name */
        public final boolean f1217c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1218d = false;
        public t.a e;

        public a(s0.d dVar, f0.a aVar, boolean z8) {
            super(dVar, aVar);
            this.f1217c = z8;
        }

        public final t.a c(Context context) {
            if (this.f1218d) {
                return this.e;
            }
            s0.d dVar = this.f1219a;
            t.a a9 = t.a(context, dVar.f1332c, dVar.f1330a == s0.d.c.f1342g, this.f1217c);
            this.e = a9;
            this.f1218d = true;
            return a9;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final s0.d f1219a;

        /* renamed from: b  reason: collision with root package name */
        public final f0.a f1220b;

        public b(s0.d dVar, f0.a aVar) {
            this.f1219a = dVar;
            this.f1220b = aVar;
        }

        public final void a() {
            s0.d dVar = this.f1219a;
            HashSet<f0.a> hashSet = dVar.e;
            if (hashSet.remove(this.f1220b) && hashSet.isEmpty()) {
                dVar.b();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
            r1 = androidx.fragment.app.s0.d.c.f1342g;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean b() {
            /*
                r2 = this;
                androidx.fragment.app.s0$d r2 = r2.f1219a
                androidx.fragment.app.n r0 = r2.f1332c
                android.view.View r0 = r0.H
                androidx.fragment.app.s0$d$c r0 = androidx.fragment.app.s0.d.c.g(r0)
                androidx.fragment.app.s0$d$c r2 = r2.f1330a
                if (r0 == r2) goto L_0x0017
                androidx.fragment.app.s0$d$c r1 = androidx.fragment.app.s0.d.c.f1342g
                if (r0 == r1) goto L_0x0015
                if (r2 == r1) goto L_0x0015
                goto L_0x0017
            L_0x0015:
                r2 = 0
                goto L_0x0018
            L_0x0017:
                r2 = 1
            L_0x0018:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.l.b.b():boolean");
        }
    }

    public static class c extends b {

        /* renamed from: c  reason: collision with root package name */
        public final Object f1221c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f1222d;
        public final Object e;

        public c(s0.d dVar, f0.a aVar, boolean z8, boolean z9) {
            super(dVar, aVar);
            boolean z10;
            s0.d.c cVar = dVar.f1330a;
            s0.d.c cVar2 = s0.d.c.f1342g;
            n nVar = dVar.f1332c;
            if (cVar == cVar2) {
                this.f1221c = z8 ? nVar.getReenterTransition() : nVar.getEnterTransition();
                z10 = z8 ? nVar.getAllowReturnTransitionOverlap() : nVar.getAllowEnterTransitionOverlap();
            } else {
                this.f1221c = z8 ? nVar.getReturnTransition() : nVar.getExitTransition();
                z10 = true;
            }
            this.f1222d = z10;
            this.e = z9 ? z8 ? nVar.getSharedElementReturnTransition() : nVar.getSharedElementEnterTransition() : null;
        }

        public final p0 c(Object obj) {
            if (obj == null) {
                return null;
            }
            m0 m0Var = k0.f1215a;
            if (m0Var != null && (obj instanceof Transition)) {
                return m0Var;
            }
            p0 p0Var = k0.f1216b;
            if (p0Var != null && p0Var.e(obj)) {
                return p0Var;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f1219a.f1332c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public l(ViewGroup viewGroup) {
        super(viewGroup);
    }

    public static void j(ArrayList arrayList, View view) {
        if (view instanceof ViewGroup) {
            if (!arrayList.contains(view)) {
                int[] iArr = x.f4957a;
                if (x.h.k(view) != null) {
                    arrayList.add(view);
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = viewGroup.getChildAt(i8);
                if (childAt.getVisibility() == 0) {
                    j(arrayList, childAt);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public static void k(Map map, View view) {
        int[] iArr = x.f4957a;
        String k8 = x.h.k(view);
        if (k8 != null) {
            ((f) map).put(k8, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = viewGroup.getChildAt(i8);
                if (childAt.getVisibility() == 0) {
                    k(map, childAt);
                }
            }
        }
    }

    public static void l(p.a aVar, Collection collection) {
        Iterator it = ((a.C0101a) aVar.entrySet()).iterator();
        while (true) {
            a.d dVar = (a.d) it;
            if (dVar.hasNext()) {
                dVar.next();
                int[] iArr = x.f4957a;
                if (!collection.contains(x.h.k((View) dVar.getValue()))) {
                    dVar.remove();
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:219:0x058d, code lost:
        if (androidx.fragment.app.b0.H(2) != false) goto L_0x0599;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0597, code lost:
        if (androidx.fragment.app.b0.H(2) != false) goto L_0x0599;
     */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x04f7  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x057c  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x05e3 A[LOOP:14: B:232:0x05dd->B:234:0x05e3, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.util.ArrayList r34, boolean r35) {
        /*
            r33 = this;
            r0 = r33
            r1 = r35
            java.util.Iterator r2 = r34.iterator()
            r4 = 0
            r5 = 0
        L_0x000a:
            boolean r6 = r2.hasNext()
            androidx.fragment.app.s0$d$c r7 = androidx.fragment.app.s0.d.c.f1342g
            r8 = 2
            r9 = 1
            if (r6 == 0) goto L_0x003c
            java.lang.Object r6 = r2.next()
            androidx.fragment.app.s0$d r6 = (androidx.fragment.app.s0.d) r6
            androidx.fragment.app.n r10 = r6.f1332c
            android.view.View r10 = r10.H
            androidx.fragment.app.s0$d$c r10 = androidx.fragment.app.s0.d.c.g(r10)
            androidx.fragment.app.s0$d$c r11 = r6.f1330a
            int r11 = r11.ordinal()
            if (r11 == 0) goto L_0x0036
            if (r11 == r9) goto L_0x0032
            if (r11 == r8) goto L_0x0036
            r8 = 3
            if (r11 == r8) goto L_0x0036
            goto L_0x000a
        L_0x0032:
            if (r10 == r7) goto L_0x000a
            r5 = r6
            goto L_0x000a
        L_0x0036:
            if (r10 != r7) goto L_0x000a
            if (r4 != 0) goto L_0x000a
            r4 = r6
            goto L_0x000a
        L_0x003c:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = r34
            r10.<init>(r11)
            java.util.Iterator r11 = r34.iterator()
        L_0x0051:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x009c
            java.lang.Object r12 = r11.next()
            androidx.fragment.app.s0$d r12 = (androidx.fragment.app.s0.d) r12
            f0.a r14 = new f0.a
            r14.<init>()
            r12.d()
            java.util.HashSet<f0.a> r15 = r12.e
            r15.add(r14)
            androidx.fragment.app.l$a r15 = new androidx.fragment.app.l$a
            r15.<init>(r12, r14, r1)
            r2.add(r15)
            f0.a r14 = new f0.a
            r14.<init>()
            r12.d()
            java.util.HashSet<f0.a> r15 = r12.e
            r15.add(r14)
            androidx.fragment.app.l$c r15 = new androidx.fragment.app.l$c
            if (r1 == 0) goto L_0x0086
            if (r12 != r4) goto L_0x008a
            goto L_0x0088
        L_0x0086:
            if (r12 != r5) goto L_0x008a
        L_0x0088:
            r13 = r9
            goto L_0x008b
        L_0x008a:
            r13 = 0
        L_0x008b:
            r15.<init>(r12, r14, r1, r13)
            r6.add(r15)
            androidx.fragment.app.c r13 = new androidx.fragment.app.c
            r13.<init>(r0, r10, r12)
            java.util.ArrayList r12 = r12.f1333d
            r12.add(r13)
            goto L_0x0051
        L_0x009c:
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.Iterator r12 = r6.iterator()
            r15 = 0
        L_0x00a6:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x0131
            java.lang.Object r14 = r12.next()
            androidx.fragment.app.l$c r14 = (androidx.fragment.app.l.c) r14
            boolean r16 = r14.b()
            if (r16 == 0) goto L_0x00be
            r22 = r2
            r16 = r12
            goto L_0x0129
        L_0x00be:
            java.lang.Object r9 = r14.f1221c
            androidx.fragment.app.p0 r8 = r14.c(r9)
            java.lang.Object r3 = r14.e
            androidx.fragment.app.p0 r13 = r14.c(r3)
            r16 = r12
            java.lang.String r12 = " returned Transition "
            r22 = r2
            java.lang.String r2 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
            androidx.fragment.app.s0$d r14 = r14.f1219a
            if (r8 == 0) goto L_0x00fd
            if (r13 == 0) goto L_0x00fd
            if (r8 != r13) goto L_0x00db
            goto L_0x00fd
        L_0x00db:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            androidx.fragment.app.n r2 = r14.f1332c
            r1.append(r2)
            r1.append(r12)
            r1.append(r9)
            java.lang.String r2 = " which uses a different Transition  type than its shared element transition "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00fd:
            if (r8 == 0) goto L_0x0100
            goto L_0x0101
        L_0x0100:
            r8 = r13
        L_0x0101:
            if (r15 != 0) goto L_0x0105
            r15 = r8
            goto L_0x0129
        L_0x0105:
            if (r8 == 0) goto L_0x0129
            if (r15 != r8) goto L_0x010a
            goto L_0x0129
        L_0x010a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            androidx.fragment.app.n r2 = r14.f1332c
            r1.append(r2)
            r1.append(r12)
            r1.append(r9)
            java.lang.String r2 = " which uses a different Transition  type than other Fragments."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0129:
            r12 = r16
            r2 = r22
            r8 = 2
            r9 = 1
            goto L_0x00a6
        L_0x0131:
            r22 = r2
            androidx.fragment.app.s0$d$c r2 = androidx.fragment.app.s0.d.c.f1343h
            android.view.ViewGroup r0 = r0.f1321a
            if (r15 != 0) goto L_0x015b
            java.util.Iterator r1 = r6.iterator()
        L_0x013d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0154
            java.lang.Object r3 = r1.next()
            androidx.fragment.app.l$c r3 = (androidx.fragment.app.l.c) r3
            androidx.fragment.app.s0$d r4 = r3.f1219a
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r11.put(r4, r5)
            r3.a()
            goto L_0x013d
        L_0x0154:
            r28 = r2
            r25 = r10
        L_0x0158:
            r7 = 0
            goto L_0x04dd
        L_0x015b:
            android.view.View r3 = new android.view.View
            android.content.Context r8 = r0.getContext()
            r3.<init>(r8)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            p.a r13 = new p.a
            r13.<init>()
            java.util.Iterator r23 = r6.iterator()
            r14 = r5
            r24 = r7
            r25 = r10
            r10 = 0
            r26 = 0
            r27 = 0
            r7 = r4
        L_0x0187:
            boolean r16 = r23.hasNext()
            if (r16 == 0) goto L_0x034d
            java.lang.Object r16 = r23.next()
            r28 = r2
            r2 = r16
            androidx.fragment.app.l$c r2 = (androidx.fragment.app.l.c) r2
            java.lang.Object r2 = r2.e
            if (r2 == 0) goto L_0x019e
            r16 = 1
            goto L_0x01a0
        L_0x019e:
            r16 = 0
        L_0x01a0:
            if (r16 == 0) goto L_0x033f
            if (r7 == 0) goto L_0x033f
            if (r14 == 0) goto L_0x033f
            java.lang.Object r2 = r15.f(r2)
            java.lang.Object r2 = r15.t(r2)
            androidx.fragment.app.n r10 = r14.f1332c
            androidx.fragment.app.n$g r14 = r10.K
            if (r14 == 0) goto L_0x01b8
            java.util.ArrayList<java.lang.String> r14 = r14.f1287g
            if (r14 != 0) goto L_0x01bd
        L_0x01b8:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x01bd:
            androidx.fragment.app.n r7 = r7.f1332c
            r29 = r6
            androidx.fragment.app.n$g r6 = r7.K
            if (r6 == 0) goto L_0x01c9
            java.util.ArrayList<java.lang.String> r6 = r6.f1287g
            if (r6 != 0) goto L_0x01ce
        L_0x01c9:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x01ce:
            r30 = r11
            androidx.fragment.app.n$g r11 = r7.K
            if (r11 == 0) goto L_0x01d8
            java.util.ArrayList<java.lang.String> r11 = r11.f1288h
            if (r11 != 0) goto L_0x01dd
        L_0x01d8:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
        L_0x01dd:
            r33 = r3
            r31 = r8
            r3 = 0
        L_0x01e2:
            int r8 = r11.size()
            r32 = r2
            r2 = -1
            if (r3 >= r8) goto L_0x0201
            java.lang.Object r8 = r11.get(r3)
            int r8 = r14.indexOf(r8)
            if (r8 == r2) goto L_0x01fc
            java.lang.Object r2 = r6.get(r3)
            r14.set(r8, r2)
        L_0x01fc:
            int r3 = r3 + 1
            r2 = r32
            goto L_0x01e2
        L_0x0201:
            androidx.fragment.app.n$g r3 = r10.K
            if (r3 == 0) goto L_0x0209
            java.util.ArrayList<java.lang.String> r3 = r3.f1288h
            if (r3 != 0) goto L_0x020e
        L_0x0209:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x020e:
            int r6 = r14.size()
            r8 = 0
        L_0x0213:
            if (r8 >= r6) goto L_0x022a
            java.lang.Object r11 = r14.get(r8)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r16 = r3.get(r8)
            r2 = r16
            java.lang.String r2 = (java.lang.String) r2
            r13.put(r11, r2)
            int r8 = r8 + 1
            r2 = -1
            goto L_0x0213
        L_0x022a:
            p.a r2 = new p.a
            r2.<init>()
            android.view.View r6 = r7.H
            k(r2, r6)
            r2.m(r14)
            java.util.Set r6 = r2.keySet()
            r13.m(r6)
            p.a r6 = new p.a
            r6.<init>()
            android.view.View r8 = r10.H
            k(r6, r8)
            r6.m(r3)
            java.util.Collection r8 = r13.values()
            r6.m(r8)
            androidx.fragment.app.m0 r8 = androidx.fragment.app.k0.f1215a
            int r8 = r13.f6235h
        L_0x0256:
            r11 = -1
            int r8 = r8 + r11
            if (r8 < 0) goto L_0x026c
            java.lang.Object r16 = r13.l(r8)
            r11 = r16
            java.lang.String r11 = (java.lang.String) r11
            boolean r11 = r6.containsKey(r11)
            if (r11 != 0) goto L_0x0256
            r13.j(r8)
            goto L_0x0256
        L_0x026c:
            java.util.Set r8 = r13.keySet()
            l(r2, r8)
            java.util.Collection r8 = r13.values()
            l(r6, r8)
            boolean r8 = r13.isEmpty()
            if (r8 == 0) goto L_0x0292
            r9.clear()
            r12.clear()
            r2 = r33
            r7 = r4
            r14 = r5
            r3 = r15
            r11 = r30
            r6 = r31
            r10 = 0
            goto L_0x0344
        L_0x0292:
            androidx.fragment.app.k0.a(r10, r7, r1)
            androidx.fragment.app.h r7 = new androidx.fragment.app.h
            r7.<init>(r5, r4, r1, r6)
            j0.s.a(r0, r7)
            java.util.Collection r7 = r2.values()
            p.a$e r7 = (p.a.e) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x02a7:
            r8 = r7
            p.c r8 = (p.c) r8
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x02ba
            java.lang.Object r8 = r8.next()
            android.view.View r8 = (android.view.View) r8
            j(r9, r8)
            goto L_0x02a7
        L_0x02ba:
            boolean r7 = r14.isEmpty()
            if (r7 != 0) goto L_0x02d6
            r7 = 0
            java.lang.Object r8 = r14.get(r7)
            java.lang.String r8 = (java.lang.String) r8
            r7 = 0
            java.lang.Object r2 = r2.getOrDefault(r8, r7)
            android.view.View r2 = (android.view.View) r2
            r7 = r32
            r15.n(r2, r7)
            r26 = r2
            goto L_0x02d8
        L_0x02d6:
            r7 = r32
        L_0x02d8:
            java.util.Collection r2 = r6.values()
            p.a$e r2 = (p.a.e) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x02e2:
            r8 = r2
            p.c r8 = (p.c) r8
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x02f5
            java.lang.Object r8 = r8.next()
            android.view.View r8 = (android.view.View) r8
            j(r12, r8)
            goto L_0x02e2
        L_0x02f5:
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x0318
            r2 = 0
            java.lang.Object r3 = r3.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            r2 = 0
            java.lang.Object r3 = r6.getOrDefault(r3, r2)
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L_0x0318
            androidx.fragment.app.i r2 = new androidx.fragment.app.i
            r6 = r31
            r2.<init>(r15, r3, r6)
            j0.s.a(r0, r2)
            r27 = 1
            goto L_0x031a
        L_0x0318:
            r6 = r31
        L_0x031a:
            r2 = r33
            r15.r(r7, r2, r9)
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r14 = r15
            r3 = r15
            r15 = r7
            r20 = r7
            r21 = r12
            r14.m(r15, r16, r17, r18, r19, r20, r21)
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r11 = r30
            r11.put(r4, r8)
            r11.put(r5, r8)
            r14 = r5
            r10 = r7
            r7 = r4
            goto L_0x0344
        L_0x033f:
            r2 = r3
            r29 = r6
            r6 = r8
            r3 = r15
        L_0x0344:
            r15 = r3
            r8 = r6
            r6 = r29
            r3 = r2
            r2 = r28
            goto L_0x0187
        L_0x034d:
            r28 = r2
            r2 = r3
            r29 = r6
            r6 = r8
            r3 = r15
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r4 = r29.iterator()
            r8 = 0
            r15 = 0
        L_0x035f:
            boolean r16 = r4.hasNext()
            if (r16 == 0) goto L_0x0462
            java.lang.Object r16 = r4.next()
            r33 = r4
            r4 = r16
            androidx.fragment.app.l$c r4 = (androidx.fragment.app.l.c) r4
            boolean r16 = r4.b()
            r23 = r13
            androidx.fragment.app.s0$d r13 = r4.f1219a
            r35 = r15
            if (r16 == 0) goto L_0x0392
            java.lang.Boolean r15 = java.lang.Boolean.FALSE
            r11.put(r13, r15)
            r4.a()
            r16 = r2
            r30 = r5
            r31 = r10
            r15 = r24
            r2 = r26
            r4 = 0
            r5 = r35
            goto L_0x0451
        L_0x0392:
            java.lang.Object r15 = r4.f1221c
            java.lang.Object r15 = r3.f(r15)
            if (r10 == 0) goto L_0x03a0
            if (r13 == r7) goto L_0x039e
            if (r13 != r14) goto L_0x03a0
        L_0x039e:
            r14 = 1
            goto L_0x03a1
        L_0x03a0:
            r14 = 0
        L_0x03a1:
            if (r15 != 0) goto L_0x03bc
            if (r14 != 0) goto L_0x03ad
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            r11.put(r13, r14)
            r4.a()
        L_0x03ad:
            r16 = r2
            r30 = r5
            r31 = r10
            r15 = r24
            r2 = r26
            r4 = 0
            r5 = r35
            goto L_0x044f
        L_0x03bc:
            r30 = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r31 = r10
            androidx.fragment.app.n r10 = r13.f1332c
            android.view.View r10 = r10.H
            j(r5, r10)
            if (r14 == 0) goto L_0x03d7
            if (r13 != r7) goto L_0x03d4
            r5.removeAll(r9)
            goto L_0x03d7
        L_0x03d4:
            r5.removeAll(r12)
        L_0x03d7:
            boolean r10 = r5.isEmpty()
            if (r10 == 0) goto L_0x03e8
            r3.a(r2, r15)
            r10 = r35
            r16 = r2
            r14 = r15
            r15 = r28
            goto L_0x0422
        L_0x03e8:
            r3.b(r15, r5)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r14 = r3
            r10 = r35
            r35 = r15
            r16 = r35
            r17 = r5
            r14.m(r15, r16, r17, r18, r19, r20, r21)
            androidx.fragment.app.s0$d$c r14 = r13.f1330a
            r15 = r28
            if (r14 != r15) goto L_0x041e
            r14 = r25
            r14.remove(r13)
            r16 = r2
            androidx.fragment.app.n r2 = r13.f1332c
            android.view.View r2 = r2.H
            r14 = r35
            r3.l(r14, r2, r5)
            androidx.fragment.app.j r2 = new androidx.fragment.app.j
            r2.<init>(r5)
            j0.s.a(r0, r2)
            goto L_0x0422
        L_0x041e:
            r14 = r35
            r16 = r2
        L_0x0422:
            androidx.fragment.app.s0$d$c r2 = r13.f1330a
            r28 = r15
            r15 = r24
            if (r2 != r15) goto L_0x0435
            r1.addAll(r5)
            if (r27 == 0) goto L_0x0432
            r3.o(r14, r6)
        L_0x0432:
            r2 = r26
            goto L_0x043a
        L_0x0435:
            r2 = r26
            r3.n(r2, r14)
        L_0x043a:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r11.put(r13, r5)
            boolean r4 = r4.f1222d
            if (r4 == 0) goto L_0x044a
            r4 = 0
            java.lang.Object r8 = r3.j(r8, r14, r4)
            r5 = r10
            goto L_0x044f
        L_0x044a:
            r4 = 0
            java.lang.Object r5 = r3.j(r10, r14, r4)
        L_0x044f:
            r14 = r30
        L_0x0451:
            r4 = r33
            r26 = r2
            r24 = r15
            r2 = r16
            r13 = r23
            r10 = r31
            r15 = r5
            r5 = r30
            goto L_0x035f
        L_0x0462:
            r30 = r5
            r5 = r10
            r23 = r13
            r10 = r15
            java.lang.Object r2 = r3.i(r8, r10, r5)
            java.util.Iterator r4 = r29.iterator()
        L_0x0470:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x04bc
            java.lang.Object r6 = r4.next()
            androidx.fragment.app.l$c r6 = (androidx.fragment.app.l.c) r6
            boolean r8 = r6.b()
            if (r8 == 0) goto L_0x0483
            goto L_0x0470
        L_0x0483:
            androidx.fragment.app.s0$d r8 = r6.f1219a
            r10 = r30
            if (r5 == 0) goto L_0x048f
            if (r8 == r7) goto L_0x048d
            if (r8 != r10) goto L_0x048f
        L_0x048d:
            r13 = 1
            goto L_0x0490
        L_0x048f:
            r13 = 0
        L_0x0490:
            java.lang.Object r14 = r6.f1221c
            if (r14 != 0) goto L_0x0496
            if (r13 == 0) goto L_0x04b9
        L_0x0496:
            int[] r13 = j0.x.f4957a
            boolean r13 = j0.x.f.c(r0)
            if (r13 != 0) goto L_0x04af
            r13 = 2
            boolean r14 = androidx.fragment.app.b0.H(r13)
            if (r14 == 0) goto L_0x04ab
            java.util.Objects.toString(r0)
            java.util.Objects.toString(r8)
        L_0x04ab:
            r6.a()
            goto L_0x04b9
        L_0x04af:
            androidx.fragment.app.n r8 = r8.f1332c
            androidx.fragment.app.k r8 = new androidx.fragment.app.k
            r8.<init>(r6)
            r3.p(r2, r8)
        L_0x04b9:
            r30 = r10
            goto L_0x0470
        L_0x04bc:
            int[] r4 = j0.x.f4957a
            boolean r4 = j0.x.f.c(r0)
            if (r4 != 0) goto L_0x04c6
            goto L_0x0158
        L_0x04c6:
            r4 = 4
            androidx.fragment.app.k0.b(r1, r4)
            java.util.ArrayList r4 = androidx.fragment.app.p0.k(r12)
            r3.c(r0, r2)
            r2 = r23
            androidx.fragment.app.p0.q(r0, r9, r12, r4, r2)
            r7 = 0
            androidx.fragment.app.k0.b(r1, r7)
            r3.s(r5, r9, r12)
        L_0x04dd:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r1 = r11.containsValue(r1)
            android.content.Context r2 = r0.getContext()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r22.iterator()
            r5 = r7
        L_0x04f1:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0570
            java.lang.Object r6 = r4.next()
            androidx.fragment.app.l$a r6 = (androidx.fragment.app.l.a) r6
            boolean r8 = r6.b()
            if (r8 == 0) goto L_0x0504
            goto L_0x052d
        L_0x0504:
            androidx.fragment.app.t$a r8 = r6.c(r2)
            if (r8 != 0) goto L_0x050b
            goto L_0x052d
        L_0x050b:
            android.animation.Animator r8 = r8.f1347b
            if (r8 != 0) goto L_0x0513
            r3.add(r6)
            goto L_0x04f1
        L_0x0513:
            androidx.fragment.app.s0$d r9 = r6.f1219a
            androidx.fragment.app.n r10 = r9.f1332c
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            java.lang.Object r13 = r11.get(r9)
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0531
            r12 = 2
            boolean r8 = androidx.fragment.app.b0.H(r12)
            if (r8 == 0) goto L_0x052d
            java.util.Objects.toString(r10)
        L_0x052d:
            r6.a()
            goto L_0x04f1
        L_0x0531:
            androidx.fragment.app.s0$d$c r5 = r9.f1330a
            r12 = r28
            if (r5 != r12) goto L_0x053a
            r19 = 1
            goto L_0x053c
        L_0x053a:
            r19 = r7
        L_0x053c:
            r13 = r25
            if (r19 == 0) goto L_0x0543
            r13.remove(r9)
        L_0x0543:
            android.view.View r5 = r10.H
            r0.startViewTransition(r5)
            androidx.fragment.app.d r10 = new androidx.fragment.app.d
            r16 = r10
            r17 = r0
            r18 = r5
            r20 = r9
            r21 = r6
            r16.<init>(r17, r18, r19, r20, r21)
            r8.addListener(r10)
            r8.setTarget(r5)
            r8.start()
            androidx.fragment.app.e r5 = new androidx.fragment.app.e
            r5.<init>(r8)
            f0.a r6 = r6.f1220b
            r6.b(r5)
            r28 = r12
            r25 = r13
            r5 = 1
            goto L_0x04f1
        L_0x0570:
            r13 = r25
            java.util.Iterator r3 = r3.iterator()
        L_0x0576:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x05d9
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.l$a r4 = (androidx.fragment.app.l.a) r4
            androidx.fragment.app.s0$d r6 = r4.f1219a
            androidx.fragment.app.n r7 = r6.f1332c
            if (r1 == 0) goto L_0x0590
            r8 = 2
            boolean r6 = androidx.fragment.app.b0.H(r8)
            if (r6 == 0) goto L_0x059c
            goto L_0x0599
        L_0x0590:
            r8 = 2
            if (r5 == 0) goto L_0x05a0
            boolean r6 = androidx.fragment.app.b0.H(r8)
            if (r6 == 0) goto L_0x059c
        L_0x0599:
            java.util.Objects.toString(r7)
        L_0x059c:
            r4.a()
            goto L_0x0576
        L_0x05a0:
            android.view.View r7 = r7.H
            androidx.fragment.app.t$a r9 = r4.c(r2)
            r9.getClass()
            android.view.animation.Animation r9 = r9.f1346a
            r9.getClass()
            androidx.fragment.app.s0$d$c r6 = r6.f1330a
            androidx.fragment.app.s0$d$c r10 = androidx.fragment.app.s0.d.c.f1341f
            if (r6 == r10) goto L_0x05bb
            r7.startAnimation(r9)
            r4.a()
            goto L_0x05ce
        L_0x05bb:
            r0.startViewTransition(r7)
            androidx.fragment.app.t$b r6 = new androidx.fragment.app.t$b
            r6.<init>(r9, r0, r7)
            androidx.fragment.app.f r9 = new androidx.fragment.app.f
            r9.<init>(r7, r0, r4)
            r6.setAnimationListener(r9)
            r7.startAnimation(r6)
        L_0x05ce:
            androidx.fragment.app.g r6 = new androidx.fragment.app.g
            r6.<init>(r7, r0, r4)
            f0.a r4 = r4.f1220b
            r4.b(r6)
            goto L_0x0576
        L_0x05d9:
            java.util.Iterator r0 = r13.iterator()
        L_0x05dd:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x05f3
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.s0$d r1 = (androidx.fragment.app.s0.d) r1
            androidx.fragment.app.n r2 = r1.f1332c
            android.view.View r2 = r2.H
            androidx.fragment.app.s0$d$c r1 = r1.f1330a
            r1.e(r2)
            goto L_0x05dd
        L_0x05f3:
            r13.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.l.b(java.util.ArrayList, boolean):void");
    }
}
