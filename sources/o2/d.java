package o2;

import android.content.Context;
import android.util.Log;
import b3.b;
import com.bumptech.glide.integration.webp.WebpImage;
import com.bumptech.glide.integration.webp.b;
import java.nio.ByteBuffer;
import o2.j;
import p2.f;
import p2.g;
import p2.i;
import r2.v;
import s2.c;

public final class d implements i<ByteBuffer, j> {

    /* renamed from: d  reason: collision with root package name */
    public static final f<Boolean> f6012d = f.a(Boolean.FALSE, "com.bumptech.glide.integration.webp.decoder.ByteBufferWebpDecoder.DisableAnimation");

    /* renamed from: a  reason: collision with root package name */
    public final Context f6013a;

    /* renamed from: b  reason: collision with root package name */
    public final c f6014b;

    /* renamed from: c  reason: collision with root package name */
    public final b f6015c;

    public d(Context context, s2.b bVar, c cVar) {
        this.f6013a = context.getApplicationContext();
        this.f6014b = cVar;
        this.f6015c = new b(bVar, cVar);
    }

    public final boolean a(Object obj, g gVar) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (((Boolean) gVar.c(f6012d)).booleanValue()) {
            return false;
        }
        return (byteBuffer == null ? 7 : com.bumptech.glide.integration.webp.b.a(new b.C0031b(byteBuffer))) == 6;
    }

    public final v b(Object obj, int i8, int i9, g gVar) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr, 0, remaining);
        WebpImage create = WebpImage.create(bArr);
        int min = Math.min(create.getHeight() / i9, create.getWidth() / i8);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        Log.isLoggable("Utils", 2);
        h hVar = new h(this.f6015c, create, byteBuffer, max, (l) gVar.c(m.r));
        hVar.d();
        return new k(new j(new j.a(this.f6014b, new m(com.bumptech.glide.b.b(this.f6013a), hVar, i8, i9, x2.c.f8119b, hVar.c()))), 0);
    }
}
