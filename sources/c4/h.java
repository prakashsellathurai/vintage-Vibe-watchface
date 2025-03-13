package c4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;
import s3.a;
import s3.c;

public final class h extends a implements p3.h {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f2662f;

    /* renamed from: g  reason: collision with root package name */
    public final String f2663g;

    public h(String str, ArrayList arrayList) {
        this.f2662f = arrayList;
        this.f2663g = str;
    }

    public final Status a() {
        return this.f2663g != null ? Status.f3019k : Status.f3020l;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int g9 = c.g(parcel, 20293);
        List<String> list = this.f2662f;
        if (list != null) {
            int g10 = c.g(parcel, 1);
            parcel.writeStringList(list);
            c.h(parcel, g10);
        }
        c.d(parcel, 2, this.f2663g);
        c.h(parcel, g9);
    }
}
