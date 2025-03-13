package androidx.wear.protolayout.protobuf;

import java.io.Serializable;

public enum o1 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(g.f2096g),
    ENUM((String) null),
    MESSAGE((String) null);
    

    /* renamed from: f  reason: collision with root package name */
    public final Object f2164f;

    /* access modifiers changed from: public */
    o1(Serializable serializable) {
        this.f2164f = serializable;
    }
}
