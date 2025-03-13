package androidx.fragment.app;

import a0.a;
import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.b0;
import androidx.health.services.client.R;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.h0;
import androidx.lifecycle.k;
import androidx.lifecycle.l0;
import androidx.lifecycle.m;
import androidx.lifecycle.n0;
import androidx.lifecycle.o0;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import androidx.lifecycle.y;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import w0.b;
import z.a;

public class n implements ComponentCallbacks, View.OnCreateContextMenuListener, r, o0, k, b1.c {
    public static final Object Y = new Object();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public ViewGroup G;
    public View H;
    public boolean I;
    public boolean J;
    public g K;
    public final Runnable L;
    public boolean M;
    public LayoutInflater N;
    public boolean O;
    public m.b P;
    public s Q;
    public q0 R;
    public final y<r> S;
    public h0 T;
    public b1.b U;
    public final int V;
    public final AtomicInteger W;
    public final ArrayList<i> X;

    /* renamed from: a  reason: collision with root package name */
    public int f1254a;

    /* renamed from: b  reason: collision with root package name */
    public Bundle f1255b;

    /* renamed from: c  reason: collision with root package name */
    public SparseArray<Parcelable> f1256c;

    /* renamed from: d  reason: collision with root package name */
    public Bundle f1257d;
    public Boolean e;

    /* renamed from: f  reason: collision with root package name */
    public String f1258f;

    /* renamed from: g  reason: collision with root package name */
    public Bundle f1259g;

    /* renamed from: h  reason: collision with root package name */
    public n f1260h;

    /* renamed from: i  reason: collision with root package name */
    public String f1261i;

    /* renamed from: j  reason: collision with root package name */
    public int f1262j;

    /* renamed from: k  reason: collision with root package name */
    public Boolean f1263k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1264l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1265m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1266n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1267o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1268p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1269q;
    public int r;

    /* renamed from: s  reason: collision with root package name */
    public b0 f1270s;

    /* renamed from: t  reason: collision with root package name */
    public y<?> f1271t;

    /* renamed from: u  reason: collision with root package name */
    public c0 f1272u;

    /* renamed from: v  reason: collision with root package name */
    public n f1273v;
    public int w;

