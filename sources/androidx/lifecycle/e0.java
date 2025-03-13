package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.d0;
import androidx.lifecycle.l0;
import androidx.savedstate.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import q7.f;
import q7.k;
import q7.l;
import q7.q;
import v0.a;

public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final b f1454a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final c f1455b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final a f1456c = new a();

    public static final class a {
    }

    public static final class b {
    }

    public static final class c {
    }

    public static final class d extends l implements p7.l<v0.a, g0> {

        /* renamed from: f  reason: collision with root package name */
        public static final d f1457f = new d();

        public d() {
            super(1);
        }

        public final Object invoke(Object obj) {
            k.e((v0.a) obj, "$this$initializer");
            return new g0();
        }
    }

    public static final d0 a(v0.c cVar) {
        b bVar = f1454a;
        LinkedHashMap linkedHashMap = cVar.f7831a;
        b1.c cVar2 = (b1.c) linkedHashMap.get(bVar);
        if (cVar2 != null) {
            o0 o0Var = (o0) linkedHashMap.get(f1455b);
            if (o0Var != null) {
                Bundle bundle = (Bundle) linkedHashMap.get(f1456c);
                l0.c cVar3 = l0.c.f1488a;
                String str = (String) linkedHashMap.get(m0.f1497a);
                if (str != null) {
                    a.b b9 = cVar2.getSavedStateRegistry().b();
                    f0 f0Var = b9 instanceof f0 ? (f0) b9 : null;
                    if (f0Var != null) {
                        LinkedHashMap linkedHashMap2 = b(o0Var).f1468d;
                        d0 d0Var = (d0) linkedHashMap2.get(str);
                        if (d0Var != null) {
                            return d0Var;
                        }
                        Class<? extends Object>[] clsArr = d0.f1442f;
                        boolean z8 = true;
                        if (!f0Var.f1460b) {
                            f0Var.f1461c = f0Var.f1459a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                            f0Var.f1460b = true;
                            g0 g0Var = (g0) f0Var.f1462d.getValue();
                        }
                        Bundle bundle2 = f0Var.f1461c;
                        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
                        Bundle bundle4 = f0Var.f1461c;
                        if (bundle4 != null) {
                            bundle4.remove(str);
                        }
                        Bundle bundle5 = f0Var.f1461c;
                        if (bundle5 == null || !bundle5.isEmpty()) {
                            z8 = false;
                        }
                        if (z8) {
                            f0Var.f1461c = null;
                        }
                        d0 a9 = d0.a.a(bundle3, bundle);
                        linkedHashMap2.put(str, a9);
                        return a9;
                    }
                    throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    public static final g0 b(o0 o0Var) {
        k.e(o0Var, "<this>");
        ArrayList arrayList = new ArrayList();
        Class<g0> cls = g0.class;
        f a9 = q.a(cls);
        d dVar = d.f1457f;
        k.e(dVar, "initializer");
        Class<?> a10 = a9.a();
        k.c(a10, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        arrayList.add(new v0.d(a10, dVar));
        v0.d[] dVarArr = (v0.d[]) arrayList.toArray(new v0.d[0]);
        return (g0) new l0(o0Var.getViewModelStore(), new v0.b((v0.d[]) Arrays.copyOf(dVarArr, dVarArr.length)), o0Var instanceof k ? ((k) o0Var).getDefaultViewModelCreationExtras() : a.C0142a.f7832b).b(cls, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
