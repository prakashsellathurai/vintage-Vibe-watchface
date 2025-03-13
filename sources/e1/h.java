package e1;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.Property;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import androidx.fragment.app.u;
import j0.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import k3.j;

public abstract class h implements Cloneable {
    public static final a A = new a();
    public static final ThreadLocal<p.a<Animator, b>> B = new ThreadLocal<>();

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f4186z = {2, 1, 3, 4};

    /* renamed from: f  reason: collision with root package name */
    public final String f4187f = getClass().getName();

    /* renamed from: g  reason: collision with root package name */
    public long f4188g = -1;

    /* renamed from: h  reason: collision with root package name */
    public long f4189h = -1;

    /* renamed from: i  reason: collision with root package name */
    public TimeInterpolator f4190i = null;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList<Integer> f4191j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList<View> f4192k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public s.c f4193l = new s.c(2);

    /* renamed from: m  reason: collision with root package name */
    public s.c f4194m = new s.c(2);

    /* renamed from: n  reason: collision with root package name */
    public m f4195n = null;

    /* renamed from: o  reason: collision with root package name */
    public final int[] f4196o = f4186z;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList<n> f4197p;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList<n> f4198q;
    public final ArrayList<Animator> r = new ArrayList<>();

    /* renamed from: s  reason: collision with root package name */
    public int f4199s = 0;

    /* renamed from: t  reason: collision with root package name */
    public boolean f4200t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f4201u = false;

    /* renamed from: v  reason: collision with root package name */
    public ArrayList<d> f4202v = null;
    public ArrayList<Animator> w = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public c f4203x;
    public u y = A;

    public static class a extends u {
        public final Path d(float f9, float f10, float f11, float f12) {
            Path path = new Path();
            path.moveTo(f9, f10);
            path.lineTo(f11, f12);
            return path;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final View f4204a;

        /* renamed from: b  reason: collision with root package name */
        public final String f4205b;

        /* renamed from: c  reason: collision with root package name */
        public final n f4206c;

        /* renamed from: d  reason: collision with root package name */
        public final x f4207d;
        public final h e;

        public b(View view, String str, h hVar, w wVar, n nVar) {
            this.f4204a = view;
            this.f4205b = str;
            this.f4206c = nVar;
            this.f4207d = wVar;
            this.e = hVar;
        }
    }

    public static abstract class c {
    }

    public interface d {
        void a();

        void b();

        void c();

        void d();

        void e(h hVar);
    }

