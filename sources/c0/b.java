package c0;

import android.graphics.Insets;

public final class b {
    public static final b e = new b(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f2634a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2635b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2636c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2637d;

    public static class a {
        public static Insets a(int i8, int i9, int i10, int i11) {
            return Insets.of(i8, i9, i10, i11);
        }
    }

    public b(int i8, int i9, int i10, int i11) {
        this.f2634a = i8;
        this.f2635b = i9;
        this.f2636c = i10;
        this.f2637d = i11;
    }

    public static b a(int i8, int i9, int i10, int i11) {
        return (i8 == 0 && i9 == 0 && i10 == 0 && i11 == 0) ? e : new b(i8, i9, i10, i11);
    }

    public static b b(Insets insets) {
        return a(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets c() {
        return a.a(this.f2634a, this.f2635b, this.f2636c, this.f2637d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2637d == bVar.f2637d && this.f2634a == bVar.f2634a && this.f2636c == bVar.f2636c && this.f2635b == bVar.f2635b;
    }

    public final int hashCode() {
        return (((((this.f2634a * 31) + this.f2635b) * 31) + this.f2636c) * 31) + this.f2637d;
    }

    public final String toString() {
        return "Insets{left=" + this.f2634a + ", top=" + this.f2635b + ", right=" + this.f2636c + ", bottom=" + this.f2637d + '}';
    }
}
