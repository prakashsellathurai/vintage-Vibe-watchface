package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

public final class b1 {

    /* renamed from: c  reason: collision with root package name */
    public static final b1 f3596c = new b1();

    /* renamed from: a  reason: collision with root package name */
    public final j0 f3597a = new j0();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f3598b = new ConcurrentHashMap();

    public final <T> f1<T> a(Class<T> cls) {
        v0 v0Var;
        m0 m0Var;
        r<?> rVar;
        m1<?, ?> m1Var;
        h0 h0Var;
        w0 w0Var;
        w0 w0Var2;
        h0 h0Var2;
        m1<?, ?> m1Var2;
        r<?> rVar2;
        v0 v0Var2;
        Class<?> cls2;
        Charset charset = a0.f3589a;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.f3598b;
            f1<T> f1Var = (f1) concurrentHashMap.get(cls);
            if (f1Var != null) {
                return f1Var;
            }
            j0 j0Var = this.f3597a;
            j0Var.getClass();
            Class<?> cls3 = g1.f3638a;
            Class<y> cls4 = y.class;
            if (cls4.isAssignableFrom(cls) || (cls2 = g1.f3638a) == null || cls2.isAssignableFrom(cls)) {
                p0 a9 = j0Var.f3699a.a(cls);
                if (a9.b()) {
                    if (cls4.isAssignableFrom(cls)) {
                        v0Var2 = new v0(g1.f3641d, t.f3763a, a9.c());
                    } else {
                        m1<?, ?> m1Var3 = g1.f3639b;
                        r<?> rVar3 = t.f3764b;
                        if (rVar3 != null) {
                            v0Var2 = new v0(m1Var3, rVar3, a9.c());
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    v0Var = v0Var2;
                } else {
                    boolean z8 = false;
                    if (cls4.isAssignableFrom(cls)) {
                        if (a9.a() == 1) {
                            z8 = true;
                        }
                        if (z8) {
                            w0Var = y0.f3829b;
                            h0Var = h0.f3646b;
                            m1Var = g1.f3641d;
                            rVar = t.f3763a;
                        } else {
                            w0Var = y0.f3829b;
                            h0Var = h0.f3646b;
                            m1Var = g1.f3641d;
                            rVar = null;
                        }
                        m0Var = o0.f3732b;
                    } else {
                        if (a9.a() == 1) {
                            z8 = true;
                        }
                        if (z8) {
                            w0Var2 = y0.f3828a;
                            h0Var2 = h0.f3645a;
                            m1<?, ?> m1Var4 = g1.f3639b;
                            r<?> rVar4 = t.f3764b;
                            if (rVar4 != null) {
                                m1Var2 = m1Var4;
                                rVar2 = rVar4;
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            w0Var2 = y0.f3828a;
                            h0Var2 = h0.f3645a;
                            m1Var2 = g1.f3640c;
                            rVar2 = null;
                        }
                        m0Var = o0.f3731a;
                    }
                    w0 w0Var3 = w0Var;
                    h0 h0Var3 = h0Var;
                    m1<?, ?> m1Var5 = m1Var;
                    r<?> rVar5 = rVar;
                    m0 m0Var2 = m0Var;
                    int[] iArr = u0.r;
                    if (a9 instanceof d1) {
                        v0Var = u0.x((d1) a9, w0Var3, h0Var3, m1Var5, rVar5, m0Var2);
                    } else {
                        j1 j1Var = (j1) a9;
                        throw null;
                    }
                }
                f1<T> f1Var2 = (f1) concurrentHashMap.putIfAbsent(cls, v0Var);
                return f1Var2 != null ? f1Var2 : v0Var;
            }
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        throw new NullPointerException("messageType");
    }
}
