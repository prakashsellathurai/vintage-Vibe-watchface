package a6;

import android.graphics.Color;

public final class b extends a {

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f172b;

    public b(Boolean bool) {
        super(2);
        this.f172b = bool;
    }

    public final boolean a() {
        return this.f172b.booleanValue();
    }

    public final Color b() {
        return Color.valueOf(this.f172b.booleanValue() ? -1 : -16777216);
    }

    public final double d() {
        return (double) f();
    }

    public final float e() {
        return (float) f();
    }

    public final int f() {
        return this.f172b.booleanValue() ? 1 : 0;
    }

    public final long g() {
        return (long) f();
    }

    public final a h(l lVar) {
        return new i(Integer.valueOf(f())).h(lVar);
    }

    public final a i(l lVar, a aVar) {
        return new i(Integer.valueOf(f())).i(lVar, aVar);
    }

    public final String k() {
        return this.f172b.toString();
    }
}
