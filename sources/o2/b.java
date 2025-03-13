package o2;

import com.bumptech.glide.integration.webp.b;
import java.io.InputStream;
import java.nio.ByteBuffer;
import k3.j;
import p2.g;
import p2.i;
import r2.v;

public final class b implements i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6008a;

    /* renamed from: b  reason: collision with root package name */
    public final a f6009b;

    public /* synthetic */ b(a aVar, int i8) {
        this.f6008a = i8;
        this.f6009b = aVar;
    }

    public final boolean a(Object obj, g gVar) {
        boolean z8 = true;
        int i8 = this.f6008a;
        a aVar = this.f6009b;
        switch (i8) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                aVar.getClass();
                if (((Boolean) gVar.c(a.f6004d)).booleanValue()) {
                    return false;
                }
                if ((byteBuffer == null ? 7 : com.bumptech.glide.integration.webp.b.a(new b.C0031b(byteBuffer))) != 6) {
                    z8 = false;
                }
                return z8;
            default:
                InputStream inputStream = (InputStream) obj;
                aVar.getClass();
                if (((Boolean) gVar.c(a.f6004d)).booleanValue()) {
                    return false;
                }
                if (com.bumptech.glide.integration.webp.b.b(inputStream, aVar.f6005a) != 6) {
                    z8 = false;
                }
                return z8;
        }
    }

    public final v b(Object obj, int i8, int i9, g gVar) {
        int i10 = this.f6008a;
        a aVar = this.f6009b;
        switch (i10) {
            case 0:
                return aVar.a((ByteBuffer) obj, i8, i9);
            default:
                aVar.getClass();
                byte[] G = j.G((InputStream) obj);
                if (G == null) {
                    return null;
                }
                return aVar.a(ByteBuffer.wrap(G), i8, i9);
        }
    }
}