    public static void c(s.c cVar, View view, n nVar) {
        ((p.a) cVar.f7134a).put(view, nVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) cVar.f7135b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, (Object) null);
            } else {
                sparseArray.put(id, view);
            }
        }
        int[] iArr = x.f4957a;
        String k8 = x.h.k(view);
        if (k8 != null) {
            if (((p.a) cVar.f7137d).containsKey(k8)) {
                ((p.a) cVar.f7137d).put(k8, null);
            } else {
                ((p.a) cVar.f7137d).put(k8, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                p.d dVar = (p.d) cVar.f7136c;
                if (dVar.f6221f) {
                    dVar.c();
                }
                if (j.i(dVar.f6222g, dVar.f6224i, itemIdAtPosition) >= 0) {
                    View view2 = (View) dVar.d(itemIdAtPosition, (Long) null);
                    if (view2 != null) {
                        x.c.r(view2, false);
                        dVar.f(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                x.c.r(view, true);
                dVar.f(itemIdAtPosition, view);
            }
        }
    }

    public static p.a<Animator, b> o() {
        ThreadLocal<p.a<Animator, b>> threadLocal = B;
        p.a<Animator, b> aVar = threadLocal.get();
        if (aVar != null) {
            return aVar;
        }
        p.a<Animator, b> aVar2 = new p.a<>();
        threadLocal.set(aVar2);
        return aVar2;
    }

    public static boolean t(n nVar, n nVar2, String str) {
        Object obj = nVar.f4220a.get(str);
        Object obj2 = nVar2.f4220a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(c cVar) {
        this.f4203x = cVar;
    }

    public void B(TimeInterpolator timeInterpolator) {
        this.f4190i = timeInterpolator;
    }

    public void C(u uVar) {
        if (uVar == null) {
            uVar = A;
        }
        this.y = uVar;
    }

    public void D() {
    }

    public void E(long j8) {
        this.f4188g = j8;
    }

    public final void F() {
        if (this.f4199s == 0) {
            ArrayList<d> arrayList = this.f4202v;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f4202v.clone();
                int size = arrayList2.size();
                for (int i8 = 0; i8 < size; i8++) {
                    ((d) arrayList2.get(i8)).a();
                }
            }
            this.f4201u = false;
        }
        this.f4199s++;
    }

    public String G(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f4189h != -1) {
            str2 = str2 + "dur(" + this.f4189h + ") ";
        }
        if (this.f4188g != -1) {
            str2 = str2 + "dly(" + this.f4188g + ") ";
        }
        if (this.f4190i != null) {
            str2 = str2 + "interp(" + this.f4190i + ") ";
        }
        ArrayList<Integer> arrayList = this.f4191j;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f4192k;
        if (size <= 0 && arrayList2.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (arrayList.size() > 0) {
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                if (i8 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + arrayList.get(i8);
            }
        }
        if (arrayList2.size() > 0) {
            for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                if (i9 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + arrayList2.get(i9);
            }
        }
        return str3 + ")";
    }

    public void a(d dVar) {
        if (this.f4202v == null) {
            this.f4202v = new ArrayList<>();
        }
        this.f4202v.add(dVar);
    }

    public void b(View view) {
        this.f4192k.add(view);
    }

    public abstract void d(n nVar);

    public final void e(View view, boolean z8) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                n nVar = new n(view);
                if (z8) {
                    g(nVar);
                } else {
                    d(nVar);
                }
                nVar.f4222c.add(this);
                f(nVar);
                c(z8 ? this.f4193l : this.f4194m, view, nVar);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                    e(viewGroup.getChildAt(i8), z8);
                }
            }
        }
    }

    public void f(n nVar) {
    }

    public abstract void g(n nVar);

    public final void h(ViewGroup viewGroup, boolean z8) {
        i(z8);
        ArrayList<Integer> arrayList = this.f4191j;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f4192k;
        if (size > 0 || arrayList2.size() > 0) {
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                View findViewById = viewGroup.findViewById(arrayList.get(i8).intValue());
                if (findViewById != null) {
                    n nVar = new n(findViewById);
                    if (z8) {
                        g(nVar);
                    } else {
                        d(nVar);
                    }
                    nVar.f4222c.add(this);
                    f(nVar);
                    c(z8 ? this.f4193l : this.f4194m, findViewById, nVar);
                }
            }
            for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                View view = arrayList2.get(i9);
                n nVar2 = new n(view);
                if (z8) {
                    g(nVar2);
                } else {
                    d(nVar2);
                }
                nVar2.f4222c.add(this);
                f(nVar2);
                c(z8 ? this.f4193l : this.f4194m, view, nVar2);
            }
            return;
        }
        e(viewGroup, z8);
    }

    public final void i(boolean z8) {
        s.c cVar;
        if (z8) {
            ((p.a) this.f4193l.f7134a).clear();
            ((SparseArray) this.f4193l.f7135b).clear();
            cVar = this.f4193l;
        } else {
            ((p.a) this.f4194m.f7134a).clear();
            ((SparseArray) this.f4194m.f7135b).clear();
            cVar = this.f4194m;
        }
        ((p.d) cVar.f7136c).a();
    }

    /* renamed from: j */
    public h clone() {
        try {
            h hVar = (h) super.clone();
            hVar.w = new ArrayList<>();
            hVar.f4193l = new s.c(2);
            hVar.f4194m = new s.c(2);
            hVar.f4197p = null;
            hVar.f4198q = null;
            return hVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator k(ViewGroup viewGroup, n nVar, n nVar2) {
        return null;
    }

    public void l(ViewGroup viewGroup, s.c cVar, s.c cVar2, ArrayList<n> arrayList, ArrayList<n> arrayList2) {
        Animator k8;
        Animator animator;
        n nVar;
        View view;
        n nVar2;
        Animator animator2;
        ViewGroup viewGroup2 = viewGroup;
        p.a<Animator, b> o8 = o();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            n nVar3 = arrayList.get(i8);
            n nVar4 = arrayList2.get(i8);
            if (nVar3 != null && !nVar3.f4222c.contains(this)) {
                nVar3 = null;
            }
            if (nVar4 != null && !nVar4.f4222c.contains(this)) {
                nVar4 = null;
            }
            if (!(nVar3 == null && nVar4 == null)) {
                if ((nVar3 == null || nVar4 == null || r(nVar3, nVar4)) && (k8 = k(viewGroup2, nVar3, nVar4)) != null) {
                    if (nVar4 != null) {
                        String[] p8 = p();
                        view = nVar4.f4221b;
                        if (p8 != null && p8.length > 0) {
                            nVar2 = new n(view);
                            n nVar5 = (n) ((p.a) cVar2.f7134a).getOrDefault(view, null);
                            if (nVar5 != null) {
                                int i9 = 0;
                                while (i9 < p8.length) {
                                    HashMap hashMap = nVar2.f4220a;
                                    Animator animator3 = k8;
                                    String str = p8[i9];
                                    hashMap.put(str, nVar5.f4220a.get(str));
                                    i9++;
                                    k8 = animator3;
                                    p8 = p8;
                                }
                            }
                            Animator animator4 = k8;
                            int i10 = o8.f6235h;
                            int i11 = 0;
                            while (true) {
                                if (i11 >= i10) {
                                    animator2 = animator4;
                                    break;
                                }
                                b orDefault = o8.getOrDefault(o8.h(i11), null);
                                if (orDefault.f4206c != null && orDefault.f4204a == view && orDefault.f4205b.equals(this.f4187f) && orDefault.f4206c.equals(nVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i11++;
                            }
                        } else {
                            s.c cVar3 = cVar2;
                            animator2 = k8;
                            nVar2 = null;
                        }
                        animator = animator2;
                        nVar = nVar2;
                    } else {
                        s.c cVar4 = cVar2;
                        view = nVar3.f4221b;
                        animator = k8;
                        nVar = null;
                    }
                    if (animator != null) {
                        String str2 = this.f4187f;
                        Property<View, Float> property = o.f4223a;
                        w wVar = new w(viewGroup2);
                        b bVar = r0;
                        b bVar2 = new b(view, str2, this, wVar, nVar);
                        o8.put(animator, bVar);
                        this.w.add(animator);
                    }
                    i8++;
                    viewGroup2 = viewGroup;
                }
            }
            s.c cVar5 = cVar2;
            i8++;
            viewGroup2 = viewGroup;
        }
        if (sparseIntArray.size() != 0) {
            for (int i12 = 0; i12 < sparseIntArray.size(); i12++) {
                Animator animator5 = this.w.get(sparseIntArray.keyAt(i12));
                animator5.setStartDelay((((long) sparseIntArray.valueAt(i12)) - Long.MAX_VALUE) + animator5.getStartDelay());
            }
        }
    }

    public final void m() {
        int i8 = this.f4199s - 1;
        this.f4199s = i8;
        if (i8 == 0) {
            ArrayList<d> arrayList = this.f4202v;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f4202v.clone();
                int size = arrayList2.size();
                for (int i9 = 0; i9 < size; i9++) {
                    ((d) arrayList2.get(i9)).e(this);
                }
            }
            for (int i10 = 0; i10 < ((p.d) this.f4193l.f7136c).h(); i10++) {
                View view = (View) ((p.d) this.f4193l.f7136c).i(i10);
                if (view != null) {
                    int[] iArr = x.f4957a;
                    x.c.r(view, false);
                }
            }
            for (int i11 = 0; i11 < ((p.d) this.f4194m.f7136c).h(); i11++) {
                View view2 = (View) ((p.d) this.f4194m.f7136c).i(i11);
                if (view2 != null) {
                    int[] iArr2 = x.f4957a;
                    x.c.r(view2, false);
                }
            }
            this.f4201u = true;
        }
    }

    public final n n(View view, boolean z8) {
        m mVar = this.f4195n;
        if (mVar != null) {
            return mVar.n(view, z8);
        }
        ArrayList<n> arrayList = z8 ? this.f4197p : this.f4198q;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                i8 = -1;
                break;
            }
            n nVar = arrayList.get(i8);
            if (nVar == null) {
                return null;
            }
            if (nVar.f4221b == view) {
                break;
            }
            i8++;
        }
        if (i8 < 0) {
            return null;
        }
        return (z8 ? this.f4198q : this.f4197p).get(i8);
    }

    public String[] p() {
        return null;
    }

    public final n q(View view, boolean z8) {
        m mVar = this.f4195n;
        if (mVar != null) {
            return mVar.q(view, z8);
        }
        return (n) ((p.a) (z8 ? this.f4193l : this.f4194m).f7134a).getOrDefault(view, null);
    }

    public boolean r(n nVar, n nVar2) {
        if (nVar == null || nVar2 == null) {
            return false;
        }
        String[] p8 = p();
        if (p8 != null) {
            int length = p8.length;
            int i8 = 0;
            while (i8 < length) {
                if (!t(nVar, nVar2, p8[i8])) {
                    i8++;
                }
            }
            return false;
        }
        for (String t8 : nVar.f4220a.keySet()) {
            if (t(nVar, nVar2, t8)) {
            }
        }
        return false;
        return true;
    }

    public final boolean s(View view) {
        int id = view.getId();
        ArrayList<Integer> arrayList = this.f4191j;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f4192k;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return G("");
    }

    public void u(View view) {
        int i8;
        if (!this.f4201u) {
            p.a<Animator, b> o8 = o();
            int i9 = o8.f6235h;
            Property<View, Float> property = o.f4223a;
            WindowId windowId = view.getWindowId();
            int i10 = i9 - 1;
            while (true) {
                i8 = 0;
                if (i10 < 0) {
                    break;
                }
                b l8 = o8.l(i10);
                if (l8.f4204a != null) {
                    x xVar = l8.f4207d;
                    if ((xVar instanceof w) && ((w) xVar).f4238a.equals(windowId)) {
                        i8 = 1;
                    }
                    if (i8 != 0) {
                        o8.h(i10).pause();
                    }
                }
                i10--;
            }
            ArrayList<d> arrayList = this.f4202v;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f4202v.clone();
                int size = arrayList2.size();
                while (i8 < size) {
                    ((d) arrayList2.get(i8)).b();
                    i8++;
                }
            }
            this.f4200t = true;
        }
    }

    public void v(d dVar) {
        ArrayList<d> arrayList = this.f4202v;
        if (arrayList != null) {
            arrayList.remove(dVar);
            if (this.f4202v.size() == 0) {
                this.f4202v = null;
            }
        }
    }

    public void w(View view) {
        this.f4192k.remove(view);
    }

    public void x(ViewGroup viewGroup) {
        if (this.f4200t) {
            if (!this.f4201u) {
                p.a<Animator, b> o8 = o();
                int i8 = o8.f6235h;
                Property<View, Float> property = o.f4223a;
                WindowId windowId = viewGroup.getWindowId();
                for (int i9 = i8 - 1; i9 >= 0; i9--) {
                    b l8 = o8.l(i9);
                    if (l8.f4204a != null) {
                        x xVar = l8.f4207d;
                        if ((xVar instanceof w) && ((w) xVar).f4238a.equals(windowId)) {
                            o8.h(i9).resume();
                        }
                    }
                }
                ArrayList<d> arrayList = this.f4202v;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f4202v.clone();
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((d) arrayList2.get(i10)).c();
                    }
                }
            }
            this.f4200t = false;
        }
    }

    public void y() {
        F();
        p.a<Animator, b> o8 = o();
        Iterator<Animator> it = this.w.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (o8.containsKey(next)) {
                F();
                if (next != null) {
                    next.addListener(new i(this, o8));
                    long j8 = this.f4189h;
                    if (j8 >= 0) {
                        next.setDuration(j8);
                    }
                    long j9 = this.f4188g;
                    if (j9 >= 0) {
                        next.setStartDelay(j9 + next.getStartDelay());
                    }
                    TimeInterpolator timeInterpolator = this.f4190i;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new j(this));
                    next.start();
                }
            }
        }
        this.w.clear();
        m();
    }

    public void z(long j8) {
        this.f4189h = j8;
    }
}
