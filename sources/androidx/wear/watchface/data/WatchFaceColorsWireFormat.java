package androidx.wear.watchface.data;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import g1.d;
import k3.j;

@SuppressLint({"BanParcelableUsage"})
public final class WatchFaceColorsWireFormat implements d, Parcelable {
    public static final Parcelable.Creator<WatchFaceColorsWireFormat> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public int f2359f;

    /* renamed from: g  reason: collision with root package name */
    public int f2360g;

    /* renamed from: h  reason: collision with root package name */
    public int f2361h;

    public class a implements Parcelable.Creator<WatchFaceColorsWireFormat> {
        public final Object createFromParcel(Parcel parcel) {
            return (WatchFaceColorsWireFormat) j.v(parcel.readParcelable(a.class.getClassLoader()));
        }

        public final Object[] newArray(int i8) {
            return new WatchFaceColorsWireFormat[i8];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        if (parcel != null) {
            parcel.writeParcelable(new ParcelImpl((d) this), i8);
        }
    }
}
