package androidx.wear.watchface.data;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import g1.d;
import k3.j;

@SuppressLint({"BanParcelableUsage"})
public final class WatchUiState implements d, Parcelable {
    public static final Parcelable.Creator<WatchUiState> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public boolean f2366f;

    /* renamed from: g  reason: collision with root package name */
    public int f2367g;

    public class a implements Parcelable.Creator<WatchUiState> {
        public final Object createFromParcel(Parcel parcel) {
            return (WatchUiState) j.v(parcel.readParcelable(a.class.getClassLoader()));
        }

        public final Object[] newArray(int i8) {
            return new WatchUiState[i8];
        }
    }

    public WatchUiState() {
    }

    public WatchUiState(int i8, boolean z8) {
        this.f2366f = z8;
        this.f2367g = i8;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(new ParcelImpl((d) this), i8);
    }
}
