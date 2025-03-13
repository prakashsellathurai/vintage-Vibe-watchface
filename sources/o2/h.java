package o2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.Log;
import android.util.LruCache;
import b3.b;
import com.bumptech.glide.integration.webp.WebpFrame;
import com.bumptech.glide.integration.webp.WebpImage;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import n2.a;

public final class h implements a {

    /* renamed from: a  reason: collision with root package name */
    public ByteBuffer f6023a;

    /* renamed from: b  reason: collision with root package name */
    public WebpImage f6024b;

    /* renamed from: c  reason: collision with root package name */
    public final a.C0094a f6025c;

    /* renamed from: d  reason: collision with root package name */
    public int f6026d;
    public final int[] e;

    /* renamed from: f  reason: collision with root package name */
    public final com.bumptech.glide.integration.webp.a[] f6027f;

    /* renamed from: g  reason: collision with root package name */
    public int f6028g;

    /* renamed from: h  reason: collision with root package name */
    public int f6029h;

    /* renamed from: i  reason: collision with root package name */
    public int f6030i;

    /* renamed from: j  reason: collision with root package name */
    public final Paint f6031j;

    /* renamed from: k  reason: collision with root package name */
    public final l f6032k;

    /* renamed from: l  reason: collision with root package name */
    public Bitmap.Config f6033l;

    /* renamed from: m  reason: collision with root package name */
    public final LruCache<Integer, Bitmap> f6034m;

    public h(b bVar, WebpImage webpImage, ByteBuffer byteBuffer, int i8) {
        this(bVar, webpImage, byteBuffer, i8, l.f6052b);
    }

    public h(b bVar, WebpImage webpImage, ByteBuffer byteBuffer, int i8, l lVar) {
        this.f6026d = -1;
        this.f6033l = Bitmap.Config.ARGB_8888;
        this.f6025c = bVar;
        this.f6024b = webpImage;
        this.e = webpImage.getFrameDurations();
        this.f6027f = new com.bumptech.glide.integration.webp.a[webpImage.getFrameCount()];
        for (int i9 = 0; i9 < this.f6024b.getFrameCount(); i9++) {
            this.f6027f[i9] = this.f6024b.getFrameInfo(i9);
            if (Log.isLoggable("WebpDecoder", 3)) {
                this.f6027f[i9].toString();
            }
        }
        this.f6032k = lVar;
        Paint paint = new Paint();
        this.f6031j = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.f6034m = new g(this, lVar.f6054a == 4 ? webpImage.getFrameCount() : Math.max(5, 0));
        new ArrayList();
        if (i8 > 0) {
            int highestOneBit = Integer.highestOneBit(i8);
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f6023a = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f6028g = highestOneBit;
            this.f6030i = this.f6024b.getWidth() / highestOneBit;
            this.f6029h = this.f6024b.getHeight() / highestOneBit;
            return;
        }
        throw new IllegalArgumentException("Sample size must be >=0, not: " + i8);
    }

    public final ByteBuffer a() {
        return this.f6023a;
    }

