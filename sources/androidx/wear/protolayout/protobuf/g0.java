package androidx.wear.protolayout.protobuf;

import java.nio.charset.Charset;

public final class g0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f2102b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final n0 f2103a;

    public static class a implements n0 {
        public final m0 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        public final boolean b(Class<?> cls) {
            return false;
        }
    }

    public static class b implements n0 {

        /* renamed from: a  reason: collision with root package name */
        public final n0[] f2104a;

        public b(n0... n0VarArr) {
            this.f2104a = n0VarArr;
        }

        public final m0 a(Class<?> cls) {
            for (n0 n0Var : this.f2104a) {
                if (n0Var.b(cls)) {
                    return n0Var.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }

        public final boolean b(Class<?> cls) {
            for (n0 b9 : this.f2104a) {
                if (b9.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public g0() {
        n0 n0Var;
        n0[] n0VarArr = new n0[2];
        n0VarArr[0] = u.f2200a;
        try {
            n0Var = (n0) Class.forName("androidx.wear.protolayout.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            n0Var = f2102b;
        }
        n0VarArr[1] = n0Var;
        b bVar = new b(n0VarArr);
        Charset charset = x.f2214a;
        this.f2103a = bVar;
    }
}
