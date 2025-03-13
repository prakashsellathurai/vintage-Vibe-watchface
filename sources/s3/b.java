package s3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

public final class b {

    public static class a extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(@androidx.annotation.RecentlyNonNull java.lang.String r4, @androidx.annotation.RecentlyNonNull android.os.Parcel r5) {
            /*
                r3 = this;
                int r0 = r5.dataPosition()
                int r5 = r5.dataSize()
                java.lang.String r1 = java.lang.String.valueOf(r4)
                int r1 = r1.length()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                int r1 = r1 + 41
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = " Parcel: pos="
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = " size="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: s3.b.a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    @RecentlyNonNull
    public static <T extends Parcelable> T a(@RecentlyNonNull Parcel parcel, int i8, @RecentlyNonNull Parcelable.Creator<T> creator) {
        int g9 = g(parcel, i8);
        int dataPosition = parcel.dataPosition();
        if (g9 == 0) {
            return null;
        }
        T t8 = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + g9);
        return t8;
    }

    @RecentlyNonNull
    public static String b(@RecentlyNonNull Parcel parcel, int i8) {
        int g9 = g(parcel, i8);
        int dataPosition = parcel.dataPosition();
        if (g9 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + g9);
        return readString;
    }

    @RecentlyNonNull
    public static <T> T[] c(@RecentlyNonNull Parcel parcel, int i8, @RecentlyNonNull Parcelable.Creator<T> creator) {
        int g9 = g(parcel, i8);
        int dataPosition = parcel.dataPosition();
        if (g9 == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + g9);
        return createTypedArray;
    }

    public static void d(@RecentlyNonNull Parcel parcel, int i8) {
        if (parcel.dataPosition() != i8) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Overread allowed size end=");
            sb.append(i8);
            throw new a(sb.toString(), parcel);
        }
    }

    public static boolean e(@RecentlyNonNull Parcel parcel, int i8) {
        j(parcel, i8, 4);
        return parcel.readInt() != 0;
    }

    public static int f(@RecentlyNonNull Parcel parcel, int i8) {
        j(parcel, i8, 4);
        return parcel.readInt();
    }

    public static int g(@RecentlyNonNull Parcel parcel, int i8) {
        return (i8 & -65536) != -65536 ? (char) (i8 >> 16) : parcel.readInt();
    }

    public static void h(@RecentlyNonNull Parcel parcel, int i8) {
        parcel.setDataPosition(parcel.dataPosition() + g(parcel, i8));
    }

    public static int i(@RecentlyNonNull Parcel parcel) {
        int readInt = parcel.readInt();
        int g9 = g(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if (((char) readInt) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(readInt));
            throw new a(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i8 = g9 + dataPosition;
        if (i8 >= dataPosition && i8 <= parcel.dataSize()) {
            return i8;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i8);
        throw new a(sb.toString(), parcel);
    }

    public static void j(Parcel parcel, int i8, int i9) {
        int g9 = g(parcel, i8);
        if (g9 != i9) {
            String hexString = Integer.toHexString(g9);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i9);
            sb.append(" got ");
            sb.append(g9);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new a(sb.toString(), parcel);
        }
    }
}
