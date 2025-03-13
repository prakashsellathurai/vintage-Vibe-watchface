package f2;

import a2.c;
import a2.d;
import g2.b;
import java.util.Arrays;
import java.util.List;

public final class l implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f4357a;

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f4358b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4359c;

    public l(String str, List<b> list, boolean z8) {
        this.f4357a = str;
        this.f4358b = list;
        this.f4359c = z8;
    }

    public final c a(y1.l lVar, b bVar) {
        return new d(lVar, bVar, this);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f4357a + "' Shapes: " + Arrays.toString(this.f4358b.toArray()) + '}';
    }
}
