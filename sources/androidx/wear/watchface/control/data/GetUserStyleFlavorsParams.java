package androidx.wear.watchface.control.data;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import g1.d;
import k3.j;

@SuppressLint({"BanParcelableUsage"})
public class GetUserStyleFlavorsParams implements d, Parcelable {
    public static final Parcelable.Creator<GetUserStyleFlavorsParams> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public ComponentName f2267f;

    public class a implements Parcelable.Creator<GetUserStyleFlavorsParams> {
        public final Object createFromParcel(Parcel parcel) {
            return (GetUserStyleFlavorsParams) j.v(parcel.readParcelable(a.class.getClassLoader()));
        }

        public final Object[] newArray(int i8) {
            return new GetUserStyleFlavorsParams[i8];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(new ParcelImpl((d) this), i8);
    }
}
