package t1;

import android.os.IBinder;
import h7.f;
import java.util.HashMap;
import java.util.HashSet;

public final class l extends o {

    /* renamed from: f  reason: collision with root package name */
    public static final f f7438f = a1.a.z(b.f7443f);

    /* renamed from: a  reason: collision with root package name */
    public final Object f7439a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public int f7440b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<Integer, n> f7441c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<Integer, IBinder.DeathRecipient> f7442d = new HashMap<>();
    public final HashSet<a> e = new HashSet<>();

    public static abstract class a {
        public abstract void a();
    }

    public static final class b extends q7.l implements p7.a<l> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f7443f = new b();

        public b() {
            super(0);
        }

        public final Object invoke() {
            return new l();
        }
    }

    public static final class c {
        public static l a() {
            return (l) l.f7438f.getValue();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0025, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0026, code lost:
        android.util.Log.e("EditorService", "closeEditor failed", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        throw r3;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r3 = this;
            java.lang.String r0 = "EditorService"
            java.lang.Object r1 = r3.f7439a     // Catch:{ all -> 0x0025 }
            monitor-enter(r1)     // Catch:{ all -> 0x0025 }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x0022 }
            java.util.HashSet<t1.l$a> r3 = r3.e     // Catch:{ all -> 0x0022 }
            r2.<init>(r3)     // Catch:{ all -> 0x0022 }
            monitor-exit(r1)     // Catch:{ all -> 0x0025 }
            java.util.Iterator r3 = r2.iterator()     // Catch:{ all -> 0x0025 }
        L_0x0011:
            boolean r1 = r3.hasNext()     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x0021
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x0025 }
            t1.l$a r1 = (t1.l.a) r1     // Catch:{ all -> 0x0025 }
            r1.a()     // Catch:{ all -> 0x0025 }
            goto L_0x0011
        L_0x0021:
            return
        L_0x0022:
            r3 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0025 }
            throw r3     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r3 = move-exception
            java.lang.String r1 = "closeEditor failed"
            android.util.Log.e(r0, r1, r3)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.l.c():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        android.util.Log.e("EditorService", "unregisterObserver failed", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0053, code lost:
        throw r5;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(int r6) {
        /*
            r5 = this;
            java.lang.String r0 = "EditorService"
            java.lang.Object r1 = r5.f7439a     // Catch:{ all -> 0x004d }
            monitor-enter(r1)     // Catch:{ all -> 0x004d }
            java.util.HashMap<java.lang.Integer, android.os.IBinder$DeathRecipient> r2 = r5.f7442d     // Catch:{ all -> 0x004a }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x004a }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x004a }
            android.os.IBinder$DeathRecipient r2 = (android.os.IBinder.DeathRecipient) r2     // Catch:{ all -> 0x004a }
            if (r2 == 0) goto L_0x0034
            java.util.HashMap<java.lang.Integer, t1.n> r3 = r5.f7441c     // Catch:{ NoSuchElementException -> 0x002c }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)     // Catch:{ NoSuchElementException -> 0x002c }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ NoSuchElementException -> 0x002c }
            t1.n r3 = (t1.n) r3     // Catch:{ NoSuchElementException -> 0x002c }
            if (r3 == 0) goto L_0x0034
            android.os.IBinder r3 = r3.asBinder()     // Catch:{ NoSuchElementException -> 0x002c }
            if (r3 == 0) goto L_0x0034
            r4 = 0
            r3.unlinkToDeath(r2, r4)     // Catch:{ NoSuchElementException -> 0x002c }
            goto L_0x0034
        L_0x002c:
            r2 = move-exception
            java.lang.String r3 = "EditorService"
            java.lang.String r4 = "unregisterObserver encountered"
            android.util.Log.w(r3, r4, r2)     // Catch:{ all -> 0x004a }
        L_0x0034:
            java.util.HashMap<java.lang.Integer, t1.n> r2 = r5.f7441c     // Catch:{ all -> 0x004a }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x004a }
            r2.remove(r3)     // Catch:{ all -> 0x004a }
            java.util.HashMap<java.lang.Integer, android.os.IBinder$DeathRecipient> r5 = r5.f7442d     // Catch:{ all -> 0x004a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x004a }
            r5.remove(r6)     // Catch:{ all -> 0x004a }
            h7.h r5 = h7.h.f4787a     // Catch:{ all -> 0x004a }
            monitor-exit(r1)     // Catch:{ all -> 0x004d }
            return
        L_0x004a:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x004d }
            throw r5     // Catch:{ all -> 0x004d }
        L_0x004d:
            r5 = move-exception
            java.lang.String r6 = "unregisterObserver failed"
            android.util.Log.e(r0, r6, r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.l.h(int):void");
    }
}
