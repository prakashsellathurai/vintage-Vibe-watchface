package w2;

import java.io.InputStream;
import java.net.URL;
import p2.g;
import v2.f;
import v2.n;
import v2.o;
import v2.r;

public final class e implements n<URL, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final n<f, InputStream> f8007a;

    public static class a implements o<URL, InputStream> {
        public final n<URL, InputStream> b(r rVar) {
            return new e(rVar.b(f.class, InputStream.class));
        }
    }

    public e(n<f, InputStream> nVar) {
        this.f8007a = nVar;
    }

    public final n.a a(Object obj, int i8, int i9, g gVar) {
        return this.f8007a.a(new f((URL) obj), i8, i9, gVar);
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        URL url = (URL) obj;
        return true;
    }
}
