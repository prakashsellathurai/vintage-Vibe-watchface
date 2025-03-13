package r3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.List;
import s3.a;
import s3.c;

public final class o extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<o> CREATOR = new q();

    /* renamed from: f  reason: collision with root package name */
    public final int f7020f;

    /* renamed from: g  reason: collision with root package name */
    public List<k> f7021g;

    public o(int i8, List<k> list) {
        this.f7020f = i8;
        this.f7021g = list;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i8) {
        int g9 = c.g(parcel, 20293);
        c.b(parcel, 1, this.f7020f);
        c.f(parcel, 2, this.f7021g);
        c.h(parcel, g9);
    }
}
