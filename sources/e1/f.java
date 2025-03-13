package e1;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.p0;
import androidx.health.services.client.R;
import e1.h;
import e1.l;
import j0.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressLint({"RestrictedApi"})
public class f extends p0 {

    public class a implements h.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f4178a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f4179b;

        public a(View view, ArrayList arrayList) {
            this.f4178a = view;
            this.f4179b = arrayList;
        }

        public final void a() {
        }

        public final void b() {
        }

        public final void c() {
        }

        public final void d() {
        }

        public final void e(h hVar) {
            hVar.v(this);
            this.f4178a.setVisibility(8);
            ArrayList arrayList = this.f4179b;
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                ((View) arrayList.get(i8)).setVisibility(0);
            }
        }
    }

    public class b extends k {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f4180a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f4181b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Object f4182c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ArrayList f4183d;
        public final /* synthetic */ Object e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ArrayList f4184f;

        public b(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f4180a = obj;
            this.f4181b = arrayList;
            this.f4182c = obj2;
            this.f4183d = arrayList2;
            this.e = obj3;
            this.f4184f = arrayList3;
        }

        public final void a() {
            f fVar = f.this;
            Object obj = this.f4180a;
            if (obj != null) {
                fVar.u(obj, this.f4181b, (ArrayList<View>) null);
            }
            Object obj2 = this.f4182c;
            if (obj2 != null) {
                fVar.u(obj2, this.f4183d, (ArrayList<View>) null);
            }
            Object obj3 = this.e;
            if (obj3 != null) {
                fVar.u(obj3, this.f4184f, (ArrayList<View>) null);
            }
        }

        public final void e(h hVar) {
            hVar.v(this);
        }
    }

    public class c extends h.c {
    }

    public final void a(View view, Object obj) {
        if (obj != null) {
            ((h) obj).b(view);
        }
    }

    public final void b(Object obj, ArrayList<View> arrayList) {
        h hVar = (h) obj;
        if (hVar != null) {
            int i8 = 0;
            if (hVar instanceof m) {
                m mVar = (m) hVar;
                int size = mVar.C.size();
                while (i8 < size) {
                    b((i8 < 0 || i8 >= mVar.C.size()) ? null : mVar.C.get(i8), arrayList);
                    i8++;
                }
                return;
            }
            if (!(!p0.h(hVar.f4191j) || !p0.h((List) null) || !p0.h((List) null)) && p0.h(hVar.f4192k)) {
                int size2 = arrayList.size();
                while (i8 < size2) {
                    hVar.b(arrayList.get(i8));
                    i8++;
                }
            }
        }
    }

    public final void c(ViewGroup viewGroup, Object obj) {
        h hVar = (h) obj;
        ArrayList<ViewGroup> arrayList = l.f4213c;
        if (!arrayList.contains(viewGroup)) {
            int[] iArr = x.f4957a;
            if (x.f.c(viewGroup)) {
                arrayList.add(viewGroup);
                if (hVar == null) {
                    hVar = l.f4211a;
                }
                h j8 = hVar.clone();
                ArrayList orDefault = l.a().getOrDefault(viewGroup, null);
                if (orDefault != null && orDefault.size() > 0) {
                    Iterator it = orDefault.iterator();
                    while (it.hasNext()) {
                        ((h) it.next()).u(viewGroup);
                    }
                }
                if (j8 != null) {
                    j8.h(viewGroup, true);
                }
                if (((g) viewGroup.getTag(R.id.transition_current_scene)) == null) {
                    viewGroup.setTag(R.id.transition_current_scene, (Object) null);
                    if (j8 != null) {
                        l.a aVar = new l.a(viewGroup, j8);
                        viewGroup.addOnAttachStateChangeListener(aVar);
                        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
                        return;
                    }
                    return;
                }
                throw null;
            }
        }
    }

    public final boolean e(Object obj) {
        return obj instanceof h;
    }

    public final Object f(Object obj) {
        if (obj != null) {
            return ((h) obj).clone();
        }
        return null;
    }

    public final Object i(Object obj, Object obj2, Object obj3) {
        h hVar = (h) obj;
        h hVar2 = (h) obj2;
        h hVar3 = (h) obj3;
        if (hVar != null && hVar2 != null) {
            m mVar = new m();
            mVar.H(hVar);
            mVar.H(hVar2);
            mVar.D = false;
            hVar = mVar;
        } else if (hVar == null) {
            hVar = hVar2 != null ? hVar2 : null;
        }
        if (hVar3 == null) {
            return hVar;
        }
        m mVar2 = new m();
        if (hVar != null) {
            mVar2.H(hVar);
        }
        mVar2.H(hVar3);
        return mVar2;
    }

    public final Object j(Object obj, Object obj2, Object obj3) {
        m mVar = new m();
        if (obj != null) {
            mVar.H((h) obj);
        }
        if (obj2 != null) {
            mVar.H((h) obj2);
        }
        if (obj3 != null) {
            mVar.H((h) obj3);
        }
        return mVar;
    }

    public final void l(Object obj, View view, ArrayList<View> arrayList) {
        ((h) obj).a(new a(view, arrayList));
    }

    public final void m(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((h) obj).a(new b(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public final void n(View view, Object obj) {
        if (view != null) {
            p0.g(view, new Rect());
            ((h) obj).A(new e());
        }
    }

    public final void o(Object obj, Rect rect) {
        if (obj != null) {
            ((h) obj).A(new c());
        }
    }

    public final void r(Object obj, View view, ArrayList<View> arrayList) {
        m mVar = (m) obj;
        ArrayList<View> arrayList2 = mVar.f4192k;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            p0.d(arrayList.get(i8), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(mVar, arrayList);
    }

    public final void s(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        m mVar = (m) obj;
        if (mVar != null) {
            ArrayList<View> arrayList3 = mVar.f4192k;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            u(mVar, arrayList, arrayList2);
        }
    }

    public final Object t(Object obj) {
        if (obj == null) {
            return null;
        }
        m mVar = new m();
        mVar.H((h) obj);
        return mVar;
    }

    public final void u(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        h hVar = (h) obj;
        int i8 = 0;
        if (hVar instanceof m) {
            m mVar = (m) hVar;
            int size = mVar.C.size();
            while (i8 < size) {
                u((i8 < 0 || i8 >= mVar.C.size()) ? null : mVar.C.get(i8), arrayList, arrayList2);
                i8++;
            }
            return;
        }
        if (!(!p0.h(hVar.f4191j) || !p0.h((List) null) || !p0.h((List) null))) {
            ArrayList<View> arrayList3 = hVar.f4192k;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i8 < size2) {
                    hVar.b(arrayList2.get(i8));
                    i8++;
                }
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 >= 0) {
                        hVar.w(arrayList.get(size3));
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
