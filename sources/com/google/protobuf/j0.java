package com.google.protobuf;

import java.nio.charset.Charset;

public final class j0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f3698b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final q0 f3699a;

    public static class a implements q0 {
        public final p0 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        public final boolean b(Class<?> cls) {
            return false;
        }
    }

    public static class b implements q0 {

        /* renamed from: a  reason: collision with root package name */
        public final q0[] f3700a;

        public b(q0... q0VarArr) {
            this.f3700a = q0VarArr;
        }

        public final p0 a(Class<?> cls) {
            for (q0 q0Var : this.f3700a) {
                if (q0Var.b(cls)) {
                    return q0Var.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }

        public final boolean b(Class<?> cls) {
            for (q0 b9 : this.f3700a) {
                if (b9.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public j0() {
        q0 q0Var;
        q0[] q0VarArr = new q0[2];
        q0VarArr[0] = x.f3809a;
        try {
            q0Var = (q0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            q0Var = f3698b;
        }
        q0VarArr[1] = q0Var;
        b bVar = new b(q0VarArr);
        Charset charset = a0.f3589a;
        this.f3699a = bVar;
    }
}
