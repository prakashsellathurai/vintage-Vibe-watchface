package b5;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.material.tabs.TabLayout;

public final class a extends com.google.android.material.tabs.a {
    public final void b(TabLayout tabLayout, View view, View view2, float f9, Drawable drawable) {
        float f10;
        float f11;
        RectF a9 = com.google.android.material.tabs.a.a(tabLayout, view);
        RectF a10 = com.google.android.material.tabs.a.a(tabLayout, view2);
        if (a9.left < a10.left) {
            double d9 = (((double) f9) * 3.141592653589793d) / 2.0d;
            f10 = (float) (1.0d - Math.cos(d9));
            f11 = (float) Math.sin(d9);
        } else {
            double d10 = (((double) f9) * 3.141592653589793d) / 2.0d;
            f10 = (float) Math.sin(d10);
            f11 = (float) (1.0d - Math.cos(d10));
        }
        int i8 = (int) a9.left;
        LinearInterpolator linearInterpolator = f4.a.f4391a;
        int round = i8 + Math.round(f10 * ((float) (((int) a10.left) - i8)));
        int i9 = drawable.getBounds().top;
        int i10 = (int) a9.right;
        drawable.setBounds(round, i9, i10 + Math.round(f11 * ((float) (((int) a10.right) - i10))), drawable.getBounds().bottom);
    }
}
