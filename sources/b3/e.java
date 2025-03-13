package b3;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.f;
import com.bumptech.glide.j;
import com.bumptech.glide.k;
import java.util.ArrayList;
import r2.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final n2.a f2576a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f2577b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f2578c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final k f2579d;
    public final s2.c e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2580f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2581g;

    /* renamed from: h  reason: collision with root package name */
    public j<Bitmap> f2582h;

    /* renamed from: i  reason: collision with root package name */
    public a f2583i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2584j;

    /* renamed from: k  reason: collision with root package name */
    public a f2585k;

    /* renamed from: l  reason: collision with root package name */
    public Bitmap f2586l;

    /* renamed from: m  reason: collision with root package name */
    public p2.k<Bitmap> f2587m;

    /* renamed from: n  reason: collision with root package name */
    public a f2588n;

    /* renamed from: o  reason: collision with root package name */
    public int f2589o;

    /* renamed from: p  reason: collision with root package name */
    public int f2590p;

    /* renamed from: q  reason: collision with root package name */
    public int f2591q;

    public static class a extends h3.a<Bitmap> {

        /* renamed from: d  reason: collision with root package name */
        public final Handler f2592d;
        public final int e;

        /* renamed from: f  reason: collision with root package name */
        public final long f2593f;

        /* renamed from: g  reason: collision with root package name */
        public Bitmap f2594g;

        public a(Handler handler, int i8, long j8) {
            this.f2592d = handler;
            this.e = i8;
            this.f2593f = j8;
        }

        public final void i(Object obj) {
            this.f2594g = (Bitmap) obj;
            Handler handler = this.f2592d;
            handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f2593f);
        }

        public final void k() {
            this.f2594g = null;
        }
    }

    public interface b {
        void a();
    }

    public class c implements Handler.Callback {
        public c() {
        }

        public final boolean handleMessage(Message message) {
            int i8 = message.what;
            e eVar = e.this;
            if (i8 == 1) {
                eVar.b((a) message.obj);
                return true;
            } else if (i8 != 2) {
                return false;
            } else {
                eVar.f2579d.l((a) message.obj);
                return false;
            }
        }
    }

    public e(com.bumptech.glide.b bVar, n2.e eVar, int i8, int i9, x2.c cVar, Bitmap bitmap) {
        s2.c cVar2 = bVar.f2913a;
        f fVar = bVar.f2915c;
        k d9 = com.bumptech.glide.b.d(fVar.getBaseContext());
        k d10 = com.bumptech.glide.b.d(fVar.getBaseContext());
        d10.getClass();
        j<Bitmap> o8 = new j(d10.f2959a, d10, d10.f2960b).o(k.f2958k).o(((g3.f) ((g3.f) ((g3.f) new g3.f().d(l.f6823a)).m()).j(true)).f(i8, i9));
        this.f2579d = d9;
        Handler handler = new Handler(Looper.getMainLooper(), new c());
        this.e = cVar2;
        this.f2577b = handler;
        this.f2582h = o8;
        this.f2576a = eVar;
        c(cVar, bitmap);
    }

    public final void a() {
        if (this.f2580f && !this.f2581g) {
            a aVar = this.f2588n;
            if (aVar != null) {
                this.f2588n = null;
                b(aVar);
                return;
            }
            this.f2581g = true;
            n2.a aVar2 = this.f2576a;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) aVar2.g());
            aVar2.d();
            this.f2585k = new a(this.f2577b, aVar2.b(), uptimeMillis);
            this.f2582h.o((g3.f) new g3.f().i(new j3.b(Double.valueOf(Math.random())))).s(aVar2).r(this.f2585k);
        }
    }

    public final void b(a aVar) {
        this.f2581g = false;
        boolean z8 = this.f2584j;
        Handler handler = this.f2577b;
        if (z8) {
            handler.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f2580f) {
            this.f2588n = aVar;
        } else {
            if (aVar.f2594g != null) {
                Bitmap bitmap = this.f2586l;
                if (bitmap != null) {
                    this.e.e(bitmap);
                    this.f2586l = null;
                }
                a aVar2 = this.f2583i;
                this.f2583i = aVar;
                ArrayList arrayList = this.f2578c;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((b) arrayList.get(size)).a();
                }
                if (aVar2 != null) {
                    handler.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            a();
        }
    }

    public final void c(p2.k<Bitmap> kVar, Bitmap bitmap) {
        k3.j.l(kVar);
        this.f2587m = kVar;
        k3.j.l(bitmap);
        this.f2586l = bitmap;
        this.f2582h = this.f2582h.o(new g3.f().l(kVar));
        this.f2589o = k3.k.c(bitmap);
        this.f2590p = bitmap.getWidth();
        this.f2591q = bitmap.getHeight();
    }
}
