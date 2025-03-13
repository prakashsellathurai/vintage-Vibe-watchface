package k6;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import androidx.health.services.client.impl.i;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.IntConsumer;
import l6.b;
import l6.d;
import n6.g;
import n6.h;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final l6.a f5206a;

    /* renamed from: b  reason: collision with root package name */
    public b f5207b;

    /* renamed from: c  reason: collision with root package name */
    public final b f5208c;

    public interface a {
    }

    public interface b {
    }

    public j(i iVar, long j8) {
        this.f5208c = iVar;
        this.f5206a = new l6.a(j8);
        Log.i("DWF:BitmapManager", "Using maximum bitmap cache size " + (j8 / 1024) + "KB");
    }

    public static String b(String str, Integer num, Integer num2, Integer num3) {
        return str + "_" + num + "_" + num2 + "_" + num3;
    }

    public final Bitmap a(String str) {
        l6.b bVar = (l6.b) ((d) this.f5206a.f5323a.get(str));
        if (bVar != null) {
            return ((b.a) bVar.f5325f).f5321a;
        }
        return null;
    }

    public final Bitmap c(String str) {
        Bitmap bitmap = null;
        if (g.e(str)) {
            return null;
        }
        try {
            ImageDecoder.Source e = ((j6.b) ((i) this.f5208c).f1385b).e(str);
            if (e != null) {
                bitmap = ImageDecoder.decodeBitmap(e, new i());
            }
            if (bitmap != null) {
                return bitmap;
            }
        } catch (Exception e4) {
            e4.getMessage();
        } catch (Throwable th) {
            this.f5207b.a(str);
            throw th;
        }
        return this.f5207b.a(str);
    }

    public final void d(String str, int i8, z6.a aVar, k kVar) {
        String b9 = b(str, (Integer) null, (Integer) null, Integer.valueOf(i8));
        Bitmap a9 = a(b9);
        if (a9 != null) {
            h.b().c((Runnable) null, new c(aVar, a9, 1));
            return;
        }
        AtomicReference atomicReference = new AtomicReference();
        h.b().c(new f(kVar, i8, atomicReference, str), new e(this, b9, atomicReference, aVar, 1));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r1 == null) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap e(java.lang.String r3, int r4, int r5) {
        /*
            r2 = this;
            boolean r0 = n6.g.e(r3)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            k6.j$b r0 = r2.f5208c     // Catch:{ Exception -> 0x0024 }
            androidx.health.services.client.impl.i r0 = (androidx.health.services.client.impl.i) r0     // Catch:{ Exception -> 0x0024 }
            java.lang.Object r0 = r0.f1385b     // Catch:{ Exception -> 0x0024 }
            j6.b r0 = (j6.b) r0     // Catch:{ Exception -> 0x0024 }
            android.graphics.ImageDecoder$Source r0 = r0.e(r3)     // Catch:{ Exception -> 0x0024 }
            if (r0 == 0) goto L_0x001f
            k6.h r1 = new k6.h     // Catch:{ Exception -> 0x0024 }
            r1.<init>(r4, r5)     // Catch:{ Exception -> 0x0024 }
            android.graphics.Bitmap r1 = android.graphics.ImageDecoder.decodeBitmap(r0, r1)     // Catch:{ Exception -> 0x0024 }
        L_0x001f:
            if (r1 != 0) goto L_0x002e
            goto L_0x0028
        L_0x0022:
            r4 = move-exception
            goto L_0x0036
        L_0x0024:
            r0 = move-exception
            r0.getMessage()     // Catch:{ all -> 0x0022 }
        L_0x0028:
            k6.b r2 = r2.f5207b
            android.graphics.Bitmap r1 = r2.a(r3)
        L_0x002e:
            if (r1 == 0) goto L_0x0035
            r2 = 1
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createScaledBitmap(r1, r4, r5, r2)
        L_0x0035:
            return r1
        L_0x0036:
            k6.b r2 = r2.f5207b
            r2.a(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.j.e(java.lang.String, int, int):android.graphics.Bitmap");
    }

    public final void f(String str, AtomicReference<Bitmap> atomicReference) {
        l6.a aVar = this.f5206a;
        Bitmap bitmap = atomicReference.get();
        if (aVar.f5319d < ((long) bitmap.getByteCount())) {
            Log.w("DWF:BitmapCache", "Exceeds bitmap cache size. Couldn't cache the bitmap");
            return;
        }
        int byteCount = bitmap.getByteCount();
        synchronized (aVar.f5318c) {
            while (true) {
                if (!(((long) (aVar.e + byteCount)) <= aVar.f5319d)) {
                    d poll = aVar.f5324b.poll();
                    if (poll != null) {
                        aVar.f5323a.remove(poll.f5326g);
                    }
                    l6.b bVar = (l6.b) poll;
                    if (bVar != null) {
                        aVar.e -= ((b.a) bVar.f5325f).f5322b;
                    }
                    IntConsumer intConsumer = aVar.f5320f;
                    if (intConsumer != null) {
                        intConsumer.accept(aVar.e);
                    }
                } else {
                    l6.b bVar2 = new l6.b(str, bitmap, (float) (bitmap.getWidth() * bitmap.getHeight()));
                    aVar.f5324b.add(bVar2);
                    aVar.f5323a.put(str, bVar2);
                    aVar.e += byteCount;
                }
            }
        }
    }
}
