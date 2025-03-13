package p6;

import java.util.ArrayList;
import java.util.Iterator;
import p6.g;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ g.a f6352f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ long f6353g;

    public /* synthetic */ f(g.a aVar, long j8) {
        this.f6352f = aVar;
        this.f6353g = j8;
    }

    public final void run() {
        g.a aVar = this.f6352f;
        aVar.getClass();
        long j8 = this.f6353g / 1000000;
        g gVar = g.this;
        long j9 = j8 - gVar.f6349a;
        if (j9 > 13) {
            Iterator it = new ArrayList(gVar.f6351c).iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                long j10 = 0;
                if (gVar.f6349a != 0) {
                    j10 = j9;
                }
                iVar.a(j10);
            }
            gVar.f6349a = j8;
        }
    }
}
