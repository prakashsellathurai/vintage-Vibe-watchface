package a6;

import android.graphics.Color;
import s.g;

public final class e extends a {

    /* renamed from: b  reason: collision with root package name */
    public final Double f178b;

    public e(Double d9) {
        super(6);
        this.f178b = d9;
    }

    public final boolean a() {
        return Double.compare(this.f178b.doubleValue(), 0.0d) != 0;
    }

    public final Color b() {
        try {
            return Color.valueOf(g());
        } catch (IllegalArgumentException unused) {
            return super.b();
        }
    }

    public final double d() {
        return this.f178b.doubleValue();
    }

    public final float e() {
        return this.f178b.floatValue();
    }

    public final int f() {
        return this.f178b.intValue();
    }

    public final long g() {
        return this.f178b.longValue();
    }

    public final a h(l lVar) {
        return lVar.f189c == 3 ? new e(Double.valueOf(-d())) : super.h(lVar);
    }

    public final a i(l lVar, a aVar) {
        int b9 = g.b(lVar.f189c);
        return b9 != 3 ? b9 != 4 ? b9 != 5 ? b9 != 6 ? b9 != 7 ? super.i(lVar, aVar) : aVar.d() == 0.0d ? new e(Double.valueOf(0.0d)) : new e(Double.valueOf(d() % aVar.d())) : aVar.d() == 0.0d ? new e(Double.valueOf(0.0d)) : new e(Double.valueOf(d() / aVar.d())) : new e(Double.valueOf(d() * aVar.d())) : new e(Double.valueOf(d() - aVar.d())) : new e(Double.valueOf(d() + aVar.d()));
    }

    public final String k() {
        return this.f178b.toString();
    }
}
