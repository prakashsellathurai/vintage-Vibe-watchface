package com.samsung.android.wearable.watchfacestudio.editor;

import android.view.View;
import androidx.fragment.app.a;
import androidx.fragment.app.b0;
import androidx.fragment.app.c0;
import androidx.fragment.app.n;
import java.util.ArrayList;

public final /* synthetic */ class g implements b0.m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ EditorActivity f3890a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b0 f3891b;

    public /* synthetic */ g(EditorActivity editorActivity, c0 c0Var) {
        this.f3890a = editorActivity;
        this.f3891b = c0Var;
    }

    public final void onBackStackChanged() {
        View view;
        int i8 = EditorActivity.C;
        EditorActivity editorActivity = this.f3890a;
        editorActivity.getClass();
        ArrayList<a> arrayList = this.f3891b.f1104d;
        if ((arrayList != null ? arrayList.size() : 0) == 0) {
            editorActivity.finish();
            return;
        }
        n C = editorActivity.h().C(16908290);
        if (!(C == null || (view = C.getView()) == null)) {
            view.setImportantForAccessibility(1);
        }
        editorActivity.getWindow().getDecorView().sendAccessibilityEvent(32);
    }
}
