package d4;

import androidx.annotation.RecentlyNonNull;

public final class d<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final h<TResult> f4036a = new h<>();

    public final void a(@RecentlyNonNull Exception exc) {
        h<TResult> hVar = this.f4036a;
        hVar.getClass();
        if (exc != null) {
            synchronized (hVar.f4041a) {
                if (!hVar.f4043c) {
                    hVar.f4043c = true;
                    hVar.e = exc;
                    hVar.f4042b.d(hVar);
                    return;
                }
                return;
            }
        }
        throw new NullPointerException("Exception must not be null");
    }
}
