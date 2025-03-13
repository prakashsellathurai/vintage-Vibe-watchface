package x6;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.util.EnumSet;
import p6.e;
import p6.g;
import p6.i;
import x6.c;
import y6.a;

public final class b implements e, i, f {

    /* renamed from: a  reason: collision with root package name */
    public final EnumSet<c.a> f8165a = EnumSet.noneOf(c.a.class);

    /* renamed from: b  reason: collision with root package name */
    public int f8166b = 1;

    /* renamed from: c  reason: collision with root package name */
    public int f8167c = 1;

    /* renamed from: d  reason: collision with root package name */
    public long f8168d = 0;
    public long e = 0;

    /* renamed from: f  reason: collision with root package name */
    public boolean f8169f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f8170g = false;

    /* renamed from: h  reason: collision with root package name */
    public int f8171h = 1;

    /* renamed from: i  reason: collision with root package name */
    public final g f8172i;

    /* renamed from: j  reason: collision with root package name */
    public final e f8173j;

    /* renamed from: k  reason: collision with root package name */
    public int f8174k = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f8175l = 0;

    /* renamed from: m  reason: collision with root package name */
    public boolean f8176m;

    /* renamed from: n  reason: collision with root package name */
    public long f8177n;

    /* renamed from: o  reason: collision with root package name */
    public long f8178o = 0;

    /* renamed from: p  reason: collision with root package name */
    public Handler f8179p;

    public b(g gVar, g gVar2) {
        this.f8173j = gVar2;
        this.f8172i = gVar;
    }

    public final void a(long j8) {
        this.f8178o = SystemClock.elapsedRealtime() - this.f8177n;
        g gVar = this.f8172i;
        a aVar = gVar.f8193t;
        float c9 = aVar != null ? aVar.c() : 0.0f;
        float f9 = ((float) this.f8178o) / c9;
        a aVar2 = gVar.f8193t;
        if (aVar2 != null) {
            aVar2.i(a1.a.k(f9, 0.0f, 1.0f));
            gVar.A();
        }
        if (((float) this.f8178o) >= c9) {
            this.f8173j.b(this);
            if ((!this.f8169f || this.f8176m) && this.f8175l >= this.f8174k) {
                e();
                return;
            }
            this.f8175l++;
            long j9 = this.f8168d;
            if (j9 > 0) {
                androidx.activity.b bVar = new androidx.activity.b(9, this);
                Handler handler = this.f8179p;
                if (handler != null) {
                    handler.removeCallbacksAndMessages((Object) null);
                }
                Handler handler2 = new Handler(Looper.getMainLooper());
                this.f8179p = handler2;
                handler2.postDelayed(bVar, j9);
                return;
            }
            f();
        }
    }

    public final void b(boolean z8) {
        StringBuilder sb = new StringBuilder("onVisibilityChanged :");
        sb.append(z8);
        sb.append(" trigger : ");
        EnumSet<c.a> enumSet = this.f8165a;
        sb.append(enumSet);
        sb.append(" animationState : ");
        sb.append(b6.a.u(this.f8171h));
        Log.i("DWF:AnimationController", sb.toString());
        g gVar = this.f8172i;
        e eVar = this.f8173j;
        if (z8) {
            int i8 = this.f8171h;
            c.a aVar = c.a.f8185g;
            if (i8 == 3) {
                Log.i("DWF:AnimationController", "[" + hashCode() + "] onResume");
                eVar.a(this);
                gVar.f8191q = true;
                gVar.r = false;
                if (!enumSet.contains(aVar)) {
                    this.f8176m = true;
                }
                this.f8171h = 2;
                this.f8177n = SystemClock.elapsedRealtime() - this.f8178o;
            } else if (enumSet.contains(aVar)) {
                d();
            } else if (this.f8171h == 1) {
                Log.i("DWF:AnimationController", "onReady");
                c(this.f8166b);
            }
        } else {
            if (this.f8171h != 2 || !this.f8170g) {
                e();
            } else {
                Log.i("DWF:AnimationController", "[" + hashCode() + "] onPause");
                eVar.b(this);
                gVar.f8191q = false;
                this.f8171h = 3;
                this.f8178o = SystemClock.elapsedRealtime() - this.f8177n;
            }
            Handler handler = this.f8179p;
            if (handler != null) {
                handler.removeCallbacksAndMessages((Object) null);
            }
        }
    }

    public final void c(int i8) {
        if (i8 != 0) {
            int i9 = i8 - 1;
            g gVar = this.f8172i;
            if (i9 == 1) {
                a aVar = gVar.f8193t;
                if (aVar != null) {
                    aVar.h();
                }
            } else if (i9 == 2) {
                gVar.r = true;
            } else if (i9 == 3) {
                gVar.f8196j = false;
            } else {
                return;
            }
            gVar.A();
            return;
        }
        throw null;
    }

    public final void d() {
        Log.i("DWF:AnimationController", "[" + hashCode() + "] onPlay : " + this.e);
        this.f8175l = 0;
        long j8 = this.e;
        if (j8 > 0) {
            androidx.activity.b bVar = new androidx.activity.b(9, this);
            Handler handler = this.f8179p;
            if (handler != null) {
                handler.removeCallbacksAndMessages((Object) null);
            }
            Handler handler2 = new Handler(Looper.getMainLooper());
            this.f8179p = handler2;
            handler2.postDelayed(bVar, j8);
        } else {
            f();
        }
        this.f8176m = false;
    }

    public final void e() {
        Log.i("DWF:AnimationController", "[" + hashCode() + "] onStop");
        this.f8173j.b(this);
        this.f8172i.f8191q = false;
        c(this.f8167c);
        this.f8171h = 1;
    }

    public final void f() {
        this.f8173j.a(this);
        this.f8178o = 0;
        this.f8177n = SystemClock.elapsedRealtime();
        g gVar = this.f8172i;
        a aVar = gVar.f8193t;
        if (aVar != null) {
            aVar.h();
        }
        gVar.f8191q = true;
        gVar.r = false;
        gVar.f8196j = true;
        this.f8171h = 2;
    }

    public final void h(c.a aVar) {
        if (aVar != c.a.f8185g) {
            d();
        }
    }

    public final boolean i(c.a aVar) {
        return this.f8165a.contains(aVar);
    }
}
