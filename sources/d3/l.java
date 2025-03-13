package d3;

import g3.c;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import k3.k;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4024a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4025b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f4026c;

    /* renamed from: d  reason: collision with root package name */
    public AbstractCollection f4027d;

    public l(int i8) {
        this.f4024a = i8;
        if (i8 != 1) {
            this.f4026c = Collections.newSetFromMap(new WeakHashMap());
            this.f4027d = new ArrayList();
            return;
        }
        this.f4026c = new Object();
    }

    public final boolean a(c cVar) {
        boolean z8 = true;
        if (cVar == null) {
            return true;
        }
        boolean remove = ((Set) this.f4026c).remove(cVar);
        if (!((List) this.f4027d).remove(cVar) && !remove) {
            z8 = false;
        }
        if (z8) {
            cVar.clear();
        }
        return z8;
    }

    public final void b() {
        Iterator it = k.d((Set) this.f4026c).iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (!cVar.j() && !cVar.c()) {
                cVar.clear();
                if (!this.f4025b) {
                    cVar.g();
                } else {
                    ((List) this.f4027d).add(cVar);
                }
            }
        }
    }

    public final void c() {
        this.f4025b = false;
        Iterator it = k.d((Set) this.f4026c).iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (!cVar.j() && !cVar.isRunning()) {
                cVar.g();
            }
        }
        ((List) this.f4027d).clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        r1 = r2.f4026c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = (d4.g) ((java.util.Queue) r2.f4027d).poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        if (r0 != null) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0021, code lost:
        r2.f4025b = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0024, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0026, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0027, code lost:
        r0.a(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(d4.h r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f4026c
            monitor-enter(r0)
            java.util.AbstractCollection r1 = r2.f4027d     // Catch:{ all -> 0x0030 }
            java.util.Queue r1 = (java.util.Queue) r1     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x002e
            boolean r1 = r2.f4025b     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x000e
            goto L_0x002e
        L_0x000e:
            r1 = 1
            r2.f4025b = r1     // Catch:{ all -> 0x0030 }
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
        L_0x0012:
            java.lang.Object r1 = r2.f4026c
            monitor-enter(r1)
            java.util.AbstractCollection r0 = r2.f4027d     // Catch:{ all -> 0x002b }
            java.util.Queue r0 = (java.util.Queue) r0     // Catch:{ all -> 0x002b }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x002b }
            d4.g r0 = (d4.g) r0     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0026
            r3 = 0
            r2.f4025b = r3     // Catch:{ all -> 0x002b }
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            return
        L_0x0026:
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            r0.a(r3)
            goto L_0x0012
        L_0x002b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            throw r2
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0030:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.l.d(d4.h):void");
    }

    public final String toString() {
        switch (this.f4024a) {
            case 0:
                return super.toString() + "{numRequests=" + ((Set) this.f4026c).size() + ", isPaused=" + this.f4025b + "}";
            default:
                return super.toString();
        }
    }
}
