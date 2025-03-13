package p6;

import a1.a;
import android.graphics.Color;
import android.os.SystemClock;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import s.g;
import w5.f;

public class c implements i {

    /* renamed from: a  reason: collision with root package name */
    public final long f6333a;

    /* renamed from: b  reason: collision with root package name */
    public final Interpolator f6334b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6335c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6336d = false;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public f f6337f;

    /* renamed from: g  reason: collision with root package name */
    public f f6338g;

    /* renamed from: h  reason: collision with root package name */
    public f f6339h;

    /* renamed from: i  reason: collision with root package name */
    public final e f6340i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList<h> f6341j;

    /* renamed from: k  reason: collision with root package name */
    public final int f6342k;

    /* renamed from: l  reason: collision with root package name */
    public final long f6343l;

    /* renamed from: m  reason: collision with root package name */
    public int f6344m;

    /* renamed from: n  reason: collision with root package name */
    public long f6345n;

    /* renamed from: o  reason: collision with root package name */
    public int f6346o;

    /* renamed from: p  reason: collision with root package name */
    public long f6347p;

    /* renamed from: q  reason: collision with root package name */
    public long f6348q;

    public c(g gVar, float f9, BaseInterpolator baseInterpolator, int i8, int i9, int i10) {
        f fVar = f.f8064l;
        this.f6337f = fVar;
        this.f6338g = fVar;
        this.f6339h = f.f8065m;
        this.f6341j = new ArrayList<>();
        this.f6344m = 0;
        this.f6345n = 0;
        this.f6346o = 0;
        this.f6347p = 0;
        this.f6348q = 0;
        this.f6334b = baseInterpolator;
        this.f6333a = (long) (f9 * 1000.0f);
        this.f6335c = i8;
        this.e = i9;
        this.f6342k = i10;
        this.f6343l = (long) ((int) ((1000.0f / a.k((float) i10, 1.0f, 15.0f)) - 33.0f));
        this.f6340i = gVar;
    }

    public final void a(long j8) {
        long j9 = this.f6345n + j8;
        this.f6345n = j9;
        int i8 = (j8 > 0 ? 1 : (j8 == 0 ? 0 : -1));
        long j10 = this.f6333a;
        if (i8 == 0 || j9 >= this.f6343l) {
            long j11 = this.f6347p + j9;
            this.f6347p = j11;
            j(this.f6334b.getInterpolation(((float) j11) / ((float) j10)));
            this.f6345n = 0;
            this.f6348q = SystemClock.elapsedRealtime();
        }
        if (this.f6347p > j10) {
            int i9 = this.f6335c;
            if (i9 >= 0) {
                int i10 = this.f6346o + 1;
                this.f6346o = i10;
                if (i10 > i9) {
                    h(true);
                    Iterator<h> it = this.f6341j.iterator();
                    while (it.hasNext()) {
                        it.next().a();
                    }
                    return;
                }
            }
            if (i9 == -1) {
                this.f6347p = 0;
            }
        }
    }

    public void b() {
        if (this.f6344m == 2) {
            this.f6340i.b(this);
            this.f6344m = 1;
        }
    }

    public void c() {
        if (this.f6336d) {
            this.f6336d = false;
            i(this.f6339h);
            return;
        }
        this.f6347p = 0;
        this.f6346o = 0;
        this.f6345n = 0;
        if (this.f6344m != 2) {
            this.f6345n = 0;
            this.f6340i.a(this);
            this.f6344m = 2;
        }
    }

    public void d() {
    }

    public void e() {
        if (this.f6344m == 1) {
            this.f6340i.a(this);
            this.f6344m = 2;
        }
    }

    public void f(f fVar, f fVar2) {
        this.f6338g = fVar;
        this.f6339h = fVar2;
    }

    public void g(boolean z8) {
        this.f6336d = z8;
    }

    public void h(boolean z8) {
        if (z8) {
            i(this.f6339h);
        }
        if (this.f6344m == 2) {
            this.f6340i.b(this);
        }
        this.f6344m = 0;
    }

    public final void i(f fVar) {
        this.f6337f = fVar;
        Iterator<h> it = this.f6341j.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    public void j(float f9) {
        f fVar;
        f fVar2;
        f fVar3 = this.f6338g;
        f fVar4 = this.f6339h;
        int b9 = g.b(fVar3.f8067a);
        if (b9 == 0 || b9 == 1 || b9 == 2 || b9 == 3) {
            fVar2 = new f((fVar3.c() * ((double) (1.0f - f9))) + (fVar4.c() * ((double) f9)));
        } else if (b9 != 6) {
            fVar = new f();
            i(fVar);
        } else {
            int e4 = fVar3.e();
            int e9 = fVar4.e();
            int i8 = c0.a.f2633a;
            float f10 = 1.0f - f9;
            fVar2 = new f(Color.valueOf(Color.argb((int) ((((float) Color.alpha(e4)) * f10) + (((float) Color.alpha(e9)) * f9)), (int) ((((float) Color.red(e4)) * f10) + (((float) Color.red(e9)) * f9)), (int) ((((float) Color.green(e4)) * f10) + (((float) Color.green(e9)) * f9)), (int) ((((float) Color.blue(e4)) * f10) + (((float) Color.blue(e9)) * f9)))));
        }
        fVar = fVar2;
        i(fVar);
    }
}
