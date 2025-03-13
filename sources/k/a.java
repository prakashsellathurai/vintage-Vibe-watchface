package k;

import a0.a;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import e0.b;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f5053a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f5054b;

    /* renamed from: c  reason: collision with root package name */
    public Intent f5055c;

    /* renamed from: d  reason: collision with root package name */
    public char f5056d;
    public int e = 4096;

    /* renamed from: f  reason: collision with root package name */
    public char f5057f;

    /* renamed from: g  reason: collision with root package name */
    public int f5058g = 4096;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f5059h;

    /* renamed from: i  reason: collision with root package name */
    public final Context f5060i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f5061j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f5062k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f5063l = null;

    /* renamed from: m  reason: collision with root package name */
    public PorterDuff.Mode f5064m = null;

    /* renamed from: n  reason: collision with root package name */
    public boolean f5065n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f5066o = false;

    /* renamed from: p  reason: collision with root package name */
    public int f5067p = 16;

    public a(Context context, CharSequence charSequence) {
        this.f5060i = context;
        this.f5053a = charSequence;
    }

    public final b a(j0.b bVar) {
        throw new UnsupportedOperationException();
    }

    public final j0.b b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f5059h;
        if (drawable == null) {
            return;
        }
        if (this.f5065n || this.f5066o) {
            this.f5059h = drawable;
            Drawable mutate = drawable.mutate();
            this.f5059h = mutate;
            if (this.f5065n) {
                d0.b.h(mutate, this.f5063l);
            }
            if (this.f5066o) {
                d0.b.i(this.f5059h, this.f5064m);
            }
        }
    }

    public final boolean collapseActionView() {
        return false;
    }

    public final boolean expandActionView() {
        return false;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public final View getActionView() {
        return null;
    }

    public final int getAlphabeticModifiers() {
        return this.f5058g;
    }

    public final char getAlphabeticShortcut() {
        return this.f5057f;
    }

    public final CharSequence getContentDescription() {
        return this.f5061j;
    }

    public final int getGroupId() {
        return 0;
    }

    public final Drawable getIcon() {
        return this.f5059h;
    }

    public final ColorStateList getIconTintList() {
        return this.f5063l;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f5064m;
    }

    public final Intent getIntent() {
        return this.f5055c;
    }

    public final int getItemId() {
        return 16908332;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.e;
    }

    public final char getNumericShortcut() {
        return this.f5056d;
    }

    public final int getOrder() {
        return 0;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final CharSequence getTitle() {
        return this.f5053a;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f5054b;
        return charSequence != null ? charSequence : this.f5053a;
    }

    public final CharSequence getTooltipText() {
        return this.f5062k;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    public final boolean isActionViewExpanded() {
        return false;
    }

    public final boolean isCheckable() {
        return (this.f5067p & 1) != 0;
    }

    public final boolean isChecked() {
        return (this.f5067p & 2) != 0;
    }

    public final boolean isEnabled() {
        return (this.f5067p & 16) != 0;
    }

    public final boolean isVisible() {
        return (this.f5067p & 8) == 0;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setActionView(int i8) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c9) {
        this.f5057f = Character.toLowerCase(c9);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c9, int i8) {
        this.f5057f = Character.toLowerCase(c9);
        this.f5058g = KeyEvent.normalizeMetaState(i8);
        return this;
    }

    public final MenuItem setCheckable(boolean z8) {
        this.f5067p = z8 | (this.f5067p & true) ? 1 : 0;
        return this;
    }

    public final MenuItem setChecked(boolean z8) {
        this.f5067p = (z8 ? 2 : 0) | (this.f5067p & -3);
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f5061j = charSequence;
        return this;
    }

    /* renamed from: setContentDescription  reason: collision with other method in class */
    public final b m2setContentDescription(CharSequence charSequence) {
        this.f5061j = charSequence;
        return this;
    }

    public final MenuItem setEnabled(boolean z8) {
        this.f5067p = (z8 ? 16 : 0) | (this.f5067p & -17);
        return this;
    }

    public final MenuItem setIcon(int i8) {
        Object obj = a0.a.f10a;
        this.f5059h = a.b.b(this.f5060i, i8);
        c();
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f5059h = drawable;
        c();
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f5063l = colorStateList;
        this.f5065n = true;
        c();
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f5064m = mode;
        this.f5066o = true;
        c();
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f5055c = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c9) {
        this.f5056d = c9;
        return this;
    }

    public final MenuItem setNumericShortcut(char c9, int i8) {
        this.f5056d = c9;
        this.e = KeyEvent.normalizeMetaState(i8);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public final MenuItem setShortcut(char c9, char c10) {
        this.f5056d = c9;
        this.f5057f = Character.toLowerCase(c10);
        return this;
    }

    public final MenuItem setShortcut(char c9, char c10, int i8, int i9) {
        this.f5056d = c9;
        this.e = KeyEvent.normalizeMetaState(i8);
        this.f5057f = Character.toLowerCase(c10);
        this.f5058g = KeyEvent.normalizeMetaState(i9);
        return this;
    }

    public final void setShowAsAction(int i8) {
    }

    public final MenuItem setShowAsActionFlags(int i8) {
        return this;
    }

    public final MenuItem setTitle(int i8) {
        this.f5053a = this.f5060i.getResources().getString(i8);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f5053a = charSequence;
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f5054b = charSequence;
        return this;
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f5062k = charSequence;
        return this;
    }

    /* renamed from: setTooltipText  reason: collision with other method in class */
    public final b m3setTooltipText(CharSequence charSequence) {
        this.f5062k = charSequence;
        return this;
    }

    public final MenuItem setVisible(boolean z8) {
        int i8 = 8;
        int i9 = this.f5067p & 8;
        if (z8) {
            i8 = 0;
        }
        this.f5067p = i9 | i8;
        return this;
    }

    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }
}
