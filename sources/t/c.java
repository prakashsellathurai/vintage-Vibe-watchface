package t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.h;
import u.i;
import u.o;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public HashSet<c> f7301a = null;

    /* renamed from: b  reason: collision with root package name */
    public int f7302b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7303c;

    /* renamed from: d  reason: collision with root package name */
    public final d f7304d;
    public final a e;

    /* renamed from: f  reason: collision with root package name */
    public c f7305f;

    /* renamed from: g  reason: collision with root package name */
    public int f7306g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f7307h = -1;

    /* renamed from: i  reason: collision with root package name */
    public h f7308i;

    public enum a {
        f7309f,
        f7310g,
        f7311h,
        f7312i,
        f7313j,
        f7314k,
        f7315l,
        f7316m;

        /* access modifiers changed from: public */
        a() {
        }
    }

    public c(d dVar, a aVar) {
        this.f7304d = dVar;
        this.e = aVar;
    }

    public final void a(c cVar, int i8, int i9) {
        if (cVar == null) {
            g();
            return;
        }
        this.f7305f = cVar;
        if (cVar.f7301a == null) {
            cVar.f7301a = new HashSet<>();
        }
        HashSet<c> hashSet = this.f7305f.f7301a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        if (i8 > 0) {
            this.f7306g = i8;
        } else {
            this.f7306g = 0;
        }
        this.f7307h = i9;
    }

    public final void b(int i8, o oVar, ArrayList arrayList) {
        HashSet<c> hashSet = this.f7301a;
        if (hashSet != null) {
            Iterator<c> it = hashSet.iterator();
            while (it.hasNext()) {
                i.a(it.next().f7304d, i8, arrayList, oVar);
            }
        }
    }

    public final int c() {
        if (!this.f7303c) {
            return 0;
        }
        return this.f7302b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        r2 = r3.f7305f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int d() {
        /*
            r3 = this;
            t.d r0 = r3.f7304d
            int r0 = r0.f7325d0
            r1 = 8
            if (r0 != r1) goto L_0x000a
            r3 = 0
            return r3
        L_0x000a:
            int r0 = r3.f7307h
            r2 = -1
            if (r0 <= r2) goto L_0x001a
            t.c r2 = r3.f7305f
            if (r2 == 0) goto L_0x001a
            t.d r2 = r2.f7304d
            int r2 = r2.f7325d0
            if (r2 != r1) goto L_0x001a
            return r0
        L_0x001a:
            int r3 = r3.f7306g
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: t.c.d():int");
    }

    public final boolean e() {
        c cVar;
        HashSet<c> hashSet = this.f7301a;
        if (hashSet == null) {
            return false;
        }
        Iterator<c> it = hashSet.iterator();
        while (it.hasNext()) {
            c next = it.next();
            a aVar = next.e;
            int ordinal = aVar.ordinal();
            d dVar = next.f7304d;
            switch (ordinal) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                    cVar = null;
                    break;
                case 1:
                    cVar = dVar.G;
                    break;
                case 2:
                    cVar = dVar.H;
                    break;
                case 3:
                    cVar = dVar.E;
                    break;
                case 4:
                    cVar = dVar.F;
                    break;
                default:
                    throw new AssertionError(aVar.name());
            }
            if (cVar.f()) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.f7305f != null;
    }

    public final void g() {
        HashSet<c> hashSet;
        c cVar = this.f7305f;
        if (!(cVar == null || (hashSet = cVar.f7301a) == null)) {
            hashSet.remove(this);
            if (this.f7305f.f7301a.size() == 0) {
                this.f7305f.f7301a = null;
            }
        }
        this.f7301a = null;
        this.f7305f = null;
        this.f7306g = 0;
        this.f7307h = -1;
        this.f7303c = false;
        this.f7302b = 0;
    }

    public final void h() {
        h hVar = this.f7308i;
        if (hVar == null) {
            this.f7308i = new h(1);
        } else {
            hVar.c();
        }
    }

    public final void i(int i8) {
        this.f7302b = i8;
        this.f7303c = true;
    }

    public final String toString() {
        return this.f7304d.f7326e0 + ":" + this.e.toString();
    }
}
