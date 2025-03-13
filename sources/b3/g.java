package b3;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p2.i;
import r2.v;
import s2.b;

public final class g implements i<InputStream, c> {

    /* renamed from: a  reason: collision with root package name */
    public final List<ImageHeaderParser> f2598a;

    /* renamed from: b  reason: collision with root package name */
    public final i<ByteBuffer, c> f2599b;

    /* renamed from: c  reason: collision with root package name */
    public final b f2600c;

    public g(List list, a aVar, b bVar) {
        this.f2598a = list;
        this.f2599b = aVar;
        this.f2600c = bVar;
    }

    public final boolean a(Object obj, p2.g gVar) {
        InputStream inputStream = (InputStream) obj;
        if (!((Boolean) gVar.c(f.f2597b)).booleanValue()) {
            if (a.b(this.f2600c, inputStream, this.f2598a) == ImageHeaderParser.ImageType.GIF) {
                return true;
            }
        }
        return false;
    }

    public final v b(Object obj, int i8, int i9, p2.g gVar) {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.f2599b.b(ByteBuffer.wrap(bArr), i8, i9, gVar);
    }
}
