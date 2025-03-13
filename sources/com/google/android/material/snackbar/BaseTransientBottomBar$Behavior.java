package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import k3.j;
import z4.c;
import z4.d;

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: h  reason: collision with root package name */
    public final j f3366h = new j((SwipeDismissBehavior) this);

    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f3366h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (d.f8694b == null) {
                    d.f8694b = new d();
                }
                synchronized (d.f8694b.f8695a) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (d.f8694b == null) {
                d.f8694b = new d();
            }
            synchronized (d.f8694b.f8695a) {
            }
        }
        return super.g(coordinatorLayout, view, motionEvent);
    }

    public final boolean s(View view) {
        this.f3366h.getClass();
        return view instanceof c;
    }
}
