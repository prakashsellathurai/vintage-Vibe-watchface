package q3;

import android.app.PendingIntent;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import b4.f;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import p3.a;
import p3.a.c;
import p3.d;
import p3.j;
import r3.b;
import r3.d;
import r3.l;
import r3.x;

public final class t<O extends a.c> implements d.a, d.b {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedList f6580a = new LinkedList();

    /* renamed from: b  reason: collision with root package name */
    public final a.e f6581b;

    /* renamed from: c  reason: collision with root package name */
    public final a<O> f6582c;

    /* renamed from: d  reason: collision with root package name */
    public final k f6583d;
    public final HashSet e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f6584f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final int f6585g;

    /* renamed from: h  reason: collision with root package name */
    public final e0 f6586h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f6587i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f6588j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public o3.a f6589k = null;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ d f6590l;

    public t(d dVar, p3.c<O> cVar) {
        this.f6590l = dVar;
        Looper looper = dVar.f6549l.getLooper();
        d.a a9 = cVar.a();
        r3.d dVar2 = new r3.d(a9.f6960a, a9.f6961b, a9.f6962c, a9.f6963d);
        a.C0106a aVar = cVar.f6320c.f6316a;
        b.b(aVar);
        a.e a10 = aVar.a(cVar.f6318a, looper, dVar2, cVar.f6321d, this, this);
        String str = cVar.f6319b;
        if (str != null && (a10 instanceof r3.c)) {
            ((r3.c) a10).r = str;
        }
        if (str != null && (a10 instanceof h)) {
            ((h) a10).getClass();
        }
        this.f6581b = a10;
        this.f6582c = cVar.e;
        this.f6583d = new k();
        this.f6585g = cVar.f6322f;
        if (a10.o()) {
            Context context = dVar.e;
            Handler handler = dVar.f6549l;
            d.a a11 = cVar.a();
            this.f6586h = new e0(context, handler, new r3.d(a11.f6960a, a11.f6961b, a11.f6962c, a11.f6963d));
            return;
        }
        this.f6586h = null;
    }

