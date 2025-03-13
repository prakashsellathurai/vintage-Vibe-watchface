package a6;

import android.graphics.Color;
import s.g;

public final class c extends a {

    /* renamed from: c  reason: collision with root package name */
    public static final Color f173c = Color.valueOf(-16777216);

    /* renamed from: b  reason: collision with root package name */
    public final Color f174b;

    public c(Color color) {
        super(8);
        this.f174b = color == null ? f173c : color;
    }

    public final boolean a() {
        return this.f174b != null;
    }

    public final Color b() {
        return this.f174b;
    }

    public final double d() {
        return (double) this.f174b.toArgb();
    }

    public final float e() {
        return (float) this.f174b.toArgb();
    }

    public final int f() {
        return this.f174b.toArgb();
    }

    public final long g() {
        return (long) this.f174b.toArgb();
    }

    public final a i(l lVar, a aVar) {
        int b9 = g.b(lVar.f189c);
        boolean z8 = true;
        if (b9 == 14) {
            if (f() != aVar.f()) {
                z8 = false;
            }
            return new b(Boolean.valueOf(z8));
        } else if (b9 != 15) {
            return new k();
        } else {
            if (f() == aVar.f()) {
                z8 = false;
            }
            return new b(Boolean.valueOf(z8));
        }
    }

    public final String k() {
        return this.f174b.toString();
    }
}
