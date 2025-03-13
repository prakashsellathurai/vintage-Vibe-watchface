package a0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import java.io.File;
import java.util.concurrent.Executor;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f10a = new Object();

    /* renamed from: a0.a$a  reason: collision with other inner class name */
    public static class C0002a {
        public static void a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        public static void b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    public static class b {
        public static File a(Context context) {
            return context.getCodeCacheDir();
        }

        public static Drawable b(Context context, int i8) {
            return context.getDrawable(i8);
        }

        public static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    public static class c {
        public static int a(Context context, int i8) {
            return context.getColor(i8);
        }

        public static <T> T b(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }

        public static String c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    public static class d {
        public static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    public static int a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new NullPointerException("permission must be non-null");
    }
}
