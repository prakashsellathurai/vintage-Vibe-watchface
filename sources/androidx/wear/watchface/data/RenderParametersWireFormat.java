package androidx.wear.watchface.data;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import g1.d;
import java.util.List;
import k3.j;

@SuppressLint({"BanParcelableUsage"})
public class RenderParametersWireFormat implements d, Parcelable {
    public static final Parcelable.Creator<RenderParametersWireFormat> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public int f2351f;

    /* renamed from: g  reason: collision with root package name */
    public int f2352g;

    /* renamed from: h  reason: collision with root package name */
    public int f2353h;

    /* renamed from: i  reason: collision with root package name */
    public int f2354i;

    /* renamed from: j  reason: collision with root package name */
    public String f2355j;

    /* renamed from: k  reason: collision with root package name */
    public int f2356k;

    /* renamed from: l  reason: collision with root package name */
    public int f2357l;

    /* renamed from: m  reason: collision with root package name */
    public List<IdAndTapEventWireFormat> f2358m;

    public class a implements Parcelable.Creator<RenderParametersWireFormat> {
        public final Object createFromParcel(Parcel parcel) {
            return (RenderParametersWireFormat) j.v(parcel.readParcelable(a.class.getClassLoader()));
        }

        public final Object[] newArray(int i8) {
            return new RenderParametersWireFormat[i8];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(new ParcelImpl((d) this), i8);
    }
}
