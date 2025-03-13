package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.health.services.client.R;
import j0.x;
import java.util.ArrayList;
import java.util.List;
import k0.c;
import u4.e;
import u4.k;

public class ChipGroup extends e {
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f3176f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3177g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3178h;

    /* renamed from: i  reason: collision with root package name */
    public final a f3179i = new a();

    /* renamed from: j  reason: collision with root package name */
    public final d f3180j;

    /* renamed from: k  reason: collision with root package name */
    public int f3181k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3182l;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
            ChipGroup chipGroup = ChipGroup.this;
            if (!chipGroup.f3182l) {
                if (!chipGroup.getCheckedChipIds().isEmpty() || !chipGroup.f3178h) {
                    int id = compoundButton.getId();
                    if (z8) {
                        int i8 = chipGroup.f3181k;
                        if (!(i8 == -1 || i8 == id || !chipGroup.f3177g)) {
                            chipGroup.d(i8, false);
                        }
                        chipGroup.setCheckedId(id);
                    } else if (chipGroup.f3181k == id) {
                        chipGroup.setCheckedId(-1);
                    }
                } else {
                    chipGroup.d(compoundButton.getId(), true);
                    chipGroup.f3181k = compoundButton.getId();
                }
            }
        }
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public b() {
            super(-2, -2);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public interface c {
    }

    public class d implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public ViewGroup.OnHierarchyChangeListener f3184a;

        public d() {
        }

        public final void onChildViewAdded(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    int[] iArr = x.f4957a;
                    view2.setId(x.d.a());
                }
                Chip chip = (Chip) view2;
                if (chip.isChecked()) {
                    ((ChipGroup) view).c(chip.getId());
                }
                chip.setOnCheckedChangeListenerInternal(chipGroup.f3179i);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f3184a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public final void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal((CompoundButton.OnCheckedChangeListener) null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f3184a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        super(d5.a.a(context, attributeSet, R.attr.chipGroupStyle, -2146303327), attributeSet, R.attr.chipGroupStyle);
        d dVar = new d();
        this.f3180j = dVar;
        this.f3181k = -1;
        this.f3182l = false;
        TypedArray d9 = k.d(getContext(), attributeSet, a1.a.N, R.attr.chipGroupStyle, -2146303327, new int[0]);
        int dimensionPixelOffset = d9.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(d9.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(d9.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(d9.getBoolean(5, false));
        setSingleSelection(d9.getBoolean(6, false));
        setSelectionRequired(d9.getBoolean(4, false));
        int resourceId = d9.getResourceId(0, -1);
        if (resourceId != -1) {
            this.f3181k = resourceId;
        }
        d9.recycle();
        super.setOnHierarchyChangeListener(dVar);
        int[] iArr = x.f4957a;
        x.c.s(this, 1);
    }

    private int getChipCount() {
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            if (getChildAt(i9) instanceof Chip) {
                i8++;
            }
        }
        return i8;
    }

    /* access modifiers changed from: private */
    public void setCheckedId(int i8) {
        this.f3181k = i8;
    }

    public final boolean a() {
        return this.f7763c;
    }

    public final void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i9 = this.f3181k;
                if (i9 != -1 && this.f3177g) {
                    d(i9, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i8, layoutParams);
    }

    public final void c(int i8) {
        int i9 = this.f3181k;
        if (i8 != i9) {
            if (i9 != -1 && this.f3177g) {
                d(i9, false);
            }
            if (i8 != -1) {
                d(i8, true);
            }
            setCheckedId(i8);
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof b);
    }

    public final void d(int i8, boolean z8) {
        View findViewById = findViewById(i8);
        if (findViewById instanceof Chip) {
            this.f3182l = true;
            ((Chip) findViewById).setChecked(z8);
            this.f3182l = false;
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public int getCheckedChipId() {
        if (this.f3177g) {
            return this.f3181k;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f3177g) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.e;
    }

    public int getChipSpacingVertical() {
        return this.f3176f;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        int i8 = this.f3181k;
        if (i8 != -1) {
            d(i8, true);
            setCheckedId(this.f3181k);
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) c.b.a(getRowCount(), this.f7763c ? getChipCount() : -1, this.f3177g ? 1 : 2).f5099a);
    }

    public void setChipSpacing(int i8) {
        setChipSpacingHorizontal(i8);
        setChipSpacingVertical(i8);
    }

    public void setChipSpacingHorizontal(int i8) {
        if (this.e != i8) {
            this.e = i8;
            setItemSpacing(i8);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i8) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i8));
    }

    public void setChipSpacingResource(int i8) {
        setChipSpacing(getResources().getDimensionPixelOffset(i8));
    }

    public void setChipSpacingVertical(int i8) {
        if (this.f3176f != i8) {
            this.f3176f = i8;
            setLineSpacing(i8);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i8) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i8));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i8) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(c cVar) {
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f3180j.f3184a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z8) {
        this.f3178h = z8;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i8) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i8) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i8) {
        setSingleLine(getResources().getBoolean(i8));
    }

    public void setSingleLine(boolean z8) {
        super.setSingleLine(z8);
    }

    public void setSingleSelection(int i8) {
        setSingleSelection(getResources().getBoolean(i8));
    }

    public void setSingleSelection(boolean z8) {
        if (this.f3177g != z8) {
            this.f3177g = z8;
            this.f3182l = true;
            for (int i8 = 0; i8 < getChildCount(); i8++) {
                View childAt = getChildAt(i8);
                if (childAt instanceof Chip) {
                    ((Chip) childAt).setChecked(false);
                }
            }
            this.f3182l = false;
            setCheckedId(-1);
        }
    }
}
