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
import q7.k;

public final class o extends b {

    /* renamed from: j  reason: collision with root package name */
    public final c f6477j;

    /* renamed from: k  reason: collision with root package name */
    public final c f6478k;

    /* renamed from: l  reason: collision with root package name */
    public final l f6479l;

    /* renamed from: m  reason: collision with root package name */
    public final u f6480m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(c cVar, c cVar2, l lVar, u uVar, ComplicationData complicationData, ComponentName componentName, int i8, int i9) {
        super(d.NO_PERMISSION, (PendingIntent) null, complicationData, componentName, i8, i9, (b) null);
        this.f6477j = cVar;
        this.f6478k = cVar2;
        this.f6479l = lVar;
        this.f6480m = uVar;
    }

    public final void b(ComplicationData.a aVar) {
        super.b(aVar);
        ComplicationText complicationText = null;
        c cVar = this.f6477j;
        aVar.b(cVar != null ? cVar.a() : null, "SHORT_TEXT");
        c cVar2 = this.f6478k;
        if (cVar2 != null) {
            complicationText = cVar2.a();
        }
        aVar.b(complicationText, "SHORT_TITLE");
        l lVar = this.f6479l;
        if (lVar != null) {
            lVar.a(aVar);
        }
        u uVar = this.f6480m;
        if (uVar != null) {
            uVar.a(aVar);
        }
    }

    public final TimeDependentText c(Context context) {
        k.e(context, "context");
        ComplicationTextTemplate.b bVar = new ComplicationTextTemplate.b();
        e.a(bVar, this.f6477j, this.f6478k);
        bVar.f235a.add(new ComplicationText((CharSequence) context.getString(R.string.a11y_no_permission)));
        return e.b(bVar);
    }

    public final Instant d(Instant instant) {
        Instant instant2;
        Instant instant3;
        c cVar = this.f6478k;
        if (cVar == null || (instant2 = cVar.d(instant)) == null) {
            instant2 = Instant.MAX;
        }
        c cVar2 = this.f6477j;
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
        return "NoPermissionComplicationData(text=" + this.f6477j + ", title=" + this.f6478k + ", monochromaticImage=" + this.f6479l + ", smallImage=" + this.f6480m + ", tapActionLostDueToSerialization=" + this.f6425i + ", tapAction=" + this.f6419b + ", validTimeRange=" + this.f6421d + ", dataSource=" + this.e + ", persistencePolicy=" + this.f6422f + ", displayPolicy=" + this.f6423g + ')';
    }
}
