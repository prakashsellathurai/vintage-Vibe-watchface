package y4;

import y7.b0;

public final class d extends b0 {

    /* renamed from: b  reason: collision with root package name */
    public final float f8411b = -1.0f;

    public d() {
        super(14);
    }

    public final void k(float f9, float f10, l lVar) {
        lVar.e(f10 * f9, 180.0f, 90.0f);
        double d9 = (double) f10;
        double d10 = (double) f9;
        lVar.d((float) (Math.sin(Math.toRadians((double) 90.0f)) * d9 * d10), (float) (Math.sin(Math.toRadians((double) 0.0f)) * d9 * d10));
    }
}
