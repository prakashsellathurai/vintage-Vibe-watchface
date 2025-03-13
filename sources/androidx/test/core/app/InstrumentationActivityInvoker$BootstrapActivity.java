package androidx.test.core.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import androidx.test.internal.platform.ThreadChecker;
import androidx.test.internal.util.Checks;

public class InstrumentationActivityInvoker$BootstrapActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    public final BroadcastReceiver f1922a = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            InstrumentationActivityInvoker$BootstrapActivity instrumentationActivityInvoker$BootstrapActivity = InstrumentationActivityInvoker$BootstrapActivity.this;
            instrumentationActivityInvoker$BootstrapActivity.finishActivity(0);
            instrumentationActivityInvoker$BootstrapActivity.finish();
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public boolean f1923b;

    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public final void onActivityResult(int i8, int i9, Intent intent) {
        if (i8 == 0) {
            Intent intent2 = new Intent("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_RECEIVED");
            intent2.putExtra("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_CODE_KEY", i9);
            if (intent != null) {
                intent2.putExtra("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_DATA_KEY", intent);
            }
            sendBroadcast(intent2);
            finish();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        registerReceiver(this.f1922a, new IntentFilter("androidx.test.core.app.InstrumentationActivityInvoker.FINISH_BOOTSTRAP_ACTIVITY"));
        this.f1923b = bundle != null && bundle.getBoolean("IS_TARGET_ACTIVITY_STARTED_KEY", false);
        overridePendingTransition(0, 0);
    }

    public final void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f1922a);
    }

    public final void onResume() {
        super.onResume();
        if (!this.f1923b) {
            this.f1923b = true;
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("androidx.test.core.app.InstrumentationActivityInvoker.START_TARGET_ACTIVITY_INTENT_KEY");
            ThreadChecker threadChecker = Checks.f1929a;
            pendingIntent.getClass();
            Bundle bundleExtra = getIntent().getBundleExtra("androidx.test.core.app.InstrumentationActivityInvoker.TARGET_ACTIVITY_OPTIONS_BUNDLE_KEY");
            if (bundleExtra != null) {
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 0, (Intent) null, 268435456, 0, 0, bundleExtra);
                } catch (IntentSender.SendIntentException e) {
                    Log.e("androidx.test.core.app.InstrumentationActivityInvoker$BootstrapActivity", "Failed to start target activity.", e);
                    throw new RuntimeException(e);
                }
            } else {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 0, (Intent) null, 268435456, 0, 0);
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("IS_TARGET_ACTIVITY_STARTED_KEY", this.f1923b);
    }
}
