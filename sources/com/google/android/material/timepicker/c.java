package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import androidx.health.services.client.R;
import j0.x;
import y4.f;
import y4.g;
import y4.i;

public class c extends ConstraintLayout {

    /* renamed from: s  reason: collision with root package name */
    public final Runnable f3556s;

    /* renamed from: t  reason: collision with root package name */
    public int f3557t;

    /* renamed from: u  reason: collision with root package name */
    public f f3558u;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            c.this.h();
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public c(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        f fVar = new f();
        this.f3558u = fVar;
        g gVar = new g(0.5f);
        i iVar = fVar.f8412a.f8433a;
        iVar.getClass();
        i.a aVar = new i.a(iVar);
        aVar.e = gVar;
        aVar.f8469f = gVar;
        aVar.f8470g = gVar;
        aVar.f8471h = gVar;
        fVar.setShapeAppearanceModel(aVar.a());
        this.f3558u.j(ColorStateList.valueOf(-1));
        f fVar2 = this.f3558u;
        int[] iArr = x.f4957a;
        x.c.q(this, fVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.a.f16c0, i8, 0);
        this.f3557t = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f3556s = new a();
        obtainStyledAttributes.recycle();
    }

    public final void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i8, layoutParams);
        if (view.getId() == -1) {
            int[] iArr = x.f4957a;
            view.setId(x.d.a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            Runnable runnable = this.f3556s;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
        }
    }

    public final void h() {
        int childCount = getChildCount();
        int i8 = 1;
        for (int i9 = 0; i9 < childCount; i9++) {
            if ("skip".equals(getChildAt(i9).getTag())) {
                i8++;
            }
        }
        b bVar = new b();
        bVar.b(this);
        float f9 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                bVar.c(f9, childAt.getId(), R.id.circle_center, this.f3557t);
                f9 += 360.0f / ((float) (childCount - i8));
            }
        }
        bVar.a(this);
        setConstraintSet((b) null);
        requestLayout();
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        h();
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            Runnable runnable = this.f3556s;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
        }
    }

    public final void setBackgroundColor(int i8) {
        this.f3558u.j(ColorStateList.valueOf(i8));
    }
}
