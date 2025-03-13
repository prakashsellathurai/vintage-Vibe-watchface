package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import j0.x;
import java.util.ArrayList;

@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: a  reason: collision with root package name */
    public int f3563a = 0;

    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f3564a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f3565b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ s4.a f3566c;

        public a(View view, int i8, s4.a aVar) {
            this.f3564a = view;
            this.f3565b = i8;
            this.f3566c = aVar;
        }

        public final boolean onPreDraw() {
            View view = this.f3564a;
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f3563a == this.f3565b) {
                s4.a aVar = this.f3566c;
                expandableBehavior.s((View) aVar, view, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public abstract boolean b(View view, View view2);

    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        s4.a aVar = (s4.a) view2;
        boolean a9 = aVar.a();
        int i8 = this.f3563a;
        int i9 = 2;
        if (!(!a9 ? i8 == 1 : i8 == 0 || i8 == 2)) {
            return false;
        }
        if (aVar.a()) {
            i9 = 1;
        }
        this.f3563a = i9;
        s((View) aVar, view, aVar.a(), true);
        return true;
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i8) {
        s4.a aVar;
        int[] iArr = x.f4957a;
        if (!x.f.c(view)) {
            ArrayList j8 = coordinatorLayout.j(view);
            int size = j8.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    aVar = null;
                    break;
                }
                View view2 = (View) j8.get(i9);
                if (b(view, view2)) {
                    aVar = (s4.a) view2;
                    break;
                }
                i9++;
            }
            if (aVar != null) {
                boolean a9 = aVar.a();
                int i10 = this.f3563a;
                int i11 = 2;
                if (!a9 ? i10 == 1 : i10 == 0 || i10 == 2) {
                    if (aVar.a()) {
                        i11 = 1;
                    }
                    this.f3563a = i11;
                    view.getViewTreeObserver().addOnPreDrawListener(new a(view, i11, aVar));
                }
            }
        }
        return false;
    }

    public abstract void s(View view, View view2, boolean z8, boolean z9);
}
