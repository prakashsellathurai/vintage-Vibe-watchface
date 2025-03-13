package a;

public final class b {
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0062, code lost:
        k3.j.n(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0065, code lost:
        throw r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b A[SYNTHETIC, Splitter:B:17:0x005b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.os.Bundle a(android.graphics.Bitmap r7) {
        /*
            java.lang.String r0 = "bitmap"
            q7.k.e(r7, r0)
            v1.c r0 = new v1.c
            java.lang.String r1 = "SharedMemoryImage.ashmemWriteImageBundle"
            r0.<init>(r1)
            java.lang.String r1 = "WatchFace.Screenshot.Bitmap"
            int r2 = r7.getAllocationByteCount()     // Catch:{ all -> 0x005f }
            android.os.SharedMemory r1 = android.os.SharedMemory.create(r1, r2)     // Catch:{ all -> 0x005f }
            java.lang.String r2 = "create(\"WatchFace.Screen…tmap.allocationByteCount)"
            q7.k.d(r1, r2)     // Catch:{ all -> 0x005f }
            r2 = 0
            java.nio.ByteBuffer r3 = r1.mapReadWrite()     // Catch:{ all -> 0x0058 }
            r7.copyPixelsToBuffer(r3)     // Catch:{ all -> 0x0055 }
            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ all -> 0x0055 }
            r4.<init>()     // Catch:{ all -> 0x0055 }
            java.lang.String r5 = "KEY_BITMAP_WIDTH_PX"
            int r6 = r7.getWidth()     // Catch:{ all -> 0x0055 }
            r4.putInt(r5, r6)     // Catch:{ all -> 0x0055 }
            java.lang.String r5 = "KEY_BITMAP_HEIGHT_PX"
            int r6 = r7.getHeight()     // Catch:{ all -> 0x0055 }
            r4.putInt(r5, r6)     // Catch:{ all -> 0x0055 }
            java.lang.String r5 = "KEY_BITMAP_CONFIG_ORDINAL"
            android.graphics.Bitmap$Config r7 = r7.getConfig()     // Catch:{ all -> 0x0055 }
            int r7 = r7.ordinal()     // Catch:{ all -> 0x0055 }
            r4.putInt(r5, r7)     // Catch:{ all -> 0x0055 }
            java.lang.String r7 = "KEY_SCREENSHOT"
            r4.putParcelable(r7, r1)     // Catch:{ all -> 0x0055 }
            if (r3 == 0) goto L_0x0051
            android.os.SharedMemory.unmap(r3)     // Catch:{ all -> 0x005f }
        L_0x0051:
            k3.j.n(r0, r2)
            return r4
        L_0x0055:
            r7 = move-exception
            r2 = r3
            goto L_0x0059
        L_0x0058:
            r7 = move-exception
        L_0x0059:
            if (r2 == 0) goto L_0x005e
            android.os.SharedMemory.unmap(r2)     // Catch:{ all -> 0x005f }
        L_0x005e:
            throw r7     // Catch:{ all -> 0x005f }
        L_0x005f:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r1 = move-exception
            k3.j.n(r0, r7)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.a(android.graphics.Bitmap):android.os.Bundle");
    }
}
