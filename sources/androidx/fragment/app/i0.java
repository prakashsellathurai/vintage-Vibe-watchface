package androidx.fragment.app;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import c3.b;
import f2.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p2.g;
import r2.v;
import y2.c;

public final class i0 implements b {

    /* renamed from: a  reason: collision with root package name */
    public final Object f1188a;

    /* renamed from: b  reason: collision with root package name */
    public Object f1189b;

    /* renamed from: c  reason: collision with root package name */
    public Object f1190c;

    public /* synthetic */ i0() {
        this.f1188a = new ArrayList();
        this.f1189b = new HashMap();
    }

    public /* synthetic */ i0(Object obj) {
        this.f1188a = new l2.b();
        this.f1190c = obj;
    }

    public /* synthetic */ i0(Object obj, Object obj2, Object obj3) {
        this.f1188a = obj;
        this.f1189b = obj2;
        this.f1190c = obj3;
    }

    public final void a(n nVar) {
        if (!((ArrayList) this.f1188a).contains(nVar)) {
            synchronized (((ArrayList) this.f1188a)) {
                ((ArrayList) this.f1188a).add(nVar);
            }
            nVar.f1264l = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + nVar);
    }

    public final void b() {
        ((HashMap) this.f1189b).values().removeAll(Collections.singleton((Object) null));
    }

    public final n c(String str) {
        h0 h0Var = (h0) ((HashMap) this.f1189b).get(str);
        if (h0Var != null) {
            return h0Var.f1182c;
        }
        return null;
    }

    public final n d(String str) {
        for (h0 h0Var : ((HashMap) this.f1189b).values()) {
            if (h0Var != null) {
                n nVar = h0Var.f1182c;
                if (!str.equals(nVar.f1258f)) {
                    nVar = nVar.f1272u.f1103c.d(str);
                }
                if (nVar != null) {
                    return nVar;
                }
            }
        }
        return null;
    }

    public final v e(v vVar, g gVar) {
        Drawable drawable = (Drawable) vVar.get();
        if (drawable instanceof BitmapDrawable) {
            return ((b) this.f1189b).e(c.e(((BitmapDrawable) drawable).getBitmap(), (s2.c) this.f1188a), gVar);
        }
        if (drawable instanceof b3.c) {
            return ((b) this.f1190c).e(vVar, gVar);
        }
        return null;
    }

    public final ArrayList f() {
        ArrayList arrayList = new ArrayList();
        for (h0 h0Var : ((HashMap) this.f1189b).values()) {
            if (h0Var != null) {
                arrayList.add(h0Var);
            }
        }
        return arrayList;
    }

    public final ArrayList g() {
        ArrayList arrayList = new ArrayList();
        for (h0 h0Var : ((HashMap) this.f1189b).values()) {
            arrayList.add(h0Var != null ? h0Var.f1182c : null);
        }
        return arrayList;
    }

    public final h0 h(String str) {
        return (h0) ((HashMap) this.f1189b).get(str);
    }

    public final List i() {
        ArrayList arrayList;
        if (((ArrayList) this.f1188a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f1188a)) {
            arrayList = new ArrayList((ArrayList) this.f1188a);
        }
        return arrayList;
    }

    public final Object j(Object obj, Object obj2) {
        l2.b bVar = (l2.b) this.f1188a;
        bVar.f5283a = obj;
        bVar.f5284b = obj2;
        return this.f1190c;
    }

    public final void k(h0 h0Var) {
        n nVar = h0Var.f1182c;
        if (!(((HashMap) this.f1189b).get(nVar.f1258f) != null)) {
            ((HashMap) this.f1189b).put(nVar.f1258f, h0Var);
            if (nVar.C) {
                boolean z8 = nVar.B;
                e0 e0Var = (e0) this.f1190c;
                if (z8) {
                    e0Var.c(nVar);
                } else {
                    e0Var.d(nVar);
                }
                nVar.C = false;
            }
            if (b0.H(2)) {
                nVar.toString();
            }
        }
    }

    public final void l(h0 h0Var) {
        n nVar = h0Var.f1182c;
        if (nVar.B) {
            ((e0) this.f1190c).d(nVar);
        }
        if (((h0) ((HashMap) this.f1189b).put(nVar.f1258f, (Object) null)) != null && b0.H(2)) {
            nVar.toString();
        }
    }

    public i0(List list) {
        this.f1190c = list;
        this.f1188a = new ArrayList(list.size());
        this.f1189b = new ArrayList(list.size());
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((List) this.f1188a).add(((f) list.get(i8)).f4330b.a());
            ((List) this.f1189b).add(((f) list.get(i8)).f4331c.a());
        }
    }
}
