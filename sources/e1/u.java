package e1;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.health.services.client.R;
import e1.h;
import java.util.ArrayList;

public final class u extends k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f4224a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f4225b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f4226c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ v f4227d;

    public u(v vVar, ViewGroup viewGroup, View view, View view2) {
        this.f4227d = vVar;
        this.f4224a = viewGroup;
        this.f4225b = view;
        this.f4226c = view2;
    }

    public final void b() {
        this.f4224a.getOverlay().remove(this.f4225b);
    }

    public final void c() {
        View view = this.f4225b;
        if (view.getParent() == null) {
            this.f4224a.getOverlay().add(view);
            return;
        }
        v vVar = this.f4227d;
        ArrayList<Animator> arrayList = vVar.r;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            arrayList.get(size).cancel();
        }
        ArrayList<h.d> arrayList2 = vVar.f4202v;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList arrayList3 = (ArrayList) vVar.f4202v.clone();
            int size2 = arrayList3.size();
            for (int i8 = 0; i8 < size2; i8++) {
                ((h.d) arrayList3.get(i8)).d();
            }
        }
    }

    public final void e(h hVar) {
        this.f4226c.setTag(R.id.save_overlay_view, (Object) null);
        this.f4224a.getOverlay().remove(this.f4225b);
        hVar.v(this);
    }
}
