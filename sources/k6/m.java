package k6;

import android.content.Context;
import android.content.res.Resources;
import b3.b;
import com.bumptech.glide.integration.webp.WebpImage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import n2.a;
import o2.h;

public final class m extends k {
    public m(Resources resources, String str, InputStream inputStream, Context context) {
        super(resources, str, inputStream, context);
    }

    public final a b(byte[] bArr) {
        Context context = this.f5209c;
        return new h(new b(com.bumptech.glide.b.b(context).e, com.bumptech.glide.b.b(context).f2913a), WebpImage.create(bArr), ByteBuffer.wrap(bArr, 0, bArr.length), 1);
    }
}
