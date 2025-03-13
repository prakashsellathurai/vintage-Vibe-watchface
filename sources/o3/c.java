package o3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.Arrays;
import r3.l;
import s3.a;

public final class c extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<c> CREATOR = new l();

    /* renamed from: f  reason: collision with root package name */
    public final String f6086f;
    @Deprecated

    /* renamed from: g  reason: collision with root package name */
    public final int f6087g;

    /* renamed from: h  reason: collision with root package name */
    public final long f6088h;

    public c() {
        this.f6086f = "CLIENT_TELEMETRY";
        this.f6088h = 1;
        this.f6087g = -1;
    }

    public c(@RecentlyNonNull String str, int i8, long j8) {
        this.f6086f = str;
        this.f6087g = i8;
        this.f6088h = j8;
    }

    public final long b() {
        long j8 = this.f6088h;
        return j8 == -1 ? (long) this.f6087g : j8;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = this.f6086f;
            return ((str != null && str.equals(cVar.f6086f)) || (str == null && cVar.f6086f == null)) && b() == cVar.b();
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6086f, Long.valueOf(b())});
    }

    @RecentlyNonNull
    public final String toString() {
        l.a aVar = new l.a(this);
        aVar.a(this.f6086f, "name");
        aVar.a(Long.valueOf(b()), "version");
        return aVar.toString();
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i8) {
        int g9 = s3.c.g(parcel, 20293);
        s3.c.d(parcel, 1, this.f6086f);
        s3.c.b(parcel, 2, this.f6087g);
        long b9 = b();
        parcel.writeInt(524291);
        parcel.writeLong(b9);
        s3.c.h(parcel, g9);
    }
}
