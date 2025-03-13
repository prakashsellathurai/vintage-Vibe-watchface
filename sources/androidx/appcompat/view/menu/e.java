package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import e0.b;
import j0.b;
import java.util.ArrayList;

public final class e implements b {
    public j0.b A;
    public MenuItem.OnActionExpandListener B;
    public boolean C = false;

    /* renamed from: a  reason: collision with root package name */
    public final int f418a;

    /* renamed from: b  reason: collision with root package name */
    public final int f419b;

    /* renamed from: c  reason: collision with root package name */
    public final int f420c;

    /* renamed from: d  reason: collision with root package name */
    public final int f421d;
    public CharSequence e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f422f;

    /* renamed from: g  reason: collision with root package name */
    public Intent f423g;

    /* renamed from: h  reason: collision with root package name */
    public char f424h;

    /* renamed from: i  reason: collision with root package name */
    public int f425i = 4096;

    /* renamed from: j  reason: collision with root package name */
    public char f426j;

    /* renamed from: k  reason: collision with root package name */
    public int f427k = 4096;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f428l;

    /* renamed from: m  reason: collision with root package name */
    public int f429m = 0;

    /* renamed from: n  reason: collision with root package name */
    public final d f430n;

    /* renamed from: o  reason: collision with root package name */
    public j f431o;

    /* renamed from: p  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f432p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f433q;
    public CharSequence r;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f434s = null;

    /* renamed from: t  reason: collision with root package name */
    public PorterDuff.Mode f435t = null;

    /* renamed from: u  reason: collision with root package name */
    public boolean f436u = false;

    /* renamed from: v  reason: collision with root package name */
    public boolean f437v = false;
    public boolean w = false;

    /* renamed from: x  reason: collision with root package name */
    public int f438x = 16;
    public int y;

    /* renamed from: z  reason: collision with root package name */
    public View f439z;

    public class a implements b.a {
        public a() {
        }
    }

    public e(d dVar, int i8, int i9, int i10, int i11, CharSequence charSequence, int i12) {
        this.f430n = dVar;
        this.f418a = i9;
        this.f419b = i8;
        this.f420c = i10;
        this.f421d = i11;
        this.e = charSequence;
        this.y = i12;
    }

    public static void c(StringBuilder sb, int i8, int i9, String str) {
        if ((i8 & i9) == i9) {
            sb.append(str);
        }
    }

    public final e0.b a(j0.b bVar) {
        j0.b bVar2 = this.A;
        if (bVar2 != null) {
            bVar2.f4920a = null;
        }
        this.f439z = null;
        this.A = bVar;
        this.f430n.o(true);
        j0.b bVar3 = this.A;
        if (bVar3 != null) {
            bVar3.h(new a());
        }
        return this;
    }

    public final j0.b b() {
        return this.A;
    }

