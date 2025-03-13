package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.m;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import m.b;
import q7.k;

public final class s extends m {

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1501b = true;

    /* renamed from: c  reason: collision with root package name */
    public m.a<q, a> f1502c = new m.a<>();

    /* renamed from: d  reason: collision with root package name */
    public m.b f1503d = m.b.f1492g;
    public final WeakReference<r> e;

    /* renamed from: f  reason: collision with root package name */
    public int f1504f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1505g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1506h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList<m.b> f1507i = new ArrayList<>();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public m.b f1508a;

        /* renamed from: b  reason: collision with root package name */
        public final p f1509b;

        public a(q qVar, m.b bVar) {
            p pVar;
            k.b(qVar);
            HashMap hashMap = u.f1510a;
            boolean z8 = qVar instanceof p;
            boolean z9 = qVar instanceof h;
            if (z8 && z9) {
                pVar = new DefaultLifecycleObserverAdapter((h) qVar, (p) qVar);
            } else if (z9) {
                pVar = new DefaultLifecycleObserverAdapter((h) qVar, (p) null);
            } else if (z8) {
                pVar = (p) qVar;
            } else {
                Class<?> cls = qVar.getClass();
                if (u.c(cls) == 2) {
                    Object obj = u.f1511b.get(cls);
                    k.b(obj);
                    List list = (List) obj;
                    if (list.size() == 1) {
                        pVar = new SingleGeneratedAdapterObserver(u.a((Constructor) list.get(0), qVar));
                    } else {
                        int size = list.size();
                        j[] jVarArr = new j[size];
                        for (int i8 = 0; i8 < size; i8++) {
                            jVarArr[i8] = u.a((Constructor) list.get(i8), qVar);
                        }
                        pVar = new CompositeGeneratedAdaptersObserver(jVarArr);
                    }
                } else {
                    pVar = new ReflectiveGenericLifecycleObserver(qVar);
                }
            }
            this.f1509b = pVar;
            this.f1508a = bVar;
        }

