package g1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import p.a;

public final class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public final SparseIntArray f4485d;
    public final Parcel e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4486f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4487g;

    /* renamed from: h  reason: collision with root package name */
    public final String f4488h;

    /* renamed from: i  reason: collision with root package name */
    public int f4489i;

    /* renamed from: j  reason: collision with root package name */
    public int f4490j;

    /* renamed from: k  reason: collision with root package name */
    public int f4491k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new a(), new a(), new a());
    }

    public b(Parcel parcel, int i8, int i9, String str, a<String, Method> aVar, a<String, Method> aVar2, a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f4485d = new SparseIntArray();
        this.f4489i = -1;
        this.f4491k = -1;
        this.e = parcel;
        this.f4486f = i8;
        this.f4487g = i9;
        this.f4490j = i8;
        this.f4488h = str;
    }

    public final String B() {
        return this.e.readString();
    }

    public final IBinder D() {
        return this.e.readStrongBinder();
    }

    public final void G(int i8) {
        a();
        this.f4489i = i8;
        this.f4485d.put(i8, this.e.dataPosition());
        T(0);
        T(i8);
    }

    public final void K(boolean z8) {
        this.e.writeInt(z8 ? 1 : 0);
    }

    public final void M(Bundle bundle) {
        this.e.writeBundle(bundle);
    }

    public final void N(byte[] bArr) {
        Parcel parcel = this.e;
        if (bArr != null) {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
            return;
        }
        parcel.writeInt(-1);
    }

    public final void Q(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.e, 0);
    }

    public final void S(float f9) {
        this.e.writeFloat(f9);
    }

    public final void T(int i8) {
        this.e.writeInt(i8);
    }

    public final void X(long j8) {
        this.e.writeLong(j8);
    }

    public final void Z(Parcelable parcelable) {
        this.e.writeParcelable(parcelable, 0);
    }

    public final void a() {
        int i8 = this.f4489i;
        if (i8 >= 0) {
            int i9 = this.f4485d.get(i8);
            Parcel parcel = this.e;
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i9);
            parcel.writeInt(dataPosition - i9);
            parcel.setDataPosition(dataPosition);
        }
    }

    public final a b() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i8 = this.f4490j;
        if (i8 == this.f4486f) {
            i8 = this.f4487g;
        }
        int i9 = i8;
        return new b(parcel, dataPosition, i9, this.f4488h + "  ", this.f4482a, this.f4483b, this.f4484c);
    }

    public final void d0(String str) {
        this.e.writeString(str);
    }

    public final void e0(IBinder iBinder) {
        this.e.writeStrongBinder(iBinder);
    }

    public final boolean h() {
        return this.e.readInt() != 0;
    }

    public final Bundle j() {
        return this.e.readBundle(b.class.getClassLoader());
    }

    public final byte[] l() {
        Parcel parcel = this.e;
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        return bArr;
    }

    public final CharSequence n() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.e);
    }

    public final boolean q(int i8) {
        while (this.f4490j < this.f4487g) {
            int i9 = this.f4491k;
            if (i9 == i8) {
                return true;
            }
            if (String.valueOf(i9).compareTo(String.valueOf(i8)) > 0) {
                return false;
            }
            int i10 = this.f4490j;
            Parcel parcel = this.e;
            parcel.setDataPosition(i10);
            int readInt = parcel.readInt();
            this.f4491k = parcel.readInt();
            this.f4490j += readInt;
        }
        return this.f4491k == i8;
    }

    public final float r() {
        return this.e.readFloat();
    }

    public final int s() {
        return this.e.readInt();
    }

    public final long v() {
        return this.e.readLong();
    }

    public final <T extends Parcelable> T y() {
        return this.e.readParcelable(b.class.getClassLoader());
    }
}
