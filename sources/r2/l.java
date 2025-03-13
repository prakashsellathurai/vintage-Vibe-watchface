package r2;

public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static final b f6823a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final c f6824b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final e f6825c = new e();

    public class a extends l {
        public final boolean a() {
            return true;
        }

        public final boolean b() {
            return true;
        }

        public final boolean c(p2.a aVar) {
            return aVar == p2.a.f6295g;
        }

        public final boolean d(boolean z8, p2.a aVar, p2.c cVar) {
            return (aVar == p2.a.f6297i || aVar == p2.a.f6298j) ? false : true;
        }
    }

    public class b extends l {
        public final boolean a() {
            return false;
        }

        public final boolean b() {
            return false;
        }

        public final boolean c(p2.a aVar) {
            return false;
        }

        public final boolean d(boolean z8, p2.a aVar, p2.c cVar) {
            return false;
        }
    }

    public class c extends l {
        public final boolean a() {
            return true;
        }

        public final boolean b() {
            return false;
        }

        public final boolean c(p2.a aVar) {
            return (aVar == p2.a.f6296h || aVar == p2.a.f6298j) ? false : true;
        }

        public final boolean d(boolean z8, p2.a aVar, p2.c cVar) {
            return false;
        }
    }

    public class d extends l {
        public final boolean a() {
            return false;
        }

        public final boolean b() {
            return true;
        }

        public final boolean c(p2.a aVar) {
            return false;
        }

        public final boolean d(boolean z8, p2.a aVar, p2.c cVar) {
            return (aVar == p2.a.f6297i || aVar == p2.a.f6298j) ? false : true;
        }
    }

    public class e extends l {
        public final boolean a() {
            return true;
        }

        public final boolean b() {
            return true;
        }

        public final boolean c(p2.a aVar) {
            return aVar == p2.a.f6295g;
        }

        public final boolean d(boolean z8, p2.a aVar, p2.c cVar) {
            return ((z8 && aVar == p2.a.f6296h) || aVar == p2.a.f6294f) && cVar == p2.c.f6304g;
        }
    }

    static {
        new a();
        new d();
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(p2.a aVar);

    public abstract boolean d(boolean z8, p2.a aVar, p2.c cVar);
}
