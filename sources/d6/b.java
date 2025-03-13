package d6;

import android.content.Context;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import w5.c;
import w5.f;
import w5.g;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public int f4048a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f4049b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashSet f4050c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    public final Context f4051d;
    public boolean e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4052f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4053g = true;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4054h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4055i = false;

    public b(Context context) {
        this.f4051d = context;
    }

    public void a() {
        this.f4049b.clear();
        this.f4050c.clear();
        this.f4054h = false;
    }

    public void b() {
        HashSet hashSet = this.f4050c;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            g(str, c(new c(str)), true);
        }
        hashSet.clear();
    }

    public abstract f c(c cVar);

    public abstract String d();

    public boolean e(String str) {
        return str != null && str.startsWith(d());
    }

    public void f() {
        this.f4054h = true;
    }

    public final boolean g(String str, f fVar, boolean z8) {
        boolean z9 = false;
        if (!this.f4055i && this.f4054h) {
            if (!e(str)) {
                Log.i("DWF:DataProvider", String.format("wrong source[%s]", new Object[]{str}));
                return false;
            }
            List<g> list = (List) this.f4049b.get(str);
            if (list == null) {
                return false;
            }
            if (list.size() > 0) {
                z9 = true;
            }
            if (z9) {
                if (z8 || (!this.e && this.f4048a == 3)) {
                    for (g g9 : list) {
                        g9.g(new c(str), fVar);
                    }
                } else {
                    this.f4050c.add(str);
                }
            }
        }
        return z9;
    }

    public abstract void h(boolean z8);

    public void i(boolean z8) {
    }

    public void j(boolean z8) {
    }

    public void k(String str) {
    }

    public void l(String str) {
    }

    public abstract void m();

    public abstract void n();

    public abstract void o(c cVar, f fVar);

    public final void p(boolean z8) {
        if (this.f4052f != z8) {
            Log.i("DWF:DataProvider", "device is locked: " + z8);
            this.f4052f = z8;
            i(z8);
        }
    }
}
