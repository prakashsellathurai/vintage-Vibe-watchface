package androidx.wear.watchface.data;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import g1.d;
import k3.j;

@SuppressLint({"BanParcelableUsage"})
public final class BoundingArcWireFormat implements d, Parcelable {
    public static final Parcelable.Creator<BoundingArcWireFormat> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public float f2304f;

    /* renamed from: g  reason: collision with root package name */
    public float f2305g;

    /* renamed from: h  reason: collision with root package name */
    public float f2306h;

    public class a implements Parcelable.Creator<BoundingArcWireFormat> {
        public final Object createFromParcel(Parcel parcel) {
            return (BoundingArcWireFormat) j.v(parcel.readParcelable(a.class.getClassLoader()));
        }

        public final Object[] newArray(int i8) {
            return new BoundingArcWireFormat[i8];
        }
    }

    public BoundingArcWireFormat() {
        this.f2304f = 0.0f;
        this.f2305g = 0.0f;
        this.f2306h = 0.0f;
    }

    public BoundingArcWireFormat(float f9, float f10, float f11) {
        this.f2304f = f9;
        this.f2305g = f10;
        this.f2306h = f11;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        if (parcel != null) {
            parcel.writeParcelable(new ParcelImpl((d) this), i8);
        }
    }
}
