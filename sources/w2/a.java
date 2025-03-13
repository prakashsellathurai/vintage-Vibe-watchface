package w2;

import com.bumptech.glide.load.data.i;
import java.io.InputStream;
import java.util.ArrayDeque;
import p2.g;
import v2.f;
import v2.l;
import v2.m;
import v2.n;
import v2.o;
import v2.r;

public final class a implements n<f, InputStream> {

    /* renamed from: b  reason: collision with root package name */
    public static final p2.f<Integer> f7983b = p2.f.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* renamed from: a  reason: collision with root package name */
    public final m<f, f> f7984a;

    /* renamed from: w2.a$a  reason: collision with other inner class name */
    public static class C0151a implements o<f, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final m<f, f> f7985a = new m<>();

        public final n<f, InputStream> b(r rVar) {
            return new a(this.f7985a);
        }
    }

    public a(m<f, f> mVar) {
        this.f7984a = mVar;
    }

    public final n.a a(Object obj, int i8, int i9, g gVar) {
        f fVar = (f) obj;
        m<f, f> mVar = this.f7984a;
        if (mVar != null) {
            m.a a9 = m.a.a(fVar);
            l lVar = mVar.f7879a;
            Object a10 = lVar.a(a9);
            ArrayDeque arrayDeque = m.a.f7880d;
            synchronized (arrayDeque) {
                arrayDeque.offer(a9);
            }
            f fVar2 = (f) a10;
            if (fVar2 == null) {
                lVar.d(m.a.a(fVar), fVar);
            } else {
                fVar = fVar2;
            }
        }
        return new n.a(fVar, new i(fVar, ((Integer) gVar.c(f7983b)).intValue()));
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        f fVar = (f) obj;
        return true;
    }
}
