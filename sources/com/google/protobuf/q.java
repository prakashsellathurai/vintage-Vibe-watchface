package com.google.protobuf;

import com.google.protobuf.y;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class q {

    /* renamed from: b  reason: collision with root package name */
    public static volatile q f3737b;

    /* renamed from: c  reason: collision with root package name */
    public static final q f3738c = new q(0);

    /* renamed from: a  reason: collision with root package name */
    public final Map<a, y.e<?, ?>> f3739a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Object f3740a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3741b;

        public a(int i8, Object obj) {
            this.f3740a = obj;
            this.f3741b = i8;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
            r4 = (com.google.protobuf.q.a) r4;
            r0 = r4.f3740a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof com.google.protobuf.q.a
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                com.google.protobuf.q$a r4 = (com.google.protobuf.q.a) r4
                java.lang.Object r0 = r4.f3740a
                java.lang.Object r2 = r3.f3740a
                if (r2 != r0) goto L_0x0015
                int r3 = r3.f3741b
                int r4 = r4.f3741b
                if (r3 != r4) goto L_0x0015
                r1 = 1
            L_0x0015:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.q.a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f3740a) * 65535) + this.f3741b;
        }
    }

    public q() {
        this.f3739a = new HashMap();
    }

    public q(int i8) {
        this.f3739a = Collections.emptyMap();
    }

    public static q a() {
        q qVar = f3737b;
        if (qVar == null) {
            synchronized (q.class) {
                qVar = f3737b;
                if (qVar == null) {
                    Class<?> cls = p.f3733a;
                    q qVar2 = null;
                    if (cls != null) {
                        try {
                            qVar2 = (q) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke((Object) null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    if (qVar2 == null) {
                        qVar2 = f3738c;
                    }
                    f3737b = qVar2;
                    qVar = qVar2;
                }
            }
        }
        return qVar;
    }
}
