package c6;

import a1.a;
import android.app.KeyguardManager;
import android.content.Context;
import android.util.Log;
import d6.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import w5.d;
import w5.h;

public final class f extends d {

    /* renamed from: g  reason: collision with root package name */
    public boolean f2730g = false;

    /* renamed from: h  reason: collision with root package name */
    public int f2731h = 10000;

    /* renamed from: i  reason: collision with root package name */
    public int f2732i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int f2733j = 0;

    /* renamed from: k  reason: collision with root package name */
    public final h f2734k;

    public f(Context context, boolean z8, h hVar, c cVar) {
        super(context, z8, cVar);
        this.f2734k = hVar;
    }

    public final void b(d dVar, w5.f fVar) {
        int i8;
        switch (dVar.ordinal()) {
            case EXERCISE_TYPE_YOGA_VALUE:
                i8 = Integer.parseInt(fVar.h());
                break;
            case EXERCISE_TYPE_BACKPACKING_VALUE:
                i8 = Math.round((Float.parseFloat(fVar.h()) / 100.0f) * ((float) this.f2731h));
                break;
            case EXERCISE_TYPE_MOUNTAIN_BIKING_VALUE:
                int parseInt = Integer.parseInt(fVar.h());
                if (this.f2731h != parseInt) {
                    this.f2731h = parseInt;
                    this.f2717b.a(new ArrayList(Collections.singletonList(d.M0)));
                    o();
                    return;
                }
                return;
            default:
                return;
        }
        n(i8);
    }

    public final void c() {
    }

    public final d d() {
        return d.J0;
    }

    public final w5.f e(d dVar) {
        switch (dVar.ordinal()) {
            case EXERCISE_TYPE_YOGA_VALUE:
                return new w5.f(this.f2732i);
            case EXERCISE_TYPE_BACKPACKING_VALUE:
                return new w5.f(this.f2733j);
            case EXERCISE_TYPE_MOUNTAIN_BIKING_VALUE:
                return new w5.f(this.f2731h);
            default:
                return null;
        }
    }

    public final boolean f(d dVar) {
        HashMap hashMap = this.f2720f;
        return hashMap.containsKey(dVar) && ((Boolean) hashMap.get(dVar)).booleanValue();
    }

    public final void i(d dVar) {
        boolean isDeviceLocked = ((KeyguardManager) this.f2716a.getSystemService("keyguard")).isDeviceLocked();
        Log.i("DWF:ModelHealth", "onConnected: " + dVar + " isDeviceLocked: " + isDeviceLocked);
        if (!isDeviceLocked && d.J0.ordinal() <= dVar.ordinal() && dVar.ordinal() <= d.N0.ordinal() && !this.f2730g) {
            h hVar = this.f2734k;
            Object c9 = hVar.c();
            if (c9 != null) {
                this.f2731h = ((Integer) c9).intValue();
            }
            hVar.a(new w5.c("COMPLICATION.internal_step_complication.TEXT"), new j5.c(this, 1));
            this.f2730g = true;
        }
    }

    public final void j(d dVar) {
        Log.i("DWF:ModelHealth", "onDisconnected: " + dVar);
    }

    public final void k() {
    }

    public final void l() {
    }

    public final d m() {
        return d.N0;
    }

    public final void n(int i8) {
        if (this.f2732i != i8) {
            this.f2732i = i8;
            this.f2717b.a(new ArrayList(Collections.singletonList(d.K0)));
            o();
        }
    }

    public final void o() {
        int i8 = this.f2731h;
        int k8 = i8 != 0 ? (int) a.k((((float) this.f2732i) / ((float) i8)) * 100.0f, 0.0f, 100.0f) : 0;
        if (this.f2733j != k8) {
            this.f2733j = k8;
            this.f2717b.a(new ArrayList(Collections.singletonList(d.L0)));
        }
    }
}