    public final int b() {
        return this.f6026d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008c, code lost:
        r6 = r6 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap c() {
        /*
            r15 = this;
            int r0 = r15.f6026d
            int r1 = r15.f6030i
            int r2 = r15.f6029h
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            n2.a$a r4 = r15.f6025c
            b3.b r4 = (b3.b) r4
            s2.c r5 = r4.f2563a
            android.graphics.Bitmap r1 = r5.c(r1, r2, r3)
            r2 = 0
            r1.eraseColor(r2)
            int r3 = android.util.DisplayMetrics.DENSITY_DEVICE_STABLE
            r1.setDensity(r3)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r1)
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.SRC
            r3.drawColor(r2, r5)
            o2.l r5 = r15.f6032k
            int r5 = r5.f6054a
            r6 = 1
            if (r5 != r6) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r6 = r2
        L_0x002e:
            android.util.LruCache<java.lang.Integer, android.graphics.Bitmap> r5 = r15.f6034m
            r7 = 0
            r8 = 3
            java.lang.String r9 = "WebpDecoder"
            r10 = 0
            if (r6 != 0) goto L_0x0051
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            java.lang.Object r6 = r5.get(r6)
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            if (r6 == 0) goto L_0x0051
            android.util.Log.isLoggable(r9, r8)
            int r15 = r3.getDensity()
            r6.setDensity(r15)
            r3.drawBitmap(r6, r10, r10, r7)
            return r1
        L_0x0051:
            boolean r6 = r15.n(r0)
            com.bumptech.glide.integration.webp.a[] r11 = r15.f6027f
            if (r6 != 0) goto L_0x009b
            int r6 = r0 + -1
        L_0x005b:
            if (r6 < 0) goto L_0x0099
            r12 = r11[r6]
            boolean r13 = r12.f2951h
            if (r13 == 0) goto L_0x0069
            boolean r13 = r15.m(r12)
            if (r13 != 0) goto L_0x008c
        L_0x0069:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            java.lang.Object r13 = r5.get(r13)
            android.graphics.Bitmap r13 = (android.graphics.Bitmap) r13
            if (r13 == 0) goto L_0x008f
            boolean r14 = r13.isRecycled()
            if (r14 != 0) goto L_0x008f
            int r14 = r3.getDensity()
            r13.setDensity(r14)
            r3.drawBitmap(r13, r10, r10, r7)
            boolean r13 = r12.f2951h
            if (r13 == 0) goto L_0x008c
            r15.l(r3, r12)
        L_0x008c:
            int r6 = r6 + 1
            goto L_0x009c
        L_0x008f:
            boolean r12 = r15.n(r6)
            if (r12 == 0) goto L_0x0096
            goto L_0x009c
        L_0x0096:
            int r6 = r6 + -1
            goto L_0x005b
        L_0x0099:
            r6 = r2
            goto L_0x009c
        L_0x009b:
            r6 = r0
        L_0x009c:
            android.util.Log.isLoggable(r9, r8)
        L_0x009f:
            if (r6 >= r0) goto L_0x00ba
            r12 = r11[r6]
            boolean r13 = r12.f2950g
            if (r13 != 0) goto L_0x00aa
            r15.l(r3, r12)
        L_0x00aa:
            r15.o(r6, r3)
            android.util.Log.isLoggable(r9, r8)
            boolean r13 = r12.f2951h
            if (r13 == 0) goto L_0x00b7
            r15.l(r3, r12)
        L_0x00b7:
            int r6 = r6 + 1
            goto L_0x009f
        L_0x00ba:
            r6 = r11[r0]
            boolean r11 = r6.f2950g
            if (r11 != 0) goto L_0x00c3
            r15.l(r3, r6)
        L_0x00c3:
            r15.o(r0, r3)
            android.util.Log.isLoggable(r9, r8)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            r5.remove(r15)
            int r15 = r1.getWidth()
            int r3 = r1.getHeight()
            android.graphics.Bitmap$Config r6 = r1.getConfig()
            s2.c r4 = r4.f2563a
            android.graphics.Bitmap r15 = r4.c(r15, r3, r6)
            r15.eraseColor(r2)
            int r3 = r1.getDensity()
            r15.setDensity(r3)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r15)
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC
            r3.drawColor(r2, r4)
            r3.drawBitmap(r1, r10, r10, r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.put(r0, r15)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.h.c():android.graphics.Bitmap");
    }

    public final void clear() {
        this.f6024b.dispose();
        this.f6024b = null;
        this.f6034m.evictAll();
        this.f6023a = null;
    }

    public final void d() {
        this.f6026d = (this.f6026d + 1) % this.f6024b.getFrameCount();
    }

    public final int e() {
        return this.f6024b.getHeight();
    }

    public final int f() {
        return this.f6024b.getFrameCount();
    }

    public final int g() {
        int i8;
        if (this.e.length == 0 || (i8 = this.f6026d) < 0) {
            return 0;
        }
        return i(i8);
    }

    public final int h() {
        return this.f6024b.getSizeInBytes();
    }

    public final int i(int i8) {
        if (i8 >= 0) {
            int[] iArr = this.e;
            if (i8 < iArr.length) {
                return iArr[i8];
            }
        }
        return -1;
    }

    public final int j() {
        return this.f6024b.getWidth();
    }

    public final void k() {
        this.f6026d = -1;
    }

    public final void l(Canvas canvas, com.bumptech.glide.integration.webp.a aVar) {
        int i8 = this.f6028g;
        int i9 = aVar.f2946b;
        int i10 = aVar.f2947c;
        Canvas canvas2 = canvas;
        canvas2.drawRect((float) (i9 / i8), (float) (i10 / i8), (float) ((i9 + aVar.f2948d) / i8), (float) ((i10 + aVar.e) / i8), this.f6031j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r0 = r2.f6024b.getWidth();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r2 = r2.f6024b.getHeight();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m(com.bumptech.glide.integration.webp.a r3) {
        /*
            r2 = this;
            int r0 = r3.f2946b
            if (r0 != 0) goto L_0x001e
            int r0 = r3.f2947c
            if (r0 != 0) goto L_0x001e
            com.bumptech.glide.integration.webp.WebpImage r0 = r2.f6024b
            int r0 = r0.getWidth()
            int r1 = r3.f2948d
            if (r1 != r0) goto L_0x001e
            com.bumptech.glide.integration.webp.WebpImage r2 = r2.f6024b
            int r2 = r2.getHeight()
            int r3 = r3.e
            if (r3 != r2) goto L_0x001e
            r2 = 1
            goto L_0x001f
        L_0x001e:
            r2 = 0
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.h.m(com.bumptech.glide.integration.webp.a):boolean");
    }

    public final boolean n(int i8) {
        if (i8 == 0) {
            return true;
        }
        com.bumptech.glide.integration.webp.a[] aVarArr = this.f6027f;
        com.bumptech.glide.integration.webp.a aVar = aVarArr[i8];
        com.bumptech.glide.integration.webp.a aVar2 = aVarArr[i8 - 1];
        if (aVar.f2950g || !m(aVar)) {
            return aVar2.f2951h && m(aVar2);
        }
        return true;
    }

    public final void o(int i8, Canvas canvas) {
        a.C0094a aVar = this.f6025c;
        com.bumptech.glide.integration.webp.a aVar2 = this.f6027f[i8];
        int i9 = aVar2.f2948d;
        int i10 = this.f6028g;
        int i11 = i9 / i10;
        int i12 = aVar2.e / i10;
        int i13 = aVar2.f2946b / i10;
        int i14 = aVar2.f2947c / i10;
        WebpFrame frame = this.f6024b.getFrame(i8);
        try {
            Bitmap c9 = ((b) aVar).f2563a.c(i11, i12, this.f6033l);
            c9.eraseColor(0);
            c9.setDensity(canvas.getDensity());
            frame.renderFrame(i11, i12, c9);
            canvas.drawBitmap(c9, (float) i13, (float) i14, (Paint) null);
            ((b) aVar).f2563a.e(c9);
        } catch (IllegalStateException unused) {
            Log.e("WebpDecoder", "Rendering of frame failed. Frame number: " + i8);
        } catch (Throwable th) {
            frame.dispose();
            throw th;
        }
        frame.dispose();
    }
}
