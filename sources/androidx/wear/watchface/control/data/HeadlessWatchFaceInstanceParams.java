package androidx.wear.watchface.control.data;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import androidx.wear.watchface.data.DeviceConfig;
import g1.d;
import k3.j;

@SuppressLint({"BanParcelableUsage"})
public class HeadlessWatchFaceInstanceParams implements d, Parcelable {
    public static final Parcelable.Creator<HeadlessWatchFaceInstanceParams> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public ComponentName f2269f;

    /* renamed from: g  reason: collision with root package name */
    public DeviceConfig f2270g;

    /* renamed from: h  reason: collision with root package name */
    public int f2271h;

    /* renamed from: i  reason: collision with root package name */
    public int f2272i;

    /* renamed from: j  reason: collision with root package name */
    public String f2273j;

    public class a implements Parcelable.Creator<HeadlessWatchFaceInstanceParams> {
        public final Object createFromParcel(Parcel parcel) {
            return (HeadlessWatchFaceInstanceParams) j.v(parcel.readParcelable(a.class.getClassLoader()));
        }

        public final Object[] newArray(int i8) {
            return new HeadlessWatchFaceInstanceParams[i8];
        }
    }

    public HeadlessWatchFaceInstanceParams() {
        this.f2273j = null;
    }

    public HeadlessWatchFaceInstanceParams(ComponentName componentName, DeviceConfig deviceConfig, int i8, int i9, String str) {
        this.f2269f = componentName;
        this.f2270g = deviceConfig;
        this.f2271h = i8;
        this.f2272i = i9;
        this.f2273j = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(new ParcelImpl((d) this), i8);
    }
}
