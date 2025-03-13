package t2;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import k3.g;
import k3.k;
import l3.a;
import l3.d;
import p2.e;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final g<e, String> f7486a = new g<>(1000);

    /* renamed from: b  reason: collision with root package name */
    public final a.c f7487b = l3.a.a(10, new a());

    public class a implements a.b<b> {
        public final Object a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static final class b implements a.d {

        /* renamed from: f  reason: collision with root package name */
        public final MessageDigest f7488f;

        /* renamed from: g  reason: collision with root package name */
        public final d.a f7489g = new d.a();

        public b(MessageDigest messageDigest) {
            this.f7488f = messageDigest;
        }

        public final d.a h() {
            return this.f7489g;
        }
    }

    public final String a(e eVar) {
        String a9;
        synchronized (this.f7486a) {
            a9 = this.f7486a.a(eVar);
        }
        if (a9 == null) {
            Object b9 = this.f7487b.b();
            k3.j.l(b9);
            b bVar = (b) b9;
            try {
                eVar.a(bVar.f7488f);
                byte[] digest = bVar.f7488f.digest();
                char[] cArr = k.f5170b;
                synchronized (cArr) {
                    for (int i8 = 0; i8 < digest.length; i8++) {
                        byte b10 = digest[i8] & 255;
                        int i9 = i8 * 2;
                        char[] cArr2 = k.f5169a;
                        cArr[i9] = cArr2[b10 >>> 4];
                        cArr[i9 + 1] = cArr2[b10 & 15];
                    }
                    a9 = new String(cArr);
                }
                this.f7487b.a(bVar);
            } catch (Throwable th) {
                this.f7487b.a(bVar);
                throw th;
            }
        }
        synchronized (this.f7486a) {
            this.f7486a.d(eVar, a9);
        }
        return a9;
    }
}
