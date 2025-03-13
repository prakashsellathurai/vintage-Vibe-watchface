package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public final class k extends z {

    /* renamed from: s  reason: collision with root package name */
    public static TimeInterpolator f1826s;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList<RecyclerView.a0> f1827h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList<RecyclerView.a0> f1828i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList<b> f1829j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList<a> f1830k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList<ArrayList<RecyclerView.a0>> f1831l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList<ArrayList<b>> f1832m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList<ArrayList<a>> f1833n = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList<RecyclerView.a0> f1834o = new ArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList<RecyclerView.a0> f1835p = new ArrayList<>();

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList<RecyclerView.a0> f1836q = new ArrayList<>();
    public final ArrayList<RecyclerView.a0> r = new ArrayList<>();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.a0 f1837a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.a0 f1838b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1839c;

        /* renamed from: d  reason: collision with root package name */
        public final int f1840d;
        public final int e;

        /* renamed from: f  reason: collision with root package name */
        public final int f1841f;

        public a(RecyclerView.a0 a0Var, RecyclerView.a0 a0Var2, int i8, int i9, int i10, int i11) {
            this.f1837a = a0Var;
            this.f1838b = a0Var2;
            this.f1839c = i8;
            this.f1840d = i9;
            this.e = i10;
            this.f1841f = i11;
        }

        public final String toString() {
            return "ChangeInfo{oldHolder=" + this.f1837a + ", newHolder=" + this.f1838b + ", fromX=" + this.f1839c + ", fromY=" + this.f1840d + ", toX=" + this.e + ", toY=" + this.f1841f + '}';
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final RecyclerView.a0 f1842a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1843b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1844c;

        /* renamed from: d  reason: collision with root package name */
        public final int f1845d;
        public final int e;

        public b(RecyclerView.a0 a0Var, int i8, int i9, int i10, int i11) {
            this.f1842a = a0Var;
            this.f1843b = i8;
            this.f1844c = i9;
            this.f1845d = i10;
            this.e = i11;
        }
    }

    public static void h(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((RecyclerView.a0) arrayList.get(size)).f1631a.animate().cancel();
            } else {
                return;
            }
        }
    }

    public final void d(RecyclerView.a0 a0Var) {
        View view = a0Var.f1631a;
        view.animate().cancel();
        ArrayList<b> arrayList = this.f1829j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (arrayList.get(size).f1842a == a0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(a0Var);
                arrayList.remove(size);
            }
        }
        j(a0Var, this.f1830k);
        if (this.f1827h.remove(a0Var)) {
            view.setAlpha(1.0f);
            c(a0Var);
        }
        if (this.f1828i.remove(a0Var)) {
            view.setAlpha(1.0f);
            c(a0Var);
        }
        ArrayList<ArrayList<a>> arrayList2 = this.f1833n;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList3 = arrayList2.get(size2);
            j(a0Var, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList<ArrayList<b>> arrayList4 = this.f1832m;
        int size3 = arrayList4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList5 = arrayList4.get(size3);
            int size4 = arrayList5.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (((b) arrayList5.get(size4)).f1842a == a0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(a0Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                }
            }
        }
        ArrayList<ArrayList<RecyclerView.a0>> arrayList6 = this.f1831l;
        int size5 = arrayList6.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList arrayList7 = arrayList6.get(size5);
                if (arrayList7.remove(a0Var)) {
                    view.setAlpha(1.0f);
                    c(a0Var);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(size5);
                    }
                }
            } else {
                this.f1836q.remove(a0Var);
                this.f1834o.remove(a0Var);
                this.r.remove(a0Var);
                this.f1835p.remove(a0Var);
                i();
                return;
            }
        }
    }

    public final void e() {
        ArrayList<b> arrayList = this.f1829j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar = arrayList.get(size);
            View view = bVar.f1842a.f1631a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(bVar.f1842a);
            arrayList.remove(size);
        }
        ArrayList<RecyclerView.a0> arrayList2 = this.f1827h;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            c(arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList<RecyclerView.a0> arrayList3 = this.f1828i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.a0 a0Var = arrayList3.get(size3);
            a0Var.f1631a.setAlpha(1.0f);
            c(a0Var);
            arrayList3.remove(size3);
        }
        ArrayList<a> arrayList4 = this.f1830k;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            a aVar = arrayList4.get(size4);
            RecyclerView.a0 a0Var2 = aVar.f1837a;
            if (a0Var2 != null) {
                k(aVar, a0Var2);
            }
            RecyclerView.a0 a0Var3 = aVar.f1838b;
            if (a0Var3 != null) {
                k(aVar, a0Var3);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList<ArrayList<b>> arrayList5 = this.f1832m;
            int size5 = arrayList5.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                ArrayList arrayList6 = arrayList5.get(size5);
                int size6 = arrayList6.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        b bVar2 = (b) arrayList6.get(size6);
                        View view2 = bVar2.f1842a.f1631a;
                        view2.setTranslationY(0.0f);
                        view2.setTranslationX(0.0f);
                        c(bVar2.f1842a);
                        arrayList6.remove(size6);
                        if (arrayList6.isEmpty()) {
                            arrayList5.remove(arrayList6);
                        }
                    }
                }
            }
            ArrayList<ArrayList<RecyclerView.a0>> arrayList7 = this.f1831l;
            int size7 = arrayList7.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                ArrayList arrayList8 = arrayList7.get(size7);
                int size8 = arrayList8.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        RecyclerView.a0 a0Var4 = (RecyclerView.a0) arrayList8.get(size8);
                        a0Var4.f1631a.setAlpha(1.0f);
                        c(a0Var4);
                        arrayList8.remove(size8);
                        if (arrayList8.isEmpty()) {
                            arrayList7.remove(arrayList8);
                        }
                    }
                }
            }
            ArrayList<ArrayList<a>> arrayList9 = this.f1833n;
            int size9 = arrayList9.size();
            while (true) {
                size9--;
                if (size9 < 0) {
                    break;
                }
                ArrayList arrayList10 = arrayList9.get(size9);
                int size10 = arrayList10.size();
                while (true) {
                    size10--;
                    if (size10 >= 0) {
                        a aVar2 = (a) arrayList10.get(size10);
                        RecyclerView.a0 a0Var5 = aVar2.f1837a;
                        if (a0Var5 != null) {
                            k(aVar2, a0Var5);
                        }
                        RecyclerView.a0 a0Var6 = aVar2.f1838b;
                        if (a0Var6 != null) {
                            k(aVar2, a0Var6);
                        }
                        if (arrayList10.isEmpty()) {
                            arrayList9.remove(arrayList10);
                        }
                    }
                }
            }
            h(this.f1836q);
            h(this.f1835p);
            h(this.f1834o);
            h(this.r);
            ArrayList<RecyclerView.i.a> arrayList11 = this.f1653b;
            int size11 = arrayList11.size();
            for (int i8 = 0; i8 < size11; i8++) {
                arrayList11.get(i8).a();
            }
            arrayList11.clear();
        }
    }

    public final boolean f() {
        return !this.f1828i.isEmpty() || !this.f1830k.isEmpty() || !this.f1829j.isEmpty() || !this.f1827h.isEmpty() || !this.f1835p.isEmpty() || !this.f1836q.isEmpty() || !this.f1834o.isEmpty() || !this.r.isEmpty() || !this.f1832m.isEmpty() || !this.f1831l.isEmpty() || !this.f1833n.isEmpty();
    }

    public final boolean g(RecyclerView.a0 a0Var, int i8, int i9, int i10, int i11) {
        View view = a0Var.f1631a;
        int translationX = i8 + ((int) view.getTranslationX());
        int translationY = i9 + ((int) a0Var.f1631a.getTranslationY());
        l(a0Var);
        int i12 = i10 - translationX;
        int i13 = i11 - translationY;
        if (i12 == 0 && i13 == 0) {
            c(a0Var);
            return false;
        }
        if (i12 != 0) {
            view.setTranslationX((float) (-i12));
        }
        if (i13 != 0) {
            view.setTranslationY((float) (-i13));
        }
        this.f1829j.add(new b(a0Var, translationX, translationY, i10, i11));
        return true;
    }

    public final void i() {
        if (!f()) {
            ArrayList<RecyclerView.i.a> arrayList = this.f1653b;
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                arrayList.get(i8).a();
            }
            arrayList.clear();
        }
    }

    public final void j(RecyclerView.a0 a0Var, ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                a aVar = (a) arrayList.get(size);
                if (k(aVar, a0Var) && aVar.f1837a == null && aVar.f1838b == null) {
                    arrayList.remove(aVar);
                }
            } else {
                return;
            }
        }
    }

    public final boolean k(a aVar, RecyclerView.a0 a0Var) {
        if (aVar.f1838b == a0Var) {
            aVar.f1838b = null;
        } else if (aVar.f1837a != a0Var) {
            return false;
        } else {
            aVar.f1837a = null;
        }
        a0Var.f1631a.setAlpha(1.0f);
        View view = a0Var.f1631a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(a0Var);
        return true;
    }

    public final void l(RecyclerView.a0 a0Var) {
        if (f1826s == null) {
            f1826s = new ValueAnimator().getInterpolator();
        }
        a0Var.f1631a.animate().setInterpolator(f1826s);
        d(a0Var);
    }
}
