package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import e0.c;
import p.f;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f5068a;

    /* renamed from: b  reason: collision with root package name */
    public f<e0.b, MenuItem> f5069b;

    /* renamed from: c  reason: collision with root package name */
    public f<c, SubMenu> f5070c;

    public b(Context context) {
        this.f5068a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof e0.b)) {
            return menuItem;
        }
        e0.b bVar = (e0.b) menuItem;
        if (this.f5069b == null) {
            this.f5069b = new f<>();
        }
        MenuItem orDefault = this.f5069b.getOrDefault(menuItem, null);
        if (orDefault != null) {
            return orDefault;
        }
        c cVar = new c(this.f5068a, bVar);
        this.f5069b.put(bVar, cVar);
        return cVar;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof c)) {
            return subMenu;
        }
        c cVar = (c) subMenu;
        if (this.f5070c == null) {
            this.f5070c = new f<>();
        }
        SubMenu orDefault = this.f5070c.getOrDefault(cVar, null);
        if (orDefault != null) {
            return orDefault;
        }
        g gVar = new g(this.f5068a, cVar);
        this.f5070c.put(cVar, gVar);
        return gVar;
    }
}
