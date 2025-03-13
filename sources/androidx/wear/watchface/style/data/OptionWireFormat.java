package androidx.wear.watchface.style.data;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import g1.d;
import k3.j;

@SuppressLint({"BanParcelableUsage"})
public class OptionWireFormat implements d, Parcelable {
    public static final Parcelable.Creator<OptionWireFormat> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public byte[] f2417f;

    public class a implements Parcelable.Creator<OptionWireFormat> {
        public final Object createFromParcel(Parcel parcel) {
            return (OptionWireFormat) j.v(parcel.readParcelable(a.class.getClassLoader()));
        }

        public final Object[] newArray(int i8) {
            return new OptionWireFormat[i8];
        }
    }

    public OptionWireFormat() {
        this.f2417f = new byte[0];
    }

    public OptionWireFormat(byte[] bArr) {
        this.f2417f = bArr;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(new ParcelImpl((d) this), i8);
    }
}
