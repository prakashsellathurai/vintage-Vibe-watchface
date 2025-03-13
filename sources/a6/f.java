package a6;

import android.graphics.Color;
import s.g;

public final class f extends a {

    /* renamed from: b  reason: collision with root package name */
    public final Float f179b;

    public f(Float f9) {
        super(5);
        this.f179b = f9;
    }

    public final boolean a() {
        return Float.compare(this.f179b.floatValue(), 0.0f) != 0;
    }

    public final Color b() {
        try {
            return Color.valueOf(f());
        } catch (IllegalArgumentException unused) {
            return super.b();
        }
    }

    public final double d() {
        return this.f179b.doubleValue();
    }

    public final float e() {
        return this.f179b.floatValue();
    }

    public final int f() {
        return this.f179b.intValue();
    }

    public final long g() {
        return this.f179b.longValue();
    }

    public final a h(l lVar) {
        return lVar.f189c == 3 ? new f(Float.valueOf(-e())) : super.h(lVar);
    }

    public final a i(l lVar, a aVar) {
        int b9 = g.b(lVar.f189c);
        if (b9 == 3) {
            return new f(Float.valueOf(e() + aVar.e()));
        }
        if (b9 == 4) {
            return g.b(aVar.f171a) != 5 ? new f(Float.valueOf(e() - aVar.e())) : new e(Double.valueOf(((double) e()) - aVar.d()));
        }
        if (b9 == 5) {
            return new f(Float.valueOf(e() * aVar.e()));
        }
        if (b9 == 6) {
            return aVar.e() == 0.0f ? new f(Float.valueOf(0.0f)) : aVar.f171a == 6 ? new e(Double.valueOf(((double) e()) / aVar.d())) : new f(Float.valueOf(e() / aVar.e()));
        }
        if (b9 == 7) {
            return aVar.e() == 0.0f ? new f(Float.valueOf(0.0f)) : aVar.f171a == 6 ? new e(Double.valueOf(((double) e()) % aVar.d())) : new f(Float.valueOf(e() % aVar.e()));
        }
        boolean z8 = true;
        if (b9 == 14) {
            if (Float.compare(e(), aVar.e()) != 0) {
                z8 = false;
            }
            return new b(Boolean.valueOf(z8));
        } else if (b9 != 15) {
            return super.i(lVar, aVar);
        } else {
            if (Float.compare(e(), aVar.e()) == 0) {
                z8 = false;
            }
            return new b(Boolean.valueOf(z8));
        }
    }

    public final String k() {
        return this.f179b.toString();
    }
}
