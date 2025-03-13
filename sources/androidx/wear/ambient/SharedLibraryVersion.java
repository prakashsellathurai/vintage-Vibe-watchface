package androidx.wear.ambient;

import android.os.Build;
import com.google.android.wearable.WearableSharedLib;

final class SharedLibraryVersion {

    public static final class PresenceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final boolean f2053a;

        static {
            boolean z8;
            try {
                Class.forName("com.google.android.wearable.compat.WearableActivityController");
                z8 = true;
            } catch (ClassNotFoundException unused) {
                z8 = false;
            }
            f2053a = z8;
        }
    }

    public static final class VersionHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final int f2054a = a(Build.VERSION.SDK_INT);

        public static int a(int i8) {
            if (i8 < 25) {
                return 0;
            }
            return WearableSharedLib.version();
        }
    }

    public static void verifySharedLibraryPresent() {
        if (!PresenceHolder.f2053a) {
            throw new IllegalStateException("Could not find wearable shared library classes. Please add <uses-library android:name=\"com.google.android.wearable\" android:required=\"false\" /> to the application manifest");
        }
    }

    public static int version() {
        verifySharedLibraryPresent();
        return VersionHolder.f2054a;
    }
}
