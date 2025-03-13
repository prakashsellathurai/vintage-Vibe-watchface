package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.wear.watchface.style.data.ComplicationOverlayWireFormat;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import p3.h;
import p3.l;
import r3.l;
import s3.a;
import s3.c;

public final class Status extends a implements h, ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<Status> CREATOR = new l();
    @RecentlyNonNull

    /* renamed from: k  reason: collision with root package name */
    public static final Status f3019k = new Status(0, (String) null);
    @RecentlyNonNull

    /* renamed from: l  reason: collision with root package name */
    public static final Status f3020l = new Status(16, (String) null);

    /* renamed from: f  reason: collision with root package name */
    public final int f3021f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3022g;

    /* renamed from: h  reason: collision with root package name */
    public final String f3023h;

    /* renamed from: i  reason: collision with root package name */
    public final PendingIntent f3024i;

    /* renamed from: j  reason: collision with root package name */
    public final o3.a f3025j;

    static {
        new Status(14, (String) null);
        new Status(8, (String) null);
        new Status(15, (String) null);
        new Status(17, (String) null);
        new Status(18, (String) null);
    }

    public Status() {
        throw null;
    }

    public Status(int i8, int i9, String str, PendingIntent pendingIntent, o3.a aVar) {
        this.f3021f = i8;
        this.f3022g = i9;
        this.f3023h = str;
        this.f3024i = pendingIntent;
        this.f3025j = aVar;
    }

    public Status(int i8, String str) {
        this(1, i8, str, (PendingIntent) null, (o3.a) null);
    }

    @RecentlyNonNull
    public final Status a() {
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r4 = (com.google.android.gms.common.api.Status) r4;
        r0 = r4.f3021f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.common.api.Status
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            com.google.android.gms.common.api.Status r4 = (com.google.android.gms.common.api.Status) r4
            int r0 = r4.f3021f
            int r2 = r3.f3021f
            if (r2 != r0) goto L_0x0034
            int r0 = r3.f3022g
            int r2 = r4.f3022g
            if (r0 != r2) goto L_0x0034
            java.lang.String r0 = r3.f3023h
            java.lang.String r2 = r4.f3023h
            boolean r0 = r3.l.a(r0, r2)
            if (r0 == 0) goto L_0x0034
            android.app.PendingIntent r0 = r3.f3024i
            android.app.PendingIntent r2 = r4.f3024i
            boolean r0 = r3.l.a(r0, r2)
            if (r0 == 0) goto L_0x0034
            o3.a r3 = r3.f3025j
            o3.a r4 = r4.f3025j
            boolean r3 = r3.l.a(r3, r4)
            if (r3 == 0) goto L_0x0034
            r3 = 1
            return r3
        L_0x0034:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.Status.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3021f), Integer.valueOf(this.f3022g), this.f3023h, this.f3024i, this.f3025j});
    }

    @RecentlyNonNull
    public final String toString() {
        l.a aVar = new l.a(this);
        String str = this.f3023h;
        if (str == null) {
            int i8 = this.f3022g;
            switch (i8) {
                case ComplicationOverlayWireFormat.ENABLED_UNKNOWN:
                    str = "SUCCESS_CACHE";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 13:
                    str = "ERROR";
                    break;
                case 14:
                    str = "INTERRUPTED";
                    break;
                case 15:
                    str = "TIMEOUT";
                    break;
                case 16:
                    str = "CANCELED";
                    break;
                case 17:
                    str = "API_NOT_CONNECTED";
                    break;
                case 18:
                    str = "DEAD_CLIENT";
                    break;
                case 19:
                    str = "REMOTE_EXCEPTION";
                    break;
                case EXERCISE_TYPE_DUMBBELL_FRONT_RAISE_VALUE:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case EXERCISE_TYPE_DUMBBELL_LATERAL_RAISE_VALUE:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_LEFT_ARM_VALUE:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
                default:
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("unknown status code: ");
                    sb.append(i8);
                    str = sb.toString();
                    break;
            }
        }
        aVar.a(str, "statusCode");
        aVar.a(this.f3024i, "resolution");
        return aVar.toString();
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i8) {
        int g9 = c.g(parcel, 20293);
        c.b(parcel, 1, this.f3022g);
        c.d(parcel, 2, this.f3023h);
        c.c(parcel, 3, this.f3024i, i8);
        c.c(parcel, 4, this.f3025j, i8);
        c.b(parcel, 1000, this.f3021f);
        c.h(parcel, g9);
    }
}
