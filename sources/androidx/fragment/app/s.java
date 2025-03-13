package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.j;
import androidx.activity.result.f;
import androidx.activity.result.g;
import androidx.lifecycle.m;
import androidx.lifecycle.n0;
import androidx.lifecycle.o0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import z.a;

public class s extends ComponentActivity implements a.c {

    /* renamed from: u  reason: collision with root package name */
    public final w f1318u = new w(new a());

    /* renamed from: v  reason: collision with root package name */
    public final androidx.lifecycle.s f1319v = new androidx.lifecycle.s(this);
    public boolean w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f1320x;
    public boolean y = true;

    public class a extends y<s> implements o0, j, g, f0 {
        public a() {
            super(s.this);
        }

        public final OnBackPressedDispatcher a() {
            return s.this.f247h;
        }

        public final void b(n nVar) {
            s.this.getClass();
        }

        public final f c() {
            return s.this.f251l;
        }

        public final View e(int i8) {
            return s.this.findViewById(i8);
        }

        public final m getLifecycle() {
            return s.this.f1319v;
        }

        public final n0 getViewModelStore() {
            return s.this.getViewModelStore();
        }

        public final boolean h() {
            Window window = s.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        public final void j(PrintWriter printWriter, String[] strArr) {
            s.this.dump("  ", (FileDescriptor) null, printWriter, strArr);
        }

        public final Object k() {
            return s.this;
        }

        public final LayoutInflater l() {
            s sVar = s.this;
            return sVar.getLayoutInflater().cloneInContext(sVar);
        }

        public final boolean m(String str) {
            int i8 = z.a.f8629b;
            return a.b.c(s.this, str);
        }

        public final void n() {
            s.this.j();
        }
    }

    public s() {
        this.e.f2512b.c("android:support:fragments", new q(this));
        f(new r(this));
    }

    public static boolean i(b0 b0Var) {
        boolean z8 = false;
        for (n nVar : b0Var.f1103c.i()) {
            if (nVar != null) {
                if (nVar.getHost() != null) {
                    z8 |= i(nVar.getChildFragmentManager());
                }
                q0 q0Var = nVar.R;
                m.b bVar = m.b.f1494i;
                if (q0Var != null) {
                    q0Var.c();
                    if (q0Var.f1315d.f1503d.compareTo(bVar) >= 0) {
                        nVar.R.f1315d.g();
                        z8 = true;
                    }
                }
                if (nVar.Q.f1503d.compareTo(bVar) >= 0) {
                    nVar.Q.g();
                    z8 = true;
                }
            }
        }
        return z8;
    }

    @Deprecated
    public final void b() {
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.w);
        printWriter.print(" mResumed=");
        printWriter.print(this.f1320x);
        printWriter.print(" mStopped=");
        printWriter.print(this.y);
        if (getApplication() != null) {
            w0.a.a(this).b(str2, printWriter);
        }
        this.f1318u.f1357a.f1362d.u(str, fileDescriptor, printWriter, strArr);
    }

    public final c0 h() {
        return this.f1318u.f1357a.f1362d;
    }

    @Deprecated
    public void j() {
        invalidateOptionsMenu();
    }

    public final void onActivityResult(int i8, int i9, Intent intent) {
        this.f1318u.a();
        super.onActivityResult(i8, i9, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        w wVar = this.f1318u;
        wVar.a();
        wVar.f1357a.f1362d.i(configuration);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1319v.e(m.a.ON_CREATE);
        c0 c0Var = this.f1318u.f1357a.f1362d;
        c0Var.f1122z = false;
        c0Var.A = false;
        c0Var.G.f1157i = false;
        c0Var.t(1);
    }

    public final boolean onCreatePanelMenu(int i8, Menu menu) {
        super.onCreatePanelMenu(i8, menu);
        if (i8 != 0) {
            return true;
        }
        return this.f1318u.f1357a.f1362d.k(menu, getMenuInflater()) | true;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.f1318u.f1357a.f1362d.f1105f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f1318u.f1357a.f1362d.l();
        this.f1319v.e(m.a.ON_DESTROY);
    }

    public final void onLowMemory() {
        super.onLowMemory();
        this.f1318u.f1357a.f1362d.m();
    }

    public boolean onMenuItemSelected(int i8, MenuItem menuItem) {
        if (super.onMenuItemSelected(i8, menuItem)) {
            return true;
        }
        w wVar = this.f1318u;
        if (i8 == 0) {
            return wVar.f1357a.f1362d.o(menuItem);
        }
        if (i8 != 6) {
            return false;
        }
        return wVar.f1357a.f1362d.j(menuItem);
    }

    public final void onMultiWindowModeChanged(boolean z8) {
        this.f1318u.f1357a.f1362d.n(z8);
    }

    public final void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.f1318u.a();
    }

    public void onPanelClosed(int i8, Menu menu) {
        if (i8 == 0) {
            this.f1318u.f1357a.f1362d.p(menu);
        }
        super.onPanelClosed(i8, menu);
    }

    public final void onPause() {
        super.onPause();
        this.f1320x = false;
        this.f1318u.f1357a.f1362d.t(5);
        this.f1319v.e(m.a.ON_PAUSE);
    }

    public final void onPictureInPictureModeChanged(boolean z8) {
        this.f1318u.f1357a.f1362d.r(z8);
    }

    public void onPostResume() {
        super.onPostResume();
        this.f1319v.e(m.a.ON_RESUME);
        c0 c0Var = this.f1318u.f1357a.f1362d;
        c0Var.f1122z = false;
        c0Var.A = false;
        c0Var.G.f1157i = false;
        c0Var.t(7);
    }

    public final boolean onPreparePanel(int i8, View view, Menu menu) {
        if (i8 == 0) {
            super.onPreparePanel(0, view, menu);
            return this.f1318u.f1357a.f1362d.s(menu) | true;
        }
        super.onPreparePanel(i8, view, menu);
        return true;
    }

    public final void onRequestPermissionsResult(int i8, String[] strArr, int[] iArr) {
        this.f1318u.a();
        super.onRequestPermissionsResult(i8, strArr, iArr);
    }

    public final void onResume() {
        super.onResume();
        this.f1320x = true;
        w wVar = this.f1318u;
        wVar.a();
        wVar.f1357a.f1362d.x(true);
    }

    public void onStart() {
        super.onStart();
        this.y = false;
        boolean z8 = this.w;
        w wVar = this.f1318u;
        if (!z8) {
            this.w = true;
            c0 c0Var = wVar.f1357a.f1362d;
            c0Var.f1122z = false;
            c0Var.A = false;
            c0Var.G.f1157i = false;
            c0Var.t(4);
        }
        wVar.a();
        y<?> yVar = wVar.f1357a;
        yVar.f1362d.x(true);
        this.f1319v.e(m.a.ON_START);
        c0 c0Var2 = yVar.f1362d;
        c0Var2.f1122z = false;
        c0Var2.A = false;
        c0Var2.G.f1157i = false;
        c0Var2.t(5);
    }

    public final void onStateNotSaved() {
        this.f1318u.a();
    }

    public void onStop() {
        super.onStop();
        this.y = true;
        do {
        } while (i(h()));
        c0 c0Var = this.f1318u.f1357a.f1362d;
        c0Var.A = true;
        c0Var.G.f1157i = true;
        c0Var.t(4);
        this.f1319v.e(m.a.ON_STOP);
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.f1318u.f1357a.f1362d.f1105f.onCreateView((View) null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}
