package r5;

import android.content.Context;
import b0.c;
import java.util.HashSet;
import java.util.Iterator;
import p6.g;
import s5.d;
import s5.i;
import s5.q;
import s5.r;
import v5.b;

public final class e {

    /* renamed from: o  reason: collision with root package name */
    public static int f7070o;

    /* renamed from: a  reason: collision with root package name */
    public final Context f7071a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7072b;

    /* renamed from: c  reason: collision with root package name */
    public final g f7073c;

    /* renamed from: d  reason: collision with root package name */
    public final d f7074d;
    public final HashSet e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public final HashSet f7075f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    public final boolean f7076g;

    /* renamed from: h  reason: collision with root package name */
    public b f7077h;

    /* renamed from: i  reason: collision with root package name */
    public j6.b f7078i;

    /* renamed from: j  reason: collision with root package name */
    public s5.e f7079j;

    /* renamed from: k  reason: collision with root package name */
    public i f7080k;

    /* renamed from: l  reason: collision with root package name */
    public s5.b f7081l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f7082m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f7083n;

    public e(Context context, d dVar, int i8, boolean z8) {
        this.f7071a = context;
        this.f7074d = dVar;
        this.f7072b = i8;
        this.f7082m = i8 == 2;
        this.f7083n = false;
        this.f7073c = new g();
        this.f7076g = z8;
    }

    public final void a(q qVar) {
        b(qVar, qVar instanceof d ? (d) qVar : null);
    }

    public final void b(q qVar, d dVar) {
        this.e.add(qVar);
        if (dVar != null) {
            dVar.k(new c(this, 11, qVar));
        }
    }

    public final void c(r rVar) {
        d(rVar, rVar instanceof d ? (d) rVar : null);
    }

    public final void d(r rVar, d dVar) {
        this.f7075f.add(rVar);
        if (dVar != null) {
            dVar.k(new c(this, 10, rVar));
        }
    }

    public final void e(boolean z8) {
        if (this.f7082m != z8) {
            this.f7082m = z8;
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((q) it.next()).d(z8);
            }
        }
    }

    public final void f(boolean z8) {
        if (z8 != this.f7083n) {
            this.f7083n = z8;
            Iterator it = this.f7075f.iterator();
            while (it.hasNext()) {
                ((r) it.next()).f(this.f7083n);
            }
        }
    }
}
