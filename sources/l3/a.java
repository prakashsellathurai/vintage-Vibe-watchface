package l3;

import android.util.Log;
import l3.d;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0076a f5287a = new C0076a();

    /* renamed from: l3.a$a  reason: collision with other inner class name */
    public class C0076a implements e<Object> {
        public final void a(Object obj) {
        }
    }

    public interface b<T> {
        T a();
    }

    public static final class c<T> implements i0.d<T> {

        /* renamed from: a  reason: collision with root package name */
        public final b<T> f5288a;

        /* renamed from: b  reason: collision with root package name */
        public final e<T> f5289b;

        /* renamed from: c  reason: collision with root package name */
        public final i0.d<T> f5290c;

        public c(i0.e eVar, b bVar, e eVar2) {
            this.f5290c = eVar;
            this.f5288a = bVar;
            this.f5289b = eVar2;
        }

        public final boolean a(T t8) {
            if (t8 instanceof d) {
                ((d) t8).h().f5291a = true;
            }
            this.f5289b.a(t8);
            return this.f5290c.a(t8);
        }

        public final T b() {
            T b9 = this.f5290c.b();
            if (b9 == null) {
                b9 = this.f5288a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    b9.getClass().toString();
                }
            }
            if (b9 instanceof d) {
                ((d) b9).h().f5291a = false;
            }
            return b9;
        }
    }

    public interface d {
        d.a h();
    }

    public interface e<T> {
        void a(T t8);
    }

    public static c a(int i8, b bVar) {
        return new c(new i0.e(i8), bVar, f5287a);
    }
}
