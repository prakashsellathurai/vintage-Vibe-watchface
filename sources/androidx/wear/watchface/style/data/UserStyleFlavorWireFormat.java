package androidx.wear.watchface.style.data;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import androidx.wear.watchface.complications.data.DefaultComplicationDataSourcePolicyWireFormat;
import g1.d;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import k3.j;

@SuppressLint({"BanParcelableUsage"})
public class UserStyleFlavorWireFormat implements d, Parcelable {
    public static final Parcelable.Creator<UserStyleFlavorWireFormat> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public String f2419f;

    /* renamed from: g  reason: collision with root package name */
    public UserStyleWireFormat f2420g;

    /* renamed from: h  reason: collision with root package name */
    public Map<Integer, DefaultComplicationDataSourcePolicyWireFormat> f2421h;

    public class a implements Parcelable.Creator<UserStyleFlavorWireFormat> {
        public final Object createFromParcel(Parcel parcel) {
            return (UserStyleFlavorWireFormat) j.v(parcel.readParcelable(a.class.getClassLoader()));
        }

        public final Object[] newArray(int i8) {
            return new UserStyleFlavorWireFormat[i8];
        }
    }

    public UserStyleFlavorWireFormat() {
        this.f2419f = "";
        this.f2420g = new UserStyleWireFormat();
        this.f2421h = new HashMap();
    }

    public UserStyleFlavorWireFormat(String str, UserStyleWireFormat userStyleWireFormat, LinkedHashMap linkedHashMap) {
        this.f2419f = "";
        this.f2420g = new UserStyleWireFormat();
        new HashMap();
        this.f2419f = str;
        this.f2420g = userStyleWireFormat;
        this.f2421h = linkedHashMap;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(new ParcelImpl((d) this), i8);
    }
}
