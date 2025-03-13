package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.health.services.client.R;
import com.google.android.material.button.MaterialButton;
import j0.g;
import j0.x;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import k0.c;
import u4.k;
import y4.i;

public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ int f3139k = 0;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f3140a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final c f3141b = new c();

    /* renamed from: c  reason: collision with root package name */
    public final f f3142c = new f();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashSet<e> f3143d = new LinkedHashSet<>();
    public final Comparator<MaterialButton> e = new a();

    /* renamed from: f  reason: collision with root package name */
    public Integer[] f3144f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3145g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3146h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3147i;

    /* renamed from: j  reason: collision with root package name */
    public int f3148j;

    public class a implements Comparator<MaterialButton> {
        public a() {
        }

        public final int compare(Object obj, Object obj2) {
            MaterialButton materialButton = (MaterialButton) obj;
            MaterialButton materialButton2 = (MaterialButton) obj2;
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
        }
    }

    public class b extends j0.a {
        public b() {
        }

        public final void d(View view, k0.c cVar) {
            int i8;
            this.f4917a.onInitializeAccessibilityNodeInfo(view, cVar.f5085a);
            int i9 = MaterialButtonToggleGroup.f3139k;
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            materialButtonToggleGroup.getClass();
            if (view instanceof MaterialButton) {
                int i10 = 0;
                i8 = 0;
                while (true) {
                    if (i10 >= materialButtonToggleGroup.getChildCount()) {
                        break;
                    } else if (materialButtonToggleGroup.getChildAt(i10) == view) {
                        break;
                    } else {
                        if ((materialButtonToggleGroup.getChildAt(i10) instanceof MaterialButton) && materialButtonToggleGroup.d(i10)) {
                            i8++;
                        }
                        i10++;
                    }
                }
            }
            i8 = -1;
            cVar.g(c.C0072c.a(0, 1, i8, 1, ((MaterialButton) view).isChecked()));
        }
    }

    public class c implements MaterialButton.a {
        public c() {
        }

        public final void a(MaterialButton materialButton, boolean z8) {
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            if (!materialButtonToggleGroup.f3145g) {
                if (materialButtonToggleGroup.f3146h) {
                    materialButtonToggleGroup.f3148j = z8 ? materialButton.getId() : -1;
                }
                if (materialButtonToggleGroup.f(materialButton.getId(), z8)) {
                    materialButtonToggleGroup.b(materialButton.getId(), materialButton.isChecked());
                }
                materialButtonToggleGroup.invalidate();
            }
        }
    }

    public static class d {
        public static final y4.a e = new y4.a(0.0f);

        /* renamed from: a  reason: collision with root package name */
        public final y4.c f3152a;

        /* renamed from: b  reason: collision with root package name */
        public final y4.c f3153b;

        /* renamed from: c  reason: collision with root package name */
        public final y4.c f3154c;

        /* renamed from: d  reason: collision with root package name */
        public final y4.c f3155d;

        public d(y4.c cVar, y4.c cVar2, y4.c cVar3, y4.c cVar4) {
            this.f3152a = cVar;
            this.f3153b = cVar3;
            this.f3154c = cVar4;
            this.f3155d = cVar2;
        }
    }

    public interface e {
        void a();
    }

    public class f implements MaterialButton.b {
        public f() {
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(d5.a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, -2146303313), attributeSet, R.attr.materialButtonToggleGroupStyle);
        TypedArray d9 = k.d(getContext(), attributeSet, a1.a.V, R.attr.materialButtonToggleGroupStyle, -2146303313, new int[0]);
        setSingleSelection(d9.getBoolean(2, false));
        this.f3148j = d9.getResourceId(0, -1);
        this.f3147i = d9.getBoolean(1, false);
        setChildrenDrawingOrderEnabled(true);
        d9.recycle();
        int[] iArr = x.f4957a;
        x.c.s(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            if (d(i8)) {
                return i8;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (d(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            if ((getChildAt(i9) instanceof MaterialButton) && d(i9)) {
                i8++;
            }
        }
        return i8;
    }

    private void setCheckedId(int i8) {
        this.f3148j = i8;
        b(i8, true);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            int[] iArr = x.f4957a;
            materialButton.setId(x.d.a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.f3127d.add(this.f3141b);
        materialButton.setOnPressedChangeListenerInternal(this.f3142c);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i8 = firstVisibleChildIndex + 1; i8 < getChildCount(); i8++) {
                MaterialButton c9 = c(i8);
                int min = Math.min(c9.getStrokeWidth(), c(i8 - 1).getStrokeWidth());
                ViewGroup.LayoutParams layoutParams = c9.getLayoutParams();
                LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
                if (getOrientation() == 0) {
                    g.g(layoutParams2, 0);
                    g.h(layoutParams2, -min);
                    layoutParams2.topMargin = 0;
                } else {
                    layoutParams2.bottomMargin = 0;
                    layoutParams2.topMargin = -min;
                    g.h(layoutParams2, 0);
                }
                c9.setLayoutParams(layoutParams2);
            }
            if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) c(firstVisibleChildIndex).getLayoutParams();
                if (getOrientation() == 1) {
                    layoutParams3.topMargin = 0;
                    layoutParams3.bottomMargin = 0;
                    return;
                }
                g.g(layoutParams3, 0);
                g.h(layoutParams3, 0);
                layoutParams3.leftMargin = 0;
                layoutParams3.rightMargin = 0;
            }
        }
    }

    public final void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MaterialButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i8, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        if (materialButton.isChecked()) {
            f(materialButton.getId(), true);
            setCheckedId(materialButton.getId());
        }
        i shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f3140a.add(new d(shapeAppearanceModel.e, shapeAppearanceModel.f8460h, shapeAppearanceModel.f8458f, shapeAppearanceModel.f8459g));
        x.i(materialButton, new b());
    }

    public final void b(int i8, boolean z8) {
        Iterator<e> it = this.f3143d.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public final MaterialButton c(int i8) {
        return (MaterialButton) getChildAt(i8);
    }

    public final boolean d(int i8) {
        return getChildAt(i8).getVisibility() != 8;
    }

    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.e);
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            treeMap.put(c(i8), Integer.valueOf(i8));
        }
        this.f3144f = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e(int i8, boolean z8) {
        View findViewById = findViewById(i8);
        if (findViewById instanceof MaterialButton) {
            this.f3145g = true;
            ((MaterialButton) findViewById).setChecked(z8);
            this.f3145g = false;
        }
    }

    public final boolean f(int i8, boolean z8) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (!this.f3147i || !checkedButtonIds.isEmpty()) {
            if (z8 && this.f3146h) {
                checkedButtonIds.remove(Integer.valueOf(i8));
                for (Integer intValue : checkedButtonIds) {
                    int intValue2 = intValue.intValue();
                    e(intValue2, false);
                    b(intValue2, false);
                }
            }
            return true;
        }
        e(i8, true);
        this.f3148j = i8;
        return false;
    }

    public final void g() {
        d dVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i8 = 0; i8 < childCount; i8++) {
            MaterialButton c9 = c(i8);
            if (c9.getVisibility() != 8) {
                i shapeAppearanceModel = c9.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                i.a aVar = new i.a(shapeAppearanceModel);
                d dVar2 = (d) this.f3140a.get(i8);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z8 = true;
                    boolean z9 = getOrientation() == 0;
                    y4.a aVar2 = d.e;
                    if (i8 == firstVisibleChildIndex) {
                        if (z9) {
                            int[] iArr = x.f4957a;
                            if (x.d.d(this) != 1) {
                                z8 = false;
                            }
                            dVar = z8 ? new d(aVar2, aVar2, dVar2.f3153b, dVar2.f3154c) : new d(dVar2.f3152a, dVar2.f3155d, aVar2, aVar2);
                        } else {
                            dVar = new d(dVar2.f3152a, aVar2, dVar2.f3153b, aVar2);
                        }
                    } else if (i8 != lastVisibleChildIndex) {
                        dVar2 = null;
                    } else if (z9) {
                        int[] iArr2 = x.f4957a;
                        if (x.d.d(this) != 1) {
                            z8 = false;
                        }
                        dVar = z8 ? new d(dVar2.f3152a, dVar2.f3155d, aVar2, aVar2) : new d(aVar2, aVar2, dVar2.f3153b, dVar2.f3154c);
                    } else {
                        dVar = new d(aVar2, dVar2.f3155d, aVar2, dVar2.f3154c);
                    }
                    dVar2 = dVar;
                }
                if (dVar2 == null) {
                    aVar.e = new y4.a(0.0f);
                    aVar.f8469f = new y4.a(0.0f);
                    aVar.f8470g = new y4.a(0.0f);
                    aVar.f8471h = new y4.a(0.0f);
                } else {
                    aVar.e = dVar2.f3152a;
                    aVar.f8471h = dVar2.f3155d;
                    aVar.f8469f = dVar2.f3153b;
                    aVar.f8470g = dVar2.f3154c;
                }
                c9.setShapeAppearanceModel(new i(aVar));
            }
        }
    }

    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.f3146h) {
            return this.f3148j;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            MaterialButton c9 = c(i8);
            if (c9.isChecked()) {
                arrayList.add(Integer.valueOf(c9.getId()));
            }
        }
        return arrayList;
    }

    public final int getChildDrawingOrder(int i8, int i9) {
        Integer[] numArr = this.f3144f;
        if (numArr != null && i9 < numArr.length) {
            return numArr[i9].intValue();
        }
        Log.w("MaterialButtonToggleGroup", "Child order wasn't updated");
        return i9;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        int i8 = this.f3148j;
        if (i8 != -1) {
            e(i8, true);
            f(i8, true);
            setCheckedId(i8);
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) c.b.a(1, getVisibleButtonCount(), this.f3146h ? 1 : 2).f5099a);
    }

    public final void onMeasure(int i8, int i9) {
        g();
        a();
        super.onMeasure(i8, i9);
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.f3127d.remove(this.f3141b);
            materialButton.setOnPressedChangeListenerInternal((MaterialButton.b) null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f3140a.remove(indexOfChild);
        }
        g();
        a();
    }

    public void setSelectionRequired(boolean z8) {
        this.f3147i = z8;
    }

    public void setSingleSelection(int i8) {
        setSingleSelection(getResources().getBoolean(i8));
    }

    public void setSingleSelection(boolean z8) {
        if (this.f3146h != z8) {
            this.f3146h = z8;
            this.f3145g = true;
            for (int i8 = 0; i8 < getChildCount(); i8++) {
                MaterialButton c9 = c(i8);
                c9.setChecked(false);
                b(c9.getId(), false);
            }
            this.f3145g = false;
            setCheckedId(-1);
        }
    }
}
