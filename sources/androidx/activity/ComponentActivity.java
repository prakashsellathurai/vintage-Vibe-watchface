package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.f;
import androidx.activity.result.g;
import androidx.health.services.client.R;
import androidx.lifecycle.SavedStateHandleAttacher;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.h0;
import androidx.lifecycle.k;
import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import androidx.lifecycle.m;
import androidx.lifecycle.n0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import d.a;
import j0.h;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import k3.j;
import z.a;

public class ComponentActivity extends z.b implements o0, k, b1.c, j, g {

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ int f241t = 0;

    /* renamed from: b  reason: collision with root package name */
    public final c.a f242b = new c.a();

    /* renamed from: c  reason: collision with root package name */
    public final h f243c = new h();

    /* renamed from: d  reason: collision with root package name */
    public final s f244d;
    public final b1.b e;

    /* renamed from: f  reason: collision with root package name */
    public n0 f245f;

    /* renamed from: g  reason: collision with root package name */
    public h0 f246g;

    /* renamed from: h  reason: collision with root package name */
    public final OnBackPressedDispatcher f247h;

    /* renamed from: i  reason: collision with root package name */
    public final e f248i;

    /* renamed from: j  reason: collision with root package name */
    public final g f249j;

    /* renamed from: k  reason: collision with root package name */
    public final AtomicInteger f250k;

    /* renamed from: l  reason: collision with root package name */
    public final b f251l;

    /* renamed from: m  reason: collision with root package name */
    public final CopyOnWriteArrayList<i0.a<Configuration>> f252m;

    /* renamed from: n  reason: collision with root package name */
    public final CopyOnWriteArrayList<i0.a<Integer>> f253n;

    /* renamed from: o  reason: collision with root package name */
    public final CopyOnWriteArrayList<i0.a<Intent>> f254o;

    /* renamed from: p  reason: collision with root package name */
    public final CopyOnWriteArrayList<i0.a<j>> f255p;

