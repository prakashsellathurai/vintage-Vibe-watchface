package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;

public abstract class z extends RecyclerView.i {

    /* renamed from: g  reason: collision with root package name */
    public final boolean f1914g = true;

    public final boolean a(RecyclerView.a0 a0Var, RecyclerView.a0 a0Var2, RecyclerView.i.c cVar, RecyclerView.i.c cVar2) {
        int i8;
        int i9;
        int i10 = cVar.f1657a;
        int i11 = cVar.f1658b;
        if (a0Var2.o()) {
            int i12 = cVar.f1657a;
            i8 = cVar.f1658b;
            i9 = i12;
        } else {
            i9 = cVar2.f1657a;
            i8 = cVar2.f1658b;
        }
        k kVar = (k) this;
        if (a0Var == a0Var2) {
            return kVar.g(a0Var, i10, i11, i9, i8);
        }
        View view = a0Var.f1631a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        kVar.l(a0Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        kVar.l(a0Var2);
        View view2 = a0Var2.f1631a;
        view2.setTranslationX((float) (-((int) (((float) (i9 - i10)) - translationX))));
        view2.setTranslationY((float) (-((int) (((float) (i8 - i11)) - translationY))));
        view2.setAlpha(0.0f);
        kVar.f1830k.add(new k.a(a0Var, a0Var2, i10, i11, i9, i8));
        return true;
    }

    public abstract boolean g(RecyclerView.a0 a0Var, int i8, int i9, int i10, int i11);
}
