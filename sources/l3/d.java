package l3;

public abstract class d {

    public static class a extends d {

        /* renamed from: a  reason: collision with root package name */
        public volatile boolean f5291a;

        public final void a() {
            if (this.f5291a) {
                throw new IllegalStateException("Already released");
            }
        }
    }
}
