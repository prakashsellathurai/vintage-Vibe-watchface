package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import g1.b;
import g1.d;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final d f1930f;

    public static class a implements Parcelable.Creator<ParcelImpl> {
        public final Object createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        public final Object[] newArray(int i8) {
            return new ParcelImpl[i8];
        }
    }

    public ParcelImpl(Parcel parcel) {
        this.f1930f = new b(parcel).E();
    }

    public ParcelImpl(d dVar) {
        this.f1930f = dVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        new b(parcel).f0(this.f1930f);
    }
}
