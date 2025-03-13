package b2;

import androidx.fragment.app.i0;
import java.util.ArrayList;
import java.util.List;
import k3.j;

public abstract class a<K, A> {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f2514a = new ArrayList(1);

    /* renamed from: b  reason: collision with root package name */
    public boolean f2515b = false;

    /* renamed from: c  reason: collision with root package name */
    public final c<K> f2516c;

    /* renamed from: d  reason: collision with root package name */
    public float f2517d = 0.0f;
    public i0 e;

    /* renamed from: f  reason: collision with root package name */
    public A f2518f = null;

    /* renamed from: g  reason: collision with root package name */
    public float f2519g = -1.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f2520h = -1.0f;

    /* renamed from: b2.a$a  reason: collision with other inner class name */
    public interface C0028a {
        void b();
    }

    public static final class b<T> implements c<T> {
        public final float a() {
            return 1.0f;
        }

        public final boolean b(float f9) {
            throw new IllegalStateException("not implemented");
        }

        public final float c() {
            return 0.0f;
        }

        public final l2.a<T> d() {
            throw new IllegalStateException("not implemented");
        }

        public final boolean e(float f9) {
            return false;
        }

        public final boolean isEmpty() {
            return true;
        }
    }

    public interface c<T> {
        float a();

        boolean b(float f9);

        float c();

        l2.a<T> d();

        boolean e(float f9);

        boolean isEmpty();
    }

    public static final class d<T> implements c<T> {

        /* renamed from: a  reason: collision with root package name */
        public final List<? extends l2.a<T>> f2521a;

        /* renamed from: b  reason: collision with root package name */
        public l2.a<T> f2522b;

        /* renamed from: c  reason: collision with root package name */
        public l2.a<T> f2523c = null;

        /* renamed from: d  reason: collision with root package name */
        public float f2524d = -1.0f;

        public d(List<? extends l2.a<T>> list) {
            this.f2521a = list;
            this.f2522b = f(0.0f);
        }

        public final float a() {
            List<? extends l2.a<T>> list = this.f2521a;
            return ((l2.a) list.get(list.size() - 1)).a();
        }

        public final boolean b(float f9) {
            l2.a<T> aVar = this.f2523c;
            l2.a<T> aVar2 = this.f2522b;
            if (aVar == aVar2 && this.f2524d == f9) {
                return true;
            }
            this.f2523c = aVar2;
            this.f2524d = f9;
            return false;
        }

        public final float c() {
            return ((l2.a) this.f2521a.get(0)).b();
        }

        public final l2.a<T> d() {
            return this.f2522b;
        }

        public final boolean e(float f9) {
            l2.a<T> aVar = this.f2522b;
            if (f9 >= aVar.b() && f9 < aVar.a()) {
                return !this.f2522b.c();
            }
            this.f2522b = f(f9);
            return true;
        }

        public final l2.a<T> f(float f9) {
            List<? extends l2.a<T>> list = this.f2521a;
            l2.a<T> aVar = (l2.a) list.get(list.size() - 1);
            if (f9 >= aVar.b()) {
                return aVar;
            }
            int size = list.size() - 2;
            while (true) {
                boolean z8 = false;
                if (size < 1) {
                    return (l2.a) list.get(0);
                }
                l2.a<T> aVar2 = (l2.a) list.get(size);
                if (this.f2522b != aVar2) {
                    if (f9 >= aVar2.b() && f9 < aVar2.a()) {
                        z8 = true;
                    }
                    if (z8) {
                        return aVar2;
                    }
                }
                size--;
            }
        }

        public final boolean isEmpty() {
            return false;
        }
    }

    public static final class e<T> implements c<T> {

        /* renamed from: a  reason: collision with root package name */
        public final l2.a<T> f2525a;

        /* renamed from: b  reason: collision with root package name */
        public float f2526b = -1.0f;

        public e(List<? extends l2.a<T>> list) {
            this.f2525a = (l2.a) list.get(0);
        }

