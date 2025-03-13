package com.google.protobuf;

public enum s1 {
    DOUBLE(t1.DOUBLE, 1),
    FLOAT(t1.FLOAT, 5),
    INT64(r5, 0),
    INT32(r9, 0),
    BOOL(t1.BOOLEAN, 0),
    ENUM(t1.ENUM, 0);
    

    /* renamed from: f  reason: collision with root package name */
    public final t1 f3761f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3762g;

    /* 'enum' modifier removed */
    public static class a extends s1 {
        public a() {
            super("STRING", 8, t1.STRING, 2);
        }
    }

    /* 'enum' modifier removed */
    public static class b extends s1 {
        public b(t1 t1Var) {
            super("GROUP", 9, t1Var, 3);
        }
    }

    /* 'enum' modifier removed */
    public static class c extends s1 {
        public c(t1 t1Var) {
            super("MESSAGE", 10, t1Var, 2);
        }
    }

    /* 'enum' modifier removed */
    public static class d extends s1 {
        public d(t1 t1Var) {
            super("BYTES", 11, t1Var, 2);
        }
    }

    /* access modifiers changed from: public */
    s1(t1 t1Var, int i8) {
        this.f3761f = t1Var;
        this.f3762g = i8;
    }
}
