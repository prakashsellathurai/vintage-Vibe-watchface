package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepName;
import o3.a;
import q3.d;
import r3.b;

@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f3015b = 0;

    /* renamed from: a  reason: collision with root package name */
    public int f3016a = 0;

    public final void onActivityResult(int i8, int i9, @RecentlyNonNull Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (i8 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f3016a = 0;
            setResult(i9, intent);
            if (booleanExtra) {
                d c9 = d.c(this);
                if (i9 == -1) {
                    Handler handler = c9.f6549l;
                    handler.sendMessage(handler.obtainMessage(3));
                } else if (i9 == 0) {
                    a aVar = new a(13, (PendingIntent) null);
                    int intExtra = getIntent().getIntExtra("failing_client_id", -1);
                    if (!c9.e(aVar, intExtra)) {
                        Handler handler2 = c9.f6549l;
                        handler2.sendMessage(handler2.obtainMessage(5, intExtra, 0, aVar));
                    }
                }
            }
        } else if (i8 == 2) {
            this.f3016a = 0;
            setResult(i9, intent);
        }
        finish();
    }

    public final void onCancel(@RecentlyNonNull DialogInterface dialogInterface) {
        this.f3016a = 0;
        setResult(0);
        finish();
    }

    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f3016a = bundle.getInt("resolution");
        }
        if (this.f3016a != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                str = "Activity started without extras";
            } else {
                PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
                Integer num = (Integer) extras.get("error_code");
                if (pendingIntent == null && num == null) {
                    str = "Activity started without resolution";
                } else if (pendingIntent != null) {
                    try {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent) null, 0, 0, 0);
                        this.f3016a = 1;
                        return;
                    } catch (ActivityNotFoundException e) {
                        if (extras.getBoolean("notify_manager", true)) {
                            d c9 = d.c(this);
                            a aVar = new a(22, (PendingIntent) null);
                            int intExtra = getIntent().getIntExtra("failing_client_id", -1);
                            if (!c9.e(aVar, intExtra)) {
                                Handler handler = c9.f6549l;
                                handler.sendMessage(handler.obtainMessage(5, intExtra, 0, aVar));
                            }
                        } else {
                            String valueOf = String.valueOf(pendingIntent);
                            StringBuilder sb = new StringBuilder(valueOf.length() + 36);
                            sb.append("Activity not found while launching ");
                            sb.append(valueOf);
                            sb.append(".");
                            String sb2 = sb.toString();
                            if (Build.FINGERPRINT.contains("generic")) {
                                sb2 = String.valueOf(sb2).concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                            }
                            Log.e("GoogleApiActivity", sb2, e);
                        }
                        this.f3016a = 1;
                    } catch (IntentSender.SendIntentException e4) {
                        Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e4);
                    }
                } else {
                    b.b(num);
                    o3.d.f6090c.d(this, num.intValue(), this);
                    this.f3016a = 1;
                    return;
                }
            }
            Log.e("GoogleApiActivity", str);
            finish();
        }
    }

    public final void onSaveInstanceState(@RecentlyNonNull Bundle bundle) {
        bundle.putInt("resolution", this.f3016a);
        super.onSaveInstanceState(bundle);
    }
}
