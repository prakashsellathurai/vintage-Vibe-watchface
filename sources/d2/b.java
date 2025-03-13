package d2;

import s.g;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f3980a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3981b;

    /* renamed from: c  reason: collision with root package name */
    public final float f3982c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3983d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final float f3984f;

    /* renamed from: g  reason: collision with root package name */
    public final float f3985g;

    /* renamed from: h  reason: collision with root package name */
    public final int f3986h;

    /* renamed from: i  reason: collision with root package name */
    public final int f3987i;

    /* renamed from: j  reason: collision with root package name */
    public final float f3988j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f3989k;

    public b(String str, String str2, float f9, int i8, int i9, float f10, float f11, int i10, int i11, float f12, boolean z8) {
        this.f3980a = str;
        this.f3981b = str2;
        this.f3982c = f9;
        this.f3983d = i8;
        this.e = i9;
        this.f3984f = f10;
        this.f3985g = f11;
        this.f3986h = i10;
        this.f3987i = i11;
        this.f3988j = f12;
        this.f3989k = z8;
    }

    public final int hashCode() {
        int hashCode = (((((int) (((float) (((this.f3980a.hashCode() * 31) + this.f3981b.hashCode()) * 31)) + this.f3982c)) * 31) + g.b(this.f3983d)) * 31) + this.e;
        long floatToRawIntBits = (long) Float.floatToRawIntBits(this.f3984f);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f3986h;
    }
}