    /* renamed from: x  reason: collision with root package name */
    public int f1274x;
    public String y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f1275z;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            n.this.startPostponedEnterTransition();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            n.this.b(false);
        }
    }

    public class c implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ s0 f1278f;

        public c(s0 s0Var) {
            this.f1278f = s0Var;
        }

        public final void run() {
            this.f1278f.c();
        }
    }

    public class d extends u {
        public d() {
        }

        public final View e(int i8) {
            n nVar = n.this;
            View view = nVar.H;
            if (view != null) {
                return view.findViewById(i8);
            }
            throw new IllegalStateException("Fragment " + nVar + " does not have a view");
        }

        public final boolean h() {
            return n.this.H != null;
        }
    }

    public class e implements n.a<Void, androidx.activity.result.f> {
        public e() {
        }

        public final Object apply() {
            n nVar = n.this;
            y<?> yVar = nVar.f1271t;
            return yVar instanceof androidx.activity.result.g ? ((androidx.activity.result.g) yVar).c() : nVar.requireActivity().f251l;
        }
    }

    public class f implements n.a<Void, androidx.activity.result.f> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.activity.result.f f1281a;

        public f(androidx.activity.result.f fVar) {
            this.f1281a = fVar;
        }

        public final Object apply() {
            return this.f1281a;
        }
    }

    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1282a;

        /* renamed from: b  reason: collision with root package name */
        public int f1283b;

        /* renamed from: c  reason: collision with root package name */
        public int f1284c;

        /* renamed from: d  reason: collision with root package name */
        public int f1285d;
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public int f1286f;

        /* renamed from: g  reason: collision with root package name */
        public ArrayList<String> f1287g;

        /* renamed from: h  reason: collision with root package name */
        public ArrayList<String> f1288h;

        /* renamed from: i  reason: collision with root package name */
        public Object f1289i = null;

        /* renamed from: j  reason: collision with root package name */
        public Object f1290j;

        /* renamed from: k  reason: collision with root package name */
        public Object f1291k;

        /* renamed from: l  reason: collision with root package name */
        public Object f1292l;

        /* renamed from: m  reason: collision with root package name */
        public Object f1293m;

        /* renamed from: n  reason: collision with root package name */
        public Object f1294n;

        /* renamed from: o  reason: collision with root package name */
        public Boolean f1295o;

        /* renamed from: p  reason: collision with root package name */
        public Boolean f1296p;

        /* renamed from: q  reason: collision with root package name */
        public float f1297q;
        public View r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f1298s;

        public g() {
            Object obj = n.Y;
            this.f1290j = obj;
            this.f1291k = null;
            this.f1292l = obj;
            this.f1293m = null;
            this.f1294n = obj;
            this.f1297q = 1.0f;
            this.r = null;
        }
    }

    public static class h extends RuntimeException {
        public h(String str, Exception exc) {
            super(str, exc);
        }
    }

    public static abstract class i {
        public abstract void a();
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class j implements Parcelable {
        public static final Parcelable.Creator<j> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        public final Bundle f1299f;

        public class a implements Parcelable.ClassLoaderCreator<j> {
            public final Object createFromParcel(Parcel parcel) {
                return new j(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i8) {
                return new j[i8];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new j(parcel, classLoader);
            }
        }

        public j(Bundle bundle) {
            this.f1299f = bundle;
        }

        public j(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f1299f = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeBundle(this.f1299f);
        }
    }

    public n() {
        this.f1254a = -1;
        this.f1258f = UUID.randomUUID().toString();
        this.f1261i = null;
        this.f1263k = null;
        this.f1272u = new c0();
        this.E = true;
        this.J = true;
        this.L = new a();
        this.P = m.b.f1495j;
        this.S = new y<>();
        this.W = new AtomicInteger();
        this.X = new ArrayList<>();
        this.Q = new s(this);
        this.U = new b1.b(this);
        this.T = null;
    }

    public n(int i8) {
        this();
        this.V = i8;
    }

    @Deprecated
    public static n instantiate(Context context, String str) {
        return instantiate(context, str, (Bundle) null);
    }

    @Deprecated
    public static n instantiate(Context context, String str, Bundle bundle) {
        try {
            n nVar = (n) x.b(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(nVar.getClass().getClassLoader());
                nVar.setArguments(bundle);
            }
            return nVar;
        } catch (InstantiationException e4) {
            throw new h("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e4);
        } catch (IllegalAccessException e9) {
            throw new h("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e9);
        } catch (NoSuchMethodException e10) {
            throw new h("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e10);
        } catch (InvocationTargetException e11) {
            throw new h("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e11);
        }
    }

    public final void b(boolean z8) {
        ViewGroup viewGroup;
        b0 b0Var;
        g gVar = this.K;
        if (gVar != null) {
            gVar.f1298s = false;
            gVar.getClass();
            gVar.getClass();
        }
        if (this.H != null && (viewGroup = this.G) != null && (b0Var = this.f1270s) != null) {
            s0 g9 = s0.g(viewGroup, b0Var.G());
            g9.h();
            if (z8) {
                this.f1271t.f1361c.post(new c(g9));
            } else {
                g9.c();
            }
        }
    }

    public u c() {
        return new d();
    }

    public final g d() {
        if (this.K == null) {
            this.K = new g();
        }
        return this.K;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.w));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f1274x));
        printWriter.print(" mTag=");
        printWriter.println(this.y);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f1254a);
        printWriter.print(" mWho=");
        printWriter.print(this.f1258f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.r);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f1264l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f1265m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f1266n);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f1267o);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f1275z);
        printWriter.print(" mDetached=");
        printWriter.print(this.A);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.E);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.D);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.B);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.J);
        if (this.f1270s != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f1270s);
        }
        if (this.f1271t != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f1271t);
        }
        if (this.f1273v != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f1273v);
        }
        if (this.f1259g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f1259g);
        }
        if (this.f1255b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f1255b);
        }
        if (this.f1256c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f1256c);
        }
        if (this.f1257d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f1257d);
        }
        n targetFragment = getTargetFragment();
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f1262j);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        g gVar = this.K;
        int i8 = 0;
        printWriter.println(gVar == null ? false : gVar.f1282a);
        g gVar2 = this.K;
        if ((gVar2 == null ? 0 : gVar2.f1283b) != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            g gVar3 = this.K;
            printWriter.println(gVar3 == null ? 0 : gVar3.f1283b);
        }
        g gVar4 = this.K;
        if ((gVar4 == null ? 0 : gVar4.f1284c) != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            g gVar5 = this.K;
            printWriter.println(gVar5 == null ? 0 : gVar5.f1284c);
        }
        g gVar6 = this.K;
        if ((gVar6 == null ? 0 : gVar6.f1285d) != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            g gVar7 = this.K;
            printWriter.println(gVar7 == null ? 0 : gVar7.f1285d);
        }
        g gVar8 = this.K;
        if ((gVar8 == null ? 0 : gVar8.e) != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            g gVar9 = this.K;
            if (gVar9 != null) {
                i8 = gVar9.e;
            }
            printWriter.println(i8);
        }
        if (this.G != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.G);
        }
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.H);
        }
        g gVar10 = this.K;
        if (gVar10 != null) {
            gVar10.getClass();
        }
        if (getContext() != null) {
            w0.a.a(this).b(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f1272u + ":");
        c0 c0Var = this.f1272u;
        c0Var.u(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final int e() {
        m.b bVar = this.P;
        return (bVar == m.b.f1492g || this.f1273v == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.f1273v.e());
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void f(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1272u.N();
        boolean z8 = true;
        this.f1269q = true;
        this.R = new q0(this, getViewModelStore());
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.H = onCreateView;
        if (onCreateView != null) {
            this.R.c();
            View view = this.H;
            q0 q0Var = this.R;
            q7.k.e(view, "<this>");
            view.setTag(R.id.view_tree_lifecycle_owner, q0Var);
            View view2 = this.H;
            q0 q0Var2 = this.R;
            q7.k.e(view2, "<this>");
            view2.setTag(R.id.view_tree_view_model_store_owner, q0Var2);
            View view3 = this.H;
            q0 q0Var3 = this.R;
            q7.k.e(view3, "<this>");
            view3.setTag(R.id.view_tree_saved_state_registry_owner, q0Var3);
            this.S.i(this.R);
            return;
        }
        if (this.R.f1315d == null) {
            z8 = false;
        }
        if (!z8) {
            this.R = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public final void g() {
        this.f1272u.t(1);
        if (this.H != null) {
            q0 q0Var = this.R;
            q0Var.c();
            if (q0Var.f1315d.f1503d.compareTo(m.b.f1493h) >= 0) {
                this.R.b(m.a.ON_DESTROY);
            }
        }
        this.f1254a = 1;
        this.F = false;
        onDestroyView();
        if (this.F) {
            p.g<b.a> gVar = w0.a.a(this).f7971b.f7972d;
            int i8 = gVar.f6239h;
            for (int i9 = 0; i9 < i8; i9++) {
                ((b.a) gVar.f6238g[i9]).getClass();
            }
            this.f1269q = false;
            return;
        }
        throw new u0("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public final s getActivity() {
        y<?> yVar = this.f1271t;
        if (yVar == null) {
            return null;
        }
        return (s) yVar.f1359a;
    }

    public final boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        g gVar = this.K;
        if (gVar == null || (bool = gVar.f1296p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        g gVar = this.K;
        if (gVar == null || (bool = gVar.f1295o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final Bundle getArguments() {
        return this.f1259g;
    }

    public final b0 getChildFragmentManager() {
        if (this.f1271t != null) {
            return this.f1272u;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context getContext() {
        y<?> yVar = this.f1271t;
        if (yVar == null) {
            return null;
        }
        return yVar.f1360b;
    }

    public final l0.b getDefaultViewModelProviderFactory() {
        Application application;
        if (this.f1270s != null) {
            if (this.T == null) {
                Context applicationContext = requireContext().getApplicationContext();
                while (true) {
                    if (!(applicationContext instanceof ContextWrapper)) {
                        application = null;
                        break;
                    } else if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    } else {
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    }
                }
                if (application == null && b0.H(3)) {
                    Objects.toString(requireContext().getApplicationContext());
                }
                this.T = new h0(application, this, getArguments());
            }
            return this.T;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final Object getEnterTransition() {
        g gVar = this.K;
        if (gVar == null) {
            return null;
        }
        return gVar.f1289i;
    }

    public final Object getExitTransition() {
        g gVar = this.K;
        if (gVar == null) {
            return null;
        }
        return gVar.f1291k;
    }

    @Deprecated
    public final b0 getFragmentManager() {
        return this.f1270s;
    }

    public final Object getHost() {
        y<?> yVar = this.f1271t;
        if (yVar == null) {
            return null;
        }
        return yVar.k();
    }

    public final int getId() {
        return this.w;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.N;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater((Bundle) null);
        this.N = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public final m getLifecycle() {
        return this.Q;
    }

    @Deprecated
    public final w0.a getLoaderManager() {
        return w0.a.a(this);
    }

    public final n getParentFragment() {
        return this.f1273v;
    }

    public final b0 getParentFragmentManager() {
        b0 b0Var = this.f1270s;
        if (b0Var != null) {
            return b0Var;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final Object getReenterTransition() {
        g gVar = this.K;
        if (gVar == null) {
            return null;
        }
        Object obj = gVar.f1292l;
        return obj == Y ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        return this.B;
    }

    public final Object getReturnTransition() {
        g gVar = this.K;
        if (gVar == null) {
            return null;
        }
        Object obj = gVar.f1290j;
        return obj == Y ? getEnterTransition() : obj;
    }

    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.U.f2512b;
    }

    public final Object getSharedElementEnterTransition() {
        g gVar = this.K;
        if (gVar == null) {
            return null;
        }
        return gVar.f1293m;
    }

    public final Object getSharedElementReturnTransition() {
        g gVar = this.K;
        if (gVar == null) {
            return null;
        }
        Object obj = gVar.f1294n;
        return obj == Y ? getSharedElementEnterTransition() : obj;
    }

    public final String getString(int i8) {
        return getResources().getString(i8);
    }

    public final String getString(int i8, Object... objArr) {
        return getResources().getString(i8, objArr);
    }

    public final String getTag() {
        return this.y;
    }

    @Deprecated
    public final n getTargetFragment() {
        String str;
        n nVar = this.f1260h;
        if (nVar != null) {
            return nVar;
        }
        b0 b0Var = this.f1270s;
        if (b0Var == null || (str = this.f1261i) == null) {
            return null;
        }
        return b0Var.B(str);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        return this.f1262j;
    }

    public final CharSequence getText(int i8) {
        return getResources().getText(i8);
    }

    @Deprecated
    public final boolean getUserVisibleHint() {
        return this.J;
    }

    public final View getView() {
        return this.H;
    }

    public final r getViewLifecycleOwner() {
        q0 q0Var = this.R;
        if (q0Var != null) {
            return q0Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public final LiveData<r> getViewLifecycleOwnerLiveData() {
        return this.S;
    }

    public final n0 getViewModelStore() {
        if (this.f1270s == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (e() != 1) {
            HashMap<String, n0> hashMap = this.f1270s.G.f1154f;
            n0 n0Var = hashMap.get(this.f1258f);
            if (n0Var != null) {
                return n0Var;
            }
            n0 n0Var2 = new n0();
            hashMap.put(this.f1258f, n0Var2);
            return n0Var2;
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    public final void h() {
        onLowMemory();
        this.f1272u.m();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.D;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final void i(boolean z8) {
        onMultiWindowModeChanged(z8);
        this.f1272u.n(z8);
    }

    public final boolean isAdded() {
        return this.f1271t != null && this.f1264l;
    }

    public final boolean isDetached() {
        return this.A;
    }

    public final boolean isHidden() {
        return this.f1275z;
    }

    public final boolean isInLayout() {
        return this.f1267o;
    }

    public final boolean isMenuVisible() {
        return this.E && (this.f1270s == null || b0.J(this.f1273v));
    }

    public final boolean isRemoving() {
        return this.f1265m;
    }

    public final boolean isResumed() {
        return this.f1254a >= 7;
    }

    public final boolean isStateSaved() {
        b0 b0Var = this.f1270s;
        if (b0Var == null) {
            return false;
        }
        return b0Var.L();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r1.H;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isVisible() {
        /*
            r1 = this;
            boolean r0 = r1.isAdded()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r1.isHidden()
            if (r0 != 0) goto L_0x0020
            android.view.View r0 = r1.H
            if (r0 == 0) goto L_0x0020
            android.os.IBinder r0 = r0.getWindowToken()
            if (r0 == 0) goto L_0x0020
            android.view.View r1 = r1.H
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0020
            r1 = 1
            goto L_0x0021
        L_0x0020:
            r1 = 0
        L_0x0021:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.isVisible():boolean");
    }

    public final void j(boolean z8) {
        onPictureInPictureModeChanged(z8);
        this.f1272u.r(z8);
    }

    public final boolean k(Menu menu) {
        boolean z8 = false;
        if (this.f1275z) {
            return false;
        }
        if (this.D && this.E) {
            onPrepareOptionsMenu(menu);
            z8 = true;
        }
        return z8 | this.f1272u.s(menu);
    }

    public final p l(d.a aVar, n.a aVar2, androidx.activity.result.b bVar) {
        if (this.f1254a <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            o oVar = new o(this, aVar2, atomicReference, aVar, bVar);
            if (this.f1254a >= 0) {
                oVar.a();
            } else {
                this.X.add(oVar);
            }
            return new p(atomicReference);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    public final void m(int i8, int i9, int i10, int i11) {
        if (this.K != null || i8 != 0 || i9 != 0 || i10 != 0 || i11 != 0) {
            d().f1283b = i8;
            d().f1284c = i9;
            d().f1285d = i10;
            d().e = i11;
        }
    }

    @Deprecated
    public final void onActivityCreated(Bundle bundle) {
        this.F = true;
    }

    @Deprecated
    public final void onActivityResult(int i8, int i9, Intent intent) {
        if (b0.H(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    @Deprecated
    public final void onAttach(Activity activity) {
        this.F = true;
    }

    public void onAttach(Context context) {
        this.F = true;
        y<?> yVar = this.f1271t;
        Activity activity = yVar == null ? null : yVar.f1359a;
        if (activity != null) {
            this.F = false;
            onAttach(activity);
        }
    }

    @Deprecated
    public final void onAttachFragment(n nVar) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
        this.F = true;
    }

    public final boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        Parcelable parcelable;
        this.F = true;
        if (!(bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null)) {
            this.f1272u.S(parcelable);
            c0 c0Var = this.f1272u;
            c0Var.f1122z = false;
            c0Var.A = false;
            c0Var.G.f1157i = false;
            c0Var.t(1);
        }
        c0 c0Var2 = this.f1272u;
        if (!(c0Var2.f1113n >= 1)) {
            c0Var2.f1122z = false;
            c0Var2.A = false;
            c0Var2.G.f1157i = false;
            c0Var2.t(1);
        }
    }

    public final Animation onCreateAnimation(int i8, boolean z8, int i9) {
        return null;
    }

    public final Animator onCreateAnimator(int i8, boolean z8, int i9) {
        return null;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i8 = this.V;
        if (i8 != 0) {
            return layoutInflater.inflate(i8, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.F = true;
    }

    public final void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.F = true;
    }

    public void onDetach() {
        this.F = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public final void onHiddenChanged(boolean z8) {
    }

    @Deprecated
    public final void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.F = true;
    }

    public final void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.F = true;
        y<?> yVar = this.f1271t;
        Activity activity = yVar == null ? null : yVar.f1359a;
        if (activity != null) {
            this.F = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    public final void onLowMemory() {
        this.F = true;
    }

    public final void onMultiWindowModeChanged(boolean z8) {
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public final void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.F = true;
    }

    public final void onPictureInPictureModeChanged(boolean z8) {
    }

    public final void onPrepareOptionsMenu(Menu menu) {
    }

    public final void onPrimaryNavigationFragmentChanged(boolean z8) {
    }

    @Deprecated
    public final void onRequestPermissionsResult(int i8, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.F = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.F = true;
    }

    public void onStop() {
        this.F = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.F = true;
    }

    public final void postponeEnterTransition() {
        d().f1298s = true;
    }

    public final void postponeEnterTransition(long j8, TimeUnit timeUnit) {
        d().f1298s = true;
        b0 b0Var = this.f1270s;
        Handler handler = b0Var != null ? b0Var.f1114o.f1361c : new Handler(Looper.getMainLooper());
        Runnable runnable = this.L;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, timeUnit.toMillis(j8));
    }

    public final <I, O> androidx.activity.result.c<I> registerForActivityResult(d.a<I, O> aVar, androidx.activity.result.b<O> bVar) {
        return l(aVar, new e(), bVar);
    }

    public final <I, O> androidx.activity.result.c<I> registerForActivityResult(d.a<I, O> aVar, androidx.activity.result.f fVar, androidx.activity.result.b<O> bVar) {
        return l(aVar, new f(fVar), bVar);
    }

    public final void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i8) {
        if (this.f1271t != null) {
            b0 parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.w != null) {
                parentFragmentManager.f1121x.addLast(new b0.l(i8, this.f1258f));
                parentFragmentManager.w.a(strArr);
                return;
            }
            parentFragmentManager.f1114o.getClass();
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final s requireActivity() {
        s activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Deprecated
    public final b0 requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public final n requireParentFragment() {
        n parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void setAllowEnterTransitionOverlap(boolean z8) {
        d().f1296p = Boolean.valueOf(z8);
    }

    public final void setAllowReturnTransitionOverlap(boolean z8) {
        d().f1295o = Boolean.valueOf(z8);
    }

    public final void setArguments(Bundle bundle) {
        if (this.f1270s == null || !isStateSaved()) {
            this.f1259g = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public final void setEnterSharedElementCallback(z.i iVar) {
        d().getClass();
    }

    public final void setEnterTransition(Object obj) {
        d().f1289i = obj;
    }

    public final void setExitSharedElementCallback(z.i iVar) {
        d().getClass();
    }

    public final void setExitTransition(Object obj) {
        d().f1291k = obj;
    }

    public final void setHasOptionsMenu(boolean z8) {
        if (this.D != z8) {
            this.D = z8;
            if (isAdded() && !isHidden()) {
                this.f1271t.n();
            }
        }
    }

    public final void setInitialSavedState(j jVar) {
        Bundle bundle;
        if (this.f1270s == null) {
            if (jVar == null || (bundle = jVar.f1299f) == null) {
                bundle = null;
            }
            this.f1255b = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public final void setMenuVisibility(boolean z8) {
        if (this.E != z8) {
            this.E = z8;
            if (this.D && isAdded() && !isHidden()) {
                this.f1271t.n();
            }
        }
    }

    public final void setReenterTransition(Object obj) {
        d().f1292l = obj;
    }

    @Deprecated
    public final void setRetainInstance(boolean z8) {
        this.B = z8;
        b0 b0Var = this.f1270s;
        if (b0Var == null) {
            this.C = true;
        } else if (z8) {
            b0Var.G.c(this);
        } else {
            b0Var.G.d(this);
        }
    }

    public final void setReturnTransition(Object obj) {
        d().f1290j = obj;
    }

    public final void setSharedElementEnterTransition(Object obj) {
        d().f1293m = obj;
    }

    public final void setSharedElementReturnTransition(Object obj) {
        d().f1294n = obj;
    }

    @Deprecated
    public final void setTargetFragment(n nVar, int i8) {
        b0 b0Var = this.f1270s;
        b0 b0Var2 = nVar != null ? nVar.f1270s : null;
        if (b0Var == null || b0Var2 == null || b0Var == b0Var2) {
            n nVar2 = nVar;
            while (nVar2 != null) {
                if (!nVar2.equals(this)) {
                    nVar2 = nVar2.getTargetFragment();
                } else {
                    throw new IllegalArgumentException("Setting " + nVar + " as the target of " + this + " would create a target cycle");
                }
            }
            if (nVar == null) {
                this.f1261i = null;
            } else if (this.f1270s == null || nVar.f1270s == null) {
                this.f1261i = null;
                this.f1260h = nVar;
                this.f1262j = i8;
                return;
            } else {
                this.f1261i = nVar.f1258f;
            }
            this.f1260h = null;
            this.f1262j = i8;
            return;
        }
        throw new IllegalArgumentException("Fragment " + nVar + " must share the same FragmentManager to be set as a target fragment");
    }

    @Deprecated
    public final void setUserVisibleHint(boolean z8) {
        boolean z9 = true;
        if (!this.J && z8 && this.f1254a < 5 && this.f1270s != null && isAdded() && this.O) {
            b0 b0Var = this.f1270s;
            h0 g9 = b0Var.g(this);
            n nVar = g9.f1182c;
            if (nVar.I) {
                if (b0Var.f1102b) {
                    b0Var.C = true;
                } else {
                    nVar.I = false;
                    g9.k();
                }
            }
        }
        this.J = z8;
        if (this.f1254a >= 5 || z8) {
            z9 = false;
        }
        this.I = z9;
        if (this.f1255b != null) {
            this.e = Boolean.valueOf(z8);
        }
    }

    public final boolean shouldShowRequestPermissionRationale(String str) {
        y<?> yVar = this.f1271t;
        if (yVar != null) {
            return yVar.m(str);
        }
        return false;
    }

    public final void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, (Bundle) null);
    }

    public final void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        y<?> yVar = this.f1271t;
        if (yVar != null) {
            Object obj = a0.a.f10a;
            a.C0002a.b(yVar.f1360b, intent, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public final void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i8) {
        startActivityForResult(intent, i8, (Bundle) null);
    }

    @Deprecated
    public final void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i8, Bundle bundle) {
        if (this.f1271t != null) {
            b0 parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.f1119u != null) {
                parentFragmentManager.f1121x.addLast(new b0.l(i8, this.f1258f));
                if (!(intent == null || bundle == null)) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                parentFragmentManager.f1119u.a(intent);
                return;
            }
            y<?> yVar = parentFragmentManager.f1114o;
            yVar.getClass();
            if (i8 == -1) {
                Object obj = a0.a.f10a;
                a.C0002a.b(yVar.f1360b, intent, bundle);
                return;
            }
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public final void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i8, Intent intent, int i9, int i10, int i11, Bundle bundle) {
        Intent intent2;
        IntentSender intentSender2 = intentSender;
        int i12 = i8;
        Bundle bundle2 = bundle;
        if (this.f1271t != null) {
            if (b0.H(2)) {
                toString();
                Objects.toString(intentSender);
                Objects.toString(intent);
                Objects.toString(bundle);
            }
            b0 parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.f1120v != null) {
                if (bundle2 != null) {
                    if (intent == null) {
                        intent2 = new Intent();
                        intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                    } else {
                        intent2 = intent;
                    }
                    if (b0.H(2)) {
                        bundle.toString();
                        intent2.toString();
                        Objects.toString(this);
                    }
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle2);
                } else {
                    intent2 = intent;
                }
                q7.k.e(intentSender, "intentSender");
                int i13 = i9;
                int i14 = i10;
                androidx.activity.result.h hVar = new androidx.activity.result.h(intentSender, intent2, i9, i10);
                parentFragmentManager.f1121x.addLast(new b0.l(i8, this.f1258f));
                if (b0.H(2)) {
                    toString();
                }
                parentFragmentManager.f1120v.a(hVar);
                return;
            }
            int i15 = i9;
            int i16 = i10;
            y<?> yVar = parentFragmentManager.f1114o;
            if (i12 == -1) {
                Activity activity = yVar.f1359a;
                int i17 = z.a.f8629b;
                a.C0158a.c(activity, intentSender, i8, intent, i9, i10, i11, bundle);
                return;
            }
            yVar.getClass();
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final void startPostponedEnterTransition() {
        if (this.K != null && d().f1298s) {
            if (this.f1271t == null) {
                d().f1298s = false;
            } else if (Looper.myLooper() != this.f1271t.f1361c.getLooper()) {
                this.f1271t.f1361c.postAtFrontOfQueue(new b());
            } else {
                b(true);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f1258f);
        if (this.w != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.w));
        }
        if (this.y != null) {
            sb.append(" tag=");
            sb.append(this.y);
        }
        sb.append(")");
        return sb.toString();
    }

    public final void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener((View.OnCreateContextMenuListener) null);
    }

    @Deprecated
    public final LayoutInflater getLayoutInflater(Bundle bundle) {
        y<?> yVar = this.f1271t;
        if (yVar != null) {
            LayoutInflater l8 = yVar.l();
            l8.setFactory2(this.f1272u.f1105f);
            return l8;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }
}
