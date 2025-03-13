package androidx.wear.watchface.data;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import g1.d;
import java.util.ArrayList;
import java.util.List;
import k3.j;

@SuppressLint({"BanParcelableUsage"})
public final class ComplicationStateWireFormat implements d, Parcelable {
    public static final Parcelable.Creator<ComplicationStateWireFormat> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public Rect f2321f;

    /* renamed from: g  reason: collision with root package name */
    public int f2322g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f2323h;

    /* renamed from: i  reason: collision with root package name */
    public List<ComponentName> f2324i;

    /* renamed from: j  reason: collision with root package name */
    public int f2325j;

    /* renamed from: k  reason: collision with root package name */
    public int f2326k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f2327l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2328m;

    /* renamed from: n  reason: collision with root package name */
    public int f2329n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f2330o;

    /* renamed from: p  reason: collision with root package name */
    public Bundle f2331p;

    /* renamed from: q  reason: collision with root package name */
    public int f2332q;
    public int r;

    /* renamed from: s  reason: collision with root package name */
    public int f2333s;

    /* renamed from: t  reason: collision with root package name */
    public int f2334t;

    /* renamed from: u  reason: collision with root package name */
    public BoundingArcWireFormat f2335u;

    /* renamed from: v  reason: collision with root package name */
    public Rect f2336v;

    public class a implements Parcelable.Creator<ComplicationStateWireFormat> {
        public final Object createFromParcel(Parcel parcel) {
            return (ComplicationStateWireFormat) j.v(parcel.readParcelable(a.class.getClassLoader()));
        }

        public final Object[] newArray(int i8) {
            return new ComplicationStateWireFormat[i8];
        }
    }

    public ComplicationStateWireFormat() {
        this.f2332q = 1;
        this.r = 1;
    }

    public ComplicationStateWireFormat(Rect rect, Rect rect2, int i8, int[] iArr, ArrayList arrayList, int i9, int i10, int i11, int i12, boolean z8, boolean z9, int i13, boolean z10, Bundle bundle, Integer num, Integer num2, BoundingArcWireFormat boundingArcWireFormat) {
        this.f2321f = rect;
        this.f2336v = rect2;
        this.f2322g = i8;
        this.f2323h = iArr;
        this.f2324i = arrayList;
        this.f2325j = i9;
        this.f2326k = i10;
        this.f2332q = i11;
        this.r = i12;
        this.f2327l = z8;
        this.f2328m = z9;
        this.f2329n = i13;
        this.f2330o = z10;
        this.f2331p = bundle;
        int i14 = 0;
        this.f2333s = num != null ? num.intValue() : 0;
        this.f2334t = num2 != null ? num2.intValue() : i14;
        this.f2335u = boundingArcWireFormat;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(new ParcelImpl((d) this), i8);
    }
}
