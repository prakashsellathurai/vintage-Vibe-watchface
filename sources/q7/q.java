package q7;

import u7.b;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final r f6644a;

    /* renamed from: b  reason: collision with root package name */
    public static final b[] f6645b = new b[0];

    static {
        r rVar = null;
        try {
            rVar = (r) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (rVar == null) {
            rVar = new r();
        }
        f6644a = rVar;
    }

    public static f a(Class cls) {
        f6644a.getClass();
        return new f(cls);
    }
}
