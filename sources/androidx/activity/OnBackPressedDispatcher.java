package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.b0;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import h7.h;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import q7.k;
import q7.l;

public final class OnBackPressedDispatcher {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f269a;

    /* renamed from: b  reason: collision with root package name */
    public final i7.c<h> f270b = new i7.c<>();

    /* renamed from: c  reason: collision with root package name */
    public final a f271c;

    /* renamed from: d  reason: collision with root package name */
    public final OnBackInvokedCallback f272d;
    public OnBackInvokedDispatcher e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f273f;

    public final class LifecycleOnBackPressedCancellable implements p, a {

        /* renamed from: f  reason: collision with root package name */
        public final m f274f;

        /* renamed from: g  reason: collision with root package name */
        public final h f275g;

        /* renamed from: h  reason: collision with root package name */
        public d f276h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ OnBackPressedDispatcher f277i;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, m mVar, b0.c cVar) {
            k.e(cVar, "onBackPressedCallback");
            this.f277i = onBackPressedDispatcher;
            this.f274f = mVar;
            this.f275g = cVar;
            mVar.a(this);
        }

        public final void c(r rVar, m.a aVar) {
            if (aVar == m.a.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = this.f277i;
                onBackPressedDispatcher.getClass();
                h hVar = this.f275g;
                k.e(hVar, "onBackPressedCallback");
                onBackPressedDispatcher.f270b.addLast(hVar);
                d dVar = new d(hVar);
                hVar.f298b.add(dVar);
                if (Build.VERSION.SDK_INT >= 33) {
                    onBackPressedDispatcher.c();
                    hVar.f299c = onBackPressedDispatcher.f271c;
                }
                this.f276h = dVar;
            } else if (aVar == m.a.ON_STOP) {
                d dVar2 = this.f276h;
                if (dVar2 != null) {
                    dVar2.cancel();
                }
            } else if (aVar == m.a.ON_DESTROY) {
                cancel();
            }
        }

        public final void cancel() {
            this.f274f.b(this);
            h hVar = this.f275g;
            hVar.getClass();
            hVar.f298b.remove(this);
            d dVar = this.f276h;
            if (dVar != null) {
                dVar.cancel();
            }
            this.f276h = null;
        }
    }

    public static final class a extends l implements p7.a<h> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ OnBackPressedDispatcher f278f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(OnBackPressedDispatcher onBackPressedDispatcher) {
            super(0);
            this.f278f = onBackPressedDispatcher;
        }

        public final Object invoke() {
            this.f278f.c();
            return h.f4787a;
        }
    }

    public static final class b extends l implements p7.a<h> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ OnBackPressedDispatcher f279f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(OnBackPressedDispatcher onBackPressedDispatcher) {
            super(0);
            this.f279f = onBackPressedDispatcher;
        }

        public final Object invoke() {
            this.f279f.b();
            return h.f4787a;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final c f280a = new c();

        public final OnBackInvokedCallback a(p7.a<h> aVar) {
            k.e(aVar, "onBackInvoked");
            return new i(aVar);
        }

        public final void b(Object obj, int i8, Object obj2) {
            k.e(obj, "dispatcher");
            k.e(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i8, (OnBackInvokedCallback) obj2);
        }

        public final void c(Object obj, Object obj2) {
            k.e(obj, "dispatcher");
            k.e(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public final class d implements a {

        /* renamed from: f  reason: collision with root package name */
        public final h f281f;

        public d(h hVar) {
            this.f281f = hVar;
        }

        public final void cancel() {
            OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
            i7.c<h> cVar = onBackPressedDispatcher.f270b;
            h hVar = this.f281f;
            cVar.remove(hVar);
            hVar.getClass();
            hVar.f298b.remove(this);
            if (Build.VERSION.SDK_INT >= 33) {
                hVar.f299c = null;
                onBackPressedDispatcher.c();
            }
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f269a = runnable;
        if (Build.VERSION.SDK_INT >= 33) {
            this.f271c = new a(this);
            this.f272d = c.f280a.a(new b(this));
        }
    }

    public final void a(r rVar, b0.c cVar) {
        k.e(cVar, "onBackPressedCallback");
        m lifecycle = rVar.getLifecycle();
        if (((s) lifecycle).f1503d != m.b.f1491f) {
            cVar.f298b.add(new LifecycleOnBackPressedCancellable(this, lifecycle, cVar));
            if (Build.VERSION.SDK_INT >= 33) {
                c();
                cVar.f299c = this.f271c;
            }
        }
    }

    public final void b() {
        h hVar;
        i7.c<h> cVar = this.f270b;
        ListIterator<h> listIterator = cVar.listIterator(cVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                hVar = null;
                break;
            }
            hVar = listIterator.previous();
            if (hVar.f297a) {
                break;
            }
        }
        h hVar2 = hVar;
        if (hVar2 != null) {
            hVar2.a();
            return;
        }
        Runnable runnable = this.f269a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c() {
        boolean z8;
        OnBackInvokedCallback onBackInvokedCallback;
        i7.c<h> cVar = this.f270b;
        if (!(cVar instanceof Collection) || !cVar.isEmpty()) {
            Iterator<h> it = cVar.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f297a) {
                        z8 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z8 = false;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f272d) != null) {
            c cVar2 = c.f280a;
            if (z8 && !this.f273f) {
                cVar2.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f273f = true;
            } else if (!z8 && this.f273f) {
                cVar2.c(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f273f = false;
            }
        }
    }
}
