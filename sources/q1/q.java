package q1;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.support.wearable.complications.ComplicationData;
import android.support.wearable.complications.TimeDependentText;
import q7.k;

public final class q extends b {

    /* renamed from: m  reason: collision with root package name */
    public static final Icon f6481m;

    /* renamed from: j  reason: collision with root package name */
    public final Icon f6482j;

    /* renamed from: k  reason: collision with root package name */
    public final c f6483k;

    /* renamed from: l  reason: collision with root package name */
    public final c f6484l;

    static {
        Icon createWithResource = Icon.createWithResource("", -1);
        k.d(createWithResource, "createWithResource(\"\", P…HOLDER_IMAGE_RESOURCE_ID)");
        f6481m = createWithResource;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(Icon icon, c cVar, PendingIntent pendingIntent, z zVar, ComplicationData complicationData, ComponentName componentName, int i8, int i9, q qVar) {
        super(d.PHOTO_IMAGE, pendingIntent, complicationData, zVar == null ? z.f6510c : zVar, componentName, i8, i9, qVar);
        Icon icon2 = icon;
        r rVar = cVar;
        k.e(icon, "photoImage");
        this.f6482j = icon2;
        this.f6483k = rVar;
        this.f6484l = rVar == null ? c.f6436a : rVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r0 = q1.e.c(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.support.wearable.complications.ComplicationData.a r3) {
        /*
            r2 = this;
            super.b(r3)
            java.lang.String r0 = "LARGE_IMAGE"
            android.graphics.drawable.Icon r1 = r2.f6482j
            r3.b(r1, r0)
            q1.c r0 = r2.f6483k
            if (r0 == 0) goto L_0x0019
            q1.c r0 = q1.e.c(r0)
            if (r0 == 0) goto L_0x0019
            android.support.wearable.complications.ComplicationText r0 = r0.a()
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            r3.c(r0)
            android.app.PendingIntent r0 = r2.f6419b
            r3.e(r0)
            q1.z r0 = r2.f6421d
            q1.e.g(r0, r3)
            boolean r2 = r2.f6425i
            r3.f(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.q.b(android.support.wearable.complications.ComplicationData$a):void");
    }

    public final TimeDependentText c(Context context) {
        k.e(context, "context");
        c cVar = this.f6483k;
        if (cVar != null) {
            return cVar.a();
        }
        return null;
    }

    public final String toString() {
        return "PhotoImageComplicationData(photoImage=" + this.f6482j + ", contentDescription=" + this.f6483k + "), tapActionLostDueToSerialization=" + this.f6425i + ", tapAction=" + this.f6419b + ", validTimeRange=" + this.f6421d + ", dataSource=" + this.e + ", persistencePolicy=" + this.f6422f + ", displayPolicy=" + this.f6423g + ", dynamicValueInvalidationFallback=" + this.f6424h + ')';
    }
}
