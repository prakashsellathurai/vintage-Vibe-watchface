package z;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;

public final class a extends a0.a {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f8629b = 0;

    /* renamed from: z.a$a  reason: collision with other inner class name */
    public static class C0158a {
        public static void a(Activity activity) {
            activity.finishAffinity();
        }

        public static void b(Activity activity, Intent intent, int i8, Bundle bundle) {
            activity.startActivityForResult(intent, i8, bundle);
        }

        public static void c(Activity activity, IntentSender intentSender, int i8, Intent intent, int i9, int i10, int i11, Bundle bundle) {
            activity.startIntentSenderForResult(intentSender, i8, intent, i9, i10, i11, bundle);
        }
    }

    public static class b {
        public static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        public static void b(Activity activity, String[] strArr, int i8) {
            activity.requestPermissions(strArr, i8);
        }

        public static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    public interface c {
        void b();
    }

    public static void b(Activity activity, String[] strArr, int i8) {
        int length = strArr.length;
        int i9 = 0;
        while (i9 < length) {
            if (!TextUtils.isEmpty(strArr[i9])) {
                i9++;
            } else {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
        }
        if (activity instanceof c) {
            ((c) activity).b();
        }
        b.b(activity, strArr, i8);
    }
}
