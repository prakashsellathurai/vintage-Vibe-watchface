package com.google.protobuf;

import java.io.Serializable;

public enum c0 {
    VOID(Void.class, (int) null),
    INT(r7, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(i.class, i.f3648g),
    ENUM(r7, (int) null),
    MESSAGE(Object.class, (int) null);
    

    /* renamed from: f  reason: collision with root package name */
    public final Object f3611f;

    /* access modifiers changed from: public */
    c0(Class cls, Serializable serializable) {
        this.f3611f = serializable;
    }
}
