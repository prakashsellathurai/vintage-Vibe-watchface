package y2;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import k3.d;
import p2.g;
import p2.i;
import r2.v;
import s2.b;
import s2.c;
import y2.h;
import y2.m;

public final class p implements i<InputStream, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final h f8387a;

    /* renamed from: b  reason: collision with root package name */
    public final b f8388b;

    public static class a implements h.b {

        /* renamed from: a  reason: collision with root package name */
        public final o f8389a;

        /* renamed from: b  reason: collision with root package name */
        public final d f8390b;

        public a(o oVar, d dVar) {
            this.f8389a = oVar;
            this.f8390b = dVar;
        }

        public final void a(Bitmap bitmap, c cVar) {
            IOException iOException = this.f8390b.f5134g;
            if (iOException != null) {
                if (bitmap != null) {
                    cVar.e(bitmap);
                }
                throw iOException;
            }
        }

        public final void b() {
            o oVar = this.f8389a;
            synchronized (oVar) {
                oVar.f8383h = oVar.f8381f.length;
            }
        }
    }

    public p(h hVar, b bVar) {
        this.f8387a = hVar;
        this.f8388b = bVar;
    }

    public final boolean a(Object obj, g gVar) {
        InputStream inputStream = (InputStream) obj;
        this.f8387a.getClass();
        return true;
    }

    public final v b(Object obj, int i8, int i9, g gVar) {
        boolean z8;
        o oVar;
        d dVar;
        InputStream inputStream = (InputStream) obj;
        if (inputStream instanceof o) {
            oVar = (o) inputStream;
            z8 = false;
        } else {
            z8 = true;
            oVar = new o(inputStream, this.f8388b);
        }
        ArrayDeque arrayDeque = d.f5132h;
        synchronized (arrayDeque) {
            dVar = (d) arrayDeque.poll();
        }
        if (dVar == null) {
            dVar = new d();
        }
        dVar.f5133f = oVar;
        k3.h hVar = new k3.h(dVar);
        a aVar = new a(oVar, dVar);
        try {
            h hVar2 = this.f8387a;
            c a9 = hVar2.a(new m.a(hVar2.f8363c, hVar, hVar2.f8364d), i8, i9, gVar, aVar);
            dVar.f5134g = null;
            dVar.f5133f = null;
            synchronized (arrayDeque) {
                arrayDeque.offer(dVar);
            }
            if (z8) {
                oVar.c();
            }
            return a9;
        } catch (Throwable th) {
            dVar.f5134g = null;
            dVar.f5133f = null;
            ArrayDeque arrayDeque2 = d.f5132h;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(dVar);
                if (z8) {
                    oVar.c();
                }
                throw th;
            }
        }
    }
}
