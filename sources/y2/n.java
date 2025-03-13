package y2;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import k3.a;
import p2.g;
import p2.i;
import r2.v;

public final class n implements i<InputStream, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final b f8380a = new b();

    public final /* bridge */ /* synthetic */ boolean a(Object obj, g gVar) {
        InputStream inputStream = (InputStream) obj;
        return true;
    }

    public final v b(Object obj, int i8, int i9, g gVar) {
        InputStream inputStream = (InputStream) obj;
        AtomicReference<byte[]> atomicReference = a.f5123a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        AtomicReference<byte[]> atomicReference2 = a.f5123a;
        byte[] andSet = atomicReference2.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int read = inputStream.read(andSet);
            if (read >= 0) {
                byteArrayOutputStream.write(andSet, 0, read);
            } else {
                atomicReference2.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return this.f8380a.b(ImageDecoder.createSource((ByteBuffer) ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0)), i8, i9, gVar);
            }
        }
    }
}
