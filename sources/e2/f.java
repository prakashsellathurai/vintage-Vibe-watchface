package e2;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import k3.k;
import l2.a;
import s2.j;

public abstract class f implements e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4250a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final Collection f4251b;

    public f() {
        char[] cArr = k.f5169a;
        this.f4251b = new ArrayDeque(20);
    }

    public final List b() {
        return (List) this.f4251b;
    }

    public final boolean c() {
        Collection collection = this.f4251b;
        if (!((List) collection).isEmpty()) {
            return ((List) collection).size() == 1 && ((a) ((List) collection).get(0)).c();
        }
        return true;
    }

    public abstract j d();

    public final j e() {
        j jVar = (j) ((Queue) this.f4251b).poll();
        return jVar == null ? d() : jVar;
    }

    public final void f(j jVar) {
        Collection collection = this.f4251b;
        if (((Queue) collection).size() < 20) {
            ((Queue) collection).offer(jVar);
        }
    }

    public final String toString() {
        switch (this.f4250a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                List list = (List) this.f4251b;
                if (!list.isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(list.toArray()));
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public f(Float f9) {
        this(Collections.singletonList(new a(f9)));
    }

    public f(List list) {
        this.f4251b = list;
    }
}
