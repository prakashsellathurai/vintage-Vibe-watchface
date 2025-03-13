package f2;

import a2.c;
import a2.f;
import android.graphics.PointF;
import e2.e;
import g2.b;
import y1.l;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f4304a;

    /* renamed from: b  reason: collision with root package name */
    public final e<PointF, PointF> f4305b;

    /* renamed from: c  reason: collision with root package name */
    public final e2.a f4306c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f4307d;
    public final boolean e;

    public a(String str, e<PointF, PointF> eVar, e2.a aVar, boolean z8, boolean z9) {
        this.f4304a = str;
        this.f4305b = eVar;
        this.f4306c = aVar;
        this.f4307d = z8;
        this.e = z9;
    }

    public final c a(l lVar, b bVar) {
        return new f(lVar, bVar, this);
    }
}