    /* renamed from: q  reason: collision with root package name */
    public final CopyOnWriteArrayList<i0.a<j>> f256q;
    public boolean r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f257s;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            }
        }
    }

    public class b extends f {
        public b() {
        }

        public final void b(int i8, d.a aVar, Object obj) {
            Bundle bundle;
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0047a b9 = aVar.b(componentActivity, obj);
            if (b9 != null) {
                new Handler(Looper.getMainLooper()).post(new e(this, i8, b9));
                return;
            }
            Intent a9 = aVar.a(componentActivity, obj);
            if (a9.getExtras() != null && a9.getExtras().getClassLoader() == null) {
                a9.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a9.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = a9.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a9.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a9.getAction())) {
                String[] stringArrayExtra = a9.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                z.a.b(componentActivity, stringArrayExtra, i8);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a9.getAction())) {
                androidx.activity.result.h hVar = (androidx.activity.result.h) a9.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    IntentSender intentSender = hVar.f324f;
                    Intent intent = hVar.f325g;
                    int i9 = hVar.f326h;
                    int i10 = hVar.f327i;
                    int i11 = z.a.f8629b;
                    a.C0158a.c(componentActivity, intentSender, i8, intent, i9, i10, 0, bundle);
                } catch (IntentSender.SendIntentException e) {
                    new Handler(Looper.getMainLooper()).post(new f(this, i8, e));
                }
            } else {
                int i12 = z.a.f8629b;
                a.C0158a.b(componentActivity, a9, i8, bundle);
            }
        }
    }

    public static class c {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public n0 f263a;
    }

    public class e implements Executor, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final long f264f = (SystemClock.uptimeMillis() + 10000);

        /* renamed from: g  reason: collision with root package name */
        public Runnable f265g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f266h = false;

        public e() {
        }

        public final void a(View view) {
            if (!this.f266h) {
                this.f266h = true;
                view.getViewTreeObserver().addOnDrawListener(this);
            }
        }

        public final void execute(Runnable runnable) {
            this.f265g = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            if (!this.f266h) {
                decorView.postOnAnimation(new b(1, this));
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        public final void onDraw() {
            boolean z8;
            Runnable runnable = this.f265g;
            if (runnable != null) {
                runnable.run();
                this.f265g = null;
                g gVar = ComponentActivity.this.f249j;
                synchronized (gVar.f294b) {
                    z8 = gVar.f295c;
                }
                if (!z8) {
                    return;
                }
            } else if (SystemClock.uptimeMillis() <= this.f264f) {
                return;
            }
            this.f266h = false;
            ComponentActivity.this.getWindow().getDecorView().post(this);
        }

        public final void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    public ComponentActivity() {
        s sVar = new s(this);
        this.f244d = sVar;
        b1.b bVar = new b1.b(this);
        this.e = bVar;
        this.f247h = new OnBackPressedDispatcher(new a());
        e eVar = new e();
        this.f248i = eVar;
        this.f249j = new g(eVar, new c(this));
        this.f250k = new AtomicInteger();
        this.f251l = new b();
        this.f252m = new CopyOnWriteArrayList<>();
        this.f253n = new CopyOnWriteArrayList<>();
        this.f254o = new CopyOnWriteArrayList<>();
        this.f255p = new CopyOnWriteArrayList<>();
        this.f256q = new CopyOnWriteArrayList<>();
        boolean z8 = false;
        this.r = false;
        this.f257s = false;
        sVar.a(new p() {
            public final void c(r rVar, m.a aVar) {
                if (aVar == m.a.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        sVar.a(new p() {
            public final void c(r rVar, m.a aVar) {
                if (aVar == m.a.ON_DESTROY) {
                    ComponentActivity.this.f242b.f2632b = null;
                    if (!ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.getViewModelStore().a();
                    }
                }
            }
        });
        sVar.a(new p() {
            public final void c(r rVar, m.a aVar) {
                ComponentActivity componentActivity = ComponentActivity.this;
                if (componentActivity.f245f == null) {
                    d dVar = (d) componentActivity.getLastNonConfigurationInstance();
                    if (dVar != null) {
                        componentActivity.f245f = dVar.f263a;
                    }
                    if (componentActivity.f245f == null) {
                        componentActivity.f245f = new n0();
                    }
                }
                componentActivity.f244d.b(this);
            }
        });
        bVar.a();
        m.b bVar2 = sVar.f1503d;
        if ((bVar2 == m.b.f1492g || bVar2 == m.b.f1493h) ? true : z8) {
            androidx.savedstate.a aVar = bVar.f2512b;
            if (aVar.b() == null) {
                f0 f0Var = new f0(aVar, this);
                aVar.c("androidx.lifecycle.internal.SavedStateHandlesProvider", f0Var);
                sVar.a(new SavedStateHandleAttacher(f0Var));
            }
            aVar.c("android:support:activity-result", new c0(2, this));
            f(new d(this));
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final OnBackPressedDispatcher a() {
        return this.f247h;
    }

    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        g();
        this.f248i.a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    public final f c() {
        return this.f251l;
    }

    public final void f(c.b bVar) {
        c.a aVar = this.f242b;
        aVar.getClass();
        if (aVar.f2632b != null) {
            bVar.a();
        }
        aVar.f2631a.add(bVar);
    }

    public final void g() {
        View decorView = getWindow().getDecorView();
        q7.k.e(decorView, "<this>");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        q7.k.e(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        q7.k.e(decorView3, "<this>");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        q7.k.e(decorView4, "<this>");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        q7.k.e(decorView5, "<this>");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public final v0.a getDefaultViewModelCreationExtras() {
        v0.c cVar = new v0.c();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = cVar.f7831a;
        if (application != null) {
            l0.a aVar = l0.a.f1486c;
            linkedHashMap.put(k0.f1482a, getApplication());
        }
        linkedHashMap.put(e0.f1454a, this);
        linkedHashMap.put(e0.f1455b, this);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            linkedHashMap.put(e0.f1456c, getIntent().getExtras());
        }
        return cVar;
    }

    public final l0.b getDefaultViewModelProviderFactory() {
        if (this.f246g == null) {
            this.f246g = new h0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.f246g;
    }

    public final m getLifecycle() {
        return this.f244d;
    }

    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.e.f2512b;
    }

    public final n0 getViewModelStore() {
        if (getApplication() != null) {
            if (this.f245f == null) {
                d dVar = (d) getLastNonConfigurationInstance();
                if (dVar != null) {
                    this.f245f = dVar.f263a;
                }
                if (this.f245f == null) {
                    this.f245f = new n0();
                }
            }
            return this.f245f;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Deprecated
    public void onActivityResult(int i8, int i9, Intent intent) {
        if (!this.f251l.a(i8, i9, intent)) {
            super.onActivityResult(i8, i9, intent);
        }
    }

    public void onBackPressed() {
        this.f247h.b();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<i0.a<Configuration>> it = this.f252m.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        if (r5 == false) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            b1.b r0 = r4.e
            r0.b(r5)
            c.a r0 = r4.f242b
            r0.getClass()
            r0.f2632b = r4
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.f2631a
            java.util.Iterator r0 = r0.iterator()
        L_0x0012:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0022
            java.lang.Object r1 = r0.next()
            c.b r1 = (c.b) r1
            r1.a()
            goto L_0x0012
        L_0x0022:
            super.onCreate(r5)
            androidx.lifecycle.b0.a(r4)
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            r1 = 1
            if (r5 >= r0) goto L_0x0058
            r0 = 32
            r2 = 0
            if (r5 < r0) goto L_0x0057
            java.lang.String r5 = android.os.Build.VERSION.CODENAME
            java.lang.String r0 = "REL"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x003f
            goto L_0x0053
        L_0x003f:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r5 = r5.toUpperCase(r0)
            java.lang.String r3 = "Tiramisu"
            java.lang.String r0 = r3.toUpperCase(r0)
            int r5 = r5.compareTo(r0)
            if (r5 < 0) goto L_0x0053
            r5 = r1
            goto L_0x0054
        L_0x0053:
            r5 = r2
        L_0x0054:
            if (r5 == 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r1 = r2
        L_0x0058:
            if (r1 == 0) goto L_0x006d
            androidx.activity.OnBackPressedDispatcher r5 = r4.f247h
            android.window.OnBackInvokedDispatcher r4 = androidx.activity.ComponentActivity.c.a(r4)
            r5.getClass()
            java.lang.String r0 = "invoker"
            q7.k.e(r4, r0)
            r5.e = r4
            r5.c()
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.ComponentActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onCreatePanelMenu(int i8, Menu menu) {
        if (i8 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i8, menu);
        getMenuInflater();
        Iterator<j0.j> it = this.f243c.f4947a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        return true;
    }

    public boolean onMenuItemSelected(int i8, MenuItem menuItem) {
        if (super.onMenuItemSelected(i8, menuItem)) {
            return true;
        }
        if (i8 != 0) {
            return false;
        }
        Iterator<j0.j> it = this.f243c.f4947a.iterator();
        while (it.hasNext()) {
            if (it.next().b()) {
                return true;
            }
        }
        return false;
    }

    public void onMultiWindowModeChanged(boolean z8) {
        if (!this.r) {
            Iterator<i0.a<j>> it = this.f255p.iterator();
            while (it.hasNext()) {
                it.next().accept(new j());
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void onMultiWindowModeChanged(boolean z8, Configuration configuration) {
        this.r = true;
        try {
            super.onMultiWindowModeChanged(z8, configuration);
            this.r = false;
            Iterator<i0.a<j>> it = this.f255p.iterator();
            while (it.hasNext()) {
                it.next().accept(new j(0));
            }
        } catch (Throwable th) {
            this.r = false;
            throw th;
        }
    }

    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<i0.a<Intent>> it = this.f254o.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    public void onPanelClosed(int i8, Menu menu) {
        Iterator<j0.j> it = this.f243c.f4947a.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
        super.onPanelClosed(i8, menu);
    }

    public void onPictureInPictureModeChanged(boolean z8) {
        if (!this.f257s) {
            Iterator<i0.a<j>> it = this.f256q.iterator();
            while (it.hasNext()) {
                it.next().accept(new j());
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void onPictureInPictureModeChanged(boolean z8, Configuration configuration) {
        this.f257s = true;
        try {
            super.onPictureInPictureModeChanged(z8, configuration);
            this.f257s = false;
            Iterator<i0.a<j>> it = this.f256q.iterator();
            while (it.hasNext()) {
                it.next().accept(new j(0));
            }
        } catch (Throwable th) {
            this.f257s = false;
            throw th;
        }
    }

    public boolean onPreparePanel(int i8, View view, Menu menu) {
        if (i8 != 0) {
            return true;
        }
        super.onPreparePanel(i8, view, menu);
        Iterator<j0.j> it = this.f243c.f4947a.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
        return true;
    }

    @Deprecated
    public void onRequestPermissionsResult(int i8, String[] strArr, int[] iArr) {
        if (!this.f251l.a(i8, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i8, strArr, iArr);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        n0 n0Var = this.f245f;
        if (n0Var == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            n0Var = dVar.f263a;
        }
        if (n0Var == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.f263a = n0Var;
        return dVar2;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        s sVar = this.f244d;
        if (sVar instanceof s) {
            sVar.g();
        }
        super.onSaveInstanceState(bundle);
        this.e.c(bundle);
    }

    public final void onTrimMemory(int i8) {
        super.onTrimMemory(i8);
        Iterator<i0.a<Integer>> it = this.f253n.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i8));
        }
    }

    public final void reportFullyDrawn() {
        try {
            if (d1.a.a()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            g gVar = this.f249j;
            synchronized (gVar.f294b) {
                gVar.f295c = true;
                Iterator it = gVar.f296d.iterator();
                while (it.hasNext()) {
                    ((p7.a) it.next()).invoke();
                }
                gVar.f296d.clear();
                h7.h hVar = h7.h.f4787a;
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public void setContentView(int i8) {
        g();
        this.f248i.a(getWindow().getDecorView());
        super.setContentView(i8);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        g();
        this.f248i.a(getWindow().getDecorView());
        super.setContentView(view);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        g();
        this.f248i.a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @Deprecated
    public final void startActivityForResult(Intent intent, int i8) {
        super.startActivityForResult(intent, i8);
    }

    @Deprecated
    public final void startActivityForResult(Intent intent, int i8, Bundle bundle) {
        super.startActivityForResult(intent, i8, bundle);
    }

    @Deprecated
    public final void startIntentSenderForResult(IntentSender intentSender, int i8, Intent intent, int i9, int i10, int i11) {
        super.startIntentSenderForResult(intentSender, i8, intent, i9, i10, i11);
    }

    @Deprecated
    public final void startIntentSenderForResult(IntentSender intentSender, int i8, Intent intent, int i9, int i10, int i11, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i8, intent, i9, i10, i11, bundle);
    }
}
