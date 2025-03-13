package k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.e;
import j0.b;
import java.lang.reflect.Method;

public final class c extends b implements MenuItem {

    /* renamed from: d  reason: collision with root package name */
    public final e0.b f5071d;
    public Method e;

    public class a extends j0.b {

        /* renamed from: b  reason: collision with root package name */
        public final ActionProvider f5072b;

        public a(ActionProvider actionProvider) {
            this.f5072b = actionProvider;
        }

        public final boolean a() {
            return this.f5072b.hasSubMenu();
        }

        public final View c() {
            return this.f5072b.onCreateActionView();
        }

        public final boolean e() {
            return this.f5072b.onPerformDefaultAction();
        }

        public final void f(SubMenu subMenu) {
            this.f5072b.onPrepareSubMenu(c.this.d(subMenu));
        }
    }

    public class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: d  reason: collision with root package name */
        public b.a f5074d;

        public b(c cVar, ActionProvider actionProvider) {
            super(actionProvider);
        }

        public final boolean b() {
            return this.f5072b.isVisible();
        }

        public final View d(MenuItem menuItem) {
            return this.f5072b.onCreateActionView(menuItem);
        }

        public final boolean g() {
            return this.f5072b.overridesItemVisibility();
        }

        public final void h(e.a aVar) {
            this.f5074d = aVar;
            this.f5072b.setVisibilityListener(this);
        }

