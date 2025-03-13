package q1;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.support.wearable.complications.ComplicationData;
import android.support.wearable.complications.ComplicationText;
import android.support.wearable.complications.ComplicationTextTemplate;
import android.support.wearable.complications.TimeDependentText;
import androidx.health.services.client.R;
import java.time.Instant;
import l1.e;
import q7.k;

public final class i extends b {

    /* renamed from: j  reason: collision with root package name */
    public final float f6454j;

    /* renamed from: k  reason: collision with root package name */
    public final e.r f6455k;

    /* renamed from: l  reason: collision with root package name */
    public final float f6456l;

    /* renamed from: m  reason: collision with root package name */
    public final l f6457m;

    /* renamed from: n  reason: collision with root package name */
    public final u f6458n;

    /* renamed from: o  reason: collision with root package name */
    public final c f6459o;

    /* renamed from: p  reason: collision with root package name */
    public final c f6460p;

    /* renamed from: q  reason: collision with root package name */
    public final c f6461q;
    public final a r;

    /* renamed from: s  reason: collision with root package name */
    public final c f6462s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(float f9, e.r rVar, float f10, l lVar, u uVar, c cVar, c cVar2, c cVar3, PendingIntent pendingIntent, z zVar, ComplicationData complicationData, ComponentName componentName, a aVar, int i8, int i9, i iVar) {
        super(d.GOAL_PROGRESS, pendingIntent, complicationData, zVar == null ? z.f6510c : zVar, componentName, i8, i9, iVar);
        c cVar4 = cVar3;
        this.f6454j = f9;
        this.f6455k = rVar;
        this.f6456l = f10;
        this.f6457m = lVar;
        this.f6458n = uVar;
        this.f6459o = cVar;
        this.f6460p = cVar2;
        this.f6461q = cVar4;
        this.r = aVar;
        this.f6462s = cVar4 == null ? c.f6436a : cVar4;
    }

    public final void b(ComplicationData.a aVar) {
        c c9;
        super.b(aVar);
        aVar.b(Float.valueOf(this.f6454j), "VALUE");
        ComplicationText complicationText = null;
        e.r rVar = this.f6455k;
        aVar.b(rVar != null ? rVar.a() : null, "DYNAMIC_VALUE");
        ComplicationData.Companion.getClass();
        ComplicationData.c.a(aVar.f232a, "TARGET_VALUE");
        aVar.f233b.putFloat("TARGET_VALUE", this.f6456l);
        l lVar = this.f6457m;
        if (lVar != null) {
            lVar.a(aVar);
        }
        u uVar = this.f6458n;
        if (uVar != null) {
            uVar.a(aVar);
        }
        c cVar = this.f6460p;
        aVar.b(cVar != null ? cVar.a() : null, "SHORT_TEXT");
        c cVar2 = this.f6459o;
        aVar.b(cVar2 != null ? cVar2.a() : null, "SHORT_TITLE");
        aVar.e(this.f6419b);
        c cVar3 = this.f6461q;
        if (!(cVar3 == null || (c9 = e.c(cVar3)) == null)) {
            complicationText = c9.a();
        }
        aVar.c(complicationText);
        e.g(this.f6421d, aVar);
        aVar.f(this.f6425i);
        a aVar2 = this.r;
        if (aVar2 != null) {
            aVar.b(aVar2.f6416a, "COLOR_RAMP");
            aVar.b(Boolean.valueOf(aVar2.f6417b), "COLOR_RAMP_INTERPOLATED");
        }
    }

    public final TimeDependentText c(Context context) {
        c c9;
        ComplicationText a9;
        k.e(context, "context");
        c cVar = this.f6461q;
        if (cVar != null && (c9 = e.c(cVar)) != null && (a9 = c9.a()) != null) {
            return a9;
        }
        ComplicationTextTemplate.b bVar = new ComplicationTextTemplate.b();
        e.a(bVar, this.f6460p, this.f6459o);
        ComplicationTextTemplate b9 = e.b(bVar);
        if (b9 != null) {
            return b9;
        }
        return new ComplicationText((CharSequence) context.getString(R.string.a11y_template_range, new Object[]{Float.valueOf(this.f6454j), Float.valueOf(this.f6456l)}));
    }

    public final Instant d(Instant instant) {
        Instant instant2;
        Instant instant3;
        c cVar = this.f6459o;
        if (cVar == null || (instant2 = cVar.d(instant)) == null) {
            instant2 = Instant.MAX;
        }
        c cVar2 = this.f6460p;
        if (cVar2 == null || (instant3 = cVar2.d(instant)) == null) {
            instant3 = Instant.MAX;
        }
        if (instant3.isBefore(instant2)) {
            return instant3;
        }
        k.d(instant2, "{\n            titleChangeInstant\n        }");
        return instant2;
    }

    public final String toString() {
        ComplicationData.Companion.getClass();
        String str = "REDACTED";
        String valueOf = ComplicationData.c.d() ? str : String.valueOf(this.f6454j);
        if (!ComplicationData.c.d()) {
            str = String.valueOf(this.f6455k);
        }
        return "GoalProgressComplicationData(value=" + valueOf + ", dynamicValue=" + str + ", targetValue=" + this.f6456l + ", monochromaticImage=" + this.f6457m + ", smallImage=" + this.f6458n + ", title=" + this.f6459o + ", text=" + this.f6460p + ", contentDescription=" + this.f6461q + "), tapActionLostDueToSerialization=" + this.f6425i + ", tapAction=" + this.f6419b + ", validTimeRange=" + this.f6421d + ", dataSource=" + this.e + ", colorRamp=" + this.r + ", persistencePolicy=" + this.f6422f + ", displayPolicy=" + this.f6423g + ", dynamicValueInvalidationFallback=" + this.f6424h + ')';
    }
}
