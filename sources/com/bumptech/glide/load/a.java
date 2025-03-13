package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.util.List;
import s2.b;
import y2.o;

public final class a {
    public static int a(b bVar, InputStream inputStream, List list) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new o(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        int i8 = 0;
        while (i8 < size) {
            try {
                int b9 = ((ImageHeaderParser) list.get(i8)).b(inputStream, bVar);
                if (b9 != -1) {
                    return b9;
                }
                i8++;
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    /* JADX INFO: finally extract failed */
    public static ImageHeaderParser.ImageType b(b bVar, InputStream inputStream, List list) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new o(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        int i8 = 0;
        while (i8 < size) {
            try {
                ImageHeaderParser.ImageType c9 = ((ImageHeaderParser) list.get(i8)).c(inputStream);
                inputStream.reset();
                if (c9 != ImageHeaderParser.ImageType.UNKNOWN) {
                    return c9;
                }
                i8++;
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
