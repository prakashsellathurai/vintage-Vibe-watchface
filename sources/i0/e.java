package i0;

public final class e<T> extends s.e {

    /* renamed from: d  reason: collision with root package name */
    public final Object f4791d = new Object();

    public e(int i8) {
        super(i8, 1);
    }

    public final boolean a(T t8) {
        boolean a9;
        synchronized (this.f4791d) {
            a9 = super.a(t8);
        }
        return a9;
    }

    public final T b() {
        T b9;
        synchronized (this.f4791d) {
            b9 = super.b();
        }
        return b9;
    }
}
