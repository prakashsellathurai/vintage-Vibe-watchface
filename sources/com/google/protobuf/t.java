package com.google.protobuf;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final s f3763a = new s();

    /* renamed from: b  reason: collision with root package name */
    public static final r<?> f3764b;

    static {
        r<?> rVar;
        try {
            rVar = (r) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            rVar = null;
        }
        f3764b = rVar;
    }
}
