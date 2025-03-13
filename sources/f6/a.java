package f6;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import w5.c;
import w5.f;
import w5.g;
import z5.b;

public abstract class a implements g {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<c> f4415a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public f f4416b = null;

    /* renamed from: c  reason: collision with root package name */
    public b f4417c = null;

    /* renamed from: d  reason: collision with root package name */
    public final v5.b f4418d;

    public a(v5.b bVar, c cVar) {
        this.f4418d = bVar;
        a();
        bVar.b(cVar, this);
        this.f4416b = bVar.c(cVar);
    }

    public final void a() {
        ArrayList<c> arrayList = this.f4415a;
        Iterator<c> it = arrayList.iterator();
        while (it.hasNext()) {
            c next = it.next();
            d6.b d9 = this.f4418d.d(next);
            d9.getClass();
            String str = next.f8018a;
            if (!d9.e(str)) {
                Log.i("DWF:DataProvider", String.format("wrong source[%s]", new Object[]{str}));
            } else {
                HashMap hashMap = d9.f4049b;
                List list = (List) hashMap.get(str);
                if (list != null) {
                    list.remove(this);
                    if (list.size() == 0) {
                        hashMap.remove(str);
                        d9.l(str);
                    }
                }
            }
        }
        arrayList.clear();
    }

    public abstract void b(f fVar);

    public final void g(c cVar, f fVar) {
        b bVar = this.f4417c;
        if (bVar != null) {
            fVar = bVar.b();
        }
        this.f4416b = fVar;
        b(fVar);
    }

    public a(v5.b bVar, b bVar2) {
        this.f4418d = bVar;
        a();
        Iterator it = bVar2.f8702d.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            this.f4418d.b(cVar, this);
            this.f4415a.add(cVar);
        }
        this.f4417c = bVar2;
        this.f4416b = bVar2.b();
    }
}
