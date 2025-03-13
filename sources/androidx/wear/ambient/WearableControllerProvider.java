package androidx.wear.ambient;

import android.app.Activity;
import android.os.Bundle;
import androidx.wear.ambient.AmbientDelegate;
import com.google.android.wearable.compat.WearableActivityController;
import java.lang.reflect.Method;

public final class WearableControllerProvider {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f2055a;

    public static void a() {
        if (!f2055a) {
            try {
                Method declaredMethod = WearableActivityController.AmbientCallback.class.getDeclaredMethod("onEnterAmbient", new Class[]{Bundle.class});
                if (".onEnterAmbient".equals("." + declaredMethod.getName())) {
                    f2055a = true;
                    return;
                }
                throw new NoSuchMethodException();
            } catch (NoSuchMethodException unused) {
                throw new IllegalStateException("Could not find a required method for ambient support, likely due to proguard optimization. Please add com.google.android.wearable:wearable jar to the list of library jars for your project");
            }
        }
    }

    public final WearableActivityController getWearableController(Activity activity, final AmbientDelegate.AmbientCallback ambientCallback) {
        SharedLibraryVersion.verifySharedLibraryPresent();
        AnonymousClass1 r12 = new WearableActivityController.AmbientCallback() {
            public final void onEnterAmbient(Bundle bundle) {
                AmbientDelegate.AmbientCallback.this.onEnterAmbient(bundle);
            }

            public final void onExitAmbient() {
                AmbientDelegate.AmbientCallback.this.onExitAmbient();
            }

            public final void onInvalidateAmbientOffload() {
                AmbientDelegate.AmbientCallback.this.onAmbientOffloadInvalidated();
            }

            public final void onUpdateAmbient() {
                AmbientDelegate.AmbientCallback.this.onUpdateAmbient();
            }
        };
        a();
        return new WearableActivityController("WearableControllerProvider", activity, r12);
    }
}
