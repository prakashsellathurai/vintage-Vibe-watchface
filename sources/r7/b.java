package r7;

import java.util.Random;
import q7.k;

public final class b extends a {

    /* renamed from: h  reason: collision with root package name */
    public final a f7118h = new a();

    public static final class a extends ThreadLocal<Random> {
        public final Object initialValue() {
            return new Random();
        }
    }

    public final Random b() {
        Object obj = this.f7118h.get();
        k.d(obj, "implStorage.get()");
        return (Random) obj;
    }
}
