package androidx.wear.watchface.data;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import g1.d;
import k3.j;

@SuppressLint({"BanParcelableUsage"})
public final class IdAndComplicationStateWireFormat implements d, Parcelable {
    public static final Parcelable.Creator<IdAndComplicationStateWireFormat> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public int f2343f;

    /* renamed from: g  reason: collision with root package name */
    public ComplicationStateWireFormat f2344g;

    public class a implements Parcelable.Creator<IdAndComplicationStateWireFormat> {
        public final Object createFromParcel(Parcel parcel) {
            return (IdAndComplicationStateWireFormat) j.v(parcel.readParcelable(a.class.getClassLoader()));
        }

        public final Object[] newArray(int i8) {
            return new IdAndComplicationStateWireFormat[i8];
        }
    }

    public IdAndComplicationStateWireFormat() {
    }

    public IdAndComplicationStateWireFormat(int i8, ComplicationStateWireFormat complicationStateWireFormat) {
        this.f2343f = i8;
        this.f2344g = complicationStateWireFormat;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(new ParcelImpl((d) this), i8);
    }
}
