package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import j0.s;
import j0.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p.f;

@SuppressLint({"UnknownNullness"})
public abstract class p0 {
    public static void d(View view, List list) {
        boolean z8;
        boolean z9;
        int size = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                z8 = false;
                break;
            } else if (list.get(i8) == view) {
                z8 = true;
                break;
            } else {
                i8++;
            }
        }
        if (!z8) {
            int[] iArr = x.f4957a;
            if (x.h.k(view) != null) {
                list.add(view);
            }
            for (int i9 = size; i9 < list.size(); i9++) {
                View view2 = (View) list.get(i9);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = viewGroup.getChildAt(i10);
                        int i11 = 0;
                        while (true) {
                            if (i11 >= size) {
                                z9 = false;
                                break;
                            } else if (list.get(i11) == childAt) {
                                z9 = true;
                                break;
                            } else {
                                i11++;
                            }
                        }
                        if (!z9 && x.h.k(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    public static void g(View view, Rect rect) {
        int[] iArr = x.f4957a;
        if (x.f.b(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                view2.getMatrix().mapRect(rectF);
                rectF.offset((float) view2.getLeft(), (float) view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr2 = new int[2];
            view.getRootView().getLocationOnScreen(iArr2);
            rectF.offset((float) iArr2[0], (float) iArr2[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public static boolean h(List list) {
        return list == null || list.isEmpty();
    }

    public static ArrayList k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            View view = (View) arrayList.get(i8);
            int[] iArr = x.f4957a;
            arrayList2.add(x.h.k(view));
            x.h.v(view, (String) null);
        }
        return arrayList2;
    }

    public static void q(ViewGroup viewGroup, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Map map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i8 = 0; i8 < size; i8++) {
            View view = (View) arrayList.get(i8);
            int[] iArr = x.f4957a;
            String k8 = x.h.k(view);
            arrayList4.add(k8);
            if (k8 != null) {
                x.h.v(view, (String) null);
                String str = (String) ((f) map).getOrDefault(k8, null);
                int i9 = 0;
                while (true) {
                    if (i9 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i9))) {
                        x.h.v((View) arrayList2.get(i9), k8);
                        break;
                    } else {
                        i9++;
                    }
                }
            }
        }
        s.a(viewGroup, new o0(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void a(View view, Object obj);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    public abstract Object f(Object obj);

    public abstract Object i(Object obj, Object obj2, Object obj3);

    public abstract Object j(Object obj, Object obj2, Object obj3);

    public abstract void l(Object obj, View view, ArrayList<View> arrayList);

    public abstract void m(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void n(View view, Object obj);

    public abstract void o(Object obj, Rect rect);

    public void p(Object obj, Runnable runnable) {
        runnable.run();
    }

    public abstract void r(Object obj, View view, ArrayList<View> arrayList);

    public abstract void s(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object t(Object obj);
}
