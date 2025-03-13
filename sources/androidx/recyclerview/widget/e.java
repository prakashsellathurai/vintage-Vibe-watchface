package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

public final class e implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1803f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ k f1804g;

    public e(k kVar, ArrayList arrayList) {
        this.f1804g = kVar;
        this.f1803f = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.f1803f;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            k kVar = this.f1804g;
            if (hasNext) {
                RecyclerView.a0 a0Var = (RecyclerView.a0) it.next();
                kVar.getClass();
                View view = a0Var.f1631a;
                ViewPropertyAnimator animate = view.animate();
                kVar.f1834o.add(a0Var);
                animate.alpha(1.0f).setDuration(kVar.f1654c).setListener(new g(view, animate, kVar, a0Var)).start();
            } else {
                arrayList.clear();
                kVar.f1831l.remove(arrayList);
                return;
            }
        }
    }
}
