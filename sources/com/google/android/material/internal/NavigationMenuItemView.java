package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.a0;
import androidx.health.services.client.R;
import b0.b;
import d0.b;
import j0.x;
import k0.c;
import n0.k;
import u4.f;

public class NavigationMenuItemView extends f implements h.a {
    public static final int[] F = {16842912};
    public e A;
    public ColorStateList B;
    public boolean C;
    public Drawable D;
    public final a E;

    /* renamed from: v  reason: collision with root package name */
    public int f3362v;
    public boolean w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f3363x;
    public final CheckedTextView y;

    /* renamed from: z  reason: collision with root package name */
    public FrameLayout f3364z;

    public class a extends j0.a {
        public a() {
        }

        public final void d(View view, c cVar) {
            View.AccessibilityDelegate accessibilityDelegate = this.f4917a;
            AccessibilityNodeInfo accessibilityNodeInfo = cVar.f5085a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCheckable(NavigationMenuItemView.this.f3363x);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, 0);
        a aVar = new a();
        this.E = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.y = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        x.i(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f3364z == null) {
                this.f3364z = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.f3364z.removeAllViews();
            this.f3364z.addView(view);
        }
    }

    public final void b(e eVar) {
        a0.a aVar;
        int i8;
        StateListDrawable stateListDrawable;
        this.A = eVar;
        int i9 = eVar.f418a;
        if (i9 > 0) {
            setId(i9);
        }
        setVisibility(eVar.isVisible() ? 0 : 8);
        boolean z8 = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(F, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            int[] iArr = x.f4957a;
            x.c.q(this, stateListDrawable);
        }
        setCheckable(eVar.isCheckable());
        setChecked(eVar.isChecked());
        setEnabled(eVar.isEnabled());
        setTitle(eVar.e);
        setIcon(eVar.getIcon());
        setActionView(eVar.getActionView());
        setContentDescription(eVar.f433q);
        setTooltipText(eVar.r);
        e eVar2 = this.A;
        if (!(eVar2.e == null && eVar2.getIcon() == null && this.A.getActionView() != null)) {
            z8 = false;
        }
        CheckedTextView checkedTextView = this.y;
        if (z8) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f3364z;
            if (frameLayout != null) {
                aVar = (a0.a) frameLayout.getLayoutParams();
                i8 = -1;
            } else {
                return;
            }
        } else {
            checkedTextView.setVisibility(0);
            FrameLayout frameLayout2 = this.f3364z;
            if (frameLayout2 != null) {
                aVar = (a0.a) frameLayout2.getLayoutParams();
                i8 = -2;
            } else {
                return;
            }
        }
        aVar.width = i8;
        this.f3364z.setLayoutParams(aVar);
    }

    public e getItemData() {
        return this.A;
    }

    public final int[] onCreateDrawableState(int i8) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i8 + 1);
        e eVar = this.A;
        if (eVar != null && eVar.isCheckable() && this.A.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, F);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z8) {
        refreshDrawableState();
        if (this.f3363x != z8) {
            this.f3363x = z8;
            this.E.h(this.y, 2048);
        }
    }

    public void setChecked(boolean z8) {
        refreshDrawableState();
        this.y.setChecked(z8);
    }

    public void setHorizontalPadding(int i8) {
        setPadding(i8, 0, i8, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.C) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                b.h(drawable, this.B);
            }
            int i8 = this.f3362v;
            drawable.setBounds(0, 0, i8, i8);
        } else if (this.w) {
            if (this.D == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                Object obj = b0.b.f2504a;
                Drawable a9 = b.a.a(resources, R.drawable.navigation_empty_icon, theme);
                this.D = a9;
                if (a9 != null) {
                    int i9 = this.f3362v;
                    a9.setBounds(0, 0, i9, i9);
                }
            }
            drawable = this.D;
        }
        k.e(this.y, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i8) {
        this.y.setCompoundDrawablePadding(i8);
    }

    public void setIconSize(int i8) {
        this.f3362v = i8;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.B = colorStateList;
        this.C = colorStateList != null;
        e eVar = this.A;
        if (eVar != null) {
            setIcon(eVar.getIcon());
        }
    }

    public void setMaxLines(int i8) {
        this.y.setMaxLines(i8);
    }

    public void setNeedsEmptyIcon(boolean z8) {
        this.w = z8;
    }

    public void setTextAppearance(int i8) {
        this.y.setTextAppearance(i8);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.y.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.y.setText(charSequence);
    }
}
