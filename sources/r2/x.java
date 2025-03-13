package r2;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import k3.g;
import p2.e;
import p2.k;
import s2.b;

public final class x implements e {

    /* renamed from: j  reason: collision with root package name */
    public static final g<Class<?>, byte[]> f6915j = new g<>(50);

    /* renamed from: b  reason: collision with root package name */
    public final b f6916b;

    /* renamed from: c  reason: collision with root package name */
    public final e f6917c;

    /* renamed from: d  reason: collision with root package name */
    public final e f6918d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f6919f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f6920g;

    /* renamed from: h  reason: collision with root package name */
    public final p2.g f6921h;

    /* renamed from: i  reason: collision with root package name */
    public final k<?> f6922i;

    public x(b bVar, e eVar, e eVar2, int i8, int i9, k<?> kVar, Class<?> cls, p2.g gVar) {
        this.f6916b = bVar;
        this.f6917c = eVar;
        this.f6918d = eVar2;
        this.e = i8;
        this.f6919f = i9;
        this.f6922i = kVar;
        this.f6920g = cls;
        this.f6921h = gVar;
    }

    public final void a(MessageDigest messageDigest) {
        b bVar = this.f6916b;
        byte[] bArr = (byte[]) bVar.e();
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f6919f).array();
        this.f6918d.a(messageDigest);
        this.f6917c.a(messageDigest);
        messageDigest.update(bArr);
        k<?> kVar = this.f6922i;
        if (kVar != null) {
            kVar.a(messageDigest);
        }
        this.f6921h.a(messageDigest);
        g<Class<?>, byte[]> gVar = f6915j;
        Class<?> cls = this.f6920g;
        byte[] a9 = gVar.a(cls);
        if (a9 == null) {
            a9 = cls.getName().getBytes(e.f6307a);
            gVar.d(cls, a9);
        }
        messageDigest.update(a9);
        bVar.c(bArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r4 = (r2.x) r4;
        r0 = r4.f6919f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof r2.x
            r1 = 0
            if (r0 == 0) goto L_0x0046
            r2.x r4 = (r2.x) r4
            int r0 = r4.f6919f
            int r2 = r3.f6919f
            if (r2 != r0) goto L_0x0046
            int r0 = r3.e
            int r2 = r4.e
            if (r0 != r2) goto L_0x0046
            p2.k<?> r0 = r3.f6922i
            p2.k<?> r2 = r4.f6922i
            boolean r0 = k3.k.a(r0, r2)
            if (r0 == 0) goto L_0x0046
            java.lang.Class<?> r0 = r3.f6920g
            java.lang.Class<?> r2 = r4.f6920g
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0046
            p2.e r0 = r3.f6917c
            p2.e r2 = r4.f6917c
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0046
            p2.e r0 = r3.f6918d
            p2.e r2 = r4.f6918d
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0046
            p2.g r3 = r3.f6921h
            p2.g r4 = r4.f6921h
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0046
            r1 = 1
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.x.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (((((this.f6917c.hashCode() * 31) + this.f6918d.hashCode()) * 31) + this.e) * 31) + this.f6919f;
        k<?> kVar = this.f6922i;
        if (kVar != null) {
            hashCode = (hashCode * 31) + kVar.hashCode();
        }
        return (((hashCode * 31) + this.f6920g.hashCode()) * 31) + this.f6921h.hashCode();
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f6917c + ", signature=" + this.f6918d + ", width=" + this.e + ", height=" + this.f6919f + ", decodedResourceClass=" + this.f6920g + ", transformation='" + this.f6922i + "', options=" + this.f6921h + '}';
    }
}
