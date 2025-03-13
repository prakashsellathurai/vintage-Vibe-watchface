package o3;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static h f6095a;

    public h(@RecentlyNonNull Context context) {
        context.getApplicationContext();
    }

    public static final n a(PackageInfo packageInfo, n... nVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        o oVar = new o(packageInfo.signatures[0].toByteArray());
        for (int i8 = 0; i8 < nVarArr.length; i8++) {
            if (nVarArr[i8].equals(oVar)) {
                return nVarArr[i8];
            }
        }
        return null;
    }

    public static final boolean b(@RecentlyNonNull PackageInfo packageInfo) {
        return (packageInfo == null || packageInfo.signatures == null || a(packageInfo, q.f6105a) == null) ? false : true;
    }
}
