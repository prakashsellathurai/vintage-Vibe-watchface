package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.o0;
import c.b;

public final class r implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s f1316a;

    public r(s sVar) {
        this.f1316a = sVar;
    }

    public final void a() {
        s sVar = this.f1316a;
        y<?> yVar = sVar.f1318u.f1357a;
        yVar.f1362d.c(yVar, yVar, (n) null);
        Bundle a9 = sVar.e.f2512b.a("android:support:fragments");
        if (a9 != null) {
            Parcelable parcelable = a9.getParcelable("android:support:fragments");
            y<?> yVar2 = sVar.f1318u.f1357a;
            if (yVar2 instanceof o0) {
                yVar2.f1362d.S(parcelable);
                return;
            }
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
    }
}
