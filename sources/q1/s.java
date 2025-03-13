package q1;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.support.wearable.complications.ComplicationData;
import android.support.wearable.complications.ComplicationText;
import android.support.wearable.complications.ComplicationTextTemplate;
import android.support.wearable.complications.TimeDependentText;
import androidx.health.services.client.R;
import java.time.Instant;
import l1.e;
import q7.k;

public final class s extends b {

    /* renamed from: j  reason: collision with root package name */
    public final float f6486j;

    /* renamed from: k  reason: collision with root package name */
    public final e.r f6487k;

    /* renamed from: l  reason: collision with root package name */
    public final float f6488l;

    /* renamed from: m  reason: collision with root package name */
    public final float f6489m;

    /* renamed from: n  reason: collision with root package name */
    public final l f6490n;

    /* renamed from: o  reason: collision with root package name */
    public final u f6491o;

    /* renamed from: p  reason: collision with root package name */
    public final c f6492p;

    /* renamed from: q  reason: collision with root package name */
    public final c f6493q;
    public final c r;

    /* renamed from: s  reason: collision with root package name */
    public final a f6494s;

    /* renamed from: t  reason: collision with root package name */
    public final int f6495t;

    /* renamed from: u  reason: collision with root package name */
    public final c f6496u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(float f9, e.r rVar, float f10, float f11, l lVar, u uVar, c cVar, c cVar2, c cVar3, PendingIntent pendingIntent, z zVar, ComplicationData complicationData, ComponentName componentName, a aVar, int i8, int i9, int i10, s sVar) {
        super(d.RANGED_VALUE, pendingIntent, complicationData, zVar == null ? z.f6510c : zVar, componentName, i9, i10, sVar);
        c cVar4 = cVar3;
        this.f6486j = f9;
        this.f6487k = rVar;
        this.f6488l = f10;
        this.f6489m = f11;
        this.f6490n = lVar;
        this.f6491o = uVar;
        this.f6492p = cVar;
        this.f6493q = cVar2;
        this.r = cVar4;
        this.f6494s = aVar;
        this.f6495t = i8;
        this.f6496u = cVar4 == null ? c.f6436a : cVar4;
    }

    public final void b(ComplicationData.a aVar) {
        c c9;
        super.b(aVar);
        aVar.b(Float.valueOf(this.f6486j), "VALUE");
        ComplicationText complicationText = null;
        e.r rVar = this.f6487k;
        aVar.b(rVar != null ? rVar.a() : null, "DYNAMIC_VALUE");
        ComplicationData.c cVar = ComplicationData.Companion;
        cVar.getClass();
        int i8 = aVar.f232a;
        ComplicationData.c.a(i8, "MIN_VALUE");
        Bundle bundle = aVar.f233b;
        bundle.putFloat("MIN_VALUE", this.f6488l);
        cVar.getClass();
        ComplicationData.c.a(i8, "MAX_VALUE");
        bundle.putFloat("MAX_VALUE", this.f6489m);
        l lVar = this.f6490n;
        if (lVar != null) {
            lVar.a(aVar);
        }
        u uVar = this.f6491o;
        if (uVar != null) {
            uVar.a(aVar);
        }
        c cVar2 = this.f6493q;
        aVar.b(cVar2 != null ? cVar2.a() : null, "SHORT_TEXT");
        c cVar3 = this.f6492p;
        aVar.b(cVar3 != null ? cVar3.a() : null, "SHORT_TITLE");
        aVar.e(this.f6419b);
        c cVar4 = this.r;
        if (!(cVar4 == null || (c9 = e.c(cVar4)) == null)) {
            complicationText = c9.a();
        }
        aVar.c(complicationText);
        e.g(this.f6421d, aVar);
        aVar.f(this.f6425i);
        a aVar2 = this.f6494s;
        if (aVar2 != null) {
            aVar.b(aVar2.f6416a, "COLOR_RAMP");
            aVar.b(Boolean.valueOf(aVar2.f6417b), "COLOR_RAMP_INTERPOLATED");
        }
        cVar.getClass();
        ComplicationData.c.a(i8, "VALUE_TYPE");
        bundle.putInt("VALUE_TYPE", this.f6495t);
    }

    public final TimeDependentText c(Context context) {
        c c9;
        ComplicationText a9;
        k.e(context, "context");
        c cVar = this.r;
        if (cVar != null && (c9 = e.c(cVar)) != null && (a9 = c9.a()) != null) {
            return a9;
        }
        ComplicationTextTemplate.b bVar = new ComplicationTextTemplate.b();
        e.a(bVar, this.f6493q, this.f6492p);
        ComplicationTextTemplate b9 = e.b(bVar);
        if (b9 != null) {
            return b9;
        }
        return new ComplicationText((CharSequence) context.getString(R.string.a11y_template_range, new Object[]{Float.valueOf(this.f6486j), Float.valueOf(this.f6489m)}));
    }

    public final Instant d(Instant instant) {
        Instant instant2;
        Instant instant3;
        c cVar = this.f6492p;
        if (cVar == null || (instant2 = cVar.d(instant)) == null) {
            instant2 = Instant.MAX;
        }
        c cVar2 = this.f6493q;
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
        String valueOf = ComplicationData.c.d() ? str : String.valueOf(this.f6486j);
        if (!ComplicationData.c.d()) {
            str = String.valueOf(this.f6487k);
        }
        return "RangedValueComplicationData(value=" + valueOf + ", dynamicValue=" + str + ", valueType=" + this.f6495t + ", min=" + this.f6488l + ", max=" + this.f6489m + ", monochromaticImage=" + this.f6490n + ", smallImage=" + this.f6491o + ", title=" + this.f6492p + ", text=" + this.f6493q + ", contentDescription=" + this.r + "), tapActionLostDueToSerialization=" + this.f6425i + ", tapAction=" + this.f6419b + ", validTimeRange=" + this.f6421d + ", dataSource=" + this.e + ", colorRamp=" + this.f6494s + ", persistencePolicy=" + this.f6422f + ", displayPolicy=" + this.f6423g + ", dynamicValueInvalidationFallback=" + this.f6424h + ')';
    }
}
