package g8;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static j f4709a;

    /* renamed from: b  reason: collision with root package name */
    public static long f4710b;

    public static void a(j jVar) {
        if (jVar.f4707f != null || jVar.f4708g != null) {
            throw new IllegalArgumentException();
        } else if (!jVar.f4706d) {
            synchronized (k.class) {
                long j8 = f4710b + 8192;
                if (j8 <= 65536) {
                    f4710b = j8;
                    jVar.f4707f = f4709a;
                    jVar.f4705c = 0;
                    jVar.f4704b = 0;
                    f4709a = jVar;
                }
            }
        }
    }

    public static j b() {
        synchronized (k.class) {
            j jVar = f4709a;
            if (jVar == null) {
                return new j();
            }
            f4709a = jVar.f4707f;
            jVar.f4707f = null;
            f4710b -= 8192;
            return jVar;
        }
    }
}
