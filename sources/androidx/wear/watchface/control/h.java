package androidx.wear.watchface.control;

import androidx.wear.watchface.control.data.WallpaperInteractiveWatchFaceInstanceParams;
import i7.i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import n1.t;
import n1.t0;
import q7.k;
import r1.h0;
import r1.o;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, c> f2292a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f2293b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static b f2294c;

    /* renamed from: d  reason: collision with root package name */
    public static t0.c f2295d;

    public static final class a {
        public static void a(h0 h0Var) {
            synchronized (h.f2293b) {
                HashMap<String, c> hashMap = h.f2292a;
                if (!hashMap.containsKey(h0Var.f6709b)) {
                    hashMap.put(h0Var.f6709b, new c(h0Var));
                    h7.h hVar = h7.h.f4787a;
                } else {
                    throw new IllegalArgumentException(("Already have an InteractiveWatchFaceImpl with id " + h0Var.f6709b).toString());
                }
            }
        }

        public static void b(t tVar) {
            tVar.println("InteractiveInstanceManager instances:");
            tVar.b();
            b bVar = h.f2294c;
            if (bVar != null) {
                tVar.println("Pending WallpaperInteractiveWatchFaceInstance id " + bVar.f2296a.f2278f);
            }
            synchronized (h.f2293b) {
                for (Map.Entry<String, c> value : h.f2292a.entrySet()) {
                    ((c) value.getValue()).a(tVar);
                }
                h7.h hVar = h7.h.f4787a;
            }
            tVar.a();
        }

        public static h0 c() {
            T t8;
            synchronized (h.f2293b) {
                HashMap<String, c> hashMap = h.f2292a;
                if (hashMap.size() == 1) {
                    Set<Map.Entry<String, c>> entrySet = hashMap.entrySet();
                    k.d(entrySet, "instances.entries");
                    if (entrySet instanceof List) {
                        t8 = i.U((List) entrySet);
                    } else {
                        Iterator<T> it = entrySet.iterator();
                        if (it.hasNext()) {
                            t8 = it.next();
                        } else {
                            throw new NoSuchElementException("Collection is empty.");
                        }
                    }
                    h0 h0Var = ((c) ((Map.Entry) t8).getValue()).f2298a;
                    return h0Var;
                }
                h7.h hVar = h7.h.f4787a;
                return null;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            k3.j.n(r1, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x004d, code lost:
            r0 = r1.f6708a;
            q7.k.b(r0);
            r3 = r5.f2296a.a();
            q7.k.d(r3, "value.params.userStyle");
            r0.G(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0068, code lost:
            if (q7.k.a((java.lang.Object) null, r5.f2296a.f2284l) == false) goto L_0x006b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x006a, code lost:
            return r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x006b, code lost:
            r5 = "Existing instance has the resourceOnlyWatchFacePackageName of null, which is different from the argument watchFaceId of " + r5.f2296a.f2284l + '.';
            android.util.Log.e("InteractiveInstanceManager", r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x008c, code lost:
            throw new java.lang.IllegalStateException(r5);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static r1.h0 d(androidx.wear.watchface.control.h.b r5) {
            /*
                java.lang.Object r0 = androidx.wear.watchface.control.h.f2293b
                monitor-enter(r0)
                java.util.HashMap<java.lang.String, androidx.wear.watchface.control.h$c> r1 = androidx.wear.watchface.control.h.f2292a     // Catch:{ all -> 0x008d }
                androidx.wear.watchface.control.data.WallpaperInteractiveWatchFaceInstanceParams r2 = r5.f2296a     // Catch:{ all -> 0x008d }
                java.lang.String r2 = r2.f2278f     // Catch:{ all -> 0x008d }
                java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x008d }
                androidx.wear.watchface.control.h$c r1 = (androidx.wear.watchface.control.h.c) r1     // Catch:{ all -> 0x008d }
                r2 = 0
                if (r1 != 0) goto L_0x003c
                n1.t0$c r1 = androidx.wear.watchface.control.h.f2295d     // Catch:{ all -> 0x008d }
                if (r1 == 0) goto L_0x0025
                androidx.wear.watchface.control.h.f2295d = r2     // Catch:{ all -> 0x008d }
                c8.c r3 = r1.f5744d     // Catch:{ all -> 0x008d }
                n1.v0 r4 = new n1.v0     // Catch:{ all -> 0x008d }
                r4.<init>(r5, r1, r2)     // Catch:{ all -> 0x008d }
                r5 = 3
                k3.j.K(r3, r2, r4, r5)     // Catch:{ all -> 0x008d }
                monitor-exit(r0)
                return r2
            L_0x0025:
                v1.c r1 = new v1.c     // Catch:{ all -> 0x008d }
                java.lang.String r3 = "Set pendingWallpaperInteractiveWatchFaceInstance"
                r1.<init>(r3)     // Catch:{ all -> 0x008d }
                androidx.wear.watchface.control.h.f2294c = r5     // Catch:{ all -> 0x0035 }
                h7.h r5 = h7.h.f4787a     // Catch:{ all -> 0x0035 }
                k3.j.n(r1, r2)     // Catch:{ all -> 0x008d }
                monitor-exit(r0)
                return r2
            L_0x0035:
                r5 = move-exception
                throw r5     // Catch:{ all -> 0x0037 }
            L_0x0037:
                r2 = move-exception
                k3.j.n(r1, r5)     // Catch:{ all -> 0x008d }
                throw r2     // Catch:{ all -> 0x008d }
            L_0x003c:
                r1.h0 r3 = r1.f2298a     // Catch:{ all -> 0x008d }
                n1.t0$c r3 = r3.f6708a     // Catch:{ all -> 0x008d }
                n1.t0$c r4 = androidx.wear.watchface.control.h.f2295d     // Catch:{ all -> 0x008d }
                boolean r3 = q7.k.a(r3, r4)     // Catch:{ all -> 0x008d }
                if (r3 == 0) goto L_0x004a
                androidx.wear.watchface.control.h.f2295d = r2     // Catch:{ all -> 0x008d }
            L_0x004a:
                r1.h0 r1 = r1.f2298a     // Catch:{ all -> 0x008d }
                monitor-exit(r0)
                n1.t0$c r0 = r1.f6708a
                q7.k.b(r0)
                androidx.wear.watchface.control.data.WallpaperInteractiveWatchFaceInstanceParams r3 = r5.f2296a
                androidx.wear.watchface.style.data.UserStyleWireFormat r3 = r3.a()
                java.lang.String r4 = "value.params.userStyle"
                q7.k.d(r3, r4)
                r0.G(r3)
                androidx.wear.watchface.control.data.WallpaperInteractiveWatchFaceInstanceParams r0 = r5.f2296a
                java.lang.String r0 = r0.f2284l
                boolean r0 = q7.k.a(r2, r0)
                if (r0 == 0) goto L_0x006b
                return r1
            L_0x006b:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Existing instance has the resourceOnlyWatchFacePackageName of null, which is different from the argument watchFaceId of "
                r0.<init>(r1)
                androidx.wear.watchface.control.data.WallpaperInteractiveWatchFaceInstanceParams r5 = r5.f2296a
                java.lang.String r5 = r5.f2284l
                r0.append(r5)
                r5 = 46
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                java.lang.String r0 = "InteractiveInstanceManager"
                android.util.Log.e(r0, r5)
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>(r5)
                throw r0
            L_0x008d:
                r5 = move-exception
                monitor-exit(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.wear.watchface.control.h.a.d(androidx.wear.watchface.control.h$b):r1.h0");
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x000f  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x001c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static androidx.wear.watchface.control.h.b e(n1.t0.c r3) {
            /*
                java.lang.Object r0 = androidx.wear.watchface.control.h.f2293b
                monitor-enter(r0)
                n1.t0$c r1 = androidx.wear.watchface.control.h.f2295d     // Catch:{ all -> 0x0028 }
                if (r1 == 0) goto L_0x000c
                if (r3 != 0) goto L_0x000a
                goto L_0x000c
            L_0x000a:
                r1 = 0
                goto L_0x000d
            L_0x000c:
                r1 = 1
            L_0x000d:
                if (r1 == 0) goto L_0x001c
                androidx.wear.watchface.control.h$b r1 = androidx.wear.watchface.control.h.f2294c     // Catch:{ all -> 0x0028 }
                r2 = 0
                if (r1 != 0) goto L_0x0018
                androidx.wear.watchface.control.h.f2295d = r3     // Catch:{ all -> 0x0028 }
                monitor-exit(r0)
                return r2
            L_0x0018:
                androidx.wear.watchface.control.h.f2294c = r2     // Catch:{ all -> 0x0028 }
                monitor-exit(r0)
                return r1
            L_0x001c:
                java.lang.String r3 = "Already have a parameterlessEngine registered"
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0028 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0028 }
                r1.<init>(r3)     // Catch:{ all -> 0x0028 }
                throw r1     // Catch:{ all -> 0x0028 }
            L_0x0028:
                r3 = move-exception
                monitor-exit(r0)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.wear.watchface.control.h.a.e(n1.t0$c):androidx.wear.watchface.control.h$b");
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final WallpaperInteractiveWatchFaceInstanceParams f2296a;

        /* renamed from: b  reason: collision with root package name */
        public final r1.k f2297b;

        public b(WallpaperInteractiveWatchFaceInstanceParams wallpaperInteractiveWatchFaceInstanceParams, o oVar) {
            this.f2296a = wallpaperInteractiveWatchFaceInstanceParams;
            this.f2297b = oVar;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final h0 f2298a;

        /* renamed from: b  reason: collision with root package name */
        public int f2299b = 1;

        public c(h0 h0Var) {
            this.f2298a = h0Var;
        }

        public final void a(t tVar) {
            tVar.println("InteractiveInstanceManager:");
            tVar.b();
            StringBuilder sb = new StringBuilder("impl.instanceId=");
            h0 h0Var = this.f2298a;
            sb.append(h0Var.f6709b);
            tVar.println(sb.toString());
            tVar.println("refcount=" + this.f2299b);
            t0.c cVar = h0Var.f6708a;
            if (cVar != null) {
                cVar.u(tVar);
            }
            tVar.a();
        }
    }
}