        public final void a(r rVar, m.a aVar) {
            m.b e = aVar.e();
            m.b bVar = this.f1508a;
            k.e(bVar, "state1");
            if (e.compareTo(bVar) < 0) {
                bVar = e;
            }
            this.f1508a = bVar;
            this.f1509b.c(rVar, aVar);
            this.f1508a = e;
        }
    }

    public s(r rVar) {
        k.e(rVar, "provider");
        this.e = new WeakReference<>(rVar);
    }

    public final void a(q qVar) {
        r rVar;
        k.e(qVar, "observer");
        d("addObserver");
        m.b bVar = this.f1503d;
        m.b bVar2 = m.b.f1491f;
        if (bVar != bVar2) {
            bVar2 = m.b.f1492g;
        }
        a aVar = new a(qVar, bVar2);
        if (this.f1502c.k(qVar, aVar) == null && (rVar = this.e.get()) != null) {
            boolean z8 = this.f1504f != 0 || this.f1505g;
            m.b c9 = c(qVar);
            this.f1504f++;
            while (aVar.f1508a.compareTo(c9) < 0 && this.f1502c.f5338j.containsKey(qVar)) {
                m.b bVar3 = aVar.f1508a;
                ArrayList<m.b> arrayList = this.f1507i;
                arrayList.add(bVar3);
                m.a.C0012a aVar2 = m.a.Companion;
                m.b bVar4 = aVar.f1508a;
                aVar2.getClass();
                m.a a9 = m.a.C0012a.a(bVar4);
                if (a9 != null) {
                    aVar.a(rVar, a9);
                    arrayList.remove(arrayList.size() - 1);
                    c9 = c(qVar);
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f1508a);
                }
            }
            if (!z8) {
                h();
            }
            this.f1504f--;
        }
    }

    public final void b(q qVar) {
        k.e(qVar, "observer");
        d("removeObserver");
        this.f1502c.j(qVar);
    }

    public final m.b c(q qVar) {
        a aVar;
        m.a<q, a> aVar2 = this.f1502c;
        m.b bVar = null;
        b.c<K, V> cVar = aVar2.f5338j.containsKey(qVar) ? aVar2.f5338j.get(qVar).f5346i : null;
        m.b bVar2 = (cVar == null || (aVar = (a) cVar.f5344g) == null) ? null : aVar.f1508a;
        ArrayList<m.b> arrayList = this.f1507i;
        if (!arrayList.isEmpty()) {
            bVar = arrayList.get(arrayList.size() - 1);
        }
        m.b bVar3 = this.f1503d;
        k.e(bVar3, "state1");
        if (bVar2 == null || bVar2.compareTo(bVar3) >= 0) {
            bVar2 = bVar3;
        }
        return (bVar == null || bVar.compareTo(bVar2) >= 0) ? bVar2 : bVar;
    }

    @SuppressLint({"RestrictedApi"})
    public final void d(String str) {
        if (this.f1501b && !l.b.j().k()) {
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    public final void e(m.a aVar) {
        k.e(aVar, "event");
        d("handleLifecycleEvent");
        f(aVar.e());
    }

    public final void f(m.b bVar) {
        m.b bVar2 = this.f1503d;
        if (bVar2 != bVar) {
            m.b bVar3 = m.b.f1492g;
            m.b bVar4 = m.b.f1491f;
            if ((bVar2 == bVar3 && bVar == bVar4) ? false : true) {
                this.f1503d = bVar;
                if (this.f1505g || this.f1504f != 0) {
                    this.f1506h = true;
                    return;
                }
                this.f1505g = true;
                h();
                this.f1505g = false;
                if (this.f1503d == bVar4) {
                    this.f1502c = new m.a<>();
                    return;
                }
                return;
            }
            throw new IllegalStateException(("no event down from " + this.f1503d + " in component " + this.e.get()).toString());
        }
    }

    public final void g() {
        m.b bVar = m.b.f1493h;
        d("setCurrentState");
        f(bVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x017a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r7 = this;
            java.lang.ref.WeakReference<androidx.lifecycle.r> r0 = r7.e
            java.lang.Object r0 = r0.get()
            androidx.lifecycle.r r0 = (androidx.lifecycle.r) r0
            if (r0 == 0) goto L_0x017b
        L_0x000a:
            m.a<androidx.lifecycle.q, androidx.lifecycle.s$a> r1 = r7.f1502c
            int r2 = r1.f5342i
            r3 = 0
            if (r2 != 0) goto L_0x0012
            goto L_0x0030
        L_0x0012:
            m.b$c<K, V> r1 = r1.f5339f
            q7.k.b(r1)
            V r1 = r1.f5344g
            androidx.lifecycle.s$a r1 = (androidx.lifecycle.s.a) r1
            androidx.lifecycle.m$b r1 = r1.f1508a
            m.a<androidx.lifecycle.q, androidx.lifecycle.s$a> r2 = r7.f1502c
            m.b$c<K, V> r2 = r2.f5340g
            q7.k.b(r2)
            V r2 = r2.f5344g
            androidx.lifecycle.s$a r2 = (androidx.lifecycle.s.a) r2
            androidx.lifecycle.m$b r2 = r2.f1508a
            if (r1 != r2) goto L_0x0032
            androidx.lifecycle.m$b r1 = r7.f1503d
            if (r1 != r2) goto L_0x0032
        L_0x0030:
            r1 = 1
            goto L_0x0033
        L_0x0032:
            r1 = r3
        L_0x0033:
            r7.f1506h = r3
            if (r1 != 0) goto L_0x017a
            androidx.lifecycle.m$b r1 = r7.f1503d
            m.a<androidx.lifecycle.q, androidx.lifecycle.s$a> r2 = r7.f1502c
            m.b$c<K, V> r2 = r2.f5339f
            q7.k.b(r2)
            V r2 = r2.f5344g
            androidx.lifecycle.s$a r2 = (androidx.lifecycle.s.a) r2
            androidx.lifecycle.m$b r2 = r2.f1508a
            int r1 = r1.compareTo(r2)
            java.util.ArrayList<androidx.lifecycle.m$b> r2 = r7.f1507i
            if (r1 >= 0) goto L_0x00e8
            m.a<androidx.lifecycle.q, androidx.lifecycle.s$a> r1 = r7.f1502c
            m.b$b r3 = new m.b$b
            m.b$c<K, V> r4 = r1.f5340g
            m.b$c<K, V> r5 = r1.f5339f
            r3.<init>(r4, r5)
            java.util.WeakHashMap<m.b$f<K, V>, java.lang.Boolean> r1 = r1.f5341h
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r1.put(r3, r4)
        L_0x0060:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x00e8
            boolean r1 = r7.f1506h
            if (r1 != 0) goto L_0x00e8
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.String r4 = "next()"
            q7.k.d(r1, r4)
            java.lang.Object r4 = r1.getKey()
            androidx.lifecycle.q r4 = (androidx.lifecycle.q) r4
            java.lang.Object r1 = r1.getValue()
            androidx.lifecycle.s$a r1 = (androidx.lifecycle.s.a) r1
        L_0x0081:
            androidx.lifecycle.m$b r5 = r1.f1508a
            androidx.lifecycle.m$b r6 = r7.f1503d
            int r5 = r5.compareTo(r6)
            if (r5 <= 0) goto L_0x0060
            boolean r5 = r7.f1506h
            if (r5 != 0) goto L_0x0060
            m.a<androidx.lifecycle.q, androidx.lifecycle.s$a> r5 = r7.f1502c
            java.util.HashMap<K, m.b$c<K, V>> r5 = r5.f5338j
            boolean r5 = r5.containsKey(r4)
            if (r5 == 0) goto L_0x0060
            androidx.lifecycle.m$a$a r5 = androidx.lifecycle.m.a.Companion
            androidx.lifecycle.m$b r6 = r1.f1508a
            r5.getClass()
            java.lang.String r5 = "state"
            q7.k.e(r6, r5)
            int r5 = r6.ordinal()
            r6 = 2
            if (r5 == r6) goto L_0x00ba
            r6 = 3
            if (r5 == r6) goto L_0x00b7
            r6 = 4
            if (r5 == r6) goto L_0x00b4
            r5 = 0
            goto L_0x00bc
        L_0x00b4:
            androidx.lifecycle.m$a r5 = androidx.lifecycle.m.a.ON_PAUSE
            goto L_0x00bc
        L_0x00b7:
            androidx.lifecycle.m$a r5 = androidx.lifecycle.m.a.ON_STOP
            goto L_0x00bc
        L_0x00ba:
            androidx.lifecycle.m$a r5 = androidx.lifecycle.m.a.ON_DESTROY
        L_0x00bc:
            if (r5 == 0) goto L_0x00d2
            androidx.lifecycle.m$b r6 = r5.e()
            r2.add(r6)
            r1.a(r0, r5)
            int r5 = r2.size()
            int r5 = r5 + -1
            r2.remove(r5)
            goto L_0x0081
        L_0x00d2:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "no event down from "
            r0.<init>(r2)
            androidx.lifecycle.m$b r1 = r1.f1508a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x00e8:
            m.a<androidx.lifecycle.q, androidx.lifecycle.s$a> r1 = r7.f1502c
            m.b$c<K, V> r1 = r1.f5340g
            boolean r3 = r7.f1506h
            if (r3 != 0) goto L_0x000a
            if (r1 == 0) goto L_0x000a
            androidx.lifecycle.m$b r3 = r7.f1503d
            V r1 = r1.f5344g
            androidx.lifecycle.s$a r1 = (androidx.lifecycle.s.a) r1
            androidx.lifecycle.m$b r1 = r1.f1508a
            int r1 = r3.compareTo(r1)
            if (r1 <= 0) goto L_0x000a
            m.a<androidx.lifecycle.q, androidx.lifecycle.s$a> r1 = r7.f1502c
            r1.getClass()
            m.b$d r3 = new m.b$d
            r3.<init>()
            java.util.WeakHashMap<m.b$f<K, V>, java.lang.Boolean> r1 = r1.f5341h
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r1.put(r3, r4)
        L_0x0111:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x000a
            boolean r1 = r7.f1506h
            if (r1 != 0) goto L_0x000a
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r4 = r1.getKey()
            androidx.lifecycle.q r4 = (androidx.lifecycle.q) r4
            java.lang.Object r1 = r1.getValue()
            androidx.lifecycle.s$a r1 = (androidx.lifecycle.s.a) r1
        L_0x012d:
            androidx.lifecycle.m$b r5 = r1.f1508a
            androidx.lifecycle.m$b r6 = r7.f1503d
            int r5 = r5.compareTo(r6)
            if (r5 >= 0) goto L_0x0111
            boolean r5 = r7.f1506h
            if (r5 != 0) goto L_0x0111
            m.a<androidx.lifecycle.q, androidx.lifecycle.s$a> r5 = r7.f1502c
            java.util.HashMap<K, m.b$c<K, V>> r5 = r5.f5338j
            boolean r5 = r5.containsKey(r4)
            if (r5 == 0) goto L_0x0111
            androidx.lifecycle.m$b r5 = r1.f1508a
            r2.add(r5)
            androidx.lifecycle.m$a$a r5 = androidx.lifecycle.m.a.Companion
            androidx.lifecycle.m$b r6 = r1.f1508a
            r5.getClass()
            androidx.lifecycle.m$a r5 = androidx.lifecycle.m.a.C0012a.a(r6)
            if (r5 == 0) goto L_0x0164
            r1.a(r0, r5)
            int r5 = r2.size()
            int r5 = r5 + -1
            r2.remove(r5)
            goto L_0x012d
        L_0x0164:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "no event up from "
            r0.<init>(r2)
            androidx.lifecycle.m$b r1 = r1.f1508a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x017a:
            return
        L_0x017b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.s.h():void");
    }
}
