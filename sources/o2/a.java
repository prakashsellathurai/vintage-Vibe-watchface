package o2;

import android.util.Log;
import com.bumptech.glide.integration.webp.WebpImage;
import java.nio.ByteBuffer;
import p2.f;
import s2.b;
import s2.c;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final f<Boolean> f6004d = f.a(Boolean.FALSE, "com.bumptech.glide.integration.webp.decoder.AnimatedWebpBitmapDecoder.DisableBitmap");

    /* renamed from: a  reason: collision with root package name */
    public final b f6005a;

    /* renamed from: b  reason: collision with root package name */
    public final c f6006b;

    /* renamed from: c  reason: collision with root package name */
    public final b3.b f6007c;

    public a(b bVar, c cVar) {
        this.f6005a = bVar;
        this.f6006b = cVar;
        this.f6007c = new b3.b(bVar, cVar);
    }

    public final y2.c a(ByteBuffer byteBuffer, int i8, int i9) {
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        int i10 = 0;
        byteBuffer.get(bArr, 0, remaining);
        WebpImage create = WebpImage.create(bArr);
        int min = Math.min(create.getHeight() / i9, create.getWidth() / i8);
        if (min != 0) {
            i10 = Integer.highestOneBit(min);
        }
        int max = Math.max(1, i10);
        Log.isLoggable("Utils", 2);
        h hVar = new h(this.f6007c, create, byteBuffer, max);
        try {
            hVar.d();
            return y2.c.e(hVar.c(), this.f6006b);
        } finally {
            hVar.clear();
        }
    }
}
