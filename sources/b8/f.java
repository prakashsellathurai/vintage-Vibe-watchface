package b8;

import a8.b;
import h7.e;
import h7.h;
import j7.d;
import j7.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k7.a;
import l7.c;
import p7.q;
import q7.k;
import v7.i;
import w7.j;
import w7.l;
import y7.z0;

public final class f<T> extends c implements b<T> {

    /* renamed from: i  reason: collision with root package name */
    public final b<T> f2623i = null;

    /* renamed from: j  reason: collision with root package name */
    public final j7.f f2624j;

    /* renamed from: k  reason: collision with root package name */
    public final int f2625k;

    /* renamed from: l  reason: collision with root package name */
    public j7.f f2626l;

    /* renamed from: m  reason: collision with root package name */
    public d<? super h> f2627m;

    public f(j7.f fVar) {
        super(d.f2621f, g.f5052f);
        this.f2624j = fVar;
        this.f2625k = ((Number) fVar.q(0, e.f2622f)).intValue();
    }

    public final j7.f a() {
        j7.f fVar = this.f2626l;
        return fVar == null ? g.f5052f : fVar;
    }

    public final l7.d e() {
        d<? super h> dVar = this.f2627m;
        if (dVar instanceof l7.d) {
            return (l7.d) dVar;
        }
        return null;
    }

    public final Object emit(T t8, d<? super h> dVar) {
        try {
            Object o8 = o(dVar, t8);
            return o8 == a.f5217f ? o8 : h.f4787a;
        } catch (Throwable th) {
            this.f2626l = new c(dVar.a(), th);
            throw th;
        }
    }

    public final StackTraceElement f() {
        return null;
    }

    public final Object h(Object obj) {
        Throwable a9 = e.a(obj);
        if (a9 != null) {
            this.f2626l = new c(a(), a9);
        }
        d<? super h> dVar = this.f2627m;
        if (dVar != null) {
            dVar.i(obj);
        }
        return a.f5217f;
    }

    public final void n() {
        super.n();
    }

    public final Object o(d<? super h> dVar, T t8) {
        Comparable comparable;
        String str;
        T t9 = t8;
        j7.f a9 = dVar.a();
        z0 z0Var = (z0) a9.d(z0.b.f8628f);
        if (z0Var == null || z0Var.c()) {
            j7.f fVar = this.f2626l;
            if (fVar != a9) {
                if (fVar instanceof c) {
                    String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((c) fVar).f2619f + ", but then emission attempt of value '" + t9 + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                    k.e(str2, "<this>");
                    l.t(0);
                    List n02 = v7.h.n0(new i(new w7.b(str2, 0, 0, new j(i7.f.L(new String[]{"\r\n", "\n", "\r"}), false)), new w7.k(str2)));
                    ArrayList arrayList = new ArrayList();
                    for (Object next : n02) {
                        if (true ^ w7.i.n((String) next)) {
                            arrayList.add(next);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(i7.f.M(arrayList));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str3 = (String) it.next();
                        int length = str3.length();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= length) {
                                i8 = -1;
                                break;
                            } else if (!k3.j.I(str3.charAt(i8))) {
                                break;
                            } else {
                                i8++;
                            }
                        }
                        if (i8 == -1) {
                            i8 = str3.length();
                        }
                        arrayList2.add(Integer.valueOf(i8));
                    }
                    Iterator it2 = arrayList2.iterator();
                    if (!it2.hasNext()) {
                        comparable = null;
                    } else {
                        comparable = (Comparable) it2.next();
                        while (it2.hasNext()) {
                            Comparable comparable2 = (Comparable) it2.next();
                            if (comparable.compareTo(comparable2) > 0) {
                                comparable = comparable2;
                            }
                        }
                    }
                    Integer num = (Integer) comparable;
                    int intValue = num != null ? num.intValue() : 0;
                    int length2 = str2.length() + (n02.size() * 0);
                    int u8 = a1.a.u(n02);
                    ArrayList arrayList3 = new ArrayList();
                    int i9 = 0;
                    for (Object next2 : n02) {
                        int i10 = i9 + 1;
                        if (i9 >= 0) {
                            String str4 = (String) next2;
                            if ((i9 == 0 || i9 == u8) && w7.i.n(str4)) {
                                str = null;
                            } else {
                                k.e(str4, "<this>");
                                if (intValue >= 0) {
                                    int length3 = str4.length();
                                    if (intValue <= length3) {
                                        length3 = intValue;
                                    }
                                    String substring = str4.substring(length3);
                                    k.d(substring, "this as java.lang.String).substring(startIndex)");
                                    str = (String) w7.d.f8092f.invoke(substring);
                                } else {
                                    throw new IllegalArgumentException(("Requested character count " + intValue + " is less than zero.").toString());
                                }
                            }
                            if (str != null) {
                                arrayList3.add(str);
                            }
                            i9 = i10;
                        } else {
                            throw new ArithmeticException("Index overflow has happened.");
                        }
                    }
                    StringBuilder sb = new StringBuilder(length2);
                    i7.i.V(arrayList3, sb, "\n", "", "", -1, "...", (p7.l) null);
                    String sb2 = sb.toString();
                    k.d(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
                    throw new IllegalStateException(sb2.toString());
                } else if (((Number) a9.q(0, new h(this))).intValue() == this.f2625k) {
                    this.f2626l = a9;
                } else {
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f2624j + ",\n\t\tbut emission happened in " + a9 + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
                }
            }
            this.f2627m = dVar;
            q<b<Object>, Object, d<? super h>, Object> qVar = g.f2628a;
            b<T> bVar = this.f2623i;
            k.c(bVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
            Object d9 = qVar.d(bVar, t9, this);
            if (!k.a(d9, a.f5217f)) {
                this.f2627m = null;
            }
            return d9;
        }
        throw z0Var.D();
    }
}
