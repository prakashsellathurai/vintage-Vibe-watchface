package r2;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import k3.f;
import p2.a;
import p2.d;
import p2.e;
import r2.h;
import r2.m;
import v2.n;

public final class a0 implements h, h.a {

    /* renamed from: f  reason: collision with root package name */
    public final i<?> f6741f;

    /* renamed from: g  reason: collision with root package name */
    public final h.a f6742g;

    /* renamed from: h  reason: collision with root package name */
    public int f6743h;

    /* renamed from: i  reason: collision with root package name */
    public e f6744i;

    /* renamed from: j  reason: collision with root package name */
    public Object f6745j;

    /* renamed from: k  reason: collision with root package name */
    public volatile n.a<?> f6746k;

    /* renamed from: l  reason: collision with root package name */
    public f f6747l;

    public a0(i<?> iVar, h.a aVar) {
        this.f6741f = iVar;
        this.f6742g = aVar;
    }

    /* JADX INFO: finally extract failed */
    public final boolean a() {
        Object obj = this.f6745j;
        if (obj != null) {
            this.f6745j = null;
            int i8 = f.f5137a;
            SystemClock.elapsedRealtimeNanos();
            try {
                d<X> d9 = this.f6741f.d(obj);
                g gVar = new g(d9, obj, this.f6741f.f6777i);
                e eVar = this.f6746k.f7884a;
                i<?> iVar = this.f6741f;
                this.f6747l = new f(eVar, iVar.f6782n);
                ((m.c) iVar.f6776h).a().c(this.f6747l, gVar);
                if (Log.isLoggable("SourceGenerator", 2)) {
                    Objects.toString(this.f6747l);
                    obj.toString();
                    d9.toString();
                    SystemClock.elapsedRealtimeNanos();
                }
                this.f6746k.f7886c.b();
                this.f6744i = new e(Collections.singletonList(this.f6746k.f7884a), this.f6741f, this);
            } catch (Throwable th) {
                this.f6746k.f7886c.b();
                throw th;
            }
        }
        e eVar2 = this.f6744i;
        if (eVar2 != null && eVar2.a()) {
            return true;
        }
        this.f6744i = null;
        this.f6746k = null;
        boolean z8 = false;
        while (!z8) {
            if (!(this.f6743h < this.f6741f.b().size())) {
                break;
            }
            ArrayList b9 = this.f6741f.b();
            int i9 = this.f6743h;
            this.f6743h = i9 + 1;
            this.f6746k = (n.a) b9.get(i9);
            if (this.f6746k != null) {
                if (!this.f6741f.f6784p.c(this.f6746k.f7886c.e())) {
                    if (!(this.f6741f.c(this.f6746k.f7886c.a()) != null)) {
                    }
                }
                this.f6746k.f7886c.f(this.f6741f.f6783o, new z(this, this.f6746k));
                z8 = true;
            }
        }
        return z8;
    }

    public final void cancel() {
        n.a<?> aVar = this.f6746k;
        if (aVar != null) {
            aVar.f7886c.cancel();
        }
    }

    public final void e() {
        throw new UnsupportedOperationException();
    }

    public final void f(e eVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, a aVar) {
        this.f6742g.f(eVar, exc, dVar, this.f6746k.f7886c.e());
    }

    public final void g(e eVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, a aVar, e eVar2) {
        this.f6742g.g(eVar, obj, dVar, this.f6746k.f7886c.e(), eVar);
    }
}
