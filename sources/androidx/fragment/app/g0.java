package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class g0 implements Parcelable {
    public static final Parcelable.Creator<g0> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final String f1165f;

    /* renamed from: g  reason: collision with root package name */
    public final String f1166g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f1167h;

    /* renamed from: i  reason: collision with root package name */
    public final int f1168i;

    /* renamed from: j  reason: collision with root package name */
    public final int f1169j;

    /* renamed from: k  reason: collision with root package name */
    public final String f1170k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f1171l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f1172m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f1173n;

    /* renamed from: o  reason: collision with root package name */
    public final Bundle f1174o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f1175p;

    /* renamed from: q  reason: collision with root package name */
    public final int f1176q;
    public Bundle r;

    public class a implements Parcelable.Creator<g0> {
        public final Object createFromParcel(Parcel parcel) {
            return new g0(parcel);
        }

        public final Object[] newArray(int i8) {
            return new g0[i8];
        }
    }

    public g0(Parcel parcel) {
        this.f1165f = parcel.readString();
        this.f1166g = parcel.readString();
        boolean z8 = true;
        this.f1167h = parcel.readInt() != 0;
        this.f1168i = parcel.readInt();
        this.f1169j = parcel.readInt();
        this.f1170k = parcel.readString();
        this.f1171l = parcel.readInt() != 0;
        this.f1172m = parcel.readInt() != 0;
        this.f1173n = parcel.readInt() != 0;
        this.f1174o = parcel.readBundle();
        this.f1175p = parcel.readInt() == 0 ? false : z8;
        this.r = parcel.readBundle();
        this.f1176q = parcel.readInt();
    }

    public g0(n nVar) {
        this.f1165f = nVar.getClass().getName();
        this.f1166g = nVar.f1258f;
        this.f1167h = nVar.f1266n;
        this.f1168i = nVar.w;
        this.f1169j = nVar.f1274x;
        this.f1170k = nVar.y;
        this.f1171l = nVar.B;
        this.f1172m = nVar.f1265m;
        this.f1173n = nVar.A;
        this.f1174o = nVar.f1259g;
        this.f1175p = nVar.f1275z;
        this.f1176q = nVar.P.ordinal();
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1165f);
        sb.append(" (");
        sb.append(this.f1166g);
        sb.append(")}:");
        if (this.f1167h) {
            sb.append(" fromLayout");
        }
        int i8 = this.f1169j;
        if (i8 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i8));
        }
        String str = this.f1170k;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f1171l) {
            sb.append(" retainInstance");
        }
        if (this.f1172m) {
            sb.append(" removing");
        }
        if (this.f1173n) {
            sb.append(" detached");
        }
        if (this.f1175p) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f1165f);
        parcel.writeString(this.f1166g);
        parcel.writeInt(this.f1167h ? 1 : 0);
        parcel.writeInt(this.f1168i);
        parcel.writeInt(this.f1169j);
        parcel.writeString(this.f1170k);
        parcel.writeInt(this.f1171l ? 1 : 0);
        parcel.writeInt(this.f1172m ? 1 : 0);
        parcel.writeInt(this.f1173n ? 1 : 0);
        parcel.writeBundle(this.f1174o);
        parcel.writeInt(this.f1175p ? 1 : 0);
        parcel.writeBundle(this.r);
        parcel.writeInt(this.f1176q);
    }
}
