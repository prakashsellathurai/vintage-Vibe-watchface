package e1;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.u;
import e1.h;
import java.util.ArrayList;
import java.util.Iterator;
import s.c;

public class m extends h {
    public ArrayList<h> C = new ArrayList<>();
    public boolean D = true;
    public int E;
    public boolean F = false;
    public int G = 0;

    public class a extends k {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f4218a;

        public a(h hVar) {
            this.f4218a = hVar;
        }

        public final void e(h hVar) {
            this.f4218a.y();
            hVar.v(this);
        }
    }

    public static class b extends k {

        /* renamed from: a  reason: collision with root package name */
        public final m f4219a;

        public b(m mVar) {
            this.f4219a = mVar;
        }

        public final void a() {
            m mVar = this.f4219a;
            if (!mVar.F) {
                mVar.F();
                mVar.F = true;
            }
        }

        public final void e(h hVar) {
            m mVar = this.f4219a;
            int i8 = mVar.E - 1;
            mVar.E = i8;
            if (i8 == 0) {
                mVar.F = false;
                mVar.m();
            }
            hVar.v(this);
        }
    }

    public final void A(h.c cVar) {
        this.f4203x = cVar;
        this.G |= 8;
        int size = this.C.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.C.get(i8).A(cVar);
        }
    }

    public final void B(TimeInterpolator timeInterpolator) {
        this.G |= 1;
        ArrayList<h> arrayList = this.C;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                this.C.get(i8).B(timeInterpolator);
            }
        }
        this.f4190i = timeInterpolator;
    }

    public final void C(u uVar) {
        super.C(uVar);
        this.G |= 4;
        if (this.C != null) {
            for (int i8 = 0; i8 < this.C.size(); i8++) {
                this.C.get(i8).C(uVar);
            }
        }
    }

    public final void D() {
        this.G |= 2;
        int size = this.C.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.C.get(i8).D();
        }
    }

    public final void E(long j8) {
        this.f4188g = j8;
    }

    public final String G(String str) {
        String G2 = super.G(str);
        for (int i8 = 0; i8 < this.C.size(); i8++) {
            StringBuilder sb = new StringBuilder();
            sb.append(G2);
            sb.append("\n");
            sb.append(this.C.get(i8).G(str + "  "));
            G2 = sb.toString();
        }
        return G2;
    }

    public final void H(h hVar) {
        this.C.add(hVar);
        hVar.f4195n = this;
        long j8 = this.f4189h;
        if (j8 >= 0) {
            hVar.z(j8);
        }
        if ((this.G & 1) != 0) {
            hVar.B(this.f4190i);
        }
        if ((this.G & 2) != 0) {
            hVar.D();
        }
        if ((this.G & 4) != 0) {
            hVar.C(this.y);
        }
        if ((this.G & 8) != 0) {
            hVar.A(this.f4203x);
        }
    }

    public final void a(h.d dVar) {
        super.a(dVar);
    }

    public final void b(View view) {
        for (int i8 = 0; i8 < this.C.size(); i8++) {
            this.C.get(i8).b(view);
        }
        this.f4192k.add(view);
    }

    public final void d(n nVar) {
        View view = nVar.f4221b;
        if (s(view)) {
            Iterator<h> it = this.C.iterator();
            while (it.hasNext()) {
                h next = it.next();
                if (next.s(view)) {
                    next.d(nVar);
                    nVar.f4222c.add(next);
                }
            }
        }
    }

    public final void f(n nVar) {
        int size = this.C.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.C.get(i8).f(nVar);
        }
    }

    public final void g(n nVar) {
        View view = nVar.f4221b;
        if (s(view)) {
            Iterator<h> it = this.C.iterator();
            while (it.hasNext()) {
                h next = it.next();
                if (next.s(view)) {
                    next.g(nVar);
                    nVar.f4222c.add(next);
                }
            }
        }
    }

    /* renamed from: j */
    public final h clone() {
        m mVar = (m) super.clone();
        mVar.C = new ArrayList<>();
        int size = this.C.size();
        for (int i8 = 0; i8 < size; i8++) {
            h j8 = this.C.get(i8).clone();
            mVar.C.add(j8);
            j8.f4195n = mVar;
        }
        return mVar;
    }

    public final void l(ViewGroup viewGroup, c cVar, c cVar2, ArrayList<n> arrayList, ArrayList<n> arrayList2) {
        long j8 = this.f4188g;
        int size = this.C.size();
        for (int i8 = 0; i8 < size; i8++) {
            h hVar = this.C.get(i8);
            if (j8 > 0 && (this.D || i8 == 0)) {
                long j9 = hVar.f4188g;
                if (j9 > 0) {
                    hVar.E(j9 + j8);
                } else {
                    hVar.E(j8);
                }
            }
            hVar.l(viewGroup, cVar, cVar2, arrayList, arrayList2);
        }
    }

    public final void u(View view) {
        super.u(view);
        int size = this.C.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.C.get(i8).u(view);
        }
    }

    public final void v(h.d dVar) {
        super.v(dVar);
    }

    public final void w(View view) {
        for (int i8 = 0; i8 < this.C.size(); i8++) {
            this.C.get(i8).w(view);
        }
        this.f4192k.remove(view);
    }

    public final void x(ViewGroup viewGroup) {
        super.x(viewGroup);
        int size = this.C.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.C.get(i8).x(viewGroup);
        }
    }

    public final void y() {
        if (this.C.isEmpty()) {
            F();
            m();
            return;
        }
        b bVar = new b(this);
        Iterator<h> it = this.C.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.E = this.C.size();
        if (!this.D) {
            for (int i8 = 1; i8 < this.C.size(); i8++) {
                this.C.get(i8 - 1).a(new a(this.C.get(i8)));
            }
            h hVar = this.C.get(0);
            if (hVar != null) {
                hVar.y();
                return;
            }
            return;
        }
        Iterator<h> it2 = this.C.iterator();
        while (it2.hasNext()) {
            it2.next().y();
        }
    }

    public final void z(long j8) {
        ArrayList<h> arrayList;
        this.f4189h = j8;
        if (j8 >= 0 && (arrayList = this.C) != null) {
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                this.C.get(i8).z(j8);
            }
        }
    }
}
