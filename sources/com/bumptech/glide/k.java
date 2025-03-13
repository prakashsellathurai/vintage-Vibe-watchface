package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.Log;
import b3.c;
import d3.b;
import d3.d;
import d3.g;
import d3.h;
import d3.l;
import d3.n;
import g3.e;
import g3.f;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public final class k implements ComponentCallbacks2, g {

    /* renamed from: k  reason: collision with root package name */
    public static final f f2958k;

    /* renamed from: a  reason: collision with root package name */
    public final b f2959a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f2960b;

    /* renamed from: c  reason: collision with root package name */
    public final d3.f f2961c;

    /* renamed from: d  reason: collision with root package name */
    public final l f2962d;
    public final d3.k e;

    /* renamed from: f  reason: collision with root package name */
    public final n f2963f = new n();

    /* renamed from: g  reason: collision with root package name */
    public final Runnable f2964g;

    /* renamed from: h  reason: collision with root package name */
    public final d3.b f2965h;

    /* renamed from: i  reason: collision with root package name */
    public final CopyOnWriteArrayList<e<Object>> f2966i;

    /* renamed from: j  reason: collision with root package name */
    public f f2967j;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            k kVar = k.this;
            kVar.f2961c.a(kVar);
        }
    }

    public class b implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public final l f2969a;

        public b(l lVar) {
            this.f2969a = lVar;
        }
    }

    static {
        f fVar = (f) new f().c(Bitmap.class);
        fVar.y = true;
        f2958k = fVar;
        ((f) new f().c(c.class)).y = true;
        f fVar2 = (f) ((f) ((f) new f().d(r2.l.f6824b)).g()).j(true);
    }

    public k(b bVar, d3.f fVar, d3.k kVar, Context context) {
        f fVar2;
        boolean z8 = false;
        l lVar = new l(0);
        d3.c cVar = bVar.f2918g;
        a aVar = new a();
        this.f2964g = aVar;
        this.f2959a = bVar;
        this.f2961c = fVar;
        this.e = kVar;
        this.f2962d = lVar;
        this.f2960b = context;
        Context applicationContext = context.getApplicationContext();
        b bVar2 = new b(lVar);
        ((d3.e) cVar).getClass();
        boolean z9 = a0.a.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        Log.isLoggable("ConnectivityMonitor", 3);
        d3.b dVar = z9 ? new d(applicationContext, bVar2) : new h();
        this.f2965h = dVar;
        char[] cArr = k3.k.f5169a;
        if (!(Looper.myLooper() == Looper.getMainLooper() ? true : z8)) {
            k3.k.e().post(aVar);
        } else {
            fVar.a(this);
        }
        fVar.a(dVar);
        this.f2966i = new CopyOnWriteArrayList<>(bVar.f2915c.f2924d);
        f fVar3 = bVar.f2915c;
        synchronized (fVar3) {
            if (fVar3.f2928i == null) {
                ((c) fVar3.f2923c).getClass();
                f fVar4 = new f();
                fVar4.y = true;
                fVar3.f2928i = fVar4;
            }
            fVar2 = fVar3.f2928i;
        }
        synchronized (this) {
            f fVar5 = (f) fVar2.clone();
            if (fVar5.y) {
                if (!fVar5.A) {
                    throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
                }
            }
            fVar5.A = true;
            fVar5.y = true;
            this.f2967j = fVar5;
        }
        synchronized (bVar.f2919h) {
            if (!bVar.f2919h.contains(this)) {
                bVar.f2919h.add(this);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    public final synchronized void a() {
        this.f2963f.a();
        Iterator it = k3.k.d(this.f2963f.f4034a).iterator();
        while (it.hasNext()) {
            l((h3.c) it.next());
        }
        this.f2963f.f4034a.clear();
        l lVar = this.f2962d;
        Iterator it2 = k3.k.d((Set) lVar.f4026c).iterator();
        while (it2.hasNext()) {
            lVar.a((g3.c) it2.next());
        }
        ((List) lVar.f4027d).clear();
        this.f2961c.c(this);
        this.f2961c.c(this.f2965h);
        k3.k.e().removeCallbacks(this.f2964g);
        this.f2959a.c(this);
    }

    public final synchronized void d() {
        m();
        this.f2963f.d();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void j() {
        /*
            r1 = this;
            monitor-enter(r1)
            monitor-enter(r1)     // Catch:{ all -> 0x000f }
            d3.l r0 = r1.f2962d     // Catch:{ all -> 0x0011 }
            r0.c()     // Catch:{ all -> 0x0011 }
            monitor-exit(r1)     // Catch:{ all -> 0x000f }
            d3.n r0 = r1.f2963f     // Catch:{ all -> 0x000f }
            r0.j()     // Catch:{ all -> 0x000f }
            monitor-exit(r1)
            return
        L_0x000f:
            r0 = move-exception
            goto L_0x0014
        L_0x0011:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x000f }
            throw r0     // Catch:{ all -> 0x000f }
        L_0x0014:
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.k.j():void");
    }

    public final void l(h3.c<?> cVar) {
        boolean z8;
        if (cVar != null) {
            boolean n8 = n(cVar);
            g3.c h8 = cVar.h();
            if (!n8) {
                b bVar = this.f2959a;
                synchronized (bVar.f2919h) {
                    Iterator it = bVar.f2919h.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((k) it.next()).n(cVar)) {
                                z8 = true;
                                break;
                            }
                        } else {
                            z8 = false;
                            break;
                        }
                    }
                }
                if (!z8 && h8 != null) {
                    cVar.c((g3.c) null);
                    h8.clear();
                }
            }
        }
    }

    public final synchronized void m() {
        l lVar = this.f2962d;
        lVar.f4025b = true;
        Iterator it = k3.k.d((Set) lVar.f4026c).iterator();
        while (it.hasNext()) {
            g3.c cVar = (g3.c) it.next();
            if (cVar.isRunning()) {
                cVar.f();
                ((List) lVar.f4027d).add(cVar);
            }
        }
    }

    public final synchronized boolean n(h3.c<?> cVar) {
        g3.c h8 = cVar.h();
        if (h8 == null) {
            return true;
        }
        if (!this.f2962d.a(h8)) {
            return false;
        }
        this.f2963f.f4034a.remove(cVar);
        cVar.c((g3.c) null);
        return true;
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i8) {
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f2962d + ", treeNode=" + this.e + "}";
    }
}
