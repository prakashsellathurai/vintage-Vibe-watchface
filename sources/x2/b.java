package x2;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import p2.f;
import p2.g;
import p2.i;
import y2.c;
import y2.h;
import y2.l;

public abstract class b<T> implements i<ImageDecoder.Source, T> {

    /* renamed from: a  reason: collision with root package name */
    public final l f8118a;

    public b() {
        if (l.f8368f == null) {
            synchronized (l.class) {
                if (l.f8368f == null) {
                    l.f8368f = new l();
                }
            }
        }
        this.f8118a = l.f8368f;
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj, g gVar) {
        ImageDecoder.Source source = (ImageDecoder.Source) obj;
        return true;
    }

    /* renamed from: c */
    public final c b(ImageDecoder.Source source, int i8, int i9, g gVar) {
        p2.b bVar = (p2.b) gVar.c(h.f8354f);
        y2.g gVar2 = (y2.g) gVar.c(y2.g.f8353d);
        f fVar = h.f8358j;
        y2.b bVar2 = (y2.b) this;
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, new a(this, i8, i9, gVar.c(fVar) != null && ((Boolean) gVar.c(fVar)).booleanValue(), bVar, gVar2, (p2.h) gVar.c(h.f8355g)));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            decodeBitmap.getWidth();
            decodeBitmap.getHeight();
        }
        return new c(decodeBitmap, (s2.c) bVar2.f8338b);
    }
}
