package com.samsung.android.wearable.watchfacestudio.editor;

import android.view.View;
import r5.k;

public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w f3898a;

    public /* synthetic */ l(w wVar) {
        this.f3898a = wVar;
    }

    public final void onClick(View view) {
        w wVar = this.f3898a;
        k kVar = wVar.f3931c0;
        if (kVar != null) {
            kVar.a();
            wVar.f3931c0 = null;
        }
        wVar.f3929a0.finish();
    }
}
