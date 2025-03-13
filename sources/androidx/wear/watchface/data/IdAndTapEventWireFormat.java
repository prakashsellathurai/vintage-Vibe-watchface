package androidx.wear.watchface.data;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import g1.d;
import k3.j;

@SuppressLint({"BanParcelableUsage"})
public final class IdAndTapEventWireFormat implements d, Parcelable {
    public static final Parcelable.Creator<IdAndTapEventWireFormat> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public int f2345f;

    /* renamed from: g  reason: collision with root package name */
    public int f2346g;

    /* renamed from: h  reason: collision with root package name */
    public int f2347h;

    /* renamed from: i  reason: collision with root package name */
    public long f2348i;

    public class a implements Parcelable.Creator<IdAndTapEventWireFormat> {
        public final Object createFromParcel(Parcel parcel) {
            return (IdAndTapEventWireFormat) j.v(parcel.readParcelable(a.class.getClassLoader()));
        }

        public final Object[] newArray(int i8) {
            return new IdAndTapEventWireFormat[i8];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(new ParcelImpl((d) this), i8);
    }
}
