package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.j0;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final int[] f1088f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList<String> f1089g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f1090h;

    /* renamed from: i  reason: collision with root package name */
    public final int[] f1091i;

    /* renamed from: j  reason: collision with root package name */
    public final int f1092j;

    /* renamed from: k  reason: collision with root package name */
    public final String f1093k;

    /* renamed from: l  reason: collision with root package name */
    public final int f1094l;

    /* renamed from: m  reason: collision with root package name */
    public final int f1095m;

    /* renamed from: n  reason: collision with root package name */
    public final CharSequence f1096n;

    /* renamed from: o  reason: collision with root package name */
    public final int f1097o;

    /* renamed from: p  reason: collision with root package name */
    public final CharSequence f1098p;

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList<String> f1099q;
    public final ArrayList<String> r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f1100s;

    public class a implements Parcelable.Creator<b> {
        public final Object createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        public final Object[] newArray(int i8) {
            return new b[i8];
        }
    }

    public b(Parcel parcel) {
        this.f1088f = parcel.createIntArray();
        this.f1089g = parcel.createStringArrayList();
        this.f1090h = parcel.createIntArray();
        this.f1091i = parcel.createIntArray();
        this.f1092j = parcel.readInt();
        this.f1093k = parcel.readString();
        this.f1094l = parcel.readInt();
        this.f1095m = parcel.readInt();
        this.f1096n = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1097o = parcel.readInt();
        this.f1098p = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1099q = parcel.createStringArrayList();
        this.r = parcel.createStringArrayList();
        this.f1100s = parcel.readInt() != 0;
    }

    public b(a aVar) {
        int size = aVar.f1192a.size();
        this.f1088f = new int[(size * 5)];
        if (aVar.f1197g) {
            this.f1089g = new ArrayList<>(size);
            this.f1090h = new int[size];
            this.f1091i = new int[size];
            int i8 = 0;
            int i9 = 0;
            while (i8 < size) {
                j0.a aVar2 = aVar.f1192a.get(i8);
                int i10 = i9 + 1;
                this.f1088f[i9] = aVar2.f1207a;
                ArrayList<String> arrayList = this.f1089g;
                n nVar = aVar2.f1208b;
                arrayList.add(nVar != null ? nVar.f1258f : null);
                int[] iArr = this.f1088f;
                int i11 = i10 + 1;
                iArr[i10] = aVar2.f1209c;
                int i12 = i11 + 1;
                iArr[i11] = aVar2.f1210d;
                int i13 = i12 + 1;
                iArr[i12] = aVar2.e;
                iArr[i13] = aVar2.f1211f;
                this.f1090h[i8] = aVar2.f1212g.ordinal();
                this.f1091i[i8] = aVar2.f1213h.ordinal();
                i8++;
                i9 = i13 + 1;
            }
            this.f1092j = aVar.f1196f;
            this.f1093k = aVar.f1199i;
            this.f1094l = aVar.f1083s;
            this.f1095m = aVar.f1200j;
            this.f1096n = aVar.f1201k;
            this.f1097o = aVar.f1202l;
            this.f1098p = aVar.f1203m;
            this.f1099q = aVar.f1204n;
            this.r = aVar.f1205o;
            this.f1100s = aVar.f1206p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeIntArray(this.f1088f);
        parcel.writeStringList(this.f1089g);
        parcel.writeIntArray(this.f1090h);
        parcel.writeIntArray(this.f1091i);
        parcel.writeInt(this.f1092j);
        parcel.writeString(this.f1093k);
        parcel.writeInt(this.f1094l);
        parcel.writeInt(this.f1095m);
        TextUtils.writeToParcel(this.f1096n, parcel, 0);
        parcel.writeInt(this.f1097o);
        TextUtils.writeToParcel(this.f1098p, parcel, 0);
        parcel.writeStringList(this.f1099q);
        parcel.writeStringList(this.r);
        parcel.writeInt(this.f1100s ? 1 : 0);
    }
}
