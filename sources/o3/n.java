package o3;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import r3.a1;
import r3.z0;
import x3.b;

public abstract class n extends z0 {

    /* renamed from: b  reason: collision with root package name */
    public final int f6101b;

    public n(byte[] bArr) {
        if (bArr.length == 25) {
            this.f6101b = Arrays.hashCode(bArr);
            return;
        }
        throw new IllegalArgumentException();
    }

    public static byte[] y(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        b g9;
        if (obj != null && (obj instanceof a1)) {
            try {
                a1 a1Var = (a1) obj;
                if (a1Var.j() != this.f6101b || (g9 = a1Var.g()) == null) {
                    return false;
                }
                return Arrays.equals(x(), (byte[]) b.x(g9));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final b g() {
        return new b(x());
    }

    public final int hashCode() {
        return this.f6101b;
    }

    public final int j() {
        return this.f6101b;
    }

    public abstract byte[] x();
}
