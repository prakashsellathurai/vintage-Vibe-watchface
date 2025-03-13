package a8;

import b8.b;
import j7.d;
import y7.h;

public final class e extends b<d<?>> {

    /* renamed from: a  reason: collision with root package name */
    public long f214a = -1;

    /* renamed from: b  reason: collision with root package name */
    public h f215b;

    public final boolean a(Object obj) {
        d dVar = (d) obj;
        if (this.f214a >= 0) {
            return false;
        }
        long j8 = dVar.f199n;
        if (j8 < dVar.f200o) {
            dVar.f200o = j8;
        }
        this.f214a = j8;
        return true;
    }

    public final d[] b(Object obj) {
        long j8 = this.f214a;
        this.f214a = -1;
        this.f215b = null;
        return ((d) obj).q(j8);
    }
}
