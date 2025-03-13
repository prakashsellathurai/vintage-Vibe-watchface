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
public class UserStyleSchemaWireFormat implements d, Parcelable {
    public static final Parcelable.Creator<UserStyleSchemaWireFormat> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public List<UserStyleSettingWireFormat> f2423f;

    public class a implements Parcelable.Creator<UserStyleSchemaWireFormat> {
        public final Object createFromParcel(Parcel parcel) {
            return (UserStyleSchemaWireFormat) j.v(parcel.readParcelable(a.class.getClassLoader()));
        }

        public final Object[] newArray(int i8) {
            return new UserStyleSchemaWireFormat[i8];
        }
    }

    public UserStyleSchemaWireFormat() {
        this.f2423f = new ArrayList();
    }

    public UserStyleSchemaWireFormat(ArrayList arrayList) {
        new ArrayList();
        this.f2423f = arrayList;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(new ParcelImpl((d) this), i8);
    }
}
