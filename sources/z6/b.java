package z6;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicReference;
import k6.d;
import k6.e;
import k6.j;
import n6.h;
import z6.c;

public class b extends c.a {

    /* renamed from: c  reason: collision with root package name */
    public BitmapDrawable f8707c;

    /* renamed from: d  reason: collision with root package name */
    public String f8708d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public Runnable f8709f;

    /* renamed from: g  reason: collision with root package name */
    public a f8710g;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Bitmap f8711a;

        /* renamed from: b  reason: collision with root package name */
        public final long f8712b;

        public a(Bitmap bitmap) {
            this.f8711a = bitmap;
            this.f8712b = SystemClock.elapsedRealtime();
        }

        public a(Bitmap bitmap, long j8) {
            this.f8711a = bitmap;
            this.f8712b = j8;
        }
    }

    public BitmapDrawable a() {
        if (this.e) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            AtomicReference atomicReference = new AtomicReference();
            j6.b bVar = this.f8714a;
            String str = this.f8708d;
            a aVar = new a(this, atomicReference, elapsedRealtime, 0);
            k6.a aVar2 = new k6.a(bVar.e, bVar.f5039f);
            j jVar = bVar.f5041h;
            jVar.f5207b = aVar2;
            String b9 = j.b(str, (Integer) null, (Integer) null, (Integer) null);
            Bitmap a9 = jVar.a(b9);
            if (a9 != null) {
                h.b().c((Runnable) null, new k6.c(aVar, a9, 0));
            } else {
                AtomicReference atomicReference2 = new AtomicReference();
                h.b().c(new d(jVar, atomicReference2, str, 0), new e(jVar, b9, atomicReference2, aVar, 0));
            }
            d();
            this.e = false;
        }
        return this.f8707c;
    }

    public void b() {
        this.f8707c = null;
        this.f8710g.f8711a = null;
    }

    public final void c(BitmapDrawable bitmapDrawable) {
        this.f8710g = new a(bitmapDrawable.getBitmap());
        this.f8707c = bitmapDrawable;
    }

    public final void d() {
        this.f8707c = new BitmapDrawable(this.f8715b, this.f8710g.f8711a);
    }
}
