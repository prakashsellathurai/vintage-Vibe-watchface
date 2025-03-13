package t;

import java.util.ArrayList;
import s.c;

public class j extends d {

    /* renamed from: m0  reason: collision with root package name */
    public ArrayList<d> f7370m0 = new ArrayList<>();

    public void F() {
        ArrayList<d> arrayList = this.f7370m0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                d dVar = this.f7370m0.get(i8);
                if (dVar instanceof j) {
                    ((j) dVar).F();
                }
            }
        }
    }

    public void v() {
        this.f7370m0.clear();
        super.v();
    }

    public final void w(c cVar) {
        super.w(cVar);
        int size = this.f7370m0.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.f7370m0.get(i8).w(cVar);
        }
    }
}
