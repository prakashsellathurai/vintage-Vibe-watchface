package com.bumptech.glide.integration.webp;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import androidx.annotation.Keep;
import com.bumptech.glide.integration.webp.b;
import java.io.BufferedInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@Keep
public class WebpBitmapFactory {
    private static final int IN_TEMP_BUFFER_SIZE = 8192;
    private static final int MAX_WEBP_HEADER_SIZE = 21;

    static {
        System.loadLibrary("glide-webp");
    }

    @Keep
    private static Bitmap createBitmap(int i8, int i9, BitmapFactory.Options options) {
        Bitmap bitmap;
        if (options != null && (bitmap = options.inBitmap) != null && bitmap.isMutable()) {
            return options.inBitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i8, i9, Bitmap.Config.ARGB_8888);
        createBitmap.setHasAlpha(true);
        createBitmap.eraseColor(0);
        return createBitmap;
    }

    public static Bitmap decodeByteArray(byte[] bArr, int i8, int i9) {
        return decodeByteArray(bArr, i8, i9, (BitmapFactory.Options) null);
    }

    public static Bitmap decodeByteArray(byte[] bArr, int i8, int i9, BitmapFactory.Options options) {
        if ((i8 | i9) < 0 || bArr.length < i8 + i9) {
            throw new ArrayIndexOutOfBoundsException();
        } else if (!webpSupportRequired(bArr, i8, i9)) {
            return BitmapFactory.decodeByteArray(bArr, i8, i9, options);
        } else {
            Bitmap nativeDecodeByteArray = nativeDecodeByteArray(bArr, i8, i9, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
            setWebpBitmapOptions(nativeDecodeByteArray, options);
            return nativeDecodeByteArray;
        }
    }

    public static Bitmap decodeFile(String str) {
        return decodeFile(str, (BitmapFactory.Options) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        if (r2 != null) goto L_0x000c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002f A[SYNTHETIC, Splitter:B:20:0x002f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap decodeFile(java.lang.String r4, android.graphics.BitmapFactory.Options r5) {
        /*
            java.lang.String r0 = "Unable to decode stream: "
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0014, all -> 0x0012 }
            r2.<init>(r4)     // Catch:{ Exception -> 0x0014, all -> 0x0012 }
            android.graphics.Bitmap r1 = decodeStream(r2, r1, r5)     // Catch:{ Exception -> 0x0010 }
        L_0x000c:
            r2.close()     // Catch:{ IOException -> 0x002a }
            goto L_0x002a
        L_0x0010:
            r4 = move-exception
            goto L_0x0016
        L_0x0012:
            r4 = move-exception
            goto L_0x002d
        L_0x0014:
            r4 = move-exception
            r2 = r1
        L_0x0016:
            java.lang.String r5 = "WebpBitmapFactory"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x002b }
            r3.<init>(r0)     // Catch:{ all -> 0x002b }
            r3.append(r4)     // Catch:{ all -> 0x002b }
            java.lang.String r4 = r3.toString()     // Catch:{ all -> 0x002b }
            android.util.Log.e(r5, r4)     // Catch:{ all -> 0x002b }
            if (r2 == 0) goto L_0x002a
            goto L_0x000c
        L_0x002a:
            return r1
        L_0x002b:
            r4 = move-exception
            r1 = r2
        L_0x002d:
            if (r1 == 0) goto L_0x0032
            r1.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.integration.webp.WebpBitmapFactory.decodeFile(java.lang.String, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    public static Bitmap decodeFileDescriptor(FileDescriptor fileDescriptor) {
        return decodeFileDescriptor(fileDescriptor, (Rect) null, (BitmapFactory.Options) null);
    }

    public static Bitmap decodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        Bitmap bitmap;
        InputStream wrapToMarkSupportedStream = wrapToMarkSupportedStream(new FileInputStream(fileDescriptor));
        try {
            if (webpSupportRequired(getImageHeader(wrapToMarkSupportedStream), 0, 21)) {
                bitmap = nativeDecodeStream(wrapToMarkSupportedStream, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
                setWebpBitmapOptions(bitmap, options);
                setDefaultPadding(rect);
            } else {
                bitmap = BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
            }
            try {
                wrapToMarkSupportedStream.close();
            } catch (Throwable unused) {
            }
            return bitmap;
        } catch (Throwable unused2) {
        }
        throw th;
    }

    public static Bitmap decodeResource(Resources resources, int i8) {
        return decodeResource(resources, i8, (BitmapFactory.Options) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x001f, code lost:
        if (r3 != null) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r3 != null) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r3.close();
        r0 = r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001a A[SYNTHETIC, Splitter:B:12:0x001a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap decodeResource(android.content.res.Resources r2, int r3, android.graphics.BitmapFactory.Options r4) {
        /*
            r0 = 0
            android.util.TypedValue r1 = new android.util.TypedValue     // Catch:{ Exception -> 0x001e, all -> 0x0017 }
            r1.<init>()     // Catch:{ Exception -> 0x001e, all -> 0x0017 }
            java.io.InputStream r3 = r2.openRawResource(r3, r1)     // Catch:{ Exception -> 0x001e, all -> 0x0017 }
            android.graphics.Bitmap r0 = decodeResourceStream(r2, r1, r3, r0, r4)     // Catch:{ Exception -> 0x001f, all -> 0x0014 }
            if (r3 == 0) goto L_0x0022
        L_0x0010:
            r3.close()     // Catch:{ IOException -> 0x0022 }
            goto L_0x0022
        L_0x0014:
            r2 = move-exception
            r0 = r3
            goto L_0x0018
        L_0x0017:
            r2 = move-exception
        L_0x0018:
            if (r0 == 0) goto L_0x001d
            r0.close()     // Catch:{ IOException -> 0x001d }
        L_0x001d:
            throw r2
        L_0x001e:
            r3 = r0
        L_0x001f:
            if (r3 == 0) goto L_0x0022
            goto L_0x0010
        L_0x0022:
            if (r0 != 0) goto L_0x0033
            if (r4 == 0) goto L_0x0033
            android.graphics.Bitmap r2 = r4.inBitmap
            if (r2 != 0) goto L_0x002b
            goto L_0x0033
        L_0x002b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Problem decoding into existing bitmap"
            r2.<init>(r3)
            throw r2
        L_0x0033:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.integration.webp.WebpBitmapFactory.decodeResource(android.content.res.Resources, int, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r2 != 65535) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap decodeResourceStream(android.content.res.Resources r1, android.util.TypedValue r2, java.io.InputStream r3, android.graphics.Rect r4, android.graphics.BitmapFactory.Options r5) {
        /*
            if (r5 != 0) goto L_0x0007
            android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options
            r5.<init>()
        L_0x0007:
            int r0 = r5.inDensity
            if (r0 != 0) goto L_0x001c
            if (r2 == 0) goto L_0x001c
            int r2 = r2.density
            if (r2 != 0) goto L_0x0016
            r2 = 160(0xa0, float:2.24E-43)
        L_0x0013:
            r5.inDensity = r2
            goto L_0x001c
        L_0x0016:
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r2 == r0) goto L_0x001c
            goto L_0x0013
        L_0x001c:
            int r2 = r5.inTargetDensity
            if (r2 != 0) goto L_0x002a
            if (r1 == 0) goto L_0x002a
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.densityDpi
            r5.inTargetDensity = r1
        L_0x002a:
            android.graphics.Bitmap r1 = decodeStream(r3, r4, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.integration.webp.WebpBitmapFactory.decodeResourceStream(android.content.res.Resources, android.util.TypedValue, java.io.InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    public static Bitmap decodeStream(InputStream inputStream) {
        return decodeStream(inputStream, (Rect) null, (BitmapFactory.Options) null);
    }

    public static Bitmap decodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        if (inputStream == null) {
            return null;
        }
        InputStream wrapToMarkSupportedStream = wrapToMarkSupportedStream(inputStream);
        if (!webpSupportRequired(getImageHeader(wrapToMarkSupportedStream), 0, 21)) {
            return BitmapFactory.decodeStream(wrapToMarkSupportedStream, rect, options);
        }
        Bitmap nativeDecodeStream = nativeDecodeStream(wrapToMarkSupportedStream, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
        setWebpBitmapOptions(nativeDecodeStream, options);
        setDefaultPadding(rect);
        return nativeDecodeStream;
    }

    private static byte[] getImageHeader(InputStream inputStream) {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream, 21);
        }
        inputStream.mark(21);
        byte[] bArr = new byte[21];
        try {
            inputStream.read(bArr, 0, 21);
            inputStream.reset();
            return bArr;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r0.inTempStorage;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] getInTempStorageFromOptions(android.graphics.BitmapFactory.Options r0) {
        /*
            if (r0 == 0) goto L_0x0007
            byte[] r0 = r0.inTempStorage
            if (r0 == 0) goto L_0x0007
            return r0
        L_0x0007:
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.integration.webp.WebpBitmapFactory.getInTempStorageFromOptions(android.graphics.BitmapFactory$Options):byte[]");
    }

    private static float getScaleFromOptions(BitmapFactory.Options options) {
        float f9 = 1.0f;
        if (options == null) {
            return 1.0f;
        }
        int i8 = options.inSampleSize;
        if (i8 > 1) {
            f9 = 1.0f / ((float) i8);
        }
        if (!options.inScaled) {
            return f9;
        }
        int i9 = options.inDensity;
        int i10 = options.inTargetDensity;
        return (i9 == 0 || i10 == 0 || i9 == options.inScreenDensity) ? f9 : ((float) i10) / ((float) i9);
    }

    private static native Bitmap nativeDecodeByteArray(byte[] bArr, int i8, int i9, BitmapFactory.Options options, float f9, byte[] bArr2);

    private static native Bitmap nativeDecodeStream(InputStream inputStream, BitmapFactory.Options options, float f9, byte[] bArr);

    private static void setDefaultPadding(Rect rect) {
        if (rect != null) {
            rect.top = -1;
            rect.left = -1;
            rect.bottom = -1;
            rect.right = -1;
        }
    }

    private static void setDensityFromOptions(Bitmap bitmap, BitmapFactory.Options options) {
        if (bitmap != null && options != null) {
            int i8 = options.inDensity;
            if (i8 != 0) {
                bitmap.setDensity(i8);
                int i9 = options.inTargetDensity;
                if (i9 != 0 && i8 != i9 && i8 != options.inScreenDensity && options.inScaled) {
                    bitmap.setDensity(i9);
                }
            } else if (options.inBitmap != null) {
                bitmap.setDensity(160);
            }
        }
    }

    @Keep
    private static boolean setOutDimensions(BitmapFactory.Options options, int i8, int i9) {
        if (options == null) {
            return false;
        }
        options.outWidth = i8;
        options.outHeight = i9;
        return options.inJustDecodeBounds;
    }

    private static void setWebpBitmapOptions(Bitmap bitmap, BitmapFactory.Options options) {
        setDensityFromOptions(bitmap, options);
        if (options != null) {
            options.outMimeType = "image/webp";
        }
    }

    public static boolean webpSupportRequired(byte[] bArr, int i8, int i9) {
        try {
            b.a(new b.a(bArr, i8, i9));
            return false;
        } catch (IOException unused) {
            return false;
        }
    }

    private static InputStream wrapToMarkSupportedStream(InputStream inputStream) {
        return !inputStream.markSupported() ? new BufferedInputStream(inputStream, IN_TEMP_BUFFER_SIZE) : inputStream;
    }
}
