package q1;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.support.wearable.complications.ComplicationData;
import android.support.wearable.complications.ComplicationText;
import android.support.wearable.complications.ComplicationTextTemplate;
import android.support.wearable.complications.TimeDependentText;
import java.time.Instant;

public final class k extends b {

    /* renamed from: j  reason: collision with root package name */
    public final c f6463j;

    /* renamed from: k  reason: collision with root package name */
    public final c f6464k;

    /* renamed from: l  reason: collision with root package name */
    public final l f6465l;

    /* renamed from: m  reason: collision with root package name */
    public final u f6466m;

    /* renamed from: n  reason: collision with root package name */
    public final c f6467n;

    /* renamed from: o  reason: collision with root package name */
    public final c f6468o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(c cVar, c cVar2, l lVar, u uVar, c cVar3, PendingIntent pendingIntent, z zVar, ComplicationData complicationData, ComponentName componentName, int i8, int i9, k kVar) {
        super(d.LONG_TEXT, pendingIntent, complicationData, zVar == null ? z.f6510c : zVar, componentName, i8, i9, kVar);
        c cVar4 = cVar;
        r rVar = cVar3;
        q7.k.e(cVar, "text");
        this.f6463j = cVar4;
        this.f6464k = cVar2;
        this.f6465l = lVar;
        this.f6466m = uVar;
        this.f6467n = rVar;
        this.f6468o = rVar == null ? c.f6436a : rVar;
    }

    public final void b(ComplicationData.a aVar) {
        c c9;
        super.b(aVar);
        aVar.b(this.f6463j.a(), "LONG_TEXT");
        ComplicationText complicationText = null;
        c cVar = this.f6464k;
        aVar.b(cVar != null ? cVar.a() : null, "LONG_TITLE");
        l lVar = this.f6465l;
        if (lVar != null) {
            lVar.a(aVar);
        }
        u uVar = this.f6466m;
        if (uVar != null) {
            uVar.a(aVar);
        }
        c cVar2 = this.f6467n;
        if (!(cVar2 == null || (c9 = e.c(cVar2)) == null)) {
            complicationText = c9.a();
        }
        aVar.c(complicationText);
        aVar.e(this.f6419b);
        e.g(this.f6421d, aVar);
        aVar.f(this.f6425i);
    }

    public final TimeDependentText c(Context context) {
        c c9;
        ComplicationText a9;
        q7.k.e(context, "context");
        c cVar = this.f6467n;
        if (cVar != null && (c9 = e.c(cVar)) != null && (a9 = c9.a()) != null) {
            return a9;
        }
        ComplicationTextTemplate.b bVar = new ComplicationTextTemplate.b();
        e.a(bVar, this.f6463j, this.f6464k);
        return e.b(bVar);
    }

    public final Instant d(Instant instant) {
        c cVar = this.f6463j;
        c cVar2 = this.f6464k;
        if (cVar2 == null) {
            return cVar.d(instant);
        }
        Instant d9 = cVar2.d(instant);
        Instant d10 = cVar.d(instant);
        return d10.isBefore(d9) ? d10 : d9;
    }

    public final String toString() {
        return "LongTextComplicationData(text=" + this.f6463j + ", title=" + this.f6464k + ", monochromaticImage=" + this.f6465l + ", smallImage=" + this.f6466m + ", contentDescription=" + this.f6467n + "), tapActionLostDueToSerialization=" + this.f6425i + ", tapAction=" + this.f6419b + ", validTimeRange=" + this.f6421d + ", dataSource=" + this.e + ", persistencePolicy=" + this.f6422f + ", displayPolicy=" + this.f6423g + ", dynamicValueInvalidationFallback=" + this.f6424h + ')';
    }
}
