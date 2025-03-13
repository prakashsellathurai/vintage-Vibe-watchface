package o3;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.wear.watchface.style.data.ComplicationOverlayWireFormat;
import java.util.Arrays;
import r3.l;
import s3.c;

public final class a extends s3.a {
    @RecentlyNonNull
    public static final Parcelable.Creator<a> CREATOR = new k();
    @RecentlyNonNull

    /* renamed from: j  reason: collision with root package name */
    public static final a f6078j = new a(0);

    /* renamed from: f  reason: collision with root package name */
    public final int f6079f;

    /* renamed from: g  reason: collision with root package name */
    public final int f6080g;

    /* renamed from: h  reason: collision with root package name */
    public final PendingIntent f6081h;

    /* renamed from: i  reason: collision with root package name */
    public final String f6082i;

    public a() {
        throw null;
    }

    public a(int i8) {
        this(1, i8, (PendingIntent) null, (String) null);
    }

    public a(int i8, int i9, PendingIntent pendingIntent, String str) {
        this.f6079f = i8;
        this.f6080g = i9;
        this.f6081h = pendingIntent;
        this.f6082i = str;
    }

    public static String b(int i8) {
        if (i8 == 99) {
            return "UNFINISHED";
        }
        if (i8 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i8) {
            case ComplicationOverlayWireFormat.ENABLED_UNKNOWN:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i8) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case EXERCISE_TYPE_DUMBBELL_FRONT_RAISE_VALUE:
                        return "RESTRICTED_PROFILE";
                    case EXERCISE_TYPE_DUMBBELL_LATERAL_RAISE_VALUE:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_LEFT_ARM_VALUE:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_RIGHT_ARM_VALUE:
                        return "API_DISABLED";
                    case EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_TWO_ARM_VALUE:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i8);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (o3.a) r5;
        r1 = r5.f6080g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof o3.a
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            o3.a r5 = (o3.a) r5
            int r1 = r5.f6080g
            int r3 = r4.f6080g
            if (r3 != r1) goto L_0x0027
            android.app.PendingIntent r1 = r4.f6081h
            android.app.PendingIntent r3 = r5.f6081h
            boolean r1 = r3.l.a(r1, r3)
            if (r1 == 0) goto L_0x0027
            java.lang.String r4 = r4.f6082i
            java.lang.String r5 = r5.f6082i
            boolean r4 = r3.l.a(r4, r5)
            if (r4 == 0) goto L_0x0027
            return r0
        L_0x0027:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6080g), this.f6081h, this.f6082i});
    }

    @RecentlyNonNull
    public final String toString() {
        l.a aVar = new l.a(this);
        aVar.a(b(this.f6080g), "statusCode");
        aVar.a(this.f6081h, "resolution");
        aVar.a(this.f6082i, "message");
        return aVar.toString();
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i8) {
        int g9 = c.g(parcel, 20293);
        c.b(parcel, 1, this.f6079f);
        c.b(parcel, 2, this.f6080g);
        c.c(parcel, 3, this.f6081h, i8);
        c.d(parcel, 4, this.f6082i);
        c.h(parcel, g9);
    }

    public a(int i8, PendingIntent pendingIntent) {
        this(1, i8, pendingIntent, (String) null);
    }
}
