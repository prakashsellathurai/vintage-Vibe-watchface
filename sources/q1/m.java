package q1;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.support.wearable.complications.ComplicationData;
import android.support.wearable.complications.TimeDependentText;
import q7.k;

public final class m extends b {

    /* renamed from: j  reason: collision with root package name */
    public final l f6472j;

    /* renamed from: k  reason: collision with root package name */
    public final c f6473k;

    /* renamed from: l  reason: collision with root package name */
    public final c f6474l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(l lVar, c cVar, PendingIntent pendingIntent, z zVar, ComplicationData complicationData, ComponentName componentName, int i8, int i9, m mVar) {
        super(d.MONOCHROMATIC_IMAGE, pendingIntent, complicationData, zVar == null ? z.f6510c : zVar, componentName, i8, i9, mVar);
        l lVar2 = lVar;
        r rVar = cVar;
        k.e(lVar, "monochromaticImage");
        this.f6472j = lVar2;
        this.f6473k = rVar;
        this.f6474l = rVar == null ? c.f6436a : rVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = q1.e.c(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.support.wearable.complications.ComplicationData.a r2) {
        /*
            r1 = this;
            super.b(r2)
            q1.l r0 = r1.f6472j
            r0.a(r2)
            q1.c r0 = r1.f6473k
            if (r0 == 0) goto L_0x0017
            q1.c r0 = q1.e.c(r0)
            if (r0 == 0) goto L_0x0017
            android.support.wearable.complications.ComplicationText r0 = r0.a()
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            r2.c(r0)
            android.app.PendingIntent r0 = r1.f6419b
            r2.e(r0)
            q1.z r0 = r1.f6421d
            q1.e.g(r0, r2)
            boolean r1 = r1.f6425i
            r2.f(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.m.b(android.support.wearable.complications.ComplicationData$a):void");
    }

    public final TimeDependentText c(Context context) {
        k.e(context, "context");
        c cVar = this.f6473k;
        if (cVar != null) {
            return cVar.a();
        }
        return null;
    }

    public final String toString() {
        return "MonochromaticImageComplicationData(monochromaticImage=" + this.f6472j + ", contentDescription=" + this.f6473k + "), tapActionLostDueToSerialization=" + this.f6425i + ", tapAction=" + this.f6419b + ", validTimeRange=" + this.f6421d + ", dataSource=" + this.e + ", persistencePolicy=" + this.f6422f + ", displayPolicy=" + this.f6423g + ", dynamicValueInvalidationFallback=" + this.f6424h + ')';
    }
}
