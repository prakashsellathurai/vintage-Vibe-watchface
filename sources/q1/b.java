package q1;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.support.wearable.complications.ComplicationData;
import android.support.wearable.complications.TimeDependentText;
import java.time.Instant;
import q7.k;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public final d f6418a;

    /* renamed from: b  reason: collision with root package name */
    public final PendingIntent f6419b;

    /* renamed from: c  reason: collision with root package name */
    public ComplicationData f6420c;

    /* renamed from: d  reason: collision with root package name */
    public final z f6421d;
    public final ComponentName e;

    /* renamed from: f  reason: collision with root package name */
    public final int f6422f;

    /* renamed from: g  reason: collision with root package name */
    public final int f6423g;

    /* renamed from: h  reason: collision with root package name */
    public final b f6424h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f6425i;

    public /* synthetic */ b(d dVar, PendingIntent pendingIntent, ComplicationData complicationData, ComponentName componentName, int i8, int i9, b bVar) {
        this(dVar, pendingIntent, complicationData, z.f6510c, componentName, i8, i9, bVar);
    }

    public b(d dVar, PendingIntent pendingIntent, ComplicationData complicationData, z zVar, ComponentName componentName, int i8, int i9, b bVar) {
        this.f6418a = dVar;
        this.f6419b = pendingIntent;
        this.f6420c = complicationData;
        this.f6421d = zVar;
        this.e = componentName;
        this.f6422f = i8;
        this.f6423g = i9;
        this.f6424h = bVar;
        this.f6425i = complicationData != null ? complicationData.getTapActionLostDueToSerialization() : false;
    }

    public final ComplicationData a() {
        ComplicationData.a aVar;
        ComplicationData complicationData = this.f6420c;
        if (complicationData != null) {
            return complicationData;
        }
        if (complicationData == null) {
            aVar = new ComplicationData.a(this.f6418a.f6450f);
        }
        b(aVar);
        ComplicationData a9 = aVar.a();
        this.f6420c = a9;
        return a9;
    }

    public void b(ComplicationData.a aVar) {
        ComplicationData complicationData;
        ComplicationData.a aVar2;
        aVar.b(this.e, "FIELD_DATA_SOURCE");
        int i8 = this.f6422f;
        Bundle bundle = aVar.f233b;
        bundle.putInt("PERSISTENCE_POLICY", i8);
        bundle.putInt("DISPLAY_POLICY", this.f6423g);
        b bVar = this.f6424h;
        if (bVar == null) {
            complicationData = null;
        } else {
            ComplicationData complicationData2 = bVar.f6420c;
            if (complicationData2 == null) {
                aVar2 = new ComplicationData.a(bVar.f6418a.f6450f);
            }
            bVar.b(aVar2);
            complicationData = aVar2.a();
        }
        aVar.d(complicationData);
    }

    public abstract TimeDependentText c(Context context);

    public Instant d(Instant instant) {
        Instant instant2 = Instant.MAX;
        k.d(instant2, "MAX");
        return instant2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && k.a(a(), ((b) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
