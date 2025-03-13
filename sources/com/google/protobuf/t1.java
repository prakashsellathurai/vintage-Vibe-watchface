package com.google.protobuf;

import java.io.Serializable;

public enum t1 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(i.f3648g),
    ENUM((String) null),
    MESSAGE((String) null);
    

    /* renamed from: f  reason: collision with root package name */
    public final Object f3775f;

    /* access modifiers changed from: public */
    t1(Serializable serializable) {
        this.f3775f = serializable;
    }
}
