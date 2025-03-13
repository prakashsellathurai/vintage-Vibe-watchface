package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import androidx.savedstate.a;
import b1.c;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import q7.k;

public final class Recreator implements p {

    /* renamed from: f  reason: collision with root package name */
    public final c f1915f;

    public static final class a implements a.b {

        /* renamed from: a  reason: collision with root package name */
        public final LinkedHashSet f1916a = new LinkedHashSet();

        public a(a aVar) {
            k.e(aVar, "registry");
            aVar.c("androidx.savedstate.Restarter", this);
        }

        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.f1916a));
            return bundle;
        }
    }

    public Recreator(c cVar) {
        k.e(cVar, "owner");
        this.f1915f = cVar;
    }

    public final void c(r rVar, m.a aVar) {
        if (aVar == m.a.ON_CREATE) {
            rVar.getLifecycle().b(this);
            c cVar = this.f1915f;
            Bundle a9 = cVar.getSavedStateRegistry().a("androidx.savedstate.Restarter");
            if (a9 != null) {
                ArrayList<String> stringArrayList = a9.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    for (String next : stringArrayList) {
                        try {
                            Class<? extends U> asSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(a.C0017a.class);
                            k.d(asSubclass, "{\n                Class.…class.java)\n            }");
                            try {
                                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                                declaredConstructor.setAccessible(true);
                                try {
                                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                                    k.d(newInstance, "{\n                constr…wInstance()\n            }");
                                    ((a.C0017a) newInstance).a(cVar);
                                } catch (Exception e) {
                                    throw new RuntimeException("Failed to instantiate " + next, e);
                                }
                            } catch (NoSuchMethodException e4) {
                                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
                            }
                        } catch (ClassNotFoundException e9) {
                            throw new RuntimeException("Class " + next + " wasn't found", e9);
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
