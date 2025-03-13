package com.samsung.android.wearable.watchfacestudio.editor;

import android.view.View;
import android.view.animation.TranslateAnimation;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import m5.d;

public final class v extends ViewPager2.e {

    /* renamed from: a  reason: collision with root package name */
    public int f3926a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f3927b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ w f3928c;

    public v(w wVar, d dVar) {
        this.f3928c = wVar;
        this.f3927b = dVar;
    }

    public final void b(float f9, int i8, int i9) {
        d dVar = this.f3927b;
        ArrayList arrayList = dVar.f5456a;
        View view = (View) arrayList.get(i8);
        view.setAlpha(f9);
        if (f9 == 0.0f) {
            view.setVisibility(0);
            int i10 = i8 - 1;
            if (i10 >= 0) {
                ((View) arrayList.get(i10)).setVisibility(4);
            }
            int i11 = i8 + 1;
            if (i11 < arrayList.size()) {
                ((View) arrayList.get(i11)).setVisibility(4);
            }
            if (dVar.f5458c != null) {
                int size = arrayList.size() - 1;
                View view2 = dVar.f5458c;
                if (i8 == size) {
                    view2.setVisibility(0);
                } else {
                    view2.setVisibility(4);
                }
            }
        }
        int i12 = i8 + 1;
        if (i12 < arrayList.size()) {
            ((View) arrayList.get(i12)).setAlpha(1.0f - f9);
        }
    }

    public final void c(int i8) {
        w wVar = this.f3928c;
        int height = wVar.f3942n0.getHeight();
        if (i8 - this.f3926a != 0) {
            this.f3926a = i8;
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) height);
            translateAnimation.setDuration(1500);
            translateAnimation.setInterpolator(new u());
            wVar.u0.f3869d.c(translateAnimation);
        }
        wVar.p(wVar.f3950x0, wVar.y0, i8);
    }
}
