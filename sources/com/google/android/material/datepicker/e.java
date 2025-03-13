package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.a;
import java.util.Arrays;

public final class e implements a.c {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final long f3242f;

    public static class a implements Parcelable.Creator<e> {
        public final Object createFromParcel(Parcel parcel) {
            return new e(parcel.readLong());
        }

        public final Object[] newArray(int i8) {
            return new e[i8];
        }
    }

    public e(long j8) {
        this.f3242f = j8;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return this.f3242f == ((e) obj).f3242f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f3242f)});
    }

    public final boolean i(long j8) {
        return j8 >= this.f3242f;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeLong(this.f3242f);
    }
}