        public final void onActionProviderVisibilityChanged(boolean z8) {
            b.a aVar = this.f5074d;
            if (aVar != null) {
                androidx.appcompat.view.menu.d dVar = androidx.appcompat.view.menu.e.this.f430n;
                dVar.f405h = true;
                dVar.o(true);
            }
        }
    }

    /* renamed from: k.c$c  reason: collision with other inner class name */
    public static class C0071c extends FrameLayout implements j.a {

        /* renamed from: a  reason: collision with root package name */
        public final CollapsibleActionView f5075a;

        public C0071c(View view) {
            super(view.getContext());
            this.f5075a = (CollapsibleActionView) view;
            addView(view);
        }

        public final void onActionViewCollapsed() {
            this.f5075a.onActionViewCollapsed();
        }

        public final void onActionViewExpanded() {
            this.f5075a.onActionViewExpanded();
        }
    }

    public class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a  reason: collision with root package name */
        public final MenuItem.OnActionExpandListener f5076a;

        public d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f5076a = onActionExpandListener;
        }

        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f5076a.onMenuItemActionCollapse(c.this.c(menuItem));
        }

        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f5076a.onMenuItemActionExpand(c.this.c(menuItem));
        }
    }

    public class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final MenuItem.OnMenuItemClickListener f5078a;

        public e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f5078a = onMenuItemClickListener;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            return this.f5078a.onMenuItemClick(c.this.c(menuItem));
        }
    }

    public c(Context context, e0.b bVar) {
        super(context);
        if (bVar != null) {
            this.f5071d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final boolean collapseActionView() {
        return this.f5071d.collapseActionView();
    }

    public final boolean expandActionView() {
        return this.f5071d.expandActionView();
    }

    public final ActionProvider getActionProvider() {
        j0.b b9 = this.f5071d.b();
        if (b9 instanceof a) {
            return ((a) b9).f5072b;
        }
        return null;
    }

    public final View getActionView() {
        View actionView = this.f5071d.getActionView();
        return actionView instanceof C0071c ? (View) ((C0071c) actionView).f5075a : actionView;
    }

    public final int getAlphabeticModifiers() {
        return this.f5071d.getAlphabeticModifiers();
    }

    public final char getAlphabeticShortcut() {
        return this.f5071d.getAlphabeticShortcut();
    }

    public final CharSequence getContentDescription() {
        return this.f5071d.getContentDescription();
    }

    public final int getGroupId() {
        return this.f5071d.getGroupId();
    }

    public final Drawable getIcon() {
        return this.f5071d.getIcon();
    }

    public final ColorStateList getIconTintList() {
        return this.f5071d.getIconTintList();
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f5071d.getIconTintMode();
    }

    public final Intent getIntent() {
        return this.f5071d.getIntent();
    }

    public final int getItemId() {
        return this.f5071d.getItemId();
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f5071d.getMenuInfo();
    }

    public final int getNumericModifiers() {
        return this.f5071d.getNumericModifiers();
    }

    public final char getNumericShortcut() {
        return this.f5071d.getNumericShortcut();
    }

    public final int getOrder() {
        return this.f5071d.getOrder();
    }

    public final SubMenu getSubMenu() {
        return d(this.f5071d.getSubMenu());
    }

    public final CharSequence getTitle() {
        return this.f5071d.getTitle();
    }

    public final CharSequence getTitleCondensed() {
        return this.f5071d.getTitleCondensed();
    }

    public final CharSequence getTooltipText() {
        return this.f5071d.getTooltipText();
    }

    public final boolean hasSubMenu() {
        return this.f5071d.hasSubMenu();
    }

    public final boolean isActionViewExpanded() {
        return this.f5071d.isActionViewExpanded();
    }

    public final boolean isCheckable() {
        return this.f5071d.isCheckable();
    }

    public final boolean isChecked() {
        return this.f5071d.isChecked();
    }

    public final boolean isEnabled() {
        return this.f5071d.isEnabled();
    }

    public final boolean isVisible() {
        return this.f5071d.isVisible();
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this, actionProvider);
        if (actionProvider == null) {
            bVar = null;
        }
        this.f5071d.a(bVar);
        return this;
    }

    public final MenuItem setActionView(int i8) {
        e0.b bVar = this.f5071d;
        bVar.setActionView(i8);
        View actionView = bVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            bVar.setActionView((View) new C0071c(actionView));
        }
        return this;
    }

    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0071c(view);
        }
        this.f5071d.setActionView(view);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c9) {
        this.f5071d.setAlphabeticShortcut(c9);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c9, int i8) {
        this.f5071d.setAlphabeticShortcut(c9, i8);
        return this;
    }

    public final MenuItem setCheckable(boolean z8) {
        this.f5071d.setCheckable(z8);
        return this;
    }

    public final MenuItem setChecked(boolean z8) {
        this.f5071d.setChecked(z8);
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f5071d.setContentDescription(charSequence);
        return this;
    }

    public final MenuItem setEnabled(boolean z8) {
        this.f5071d.setEnabled(z8);
        return this;
    }

    public final MenuItem setIcon(int i8) {
        this.f5071d.setIcon(i8);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f5071d.setIcon(drawable);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f5071d.setIconTintList(colorStateList);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f5071d.setIconTintMode(mode);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f5071d.setIntent(intent);
        return this;
    }

    public final MenuItem setNumericShortcut(char c9) {
        this.f5071d.setNumericShortcut(c9);
        return this;
    }

    public final MenuItem setNumericShortcut(char c9, int i8) {
        this.f5071d.setNumericShortcut(c9, i8);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f5071d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f5071d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    public final MenuItem setShortcut(char c9, char c10) {
        this.f5071d.setShortcut(c9, c10);
        return this;
    }

    public final MenuItem setShortcut(char c9, char c10, int i8, int i9) {
        this.f5071d.setShortcut(c9, c10, i8, i9);
        return this;
    }

    public final void setShowAsAction(int i8) {
        this.f5071d.setShowAsAction(i8);
    }

    public final MenuItem setShowAsActionFlags(int i8) {
        this.f5071d.setShowAsActionFlags(i8);
        return this;
    }

    public final MenuItem setTitle(int i8) {
        this.f5071d.setTitle(i8);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f5071d.setTitle(charSequence);
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f5071d.setTitleCondensed(charSequence);
        return this;
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f5071d.setTooltipText(charSequence);
        return this;
    }

    public final MenuItem setVisible(boolean z8) {
        return this.f5071d.setVisible(z8);
    }
}
