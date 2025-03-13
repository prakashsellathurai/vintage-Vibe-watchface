package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import androidx.activity.ComponentActivity;

public final class f implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f290f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ IntentSender.SendIntentException f291g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity.b f292h;

    public f(ComponentActivity.b bVar, int i8, IntentSender.SendIntentException sendIntentException) {
        this.f292h = bVar;
        this.f290f = i8;
        this.f291g = sendIntentException;
    }

    public final void run() {
        this.f292h.a(this.f290f, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f291g));
    }
}
