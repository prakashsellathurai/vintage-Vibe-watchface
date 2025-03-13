package androidx.activity;

import android.window.OnBackInvokedCallback;
import p7.a;
import q7.k;

public final /* synthetic */ class i implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f300a;

    public /* synthetic */ i(a aVar) {
        this.f300a = aVar;
    }

    public final void onBackInvoked() {
        a aVar = this.f300a;
        k.e(aVar, "$onBackInvoked");
        aVar.invoke();
    }
}
