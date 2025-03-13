package k2;

import android.util.Log;
import java.util.HashSet;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final b f5106a = new b();

    public static void a() {
        f5106a.getClass();
    }

    public static void b(String str) {
        f5106a.getClass();
        HashSet hashSet = b.f5105a;
        if (!hashSet.contains(str)) {
            Log.w("LOTTIE", str, (Throwable) null);
            hashSet.add(str);
        }
    }

    public static void c(String str, Throwable th) {
        f5106a.getClass();
        HashSet hashSet = b.f5105a;
        if (!hashSet.contains(str)) {
            Log.w("LOTTIE", str, th);
            hashSet.add(str);
        }
    }
}
