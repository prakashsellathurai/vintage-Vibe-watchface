package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.a;
import h7.f;
import java.util.Map;
import q7.k;
import q7.l;

public final class f0 implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.savedstate.a f1459a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1460b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f1461c;

    /* renamed from: d  reason: collision with root package name */
    public final f f1462d;

    public static final class a extends l implements p7.a<g0> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ o0 f1463f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(o0 o0Var) {
            super(0);
            this.f1463f = o0Var;
        }

        public final Object invoke() {
            return e0.b(this.f1463f);
        }
    }

    public f0(androidx.savedstate.a aVar, o0 o0Var) {
        k.e(aVar, "savedStateRegistry");
        k.e(o0Var, "viewModelStoreOwner");
        this.f1459a = aVar;
        this.f1462d = a1.a.z(new a(o0Var));
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1461c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((g0) this.f1462d.getValue()).f1468d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a9 = ((d0) entry.getValue()).e.a();
            if (!k.a(a9, Bundle.EMPTY)) {
                bundle.putBundle(str, a9);
            }
        }
        this.f1460b = false;
        return bundle;
    }
}
