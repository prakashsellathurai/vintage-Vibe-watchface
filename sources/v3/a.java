package v3;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.RecentlyNonNull;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f7925a;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f7926b;

    /* renamed from: c  reason: collision with root package name */
    public static Boolean f7927c;

    /* renamed from: d  reason: collision with root package name */
    public static Boolean f7928d;

    @TargetApi(26)
    public static void a(@RecentlyNonNull Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f7925a == null) {
            f7925a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (f7925a.booleanValue()) {
            if (f7926b == null) {
                f7926b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            }
            f7926b.booleanValue();
        }
    }
}
