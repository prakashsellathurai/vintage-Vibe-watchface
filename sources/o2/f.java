package o2;

import java.io.InputStream;
import java.nio.ByteBuffer;
import k3.j;
import p2.g;
import p2.i;
import r2.v;
import s2.b;

public final class f implements i<InputStream, j> {

    /* renamed from: c  reason: collision with root package name */
    public static final p2.f<Boolean> f6019c = p2.f.a(Boolean.FALSE, "com.bumptech.glide.integration.webp.decoder.StreamWebpDecoder.DisableAnimation");

    /* renamed from: a  reason: collision with root package name */
    public final i<ByteBuffer, j> f6020a;

    /* renamed from: b  reason: collision with root package name */
    public final b f6021b;

    public f(d dVar, b bVar) {
        this.f6020a = dVar;
        this.f6021b = bVar;
    }

    public final boolean a(Object obj, g gVar) {
        return !((Boolean) gVar.c(f6019c)).booleanValue() && com.bumptech.glide.integration.webp.b.b((InputStream) obj, this.f6021b) == 6;
    }

    public final v b(Object obj, int i8, int i9, g gVar) {
        byte[] G = j.G((InputStream) obj);
        if (G == null) {
            return null;
        }
        return this.f6020a.b(ByteBuffer.wrap(G), i8, i9, gVar);
    }
}
