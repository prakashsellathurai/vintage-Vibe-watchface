package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p3.k;
import s3.a;
import s3.c;

public final class Scope extends a implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<Scope> CREATOR = new k();

    /* renamed from: f  reason: collision with root package name */
    public final int f3017f;

    /* renamed from: g  reason: collision with root package name */
    public final String f3018g;

    public Scope() {
        throw null;
    }

    public Scope(int i8, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f3017f = i8;
            this.f3018g = str;
            return;
        }
        throw new IllegalArgumentException("scopeUri must not be null or empty");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f3018g.equals(((Scope) obj).f3018g);
    }

    public final int hashCode() {
        return this.f3018g.hashCode();
    }

    @RecentlyNonNull
    public final String toString() {
        return this.f3018g;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i8) {
        int g9 = c.g(parcel, 20293);
        c.b(parcel, 1, this.f3017f);
        c.d(parcel, 2, this.f3018g);
        c.h(parcel, g9);
    }
}
