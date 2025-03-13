package n6;

import android.util.Log;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import k6.d;

public final class h {
    public static final HashMap e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public static final HashMap f5964f = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f5965a;

    /* renamed from: b  reason: collision with root package name */
    public final b f5966b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5967c;

    /* renamed from: d  reason: collision with root package name */
    public int f5968d = 0;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f5969a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5970b = 1000;

        public a(int i8) {
            this.f5969a = i8;
        }
    }

    public enum b {
        ;

        /* access modifiers changed from: public */
        b() {
        }
    }

    public h(int i8, int i9) {
        b bVar = b.f5971f;
        this.f5966b = bVar;
        this.f5967c = i9;
        this.f5965a = Executors.newFixedThreadPool(i8);
    }

    public static void a(b bVar) {
        HashMap hashMap = f5964f;
        h hVar = (h) hashMap.get(bVar);
        if (hVar != null) {
            ExecutorService executorService = hVar.f5965a;
            if (!executorService.isShutdown()) {
                executorService.shutdownNow();
            }
            hashMap.remove(bVar);
        }
    }

    public static h b() {
        b bVar = b.f5971f;
        HashMap hashMap = f5964f;
        if (!hashMap.containsKey(bVar)) {
            a aVar = (a) e.get(bVar);
            if (aVar != null) {
                hashMap.put(bVar, new h(aVar.f5969a, aVar.f5970b));
            } else {
                Log.e("DWF:ThreadedTask", "No configuration for Multimedia, using default config.");
                hashMap.put(bVar, new h(1, 1000));
            }
        }
        return (h) hashMap.get(bVar);
    }

    public final void c(Runnable runnable, Runnable runnable2) {
        this.f5968d++;
        d dVar = new d(this, runnable, runnable2, 1);
        ExecutorService executorService = this.f5965a;
        if (executorService == null || executorService.isShutdown()) {
            Log.e("DWF:ThreadedTask", "Not initialized or shutdown. skipping the task.");
        } else {
            executorService.execute(dVar);
        }
        if (this.f5968d > this.f5967c) {
            Log.w("DWF:ThreadedTask", "Too many requested tasks! (" + this.f5968d + ") reset threaded task.");
            a(this.f5966b);
        }
    }
}
