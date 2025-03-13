package r3;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;

public final class b {
    public static void a(@RecentlyNonNull Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name2).length() + 36 + String.valueOf(name).length());
            sb.append("Must be called on ");
            sb.append(name2);
            sb.append(" thread, but got ");
            sb.append(name);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }

    public static void b(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void c(@RecentlyNonNull Object obj, @RecentlyNonNull String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void d(boolean z8, @RecentlyNonNull String str) {
        if (!z8) {
            throw new IllegalStateException(str);
        }
    }
}
