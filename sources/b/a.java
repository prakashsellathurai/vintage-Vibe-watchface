package b;

import android.app.PendingIntent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.wearable.complications.TimeDependentText;
import java.util.Objects;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0025a();

    /* renamed from: f  reason: collision with root package name */
    public final TimeDependentText f2492f;

    /* renamed from: g  reason: collision with root package name */
    public final Rect f2493g;

    /* renamed from: h  reason: collision with root package name */
    public PendingIntent f2494h;

    /* renamed from: b.a$a  reason: collision with other inner class name */
    public class C0025a implements Parcelable.Creator<a> {
        public final Object createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        public final Object[] newArray(int i8) {
            return new a[i8];
        }
    }

    public a(Rect rect, TimeDependentText timeDependentText) {
        this.f2493g = rect;
        this.f2492f = timeDependentText;
    }

    public a(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(a.class.getClassLoader());
        this.f2492f = (TimeDependentText) readBundle.getParcelable("KEY_TEXT");
        this.f2493g = (Rect) readBundle.getParcelable("KEY_BOUNDS");
        this.f2494h = (PendingIntent) readBundle.getParcelable("KEY_TAP_ACTION");
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return Objects.equals(this.f2492f, aVar.f2492f) && Objects.equals(this.f2493g, aVar.f2493g) && Objects.equals(this.f2494h, aVar.f2494h);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f2492f, this.f2493g, this.f2494h});
    }

    public final String toString() {
        return "ContentDescriptionLabel{text=" + this.f2492f + ", bounds=" + this.f2493g + ", tapAction=" + this.f2494h + '}';
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("KEY_TEXT", this.f2492f);
        bundle.putParcelable("KEY_BOUNDS", this.f2493g);
        bundle.putParcelable("KEY_TAP_ACTION", this.f2494h);
        parcel.writeBundle(bundle);
    }
}
