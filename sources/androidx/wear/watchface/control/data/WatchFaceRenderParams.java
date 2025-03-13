package androidx.wear.watchface.control.data;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import androidx.wear.watchface.data.IdAndComplicationDataWireFormat;
import androidx.wear.watchface.data.RenderParametersWireFormat;
import androidx.wear.watchface.style.data.UserStyleWireFormat;
import g1.d;
import java.util.List;
import k3.j;

@SuppressLint({"BanParcelableUsage"})
public class WatchFaceRenderParams implements d, Parcelable {
    public static final Parcelable.Creator<WatchFaceRenderParams> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public RenderParametersWireFormat f2285f;

    /* renamed from: g  reason: collision with root package name */
    public long f2286g;

    /* renamed from: h  reason: collision with root package name */
    public UserStyleWireFormat f2287h;

    /* renamed from: i  reason: collision with root package name */
    public List<IdAndComplicationDataWireFormat> f2288i;

    public class a implements Parcelable.Creator<WatchFaceRenderParams> {
        public final Object createFromParcel(Parcel parcel) {
            return (WatchFaceRenderParams) j.v(parcel.readParcelable(a.class.getClassLoader()));
        }

        public final Object[] newArray(int i8) {
            return new WatchFaceRenderParams[i8];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(new ParcelImpl((d) this), i8);
    }
}
