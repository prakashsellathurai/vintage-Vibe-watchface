package s;

import android.util.SparseArray;
import e2.b;
import java.util.ArrayList;
import java.util.HashSet;
import p.a;
import p.d;
import p.f;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f7134a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7135b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f7136c;

    /* renamed from: d  reason: collision with root package name */
    public Object f7137d;

    public c(int i8) {
        if (i8 == 1) {
            this.f7134a = new e(10, 1);
            this.f7135b = new f();
            this.f7136c = new ArrayList();
            this.f7137d = new HashSet();
        } else if (i8 != 2) {
            this.f7134a = new e(256, 0);
            this.f7135b = new e(256, 0);
            this.f7136c = new e(256, 0);
            this.f7137d = new h[32];
        } else {
            this.f7134a = new a();
            this.f7135b = new SparseArray();
            this.f7136c = new d();
            this.f7137d = new a();
        }
    }

    public /* synthetic */ c(e2.a aVar, e2.a aVar2, b bVar, b bVar2) {
        this.f7134a = aVar;
        this.f7135b = aVar2;
        this.f7136c = bVar;
        this.f7137d = bVar2;
    }

    public final void a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (!arrayList.contains(obj)) {
            if (!hashSet.contains(obj)) {
                hashSet.add(obj);
                ArrayList arrayList2 = (ArrayList) ((f) this.f7135b).getOrDefault(obj, null);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        a(arrayList2.get(i8), arrayList, hashSet);
                    }
                }
                hashSet.remove(obj);
                arrayList.add(obj);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }
}
