package e0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;

public interface b extends MenuItem {
    b a(j0.b bVar);

    j0.b b();

    boolean collapseActionView();

    boolean expandActionView();

    View getActionView();

    int getAlphabeticModifiers();

    CharSequence getContentDescription();

    ColorStateList getIconTintList();

    PorterDuff.Mode getIconTintMode();

    int getNumericModifiers();

    CharSequence getTooltipText();

    boolean isActionViewExpanded();

    MenuItem setActionView(int i8);

    MenuItem setActionView(View view);

    MenuItem setAlphabeticShortcut(char c9, int i8);

    b setContentDescription(CharSequence charSequence);

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(PorterDuff.Mode mode);

    MenuItem setNumericShortcut(char c9, int i8);

    MenuItem setShortcut(char c9, char c10, int i8, int i9);

    void setShowAsAction(int i8);

    MenuItem setShowAsActionFlags(int i8);

    b setTooltipText(CharSequence charSequence);
}
