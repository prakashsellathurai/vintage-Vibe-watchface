package u;

import b6.a;
import java.util.ArrayList;
import java.util.Iterator;

public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    public p f7570a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f7571b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7572c = false;

    /* renamed from: d  reason: collision with root package name */
    public final p f7573d;
    public int e = 1;

    /* renamed from: f  reason: collision with root package name */
    public int f7574f;

    /* renamed from: g  reason: collision with root package name */
    public int f7575g;

    /* renamed from: h  reason: collision with root package name */
    public int f7576h = 1;

    /* renamed from: i  reason: collision with root package name */
    public g f7577i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f7578j = false;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f7579k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f7580l = new ArrayList();

    public f(p pVar) {
        this.f7573d = pVar;
    }

    public final void a(d dVar) {
        ArrayList arrayList = this.f7580l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f7578j) {
                return;
            }
        }
        this.f7572c = true;
        p pVar = this.f7570a;
        if (pVar != null) {
            pVar.a(this);
        }
        if (this.f7571b) {
            this.f7573d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        f fVar = null;
        int i8 = 0;
        while (it2.hasNext()) {
            f fVar2 = (f) it2.next();
            if (!(fVar2 instanceof g)) {
                i8++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i8 == 1 && fVar.f7578j) {
            g gVar = this.f7577i;
            if (gVar != null) {
                if (gVar.f7578j) {
                    this.f7574f = this.f7576h * gVar.f7575g;
                } else {
                    return;
                }
            }
            d(fVar.f7575g + this.f7574f);
        }
        p pVar2 = this.f7570a;
        if (pVar2 != null) {
            pVar2.a(this);
        }
    }

    public final void b(d dVar) {
        this.f7579k.add(dVar);
        if (this.f7578j) {
            dVar.a(dVar);
        }
    }

    public final void c() {
        this.f7580l.clear();
        this.f7579k.clear();
        this.f7578j = false;
        this.f7575g = 0;
        this.f7572c = false;
        this.f7571b = false;
    }

    public void d(int i8) {
        if (!this.f7578j) {
            this.f7578j = true;
            this.f7575g = i8;
            Iterator it = this.f7579k.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                dVar.a(dVar);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7573d.f7594b.f7326e0);
        sb.append(":");
        sb.append(a.s(this.e));
        sb.append("(");
        sb.append(this.f7578j ? Integer.valueOf(this.f7575g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f7580l.size());
        sb.append(":d=");
        sb.append(this.f7579k.size());
        sb.append(">");
        return sb.toString();
    }
}
