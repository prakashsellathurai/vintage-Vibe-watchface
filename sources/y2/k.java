package y2;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import r0.a;
import s2.b;

public final class k implements ImageHeaderParser {
    public final ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public final int b(InputStream inputStream, b bVar) {
        a aVar = new a(inputStream);
        a.c e = aVar.e("Orientation");
        int i8 = 1;
        if (e != null) {
            try {
                i8 = e.f(aVar.f6661f);
            } catch (NumberFormatException unused) {
            }
        }
        if (i8 == 0) {
            return -1;
        }
        return i8;
    }

    public final ImageHeaderParser.ImageType c(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
