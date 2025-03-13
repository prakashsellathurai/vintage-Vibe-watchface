package androidx.wear.ambient;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.wearable.compat.WearableActivityController;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;

final class AmbientDelegate {

    /* renamed from: a  reason: collision with root package name */
    public WearableActivityController f2038a;

    /* renamed from: b  reason: collision with root package name */
    public final WearableControllerProvider f2039b;

    /* renamed from: c  reason: collision with root package name */
    public final AmbientCallback f2040c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakReference<Activity> f2041d;

    public interface AmbientCallback {
        void onAmbientOffloadInvalidated();

        void onEnterAmbient(Bundle bundle);

        void onExitAmbient();

        void onUpdateAmbient();
    }

    public AmbientDelegate(Activity activity, WearableControllerProvider wearableControllerProvider, AmbientCallback ambientCallback) {
        this.f2041d = new WeakReference<>(activity);
        this.f2040c = ambientCallback;
        this.f2039b = wearableControllerProvider;
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        WearableActivityController wearableActivityController = this.f2038a;
        if (wearableActivityController != null) {
            wearableActivityController.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final boolean b() {
        WearableActivityController wearableActivityController = this.f2038a;
        if (wearableActivityController != null) {
            return wearableActivityController.isAmbient();
        }
        return false;
    }

    public final void c() {
        Activity activity = this.f2041d.get();
        if (activity != null) {
            this.f2038a = this.f2039b.getWearableController(activity, this.f2040c);
        }
        WearableActivityController wearableActivityController = this.f2038a;
        if (wearableActivityController != null) {
            wearableActivityController.onCreate();
        }
    }

    public final void d() {
        WearableActivityController wearableActivityController = this.f2038a;
        if (wearableActivityController != null) {
            wearableActivityController.onDestroy();
        }
    }

    public final void e() {
        WearableActivityController wearableActivityController = this.f2038a;
        if (wearableActivityController != null) {
            wearableActivityController.onPause();
        }
    }

    public final void f() {
        WearableActivityController wearableActivityController = this.f2038a;
        if (wearableActivityController != null) {
            wearableActivityController.onResume();
        }
    }

    public final void g() {
        WearableActivityController wearableActivityController = this.f2038a;
        if (wearableActivityController != null) {
            wearableActivityController.onStop();
        }
    }

    public final void h() {
        WearableActivityController wearableActivityController = this.f2038a;
        if (wearableActivityController != null) {
            wearableActivityController.setAmbientEnabled();
        }
    }

    public final void setAmbientOffloadEnabled(boolean z8) {
        WearableActivityController wearableActivityController = this.f2038a;
        if (wearableActivityController != null) {
            wearableActivityController.setAmbientOffloadEnabled(z8);
        }
    }

    public final void setAutoResumeEnabled(boolean z8) {
        WearableActivityController wearableActivityController = this.f2038a;
        if (wearableActivityController != null) {
            wearableActivityController.setAutoResumeEnabled(z8);
        }
    }
}
