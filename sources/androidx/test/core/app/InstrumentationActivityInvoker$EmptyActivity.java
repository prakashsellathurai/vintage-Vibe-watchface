package androidx.test.core.app;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class InstrumentationActivityInvoker$EmptyActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    public final BroadcastReceiver f1925a = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            InstrumentationActivityInvoker$EmptyActivity.this.finish();
        }
    };

    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        registerReceiver(this.f1925a, new IntentFilter("androidx.test.core.app.InstrumentationActivityInvoker.FINISH_EMPTY_ACTIVITIES"));
        overridePendingTransition(0, 0);
    }

    public final void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f1925a);
    }

    public final void onResume() {
        super.onResume();
        sendBroadcast(new Intent("androidx.test.core.app.InstrumentationActivityInvoker.EMPTY_ACTIVITY_RESUMED"));
    }
}
