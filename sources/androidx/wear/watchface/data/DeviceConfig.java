package androidx.wear.watchface.data;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import g1.d;
import k3.j;

@SuppressLint({"BanParcelableUsage"})
public final class DeviceConfig implements d, Parcelable {
    public static final Parcelable.Creator<DeviceConfig> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public boolean f2337f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2338g;

    /* renamed from: h  reason: collision with root package name */
    public long f2339h;

    /* renamed from: i  reason: collision with root package name */
    public long f2340i;

    public class a implements Parcelable.Creator<DeviceConfig> {
        public final Object createFromParcel(Parcel parcel) {
            return (DeviceConfig) j.v(parcel.readParcelable(a.class.getClassLoader()));
        }

        public final Object[] newArray(int i8) {
            return new DeviceConfig[i8];
        }
    }

    public DeviceConfig() {
    }

    public DeviceConfig(boolean z8, boolean z9, long j8, long j9) {
        this.f2337f = z8;
        this.f2338g = z9;
        this.f2339h = j8;
        this.f2340i = j9;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(new ParcelImpl((d) this), i8);
    }
}
