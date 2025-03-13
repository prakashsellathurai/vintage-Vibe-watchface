package f2;

import a2.c;
import a2.q;
import e2.a;
import g2.b;
import y1.l;

public final class m implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f4360a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4361b;

    /* renamed from: c  reason: collision with root package name */
    public final a f4362c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f4363d;

    public m(String str, int i8, a aVar, boolean z8) {
        this.f4360a = str;
        this.f4361b = i8;
        this.f4362c = aVar;
        this.f4363d = z8;
    }

    public final c a(l lVar, b bVar) {
        return new q(lVar, bVar, this);
    }

    public final String toString() {
        return "ShapePath{name=" + this.f4360a + ", index=" + this.f4361b + '}';
    }
}
