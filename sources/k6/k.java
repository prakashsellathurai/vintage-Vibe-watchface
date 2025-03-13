package k6;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class k extends l {

    /* renamed from: c  reason: collision with root package name */
    public final Context f5209c;

    /* renamed from: d  reason: collision with root package name */
    public final n2.a f5210d;
    public int e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f5211f = -1;

    /* renamed from: g  reason: collision with root package name */
    public final a f5212g;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f5213a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5214b;

        /* renamed from: c  reason: collision with root package name */
        public final int f5215c;

        /* renamed from: d  reason: collision with root package name */
        public final float f5216d;

        public a(float f9, int i8, int i9, int i10) {
            this.f5213a = i8;
            this.f5214b = i9;
            this.f5215c = i10;
            this.f5216d = f9;
        }
    }

    public k(Resources resources, String str, InputStream inputStream, Context context) {
        super(resources, str);
        byte[] bArr;
        this.f5209c = context;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[16384];
            int i8 = 0;
            while (i8 != -1) {
                i8 = inputStream.read(bArr2, 0, 16384);
                if (i8 > 0) {
                    byteArrayOutputStream.write(bArr2, 0, i8);
                }
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            Log.e("DWF:GifImageDecoder", "Failed to read from inputStream " + inputStream);
            bArr = null;
        }
        this.f5210d = b(bArr);
        float f9 = 0.0f;
        for (int i9 = 0; i9 < this.f5210d.f(); i9++) {
            f9 += (float) this.f5210d.i(i9);
        }
        this.f5212g = new a(f9, this.f5210d.f(), this.f5210d.j(), this.f5210d.e());
    }

    public final Bitmap a(String str) {
        int i8 = this.e;
        int i9 = this.f5211f;
        n2.a aVar = this.f5210d;
        if (i9 > i8) {
            aVar.k();
        }
        Bitmap bitmap = null;
        while (aVar.b() != i8) {
            aVar.d();
            bitmap = aVar.c();
            if (!(aVar.b() == i8 || bitmap == null || bitmap.isRecycled())) {
                bitmap.recycle();
            }
        }
        if (bitmap == null) {
            bitmap = aVar.c();
        }
        this.f5211f = i8;
        return bitmap;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public n2.a b(byte[] r5) {
        /*
            r4 = this;
            n2.e r0 = new n2.e
            b3.b r1 = new b3.b
            android.content.Context r4 = r4.f5209c
            com.bumptech.glide.b r2 = com.bumptech.glide.b.b(r4)
            s2.c r2 = r2.f2913a
            com.bumptech.glide.b r4 = com.bumptech.glide.b.b(r4)
            s2.b r4 = r4.e
            r1.<init>(r4, r2)
            r0.<init>(r1)
            n2.d r4 = new n2.d
            r4.<init>()
            r1 = 0
            if (r5 == 0) goto L_0x0028
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r5)
            r4.g(r2)
            goto L_0x002f
        L_0x0028:
            r4.f5927b = r1
            n2.c r2 = r4.f5928c
            r3 = 2
            r2.f5917b = r3
        L_0x002f:
            n2.c r2 = r4.b()
            r4.f5927b = r1
            r4.f5928c = r1
            int r4 = r2.f5917b
            if (r4 != 0) goto L_0x0053
            monitor-enter(r0)
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r5)     // Catch:{ all -> 0x0050 }
            monitor-enter(r0)     // Catch:{ all -> 0x0050 }
            r5 = 1
            r0.m(r2, r4, r5)     // Catch:{ all -> 0x004d }
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            monitor-exit(r0)
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            r0.n(r4)
            return r0
        L_0x004d:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            throw r4     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        L_0x0053:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Illegal status: "
            r5.<init>(r0)
            int r0 = r2.f5917b
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.k.b(byte[]):n2.a");
    }
}
