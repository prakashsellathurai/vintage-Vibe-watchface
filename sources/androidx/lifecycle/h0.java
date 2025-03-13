package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.l0;
import androidx.savedstate.a;
import b1.c;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import q7.k;

public final class h0 extends l0.d implements l0.b {

    /* renamed from: a  reason: collision with root package name */
    public final Application f1469a;

    /* renamed from: b  reason: collision with root package name */
    public final l0.a f1470b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f1471c;

    /* renamed from: d  reason: collision with root package name */
    public final m f1472d;
    public final a e;

    @SuppressLint({"LambdaLast"})
    public h0(Application application, c cVar, Bundle bundle) {
        l0.a aVar;
        k.e(cVar, "owner");
        this.e = cVar.getSavedStateRegistry();
        this.f1472d = cVar.getLifecycle();
        this.f1471c = bundle;
        this.f1469a = application;
        if (application != null) {
            if (l0.a.f1486c == null) {
                l0.a.f1486c = new l0.a(application);
            }
            aVar = l0.a.f1486c;
            k.b(aVar);
        } else {
            aVar = new l0.a((Application) null);
        }
        this.f1470b = aVar;
    }

    public final <T extends j0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final j0 b(Class cls, v0.c cVar) {
        l0.c cVar2 = l0.c.f1488a;
        m0 m0Var = m0.f1497a;
        LinkedHashMap linkedHashMap = cVar.f7831a;
        String str = (String) linkedHashMap.get(m0Var);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (linkedHashMap.get(e0.f1454a) != null && linkedHashMap.get(e0.f1455b) != null) {
            l0.a aVar = l0.a.f1486c;
            Application application = (Application) linkedHashMap.get(k0.f1482a);
            boolean isAssignableFrom = a.class.isAssignableFrom(cls);
            Constructor<T> a9 = i0.a(cls, (!isAssignableFrom || application == null) ? i0.f1478b : i0.f1477a);
            if (a9 == null) {
                return this.f1470b.b(cls, cVar);
            }
            if (!isAssignableFrom || application == null) {
                return i0.b(cls, a9, e0.a(cVar));
            }
            return i0.b(cls, a9, application, e0.a(cVar));
        } else if (this.f1472d != null) {
            return d(cls, str);
        } else {
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
    }

    public final void c(j0 j0Var) {
        m mVar = this.f1472d;
        if (mVar != null) {
            a aVar = this.e;
            k.b(aVar);
            l.a(j0Var, aVar, mVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: androidx.lifecycle.SavedStateHandleController} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: androidx.lifecycle.SavedStateHandleController} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: androidx.lifecycle.SavedStateHandleController} */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008b  */
    public final androidx.lifecycle.j0 d(java.lang.Class r10, java.lang.String r11) {
        /*
            r9 = this;
            androidx.lifecycle.m r0 = r9.f1472d
            if (r0 == 0) goto L_0x00b5
            java.lang.Class<androidx.lifecycle.a> r1 = androidx.lifecycle.a.class
            boolean r1 = r1.isAssignableFrom(r10)
            if (r1 == 0) goto L_0x0013
            android.app.Application r2 = r9.f1469a
            if (r2 == 0) goto L_0x0013
            java.util.List<java.lang.Class<?>> r2 = androidx.lifecycle.i0.f1477a
            goto L_0x0015
        L_0x0013:
            java.util.List<java.lang.Class<?>> r2 = androidx.lifecycle.i0.f1478b
        L_0x0015:
            java.lang.reflect.Constructor r2 = androidx.lifecycle.i0.a(r10, r2)
            if (r2 != 0) goto L_0x003b
            android.app.Application r11 = r9.f1469a
            if (r11 == 0) goto L_0x0026
            androidx.lifecycle.l0$a r9 = r9.f1470b
            androidx.lifecycle.j0 r9 = r9.a(r10)
            goto L_0x003a
        L_0x0026:
            androidx.lifecycle.l0$c r9 = androidx.lifecycle.l0.c.f1488a
            if (r9 != 0) goto L_0x0031
            androidx.lifecycle.l0$c r9 = new androidx.lifecycle.l0$c
            r9.<init>()
            androidx.lifecycle.l0.c.f1488a = r9
        L_0x0031:
            androidx.lifecycle.l0$c r9 = androidx.lifecycle.l0.c.f1488a
            q7.k.b(r9)
            androidx.lifecycle.j0 r9 = r9.a(r10)
        L_0x003a:
            return r9
        L_0x003b:
            androidx.savedstate.a r3 = r9.e
            q7.k.b(r3)
            android.os.Bundle r4 = r9.f1471c
            android.os.Bundle r5 = r3.a(r11)
            java.lang.Class<? extends java.lang.Object>[] r6 = androidx.lifecycle.d0.f1442f
            androidx.lifecycle.d0 r4 = androidx.lifecycle.d0.a.a(r5, r4)
            androidx.lifecycle.SavedStateHandleController r5 = new androidx.lifecycle.SavedStateHandleController
            r5.<init>(r11, r4)
            r5.d(r0, r3)
            r11 = r0
            androidx.lifecycle.s r11 = (androidx.lifecycle.s) r11
            androidx.lifecycle.m$b r11 = r11.f1503d
            androidx.lifecycle.m$b r6 = androidx.lifecycle.m.b.f1492g
            r7 = 1
            r8 = 0
            if (r11 == r6) goto L_0x0076
            androidx.lifecycle.m$b r6 = androidx.lifecycle.m.b.f1494i
            int r11 = r11.compareTo(r6)
            if (r11 < 0) goto L_0x0069
            r11 = r7
            goto L_0x006a
        L_0x0069:
            r11 = r8
        L_0x006a:
            if (r11 == 0) goto L_0x006d
            goto L_0x0076
        L_0x006d:
            androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1 r11 = new androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
            r11.<init>(r0, r3)
            r0.a(r11)
            goto L_0x0079
        L_0x0076:
            r3.d()
        L_0x0079:
            if (r1 == 0) goto L_0x008b
            android.app.Application r9 = r9.f1469a
            if (r9 == 0) goto L_0x008b
            r11 = 2
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r11[r8] = r9
            r11[r7] = r4
            androidx.lifecycle.j0 r9 = androidx.lifecycle.i0.b(r10, r2, r11)
            goto L_0x0093
        L_0x008b:
            java.lang.Object[] r9 = new java.lang.Object[r7]
            r9[r8] = r4
            androidx.lifecycle.j0 r9 = androidx.lifecycle.i0.b(r10, r2, r9)
        L_0x0093:
            java.lang.String r10 = "androidx.lifecycle.savedstate.vm.tag"
            java.util.HashMap r11 = r9.f1479a
            monitor-enter(r11)
            java.util.HashMap r0 = r9.f1479a     // Catch:{ all -> 0x00b2 }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ all -> 0x00b2 }
            if (r0 != 0) goto L_0x00a5
            java.util.HashMap r1 = r9.f1479a     // Catch:{ all -> 0x00b2 }
            r1.put(r10, r5)     // Catch:{ all -> 0x00b2 }
        L_0x00a5:
            monitor-exit(r11)     // Catch:{ all -> 0x00b2 }
            if (r0 != 0) goto L_0x00a9
            goto L_0x00aa
        L_0x00a9:
            r5 = r0
        L_0x00aa:
            boolean r10 = r9.f1481c
            if (r10 == 0) goto L_0x00b1
            androidx.lifecycle.j0.a(r5)
        L_0x00b1:
            return r9
        L_0x00b2:
            r9 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x00b2 }
            throw r9
        L_0x00b5:
            java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
            java.lang.String r10 = "SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras)."
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.h0.d(java.lang.Class, java.lang.String):androidx.lifecycle.j0");
    }
}
