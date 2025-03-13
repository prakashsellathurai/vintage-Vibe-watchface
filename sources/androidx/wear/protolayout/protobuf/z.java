package androidx.wear.protolayout.protobuf;

import java.io.Serializable;

public enum z {
    VOID(Void.class, (int) null),
    INT(r7, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(g.class, g.f2096g),
    ENUM(r7, (int) null),
    MESSAGE(Object.class, (int) null);
    

    /* renamed from: f  reason: collision with root package name */
    public final Object f2231f;

    /* access modifiers changed from: public */
    z(Class cls, Serializable serializable) {
        this.f2231f = serializable;
    }
}
