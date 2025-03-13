package o1;

import q7.k;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5999a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6000b;

    /* renamed from: c  reason: collision with root package name */
    public final long f6001c;

    /* renamed from: d  reason: collision with root package name */
    public final long f6002d;

    public b(boolean z8, boolean z9, long j8, long j9) {
        this.f5999a = z8;
        this.f6000b = z9;
        this.f6001c = j8;
        this.f6002d = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.a(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        k.c(obj, "null cannot be cast to non-null type androidx.wear.watchface.client.DeviceConfig");
        b bVar = (b) obj;
        return this.f5999a == bVar.f5999a && this.f6000b == bVar.f6000b && this.f6001c == bVar.f6001c && this.f6002d == bVar.f6002d;
    }

    public final int hashCode() {
        return (((((Boolean.hashCode(this.f5999a) * 31) + Boolean.hashCode(this.f6000b)) * 31) + Long.hashCode(this.f6001c)) * 31) + Long.hashCode(this.f6002d);
    }

    public final String toString() {
        return "DeviceConfig(hasLowBitAmbient=" + this.f5999a + ", hasBurnInProtection=" + this.f6000b + ", analogPreviewReferenceTimeMillis=" + this.f6001c + ", digitalPreviewReferenceTimeMillis=" + this.f6002d + ')';
    }
}
