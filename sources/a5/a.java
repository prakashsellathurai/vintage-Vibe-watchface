package a5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p.f;

public final class a extends p0.a {
    public static final Parcelable.Creator<a> CREATOR = new C0004a();

    /* renamed from: h  reason: collision with root package name */
    public final f<String, Bundle> f170h;

    /* renamed from: a5.a$a  reason: collision with other inner class name */
    public static class C0004a implements Parcelable.ClassLoaderCreator<a> {
        public final Object createFromParcel(Parcel parcel) {
            return new a(parcel, (ClassLoader) null);
        }

        public final Object[] newArray(int i8) {
            return new a[i8];
        }

        public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader);
        }
    }

    public a() {
        throw null;
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f170h = new f<>(readInt);
        for (int i8 = 0; i8 < readInt; i8++) {
            this.f170h.put(strArr[i8], bundleArr[i8]);
        }
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f170h + "}";
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(this.f6241f, i8);
        f<String, Bundle> fVar = this.f170h;
        int i9 = fVar.f6235h;
        parcel.writeInt(i9);
        String[] strArr = new String[i9];
        Bundle[] bundleArr = new Bundle[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            strArr[i10] = fVar.h(i10);
            bundleArr[i10] = fVar.l(i10);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
