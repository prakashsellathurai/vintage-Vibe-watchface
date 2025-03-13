package a;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import q7.k;

public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final ComponentName f2f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3g;

    /* renamed from: h  reason: collision with root package name */
    public final int f4h;

    /* renamed from: i  reason: collision with root package name */
    public final int f5i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f6j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f7k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f8l;

    /* renamed from: m  reason: collision with root package name */
    public final Bundle f9m;

    public static final class a implements Parcelable.Creator<c> {
        public final Object createFromParcel(Parcel parcel) {
            k.e(parcel, "parcel");
            Bundle readBundle = parcel.readBundle(a.class.getClassLoader());
            k.b(readBundle);
            Parcelable parcelable = readBundle.getParcelable("component");
            k.b(parcelable);
            return new c((ComponentName) parcelable, readBundle.getInt("viewProtectionMode"), readBundle.getInt("statusBarGravity"), readBundle.getInt("accentColor", -1), readBundle.getBoolean("showUnreadIndicator"), readBundle.getBoolean("hideNotificationIndicator"), readBundle.getBoolean("acceptsTapEvents"), readBundle);
        }

        public final Object[] newArray(int i8) {
            return new c[i8];
        }
    }

    public c(ComponentName componentName, int i8, int i9, int i10, boolean z8, boolean z9, boolean z10, Bundle bundle) {
        k.e(componentName, "component");
        this.f2f = componentName;
        this.f3g = i8;
        this.f4h = i9;
        this.f5i = i10;
        this.f6j = z8;
        this.f7k = z9;
        this.f8l = z10;
        this.f9m = bundle;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.a(c.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        k.c(obj, "null cannot be cast to non-null type android.support.wearable.watchface.WatchFaceStyle");
        c cVar = (c) obj;
        return k.a(this.f2f, cVar.f2f) && this.f3g == cVar.f3g && this.f4h == cVar.f4h && this.f5i == cVar.f5i && this.f6j == cVar.f6j && this.f7k == cVar.f7k && this.f8l == cVar.f8l;
    }

    public final int hashCode() {
        return (((((((((((this.f2f.hashCode() * 31) + this.f3g) * 31) + this.f4h) * 31) + this.f5i) * 31) + Boolean.hashCode(this.f6j)) * 31) + Boolean.hashCode(this.f7k)) * 31) + Boolean.hashCode(this.f8l);
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        k.e(parcel, "dest");
        Bundle bundle = new Bundle();
        bundle.putParcelable("component", this.f2f);
        bundle.putInt("viewProtectionMode", this.f3g);
        bundle.putInt("statusBarGravity", this.f4h);
        bundle.putInt("accentColor", this.f5i);
        bundle.putBoolean("showUnreadIndicator", this.f6j);
        bundle.putBoolean("hideNotificationIndicator", this.f7k);
        bundle.putBoolean("acceptsTapEvents", this.f8l);
        Bundle bundle2 = this.f9m;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        parcel.writeBundle(bundle);
    }
}
