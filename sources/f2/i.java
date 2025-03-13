package f2;

import a2.c;
import a2.o;
import a2.p;
import e2.a;
import e2.b;
import e2.d;
import e2.e;
import y1.l;

public final class i implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4344a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final String f4345b;

    /* renamed from: c  reason: collision with root package name */
    public final b f4346c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f4347d;
    public final e e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f4348f;

    public i(String str, b bVar, b bVar2, d dVar, boolean z8) {
        this.f4345b = str;
        this.f4346c = bVar;
        this.e = bVar2;
        this.f4348f = dVar;
        this.f4347d = z8;
    }

    public final c a(l lVar, g2.b bVar) {
        switch (this.f4344a) {
            case 0:
                return new o(lVar, bVar, this);
            default:
                return new p(lVar, bVar, this);
        }
    }

    public final String toString() {
        switch (this.f4344a) {
            case 0:
                return "RectangleShape{position=" + this.e + ", size=" + ((e) this.f4348f) + '}';
            default:
                return super.toString();
        }
    }

    public i(String str, e eVar, a aVar, b bVar, boolean z8) {
        this.f4345b = str;
        this.e = eVar;
        this.f4348f = aVar;
        this.f4346c = bVar;
        this.f4347d = z8;
    }
}
