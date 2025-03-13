package com.samsung.android.wearable.watchfacestudio.editor;

import android.content.res.Resources;
import android.view.View;
import androidx.health.services.client.R;

public final /* synthetic */ class i implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w f3894a;

    public /* synthetic */ i(w wVar) {
        this.f3894a = wVar;
    }

    public final void onLayoutChange(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        w wVar = this.f3894a;
        Resources resources = wVar.getResources();
        wVar.f3949w0.setX((float) (((i10 - (resources.getDimensionPixelSize(R.dimen.colorchip_focus_width) / 2)) - resources.getDimensionPixelSize(R.dimen.colorchip_dot_size)) - resources.getDimensionPixelSize(R.dimen.colorchip_outside_margin)));
    }
}
