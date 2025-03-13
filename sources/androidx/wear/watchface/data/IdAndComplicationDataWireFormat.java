package androidx.wear.watchface.data;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.wearable.complications.ComplicationData;
import androidx.versionedparcelable.ParcelImpl;
import g1.d;
import java.util.Objects;
import k3.j;

@SuppressLint({"BanParcelableUsage"})
public final class IdAndComplicationDataWireFormat implements d, Parcelable {
    public static final Parcelable.Creator<IdAndComplicationDataWireFormat> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public int f2341f;

    /* renamed from: g  reason: collision with root package name */
    public ComplicationData f2342g;

    public class a implements Parcelable.Creator<IdAndComplicationDataWireFormat> {
        public final Object createFromParcel(Parcel parcel) {
            return (IdAndComplicationDataWireFormat) j.v(parcel.readParcelable(a.class.getClassLoader()));
        }

        public final Object[] newArray(int i8) {
            return new IdAndComplicationDataWireFormat[i8];
        }
    }

    public IdAndComplicationDataWireFormat() {
    }

    public IdAndComplicationDataWireFormat(int i8, ComplicationData complicationData) {
        this.f2341f = i8;
        this.f2342g = complicationData;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IdAndComplicationDataWireFormat.class != obj.getClass()) {
            return false;
        }
        IdAndComplicationDataWireFormat idAndComplicationDataWireFormat = (IdAndComplicationDataWireFormat) obj;
        return this.f2341f == idAndComplicationDataWireFormat.f2341f && this.f2342g.equals(idAndComplicationDataWireFormat.f2342g);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f2341f), this.f2342g});
    }

    public final String toString() {
        return "IdAndComplicationDataWireFormat{mId=" + this.f2341f + ", mComplicationData=" + this.f2342g + '}';
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(new ParcelImpl((d) this), i8);
    }
}
