package r2;

import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.List;
import p2.a;
import r2.h;
import r2.m;
import v2.n;

public final class e implements h, d.a<Object> {

    /* renamed from: f  reason: collision with root package name */
    public final List<p2.e> f6756f;

    /* renamed from: g  reason: collision with root package name */
    public final i<?> f6757g;

    /* renamed from: h  reason: collision with root package name */
    public final h.a f6758h;

    /* renamed from: i  reason: collision with root package name */
    public int f6759i = -1;

    /* renamed from: j  reason: collision with root package name */
    public p2.e f6760j;

    /* renamed from: k  reason: collision with root package name */
    public List<n<File, ?>> f6761k;

    /* renamed from: l  reason: collision with root package name */
    public int f6762l;

    /* renamed from: m  reason: collision with root package name */
    public volatile n.a<?> f6763m;

    /* renamed from: n  reason: collision with root package name */
    public File f6764n;

    public e(List<p2.e> list, i<?> iVar, h.a aVar) {
        this.f6756f = list;
        this.f6757g = iVar;
        this.f6758h = aVar;
    }

    public final boolean a() {
        while (true) {
            List<n<File, ?>> list = this.f6761k;
            if (list != null) {
                if (this.f6762l < list.size()) {
                    this.f6763m = null;
                    boolean z8 = false;
                    while (!z8) {
                        if (!(this.f6762l < this.f6761k.size())) {
                            break;
                        }
                        List<n<File, ?>> list2 = this.f6761k;
                        int i8 = this.f6762l;
                        this.f6762l = i8 + 1;
                        File file = this.f6764n;
                        i<?> iVar = this.f6757g;
                        this.f6763m = list2.get(i8).a(file, iVar.e, iVar.f6774f, iVar.f6777i);
                        if (this.f6763m != null) {
                            if (this.f6757g.c(this.f6763m.f7886c.a()) != null) {
                                this.f6763m.f7886c.f(this.f6757g.f6783o, this);
                                z8 = true;
                            }
                        }
                    }
                    return z8;
                }
            }
            int i9 = this.f6759i + 1;
            this.f6759i = i9;
            if (i9 >= this.f6756f.size()) {
                return false;
            }
            p2.e eVar = this.f6756f.get(this.f6759i);
            i<?> iVar2 = this.f6757g;
            File a9 = ((m.c) iVar2.f6776h).a().a(new f(eVar, iVar2.f6782n));
            this.f6764n = a9;
            if (a9 != null) {
                this.f6760j = eVar;
                this.f6761k = this.f6757g.f6772c.f2922b.e(a9);
                this.f6762l = 0;
            }
        }
    }

    public final void c(Exception exc) {
        this.f6758h.f(this.f6760j, exc, this.f6763m.f7886c, a.f6296h);
    }

    public final void cancel() {
        n.a<?> aVar = this.f6763m;
        if (aVar != null) {
            aVar.f7886c.cancel();
        }
    }

    public final void d(Object obj) {
        this.f6758h.g(this.f6760j, obj, this.f6763m.f7886c, a.f6296h, this.f6760j);
    }
}
