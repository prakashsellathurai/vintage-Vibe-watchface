package androidx.wear.watchface.data;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import g1.d;
import k3.j;

@SuppressLint({"BanParcelableUsage"})
public class LayerParameterWireFormat implements d, Parcelable {
    public static final Parcelable.Creator<LayerParameterWireFormat> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public int f2349f;

    /* renamed from: g  reason: collision with root package name */
    public int f2350g;

    public class a implements Parcelable.Creator<LayerParameterWireFormat> {
        public final Object createFromParcel(Parcel parcel) {
            return (LayerParameterWireFormat) j.v(parcel.readParcelable(a.class.getClassLoader()));
        }

        public final Object[] newArray(int i8) {
            return new LayerParameterWireFormat[i8];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(new ParcelImpl((d) this), i8);
    }
}
