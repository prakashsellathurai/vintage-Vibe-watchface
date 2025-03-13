package com.samsung.android.wearable.watchfacestudio;

import com.samsung.android.wearable.watchfacestudio.a;
import java.util.TimerTask;

public final class b extends TimerTask {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f3857g = 0;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a.c f3858f;

    public b(a.c cVar) {
        this.f3858f = cVar;
    }

    public final void run() {
        this.f3858f.f3854b.post(new androidx.activity.b(5, this));
    }
}
