package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public final class m0 extends p0 {

    public class a implements Transition.TransitionListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f1245a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1246b;

        public a(View view, ArrayList arrayList) {
            this.f1245a = view;
            this.f1246b = arrayList;
        }

        public final void onTransitionCancel(Transition transition) {
        }

        public final void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f1245a.setVisibility(8);
            ArrayList arrayList = this.f1246b;
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                ((View) arrayList.get(i8)).setVisibility(0);
            }
        }

        public final void onTransitionPause(Transition transition) {
        }

        public final void onTransitionResume(Transition transition) {
        }

        public final void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    public class b implements Transition.TransitionListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f1247a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1248b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Object f1249c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1250d;
        public final /* synthetic */ Object e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1251f;

        public b(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f1247a = obj;
            this.f1248b = arrayList;
            this.f1249c = obj2;
            this.f1250d = arrayList2;
            this.e = obj3;
            this.f1251f = arrayList3;
        }

        public final void onTransitionCancel(Transition transition) {
        }

        public final void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        public final void onTransitionPause(Transition transition) {
        }

        public final void onTransitionResume(Transition transition) {
        }

        public final void onTransitionStart(Transition transition) {
            m0 m0Var = m0.this;
            Object obj = this.f1247a;
            if (obj != null) {
                m0Var.v(obj, this.f1248b, (ArrayList<View>) null);
            }
            Object obj2 = this.f1249c;
            if (obj2 != null) {
                m0Var.v(obj2, this.f1250d, (ArrayList<View>) null);
            }
            Object obj3 = this.e;
            if (obj3 != null) {
                m0Var.v(obj3, this.f1251f, (ArrayList<View>) null);
            }
        }
    }

    public class c extends Transition.EpicenterCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Rect f1253a;

        public c(Rect rect) {
            this.f1253a = rect;
        }

        public final Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f1253a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return rect;
        }
    }

    public static boolean u(Transition transition) {
        return !p0.h(transition.getTargetIds()) || !p0.h(transition.getTargetNames()) || !p0.h(transition.getTargetTypes());
    }

    public final void a(View view, Object obj) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    public final void b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i8 = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i8 < transitionCount) {
                    b(transitionSet.getTransitionAt(i8), arrayList);
                    i8++;
                }
            } else if (!u(transition) && p0.h(transition.getTargets())) {
                int size = arrayList.size();
                while (i8 < size) {
                    transition.addTarget(arrayList.get(i8));
                    i8++;
                }
            }
        }
    }

    public final void c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    public final boolean e(Object obj) {
        return obj instanceof Transition;
    }

    public final Object f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    public final Object i(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    public final Object j(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    public final void l(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new a(view, arrayList));
    }

    public final void m(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new b(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public final void n(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            p0.g(view, rect);
            ((Transition) obj).setEpicenterCallback(new l0(rect));
        }
    }

    public final void o(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new c(rect));
        }
    }

    public final void p(Object obj, Runnable runnable) {
        ((Transition) obj).addListener(new n0(runnable));
    }

    public final void r(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            p0.d(arrayList.get(i8), targets);
        }
        targets.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    public final void s(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            v(transitionSet, arrayList, arrayList2);
        }
    }

    public final Object t(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    public final void v(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i8 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i8 < transitionCount) {
                v(transitionSet.getTransitionAt(i8), arrayList, arrayList2);
                i8++;
            }
        } else if (!u(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i8 < size) {
                transition.addTarget(arrayList2.get(i8));
                i8++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }
}
