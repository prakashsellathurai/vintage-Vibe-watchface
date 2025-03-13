package androidx.wear.ambient;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.a;
import androidx.fragment.app.c0;
import androidx.fragment.app.n;
import androidx.fragment.app.s;
import androidx.wear.ambient.AmbientDelegate;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import v0.a;

public final class AmbientModeSupport extends n {
    public static final String EXTRA_BURN_IN_PROTECTION = "com.google.android.wearable.compat.extra.BURN_IN_PROTECTION";
    public static final String EXTRA_LOWBIT_AMBIENT = "com.google.android.wearable.compat.extra.LOWBIT_AMBIENT";
    public static final String FRAGMENT_TAG = "android.support.wearable.ambient.AmbientMode";
    public final AnonymousClass1 Z = new AmbientDelegate.AmbientCallback() {
        public final void onAmbientOffloadInvalidated() {
            AmbientCallback ambientCallback = AmbientModeSupport.this.f2049b0;
            if (ambientCallback != null) {
                ambientCallback.onAmbientOffloadInvalidated();
            }
        }

        public final void onEnterAmbient(Bundle bundle) {
            AmbientCallback ambientCallback = AmbientModeSupport.this.f2049b0;
            if (ambientCallback != null) {
                ambientCallback.onEnterAmbient(bundle);
            }
        }

        public final void onExitAmbient() {
            AmbientCallback ambientCallback = AmbientModeSupport.this.f2049b0;
            if (ambientCallback != null) {
                ambientCallback.onExitAmbient();
            }
        }

        public final void onUpdateAmbient() {
            AmbientCallback ambientCallback = AmbientModeSupport.this.f2049b0;
            if (ambientCallback != null) {
                ambientCallback.onUpdateAmbient();
            }
        }
    };

    /* renamed from: a0  reason: collision with root package name */
    public AmbientDelegate f2048a0;

    /* renamed from: b0  reason: collision with root package name */
    public AmbientCallback f2049b0;

    /* renamed from: c0  reason: collision with root package name */
    public final AmbientController f2050c0 = new AmbientController();

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
            AmbientDelegate ambientDelegate = AmbientModeSupport.this.f2048a0;
            if (ambientDelegate == null) {
                return false;
            }
            return ambientDelegate.b();
        }

        public final void setAmbientOffloadEnabled(boolean z8) {
            AmbientDelegate ambientDelegate = AmbientModeSupport.this.f2048a0;
            if (ambientDelegate != null) {
                ambientDelegate.setAmbientOffloadEnabled(z8);
            }
        }

        public final void setAutoResumeEnabled(boolean z8) {
            AmbientDelegate ambientDelegate = AmbientModeSupport.this.f2048a0;
            if (ambientDelegate != null) {
                ambientDelegate.setAutoResumeEnabled(z8);
            }
        }
    }

    public static <T extends s> AmbientController attach(T t8) {
        c0 h8 = t8.h();
        AmbientModeSupport ambientModeSupport = (AmbientModeSupport) h8.D("android.support.wearable.ambient.AmbientMode");
        if (ambientModeSupport == null) {
            ambientModeSupport = new AmbientModeSupport();
            a aVar = new a(h8);
            aVar.f(0, ambientModeSupport, "android.support.wearable.ambient.AmbientMode", 1);
            aVar.d(false);
        }
        return ambientModeSupport.f2050c0;
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        AmbientDelegate ambientDelegate = this.f2048a0;
        if (ambientDelegate != null) {
            ambientDelegate.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final v0.a getDefaultViewModelCreationExtras() {
        return a.C0142a.f7832b;
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f2048a0 = new AmbientDelegate(getActivity(), new WearableControllerProvider(), this.Z);
        if (context instanceof AmbientCallbackProvider) {
            this.f2049b0 = ((AmbientCallbackProvider) context).getAmbientCallback();
        } else {
            Log.w("AmbientModeSupport", "No callback provided - enabling only smart resume");
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2048a0.c();
        if (this.f2049b0 != null) {
            this.f2048a0.h();
        }
    }

    public final void onDestroy() {
        this.f2048a0.d();
        this.F = true;
    }

    public final void onDetach() {
        this.f2048a0 = null;
        this.F = true;
    }

    public final void onPause() {
        this.f2048a0.e();
        this.F = true;
    }

    public final void onResume() {
        this.F = true;
        this.f2048a0.f();
    }

    public final void onStop() {
        this.f2048a0.g();
        this.F = true;
    }
}
