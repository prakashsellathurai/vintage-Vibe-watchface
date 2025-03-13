package androidx.wear.watchface.data;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import g1.d;
import k3.j;

@SuppressLint({"BanParcelableUsage"})
public class WatchFaceOverlayStyleWireFormat implements d, Parcelable {
    public static final Parcelable.Creator<WatchFaceOverlayStyleWireFormat> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public boolean f2362f;

    /* renamed from: g  reason: collision with root package name */
    public int f2363g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2364h;

    /* renamed from: i  reason: collision with root package name */
    public int f2365i;

    public class a implements Parcelable.Creator<WatchFaceOverlayStyleWireFormat> {
        public final Object createFromParcel(Parcel parcel) {
            return (WatchFaceOverlayStyleWireFormat) j.v(parcel.readParcelable(a.class.getClassLoader()));
        }

        public final Object[] newArray(int i8) {
            return new WatchFaceOverlayStyleWireFormat[i8];
        }
    }

    public WatchFaceOverlayStyleWireFormat() {
    }

    public WatchFaceOverlayStyleWireFormat(Color color, Color color2) {
        if (color == null) {
            this.f2362f = false;
        } else {
            this.f2362f = true;
            this.f2363g = color.toArgb();
        }
        if (color2 == null) {
            this.f2364h = false;
            return;
        }
        this.f2364h = true;
        this.f2365i = color2.toArgb();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(new ParcelImpl((d) this), i8);
    }
}
