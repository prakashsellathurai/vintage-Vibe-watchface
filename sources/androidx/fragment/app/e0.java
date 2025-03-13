package androidx.fragment.app;

import androidx.lifecycle.j0;
import androidx.lifecycle.l0;
import androidx.lifecycle.n0;
import java.util.HashMap;
import java.util.Iterator;

public final class e0 extends j0 {

    /* renamed from: j  reason: collision with root package name */
    public static final a f1152j = new a();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<String, n> f1153d = new HashMap<>();
    public final HashMap<String, e0> e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public final HashMap<String, n0> f1154f = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    public final boolean f1155g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1156h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1157i = false;

    public class a implements l0.b {
        public final <T extends j0> T a(Class<T> cls) {
            return new e0(true);
        }
    }

    public e0(boolean z8) {
        this.f1155g = z8;
    }

    public final void b() {
        if (b0.H(3)) {
            toString();
        }
        this.f1156h = true;
    }

    public final void c(n nVar) {
        if (this.f1157i) {
            b0.H(2);
            return;
        }
        HashMap<String, n> hashMap = this.f1153d;
        if (!hashMap.containsKey(nVar.f1258f)) {
            hashMap.put(nVar.f1258f, nVar);
            if (b0.H(2)) {
                nVar.toString();
            }
        }
    }

    public final void d(n nVar) {
        if (this.f1157i) {
            b0.H(2);
            return;
        }
        if ((this.f1153d.remove(nVar.f1258f) != null) && b0.H(2)) {
            nVar.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e0.class != obj.getClass()) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f1153d.equals(e0Var.f1153d) && this.e.equals(e0Var.e) && this.f1154f.equals(e0Var.f1154f);
    }

    public final int hashCode() {
        return (((this.f1153d.hashCode() * 31) + this.e.hashCode()) * 31) + this.f1154f.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<n> it = this.f1153d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f1154f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
