package com.samsung.android.wearable.watchfacestudio.editor;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public final /* synthetic */ class j implements View.OnGenericMotionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w f3895a;

    public /* synthetic */ j(w wVar) {
        this.f3895a = wVar;
    }

    public final boolean onGenericMotion(View view, MotionEvent motionEvent) {
        w wVar = this.f3895a;
        if (wVar.s0 == null) {
            return false;
        }
        Log.i("DWF:EditorFragment", "change tutorial vi stage");
        wVar.s0.b();
        return false;
    }
}
