package c7;

public final class g extends c {

    /* renamed from: c  reason: collision with root package name */
    public float f2799c = 2.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f2800d = 2.0f;
    public float e = 2.0f;

    public final o a(o oVar) {
        float f9 = this.f2799c;
        if (f9 == 0.0f && this.f2800d == 0.0f) {
            return oVar;
        }
        oVar.setShadowLayer(this.e, f9, this.f2800d, this.f2795b);
        return oVar;
    }

    public final boolean b() {
        return true;
    }
}
