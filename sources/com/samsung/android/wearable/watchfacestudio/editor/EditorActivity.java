package com.samsung.android.wearable.watchfacestudio.editor;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.a;
import androidx.fragment.app.c0;
import androidx.fragment.app.n;
import androidx.fragment.app.s;
import androidx.health.services.client.R;
import androidx.wear.watchface.editor.d;
import b0.c;
import java.util.ArrayList;
import k3.j;
import q.b;
import t1.p;
import t1.r;
import y7.a0;
import y7.g1;

public class EditorActivity extends s {
    public static final /* synthetic */ int C = 0;
    public z A;
    public boolean B;

    /* renamed from: z  reason: collision with root package name */
    public r f3864z;

    public final void k() {
        View view;
        c0 h8 = h();
        g gVar = new g(this, h8);
        if (h8.f1110k == null) {
            h8.f1110k = new ArrayList<>();
        }
        h8.f1110k.add(gVar);
        w wVar = new w(this.A);
        c0 h9 = h();
        n C2 = h9.C(16908290);
        if (!(C2 == null || (view = C2.getView()) == null)) {
            view.setImportantForAccessibility(4);
        }
        a aVar = new a(h9);
        aVar.f(16908290, wVar, (String) null, 2);
        if (aVar.f1198h) {
            aVar.f1197g = true;
            aVar.f1199i = null;
            aVar.d(false);
            return;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public final void onBackPressed() {
        super.onBackPressed();
        if (this.B) {
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R.style.DisableBackSwipe);
        boolean hasSystemFeature = getPackageManager().hasSystemFeature("com.samsung.android.watch.watchface.config.vi.launching");
        this.B = hasSystemFeature;
        this.A = new z(this, hasSystemFeature);
        b bVar = new b();
        j.K(a0.a(new p()), (g1) null, new d(bVar, this, (j7.d<? super d>) null), 3);
        bVar.a(new c(this, 9, bVar), getMainExecutor());
    }
}
