package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class s extends t {
    public s(RecyclerView.l lVar) {
        super(lVar);
    }

    public final int b(View view) {
        this.f1905a.getClass();
        return view.getBottom() + RecyclerView.l.u(view) + ((RecyclerView.m) view.getLayoutParams()).bottomMargin;
    }

    public final int c(View view) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        this.f1905a.getClass();
        Rect rect = ((RecyclerView.m) view.getLayoutParams()).f1681b;
        return view.getMeasuredHeight() + rect.top + rect.bottom + mVar.topMargin + mVar.bottomMargin;
    }

    public final int d(View view) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        this.f1905a.getClass();
        Rect rect = ((RecyclerView.m) view.getLayoutParams()).f1681b;
        return view.getMeasuredWidth() + rect.left + rect.right + mVar.leftMargin + mVar.rightMargin;
    }

    public final int e(View view) {
        this.f1905a.getClass();
        return (view.getTop() - RecyclerView.l.L(view)) - ((RecyclerView.m) view.getLayoutParams()).topMargin;
    }

    public final int f() {
        return this.f1905a.f1673o;
    }

    public final int g() {
        RecyclerView.l lVar = this.f1905a;
        return lVar.f1673o - lVar.D();
    }

    public final int h() {
        return this.f1905a.D();
    }

    public final int i() {
        return this.f1905a.f1671m;
    }

    public final int j() {
        return this.f1905a.f1670l;
    }

    public final int k() {
        return this.f1905a.G();
    }

    public final int l() {
        RecyclerView.l lVar = this.f1905a;
        return (lVar.f1673o - lVar.G()) - lVar.D();
    }

    public final int n(View view) {
        RecyclerView.l lVar = this.f1905a;
        Rect rect = this.f1907c;
        lVar.M(view, rect);
        return rect.bottom;
    }

    public final int o(View view) {
        RecyclerView.l lVar = this.f1905a;
        Rect rect = this.f1907c;
        lVar.M(view, rect);
        return rect.top;
    }

    public final void p(int i8) {
        this.f1905a.R(i8);
    }
}
