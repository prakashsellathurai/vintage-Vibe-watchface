package a6;

import android.graphics.Color;
import android.util.Log;
import java.math.BigDecimal;
import java.math.MathContext;
import s.g;

public final class j extends a {

    /* renamed from: b  reason: collision with root package name */
    public final Long f187b;

    public j(Long l8) {
        super(4);
        this.f187b = l8;
    }

    public final boolean a() {
        return this.f187b.longValue() != 0;
    }

    public final Color b() {
        try {
            return Color.valueOf(this.f187b.longValue());
        } catch (IllegalArgumentException unused) {
            return super.b();
        }
    }

    public final double d() {
        return this.f187b.doubleValue();
    }

    public final float e() {
        return this.f187b.floatValue();
    }

    public final int f() {
        return this.f187b.intValue();
    }

    public final long g() {
        return this.f187b.longValue();
    }

    public final a h(l lVar) {
        int b9 = g.b(lVar.f189c);
        return b9 != 2 ? b9 != 11 ? super.h(lVar) : new j(Long.valueOf(~g())) : new j(Long.valueOf(-g()));
    }

    public final a i(l lVar, a aVar) {
        int b9 = g.b(lVar.f189c);
        if (b9 == 3) {
            return new j(Long.valueOf(g() + aVar.g()));
        }
        if (b9 == 4) {
            int b10 = g.b(aVar.f171a);
            return b10 != 4 ? b10 != 5 ? new j(Long.valueOf(g() - aVar.g())) : new e(Double.valueOf(((double) g()) - aVar.d())) : new f(Float.valueOf(((float) g()) - aVar.e()));
        } else if (b9 == 5) {
            return new j(Long.valueOf(g() * aVar.g()));
        } else {
            if (b9 == 6) {
                try {
                    BigDecimal divide = new BigDecimal(g()).divide(BigDecimal.valueOf(aVar.d()), MathContext.DECIMAL64);
                    return g.b(aVar.f171a) != 5 ? new f(Float.valueOf(divide.floatValue())) : new e(Double.valueOf(divide.doubleValue()));
                } catch (ArithmeticException e) {
                    Log.w("DWF:TokenLong", k() + " / " + aVar.k() + " failed : " + e.getMessage());
                    return new j(0L);
                }
            } else if (b9 != 7) {
                return b9 != 12 ? b9 != 13 ? super.i(lVar, aVar) : new j(Long.valueOf(g() | aVar.g())) : new j(Long.valueOf(g() & aVar.g()));
            } else {
                try {
                    BigDecimal remainder = new BigDecimal(g()).remainder(BigDecimal.valueOf(aVar.d()), MathContext.DECIMAL64);
                    int b11 = g.b(aVar.f171a);
                    return b11 != 4 ? b11 != 5 ? new j(Long.valueOf(remainder.longValue())) : new e(Double.valueOf(remainder.doubleValue())) : new f(Float.valueOf(remainder.floatValue()));
                } catch (ArithmeticException e4) {
                    Log.w("DWF:TokenLong", k() + " % " + aVar.k() + " failed : " + e4.getMessage());
                    return new j(0L);
                }
            }
        }
    }

    public final String k() {
        return Long.toString(this.f187b.longValue());
    }
}