    public final boolean collapseActionView() {
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.f439z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f430n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.w && (this.f436u || this.f437v)) {
            drawable = drawable.mutate();
            if (this.f436u) {
                d0.b.h(drawable, this.f434s);
            }
            if (this.f437v) {
                d0.b.i(drawable, this.f435t);
            }
            this.w = false;
        }
        return drawable;
    }

    public final boolean e() {
        j0.b bVar;
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.f439z == null && (bVar = this.A) != null) {
            this.f439z = bVar.d(this);
        }
        return this.f439z != null;
    }

    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f430n.f(this);
        }
        return false;
    }

    public final void f(boolean z8) {
        this.f438x = z8 ? this.f438x | 32 : this.f438x & -33;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final View getActionView() {
        View view = this.f439z;
        if (view != null) {
            return view;
        }
        j0.b bVar = this.A;
        if (bVar == null) {
            return null;
        }
        View d9 = bVar.d(this);
        this.f439z = d9;
        return d9;
    }

    public final int getAlphabeticModifiers() {
        return this.f427k;
    }

    public final char getAlphabeticShortcut() {
        return this.f426j;
    }

    public final CharSequence getContentDescription() {
        return this.f433q;
    }

    public final int getGroupId() {
        return this.f419b;
    }

    public final Drawable getIcon() {
        Drawable drawable = this.f428l;
        if (drawable != null) {
            return d(drawable);
        }
        int i8 = this.f429m;
        if (i8 == 0) {
            return null;
        }
        Drawable a9 = g.a.a(this.f430n.f399a, i8);
        this.f429m = 0;
        this.f428l = a9;
        return d(a9);
    }

    public final ColorStateList getIconTintList() {
        return this.f434s;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f435t;
    }

    public final Intent getIntent() {
        return this.f423g;
    }

    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f418a;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.f425i;
    }

    public final char getNumericShortcut() {
        return this.f424h;
    }

    public final int getOrder() {
        return this.f420c;
    }

    public final SubMenu getSubMenu() {
        return this.f431o;
    }

    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.e;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f422f;
        return charSequence != null ? charSequence : this.e;
    }

    public final CharSequence getTooltipText() {
        return this.r;
    }

    public final boolean hasSubMenu() {
        return this.f431o != null;
    }

    public final boolean isActionViewExpanded() {
        return this.C;
    }

    public final boolean isCheckable() {
        return (this.f438x & 1) == 1;
    }

    public final boolean isChecked() {
        return (this.f438x & 2) == 2;
    }

    public final boolean isEnabled() {
        return (this.f438x & 16) != 0;
    }

    public final boolean isVisible() {
        j0.b bVar = this.A;
        return (bVar == null || !bVar.g()) ? (this.f438x & 8) == 0 : (this.f438x & 8) == 0 && this.A.b();
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final MenuItem setActionView(int i8) {
        int i9;
        d dVar = this.f430n;
        Context context = dVar.f399a;
        View inflate = LayoutInflater.from(context).inflate(i8, new LinearLayout(context), false);
        this.f439z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i9 = this.f418a) > 0) {
            inflate.setId(i9);
        }
        dVar.f408k = true;
        dVar.o(true);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c9) {
        if (this.f426j == c9) {
            return this;
        }
        this.f426j = Character.toLowerCase(c9);
        this.f430n.o(false);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c9, int i8) {
        if (this.f426j == c9 && this.f427k == i8) {
            return this;
        }
        this.f426j = Character.toLowerCase(c9);
        this.f427k = KeyEvent.normalizeMetaState(i8);
        this.f430n.o(false);
        return this;
    }

    public final MenuItem setCheckable(boolean z8) {
        int i8 = this.f438x;
        boolean z9 = z8 | (i8 & true);
        this.f438x = z9 ? 1 : 0;
        if (i8 != z9) {
            this.f430n.o(false);
        }
        return this;
    }

    public final MenuItem setChecked(boolean z8) {
        int i8 = this.f438x;
        int i9 = i8 & 4;
        d dVar = this.f430n;
        int i10 = 2;
        if (i9 != 0) {
            dVar.getClass();
            ArrayList<e> arrayList = dVar.f403f;
            int size = arrayList.size();
            dVar.t();
            for (int i11 = 0; i11 < size; i11++) {
                e eVar = arrayList.get(i11);
                if (eVar.f419b == this.f419b) {
                    boolean z9 = true;
                    if (((eVar.f438x & 4) != 0) && eVar.isCheckable()) {
                        if (eVar != this) {
                            z9 = false;
                        }
                        int i12 = eVar.f438x;
                        int i13 = (z9 ? 2 : 0) | (i12 & -3);
                        eVar.f438x = i13;
                        if (i12 != i13) {
                            eVar.f430n.o(false);
                        }
                    }
                }
            }
            dVar.s();
        } else {
            int i14 = i8 & -3;
            if (!z8) {
                i10 = 0;
            }
            int i15 = i10 | i14;
            this.f438x = i15;
            if (i8 != i15) {
                dVar.o(false);
            }
        }
        return this;
    }

    public final e0.b setContentDescription(CharSequence charSequence) {
        this.f433q = charSequence;
        this.f430n.o(false);
        return this;
    }

    public final MenuItem setEnabled(boolean z8) {
        this.f438x = z8 ? this.f438x | 16 : this.f438x & -17;
        this.f430n.o(false);
        return this;
    }

    public final MenuItem setIcon(int i8) {
        this.f428l = null;
        this.f429m = i8;
        this.w = true;
        this.f430n.o(false);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f429m = 0;
        this.f428l = drawable;
        this.w = true;
        this.f430n.o(false);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f434s = colorStateList;
        this.f436u = true;
        this.w = true;
        this.f430n.o(false);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f435t = mode;
        this.f437v = true;
        this.w = true;
        this.f430n.o(false);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f423g = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c9) {
        if (this.f424h == c9) {
            return this;
        }
        this.f424h = c9;
        this.f430n.o(false);
        return this;
    }

    public final MenuItem setNumericShortcut(char c9, int i8) {
        if (this.f424h == c9 && this.f425i == i8) {
            return this;
        }
        this.f424h = c9;
        this.f425i = KeyEvent.normalizeMetaState(i8);
        this.f430n.o(false);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f432p = onMenuItemClickListener;
        return this;
    }

    public final MenuItem setShortcut(char c9, char c10) {
        this.f424h = c9;
        this.f426j = Character.toLowerCase(c10);
        this.f430n.o(false);
        return this;
    }

    public final MenuItem setShortcut(char c9, char c10, int i8, int i9) {
        this.f424h = c9;
        this.f425i = KeyEvent.normalizeMetaState(i8);
        this.f426j = Character.toLowerCase(c10);
        this.f427k = KeyEvent.normalizeMetaState(i9);
        this.f430n.o(false);
        return this;
    }

    public final void setShowAsAction(int i8) {
        int i9 = i8 & 3;
        if (i9 == 0 || i9 == 1 || i9 == 2) {
            this.y = i8;
            d dVar = this.f430n;
            dVar.f408k = true;
            dVar.o(true);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public final MenuItem setShowAsActionFlags(int i8) {
        setShowAsAction(i8);
        return this;
    }

    public final MenuItem setTitle(int i8) {
        setTitle((CharSequence) this.f430n.f399a.getString(i8));
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.e = charSequence;
        this.f430n.o(false);
        j jVar = this.f431o;
        if (jVar != null) {
            jVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f422f = charSequence;
        this.f430n.o(false);
        return this;
    }

    public final e0.b setTooltipText(CharSequence charSequence) {
        this.r = charSequence;
        this.f430n.o(false);
        return this;
    }

    public final MenuItem setVisible(boolean z8) {
        int i8 = this.f438x;
        boolean z9 = false;
        int i9 = (z8 ? 0 : 8) | (i8 & -9);
        this.f438x = i9;
        if (i8 != i9) {
            z9 = true;
        }
        if (z9) {
            d dVar = this.f430n;
            dVar.f405h = true;
            dVar.o(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final MenuItem setActionView(View view) {
        int i8;
        this.f439z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i8 = this.f418a) > 0) {
            view.setId(i8);
        }
        d dVar = this.f430n;
        dVar.f408k = true;
        dVar.o(true);
        return this;
    }
}
