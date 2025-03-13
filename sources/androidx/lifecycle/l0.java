package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import q7.k;
import v0.a;

public final class l0 {

    /* renamed from: a  reason: collision with root package name */
    public final n0 f1483a;

    /* renamed from: b  reason: collision with root package name */
    public final b f1484b;

    /* renamed from: c  reason: collision with root package name */
    public final v0.a f1485c;

    public static class a extends c {

        /* renamed from: c  reason: collision with root package name */
        public static a f1486c;

        /* renamed from: b  reason: collision with root package name */
        public final Application f1487b;

        public a(Application application) {
            this.f1487b = application;
        }

        public final <T extends j0> T a(Class<T> cls) {
            Application application = this.f1487b;
            if (application != null) {
                return c(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        public final j0 b(Class cls, v0.c cVar) {
            if (this.f1487b != null) {
                return a(cls);
            }
            Application application = (Application) cVar.f7831a.get(k0.f1482a);
            if (application != null) {
                return c(cls, application);
            }
            if (!a.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        public final <T extends j0> T c(Class<T> cls, Application application) {
            if (!a.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            try {
                T t8 = (j0) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{application});
                k.d(t8, "{\n                try {\n…          }\n            }");
                return t8;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (IllegalAccessException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            } catch (InstantiationException e9) {
                throw new RuntimeException("Cannot create an instance of " + cls, e9);
            } catch (InvocationTargetException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            }
        }
    }

    public interface b {
        <T extends j0> T a(Class<T> cls) {
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }

        j0 b(Class cls, v0.c cVar) {
            return a(cls);
        }
    }

    public static class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public static c f1488a;

        public <T extends j0> T a(Class<T> cls) {
            try {
                T newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                k.d(newInstance, "{\n                modelC…wInstance()\n            }");
                return (j0) newInstance;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            } catch (IllegalAccessException e9) {
                throw new RuntimeException("Cannot create an instance of " + cls, e9);
            }
        }
    }

    public static class d {
        public void c(j0 j0Var) {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l0(androidx.fragment.app.s r3) {
        /*
            r2 = this;
            java.lang.String r0 = "owner"
            q7.k.e(r3, r0)
            androidx.lifecycle.n0 r0 = r3.getViewModelStore()
            androidx.lifecycle.l0$a r1 = androidx.lifecycle.l0.a.f1486c
            androidx.lifecycle.l0$b r1 = r3.getDefaultViewModelProviderFactory()
            v0.a r3 = r3.getDefaultViewModelCreationExtras()
            r2.<init>(r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.l0.<init>(androidx.fragment.app.s):void");
    }

    public l0(n0 n0Var, b bVar, v0.a aVar) {
        k.e(n0Var, "store");
        k.e(bVar, "factory");
        k.e(aVar, "defaultCreationExtras");
        this.f1483a = n0Var;
        this.f1484b = bVar;
        this.f1485c = aVar;
    }

    public final <T extends j0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final j0 b(Class cls, String str) {
        j0 j0Var;
        k.e(str, "key");
        n0 n0Var = this.f1483a;
        n0Var.getClass();
        j0 j0Var2 = (j0) n0Var.f1498a.get(str);
        boolean isInstance = cls.isInstance(j0Var2);
        b bVar = this.f1484b;
        if (isInstance) {
            d dVar = bVar instanceof d ? (d) bVar : null;
            if (dVar != null) {
                k.b(j0Var2);
                dVar.c(j0Var2);
            }
            k.c(j0Var2, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return j0Var2;
        }
        v0.c cVar = new v0.c(this.f1485c);
        c cVar2 = c.f1488a;
        cVar.f7831a.put(m0.f1497a, str);
        try {
            j0Var = bVar.b(cls, cVar);
        } catch (AbstractMethodError unused) {
            j0Var = bVar.a(cls);
        }
        k.e(j0Var, "viewModel");
        j0 j0Var3 = (j0) n0Var.f1498a.put(str, j0Var);
        if (j0Var3 != null) {
            j0Var3.b();
        }
        return j0Var;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public l0(n0 n0Var, b bVar) {
        this(n0Var, bVar, a.C0142a.f7832b);
        k.e(n0Var, "store");
        k.e(bVar, "factory");
    }
}
