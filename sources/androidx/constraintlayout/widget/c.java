package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import java.util.HashMap;
import k3.j;

public final class c extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public b f986a;

    public static class a extends ConstraintLayout.a {

        /* renamed from: m0  reason: collision with root package name */
        public final float f987m0;

        /* renamed from: n0  reason: collision with root package name */
        public final boolean f988n0;

        /* renamed from: o0  reason: collision with root package name */
        public final float f989o0;

        /* renamed from: p0  reason: collision with root package name */
        public final float f990p0;

        /* renamed from: q0  reason: collision with root package name */
        public final float f991q0;

        /* renamed from: r0  reason: collision with root package name */
        public final float f992r0;
        public final float s0;

        /* renamed from: t0  reason: collision with root package name */
        public final float f993t0;
        public final float u0;

        /* renamed from: v0  reason: collision with root package name */
        public final float f994v0;

        /* renamed from: w0  reason: collision with root package name */
        public final float f995w0;

        /* renamed from: x0  reason: collision with root package name */
        public final float f996x0;
        public final float y0;

        public a() {
            this.f987m0 = 1.0f;
            this.f988n0 = false;
            this.f989o0 = 0.0f;
            this.f990p0 = 0.0f;
            this.f991q0 = 0.0f;
            this.f992r0 = 0.0f;
            this.s0 = 1.0f;
            this.f993t0 = 1.0f;
            this.u0 = 0.0f;
            this.f994v0 = 0.0f;
            this.f995w0 = 0.0f;
            this.f996x0 = 0.0f;
            this.y0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f987m0 = 1.0f;
            this.f988n0 = false;
            this.f989o0 = 0.0f;
            this.f990p0 = 0.0f;
            this.f991q0 = 0.0f;
            this.f992r0 = 0.0f;
            this.s0 = 1.0f;
            this.f993t0 = 1.0f;
            this.u0 = 0.0f;
            this.f994v0 = 0.0f;
            this.f995w0 = 0.0f;
            this.f996x0 = 0.0f;
            this.y0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f5156k);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == 15) {
                    this.f987m0 = obtainStyledAttributes.getFloat(index, this.f987m0);
                } else if (index == 28) {
                    this.f989o0 = obtainStyledAttributes.getFloat(index, this.f989o0);
                    this.f988n0 = true;
                } else if (index == 23) {
                    this.f991q0 = obtainStyledAttributes.getFloat(index, this.f991q0);
                } else if (index == 24) {
                    this.f992r0 = obtainStyledAttributes.getFloat(index, this.f992r0);
                } else if (index == 22) {
                    this.f990p0 = obtainStyledAttributes.getFloat(index, this.f990p0);
                } else if (index == 20) {
                    this.s0 = obtainStyledAttributes.getFloat(index, this.s0);
                } else if (index == 21) {
                    this.f993t0 = obtainStyledAttributes.getFloat(index, this.f993t0);
                } else if (index == 16) {
                    this.u0 = obtainStyledAttributes.getFloat(index, this.u0);
                } else if (index == 17) {
                    this.f994v0 = obtainStyledAttributes.getFloat(index, this.f994v0);
                } else if (index == 18) {
                    this.f995w0 = obtainStyledAttributes.getFloat(index, this.f995w0);
                } else if (index == 19) {
                    this.f996x0 = obtainStyledAttributes.getFloat(index, this.f996x0);
                } else if (index == 27) {
                    this.y0 = obtainStyledAttributes.getFloat(index, this.y0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.a(layoutParams);
    }

    public b getConstraintSet() {
        if (this.f986a == null) {
            this.f986a = new b();
        }
        b bVar = this.f986a;
        bVar.getClass();
        int childCount = getChildCount();
        HashMap<Integer, b.a> hashMap = bVar.f928c;
        hashMap.clear();
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = getChildAt(i8);
            a aVar = (a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!bVar.f927b || id != -1) {
                if (!hashMap.containsKey(Integer.valueOf(id))) {
                    hashMap.put(Integer.valueOf(id), new b.a());
                }
                b.a aVar2 = hashMap.get(Integer.valueOf(id));
                if (childAt instanceof a) {
                    a aVar3 = (a) childAt;
                    aVar2.c(id, aVar);
                    if (aVar3 instanceof Barrier) {
                        b.C0011b bVar2 = aVar2.f932d;
                        bVar2.f940c0 = 1;
                        Barrier barrier = (Barrier) aVar3;
                        bVar2.f936a0 = barrier.getType();
                        bVar2.f942d0 = barrier.getReferencedIds();
                        bVar2.f938b0 = barrier.getMargin();
                    }
                }
                aVar2.c(id, aVar);
                i8++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        return this.f986a;
    }

    public final void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
    }
}
