package b3;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import b3.c;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.List;
import k3.f;
import k3.k;
import n2.d;
import n2.e;
import p2.g;
import p2.i;
import r2.v;
import s2.c;

public final class a implements i<ByteBuffer, c> {

    /* renamed from: f  reason: collision with root package name */
    public static final C0029a f2556f = new C0029a();

    /* renamed from: g  reason: collision with root package name */
    public static final b f2557g = new b();

    /* renamed from: a  reason: collision with root package name */
    public final Context f2558a;

    /* renamed from: b  reason: collision with root package name */
    public final List<ImageHeaderParser> f2559b;

    /* renamed from: c  reason: collision with root package name */
    public final b f2560c = f2557g;

    /* renamed from: d  reason: collision with root package name */
    public final C0029a f2561d;
    public final b e;

    /* renamed from: b3.a$a  reason: collision with other inner class name */
    public static class C0029a {
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayDeque f2562a = new ArrayDeque(0);

        public b() {
            char[] cArr = k.f5169a;
        }
    }

    public a(Context context, List<ImageHeaderParser> list, c cVar, s2.b bVar) {
        C0029a aVar = f2556f;
        this.f2558a = context.getApplicationContext();
        this.f2559b = list;
        this.f2561d = aVar;
        this.e = new b(bVar, cVar);
    }

    public final boolean a(Object obj, g gVar) {
        ImageHeaderParser.ImageType imageType;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (((Boolean) gVar.c(f.f2597b)).booleanValue()) {
            return false;
        }
        if (byteBuffer == null) {
            imageType = ImageHeaderParser.ImageType.UNKNOWN;
        } else {
            List<ImageHeaderParser> list = this.f2559b;
            int size = list.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size) {
                    imageType = ImageHeaderParser.ImageType.UNKNOWN;
                    break;
                }
                ImageHeaderParser.ImageType a9 = list.get(i8).a(byteBuffer);
                if (a9 != ImageHeaderParser.ImageType.UNKNOWN) {
                    imageType = a9;
                    break;
                }
                i8++;
            }
        }
        return imageType == ImageHeaderParser.ImageType.GIF;
    }

    public final v b(Object obj, int i8, int i9, g gVar) {
        d dVar;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        b bVar = this.f2560c;
        synchronized (bVar) {
            d dVar2 = (d) bVar.f2562a.poll();
            if (dVar2 == null) {
                dVar2 = new d();
            }
            dVar = dVar2;
            dVar.g(byteBuffer);
        }
        try {
            o2.k c9 = c(byteBuffer, i8, i9, dVar, gVar);
            b bVar2 = this.f2560c;
            synchronized (bVar2) {
                dVar.f5927b = null;
                dVar.f5928c = null;
                bVar2.f2562a.offer(dVar);
            }
            return c9;
        } catch (Throwable th) {
            b bVar3 = this.f2560c;
            synchronized (bVar3) {
                dVar.f5927b = null;
                dVar.f5928c = null;
                bVar3.f2562a.offer(dVar);
                throw th;
            }
        }
    }

    public final o2.k c(ByteBuffer byteBuffer, int i8, int i9, d dVar, g gVar) {
        int i10 = f.f5137a;
        SystemClock.elapsedRealtimeNanos();
        try {
            n2.c b9 = dVar.b();
            if (b9.f5918c > 0) {
                if (b9.f5917b == 0) {
                    Bitmap.Config config = gVar.c(f.f2596a) == p2.b.f6301g ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                    int min = Math.min(b9.f5921g / i9, b9.f5920f / i8);
                    int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
                    Log.isLoggable("BufferGifDecoder", 2);
                    C0029a aVar = this.f2561d;
                    b bVar = this.e;
                    aVar.getClass();
                    e eVar = new e(bVar);
                    ByteBuffer byteBuffer2 = byteBuffer;
                    eVar.m(b9, byteBuffer, max);
                    eVar.n(config);
                    eVar.d();
                    Bitmap c9 = eVar.c();
                    if (c9 == null) {
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            SystemClock.elapsedRealtimeNanos();
                        }
                        return null;
                    }
                    o2.k kVar = new o2.k(new c(new c.a(new e(com.bumptech.glide.b.b(this.f2558a), eVar, i8, i9, x2.c.f8119b, c9))), 2);
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        SystemClock.elapsedRealtimeNanos();
                    }
                    return kVar;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }
}
