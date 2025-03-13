package androidx.lifecycle;

import java.io.Closeable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public final class n0 {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f1498a = new LinkedHashMap();

    public final void a() {
        for (j0 j0Var : this.f1498a.values()) {
            j0Var.f1481c = true;
            HashMap hashMap = j0Var.f1479a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    for (Object a9 : j0Var.f1479a.values()) {
                        j0.a(a9);
                    }
                }
            }
            LinkedHashSet linkedHashSet = j0Var.f1480b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    for (Closeable a10 : j0Var.f1480b) {
                        j0.a(a10);
                    }
                }
            }
            j0Var.b();
        }
        this.f1498a.clear();
    }
}
