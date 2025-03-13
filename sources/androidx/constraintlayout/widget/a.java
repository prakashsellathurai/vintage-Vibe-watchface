package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import k3.j;
import t.d;

public abstract class a extends View {

    /* renamed from: a  reason: collision with root package name */
    public int[] f919a = new int[32];

    /* renamed from: b  reason: collision with root package name */
    public int f920b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f921c;

    /* renamed from: d  reason: collision with root package name */
    public t.a f922d;
    public String e;

    /* renamed from: f  reason: collision with root package name */
    public String f923f;

    /* renamed from: g  reason: collision with root package name */
    public final HashMap<Integer, String> f924g = new HashMap<>();

    public a(Context context) {
        super(context);
        this.f921c = context;
        f((AttributeSet) null);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f921c = context;
        f(attributeSet);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x00a7
            int r0 = r6.length()
            if (r0 != 0) goto L_0x000a
            goto L_0x00a7
        L_0x000a:
            android.content.Context r0 = r5.f921c
            if (r0 != 0) goto L_0x000f
            return
        L_0x000f:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto L_0x0021
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
        L_0x0021:
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L_0x0031
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L_0x0032
        L_0x0031:
            r1 = r2
        L_0x0032:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L_0x005b
            if (r1 == 0) goto L_0x005b
            boolean r3 = r6 instanceof java.lang.String
            if (r3 == 0) goto L_0x004f
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r1.f872m
            if (r3 == 0) goto L_0x004f
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L_0x004f
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r1.f872m
            java.lang.Object r3 = r3.get(r6)
            goto L_0x0050
        L_0x004f:
            r3 = r2
        L_0x0050:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L_0x005b
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L_0x005c
        L_0x005b:
            r3 = 0
        L_0x005c:
            if (r3 != 0) goto L_0x0064
            if (r1 == 0) goto L_0x0064
            int r3 = r5.e(r1, r6)
        L_0x0064:
            if (r3 != 0) goto L_0x0070
            java.lang.Class<v.d> r1 = v.d.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch:{ Exception -> 0x0070 }
            int r3 = r1.getInt(r2)     // Catch:{ Exception -> 0x0070 }
        L_0x0070:
            if (r3 != 0) goto L_0x0080
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L_0x0080:
            if (r3 == 0) goto L_0x008f
            java.util.HashMap<java.lang.Integer, java.lang.String> r0 = r5.f924g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r6)
            r5.b(r3)
            goto L_0x00a7
        L_0x008f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Could not find id of \""
            r5.<init>(r0)
            r5.append(r6)
            java.lang.String r6 = "\""
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "ConstraintHelper"
            android.util.Log.w(r6, r5)
        L_0x00a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.a.a(java.lang.String):void");
    }

    public final void b(int i8) {
        if (i8 != getId()) {
            int i9 = this.f920b + 1;
            int[] iArr = this.f919a;
            if (i9 > iArr.length) {
                this.f919a = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f919a;
            int i10 = this.f920b;
            iArr2[i10] = i8;
            this.f920b = i10 + 1;
        }
    }

    public final void c(String str) {
        if (str != null && str.length() != 0 && this.f921c != null) {
            String trim = str.trim();
            ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
            if (constraintLayout == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = constraintLayout.getChildAt(i8);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof ConstraintLayout.a) && trim.equals(((ConstraintLayout.a) layoutParams).U)) {
                    if (childAt.getId() == -1) {
                        Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                    } else {
                        b(childAt.getId());
                    }
                }
            }
        }
    }

    public final void d() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i8 = 0; i8 < this.f920b; i8++) {
                View view = constraintLayout.f861a.get(this.f919a[i8]);
                if (view != null) {
                    view.setVisibility(visibility);
                    if (elevation > 0.0f) {
                        view.setTranslationZ(view.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public final int e(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f921c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = constraintLayout.getChildAt(i8);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void f(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.f5155j);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == 19) {
                    String string = obtainStyledAttributes.getString(index);
                    this.e = string;
                    setIds(string);
                } else if (index == 20) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f923f = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void g(d dVar, boolean z8) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f919a, this.f920b);
    }

    public final void h() {
        if (this.f922d != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.a) {
                ((ConstraintLayout.a) layoutParams).f899l0 = this.f922d;
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.e;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f923f;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public final void onDraw(Canvas canvas) {
    }

    public final void onMeasure(int i8, int i9) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.e = str;
        if (str != null) {
            int i8 = 0;
            this.f920b = 0;
            while (true) {
                int indexOf = str.indexOf(44, i8);
                if (indexOf == -1) {
                    a(str.substring(i8));
                    return;
                } else {
                    a(str.substring(i8, indexOf));
                    i8 = indexOf + 1;
                }
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f923f = str;
        if (str != null) {
            int i8 = 0;
            this.f920b = 0;
            while (true) {
                int indexOf = str.indexOf(44, i8);
                if (indexOf == -1) {
                    c(str.substring(i8));
                    return;
                } else {
                    c(str.substring(i8, indexOf));
                    i8 = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.e = null;
        this.f920b = 0;
        for (int b9 : iArr) {
            b(b9);
        }
    }

    public final void setTag(int i8, Object obj) {
        super.setTag(i8, obj);
        if (obj == null && this.e == null) {
            b(i8);
        }
    }
}
