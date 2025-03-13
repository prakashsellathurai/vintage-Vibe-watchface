package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import p.d;
import p.f;
import s.e;

public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final f<RecyclerView.a0, a> f1797a = new f<>();

    /* renamed from: b  reason: collision with root package name */
    public final d<RecyclerView.a0> f1798b = new d<>();

    public static class a {

        /* renamed from: d  reason: collision with root package name */
        public static final e f1799d = new e(20, 1);

        /* renamed from: a  reason: collision with root package name */
        public int f1800a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.i.c f1801b;

        /* renamed from: c  reason: collision with root package name */
        public RecyclerView.i.c f1802c;

        public static a a() {
            a aVar = (a) f1799d.b();
            return aVar == null ? new a() : aVar;
        }
    }

    public final RecyclerView.i.c a(RecyclerView.a0 a0Var, int i8) {
        a l8;
        RecyclerView.i.c cVar;
        f<RecyclerView.a0, a> fVar = this.f1797a;
        int e = fVar.e(a0Var);
        if (e >= 0 && (l8 = fVar.l(e)) != null) {
            int i9 = l8.f1800a;
            if ((i9 & i8) != 0) {
                int i10 = i9 & (~i8);
                l8.f1800a = i10;
                if (i8 == 4) {
                    cVar = l8.f1801b;
                } else if (i8 == 8) {
                    cVar = l8.f1802c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i10 & 12) == 0) {
                    fVar.j(e);
                    l8.f1800a = 0;
                    l8.f1801b = null;
                    l8.f1802c = null;
                    a.f1799d.a(l8);
                }
                return cVar;
            }
        }
        return null;
    }

    public final void b(RecyclerView.a0 a0Var) {
        a orDefault = this.f1797a.getOrDefault(a0Var, null);
        if (orDefault != null) {
            orDefault.f1800a &= -2;
        }
    }

    public final void c(RecyclerView.a0 a0Var) {
        d<RecyclerView.a0> dVar = this.f1798b;
        int h8 = dVar.h() - 1;
        while (true) {
            if (h8 < 0) {
                break;
            } else if (a0Var == dVar.i(h8)) {
                Object[] objArr = dVar.f6223h;
                Object obj = objArr[h8];
                Object obj2 = d.f6220j;
                if (obj != obj2) {
                    objArr[h8] = obj2;
                    dVar.f6221f = true;
                }
            } else {
                h8--;
            }
        }
        a remove = this.f1797a.remove(a0Var);
        if (remove != null) {
            remove.f1800a = 0;
            remove.f1801b = null;
            remove.f1802c = null;
            a.f1799d.a(remove);
        }
    }
}
