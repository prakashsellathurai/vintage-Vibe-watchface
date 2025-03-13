package y2;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;
import p2.g;
import p2.i;
import r2.v;

public final class e implements i<ByteBuffer, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final b f8344a = new b();

    public final /* bridge */ /* synthetic */ boolean a(Object obj, g gVar) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        return true;
    }

    public final v b(Object obj, int i8, int i9, g gVar) {
        return this.f8344a.b(ImageDecoder.createSource((ByteBuffer) obj), i8, i9, gVar);
    }
}
