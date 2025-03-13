package q3;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

public final class b implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final b e = new b();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f6528a = new AtomicBoolean();

    /* renamed from: b  reason: collision with root package name */
    public final AtomicBoolean f6529b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<a> f6530c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public boolean f6531d = false;

    public interface a {
        void a(boolean z8);
    }

    public final void a(boolean z8) {
        synchronized (e) {
            Iterator<a> it = this.f6530c.iterator();
            while (it.hasNext()) {
                it.next().a(z8);
            }
        }
    }

    public final void onActivityCreated(@RecentlyNonNull Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f6528a.compareAndSet(true, false);
        this.f6529b.set(true);
        if (compareAndSet) {
            a(false);
        }
    }

    public final void onActivityDestroyed(@RecentlyNonNull Activity activity) {
    }

    public final void onActivityPaused(@RecentlyNonNull Activity activity) {
    }

    public final void onActivityResumed(@RecentlyNonNull Activity activity) {
        boolean compareAndSet = this.f6528a.compareAndSet(true, false);
        this.f6529b.set(true);
        if (compareAndSet) {
            a(false);
        }
    }

    public final void onActivitySaveInstanceState(@RecentlyNonNull Activity activity, @RecentlyNonNull Bundle bundle) {
    }

    public final void onActivityStarted(@RecentlyNonNull Activity activity) {
    }

    public final void onActivityStopped(@RecentlyNonNull Activity activity) {
    }

    public final void onConfigurationChanged(@RecentlyNonNull Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i8) {
        if (i8 == 20 && this.f6528a.compareAndSet(false, true)) {
            this.f6529b.set(true);
            a(true);
        }
    }
}
