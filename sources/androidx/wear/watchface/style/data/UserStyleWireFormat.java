package androidx.wear.watchface.style.data;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import g1.d;
import java.util.HashMap;
import java.util.Map;
import k3.j;

@SuppressLint({"BanParcelableUsage"})
public class UserStyleWireFormat implements d, Parcelable {
    public static final Parcelable.Creator<UserStyleWireFormat> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public Map<String, byte[]> f2434f;

    public class a implements Parcelable.Creator<UserStyleWireFormat> {
        public final Object createFromParcel(Parcel parcel) {
            return (UserStyleWireFormat) j.v(parcel.readParcelable(a.class.getClassLoader()));
        }

        public final Object[] newArray(int i8) {
            return new UserStyleWireFormat[i8];
        }
    }

    public UserStyleWireFormat() {
        this.f2434f = new HashMap();
    }

    public UserStyleWireFormat(Map<String, byte[]> map) {
        new HashMap();
        this.f2434f = map;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(new ParcelImpl((d) this), i8);
    }
}
