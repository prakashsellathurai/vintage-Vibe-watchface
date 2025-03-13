package t1;

import android.os.IBinder;
import android.util.Log;

public final /* synthetic */ class k implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f7436a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7437b;

    public /* synthetic */ k(l lVar, int i8) {
        this.f7436a = lVar;
        this.f7437b = i8;
    }

    public final void binderDied() {
        l lVar = this.f7436a;
        q7.k.e(lVar, "this$0");
        Log.w("EditorService", "observer died, closing editor");
        lVar.c();
        lVar.h(this.f7437b);
    }
}
