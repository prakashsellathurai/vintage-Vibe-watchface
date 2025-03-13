package s5;

import android.graphics.Color;
import android.util.Log;
import com.samsung.android.wearable.watchfacestudio.editor.p;
import com.samsung.android.wearable.watchfacestudio.editor.q;
import java.util.ArrayList;
import java.util.Iterator;
import k3.j;
import o6.g;
import o6.t;
import o6.u;
import o6.v;
import r5.e;
import r5.f;
import u5.a;
import u5.b;
import u5.c;
import w5.i;

public final class j0 implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<u> f7237a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final u f7238b;

    /* renamed from: c  reason: collision with root package name */
    public final e f7239c;

    /* renamed from: d  reason: collision with root package name */
    public b f7240d = new c();
    public final boolean e = true;

    /* renamed from: f  reason: collision with root package name */
    public final int f7241f;

    /* renamed from: g  reason: collision with root package name */
    public final int f7242g;

    public j0(e eVar, ArrayList arrayList, int i8, int i9) {
        t tVar;
        this.f7239c = eVar;
        this.f7241f = i8;
        this.f7242g = i9;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i6.e eVar2 = (i6.e) it.next();
            u uVar = new u(this.f7241f, this.f7242g);
            Color a9 = n6.b.a(eVar2.b("backgroundColor").e("#ff000000"), eVar.f7077h, new f(9, uVar), uVar);
            uVar.f6182c.d(v.a.f6185h, new w5.f(a9));
            p.c(eVar, eVar2, (i) null, uVar.f6181b, new p(26));
            Iterator it2 = eVar2.f4863b.iterator();
            while (true) {
                boolean hasNext = it2.hasNext();
                tVar = uVar.f6183d;
                if (!hasNext) {
                    break;
                }
                u.c(eVar, (i6.e) it2.next(), tVar);
            }
            uVar.f6184f = eVar.f7074d;
            this.f7237a.add(uVar);
            tVar.getClass();
            if (g.E) {
                Log.i("DWF:RootNode", "====================Tree of nodes (Scene)====================");
                tVar.m(new j(), new q(15));
                Log.i("DWF:RootNode", "=============================================================");
            }
        }
        this.f7238b = this.f7237a.get(0);
        this.f7239c.c(new h0(this));
        this.f7239c.a(new i0(this));
    }

    public final void a() {
        b();
    }

    public final void b() {
        this.f7240d.f7786a.remove(this);
        this.f7240d.c();
        this.f7240d = new c();
    }
}
