package r3;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import o3.e;
import q3.r;
import q3.s;

public abstract class c<T extends IInterface> {
    public static final o3.c[] w = new o3.c[0];

    /* renamed from: a  reason: collision with root package name */
    public volatile String f6933a = null;

    /* renamed from: b  reason: collision with root package name */
    public x0 f6934b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f6935c;

    /* renamed from: d  reason: collision with root package name */
    public final h f6936d;
    public final Handler e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f6937f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public final Object f6938g = new Object();

    /* renamed from: h  reason: collision with root package name */
    public j f6939h;
    @RecentlyNonNull

    /* renamed from: i  reason: collision with root package name */
    public C0119c f6940i;

    /* renamed from: j  reason: collision with root package name */
    public T f6941j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList<j0<?>> f6942k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public l0 f6943l;

    /* renamed from: m  reason: collision with root package name */
    public int f6944m = 1;

    /* renamed from: n  reason: collision with root package name */
    public final a f6945n;

    /* renamed from: o  reason: collision with root package name */
    public final b f6946o;

    /* renamed from: p  reason: collision with root package name */
    public final int f6947p;

    /* renamed from: q  reason: collision with root package name */
    public final String f6948q;
    public volatile String r;

    /* renamed from: s  reason: collision with root package name */
    public o3.a f6949s = null;

    /* renamed from: t  reason: collision with root package name */
    public boolean f6950t = false;

    /* renamed from: u  reason: collision with root package name */
    public volatile o0 f6951u = null;
    @RecentlyNonNull

    /* renamed from: v  reason: collision with root package name */
    public final AtomicInteger f6952v = new AtomicInteger(0);

    public interface a {
    }

    public interface b {
    }

    /* renamed from: r3.c$c  reason: collision with other inner class name */
    public interface C0119c {
        void a(@RecentlyNonNull o3.a aVar);
    }

    public class d implements C0119c {
        public d() {
        }

        public final void a(@RecentlyNonNull o3.a aVar) {
            boolean z8 = aVar.f6080g == 0;
            c cVar = c.this;
            if (z8) {
                cVar.d((i) null, cVar.u());
                return;
            }
            b bVar = cVar.f6946o;
            if (bVar != null) {
                ((w) bVar).f7050a.c(aVar);
            }
        }
    }

    public c(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull v0 v0Var, int i8, v vVar, w wVar, String str) {
        Object obj = o3.d.f6089b;
        if (context != null) {
            this.f6935c = context;
            if (looper == null) {
                throw new NullPointerException("Looper must not be null");
            } else if (v0Var != null) {
                this.f6936d = v0Var;
                this.e = new i0(this, looper);
                this.f6947p = i8;
                this.f6945n = vVar;
                this.f6946o = wVar;
                this.f6948q = str;
            } else {
                throw new NullPointerException("Supervisor must not be null");
            }
        } else {
            throw new NullPointerException("Context must not be null");
        }
    }

    public static /* synthetic */ boolean y(c cVar, int i8, int i9, IInterface iInterface) {
        synchronized (cVar.f6937f) {
            if (cVar.f6944m != i8) {
                return false;
            }
            cVar.z(i9, iInterface);
            return true;
        }
    }

    public final boolean a() {
        boolean z8;
        synchronized (this.f6937f) {
            z8 = this.f6944m == 4;
        }
        return z8;
    }

    public final void c(@RecentlyNonNull C0119c cVar) {
        this.f6940i = cVar;
        z(2, (IInterface) null);
    }

