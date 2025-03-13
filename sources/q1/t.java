package q1;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.support.wearable.complications.ComplicationData;
import android.support.wearable.complications.ComplicationText;
import android.support.wearable.complications.ComplicationTextTemplate;
import android.support.wearable.complications.TimeDependentText;
import java.time.Instant;
import q7.k;

public final class t extends b {

    /* renamed from: j  reason: collision with root package name */
    public final c f6497j;

    /* renamed from: k  reason: collision with root package name */
    public final c f6498k;

    /* renamed from: l  reason: collision with root package name */
    public final l f6499l;

    /* renamed from: m  reason: collision with root package name */
    public final u f6500m;

    /* renamed from: n  reason: collision with root package name */
    public final c f6501n;

    /* renamed from: o  reason: collision with root package name */
    public final c f6502o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(c cVar, c cVar2, l lVar, u uVar, c cVar3, PendingIntent pendingIntent, z zVar, ComplicationData complicationData, ComponentName componentName, int i8, int i9, t tVar) {
        super(d.SHORT_TEXT, pendingIntent, complicationData, zVar == null ? z.f6510c : zVar, componentName, i8, i9, tVar);
        c cVar4 = cVar;
        r rVar = cVar3;
        k.e(cVar, "text");
        this.f6497j = cVar4;
        this.f6498k = cVar2;
        this.f6499l = lVar;
        this.f6500m = uVar;
        this.f6501n = rVar;
        this.f6502o = rVar == null ? c.f6436a : rVar;
    }

    public final void b(ComplicationData.a aVar) {
        c c9;
        super.b(aVar);
        aVar.b(this.f6497j.a(), "SHORT_TEXT");
        ComplicationText complicationText = null;
        c cVar = this.f6498k;
        aVar.b(cVar != null ? cVar.a() : null, "SHORT_TITLE");
        c cVar2 = this.f6501n;
        if (!(cVar2 == null || (c9 = e.c(cVar2)) == null)) {
            complicationText = c9.a();
        }
        aVar.c(complicationText);
        l lVar = this.f6499l;
        if (lVar != null) {
            lVar.a(aVar);
        }
        u uVar = this.f6500m;
        if (uVar != null) {
            uVar.a(aVar);
        }
        aVar.e(this.f6419b);
        e.g(this.f6421d, aVar);
        aVar.f(this.f6425i);
    }

    public final TimeDependentText c(Context context) {
        c c9;
        ComplicationText a9;
        k.e(context, "context");
        c cVar = this.f6501n;
        if (cVar != null && (c9 = e.c(cVar)) != null && (a9 = c9.a()) != null) {
            return a9;
        }
        ComplicationTextTemplate.b bVar = new ComplicationTextTemplate.b();
        e.a(bVar, this.f6497j, this.f6498k);
        return e.b(bVar);
    }

    public final Instant d(Instant instant) {
        c cVar = this.f6497j;
        c cVar2 = this.f6498k;
        if (cVar2 == null) {
            return cVar.d(instant);
        }
        Instant d9 = cVar2.d(instant);
        Instant d10 = cVar.d(instant);
        return d10.isBefore(d9) ? d10 : d9;
    }

    public final String toString() {
        return "ShortTextComplicationData(text=" + this.f6497j + ", title=" + this.f6498k + ", monochromaticImage=" + this.f6499l + ", smallImage=" + this.f6500m + ", contentDescription=" + this.f6501n + ", tapActionLostDueToSerialization=" + this.f6425i + ", tapAction=" + this.f6419b + ", validTimeRange=" + this.f6421d + ", dataSource=" + this.e + ", persistencePolicy=" + this.f6422f + ", displayPolicy=" + this.f6423g + ", dynamicValueInvalidationFallback=" + this.f6424h + ')';
    }
}
