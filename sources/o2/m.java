package o2;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.j;
import com.bumptech.glide.k;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import p2.e;
import p2.f;
import r2.l;

public final class m {
    public static final f<l> r = f.a(l.f6053c, "com.bumptech.glide.integration.webp.decoder.WebpFrameLoader.CacheStrategy");

    /* renamed from: a  reason: collision with root package name */
    public final h f6056a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f6057b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f6058c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final k f6059d;
    public final s2.c e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6060f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6061g = false;

    /* renamed from: h  reason: collision with root package name */
    public j<Bitmap> f6062h;

    /* renamed from: i  reason: collision with root package name */
    public a f6063i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f6064j;

    /* renamed from: k  reason: collision with root package name */
    public a f6065k;

    /* renamed from: l  reason: collision with root package name */
    public Bitmap f6066l;

    /* renamed from: m  reason: collision with root package name */
    public p2.k<Bitmap> f6067m;

    /* renamed from: n  reason: collision with root package name */
    public a f6068n;

    /* renamed from: o  reason: collision with root package name */
    public int f6069o;

    /* renamed from: p  reason: collision with root package name */
    public int f6070p;

    /* renamed from: q  reason: collision with root package name */
    public int f6071q;

    public static class a extends h3.a<Bitmap> {

        /* renamed from: d  reason: collision with root package name */
        public final Handler f6072d;
        public final int e;

        /* renamed from: f  reason: collision with root package name */
        public final long f6073f;

        /* renamed from: g  reason: collision with root package name */
        public Bitmap f6074g;

        public a(Handler handler, int i8, long j8) {
            this.f6072d = handler;
            this.e = i8;
            this.f6073f = j8;
        }

        public final void i(Object obj) {
            this.f6074g = (Bitmap) obj;
            Handler handler = this.f6072d;
            handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f6073f);
        }

        public final void k() {
            this.f6074g = null;
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
            m mVar = m.this;
            if (i8 == 1) {
                mVar.b((a) message.obj);
                return true;
            } else if (i8 != 2) {
                return false;
            } else {
                mVar.f6059d.l((a) message.obj);
                return false;
            }
        }
    }

    public static class d implements e {

        /* renamed from: b  reason: collision with root package name */
        public final e f6076b;

        /* renamed from: c  reason: collision with root package name */
        public final int f6077c;

        public d(j3.b bVar, int i8) {
            this.f6076b = bVar;
            this.f6077c = i8;
        }

        public final void a(MessageDigest messageDigest) {
            messageDigest.update(ByteBuffer.allocate(12).putInt(this.f6077c).array());
            this.f6076b.a(messageDigest);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f6076b.equals(dVar.f6076b) && this.f6077c == dVar.f6077c;
        }

        public final int hashCode() {
            return (this.f6076b.hashCode() * 31) + this.f6077c;
        }
    }

    public m(com.bumptech.glide.b bVar, h hVar, int i8, int i9, x2.c cVar, Bitmap bitmap) {
        s2.c cVar2 = bVar.f2913a;
        com.bumptech.glide.f fVar = bVar.f2915c;
        k d9 = com.bumptech.glide.b.d(fVar.getBaseContext());
        k d10 = com.bumptech.glide.b.d(fVar.getBaseContext());
        d10.getClass();
        j<Bitmap> o8 = new j(d10.f2959a, d10, d10.f2960b).o(k.f2958k).o(((g3.f) ((g3.f) ((g3.f) new g3.f().d(l.f6823a)).m()).j(true)).f(i8, i9));
        this.f6059d = d9;
        Handler handler = new Handler(Looper.getMainLooper(), new c());
        this.e = cVar2;
        this.f6057b = handler;
        this.f6062h = o8;
        this.f6056a = hVar;
        k3.j.l(cVar);
        this.f6067m = cVar;
        this.f6066l = bitmap;
        this.f6062h = this.f6062h.o(new g3.f().l(cVar));
        this.f6069o = k3.k.c(bitmap);
        this.f6070p = bitmap.getWidth();
        this.f6071q = bitmap.getHeight();
    }

    public final void a() {
        if (this.f6060f && !this.f6061g) {
            a aVar = this.f6068n;
            if (aVar != null) {
                this.f6068n = null;
                b(aVar);
                return;
            }
            boolean z8 = true;
            this.f6061g = true;
            h hVar = this.f6056a;
            int g9 = hVar.g();
            hVar.d();
            int i8 = hVar.f6026d;
            this.f6065k = new a(this.f6057b, i8, SystemClock.uptimeMillis() + ((long) g9));
            g3.f fVar = (g3.f) new g3.f().i(new d(new j3.b(hVar), i8));
            if (hVar.f6032k.f6054a != 1) {
                z8 = false;
            }
            this.f6062h.o((g3.f) fVar.j(z8)).s(hVar).r(this.f6065k);
        }
    }

    public final void b(a aVar) {
        this.f6061g = false;
        boolean z8 = this.f6064j;
        Handler handler = this.f6057b;
        if (z8) {
            handler.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f6060f) {
            this.f6068n = aVar;
        } else {
            if (aVar.f6074g != null) {
                Bitmap bitmap = this.f6066l;
                if (bitmap != null) {
                    this.e.e(bitmap);
                    this.f6066l = null;
                }
                a aVar2 = this.f6063i;
                this.f6063i = aVar;
                ArrayList arrayList = this.f6058c;
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
}
