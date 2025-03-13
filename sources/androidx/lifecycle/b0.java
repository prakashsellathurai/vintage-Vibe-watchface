package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import androidx.lifecycle.m;
import q7.k;

public final class b0 extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f1430a = 0;

    public static final class a {
        public static void a(Activity activity, m.a aVar) {
            k.e(activity, "activity");
            k.e(aVar, "event");
            if (activity instanceof t) {
                ((t) activity).getLifecycle().e(aVar);
            } else if (activity instanceof r) {
                m lifecycle = ((r) activity).getLifecycle();
                if (lifecycle instanceof s) {
                    ((s) lifecycle).e(aVar);
                }
            }
        }
    }

    public static final class b implements Application.ActivityLifecycleCallbacks {
        public static final a Companion = new a();

        public static final class a {
        }

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            k.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new b());
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            k.e(activity, "activity");
        }

        public void onActivityDestroyed(Activity activity) {
            k.e(activity, "activity");
        }

        public void onActivityPaused(Activity activity) {
            k.e(activity, "activity");
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            k.e(activity, "activity");
            int i8 = b0.f1430a;
            a.a(activity, m.a.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            k.e(activity, "activity");
            int i8 = b0.f1430a;
            a.a(activity, m.a.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            k.e(activity, "activity");
            int i8 = b0.f1430a;
            a.a(activity, m.a.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            k.e(activity, "activity");
            int i8 = b0.f1430a;
            a.a(activity, m.a.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            k.e(activity, "activity");
            int i8 = b0.f1430a;
            a.a(activity, m.a.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            k.e(activity, "activity");
            int i8 = b0.f1430a;
            a.a(activity, m.a.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
            k.e(activity, "activity");
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            k.e(activity, "activity");
            k.e(bundle, "bundle");
        }

        public void onActivityStarted(Activity activity) {
            k.e(activity, "activity");
        }

        public void onActivityStopped(Activity activity) {
            k.e(activity, "activity");
        }
    }

    public static final void a(Activity activity) {
        k.e(activity, "activity");
        b.Companion.getClass();
        activity.registerActivityLifecycleCallbacks(new b());
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new b0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public final void onDestroy() {
        super.onDestroy();
    }

    public final void onPause() {
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
    }

    public final void onStart() {
        super.onStart();
    }

    public final void onStop() {
        super.onStop();
    }
}
