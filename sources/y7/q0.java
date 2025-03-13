package y7;

import androidx.wear.watchface.style.data.ComplicationOverlayWireFormat;
import i7.c;

public abstract class q0 extends w {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ int f8594k = 0;

    /* renamed from: h  reason: collision with root package name */
    public long f8595h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f8596i;

    /* renamed from: j  reason: collision with root package name */
    public c<k0<?>> f8597j;

    public final void P(boolean z8) {
        long j8 = this.f8595h - (z8 ? ComplicationOverlayWireFormat.NULL_ACCESSIBILITY_TRAVERSAL_INDEX : 1);
        this.f8595h = j8;
        if (j8 <= 0 && this.f8596i) {
            shutdown();
        }
    }

    public final void Q(boolean z8) {
        this.f8595h += z8 ? ComplicationOverlayWireFormat.NULL_ACCESSIBILITY_TRAVERSAL_INDEX : 1;
        if (!z8) {
            this.f8596i = true;
        }
    }

    public long R() {
        return !S() ? Long.MAX_VALUE : 0;
    }

    public final boolean S() {
        c<k0<?>> cVar = this.f8597j;
        if (cVar == null) {
            return false;
        }
        k0 removeFirst = cVar.isEmpty() ? null : cVar.removeFirst();
        if (removeFirst == null) {
            return false;
        }
        removeFirst.run();
        return true;
    }

    public void shutdown() {
    }
}
