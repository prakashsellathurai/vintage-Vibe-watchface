package f2;

import a2.c;
import b6.a;
import g2.b;
import y1.l;

public final class g implements b {

    /* renamed from: a  reason: collision with root package name */
    public final int f4333a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4334b;

    public g(String str, int i8, boolean z8) {
        this.f4333a = i8;
        this.f4334b = z8;
    }

    public final c a(l lVar, b bVar) {
        if (lVar.f8260l) {
            return new a2.l(this);
        }
        k2.c.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        return "MergePaths{mode=" + a.n(this.f4333a) + '}';
    }
}