        public final float a() {
            return this.f2525a.a();
        }

        public final boolean b(float f9) {
            if (this.f2526b == f9) {
                return true;
            }
            this.f2526b = f9;
            return false;
        }

        public final float c() {
            return this.f2525a.b();
        }

        public final l2.a<T> d() {
            return this.f2525a;
        }

        public final boolean e(float f9) {
            return !this.f2525a.c();
        }

        public final boolean isEmpty() {
            return false;
        }
    }

    public a(List<? extends l2.a<K>> list) {
        c<K> cVar;
        if (list.isEmpty()) {
            cVar = new b<>();
        } else {
            cVar = list.size() == 1 ? new e<>(list) : new d<>(list);
        }
        this.f2516c = cVar;
    }

    public final void a(C0028a aVar) {
        this.f2514a.add(aVar);
    }

    public final l2.a<K> b() {
        l2.a<K> d9 = this.f2516c.d();
        j.s();
        return d9;
    }

    public float c() {
        if (this.f2520h == -1.0f) {
            this.f2520h = this.f2516c.a();
        }
        return this.f2520h;
    }

    public final float d() {
        l2.a b9 = b();
        if (b9.c()) {
            return 0.0f;
        }
        return b9.f5271d.getInterpolation(e());
    }

    public final float e() {
        if (this.f2515b) {
            return 0.0f;
        }
        l2.a b9 = b();
        if (b9.c()) {
            return 0.0f;
        }
        return (this.f2517d - b9.b()) / (b9.a() - b9.b());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r3 = r1.f5272f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public A f() {
        /*
            r4 = this;
            float r0 = r4.e()
            androidx.fragment.app.i0 r1 = r4.e
            if (r1 != 0) goto L_0x0013
            b2.a$c<K> r1 = r4.f2516c
            boolean r1 = r1.b(r0)
            if (r1 == 0) goto L_0x0013
            A r4 = r4.f2518f
            return r4
        L_0x0013:
            l2.a r1 = r4.b()
            android.view.animation.Interpolator r2 = r1.e
            if (r2 == 0) goto L_0x002c
            android.view.animation.Interpolator r3 = r1.f5272f
            if (r3 == 0) goto L_0x002c
            float r2 = r2.getInterpolation(r0)
            float r3 = r3.getInterpolation(r0)
            java.lang.Object r0 = r4.h(r1, r0, r2, r3)
            goto L_0x0034
        L_0x002c:
            float r0 = r4.d()
            java.lang.Object r0 = r4.g(r1, r0)
        L_0x0034:
            r4.f2518f = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.a.f():java.lang.Object");
    }

    public abstract A g(l2.a<K> aVar, float f9);

    public A h(l2.a<K> aVar, float f9, float f10, float f11) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void i() {
        int i8 = 0;
        while (true) {
            ArrayList arrayList = this.f2514a;
            if (i8 < arrayList.size()) {
                ((C0028a) arrayList.get(i8)).b();
                i8++;
            } else {
                return;
            }
        }
    }

    public void j(float f9) {
        c<K> cVar = this.f2516c;
        if (!cVar.isEmpty()) {
            if (this.f2519g == -1.0f) {
                this.f2519g = cVar.c();
            }
            float f10 = this.f2519g;
            if (f9 < f10) {
                if (f10 == -1.0f) {
                    this.f2519g = cVar.c();
                }
                f9 = this.f2519g;
            } else if (f9 > c()) {
                f9 = c();
            }
            if (f9 != this.f2517d) {
                this.f2517d = f9;
                if (cVar.e(f9)) {
                    i();
                }
            }
        }
    }

    public final void k(i0 i0Var) {
        i0 i0Var2 = this.e;
        if (i0Var2 != null) {
            i0Var2.f1189b = null;
        }
        this.e = i0Var;
        if (i0Var != null) {
            i0Var.f1189b = this;
        }
    }
}