    public final void a() {
        d dVar = this.f6590l;
        b.a(dVar.f6549l);
        this.f6589k = null;
        m(o3.a.f6078j);
        if (this.f6587i) {
            Handler handler = dVar.f6549l;
            a<O> aVar = this.f6582c;
            handler.removeMessages(11, aVar);
            dVar.f6549l.removeMessages(9, aVar);
            this.f6587i = false;
        }
        Iterator it = this.f6584f.values().iterator();
        if (!it.hasNext()) {
            d();
            k();
            return;
        }
        ((c0) it.next()).getClass();
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0078 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(int r8) {
        /*
            r7 = this;
            q3.d r0 = r7.f6590l
            android.os.Handler r1 = r0.f6549l
            r3.b.a(r1)
            r1 = 0
            r7.f6589k = r1
            r2 = 1
            r7.f6587i = r2
            p3.a$e r3 = r7.f6581b
            java.lang.String r3 = r3.m()
            q3.k r4 = r7.f6583d
            r4.getClass()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "The connection to Google Play services was lost"
            r5.<init>(r6)
            if (r8 != r2) goto L_0x0024
            java.lang.String r8 = " due to service disconnection."
            goto L_0x0029
        L_0x0024:
            r6 = 3
            if (r8 != r6) goto L_0x002c
            java.lang.String r8 = " due to dead object exception."
        L_0x0029:
            r5.append(r8)
        L_0x002c:
            if (r3 == 0) goto L_0x0036
            java.lang.String r8 = " Last reason for disconnect: "
            r5.append(r8)
            r5.append(r3)
        L_0x0036:
            com.google.android.gms.common.api.Status r8 = new com.google.android.gms.common.api.Status
            r3 = 20
            java.lang.String r5 = r5.toString()
            r8.<init>(r3, r5)
            r4.a(r2, r8)
            android.os.Handler r8 = r0.f6549l
            r2 = 9
            q3.a<O> r3 = r7.f6582c
            android.os.Message r2 = android.os.Message.obtain(r8, r2, r3)
            r4 = 5000(0x1388, double:2.4703E-320)
            r8.sendMessageDelayed(r2, r4)
            android.os.Handler r8 = r0.f6549l
            r2 = 11
            android.os.Message r2 = android.os.Message.obtain(r8, r2, r3)
            r3 = 120000(0x1d4c0, double:5.9288E-319)
            r8.sendMessageDelayed(r2, r3)
            r3.x r8 = r0.f6544g
            android.util.SparseIntArray r8 = r8.f7052a
            r8.clear()
            java.util.HashMap r7 = r7.f6584f
            java.util.Collection r7 = r7.values()
            java.util.Iterator r7 = r7.iterator()
            boolean r8 = r7.hasNext()
            if (r8 != 0) goto L_0x0079
            return
        L_0x0079:
            java.lang.Object r7 = r7.next()
            q3.c0 r7 = (q3.c0) r7
            r7.getClass()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.t.b(int):void");
    }

    public final void c(o3.a aVar) {
        n(aVar, (RuntimeException) null);
    }

    public final void d() {
        LinkedList linkedList = this.f6580a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            j0 j0Var = (j0) arrayList.get(i8);
            if (this.f6581b.a()) {
                if (e(j0Var)) {
                    linkedList.remove(j0Var);
                }
                i8++;
            } else {
                return;
            }
        }
    }

    public final boolean e(j0 j0Var) {
        o3.c cVar;
        if (!(j0Var instanceof a0)) {
            f(j0Var);
            return true;
        }
        a0 a0Var = (a0) j0Var;
        o3.c[] f9 = a0Var.f(this);
        if (f9 != null && f9.length != 0) {
            o3.c[] j8 = this.f6581b.j();
            if (j8 == null) {
                j8 = new o3.c[0];
            }
            p.a aVar = new p.a(r6);
            for (o3.c cVar2 : j8) {
                aVar.put(cVar2.f6086f, Long.valueOf(cVar2.b()));
            }
            int length = f9.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    break;
                }
                cVar = f9[i8];
                Long l8 = (Long) aVar.getOrDefault(cVar.f6086f, null);
                if (l8 == null || l8.longValue() < cVar.b()) {
                    break;
                }
                i8++;
            }
        }
        cVar = null;
        if (cVar == null) {
            f(j0Var);
            return true;
        }
        String name = this.f6581b.getClass().getName();
        String str = cVar.f6086f;
        long b9 = cVar.b();
        StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(str).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(str);
        sb.append(", ");
        sb.append(b9);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (!this.f6590l.f6550m || !a0Var.g(this)) {
            a0Var.b(new j(cVar));
            return true;
        }
        u uVar = new u(this.f6582c, cVar);
        int indexOf = this.f6588j.indexOf(uVar);
        if (indexOf >= 0) {
            u uVar2 = (u) this.f6588j.get(indexOf);
            this.f6590l.f6549l.removeMessages(15, uVar2);
            Handler handler = this.f6590l.f6549l;
            Message obtain = Message.obtain(handler, 15, uVar2);
            this.f6590l.getClass();
            handler.sendMessageDelayed(obtain, 5000);
        } else {
            this.f6588j.add(uVar);
            Handler handler2 = this.f6590l.f6549l;
            Message obtain2 = Message.obtain(handler2, 15, uVar);
            this.f6590l.getClass();
            handler2.sendMessageDelayed(obtain2, 5000);
            Handler handler3 = this.f6590l.f6549l;
            Message obtain3 = Message.obtain(handler3, 16, uVar);
            this.f6590l.getClass();
            handler3.sendMessageDelayed(obtain3, 120000);
            o3.a aVar2 = new o3.a(2, (PendingIntent) null);
            synchronized (d.f6537p) {
                this.f6590l.getClass();
            }
            this.f6590l.e(aVar2, this.f6585g);
        }
        return false;
    }

    public final void f(j0 j0Var) {
        a.e eVar = this.f6581b;
        j0Var.c(this.f6583d, eVar.o());
        try {
            j0Var.d(this);
        } catch (DeadObjectException unused) {
            h(1);
            eVar.e("DeadObjectException thrown while running ApiCallRunner.");
        } catch (Throwable th) {
            throw new IllegalStateException(String.format("Error in GoogleApi implementation for client %s.", new Object[]{eVar.getClass().getName()}), th);
        }
    }

    public final void g(Status status, RuntimeException runtimeException, boolean z8) {
        b.a(this.f6590l.f6549l);
        boolean z9 = false;
        boolean z10 = status == null;
        if (runtimeException == null) {
            z9 = true;
        }
        if (z10 != z9) {
            Iterator it = this.f6580a.iterator();
            while (it.hasNext()) {
                j0 j0Var = (j0) it.next();
                if (!z8 || j0Var.f6567a == 2) {
                    if (status != null) {
                        j0Var.a(status);
                    } else {
                        j0Var.b(runtimeException);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    public final void h(int i8) {
        Looper myLooper = Looper.myLooper();
        d dVar = this.f6590l;
        if (myLooper == dVar.f6549l.getLooper()) {
            b(i8);
        } else {
            dVar.f6549l.post(new q(this, i8));
        }
    }

    public final void i() {
        Looper myLooper = Looper.myLooper();
        d dVar = this.f6590l;
        if (myLooper == dVar.f6549l.getLooper()) {
            a();
        } else {
            dVar.f6549l.post(new p(0, this));
        }
    }

    public final void j(Status status) {
        b.a(this.f6590l.f6549l);
        g(status, (RuntimeException) null, false);
    }

    public final void k() {
        d dVar = this.f6590l;
        Handler handler = dVar.f6549l;
        a<O> aVar = this.f6582c;
        handler.removeMessages(12, aVar);
        Handler handler2 = dVar.f6549l;
        handler2.sendMessageDelayed(handler2.obtainMessage(12, aVar), dVar.f6539a);
    }

    public final boolean l(boolean z8) {
        b.a(this.f6590l.f6549l);
        a.e eVar = this.f6581b;
        if (!eVar.a() || this.f6584f.size() != 0) {
            return false;
        }
        k kVar = this.f6583d;
        if (!kVar.f6568a.isEmpty() || !kVar.f6569b.isEmpty()) {
            if (z8) {
                k();
            }
            return false;
        }
        eVar.e("Timing out service connection.");
        return true;
    }

    public final void m(o3.a aVar) {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        if (it.hasNext()) {
            k0 k0Var = (k0) it.next();
            if (l.a(aVar, o3.a.f6078j)) {
                this.f6581b.l();
            }
            k0Var.getClass();
            throw null;
        }
        hashSet.clear();
    }

    public final void n(o3.a aVar, RuntimeException runtimeException) {
        f fVar;
        b.a(this.f6590l.f6549l);
        e0 e0Var = this.f6586h;
        if (!(e0Var == null || (fVar = e0Var.f6556g) == null)) {
            fVar.n();
        }
        b.a(this.f6590l.f6549l);
        this.f6589k = null;
        this.f6590l.f6544g.f7052a.clear();
        m(aVar);
        if ((this.f6581b instanceof t3.d) && aVar.f6080g != 24) {
            d dVar = this.f6590l;
            dVar.f6540b = true;
            Handler handler = dVar.f6549l;
            handler.sendMessageDelayed(handler.obtainMessage(19), 300000);
        }
        if (aVar.f6080g == 4) {
            j(d.f6536o);
        } else if (this.f6580a.isEmpty()) {
            this.f6589k = aVar;
        } else if (runtimeException != null) {
            b.a(this.f6590l.f6549l);
            g((Status) null, runtimeException, false);
        } else if (this.f6590l.f6550m) {
            g(d.b(this.f6582c, aVar), (RuntimeException) null, true);
            if (!this.f6580a.isEmpty()) {
                synchronized (d.f6537p) {
                    this.f6590l.getClass();
                }
                if (!this.f6590l.e(aVar, this.f6585g)) {
                    if (aVar.f6080g == 18) {
                        this.f6587i = true;
                    }
                    if (this.f6587i) {
                        Handler handler2 = this.f6590l.f6549l;
                        Message obtain = Message.obtain(handler2, 9, this.f6582c);
                        this.f6590l.getClass();
                        handler2.sendMessageDelayed(obtain, 5000);
                        return;
                    }
                    j(d.b(this.f6582c, aVar));
                }
            }
        } else {
            j(d.b(this.f6582c, aVar));
        }
    }

    public final void o(j0 j0Var) {
        b.a(this.f6590l.f6549l);
        boolean a9 = this.f6581b.a();
        LinkedList linkedList = this.f6580a;
        if (!a9) {
            linkedList.add(j0Var);
            o3.a aVar = this.f6589k;
            if (aVar != null) {
                if ((aVar.f6080g == 0 || aVar.f6081h == null) ? false : true) {
                    n(aVar, (RuntimeException) null);
                    return;
                }
            }
            q();
        } else if (e(j0Var)) {
            k();
        } else {
            linkedList.add(j0Var);
        }
    }

    public final void p() {
        b.a(this.f6590l.f6549l);
        Status status = d.f6535n;
        j(status);
        k kVar = this.f6583d;
        kVar.getClass();
        kVar.a(false, status);
        for (g i0Var : (g[]) this.f6584f.keySet().toArray(new g[0])) {
            o(new i0(i0Var, new d4.d()));
        }
        m(new o3.a(4));
        a.e eVar = this.f6581b;
        if (eVar.a()) {
            eVar.k(new s(this));
        }
    }

    /* JADX WARNING: type inference failed for: r4v6, types: [p3.a$e, b4.f] */
    public final void q() {
        o3.a aVar;
        d dVar = this.f6590l;
        b.a(dVar.f6549l);
        a.e eVar = this.f6581b;
        if (!eVar.a() && !eVar.i()) {
            try {
                x xVar = dVar.f6544g;
                Context context = dVar.e;
                xVar.getClass();
                b.b(context);
                int i8 = 0;
                if (eVar.f()) {
                    int h8 = eVar.h();
                    SparseIntArray sparseIntArray = xVar.f7052a;
                    int i9 = sparseIntArray.get(h8, -1);
                    if (i9 != -1) {
                        i8 = i9;
                    } else {
                        int i10 = 0;
                        while (true) {
                            if (i10 >= sparseIntArray.size()) {
                                i8 = -1;
                                break;
                            }
                            int keyAt = sparseIntArray.keyAt(i10);
                            if (keyAt > h8 && sparseIntArray.get(keyAt) == 0) {
                                break;
                            }
                            i10++;
                        }
                        if (i8 == -1) {
                            i8 = xVar.f7053b.b(context, h8);
                        }
                        sparseIntArray.put(h8, i8);
                    }
                }
                if (i8 != 0) {
                    o3.a aVar2 = new o3.a(i8, (PendingIntent) null);
                    String name = eVar.getClass().getName();
                    String valueOf = String.valueOf(aVar2);
                    StringBuilder sb = new StringBuilder(name.length() + 35 + valueOf.length());
                    sb.append("The service for ");
                    sb.append(name);
                    sb.append(" is not available: ");
                    sb.append(valueOf);
                    Log.w("GoogleApiManager", sb.toString());
                    n(aVar2, (RuntimeException) null);
                    return;
                }
                w wVar = new w(dVar, eVar, this.f6582c);
                if (eVar.o()) {
                    e0 e0Var = this.f6586h;
                    b.b(e0Var);
                    f fVar = e0Var.f6556g;
                    if (fVar != null) {
                        fVar.n();
                    }
                    Integer valueOf2 = Integer.valueOf(System.identityHashCode(e0Var));
                    r3.d dVar2 = e0Var.f6555f;
                    dVar2.f6959g = valueOf2;
                    b4.b bVar = e0Var.f6554d;
                    Context context2 = e0Var.f6552b;
                    Handler handler = e0Var.f6553c;
                    e0Var.f6556g = bVar.a(context2, handler.getLooper(), dVar2, dVar2.f6958f, e0Var, e0Var);
                    e0Var.f6557h = wVar;
                    Set<Scope> set = e0Var.e;
                    if (set == null || set.isEmpty()) {
                        handler.post(new p(2, e0Var));
                    } else {
                        e0Var.f6556g.g();
                    }
                }
                try {
                    eVar.c(wVar);
                } catch (SecurityException e4) {
                    e = e4;
                    aVar = new o3.a(10);
                    n(aVar, e);
                }
            } catch (IllegalStateException e9) {
                e = e9;
                aVar = new o3.a(10);
                n(aVar, e);
            }
        }
    }
}
