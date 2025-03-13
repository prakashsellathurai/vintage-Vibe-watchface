package androidx.core.graphics.drawable;

public class IconCompatParcelizer {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.core.graphics.drawable.IconCompat read(g1.a r5) {
        /*
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r0.<init>()
            int r1 = r0.f1048f
            r2 = 1
            int r1 = r5.t(r1, r2)
            r0.f1048f = r1
            byte[] r1 = r0.f1050h
            r2 = 2
            byte[] r1 = r5.m(r1, r2)
            r0.f1050h = r1
            android.os.Parcelable r1 = r0.f1051i
            r3 = 3
            android.os.Parcelable r1 = r5.z(r1, r3)
            r0.f1051i = r1
            int r1 = r0.f1052j
            r4 = 4
            int r1 = r5.t(r1, r4)
            r0.f1052j = r1
            int r1 = r0.f1053k
            r4 = 5
            int r1 = r5.t(r1, r4)
            r0.f1053k = r1
            android.content.res.ColorStateList r1 = r0.f1054l
            r4 = 6
            android.os.Parcelable r1 = r5.z(r1, r4)
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            r0.f1054l = r1
            java.lang.String r1 = r0.f1056n
            r4 = 7
            java.lang.String r1 = r5.C(r4, r1)
            r0.f1056n = r1
            java.lang.String r1 = r0.f1057o
            r4 = 8
            java.lang.String r5 = r5.C(r4, r1)
            r0.f1057o = r5
            java.lang.String r5 = r0.f1056n
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.valueOf(r5)
            r0.f1055m = r5
            int r5 = r0.f1048f
            r1 = 0
            switch(r5) {
                case -1: goto L_0x0098;
                case 0: goto L_0x005e;
                case 1: goto L_0x0087;
                case 2: goto L_0x0064;
                case 3: goto L_0x005f;
                case 4: goto L_0x0064;
                case 5: goto L_0x0087;
                case 6: goto L_0x0064;
                default: goto L_0x005e;
            }
        L_0x005e:
            goto L_0x00a7
        L_0x005f:
            byte[] r5 = r0.f1050h
            r0.f1049g = r5
            goto L_0x00a7
        L_0x0064:
            java.lang.String r5 = new java.lang.String
            byte[] r3 = r0.f1050h
            java.lang.String r4 = "UTF-16"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)
            r5.<init>(r3, r4)
            r0.f1049g = r5
            int r3 = r0.f1048f
            if (r3 != r2) goto L_0x00a7
            java.lang.String r2 = r0.f1057o
            if (r2 != 0) goto L_0x00a7
            java.lang.String r2 = ":"
            r3 = -1
            java.lang.String[] r5 = r5.split(r2, r3)
            r5 = r5[r1]
            r0.f1057o = r5
            goto L_0x00a7
        L_0x0087:
            android.os.Parcelable r5 = r0.f1051i
            if (r5 == 0) goto L_0x008c
            goto L_0x009c
        L_0x008c:
            byte[] r5 = r0.f1050h
            r0.f1049g = r5
            r0.f1048f = r3
            r0.f1052j = r1
            int r5 = r5.length
            r0.f1053k = r5
            goto L_0x00a7
        L_0x0098:
            android.os.Parcelable r5 = r0.f1051i
            if (r5 == 0) goto L_0x009f
        L_0x009c:
            r0.f1049g = r5
            goto L_0x00a7
        L_0x009f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid icon"
            r5.<init>(r0)
            throw r5
        L_0x00a7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompatParcelizer.read(g1.a):androidx.core.graphics.drawable.IconCompat");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void write(androidx.core.graphics.drawable.IconCompat r5, g1.a r6) {
        /*
            r0 = 1
            r6.H(r0, r0)
            boolean r1 = r6 instanceof g1.c
            android.graphics.PorterDuff$Mode r2 = r5.f1055m
            java.lang.String r2 = r2.name()
            r5.f1056n = r2
            int r2 = r5.f1048f
            java.lang.String r3 = "UTF-16"
            switch(r2) {
                case -1: goto L_0x0056;
                case 0: goto L_0x0015;
                case 1: goto L_0x003d;
                case 2: goto L_0x002e;
                case 3: goto L_0x0027;
                case 4: goto L_0x0016;
                case 5: goto L_0x003d;
                case 6: goto L_0x0016;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0067
        L_0x0016:
            java.lang.Object r1 = r5.f1049g
            java.lang.String r1 = r1.toString()
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r3)
            byte[] r1 = r1.getBytes(r2)
            r5.f1050h = r1
            goto L_0x0067
        L_0x0027:
            java.lang.Object r1 = r5.f1049g
            byte[] r1 = (byte[]) r1
            r5.f1050h = r1
            goto L_0x0067
        L_0x002e:
            java.lang.Object r1 = r5.f1049g
            java.lang.String r1 = (java.lang.String) r1
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r3)
            byte[] r1 = r1.getBytes(r2)
            r5.f1050h = r1
            goto L_0x0067
        L_0x003d:
            if (r1 == 0) goto L_0x0058
            java.lang.Object r1 = r5.f1049g
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG
            r4 = 90
            r1.compress(r3, r4, r2)
            byte[] r1 = r2.toByteArray()
            r5.f1050h = r1
            goto L_0x0067
        L_0x0056:
            if (r1 != 0) goto L_0x005f
        L_0x0058:
            java.lang.Object r1 = r5.f1049g
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            r5.f1051i = r1
            goto L_0x0067
        L_0x005f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Can't serialize Icon created with IconCompat#createFromIcon"
            r5.<init>(r6)
            throw r5
        L_0x0067:
            int r1 = r5.f1048f
            r2 = -1
            if (r2 == r1) goto L_0x006f
            r6.U(r1, r0)
        L_0x006f:
            byte[] r0 = r5.f1050h
            if (r0 == 0) goto L_0x0077
            r1 = 2
            r6.O(r0, r1)
        L_0x0077:
            android.os.Parcelable r0 = r5.f1051i
            if (r0 == 0) goto L_0x007f
            r1 = 3
            r6.a0(r0, r1)
        L_0x007f:
            int r0 = r5.f1052j
            if (r0 == 0) goto L_0x0087
            r1 = 4
            r6.U(r0, r1)
        L_0x0087:
            int r0 = r5.f1053k
            if (r0 == 0) goto L_0x008f
            r1 = 5
            r6.U(r0, r1)
        L_0x008f:
            android.content.res.ColorStateList r0 = r5.f1054l
            if (r0 == 0) goto L_0x0097
            r1 = 6
            r6.a0(r0, r1)
        L_0x0097:
            java.lang.String r0 = r5.f1056n
            if (r0 == 0) goto L_0x009f
            r1 = 7
            r6.c0(r1, r0)
        L_0x009f:
            java.lang.String r5 = r5.f1057o
            if (r5 == 0) goto L_0x00a8
            r0 = 8
            r6.c0(r0, r5)
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompatParcelizer.write(androidx.core.graphics.drawable.IconCompat, g1.a):void");
    }
}
