package z;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8632a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<c> f8633b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<h> f8634c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<c> f8635d = new ArrayList<>();
    public CharSequence e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f8636f;

    /* renamed from: g  reason: collision with root package name */
    public PendingIntent f8637g;

    /* renamed from: h  reason: collision with root package name */
    public int f8638h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f8639i = true;

    /* renamed from: j  reason: collision with root package name */
    public f f8640j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f8641k = false;

    /* renamed from: l  reason: collision with root package name */
    public Bundle f8642l;

    /* renamed from: m  reason: collision with root package name */
    public String f8643m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f8644n;

    /* renamed from: o  reason: collision with root package name */
    public final Notification f8645o;
    @Deprecated

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList<String> f8646p;

    @Deprecated
    public e(Context context) {
        Notification notification = new Notification();
        this.f8645o = notification;
        this.f8632a = context;
        this.f8643m = null;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f8638h = 0;
        this.f8646p = new ArrayList<>();
        this.f8644n = true;
    }

    public static CharSequence b(String str) {
        return (str != null && str.length() > 5120) ? str.subSequence(0, 5120) : str;
    }

    public final Bundle a() {
        if (this.f8642l == null) {
            this.f8642l = new Bundle();
        }
        return this.f8642l;
    }

    public final void c(d dVar) {
        if (this.f8640j != dVar) {
            this.f8640j = dVar;
            if (dVar.f8647a != this) {
                dVar.f8647a = this;
                c(dVar);
            }
        }
    }
}
