package s3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.List;

public final class c {
    public static void a(@RecentlyNonNull Parcel parcel, int i8, boolean z8) {
        parcel.writeInt(i8 | 262144);
        parcel.writeInt(z8 ? 1 : 0);
    }

    public static void b(@RecentlyNonNull Parcel parcel, int i8, int i9) {
        parcel.writeInt(i8 | 262144);
        parcel.writeInt(i9);
    }

    public static void c(@RecentlyNonNull Parcel parcel, int i8, @RecentlyNonNull Parcelable parcelable, int i9) {
        if (parcelable != null) {
            int g9 = g(parcel, i8);
            parcelable.writeToParcel(parcel, i9);
            h(parcel, g9);
        }
    }

    public static void d(@RecentlyNonNull Parcel parcel, int i8, @RecentlyNonNull String str) {
        if (str != null) {
            int g9 = g(parcel, i8);
            parcel.writeString(str);
            h(parcel, g9);
        }
    }

    public static void e(@RecentlyNonNull Parcel parcel, int i8, @RecentlyNonNull Parcelable[] parcelableArr, int i9) {
        if (parcelableArr != null) {
            int g9 = g(parcel, i8);
            parcel.writeInt(r0);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    i(parcel, parcelable, i9);
                }
            }
            h(parcel, g9);
        }
    }

    public static void f(@RecentlyNonNull Parcel parcel, int i8, @RecentlyNonNull List list) {
        if (list != null) {
            int g9 = g(parcel, i8);
            int size = list.size();
            parcel.writeInt(size);
            for (int i9 = 0; i9 < size; i9++) {
                Parcelable parcelable = (Parcelable) list.get(i9);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    i(parcel, parcelable, 0);
                }
            }
            h(parcel, g9);
        }
    }

    public static int g(Parcel parcel, int i8) {
        parcel.writeInt(i8 | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void h(Parcel parcel, int i8) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i8 - 4);
        parcel.writeInt(dataPosition - i8);
        parcel.setDataPosition(dataPosition);
    }

    public static <T extends Parcelable> void i(Parcel parcel, T t8, int i8) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t8.writeToParcel(parcel, i8);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
