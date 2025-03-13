package e1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final a f4211a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<WeakReference<p.a<ViewGroup, ArrayList<h>>>> f4212b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    public static final ArrayList<ViewGroup> f4213c = new ArrayList<>();

    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final h f4214a;

        /* renamed from: b  reason: collision with root package name */
        public final ViewGroup f4215b;

        /* renamed from: e1.l$a$a  reason: collision with other inner class name */
        public class C0051a extends k {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ p.a f4216a;

            public C0051a(p.a aVar) {
                this.f4216a = aVar;
            }

            public final void e(h hVar) {
                ((ArrayList) this.f4216a.getOrDefault(a.this.f4215b, null)).remove(hVar);
                hVar.v(this);
            }
        }

        public a(ViewGroup viewGroup, h hVar) {
            this.f4214a = hVar;
            this.f4215b = viewGroup;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: e1.n} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x022e  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:139:0x01db A[EDGE_INSN: B:139:0x01db->B:87:0x01db ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x008c  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x01e1  */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x0202  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onPreDraw() {
            /*
                r17 = this;
                r0 = r17
                android.view.ViewGroup r1 = r0.f4215b
                android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()
                r2.removeOnPreDrawListener(r0)
                r1.removeOnAttachStateChangeListener(r0)
                java.util.ArrayList<android.view.ViewGroup> r2 = e1.l.f4213c
                boolean r2 = r2.remove(r1)
                r6 = 1
                if (r2 != 0) goto L_0x0018
                return r6
            L_0x0018:
                p.a r2 = e1.l.a()
                r3 = 0
                java.lang.Object r4 = r2.getOrDefault(r1, r3)
                java.util.ArrayList r4 = (java.util.ArrayList) r4
                if (r4 != 0) goto L_0x002e
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                r2.put(r1, r4)
                goto L_0x003a
            L_0x002e:
                int r5 = r4.size()
                if (r5 <= 0) goto L_0x003a
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r4)
                goto L_0x003b
            L_0x003a:
                r5 = r3
            L_0x003b:
                e1.h r7 = r0.f4214a
                r4.add(r7)
                e1.l$a$a r4 = new e1.l$a$a
                r4.<init>(r2)
                r7.a(r4)
                r0 = 0
                r7.h(r1, r0)
                if (r5 == 0) goto L_0x0062
                java.util.Iterator r2 = r5.iterator()
            L_0x0052:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L_0x0062
                java.lang.Object r4 = r2.next()
                e1.h r4 = (e1.h) r4
                r4.x(r1)
                goto L_0x0052
            L_0x0062:
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r7.f4197p = r2
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r7.f4198q = r2
                s.c r2 = r7.f4193l
                s.c r4 = r7.f4194m
                p.a r5 = new p.a
                java.lang.Object r8 = r2.f7134a
                p.a r8 = (p.a) r8
                r5.<init>((p.a) r8)
                p.a r8 = new p.a
                java.lang.Object r9 = r4.f7134a
                p.a r9 = (p.a) r9
                r8.<init>((p.a) r9)
                r9 = r0
            L_0x0087:
                int[] r10 = r7.f4196o
                int r11 = r10.length
                if (r9 >= r11) goto L_0x01db
                r10 = r10[r9]
                if (r10 == r6) goto L_0x019d
                r11 = 2
                if (r10 == r11) goto L_0x014b
                r11 = 3
                if (r10 == r11) goto L_0x00f7
                r11 = 4
                if (r10 == r11) goto L_0x009c
            L_0x0099:
                r15 = r1
                goto L_0x01d3
            L_0x009c:
                java.lang.Object r10 = r2.f7136c
                p.d r10 = (p.d) r10
                java.lang.Object r11 = r4.f7136c
                p.d r11 = (p.d) r11
                int r12 = r10.h()
                r13 = r0
            L_0x00a9:
                if (r13 >= r12) goto L_0x0099
                java.lang.Object r14 = r10.i(r13)
                android.view.View r14 = (android.view.View) r14
                if (r14 == 0) goto L_0x00ef
                boolean r15 = r7.s(r14)
                if (r15 == 0) goto L_0x00ef
                r15 = r1
                long r0 = r10.e(r13)
                java.lang.Object r0 = r11.d(r0, r3)
                android.view.View r0 = (android.view.View) r0
                if (r0 == 0) goto L_0x00f0
                boolean r1 = r7.s(r0)
                if (r1 == 0) goto L_0x00f0
                java.lang.Object r1 = r5.getOrDefault(r14, r3)
                e1.n r1 = (e1.n) r1
                java.lang.Object r16 = r8.getOrDefault(r0, r3)
                r6 = r16
                e1.n r6 = (e1.n) r6
                if (r1 == 0) goto L_0x00f0
                if (r6 == 0) goto L_0x00f0
                java.util.ArrayList<e1.n> r3 = r7.f4197p
                r3.add(r1)
                java.util.ArrayList<e1.n> r1 = r7.f4198q
                r1.add(r6)
                r5.remove(r14)
                r8.remove(r0)
                goto L_0x00f0
            L_0x00ef:
                r15 = r1
            L_0x00f0:
                int r13 = r13 + 1
                r1 = r15
                r0 = 0
                r3 = 0
                r6 = 1
                goto L_0x00a9
            L_0x00f7:
                r15 = r1
                java.lang.Object r0 = r2.f7135b
                android.util.SparseArray r0 = (android.util.SparseArray) r0
                java.lang.Object r1 = r4.f7135b
                android.util.SparseArray r1 = (android.util.SparseArray) r1
                int r3 = r0.size()
                r6 = 0
            L_0x0105:
                if (r6 >= r3) goto L_0x01d3
                java.lang.Object r10 = r0.valueAt(r6)
                android.view.View r10 = (android.view.View) r10
                if (r10 == 0) goto L_0x0148
                boolean r11 = r7.s(r10)
                if (r11 == 0) goto L_0x0148
                int r11 = r0.keyAt(r6)
                java.lang.Object r11 = r1.get(r11)
                android.view.View r11 = (android.view.View) r11
                if (r11 == 0) goto L_0x0148
                boolean r12 = r7.s(r11)
                if (r12 == 0) goto L_0x0148
                r12 = 0
                java.lang.Object r13 = r5.getOrDefault(r10, r12)
                e1.n r13 = (e1.n) r13
                java.lang.Object r14 = r8.getOrDefault(r11, r12)
                e1.n r14 = (e1.n) r14
                if (r13 == 0) goto L_0x0148
                if (r14 == 0) goto L_0x0148
                java.util.ArrayList<e1.n> r12 = r7.f4197p
                r12.add(r13)
                java.util.ArrayList<e1.n> r12 = r7.f4198q
                r12.add(r14)
                r5.remove(r10)
                r8.remove(r11)
            L_0x0148:
                int r6 = r6 + 1
                goto L_0x0105
            L_0x014b:
                r15 = r1
                java.lang.Object r0 = r2.f7137d
                p.a r0 = (p.a) r0
                java.lang.Object r1 = r4.f7137d
                p.a r1 = (p.a) r1
                int r3 = r0.f6235h
                r6 = 0
            L_0x0157:
                if (r6 >= r3) goto L_0x01d3
                java.lang.Object r10 = r0.l(r6)
                android.view.View r10 = (android.view.View) r10
                if (r10 == 0) goto L_0x019a
                boolean r11 = r7.s(r10)
                if (r11 == 0) goto L_0x019a
                java.lang.Object r11 = r0.h(r6)
                r12 = 0
                java.lang.Object r11 = r1.getOrDefault(r11, r12)
                android.view.View r11 = (android.view.View) r11
                if (r11 == 0) goto L_0x019a
                boolean r13 = r7.s(r11)
                if (r13 == 0) goto L_0x019a
                java.lang.Object r13 = r5.getOrDefault(r10, r12)
                e1.n r13 = (e1.n) r13
                java.lang.Object r14 = r8.getOrDefault(r11, r12)
                e1.n r14 = (e1.n) r14
                if (r13 == 0) goto L_0x019a
                if (r14 == 0) goto L_0x019a
                java.util.ArrayList<e1.n> r12 = r7.f4197p
                r12.add(r13)
                java.util.ArrayList<e1.n> r12 = r7.f4198q
                r12.add(r14)
                r5.remove(r10)
                r8.remove(r11)
            L_0x019a:
                int r6 = r6 + 1
                goto L_0x0157
            L_0x019d:
                r15 = r1
                int r0 = r5.f6235h
            L_0x01a0:
                int r0 = r0 + -1
                if (r0 < 0) goto L_0x01d3
                java.lang.Object r1 = r5.h(r0)
                android.view.View r1 = (android.view.View) r1
                if (r1 == 0) goto L_0x01a0
                boolean r3 = r7.s(r1)
                if (r3 == 0) goto L_0x01a0
                java.lang.Object r1 = r8.remove(r1)
                e1.n r1 = (e1.n) r1
                if (r1 == 0) goto L_0x01a0
                android.view.View r3 = r1.f4221b
                boolean r3 = r7.s(r3)
                if (r3 == 0) goto L_0x01a0
                java.lang.Object r3 = r5.j(r0)
                e1.n r3 = (e1.n) r3
                java.util.ArrayList<e1.n> r6 = r7.f4197p
                r6.add(r3)
                java.util.ArrayList<e1.n> r3 = r7.f4198q
                r3.add(r1)
                goto L_0x01a0
            L_0x01d3:
                int r9 = r9 + 1
                r1 = r15
                r0 = 0
                r3 = 0
                r6 = 1
                goto L_0x0087
            L_0x01db:
                r15 = r1
                r0 = 0
            L_0x01dd:
                int r1 = r5.f6235h
                if (r0 >= r1) goto L_0x01fd
                java.lang.Object r1 = r5.l(r0)
                e1.n r1 = (e1.n) r1
                android.view.View r2 = r1.f4221b
                boolean r2 = r7.s(r2)
                if (r2 == 0) goto L_0x01fa
                java.util.ArrayList<e1.n> r2 = r7.f4197p
                r2.add(r1)
                java.util.ArrayList<e1.n> r1 = r7.f4198q
                r2 = 0
                r1.add(r2)
            L_0x01fa:
                int r0 = r0 + 1
                goto L_0x01dd
            L_0x01fd:
                r0 = 0
            L_0x01fe:
                int r1 = r8.f6235h
                if (r0 >= r1) goto L_0x021e
                java.lang.Object r1 = r8.l(r0)
                e1.n r1 = (e1.n) r1
                android.view.View r2 = r1.f4221b
                boolean r2 = r7.s(r2)
                if (r2 == 0) goto L_0x021b
                java.util.ArrayList<e1.n> r2 = r7.f4198q
                r2.add(r1)
                java.util.ArrayList<e1.n> r1 = r7.f4197p
                r2 = 0
                r1.add(r2)
            L_0x021b:
                int r0 = r0 + 1
                goto L_0x01fe
            L_0x021e:
                p.a r0 = e1.h.o()
                int r1 = r0.f6235h
                android.util.Property<android.view.View, java.lang.Float> r2 = e1.o.f4223a
                android.view.WindowId r2 = r15.getWindowId()
                r3 = 1
                int r1 = r1 - r3
            L_0x022c:
                if (r1 < 0) goto L_0x02a1
                java.lang.Object r3 = r0.h(r1)
                android.animation.Animator r3 = (android.animation.Animator) r3
                if (r3 == 0) goto L_0x029d
                r4 = 0
                java.lang.Object r5 = r0.getOrDefault(r3, r4)
                e1.h$b r5 = (e1.h.b) r5
                if (r5 == 0) goto L_0x029d
                android.view.View r4 = r5.f4204a
                if (r4 == 0) goto L_0x029d
                e1.x r6 = r5.f4207d
                boolean r8 = r6 instanceof e1.w
                if (r8 == 0) goto L_0x0255
                e1.w r6 = (e1.w) r6
                android.view.WindowId r6 = r6.f4238a
                boolean r6 = r6.equals(r2)
                if (r6 == 0) goto L_0x0255
                r6 = 1
                goto L_0x0256
            L_0x0255:
                r6 = 0
            L_0x0256:
                if (r6 == 0) goto L_0x029d
                r6 = 1
                e1.n r8 = r7.q(r4, r6)
                e1.n r9 = r7.n(r4, r6)
                if (r8 != 0) goto L_0x0274
                if (r9 != 0) goto L_0x0274
                s.c r6 = r7.f4194m
                java.lang.Object r6 = r6.f7134a
                p.a r6 = (p.a) r6
                r10 = 0
                java.lang.Object r4 = r6.getOrDefault(r4, r10)
                r9 = r4
                e1.n r9 = (e1.n) r9
                goto L_0x0275
            L_0x0274:
                r10 = 0
            L_0x0275:
                if (r8 != 0) goto L_0x0279
                if (r9 == 0) goto L_0x0285
            L_0x0279:
                e1.h r4 = r5.e
                e1.n r5 = r5.f4206c
                boolean r4 = r4.r(r5, r9)
                if (r4 == 0) goto L_0x0285
                r4 = 1
                goto L_0x0286
            L_0x0285:
                r4 = 0
            L_0x0286:
                if (r4 == 0) goto L_0x029e
                boolean r4 = r3.isRunning()
                if (r4 != 0) goto L_0x0299
                boolean r4 = r3.isStarted()
                if (r4 == 0) goto L_0x0295
                goto L_0x0299
            L_0x0295:
                r0.remove(r3)
                goto L_0x029e
            L_0x0299:
                r3.cancel()
                goto L_0x029e
            L_0x029d:
                r10 = 0
            L_0x029e:
                int r1 = r1 + -1
                goto L_0x022c
            L_0x02a1:
                s.c r2 = r7.f4193l
                s.c r3 = r7.f4194m
                java.util.ArrayList<e1.n> r4 = r7.f4197p
                java.util.ArrayList<e1.n> r5 = r7.f4198q
                r0 = r7
                r1 = r15
                r0.l(r1, r2, r3, r4, r5)
                r7.y()
                r0 = 1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: e1.l.a.onPreDraw():boolean");
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            ViewGroup viewGroup = this.f4215b;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            l.f4213c.remove(viewGroup);
            ArrayList orDefault = l.a().getOrDefault(viewGroup, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator it = orDefault.iterator();
                while (it.hasNext()) {
                    ((h) it.next()).x(viewGroup);
                }
            }
            this.f4214a.i(true);
        }
    }

    public static p.a<ViewGroup, ArrayList<h>> a() {
        p.a<ViewGroup, ArrayList<h>> aVar;
        ThreadLocal<WeakReference<p.a<ViewGroup, ArrayList<h>>>> threadLocal = f4212b;
        WeakReference weakReference = threadLocal.get();
        if (weakReference != null && (aVar = (p.a) weakReference.get()) != null) {
            return aVar;
        }
        p.a<ViewGroup, ArrayList<h>> aVar2 = new p.a<>();
        threadLocal.set(new WeakReference(aVar2));
        return aVar2;
    }
}
