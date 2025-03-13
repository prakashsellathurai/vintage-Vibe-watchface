package androidx.wear.watchface.control.data;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.ParcelImpl;
import androidx.wear.watchface.data.DeviceConfig;
import androidx.wear.watchface.data.IdAndComplicationDataWireFormat;
import androidx.wear.watchface.data.WatchUiState;
import androidx.wear.watchface.style.data.UserStyleWireFormat;
import g1.d;
import java.util.Collections;
import java.util.List;
import k3.j;

@SuppressLint({"BanParcelableUsage"})
public class WallpaperInteractiveWatchFaceInstanceParams implements d, Parcelable {
    public static final Parcelable.Creator<WallpaperInteractiveWatchFaceInstanceParams> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public String f2278f;

    /* renamed from: g  reason: collision with root package name */
    public DeviceConfig f2279g;

    /* renamed from: h  reason: collision with root package name */
    public WatchUiState f2280h;

    /* renamed from: i  reason: collision with root package name */
    public UserStyleWireFormat f2281i;

    /* renamed from: j  reason: collision with root package name */
    public List<IdAndComplicationDataWireFormat> f2282j;

    /* renamed from: k  reason: collision with root package name */
    public String f2283k;

    /* renamed from: l  reason: collision with root package name */
    public String f2284l;

    public class a implements Parcelable.Creator<WallpaperInteractiveWatchFaceInstanceParams> {
        public final Object createFromParcel(Parcel parcel) {
            return (WallpaperInteractiveWatchFaceInstanceParams) j.v(parcel.readParcelable(a.class.getClassLoader()));
        }

        public final Object[] newArray(int i8) {
            return new WallpaperInteractiveWatchFaceInstanceParams[i8];
        }
    }

    public final UserStyleWireFormat a() {
        if (this.f2281i == null) {
            Log.e("WallpaperInteractiveWatchFaceInstanceParams", "WallpaperInteractiveWatchFaceInstanceParams with null mUserStyle", new Throwable());
            this.f2281i = new UserStyleWireFormat(Collections.emptyMap());
        }
        return this.f2281i;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(new ParcelImpl((d) this), i8);
    }
}
