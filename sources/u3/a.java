package u3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.ServiceConnection;
import androidx.annotation.RecentlyNonNull;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import r3.t0;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f7732b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static volatile a f7733c;
    @RecentlyNonNull

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<ServiceConnection, ServiceConnection> f7734a = new ConcurrentHashMap<>();

    @SuppressLint({"UntrackedBindService"})
    public final void a(@RecentlyNonNull Context context, @RecentlyNonNull ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof t0)) {
            ConcurrentHashMap<ServiceConnection, ServiceConnection> concurrentHashMap = this.f7734a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService(concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }
}
