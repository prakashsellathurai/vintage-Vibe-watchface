package androidx.wear.watchface.control.data;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.wearable.complications.ComplicationData;
import androidx.versionedparcelable.ParcelImpl;
import androidx.wear.watchface.data.RenderParametersWireFormat;
import androidx.wear.watchface.style.data.UserStyleWireFormat;
import g1.d;
import k3.j;

@SuppressLint({"BanParcelableUsage"})
public class ComplicationRenderParams implements d, Parcelable {
    public static final Parcelable.Creator<ComplicationRenderParams> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public int f2260f;

    /* renamed from: g  reason: collision with root package name */
    public RenderParametersWireFormat f2261g;

    /* renamed from: h  reason: collision with root package name */
    public long f2262h;

    /* renamed from: i  reason: collision with root package name */
    public ComplicationData f2263i;

    /* renamed from: j  reason: collision with root package name */
    public UserStyleWireFormat f2264j;

    public class a implements Parcelable.Creator<ComplicationRenderParams> {
        public final Object createFromParcel(Parcel parcel) {
            return (ComplicationRenderParams) j.v(parcel.readParcelable(a.class.getClassLoader()));
        }

        public final Object[] newArray(int i8) {
            return new ComplicationRenderParams[i8];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(new ParcelImpl((d) this), i8);
    }
}
