package z6;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.SystemClock;
import j6.b;
import java.util.concurrent.atomic.AtomicReference;
import k6.a;
import k6.c;
import k6.g;
import k6.j;
import n6.h;

public final class e extends b {

    /* renamed from: h  reason: collision with root package name */
    public int f8717h;

    /* renamed from: i  reason: collision with root package name */
    public int f8718i;

    public final BitmapDrawable a() {
        if (this.e) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            AtomicReference atomicReference = new AtomicReference();
            b bVar = this.f8714a;
            String str = this.f8708d;
            int i8 = this.f8717h;
            int i9 = this.f8718i;
            a aVar = new a(this, atomicReference, elapsedRealtime, 2);
            a aVar2 = new a(bVar.e, bVar.f5039f);
            j jVar = bVar.f5041h;
            jVar.f5207b = aVar2;
            String b9 = j.b(str, Integer.valueOf(i8), Integer.valueOf(i9), (Integer) null);
            Bitmap a9 = jVar.a(b9);
            if (a9 != null) {
                h.b().c((Runnable) null, new c(aVar, a9, 2));
            } else {
                AtomicReference atomicReference2 = new AtomicReference();
                h.b().c(new g(jVar, atomicReference2, str, i8, i9), new k6.e(jVar, b9, atomicReference2, aVar, 2));
            }
            d();
            this.e = false;
        }
        return this.f8707c;
    }
}
