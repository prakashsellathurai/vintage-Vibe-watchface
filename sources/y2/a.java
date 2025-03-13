package y2;

import android.graphics.Bitmap;
import p2.c;
import p2.f;
import p2.g;
import p2.j;
import s2.b;

public final class a implements j<Bitmap> {

    /* renamed from: b  reason: collision with root package name */
    public static final f<Integer> f8335b = f.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* renamed from: c  reason: collision with root package name */
    public static final f<Bitmap.CompressFormat> f8336c = new f<>("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, f.e);

    /* renamed from: a  reason: collision with root package name */
    public final b f8337a;

    public a(b bVar) {
        this.f8337a = bVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:27|43|(2:45|46)|47|48) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0085 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0060 A[SYNTHETIC, Splitter:B:33:0x0060] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0082 A[SYNTHETIC, Splitter:B:45:0x0082] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f(java.lang.Object r7, java.io.File r8, p2.g r9) {
        /*
            r6 = this;
            r2.v r7 = (r2.v) r7
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r7 = r7.get()
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            p2.f<android.graphics.Bitmap$CompressFormat> r1 = f8336c
            java.lang.Object r2 = r9.c(r1)
            android.graphics.Bitmap$CompressFormat r2 = (android.graphics.Bitmap.CompressFormat) r2
            if (r2 == 0) goto L_0x0015
            goto L_0x0020
        L_0x0015:
            boolean r2 = r7.hasAlpha()
            if (r2 == 0) goto L_0x001e
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG
            goto L_0x0020
        L_0x001e:
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG
        L_0x0020:
            r7.getWidth()
            r7.getHeight()
            int r3 = k3.f.f5137a     // Catch:{ all -> 0x0086 }
            android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x0086 }
            p2.f<java.lang.Integer> r3 = f8335b     // Catch:{ all -> 0x0086 }
            java.lang.Object r3 = r9.c(r3)     // Catch:{ all -> 0x0086 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0086 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0086 }
            r4 = 0
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x005a }
            r5.<init>(r8)     // Catch:{ IOException -> 0x005a }
            s2.b r6 = r6.f8337a
            if (r6 == 0) goto L_0x004c
            com.bumptech.glide.load.data.c r8 = new com.bumptech.glide.load.data.c     // Catch:{ IOException -> 0x004a, all -> 0x0048 }
            r8.<init>(r5, r6)     // Catch:{ IOException -> 0x004a, all -> 0x0048 }
            r4 = r8
            goto L_0x004d
        L_0x0048:
            r6 = move-exception
            goto L_0x0080
        L_0x004a:
            r4 = r5
            goto L_0x005a
        L_0x004c:
            r4 = r5
        L_0x004d:
            r7.compress(r2, r3, r4)     // Catch:{ IOException -> 0x005a }
            r4.close()     // Catch:{ IOException -> 0x005a }
            r4.close()     // Catch:{ IOException -> 0x0056 }
        L_0x0056:
            r6 = 1
            goto L_0x0064
        L_0x0058:
            r6 = move-exception
            goto L_0x007f
        L_0x005a:
            r6 = 3
            android.util.Log.isLoggable(r0, r6)     // Catch:{ all -> 0x0058 }
            if (r4 == 0) goto L_0x0063
            r4.close()     // Catch:{ IOException -> 0x0063 }
        L_0x0063:
            r6 = 0
        L_0x0064:
            r8 = 2
            boolean r8 = android.util.Log.isLoggable(r0, r8)     // Catch:{ all -> 0x0086 }
            if (r8 == 0) goto L_0x007e
            java.util.Objects.toString(r2)     // Catch:{ all -> 0x0086 }
            k3.k.c(r7)     // Catch:{ all -> 0x0086 }
            android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x0086 }
            java.lang.Object r8 = r9.c(r1)     // Catch:{ all -> 0x0086 }
            java.util.Objects.toString(r8)     // Catch:{ all -> 0x0086 }
            r7.hasAlpha()     // Catch:{ all -> 0x0086 }
        L_0x007e:
            return r6
        L_0x007f:
            r5 = r4
        L_0x0080:
            if (r5 == 0) goto L_0x0085
            r5.close()     // Catch:{ IOException -> 0x0085 }
        L_0x0085:
            throw r6     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.a.f(java.lang.Object, java.io.File, p2.g):boolean");
    }

    public final c h(g gVar) {
        return c.f6304g;
    }
}
