package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.material.tabs.TabLayout;
import u4.n;

public class a {
    public static RectF a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.B || !(view instanceof TabLayout.h)) {
            return new RectF((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom());
        }
        TabLayout.h hVar = (TabLayout.h) view;
        int contentWidth = hVar.getContentWidth();
        int contentHeight = hVar.getContentHeight();
        int a9 = (int) n.a(hVar.getContext(), 24);
        if (contentWidth < a9) {
            contentWidth = a9;
        }
        int left = (hVar.getLeft() + hVar.getRight()) / 2;
        int top = (hVar.getTop() + hVar.getBottom()) / 2;
        int i8 = contentWidth / 2;
        return new RectF((float) (left - i8), (float) (top - (contentHeight / 2)), (float) (i8 + left), (float) (top + (left / 2)));
    }

    public void b(TabLayout tabLayout, View view, View view2, float f9, Drawable drawable) {
        RectF a9 = a(tabLayout, view);
        RectF a10 = a(tabLayout, view2);
        int i8 = (int) a9.left;
        LinearInterpolator linearInterpolator = f4.a.f4391a;
        int round = i8 + Math.round(((float) (((int) a10.left) - i8)) * f9);
        int i9 = drawable.getBounds().top;
        int i10 = (int) a9.right;
        drawable.setBounds(round, i9, i10 + Math.round(f9 * ((float) (((int) a10.right) - i10))), drawable.getBounds().bottom);
    }
}
