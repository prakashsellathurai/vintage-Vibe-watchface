package c8;

import h2.d;
import j7.f;
import p7.p;
import q7.k;
import q7.l;
import y7.p1;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final d f2871a = new d(9, "NO_THREAD_ELEMENTS");

    /* renamed from: b  reason: collision with root package name */
    public static final a f2872b = a.f2875f;

    /* renamed from: c  reason: collision with root package name */
    public static final b f2873c = b.f2876f;

    /* renamed from: d  reason: collision with root package name */
    public static final c f2874d = c.f2877f;

    public static final class a extends l implements p<Object, f.b, Object> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f2875f = new a();

        public a() {
            super(2);
        }

        public final Object g(Object obj, Object obj2) {
            f.b bVar = (f.b) obj2;
            if (!(bVar instanceof p1)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    public static final class b extends l implements p<p1<?>, f.b, p1<?>> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f2876f = new b();

        public b() {
            super(2);
        }

        public final Object g(Object obj, Object obj2) {
            p1 p1Var = (p1) obj;
            f.b bVar = (f.b) obj2;
            if (p1Var != null) {
                return p1Var;
            }
            if (bVar instanceof p1) {
                return (p1) bVar;
            }
            return null;
        }
    }

    public static final class c extends l implements p<w, f.b, w> {

        /* renamed from: f  reason: collision with root package name */
        public static final c f2877f = new c();

        public c() {
            super(2);
        }

        public final Object g(Object obj, Object obj2) {
            w wVar = (w) obj;
            f.b bVar = (f.b) obj2;
            if (bVar instanceof p1) {
                p1<Object> p1Var = (p1) bVar;
                String z8 = p1Var.z(wVar.f2880a);
                int i8 = wVar.f2883d;
                wVar.f2881b[i8] = z8;
                wVar.f2883d = i8 + 1;
                wVar.f2882c[i8] = p1Var;
            }
            return wVar;
        }
    }

    public static final void a(f fVar, Object obj) {
        if (obj != f2871a) {
            if (obj instanceof w) {
                w wVar = (w) obj;
                p1<Object>[] p1VarArr = wVar.f2882c;
                int length = p1VarArr.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i8 = length - 1;
                        p1<Object> p1Var = p1VarArr[length];
                        k.b(p1Var);
                        p1Var.x(wVar.f2881b[length]);
                        if (i8 >= 0) {
                            length = i8;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                Object q8 = fVar.q(null, f2873c);
                k.c(q8, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
                ((p1) q8).x(obj);
            }
        }
    }

    public static final Object b(f fVar, Object obj) {
        if (obj == null) {
            obj = fVar.q(0, f2872b);
            k.b(obj);
        }
        return obj == 0 ? f2871a : obj instanceof Integer ? fVar.q(new w(fVar, ((Number) obj).intValue()), f2874d) : ((p1) obj).z(fVar);
    }
}
