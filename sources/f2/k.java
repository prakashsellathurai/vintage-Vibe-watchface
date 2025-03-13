package f2;

import a2.c;
import a2.g;
import android.graphics.Path;
import e2.a;
import g2.b;
import y1.l;

public final class k implements b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4352a;

    /* renamed from: b  reason: collision with root package name */
    public final Path.FillType f4353b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4354c;

    /* renamed from: d  reason: collision with root package name */
    public final a f4355d;
    public final a e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f4356f;

    public k(String str, boolean z8, Path.FillType fillType, a aVar, a aVar2, boolean z9) {
        this.f4354c = str;
        this.f4352a = z8;
        this.f4353b = fillType;
        this.f4355d = aVar;
        this.e = aVar2;
        this.f4356f = z9;
    }

    public final c a(l lVar, b bVar) {
        return new g(lVar, bVar, this);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f4352a + '}';
    }
}
