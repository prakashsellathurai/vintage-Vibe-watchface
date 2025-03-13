package x6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.ArrayList;
import r5.f;

public final class c extends BroadcastReceiver implements f {
    public static final /* synthetic */ int e = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f8180a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f8181b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f8182c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public boolean f8183d = true;

    public enum a {
        f8184f,
        f8185g,
        f8186h,
        f8187i,
        f8188j;

        /* access modifiers changed from: public */
        a() {
        }
    }

    public c() {
        int hashCode = hashCode();
        this.f8180a = hashCode;
        Intent intent = new Intent("DWF:EventTriggerAction");
        this.f8181b = intent;
        intent.putExtra("id", hashCode);
    }

    public final Intent a(a aVar) {
        Intent intent = this.f8181b;
        intent.putExtra("type", aVar.toString());
        return intent;
    }

    public final void b(boolean z8) {
        this.f8183d = z8;
    }

    public final void onReceive(Context context, Intent intent) {
        int i8;
        if (intent.getAction().equals("DWF:EventTriggerAction") && intent.getIntExtra("id", -1) == (i8 = this.f8180a)) {
            String stringExtra = intent.getStringExtra("type");
            String str = "DWF:EventTriggerAction[" + i8 + "] " + stringExtra;
            if (this.f8183d) {
                Log.i("DWF:EventTrigger", str);
                this.f8182c.forEach(new f(20, stringExtra));
                return;
            }
            Log.i("DWF:EventTrigger", "Ignored: " + str);
        }
    }
}
