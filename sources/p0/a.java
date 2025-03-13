package p0;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: g  reason: collision with root package name */
    public static final C0102a f6240g = new C0102a();

    /* renamed from: f  reason: collision with root package name */
    public final Parcelable f6241f;

    /* renamed from: p0.a$a  reason: collision with other inner class name */
    public static class C0102a extends a {
    }

    public a() {
        this.f6241f = null;
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f6241f = readParcelable == null ? f6240g : readParcelable;
    }

    public a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f6241f = parcelable == f6240g ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(this.f6241f, i8);
    }

    public static class b implements Parcelable.ClassLoaderCreator<a> {
        public final Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable((ClassLoader) null) == null) {
                return a.f6240g;
            }
            throw new IllegalStateException("superState must be null");
        }

        public final Object[] newArray(int i8) {
            return new a[i8];
        }

        public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f6240g;
            }
            throw new IllegalStateException("superState must be null");
        }
    }
}
