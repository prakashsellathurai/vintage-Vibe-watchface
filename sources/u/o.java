package u;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import k3.j;
import t.c;
import t.d;
import t.e;

public final class o {

    /* renamed from: f  reason: collision with root package name */
    public static int f7588f;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<d> f7589a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final int f7590b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f7591c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<a> f7592d = null;
    public int e = -1;

    public class a {
        public a(d dVar, s.d dVar2) {
            new WeakReference(dVar);
            c cVar = dVar.E;
            dVar2.getClass();
            s.d.o(cVar);
            s.d.o(dVar.F);
            s.d.o(dVar.G);
            s.d.o(dVar.H);
            s.d.o(dVar.I);
        }
    }

    public o(int i8) {
        int i9 = f7588f;
        f7588f = i9 + 1;
        this.f7590b = i9;
        this.f7591c = i8;
    }

    public final void a(ArrayList<o> arrayList) {
        int size = this.f7589a.size();
        if (this.e != -1 && size > 0) {
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                o oVar = arrayList.get(i8);
                if (this.e == oVar.f7590b) {
                    c(this.f7591c, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(s.d dVar, int i8) {
        c cVar;
        int i9;
        ArrayList<d> arrayList = this.f7589a;
        if (arrayList.size() == 0) {
            return 0;
        }
        e eVar = (e) arrayList.get(0).Q;
        dVar.u();
        eVar.b(dVar, false);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList.get(i10).b(dVar, false);
        }
        if (i8 == 0 && eVar.u0 > 0) {
            j.g(eVar, dVar, arrayList, 0);
        }
        if (i8 == 1 && eVar.f7358v0 > 0) {
            j.g(eVar, dVar, arrayList, 1);
        }
        try {
            dVar.q();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        this.f7592d = new ArrayList<>();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            this.f7592d.add(new a(arrayList.get(i11), dVar));
        }
        if (i8 == 0) {
            i9 = s.d.o(eVar.E);
            cVar = eVar.G;
        } else {
            i9 = s.d.o(eVar.F);
            cVar = eVar.H;
        }
        int o8 = s.d.o(cVar);
        dVar.u();
        return o8 - i9;
    }

    public final void c(int i8, o oVar) {
        Iterator<d> it = this.f7589a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            int i9 = oVar.f7590b;
            if (hasNext) {
                d next = it.next();
                ArrayList<d> arrayList = oVar.f7589a;
                if (!arrayList.contains(next)) {
                    arrayList.add(next);
                }
                if (i8 == 0) {
                    next.f7338k0 = i9;
                } else {
                    next.f7340l0 = i9;
                }
            } else {
                this.e = i9;
                return;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i8 = this.f7591c;
        sb.append(i8 == 0 ? "Horizontal" : i8 == 1 ? "Vertical" : i8 == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f7590b);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator<d> it = this.f7589a.iterator();
        while (it.hasNext()) {
            sb2 = sb2 + " " + it.next().f7326e0;
        }
        return sb2 + " >";
    }
}
