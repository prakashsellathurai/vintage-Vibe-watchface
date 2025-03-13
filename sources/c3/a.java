package c3;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import p2.g;
import r2.v;
import z2.b;

public final class a implements b<Bitmap, byte[]> {

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap.CompressFormat f2652a = Bitmap.CompressFormat.JPEG;

    /* renamed from: b  reason: collision with root package name */
    public final int f2653b = 100;

    public final v<byte[]> e(v<Bitmap> vVar, g gVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        vVar.get().compress(this.f2652a, this.f2653b, byteArrayOutputStream);
        vVar.d();
        return new b(byteArrayOutputStream.toByteArray());
    }
}
