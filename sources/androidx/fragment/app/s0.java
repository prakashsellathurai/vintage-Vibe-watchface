package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.b0;
import androidx.fragment.app.n;
import androidx.health.services.client.R;
import f0.a;
import j0.x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public abstract class s0 {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f1321a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<d> f1322b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<d> f1323c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public boolean f1324d = false;
    public boolean e = false;

    public class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ c f1325f;

        public a(c cVar) {
            this.f1325f = cVar;
        }

        public final void run() {
            ArrayList<d> arrayList = s0.this.f1322b;
            c cVar = this.f1325f;
            if (arrayList.contains(cVar)) {
                cVar.f1330a.e(cVar.f1332c.H);
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ c f1327f;

        public b(c cVar) {
            this.f1327f = cVar;
        }

        public final void run() {
            s0 s0Var = s0.this;
            ArrayList<d> arrayList = s0Var.f1322b;
            c cVar = this.f1327f;
            arrayList.remove(cVar);
            s0Var.f1323c.remove(cVar);
        }
    }

    public static class c extends d {

        /* renamed from: h  reason: collision with root package name */
        public final h0 f1329h;

        public c(d.c cVar, d.b bVar, h0 h0Var, f0.a aVar) {
            super(cVar, bVar, h0Var.f1182c, aVar);
            this.f1329h = h0Var;
        }

        public final void b() {
            super.b();
            this.f1329h.k();
        }

        public final void d() {
            if (this.f1331b == d.b.f1338g) {
                h0 h0Var = this.f1329h;
                n nVar = h0Var.f1182c;
                View findFocus = nVar.H.findFocus();
                if (findFocus != null) {
                    nVar.d().r = findFocus;
                    if (b0.H(2)) {
                        findFocus.toString();
                        nVar.toString();
                    }
                }
                View requireView = this.f1332c.requireView();
                if (requireView.getParent() == null) {
                    h0Var.b();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                n.g gVar = nVar.K;
                requireView.setAlpha(gVar == null ? 1.0f : gVar.f1297q);
            }
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public c f1330a;

        /* renamed from: b  reason: collision with root package name */
        public b f1331b;

        /* renamed from: c  reason: collision with root package name */
        public final n f1332c;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList f1333d = new ArrayList();
        public final HashSet<f0.a> e = new HashSet<>();

        /* renamed from: f  reason: collision with root package name */
        public boolean f1334f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1335g = false;

        public class a implements a.C0054a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ d f1336a;

            public a(c cVar) {
                this.f1336a = cVar;
            }

            public final void onCancel() {
                this.f1336a.a();
            }
        }

        public enum b {
            f1337f,
            f1338g,
            f1339h;

            /* access modifiers changed from: public */
            b() {
            }
        }

        public enum c {
            f1341f,
            f1342g,
            f1343h,
            f1344i;

            /* access modifiers changed from: public */
            c() {
            }

            public static c f(int i8) {
                if (i8 == 0) {
                    return f1342g;
                }
                if (i8 == 4) {
                    return f1344i;
                }
                if (i8 == 8) {
                    return f1343h;
                }
                throw new IllegalArgumentException("Unknown visibility " + i8);
            }

            public static c g(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? f1344i : f(view.getVisibility());
            }

            public final void e(View view) {
                int i8;
                int ordinal = ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        if (b0.H(2)) {
                            Objects.toString(view);
                        }
                        i8 = 0;
                    } else if (ordinal == 2) {
                        if (b0.H(2)) {
                            Objects.toString(view);
                        }
                        i8 = 8;
                    } else if (ordinal == 3) {
                        if (b0.H(2)) {
                            Objects.toString(view);
                        }
                        i8 = 4;
                    } else {
                        return;
                    }
                    view.setVisibility(i8);
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    if (b0.H(2)) {
                        view.toString();
                        viewGroup.toString();
                    }
                    viewGroup.removeView(view);
                }
            }
        }

        public d(c cVar, b bVar, n nVar, f0.a aVar) {
            this.f1330a = cVar;
            this.f1331b = bVar;
            this.f1332c = nVar;
            aVar.b(new a((c) this));
        }

        public final void a() {
            if (!this.f1334f) {
                this.f1334f = true;
                HashSet<f0.a> hashSet = this.e;
                if (hashSet.isEmpty()) {
                    b();
                    return;
                }
                Iterator it = new ArrayList(hashSet).iterator();
                while (it.hasNext()) {
                    ((f0.a) it.next()).a();
                }
            }
        }

        public void b() {
            if (!this.f1335g) {
                if (b0.H(2)) {
                    toString();
                }
                this.f1335g = true;
                Iterator it = this.f1333d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
        }

        public final void c(c cVar, b bVar) {
            b bVar2;
            int ordinal = bVar.ordinal();
            c cVar2 = c.f1341f;
            n nVar = this.f1332c;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        if (b0.H(2)) {
                            Objects.toString(nVar);
                            Objects.toString(this.f1330a);
                            Objects.toString(this.f1331b);
                        }
                        this.f1330a = cVar2;
                        bVar2 = b.f1339h;
                    } else {
                        return;
                    }
                } else if (this.f1330a == cVar2) {
                    if (b0.H(2)) {
                        Objects.toString(nVar);
                        Objects.toString(this.f1331b);
                    }
                    this.f1330a = c.f1342g;
                    bVar2 = b.f1338g;
                } else {
                    return;
                }
                this.f1331b = bVar2;
            } else if (this.f1330a != cVar2) {
                if (b0.H(2)) {
                    Objects.toString(nVar);
                    Objects.toString(this.f1330a);
                    Objects.toString(cVar);
                }
                this.f1330a = cVar;
            }
        }

        public void d() {
        }

        public final String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f1330a + "} {mLifecycleImpact = " + this.f1331b + "} {mFragment = " + this.f1332c + "}";
        }
    }

    public s0(ViewGroup viewGroup) {
        this.f1321a = viewGroup;
    }

    public static s0 f(ViewGroup viewGroup, b0 b0Var) {
        return g(viewGroup, b0Var.G());
    }

    public static s0 g(ViewGroup viewGroup, t0 t0Var) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof s0) {
            return (s0) tag;
        }
        ((b0.f) t0Var).getClass();
        l lVar = new l(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, lVar);
        return lVar;
    }

    public final void a(d.c cVar, d.b bVar, h0 h0Var) {
        synchronized (this.f1322b) {
            f0.a aVar = new f0.a();
            d d9 = d(h0Var.f1182c);
            if (d9 != null) {
                d9.c(cVar, bVar);
                return;
            }
            c cVar2 = new c(cVar, bVar, h0Var, aVar);
            this.f1322b.add(cVar2);
            cVar2.f1333d.add(new a(cVar2));
            cVar2.f1333d.add(new b(cVar2));
        }
    }

    public abstract void b(ArrayList arrayList, boolean z8);

    public final void c() {
        if (!this.e) {
            ViewGroup viewGroup = this.f1321a;
            int[] iArr = x.f4957a;
            if (!x.f.b(viewGroup)) {
                e();
                this.f1324d = false;
                return;
            }
            synchronized (this.f1322b) {
                if (!this.f1322b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f1323c);
                    this.f1323c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        d dVar = (d) it.next();
                        if (b0.H(2)) {
                            Objects.toString(dVar);
                        }
                        dVar.a();
                        if (!dVar.f1335g) {
                            this.f1323c.add(dVar);
                        }
                    }
                    i();
                    ArrayList arrayList2 = new ArrayList(this.f1322b);
                    this.f1322b.clear();
                    this.f1323c.addAll(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((d) it2.next()).d();
                    }
                    b(arrayList2, this.f1324d);
                    this.f1324d = false;
                }
            }
        }
    }

    public final d d(n nVar) {
        Iterator<d> it = this.f1322b.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (next.f1332c.equals(nVar) && !next.f1334f) {
                return next;
            }
        }
        return null;
    }

    public final void e() {
        ViewGroup viewGroup = this.f1321a;
        int[] iArr = x.f4957a;
        boolean b9 = x.f.b(viewGroup);
        synchronized (this.f1322b) {
            i();
            Iterator<d> it = this.f1322b.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
            Iterator it2 = new ArrayList(this.f1323c).iterator();
            while (it2.hasNext()) {
                d dVar = (d) it2.next();
                if (b0.H(2)) {
                    if (!b9) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Container ");
                        sb.append(this.f1321a);
                        sb.append(" is not attached to window. ");
                    }
                    Objects.toString(dVar);
                }
                dVar.a();
            }
            Iterator it3 = new ArrayList(this.f1322b).iterator();
            while (it3.hasNext()) {
                d dVar2 = (d) it3.next();
                if (b0.H(2)) {
                    if (!b9) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Container ");
                        sb2.append(this.f1321a);
                        sb2.append(" is not attached to window. ");
                    }
                    Objects.toString(dVar2);
                }
                dVar2.a();
            }
        }
    }

    public final void h() {
        synchronized (this.f1322b) {
            i();
            boolean z8 = false;
            this.e = false;
            int size = this.f1322b.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                d dVar = this.f1322b.get(size);
                d.c g9 = d.c.g(dVar.f1332c.H);
                d.c cVar = dVar.f1330a;
                d.c cVar2 = d.c.f1342g;
                if (cVar == cVar2 && g9 != cVar2) {
                    n.g gVar = dVar.f1332c.K;
                    if (gVar != null) {
                        z8 = gVar.f1298s;
                    }
                    this.e = z8;
                }
            }
        }
    }

    public final void i() {
        Iterator<d> it = this.f1322b.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (next.f1331b == d.b.f1338g) {
                next.c(d.c.f(next.f1332c.requireView().getVisibility()), d.b.f1337f);
            }
        }
    }
}
