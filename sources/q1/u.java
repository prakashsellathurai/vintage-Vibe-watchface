package q1;

import android.graphics.drawable.Icon;
import android.support.wearable.complications.ComplicationData;
import b6.a;
import c1.c;
import java.util.Objects;
import q7.k;
import s.g;
import v1.b;

public final class u {

    /* renamed from: d  reason: collision with root package name */
    public static final u f6503d;

    /* renamed from: a  reason: collision with root package name */
    public final Icon f6504a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6505b;

    /* renamed from: c  reason: collision with root package name */
    public final Icon f6506c;

    static {
        Icon createWithResource = Icon.createWithResource("", -1);
        k.d(createWithResource, "createWithResource(\"\", P…HOLDER_IMAGE_RESOURCE_ID)");
        f6503d = new u(createWithResource, 1, (Icon) null);
    }

    public u(Icon icon, int i8, Icon icon2) {
        k.e(icon, "image");
        a.j(i8, "type");
        this.f6504a = icon;
        this.f6505b = i8;
        this.f6506c = icon2;
    }

    public final void a(ComplicationData.a aVar) {
        int i8;
        aVar.b(this.f6504a, "SMALL_IMAGE");
        int b9 = g.b(this.f6505b);
        if (b9 != 0) {
            i8 = 1;
            if (b9 != 1) {
                throw new c();
            }
        } else {
            i8 = 2;
        }
        ComplicationData.Companion.getClass();
        ComplicationData.c.a(aVar.f232a, "IMAGE_STYLE");
        aVar.f233b.putInt("IMAGE_STYLE", i8);
        aVar.b(this.f6506c, "SMALL_IMAGE_BURN_IN_PROTECTION");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.a(u.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        k.c(obj, "null cannot be cast to non-null type androidx.wear.watchface.complications.data.SmallImage");
        u uVar = (u) obj;
        return this.f6505b == uVar.f6505b && b.a(this.f6504a, uVar.f6504a) && b.a(this.f6506c, uVar.f6506c);
    }

    public final int hashCode() {
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(b.b(this.f6504a));
        Icon icon = this.f6506c;
        objArr[1] = icon != null ? Integer.valueOf(b.b(icon)) : null;
        return Objects.hash(objArr);
    }

    public final String toString() {
        return "SmallImage(image=" + this.f6504a + ", type=" + a.q(this.f6505b) + ", ambientImage=" + this.f6506c + ')';
    }
}
