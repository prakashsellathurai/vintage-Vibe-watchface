package androidx.wear.ambient;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.wear.ambient.AmbientDelegate;
import java.io.FileDescriptor;
import java.io.PrintWriter;

@Deprecated
public final class AmbientMode extends Fragment {
    public static final String EXTRA_BURN_IN_PROTECTION = "com.google.android.wearable.compat.extra.BURN_IN_PROTECTION";
    public static final String EXTRA_LOWBIT_AMBIENT = "com.google.android.wearable.compat.extra.LOWBIT_AMBIENT";
    public static final String FRAGMENT_TAG = "android.support.wearable.ambient.AmbientMode";

    /* renamed from: a  reason: collision with root package name */
    public final AnonymousClass1 f2042a = new AmbientDelegate.AmbientCallback() {
        public final void onAmbientOffloadInvalidated() {
            AmbientCallback ambientCallback = AmbientMode.this.f2044c;
            if (ambientCallback != null) {
                ambientCallback.onAmbientOffloadInvalidated();
            }
        }

        public final void onEnterAmbient(Bundle bundle) {
            AmbientCallback ambientCallback = AmbientMode.this.f2044c;
            if (ambientCallback != null) {
                ambientCallback.onEnterAmbient(bundle);
            }
        }

        public final void onExitAmbient() {
            AmbientCallback ambientCallback = AmbientMode.this.f2044c;
            if (ambientCallback != null) {
                ambientCallback.onExitAmbient();
            }
        }

        public final void onUpdateAmbient() {
            AmbientCallback ambientCallback = AmbientMode.this.f2044c;
            if (ambientCallback != null) {
                ambientCallback.onUpdateAmbient();
            }
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public AmbientDelegate f2043b;

    /* renamed from: c  reason: collision with root package name */
    public AmbientCallback f2044c;

    /* renamed from: d  reason: collision with root package name */
    public final AmbientController f2045d = new AmbientController();

    public static abstract class AmbientCallback {
        public final void onAmbientOffloadInvalidated() {
        }

        public final void onEnterAmbient(Bundle bundle) {
        }

        public final void onExitAmbient() {
        }

        public final void onUpdateAmbient() {
        }
    }

    public interface AmbientCallbackProvider {
        AmbientCallback getAmbientCallback();
    }

    public final class AmbientController {
        public AmbientController() {
        }

        public final boolean isAmbient() {
            AmbientDelegate ambientDelegate = AmbientMode.this.f2043b;
            if (ambientDelegate == null) {
                return false;
            }
            return ambientDelegate.b();
        }

        public final void setAmbientOffloadEnabled(boolean z8) {
            AmbientDelegate ambientDelegate = AmbientMode.this.f2043b;
            if (ambientDelegate != null) {
                ambientDelegate.setAmbientOffloadEnabled(z8);
            }
        }
    }

    public static <T extends Activity> AmbientController attachAmbientSupport(T t8) {
        FragmentManager fragmentManager = t8.getFragmentManager();
        AmbientMode ambientMode = (AmbientMode) fragmentManager.findFragmentByTag("android.support.wearable.ambient.AmbientMode");
        if (ambientMode == null) {
            ambientMode = new AmbientMode();
            fragmentManager.beginTransaction().add(ambientMode, "android.support.wearable.ambient.AmbientMode").commit();
        }
        return ambientMode.f2045d;
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        AmbientDelegate ambientDelegate = this.f2043b;
        if (ambientDelegate != null) {
            ambientDelegate.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f2043b = new AmbientDelegate(getActivity(), new WearableControllerProvider(), this.f2042a);
        if (context instanceof AmbientCallbackProvider) {
            this.f2044c = ((AmbientCallbackProvider) context).getAmbientCallback();
        } else {
            Log.w("AmbientMode", "No callback provided - enabling only smart resume");
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2043b.c();
        if (this.f2044c != null) {
            this.f2043b.h();
        }
    }

    public final void onDestroy() {
        this.f2043b.d();
        super.onDestroy();
    }

    public final void onDetach() {
        this.f2043b = null;
        super.onDetach();
    }

    public final void onPause() {
        this.f2043b.e();
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        this.f2043b.f();
    }

    public final void onStop() {
        this.f2043b.g();
        super.onStop();
    }
}
