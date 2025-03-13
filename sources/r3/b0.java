package r3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import r3.i;
import s3.a;
import s3.c;

public final class b0 extends a {
    public static final Parcelable.Creator<b0> CREATOR = new c0();

    /* renamed from: f  reason: collision with root package name */
    public final int f6928f;

    /* renamed from: g  reason: collision with root package name */
    public final IBinder f6929g;

    /* renamed from: h  reason: collision with root package name */
    public final o3.a f6930h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f6931i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f6932j;

    public b0(int i8, IBinder iBinder, o3.a aVar, boolean z8, boolean z9) {
        this.f6928f = i8;
        this.f6929g = iBinder;
        this.f6930h = aVar;
        this.f6931i = z8;
        this.f6932j = z9;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (this.f6930h.equals(b0Var.f6930h)) {
            Object obj3 = null;
            IBinder iBinder = this.f6929g;
            if (iBinder == null) {
                obj2 = null;
            } else {
                int i8 = i.a.f6992b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                obj2 = queryLocalInterface instanceof i ? (i) queryLocalInterface : new y0(iBinder);
            }
            IBinder iBinder2 = b0Var.f6929g;
            if (iBinder2 != null) {
                int i9 = i.a.f6992b;
                IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                obj3 = queryLocalInterface2 instanceof i ? (i) queryLocalInterface2 : new y0(iBinder2);
            }
            if (l.a(obj2, obj3)) {
                return true;
            }
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int g9 = c.g(parcel, 20293);
        c.b(parcel, 1, this.f6928f);
        IBinder iBinder = this.f6929g;
        if (iBinder != null) {
            int g10 = c.g(parcel, 2);
            parcel.writeStrongBinder(iBinder);
            c.h(parcel, g10);
        }
        c.c(parcel, 3, this.f6930h, i8);
        c.a(parcel, 4, this.f6931i);
        c.a(parcel, 5, this.f6932j);
        c.h(parcel, g9);
    }
}
