package androidx.wear.watchface.style.data;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import g1.d;
import java.util.ArrayList;
import java.util.List;
import k3.j;

@SuppressLint({"BanParcelableUsage"})
public class UserStyleFlavorsWireFormat implements d, Parcelable {
    public static final Parcelable.Creator<UserStyleFlavorsWireFormat> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public List<UserStyleFlavorWireFormat> f2422f;

    public class a implements Parcelable.Creator<UserStyleFlavorsWireFormat> {
        public final Object createFromParcel(Parcel parcel) {
            return (UserStyleFlavorsWireFormat) j.v(parcel.readParcelable(a.class.getClassLoader()));
        }

        public final Object[] newArray(int i8) {
            return new UserStyleFlavorsWireFormat[i8];
        }
    }

    public UserStyleFlavorsWireFormat() {
        this.f2422f = new ArrayList();
    }

    public UserStyleFlavorsWireFormat(ArrayList arrayList) {
        new ArrayList();
        this.f2422f = arrayList;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(new ParcelImpl((d) this), i8);
    }
}
