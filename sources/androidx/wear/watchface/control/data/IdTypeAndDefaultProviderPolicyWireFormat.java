package androidx.wear.watchface.control.data;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import g1.d;
import java.util.ArrayList;
import java.util.List;
import k3.j;

@SuppressLint({"BanParcelableUsage"})
public final class IdTypeAndDefaultProviderPolicyWireFormat implements d, Parcelable {
    public static final Parcelable.Creator<IdTypeAndDefaultProviderPolicyWireFormat> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public int f2274f;

    /* renamed from: g  reason: collision with root package name */
    public List<ComponentName> f2275g;

    /* renamed from: h  reason: collision with root package name */
    public int f2276h;

    /* renamed from: i  reason: collision with root package name */
    public int f2277i;

    public class a implements Parcelable.Creator<IdTypeAndDefaultProviderPolicyWireFormat> {
        public final Object createFromParcel(Parcel parcel) {
            return (IdTypeAndDefaultProviderPolicyWireFormat) j.v(parcel.readParcelable(a.class.getClassLoader()));
        }

        public final Object[] newArray(int i8) {
            return new IdTypeAndDefaultProviderPolicyWireFormat[i8];
        }
    }

    public IdTypeAndDefaultProviderPolicyWireFormat() {
    }

    public IdTypeAndDefaultProviderPolicyWireFormat(int i8, ArrayList arrayList, int i9, int i10) {
        this.f2274f = i8;
        this.f2275g = arrayList;
        this.f2276h = i9;
        this.f2277i = i10;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(new ParcelImpl((d) this), i8);
    }
}
