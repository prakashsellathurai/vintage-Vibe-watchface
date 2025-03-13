package androidx.lifecycle;

import androidx.lifecycle.m;
import androidx.savedstate.a;
import b1.c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import q7.k;

public final class l {

    public static final class a implements a.C0017a {
        public final void a(c cVar) {
            LinkedHashMap linkedHashMap;
            k.e(cVar, "owner");
            if (cVar instanceof o0) {
                n0 viewModelStore = ((o0) cVar).getViewModelStore();
                androidx.savedstate.a savedStateRegistry = cVar.getSavedStateRegistry();
                viewModelStore.getClass();
                Iterator it = new HashSet(viewModelStore.f1498a.keySet()).iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    linkedHashMap = viewModelStore.f1498a;
                    if (!hasNext) {
                        break;
                    }
                    String str = (String) it.next();
                    k.e(str, "key");
                    j0 j0Var = (j0) linkedHashMap.get(str);
                    k.b(j0Var);
                    l.a(j0Var, savedStateRegistry, cVar.getLifecycle());
                }
                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                    savedStateRegistry.d();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
        }
    }

    public static final void a(j0 j0Var, androidx.savedstate.a aVar, m mVar) {
        Object obj;
        k.e(aVar, "registry");
        k.e(mVar, "lifecycle");
        HashMap hashMap = j0Var.f1479a;
        if (hashMap == null) {
            obj = null;
        } else {
            synchronized (hashMap) {
                obj = j0Var.f1479a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController != null && !savedStateHandleController.f1426h) {
            savedStateHandleController.d(mVar, aVar);
            m.b bVar = ((s) mVar).f1503d;
            if (bVar != m.b.f1492g) {
                if (!(bVar.compareTo(m.b.f1494i) >= 0)) {
                    mVar.a(new LegacySavedStateHandleController$tryToAddRecreator$1(mVar, aVar));
                    return;
                }
            }
            aVar.d();
        }
    }
}
