package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import e0.c;

public final class g extends e implements SubMenu {
    public final c e;

    public g(Context context, c cVar) {
        super(context, cVar);
        this.e = cVar;
    }

    public final void clearHeader() {
        this.e.clearHeader();
    }

    public final MenuItem getItem() {
        return c(this.e.getItem());
    }

    public final SubMenu setHeaderIcon(int i8) {
        this.e.setHeaderIcon(i8);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.e.setHeaderIcon(drawable);
        return this;
    }

    public final SubMenu setHeaderTitle(int i8) {
        this.e.setHeaderTitle(i8);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.e.setHeaderTitle(charSequence);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        this.e.setHeaderView(view);
        return this;
    }

    public final SubMenu setIcon(int i8) {
        this.e.setIcon(i8);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.e.setIcon(drawable);
        return this;
    }
}
