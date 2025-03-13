package d3;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.fragment.app.c0;
import androidx.fragment.app.s;
import com.bumptech.glide.k;
import d3.i;
import java.io.File;
import java.util.HashMap;
import y2.l;
import y7.b0;

public final class j implements Handler.Callback {

    /* renamed from: g  reason: collision with root package name */
    public static final a f4018g = new a();

    /* renamed from: a  reason: collision with root package name */
    public volatile k f4019a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f4020b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f4021c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Handler f4022d;
    public final b e;

    /* renamed from: f  reason: collision with root package name */
    public final b0 f4023f;

    public class a implements b {
    }

    public interface b {
    }

    public j(b bVar) {
        new p.a();
        new p.a();
        new Bundle();
        this.e = bVar == null ? f4018g : bVar;
        this.f4022d = new Handler(Looper.getMainLooper(), this);
        File file = l.e;
        this.f4023f = new b0(10);
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final k b(Context context) {
        if (context != null) {
            char[] cArr = k3.k.f5169a;
            boolean z8 = true;
            if ((Looper.myLooper() == Looper.getMainLooper()) && !(context instanceof Application)) {
                if (context instanceof s) {
                    return c((s) context);
                }
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (!(Looper.myLooper() == Looper.getMainLooper())) {
                        return b(activity.getApplicationContext());
                    }
                    if (activity instanceof s) {
                        return c((s) activity);
                    }
                    if (!activity.isDestroyed()) {
                        this.f4023f.getClass();
                        FragmentManager fragmentManager = activity.getFragmentManager();
                        Activity a9 = a(activity);
                        if (a9 != null && a9.isFinishing()) {
                            z8 = false;
                        }
                        i d9 = d(fragmentManager);
                        k kVar = d9.f4015d;
                        if (kVar != null) {
                            return kVar;
                        }
                        com.bumptech.glide.b b9 = com.bumptech.glide.b.b(activity);
                        i.a aVar = d9.f4013b;
                        ((a) this.e).getClass();
                        k kVar2 = new k(b9, d9.f4012a, aVar, activity);
                        if (z8) {
                            kVar2.j();
                        }
                        d9.f4015d = kVar2;
                        return kVar2;
                    }
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                } else if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return b(contextWrapper.getBaseContext());
                    }
                }
            }
            if (this.f4019a == null) {
                synchronized (this) {
                    if (this.f4019a == null) {
                        com.bumptech.glide.b b10 = com.bumptech.glide.b.b(context.getApplicationContext());
                        b bVar = this.e;
                        b0 b0Var = new b0(9);
                        b0 b0Var2 = new b0(11);
                        Context applicationContext = context.getApplicationContext();
                        ((a) bVar).getClass();
                        this.f4019a = new k(b10, b0Var, b0Var2, applicationContext);
                    }
                }
            }
            return this.f4019a;
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public final k c(s sVar) {
        char[] cArr = k3.k.f5169a;
        boolean z8 = false;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return b(sVar.getApplicationContext());
        }
        if (!sVar.isDestroyed()) {
            this.f4023f.getClass();
            c0 h8 = sVar.h();
            Activity a9 = a(sVar);
            if (a9 == null || !a9.isFinishing()) {
                z8 = true;
            }
            m e4 = e(h8);
            k kVar = e4.f4031d0;
            if (kVar != null) {
                return kVar;
            }
            com.bumptech.glide.b b9 = com.bumptech.glide.b.b(sVar);
            ((a) this.e).getClass();
            k kVar2 = new k(b9, e4.Z, e4.f4028a0, sVar);
            if (z8) {
                kVar2.j();
            }
            e4.f4031d0 = kVar2;
            return kVar2;
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    public final i d(FragmentManager fragmentManager) {
        i iVar = (i) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (iVar != null) {
            return iVar;
        }
        HashMap hashMap = this.f4020b;
        i iVar2 = (i) hashMap.get(fragmentManager);
        if (iVar2 == null) {
            iVar2 = new i();
            iVar2.f4016f = null;
            hashMap.put(fragmentManager, iVar2);
            fragmentManager.beginTransaction().add(iVar2, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f4022d.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return iVar2;
    }

    public final m e(androidx.fragment.app.b0 b0Var) {
        m mVar = (m) b0Var.D("com.bumptech.glide.manager");
        if (mVar != null) {
            return mVar;
        }
        HashMap hashMap = this.f4021c;
        m mVar2 = (m) hashMap.get(b0Var);
        if (mVar2 == null) {
            mVar2 = new m();
            mVar2.f4032e0 = null;
            hashMap.put(b0Var, mVar2);
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(b0Var);
            aVar.f(0, mVar2, "com.bumptech.glide.manager", 1);
            aVar.d(true);
            this.f4022d.obtainMessage(2, b0Var).sendToTarget();
        }
        return mVar2;
    }

    public final boolean handleMessage(Message message) {
        Object obj;
        Object obj2;
        HashMap hashMap;
        int i8 = message.what;
        boolean z8 = true;
        if (i8 == 1) {
            obj = (FragmentManager) message.obj;
            hashMap = this.f4020b;
        } else if (i8 != 2) {
            obj2 = null;
            z8 = false;
            obj = null;
            if (z8 && obj2 == null && Log.isLoggable("RMRetriever", 5)) {
                Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
            }
            return z8;
        } else {
            obj = (androidx.fragment.app.b0) message.obj;
            hashMap = this.f4021c;
        }
        obj2 = hashMap.remove(obj);
        Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
        return z8;
    }
}
