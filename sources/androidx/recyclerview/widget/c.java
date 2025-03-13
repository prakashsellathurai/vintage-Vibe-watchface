package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import java.util.ArrayList;
import java.util.Iterator;

public final class c implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1787f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ k f1788g;

    public c(k kVar, ArrayList arrayList) {
        this.f1788g = kVar;
        this.f1787f = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.f1787f;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            k kVar = this.f1788g;
            if (hasNext) {
                k.b bVar = (k.b) it.next();
                RecyclerView.a0 a0Var = bVar.f1842a;
                kVar.getClass();
                View view = a0Var.f1631a;
                int i8 = bVar.f1845d - bVar.f1843b;
                int i9 = bVar.e - bVar.f1844c;
                if (i8 != 0) {
                    view.animate().translationX(0.0f);
                }
                if (i9 != 0) {
                    view.animate().translationY(0.0f);
                }
                ViewPropertyAnimator animate = view.animate();
                kVar.f1835p.add(a0Var);
                animate.setDuration(kVar.e).setListener(new h(kVar, a0Var, i8, view, i9, animate)).start();
            } else {
                arrayList.clear();
                kVar.f1832m.remove(arrayList);
                return;
            }
        }
    }
}
