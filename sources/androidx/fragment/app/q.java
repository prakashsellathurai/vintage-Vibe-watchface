package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.m;
import androidx.savedstate.a;

public final class q implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s f1311a;

    public q(s sVar) {
        this.f1311a = sVar;
    }

    public final Bundle a() {
        s sVar;
        Bundle bundle = new Bundle();
        do {
            sVar = this.f1311a;
        } while (s.i(sVar.h()));
        sVar.f1319v.e(m.a.ON_STOP);
        Parcelable T = sVar.f1318u.f1357a.f1362d.T();
        if (T != null) {
            bundle.putParcelable("android:support:fragments", T);
        }
        return bundle;
    }
}
