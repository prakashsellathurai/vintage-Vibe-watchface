package q1;

import java.util.Arrays;
import q7.k;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f6416a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6417b;

    public a(int[] iArr, boolean z8) {
        this.f6416a = iArr;
        this.f6417b = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.a(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        k.c(obj, "null cannot be cast to non-null type androidx.wear.watchface.complications.data.ColorRamp");
        a aVar = (a) obj;
        return Arrays.equals(this.f6416a, aVar.f6416a) && this.f6417b == aVar.f6417b;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f6416a) * 31) + Boolean.hashCode(this.f6417b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorRamp(colors=[");
        int[] iArr = this.f6416a;
        k.e(iArr, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("");
        int i8 = 0;
        for (int i9 : iArr) {
            i8++;
            if (i8 > 1) {
                sb2.append(", ");
            }
            sb2.append(String.valueOf(i9));
        }
        sb2.append("");
        String sb3 = sb2.toString();
        k.d(sb3, "joinTo(StringBuilder(), …ed, transform).toString()");
        sb.append(sb3);
        sb.append("], interpolated=");
        sb.append(this.f6417b);
        sb.append(')');
        return sb.toString();
    }
}
