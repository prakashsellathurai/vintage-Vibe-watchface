package u1;

import i7.i;
import java.util.Map;
import q7.k;
import q7.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, byte[]> f7616a;

    public static final class a extends l implements p7.l<Map.Entry<? extends String, ? extends byte[]>, CharSequence> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f7617f = new a();

        public a() {
            super(1);
        }

        public final Object invoke(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            k.e(entry, "it");
            try {
                StringBuilder sb = new StringBuilder();
                sb.append((String) entry.getKey());
                sb.append('=');
                byte[] bArr = (byte[]) entry.getValue();
                k.e(bArr, "<this>");
                sb.append(new String(bArr, w7.a.f8081a));
                return sb.toString();
            } catch (Exception unused) {
                return ((String) entry.getKey()) + '=' + entry.getValue();
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(androidx.wear.watchface.style.data.UserStyleWireFormat r2) {
        /*
            r1 = this;
            java.lang.String r0 = "userStyle"
            q7.k.e(r2, r0)
            java.util.Map<java.lang.String, byte[]> r2 = r2.f2434f
            java.lang.String r0 = "userStyle.mUserStyle"
            q7.k.d(r2, r0)
            r1.<init>((java.util.Map<java.lang.String, byte[]>) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.f.<init>(androidx.wear.watchface.style.data.UserStyleWireFormat):void");
    }

    public f(Map<String, byte[]> map) {
        this.f7616a = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.Class<u1.f> r1 = u1.f.class
            if (r5 == 0) goto L_0x000d
            java.lang.Class r2 = r5.getClass()
            goto L_0x000e
        L_0x000d:
            r2 = 0
        L_0x000e:
            boolean r1 = q7.k.a(r1, r2)
            r2 = 0
            if (r1 != 0) goto L_0x0016
            return r2
        L_0x0016:
            java.lang.String r1 = "null cannot be cast to non-null type androidx.wear.watchface.style.UserStyleData"
            q7.k.c(r5, r1)
            u1.f r5 = (u1.f) r5
            java.util.Map<java.lang.String, byte[]> r4 = r4.f7616a
            java.util.Map<java.lang.String, byte[]> r5 = r5.f7616a
            boolean r1 = q7.k.a(r4, r5)
            if (r1 == 0) goto L_0x0028
            return r0
        L_0x0028:
            int r1 = r4.size()
            int r3 = r5.size()
            if (r1 == r3) goto L_0x0033
            return r2
        L_0x0033:
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x003b:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0063
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.getValue()
            byte[] r1 = (byte[]) r1
            java.lang.Object r3 = r5.get(r3)
            byte[] r3 = (byte[]) r3
            if (r3 != 0) goto L_0x005c
            return r2
        L_0x005c:
            boolean r1 = java.util.Arrays.equals(r3, r1)
            if (r1 != 0) goto L_0x003b
            return r2
        L_0x0063:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.f7616a.hashCode();
    }

    public final String toString() {
        return "{" + i.W(this.f7616a.entrySet(), (String) null, a.f7617f, 31) + '}';
    }
}
