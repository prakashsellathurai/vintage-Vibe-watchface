package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.b0;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
public final class d0 implements Parcelable {
    public static final Parcelable.Creator<d0> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<g0> f1143f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<String> f1144g;

    /* renamed from: h  reason: collision with root package name */
    public b[] f1145h;

    /* renamed from: i  reason: collision with root package name */
    public int f1146i;

    /* renamed from: j  reason: collision with root package name */
    public String f1147j = null;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList<String> f1148k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList<Bundle> f1149l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<b0.l> f1150m;

    public class a implements Parcelable.Creator<d0> {
        public final Object createFromParcel(Parcel parcel) {
            return new d0(parcel);
        }

        public final Object[] newArray(int i8) {
            return new d0[i8];
        }
    }

    public d0() {
    }

    public d0(Parcel parcel) {
        this.f1143f = parcel.createTypedArrayList(g0.CREATOR);
        this.f1144g = parcel.createStringArrayList();
        this.f1145h = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f1146i = parcel.readInt();
        this.f1147j = parcel.readString();
        this.f1148k = parcel.createStringArrayList();
        this.f1149l = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f1150m = parcel.createTypedArrayList(b0.l.CREATOR);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeTypedList(this.f1143f);
        parcel.writeStringList(this.f1144g);
        parcel.writeTypedArray(this.f1145h, i8);
        parcel.writeInt(this.f1146i);
        parcel.writeString(this.f1147j);
        parcel.writeStringList(this.f1148k);
        parcel.writeTypedList(this.f1149l);
        parcel.writeTypedList(this.f1150m);
    }
}
