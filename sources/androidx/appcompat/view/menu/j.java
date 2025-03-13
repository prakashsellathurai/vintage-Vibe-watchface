package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public final class j extends d implements SubMenu {
    public final d w;

    /* renamed from: x  reason: collision with root package name */
    public final e f473x;

    public j(Context context, d dVar, e eVar) {
        super(context);
        this.w = dVar;
        this.f473x = eVar;
    }

    public final boolean d(e eVar) {
        return this.w.d(eVar);
    }

    public final boolean e(d dVar, MenuItem menuItem) {
        return super.e(dVar, menuItem) || this.w.e(dVar, menuItem);
    }

    public final boolean f(e eVar) {
        return this.w.f(eVar);
    }

    public final MenuItem getItem() {
        return this.f473x;
    }

    public final d j() {
        return this.w.j();
    }

    public final boolean l() {
        return this.w.l();
    }

    public final boolean m() {
        return this.w.m();
    }

    public final boolean n() {
        return this.w.n();
    }

    public final void setGroupDividerEnabled(boolean z8) {
        this.w.setGroupDividerEnabled(z8);
    }

    public final SubMenu setHeaderIcon(int i8) {
        r(0, (CharSequence) null, i8, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(int i8) {
        r(i8, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        r(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    public final SubMenu setIcon(int i8) {
        this.f473x.setIcon(i8);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.f473x.setIcon(drawable);
        return this;
    }

    public final void setQwertyMode(boolean z8) {
        this.w.setQwertyMode(z8);
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        r(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        r(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }
}
