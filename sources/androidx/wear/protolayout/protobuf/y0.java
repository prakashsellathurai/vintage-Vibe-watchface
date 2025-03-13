package androidx.wear.protolayout.protobuf;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

public final class y0 {

    /* renamed from: c  reason: collision with root package name */
    public static final y0 f2217c = new y0();

    /* renamed from: a  reason: collision with root package name */
    public final g0 f2218a = new g0();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f2219b = new ConcurrentHashMap();

    public final <T> b1<T> a(Class<T> cls) {
        s0 s0Var;
        j0 j0Var;
        o<?> oVar;
        h1<?, ?> h1Var;
        e0 e0Var;
        t0 t0Var;
        t0 t0Var2;
        e0 e0Var2;
        h1<?, ?> h1Var2;
        o<?> oVar2;
        s0 s0Var2;
        Class<?> cls2;
        Charset charset = x.f2214a;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.f2219b;
            b1<T> b1Var = (b1) concurrentHashMap.get(cls);
            if (b1Var != null) {
                return b1Var;
            }
            g0 g0Var = this.f2218a;
            g0Var.getClass();
            Class<?> cls3 = c1.f2063a;
            Class<v> cls4 = v.class;
            if (cls4.isAssignableFrom(cls) || (cls2 = c1.f2063a) == null || cls2.isAssignableFrom(cls)) {
                m0 a9 = g0Var.f2103a.a(cls);
                if (a9.b()) {
                    if (cls4.isAssignableFrom(cls)) {
                        s0Var2 = new s0(c1.f2066d, q.f2165a, a9.c());
                    } else {
                        h1<?, ?> h1Var3 = c1.f2064b;
                        o<?> oVar3 = q.f2166b;
                        if (oVar3 != null) {
                            s0Var2 = new s0(h1Var3, oVar3, a9.c());
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    s0Var = s0Var2;
                } else {
                    boolean z8 = false;
                    if (cls4.isAssignableFrom(cls)) {
                        if (a9.a() == 1) {
                            z8 = true;
                        }
                        if (z8) {
                            t0Var = v0.f2211b;
                            e0Var = e0.f2072b;
                            h1Var = c1.f2066d;
                            oVar = q.f2165a;
                        } else {
                            t0Var = v0.f2211b;
                            e0Var = e0.f2072b;
                            h1Var = c1.f2066d;
                            oVar = null;
                        }
                        j0Var = l0.f2137b;
                    } else {
                        if (a9.a() == 1) {
                            z8 = true;
                        }
                        if (z8) {
                            t0Var2 = v0.f2210a;
                            e0Var2 = e0.f2071a;
                            h1<?, ?> h1Var4 = c1.f2064b;
                            o<?> oVar4 = q.f2166b;
                            if (oVar4 != null) {
                                h1Var2 = h1Var4;
                                oVar2 = oVar4;
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            t0Var2 = v0.f2210a;
                            e0Var2 = e0.f2071a;
                            h1Var2 = c1.f2065c;
                            oVar2 = null;
                        }
                        j0Var = l0.f2136a;
                    }
                    t0 t0Var3 = t0Var;
                    e0 e0Var3 = e0Var;
                    h1<?, ?> h1Var5 = h1Var;
                    o<?> oVar5 = oVar;
                    j0 j0Var2 = j0Var;
                    int[] iArr = r0.r;
                    if (a9 instanceof z0) {
                        s0Var = r0.z((z0) a9, t0Var3, e0Var3, h1Var5, oVar5, j0Var2);
                    } else {
                        f1 f1Var = (f1) a9;
                        throw null;
                    }
                }
                b1<T> b1Var2 = (b1) concurrentHashMap.putIfAbsent(cls, s0Var);
                return b1Var2 != null ? b1Var2 : s0Var;
            }
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        throw new NullPointerException("messageType");
    }
}
