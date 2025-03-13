package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import java.util.ArrayList;
import java.util.Iterator;

public final class d implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1795f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ k f1796g;

    public d(k kVar, ArrayList arrayList) {
        this.f1796g = kVar;
        this.f1795f = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.f1795f;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            k kVar = this.f1796g;
            if (hasNext) {
                k.a aVar = (k.a) it.next();
                kVar.getClass();
                RecyclerView.a0 a0Var = aVar.f1837a;
                View view = null;
                View view2 = a0Var == null ? null : a0Var.f1631a;
                RecyclerView.a0 a0Var2 = aVar.f1838b;
                if (a0Var2 != null) {
                    view = a0Var2.f1631a;
                }
                ArrayList<RecyclerView.a0> arrayList2 = kVar.r;
                long j8 = kVar.f1656f;
                if (view2 != null) {
                    ViewPropertyAnimator duration = view2.animate().setDuration(j8);
                    arrayList2.add(aVar.f1837a);
                    duration.translationX((float) (aVar.e - aVar.f1839c));
                    duration.translationY((float) (aVar.f1841f - aVar.f1840d));
                    duration.alpha(0.0f).setListener(new i(kVar, aVar, duration, view2)).start();
                }
                if (view != null) {
                    ViewPropertyAnimator animate = view.animate();
                    arrayList2.add(aVar.f1838b);
                    animate.translationX(0.0f).translationY(0.0f).setDuration(j8).alpha(1.0f).setListener(new j(kVar, aVar, animate, view)).start();
                }
            } else {
                arrayList.clear();
                kVar.f1833n.remove(arrayList);
                return;
            }
        }
    }
}
