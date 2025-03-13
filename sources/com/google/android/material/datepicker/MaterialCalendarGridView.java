package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.health.services.client.R;
import i0.c;
import j0.x;
import java.util.Calendar;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f3211a;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        b0.d((Calendar) null);
        if (o.r(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f3211a = o.s(getContext(), R.attr.nestedScrollable);
        x.i(this, new n());
    }

    /* renamed from: a */
    public final t getAdapter() {
        return (t) super.getAdapter();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        t a9 = getAdapter();
        d<?> dVar = a9.f3295b;
        a9.getItem(a9.a());
        s sVar = a9.f3294a;
        a9.getItem((sVar.r() + sVar.f3290j) - 1);
        for (c<Long, Long> cVar : dVar.h()) {
            cVar.getClass();
        }
    }

    public final void onFocusChanged(boolean z8, int i8, Rect rect) {
        int i9;
        if (z8) {
            if (i8 == 33) {
                s sVar = getAdapter().f3294a;
                i9 = (sVar.r() + sVar.f3290j) - 1;
            } else if (i8 == 130) {
                i9 = getAdapter().a();
            } else {
                super.onFocusChanged(true, i8, rect);
                return;
            }
            setSelection(i9);
            return;
        }
        super.onFocusChanged(false, i8, rect);
    }

    public final boolean onKeyDown(int i8, KeyEvent keyEvent) {
        if (!super.onKeyDown(i8, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().a()) {
            return true;
        }
        if (19 != i8) {
            return false;
        }
        setSelection(getAdapter().a());
        return true;
    }

    public final void onMeasure(int i8, int i9) {
        if (this.f3211a) {
            super.onMeasure(i8, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i8, i9);
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof t) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), t.class.getCanonicalName()}));
        }
    }

    public final void setSelection(int i8) {
        if (i8 < getAdapter().a()) {
            i8 = getAdapter().a();
        }
        super.setSelection(i8);
    }
}
