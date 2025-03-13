package q1;

import android.graphics.drawable.Icon;
import android.support.wearable.complications.ComplicationData;
import q7.k;
import v1.b;

public final class l {

    /* renamed from: c  reason: collision with root package name */
    public static final l f6469c;

    /* renamed from: a  reason: collision with root package name */
    public final Icon f6470a;

    /* renamed from: b  reason: collision with root package name */
    public final Icon f6471b;

    static {
        Icon createWithResource = Icon.createWithResource("", -1);
        k.d(createWithResource, "createWithResource(\"\", P…HOLDER_IMAGE_RESOURCE_ID)");
        f6469c = new l(createWithResource, (Icon) null);
    }

    public l(Icon icon, Icon icon2) {
        k.e(icon, "image");
        this.f6470a = icon;
        this.f6471b = icon2;
    }

    public final void a(ComplicationData.a aVar) {
        aVar.b(this.f6470a, "ICON");
        aVar.b(this.f6471b, "ICON_BURN_IN_PROTECTION");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.a(l.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        k.c(obj, "null cannot be cast to non-null type androidx.wear.watchface.complications.data.MonochromaticImage");
        l lVar = (l) obj;
        return b.a(this.f6470a, lVar.f6470a) && b.a(this.f6471b, lVar.f6471b);
    }

    public final int hashCode() {
        return b.b(this.f6470a);
    }

    public final String toString() {
        return "MonochromaticImage(image=" + this.f6470a + ", ambientImage=" + this.f6471b + ')';
    }
}
