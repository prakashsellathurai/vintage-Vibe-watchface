package n1;

import java.util.ArrayList;
import java.util.List;

public final /* synthetic */ class k implements AutoCloseable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ List f5642f;

    public /* synthetic */ k(ArrayList arrayList) {
        this.f5642f = arrayList;
    }

    public final void close() {
        List<AutoCloseable> list = this.f5642f;
        q7.k.e(list, "$restores");
        for (AutoCloseable close : list) {
            close.close();
        }
    }
}
