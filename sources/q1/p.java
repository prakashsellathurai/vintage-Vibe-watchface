package q1;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.support.wearable.complications.ComplicationData;
import android.support.wearable.complications.TimeDependentText;
import q7.k;

public final class p extends b {
    public p() {
        super(d.NOT_CONFIGURED, (PendingIntent) null, (ComplicationData) null, (ComponentName) null, 0, 0, (b) null);
    }

    public final void b(ComplicationData.a aVar) {
    }

    public final TimeDependentText c(Context context) {
        k.e(context, "context");
        return null;
    }

    public final String toString() {
        return "NotConfiguredComplicationData()";
    }
}
