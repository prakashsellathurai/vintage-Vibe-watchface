package com.bumptech.glide.load;

import java.io.InputStream;
import java.nio.ByteBuffer;
import s2.b;

public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        

        /* renamed from: f  reason: collision with root package name */
        public final boolean f2972f;

        /* access modifiers changed from: public */
        ImageType(boolean z8) {
            this.f2972f = z8;
        }

        public boolean hasAlpha() {
            return this.f2972f;
        }
    }

    ImageType a(ByteBuffer byteBuffer);

    int b(InputStream inputStream, b bVar);

    ImageType c(InputStream inputStream);
}
