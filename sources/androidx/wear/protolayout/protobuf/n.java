package androidx.wear.protolayout.protobuf;

import androidx.wear.protolayout.protobuf.v;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class n {

    /* renamed from: b  reason: collision with root package name */
    public static volatile n f2147b;

    /* renamed from: c  reason: collision with root package name */
    public static final n f2148c = new n(0);

    /* renamed from: a  reason: collision with root package name */
    public final Map<a, v.e<?, ?>> f2149a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Object f2150a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2151b;

        public a(int i8, Object obj) {
            this.f2150a = obj;
            this.f2151b = i8;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
            r4 = (androidx.wear.protolayout.protobuf.n.a) r4;
            r0 = r4.f2150a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof androidx.wear.protolayout.protobuf.n.a
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                androidx.wear.protolayout.protobuf.n$a r4 = (androidx.wear.protolayout.protobuf.n.a) r4
                java.lang.Object r0 = r4.f2150a
                java.lang.Object r2 = r3.f2150a
                if (r2 != r0) goto L_0x0015
                int r3 = r3.f2151b
                int r4 = r4.f2151b
                if (r3 != r4) goto L_0x0015
                r1 = 1
            L_0x0015:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.wear.protolayout.protobuf.n.a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f2150a) * 65535) + this.f2151b;
        }
    }

    public n() {
        this.f2149a = new HashMap();
    }

    public n(int i8) {
        this.f2149a = Collections.emptyMap();
    }

    public static n a() {
        n nVar = f2147b;
        if (nVar == null) {
            synchronized (n.class) {
                nVar = f2147b;
                if (nVar == null) {
                    Class<?> cls = m.f2145a;
                    n nVar2 = null;
                    if (cls != null) {
                        try {
                            nVar2 = (n) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke((Object) null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    if (nVar2 == null) {
                        nVar2 = f2148c;
                    }
                    f2147b = nVar2;
                    nVar = nVar2;
                }
            }
        }
        return nVar;
    }
}
