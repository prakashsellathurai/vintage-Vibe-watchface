package androidx.wear.watchface.data;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import g1.d;
import java.util.ArrayList;
import java.util.List;
import k3.j;

@SuppressLint({"BanParcelableUsage"})
public final class ComplicationSlotMetadataWireFormat implements d, Parcelable {
    public static final Parcelable.Creator<ComplicationSlotMetadataWireFormat> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public int f2307f;

    /* renamed from: g  reason: collision with root package name */
    public int[] f2308g;

    /* renamed from: h  reason: collision with root package name */
    public RectF[] f2309h;

    /* renamed from: i  reason: collision with root package name */
    public int f2310i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f2311j;

    /* renamed from: k  reason: collision with root package name */
    public List<ComponentName> f2312k;

    /* renamed from: l  reason: collision with root package name */
    public int f2313l;

    /* renamed from: m  reason: collision with root package name */
    public int f2314m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f2315n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f2316o;

    /* renamed from: p  reason: collision with root package name */
    public Bundle f2317p;

    /* renamed from: q  reason: collision with root package name */
    public int f2318q;
    public int r;

    /* renamed from: s  reason: collision with root package name */
    public BoundingArcWireFormat f2319s;

    /* renamed from: t  reason: collision with root package name */
    public List<RectF> f2320t;

    public class a implements Parcelable.Creator<ComplicationSlotMetadataWireFormat> {
        public final Object createFromParcel(Parcel parcel) {
            return (ComplicationSlotMetadataWireFormat) j.v(parcel.readParcelable(a.class.getClassLoader()));
        }

        public final Object[] newArray(int i8) {
            return new ComplicationSlotMetadataWireFormat[i8];
        }
    }

    public ComplicationSlotMetadataWireFormat() {
        this.f2308g = new int[0];
        this.f2309h = new RectF[0];
        this.f2311j = new int[0];
        this.f2318q = 1;
        this.r = 1;
    }

    public ComplicationSlotMetadataWireFormat(int i8, int[] iArr, RectF[] rectFArr, List list, int i9, int[] iArr2, ArrayList arrayList, int i10, int i11, int i12, int i13, boolean z8, boolean z9, Bundle bundle, BoundingArcWireFormat boundingArcWireFormat) {
        this.f2307f = i8;
        this.f2308g = iArr;
        this.f2309h = rectFArr;
        this.f2320t = list;
        this.f2310i = i9;
        this.f2311j = iArr2;
        this.f2312k = arrayList;
        this.f2318q = i12;
        this.r = i13;
        this.f2313l = i10;
        this.f2314m = i11;
        this.f2315n = z8;
        this.f2316o = z9;
        this.f2317p = bundle;
        this.f2319s = boundingArcWireFormat;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(new ParcelImpl((d) this), i8);
    }
}