    public final void d(i iVar, @RecentlyNonNull Set<Scope> set) {
        Bundle t8 = t();
        f fVar = new f(this.f6947p, this.r);
        fVar.f6975i = this.f6935c.getPackageName();
        fVar.f6978l = t8;
        if (set != null) {
            fVar.f6977k = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (o()) {
            Account r8 = r();
            if (r8 == null) {
                r8 = new Account("<<default account>>", "com.google");
            }
            fVar.f6979m = r8;
            if (iVar != null) {
                fVar.f6976j = iVar.asBinder();
            }
        }
        fVar.f6980n = w;
        fVar.f6981o = s();
        try {
            synchronized (this.f6938g) {
                j jVar = this.f6939h;
                if (jVar != null) {
                    jVar.b(new k0(this, this.f6952v.get()), fVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e4) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e4);
            Handler handler = this.e;
            handler.sendMessage(handler.obtainMessage(6, this.f6952v.get(), 3));
        } catch (SecurityException e9) {
            throw e9;
        } catch (RemoteException | RuntimeException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            int i8 = this.f6952v.get();
            Handler handler2 = this.e;
            handler2.sendMessage(handler2.obtainMessage(1, i8, -1, new m0(this, 8, (IBinder) null, (Bundle) null)));
        }
    }

    public final void e(@RecentlyNonNull String str) {
        this.f6933a = str;
        n();
    }

    public final boolean f() {
        return true;
    }

    public int h() {
        return e.f6091a;
    }

    public final boolean i() {
        boolean z8;
        synchronized (this.f6937f) {
            int i8 = this.f6944m;
            z8 = true;
            if (i8 != 2) {
                if (i8 != 3) {
                    z8 = false;
                }
            }
        }
        return z8;
    }

    @RecentlyNullable
    public final o3.c[] j() {
        o0 o0Var = this.f6951u;
        if (o0Var == null) {
            return null;
        }
        return o0Var.f7023g;
    }

    public final void k(@RecentlyNonNull s sVar) {
        sVar.f6579a.f6590l.f6549l.post(new r(sVar));
    }

    @RecentlyNonNull
    public final String l() {
        if (a() && this.f6934b != null) {
            return "com.google.android.gms";
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    @RecentlyNullable
    public final String m() {
        return this.f6933a;
    }

    public final void n() {
        this.f6952v.incrementAndGet();
        synchronized (this.f6942k) {
            try {
                int size = this.f6942k.size();
                for (int i8 = 0; i8 < size; i8++) {
                    j0 j0Var = this.f6942k.get(i8);
                    synchronized (j0Var) {
                        j0Var.f6994a = null;
                    }
                }
                this.f6942k.clear();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        synchronized (this.f6938g) {
            this.f6939h = null;
        }
        z(1, (IInterface) null);
    }

    public boolean o() {
        return false;
    }

    @RecentlyNullable
    public abstract T q(@RecentlyNonNull IBinder iBinder);

    @RecentlyNullable
    public Account r() {
        return null;
    }

    @RecentlyNonNull
    public o3.c[] s() {
        return w;
    }

    @RecentlyNonNull
    public Bundle t() {
        return new Bundle();
    }

    @RecentlyNonNull
    public Set<Scope> u() {
        return Collections.emptySet();
    }

    @RecentlyNonNull
    public final T v() {
        T t8;
        synchronized (this.f6937f) {
            try {
                if (this.f6944m == 5) {
                    throw new DeadObjectException();
                } else if (a()) {
                    t8 = this.f6941j;
                    b.c(t8, "Client is connected but service is null");
                } else {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t8;
    }

    public abstract String w();

    public abstract String x();

    public final void z(int i8, T t8) {
        x0 x0Var;
        boolean z8 = false;
        if ((i8 == 4) == (t8 != null)) {
            z8 = true;
        }
        if (z8) {
            synchronized (this.f6937f) {
                try {
                    this.f6944m = i8;
                    this.f6941j = t8;
                    if (i8 == 1) {
                        l0 l0Var = this.f6943l;
                        if (l0Var != null) {
                            h hVar = this.f6936d;
                            String str = this.f6934b.f7054a;
                            b.b(str);
                            this.f6934b.getClass();
                            if (this.f6948q == null) {
                                this.f6935c.getClass();
                            }
                            hVar.a(str, "com.google.android.gms", 4225, l0Var, this.f6934b.f7055b);
                            this.f6943l = null;
                        }
                    } else if (i8 == 2 || i8 == 3) {
                        l0 l0Var2 = this.f6943l;
                        if (!(l0Var2 == null || (x0Var = this.f6934b) == null)) {
                            String str2 = x0Var.f7054a;
                            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                            sb.append("Calling connect() while still connected, missing disconnect() for ");
                            sb.append(str2);
                            sb.append(" on com.google.android.gms");
                            Log.e("GmsClient", sb.toString());
                            h hVar2 = this.f6936d;
                            String str3 = this.f6934b.f7054a;
                            b.b(str3);
                            this.f6934b.getClass();
                            if (this.f6948q == null) {
                                this.f6935c.getClass();
                            }
                            hVar2.a(str3, "com.google.android.gms", 4225, l0Var2, this.f6934b.f7055b);
                            this.f6952v.incrementAndGet();
                        }
                        l0 l0Var3 = new l0(this, this.f6952v.get());
                        this.f6943l = l0Var3;
                        String x8 = x();
                        Object obj = h.f6990a;
                        boolean z9 = this instanceof t3.d;
                        this.f6934b = new x0(x8, z9);
                        if (!z9 || h() >= 17895000) {
                            h hVar3 = this.f6936d;
                            String str4 = this.f6934b.f7054a;
                            b.b(str4);
                            this.f6934b.getClass();
                            String str5 = this.f6948q;
                            if (str5 == null) {
                                str5 = this.f6935c.getClass().getName();
                            }
                            if (!hVar3.b(new s0(str4, "com.google.android.gms", 4225, this.f6934b.f7055b), l0Var3, str5)) {
                                String str6 = this.f6934b.f7054a;
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str6).length() + 34 + "com.google.android.gms".length());
                                sb2.append("unable to connect to service: ");
                                sb2.append(str6);
                                sb2.append(" on com.google.android.gms");
                                Log.e("GmsClient", sb2.toString());
                                int i9 = this.f6952v.get();
                                Handler handler = this.e;
                                handler.sendMessage(handler.obtainMessage(7, i9, -1, new n0(this, 16)));
                            }
                        } else {
                            String valueOf = String.valueOf(this.f6934b.f7054a);
                            throw new IllegalStateException(valueOf.length() != 0 ? "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(valueOf) : new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "));
                        }
                    } else if (i8 == 4) {
                        b.b(t8);
                        System.currentTimeMillis();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw new IllegalArgumentException();
    }
}
