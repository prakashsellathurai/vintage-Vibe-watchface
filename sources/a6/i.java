package a6;

import android.graphics.Color;
import s.g;

public final class i extends a {

    /* renamed from: b  reason: collision with root package name */
    public final Integer f186b;

    public i(Integer num) {
        super(3);
        this.f186b = num;
    }

    public final boolean a() {
        return this.f186b.intValue() != 0;
    }

    public final Color b() {
        try {
            return Color.valueOf(this.f186b.intValue());
        } catch (IllegalArgumentException unused) {
            return super.b();
        }
    }

    public final double d() {
        return this.f186b.doubleValue();
    }

    public final float e() {
        return this.f186b.floatValue();
    }

    public final int f() {
        return this.f186b.intValue();
    }

    public final long g() {
        return this.f186b.longValue();
    }

    public final a h(l lVar) {
        int b9 = g.b(lVar.f189c);
        return b9 != 2 ? b9 != 11 ? super.h(lVar) : new i(Integer.valueOf(~f())) : new i(Integer.valueOf(-f()));
    }

    public final a i(l lVar, a aVar) {
        int b9 = g.b(lVar.f189c);
        if (b9 == 3) {
            return new i(Integer.valueOf(f() + aVar.f()));
        }
        if (b9 == 4) {
            int b10 = g.b(aVar.f171a);
            return b10 != 3 ? b10 != 4 ? b10 != 5 ? new i(Integer.valueOf(f() - aVar.f())) : new e(Double.valueOf(((double) f()) - aVar.d())) : new f(Float.valueOf(((float) f()) - aVar.e())) : new j(Long.valueOf(((long) f()) - aVar.g()));
        } else if (b9 == 5) {
            return new i(Integer.valueOf(f() * aVar.f()));
        } else {
            if (b9 == 6) {
                return aVar.e() == 0.0f ? new i(0) : g.b(aVar.f171a) != 5 ? new f(Float.valueOf(((float) f()) / aVar.e())) : new e(Double.valueOf(((double) f()) / aVar.d()));
            }
            if (b9 != 7) {
                return b9 != 12 ? b9 != 13 ? super.i(lVar, aVar) : new i(Integer.valueOf(f() | aVar.f())) : new i(Integer.valueOf(f() & aVar.f()));
            }
            if (aVar.e() == 0.0f) {
                return new i(0);
            }
            int b11 = g.b(aVar.f171a);
            return b11 != 3 ? b11 != 4 ? b11 != 5 ? new i(Integer.valueOf(f() % aVar.f())) : new e(Double.valueOf(((double) f()) % aVar.d())) : new f(Float.valueOf(((float) f()) % aVar.e())) : new j(Long.valueOf(((long) f()) % aVar.g()));
        }
    }

    public final String k() {
        return this.f186b.toString();
    }
}
