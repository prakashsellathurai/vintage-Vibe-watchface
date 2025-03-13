package z3;

import android.os.Parcel;
import android.os.Parcelable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f8688a = 0;

    static {
        a.class.getClassLoader();
    }

    public static <T extends Parcelable> T a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
