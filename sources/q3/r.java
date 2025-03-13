package q3;

import p3.a;

public final class r implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ s f6578f;

    public r(s sVar) {
        this.f6578f = sVar;
    }

    public final void run() {
        a.e eVar = this.f6578f.f6579a.f6581b;
        eVar.e(eVar.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
