package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

public final class q1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f3742a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?> f3743b = d.f3615a;

    /* renamed from: c  reason: collision with root package name */
    public static final e f3744c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f3745d;
    public static final boolean e;

    /* renamed from: f  reason: collision with root package name */
    public static final long f3746f = ((long) c(byte[].class));

    /* renamed from: g  reason: collision with root package name */
    public static final long f3747g;

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f3748h;

    public static class a implements PrivilegedExceptionAction<Unsafe> {
        public static Unsafe a() {
            Class<Unsafe> cls = Unsafe.class;
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get((Object) null);
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            return null;
        }

        public final /* bridge */ /* synthetic */ Object run() {
            return a();
        }
    }

    public static final class b extends e {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        public final void c(long j8, byte[] bArr, long j9) {
            throw new UnsupportedOperationException();
        }

        public final boolean d(long j8, Object obj) {
            return q1.f3748h ? q1.j(j8, obj) != 0 : q1.k(j8, obj) != 0;
        }

        public final byte e(long j8) {
            throw new UnsupportedOperationException();
        }

        public final byte f(long j8, Object obj) {
            return q1.f3748h ? q1.j(j8, obj) : q1.k(j8, obj);
        }

        public final double g(long j8, Object obj) {
            return Double.longBitsToDouble(j(j8, obj));
        }

        public final float h(long j8, Object obj) {
            return Float.intBitsToFloat(i(j8, obj));
        }

        public final void m(Object obj, long j8, boolean z8) {
            if (q1.f3748h) {
                q1.t(obj, j8, z8 ? (byte) 1 : 0);
            } else {
                q1.u(obj, j8, z8 ? (byte) 1 : 0);
            }
        }

        public final void n(Object obj, long j8, byte b9) {
            if (q1.f3748h) {
                q1.t(obj, j8, b9);
            } else {
                q1.u(obj, j8, b9);
            }
        }

        public final void o(Object obj, long j8, double d9) {
            r(obj, j8, Double.doubleToLongBits(d9));
        }

        public final void p(Object obj, long j8, float f9) {
            q(Float.floatToIntBits(f9), j8, obj);
        }

        public final boolean u() {
            return false;
        }
    }

    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        public final void c(long j8, byte[] bArr, long j9) {
            throw new UnsupportedOperationException();
        }

        public final boolean d(long j8, Object obj) {
            return q1.f3748h ? q1.j(j8, obj) != 0 : q1.k(j8, obj) != 0;
        }

        public final byte e(long j8) {
            throw new UnsupportedOperationException();
        }

        public final byte f(long j8, Object obj) {
            return q1.f3748h ? q1.j(j8, obj) : q1.k(j8, obj);
        }

        public final double g(long j8, Object obj) {
            return Double.longBitsToDouble(j(j8, obj));
        }

        public final float h(long j8, Object obj) {
            return Float.intBitsToFloat(i(j8, obj));
        }

        public final void m(Object obj, long j8, boolean z8) {
            if (q1.f3748h) {
                q1.t(obj, j8, z8 ? (byte) 1 : 0);
            } else {
                q1.u(obj, j8, z8 ? (byte) 1 : 0);
            }
        }

        public final void n(Object obj, long j8, byte b9) {
            if (q1.f3748h) {
                q1.t(obj, j8, b9);
            } else {
                q1.u(obj, j8, b9);
            }
        }

        public final void o(Object obj, long j8, double d9) {
            r(obj, j8, Double.doubleToLongBits(d9));
        }

        public final void p(Object obj, long j8, float f9) {
            q(Float.floatToIntBits(f9), j8, obj);
        }

        public final boolean u() {
            return false;
        }
    }

    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        public final void c(long j8, byte[] bArr, long j9) {
            this.f3749a.copyMemory((Object) null, j8, bArr, q1.f3746f + 0, j9);
        }

        public final boolean d(long j8, Object obj) {
            return this.f3749a.getBoolean(obj, j8);
        }

        public final byte e(long j8) {
            return this.f3749a.getByte(j8);
        }

        public final byte f(long j8, Object obj) {
            return this.f3749a.getByte(obj, j8);
        }

        public final double g(long j8, Object obj) {
            return this.f3749a.getDouble(obj, j8);
        }

        public final float h(long j8, Object obj) {
            return this.f3749a.getFloat(obj, j8);
        }

        public final void m(Object obj, long j8, boolean z8) {
            this.f3749a.putBoolean(obj, j8, z8);
        }

        public final void n(Object obj, long j8, byte b9) {
            this.f3749a.putByte(obj, j8, b9);
        }

        public final void o(Object obj, long j8, double d9) {
            this.f3749a.putDouble(obj, j8, d9);
        }

        public final void p(Object obj, long j8, float f9) {
            this.f3749a.putFloat(obj, j8, f9);
        }

        public final boolean t() {
            Class<Object> cls = Object.class;
            if (!super.t()) {
                return false;
            }
            try {
                Class<?> cls2 = this.f3749a.getClass();
                Class cls3 = Long.TYPE;
                cls2.getMethod("getByte", new Class[]{cls, cls3});
                cls2.getMethod("putByte", new Class[]{cls, cls3, Byte.TYPE});
                cls2.getMethod("getBoolean", new Class[]{cls, cls3});
                cls2.getMethod("putBoolean", new Class[]{cls, cls3, Boolean.TYPE});
                cls2.getMethod("getFloat", new Class[]{cls, cls3});
                cls2.getMethod("putFloat", new Class[]{cls, cls3, Float.TYPE});
                cls2.getMethod("getDouble", new Class[]{cls, cls3});
                cls2.getMethod("putDouble", new Class[]{cls, cls3, Double.TYPE});
                return true;
            } catch (Throwable th) {
                q1.a(th);
                return false;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0039 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x003a A[SYNTHETIC, Splitter:B:11:0x003a] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean u() {
            /*
                r10 = this;
                java.lang.String r0 = "copyMemory"
                java.lang.String r1 = "getLong"
                sun.misc.Unsafe r10 = r10.f3749a
                java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
                r3 = 2
                r4 = 1
                r5 = 0
                if (r10 != 0) goto L_0x000f
            L_0x000d:
                r6 = r5
                goto L_0x0037
            L_0x000f:
                java.lang.Class r6 = r10.getClass()     // Catch:{ all -> 0x0032 }
                java.lang.String r7 = "objectFieldOffset"
                java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch:{ all -> 0x0032 }
                java.lang.Class<java.lang.reflect.Field> r9 = java.lang.reflect.Field.class
                r8[r5] = r9     // Catch:{ all -> 0x0032 }
                r6.getMethod(r7, r8)     // Catch:{ all -> 0x0032 }
                java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ all -> 0x0032 }
                r7[r5] = r2     // Catch:{ all -> 0x0032 }
                java.lang.Class r8 = java.lang.Long.TYPE     // Catch:{ all -> 0x0032 }
                r7[r4] = r8     // Catch:{ all -> 0x0032 }
                r6.getMethod(r1, r7)     // Catch:{ all -> 0x0032 }
                java.lang.reflect.Field r6 = com.google.protobuf.q1.e()     // Catch:{ all -> 0x0032 }
                if (r6 != 0) goto L_0x0030
                goto L_0x000d
            L_0x0030:
                r6 = r4
                goto L_0x0037
            L_0x0032:
                r6 = move-exception
                com.google.protobuf.q1.a(r6)
                goto L_0x000d
            L_0x0037:
                if (r6 != 0) goto L_0x003a
                return r5
            L_0x003a:
                java.lang.Class r10 = r10.getClass()     // Catch:{ all -> 0x009c }
                java.lang.String r6 = "getByte"
                java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ all -> 0x009c }
                java.lang.Class r8 = java.lang.Long.TYPE     // Catch:{ all -> 0x009c }
                r7[r5] = r8     // Catch:{ all -> 0x009c }
                r10.getMethod(r6, r7)     // Catch:{ all -> 0x009c }
                java.lang.String r6 = "putByte"
                java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ all -> 0x009c }
                r7[r5] = r8     // Catch:{ all -> 0x009c }
                java.lang.Class r9 = java.lang.Byte.TYPE     // Catch:{ all -> 0x009c }
                r7[r4] = r9     // Catch:{ all -> 0x009c }
                r10.getMethod(r6, r7)     // Catch:{ all -> 0x009c }
                java.lang.String r6 = "getInt"
                java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ all -> 0x009c }
                r7[r5] = r8     // Catch:{ all -> 0x009c }
                r10.getMethod(r6, r7)     // Catch:{ all -> 0x009c }
                java.lang.String r6 = "putInt"
                java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ all -> 0x009c }
                r7[r5] = r8     // Catch:{ all -> 0x009c }
                java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ all -> 0x009c }
                r7[r4] = r9     // Catch:{ all -> 0x009c }
                r10.getMethod(r6, r7)     // Catch:{ all -> 0x009c }
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ all -> 0x009c }
                r6[r5] = r8     // Catch:{ all -> 0x009c }
                r10.getMethod(r1, r6)     // Catch:{ all -> 0x009c }
                java.lang.String r1 = "putLong"
                java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ all -> 0x009c }
                r6[r5] = r8     // Catch:{ all -> 0x009c }
                r6[r4] = r8     // Catch:{ all -> 0x009c }
                r10.getMethod(r1, r6)     // Catch:{ all -> 0x009c }
                r1 = 3
                java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ all -> 0x009c }
                r6[r5] = r8     // Catch:{ all -> 0x009c }
                r6[r4] = r8     // Catch:{ all -> 0x009c }
                r6[r3] = r8     // Catch:{ all -> 0x009c }
                r10.getMethod(r0, r6)     // Catch:{ all -> 0x009c }
                r6 = 5
                java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch:{ all -> 0x009c }
                r6[r5] = r2     // Catch:{ all -> 0x009c }
                r6[r4] = r8     // Catch:{ all -> 0x009c }
                r6[r3] = r2     // Catch:{ all -> 0x009c }
                r6[r1] = r8     // Catch:{ all -> 0x009c }
                r1 = 4
                r6[r1] = r8     // Catch:{ all -> 0x009c }
                r10.getMethod(r0, r6)     // Catch:{ all -> 0x009c }
                return r4
            L_0x009c:
                r10 = move-exception
                com.google.protobuf.q1.a(r10)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.q1.d.u():boolean");
        }
    }

    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        public final Unsafe f3749a;

        public e(Unsafe unsafe) {
            this.f3749a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f3749a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f3749a.arrayIndexScale(cls);
        }

        public abstract void c(long j8, byte[] bArr, long j9);

        public abstract boolean d(long j8, Object obj);

        public abstract byte e(long j8);

        public abstract byte f(long j8, Object obj);

        public abstract double g(long j8, Object obj);

        public abstract float h(long j8, Object obj);

        public final int i(long j8, Object obj) {
            return this.f3749a.getInt(obj, j8);
        }

        public final long j(long j8, Object obj) {
            return this.f3749a.getLong(obj, j8);
        }

        public final Object k(long j8, Object obj) {
            return this.f3749a.getObject(obj, j8);
        }

        public final long l(Field field) {
            return this.f3749a.objectFieldOffset(field);
        }

        public abstract void m(Object obj, long j8, boolean z8);

        public abstract void n(Object obj, long j8, byte b9);

        public abstract void o(Object obj, long j8, double d9);

        public abstract void p(Object obj, long j8, float f9);

        public final void q(int i8, long j8, Object obj) {
            this.f3749a.putInt(obj, j8, i8);
        }

        public final void r(Object obj, long j8, long j9) {
            this.f3749a.putLong(obj, j8, j9);
        }

        public final void s(long j8, Object obj, Object obj2) {
            this.f3749a.putObject(obj, j8, obj2);
        }

        public boolean t() {
            Class<Class> cls = Class.class;
            Class<Object> cls2 = Object.class;
            Unsafe unsafe = this.f3749a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls3 = unsafe.getClass();
                cls3.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls3.getMethod("arrayBaseOffset", new Class[]{cls});
                cls3.getMethod("arrayIndexScale", new Class[]{cls});
                Class cls4 = Long.TYPE;
                cls3.getMethod("getInt", new Class[]{cls2, cls4});
                cls3.getMethod("putInt", new Class[]{cls2, cls4, Integer.TYPE});
                cls3.getMethod("getLong", new Class[]{cls2, cls4});
                cls3.getMethod("putLong", new Class[]{cls2, cls4, cls4});
                cls3.getMethod("getObject", new Class[]{cls2, cls4});
                cls3.getMethod("putObject", new Class[]{cls2, cls4, cls2});
                return true;
            } catch (Throwable th) {
                q1.a(th);
                return false;
            }
        }

        public abstract boolean u();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a0  */
    static {
        /*
            sun.misc.Unsafe r0 = q()
            f3742a = r0
            java.lang.Class<?> r1 = com.google.protobuf.d.f3615a
            f3743b = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r1 = f(r1)
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r2 = f(r2)
            if (r0 != 0) goto L_0x0019
            goto L_0x002f
        L_0x0019:
            boolean r3 = com.google.protobuf.d.a()
            if (r3 == 0) goto L_0x0031
            if (r1 == 0) goto L_0x0027
            com.google.protobuf.q1$c r1 = new com.google.protobuf.q1$c
            r1.<init>(r0)
            goto L_0x0036
        L_0x0027:
            if (r2 == 0) goto L_0x002f
            com.google.protobuf.q1$b r1 = new com.google.protobuf.q1$b
            r1.<init>(r0)
            goto L_0x0036
        L_0x002f:
            r1 = 0
            goto L_0x0036
        L_0x0031:
            com.google.protobuf.q1$d r1 = new com.google.protobuf.q1$d
            r1.<init>(r0)
        L_0x0036:
            f3744c = r1
            r0 = 0
            if (r1 != 0) goto L_0x003d
            r2 = r0
            goto L_0x0041
        L_0x003d:
            boolean r2 = r1.u()
        L_0x0041:
            f3745d = r2
            if (r1 != 0) goto L_0x0047
            r2 = r0
            goto L_0x004b
        L_0x0047:
            boolean r2 = r1.t()
        L_0x004b:
            e = r2
            java.lang.Class<byte[]> r2 = byte[].class
            int r2 = c(r2)
            long r2 = (long) r2
            f3746f = r2
            java.lang.Class<boolean[]> r2 = boolean[].class
            c(r2)
            d(r2)
            java.lang.Class<int[]> r2 = int[].class
            c(r2)
            d(r2)
            java.lang.Class<long[]> r2 = long[].class
            c(r2)
            d(r2)
            java.lang.Class<float[]> r2 = float[].class
            c(r2)
            d(r2)
            java.lang.Class<double[]> r2 = double[].class
            c(r2)
            d(r2)
            java.lang.Class<java.lang.Object[]> r2 = java.lang.Object[].class
            c(r2)
            d(r2)
            java.lang.reflect.Field r2 = e()
            if (r2 == 0) goto L_0x0094
            if (r1 != 0) goto L_0x008f
            goto L_0x0094
        L_0x008f:
            long r1 = r1.l(r2)
            goto L_0x0096
        L_0x0094:
            r1 = -1
        L_0x0096:
            f3747g = r1
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 != r2) goto L_0x00a1
            r0 = 1
        L_0x00a1:
            f3748h = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.q1.<clinit>():void");
    }

    public static void a(Throwable th) {
        Logger logger = Logger.getLogger(q1.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static <T> T b(Class<T> cls) {
        try {
            return f3742a.allocateInstance(cls);
        } catch (InstantiationException e4) {
            throw new IllegalStateException(e4);
        }
    }

    public static int c(Class<?> cls) {
        if (e) {
            return f3744c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (e) {
            f3744c.b(cls);
        }
    }

    public static Field e() {
        Field field;
        Field field2;
        Class<Buffer> cls = Buffer.class;
        if (d.a()) {
            try {
                field2 = cls.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = cls.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static boolean f(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!d.a()) {
            return false;
        }
        try {
            Class<?> cls3 = f3743b;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean g(long j8, Object obj) {
        return f3744c.d(j8, obj);
    }

    public static byte h(long j8) {
        return f3744c.e(j8);
    }

    public static byte i(byte[] bArr, long j8) {
        return f3744c.f(f3746f + j8, bArr);
    }

    public static byte j(long j8, Object obj) {
        return (byte) ((n(-4 & j8, obj) >>> ((int) (((~j8) & 3) << 3))) & 255);
    }

    public static byte k(long j8, Object obj) {
        return (byte) ((n(-4 & j8, obj) >>> ((int) ((j8 & 3) << 3))) & 255);
    }

    public static double l(long j8, Object obj) {
        return f3744c.g(j8, obj);
    }

    public static float m(long j8, Object obj) {
        return f3744c.h(j8, obj);
    }

    public static int n(long j8, Object obj) {
        return f3744c.i(j8, obj);
    }

    public static long o(long j8, Object obj) {
        return f3744c.j(j8, obj);
    }

    public static Object p(long j8, Object obj) {
        return f3744c.k(j8, obj);
    }

    public static Unsafe q() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void r(Object obj, long j8, boolean z8) {
        f3744c.m(obj, j8, z8);
    }

    public static void s(byte[] bArr, long j8, byte b9) {
        f3744c.n(bArr, f3746f + j8, b9);
    }

    public static void t(Object obj, long j8, byte b9) {
        long j9 = -4 & j8;
        int n8 = n(j9, obj);
        int i8 = ((~((int) j8)) & 3) << 3;
        x(((255 & b9) << i8) | (n8 & (~(255 << i8))), j9, obj);
    }

    public static void u(Object obj, long j8, byte b9) {
        long j9 = -4 & j8;
        int i8 = (((int) j8) & 3) << 3;
        x(((255 & b9) << i8) | (n(j9, obj) & (~(255 << i8))), j9, obj);
    }

    public static void v(Object obj, long j8, double d9) {
        f3744c.o(obj, j8, d9);
    }

    public static void w(Object obj, long j8, float f9) {
        f3744c.p(obj, j8, f9);
    }

    public static void x(int i8, long j8, Object obj) {
        f3744c.q(i8, j8, obj);
    }

    public static void y(Object obj, long j8, long j9) {
        f3744c.r(obj, j8, j9);
    }

    public static void z(long j8, Object obj, Object obj2) {
        f3744c.s(j8, obj, obj2);
    }
}
