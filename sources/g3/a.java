package g3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import b3.c;
import b3.d;
import com.bumptech.glide.h;
import g3.a;
import java.util.Map;
import k3.b;
import k3.j;
import p.f;
import p2.e;
import p2.g;
import p2.k;
import r2.l;

public abstract class a<T extends a<T>> implements Cloneable {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D = true;
    public boolean E;

    /* renamed from: f  reason: collision with root package name */
    public int f4552f;

    /* renamed from: g  reason: collision with root package name */
    public float f4553g = 1.0f;

    /* renamed from: h  reason: collision with root package name */
    public l f4554h = l.f6825c;

    /* renamed from: i  reason: collision with root package name */
    public h f4555i = h.f2933h;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f4556j;

    /* renamed from: k  reason: collision with root package name */
    public int f4557k;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f4558l;

    /* renamed from: m  reason: collision with root package name */
    public int f4559m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4560n = true;

    /* renamed from: o  reason: collision with root package name */
    public int f4561o = -1;

    /* renamed from: p  reason: collision with root package name */
    public int f4562p = -1;

    /* renamed from: q  reason: collision with root package name */
    public e f4563q = j3.a.f4981b;
    public boolean r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f4564s = true;

    /* renamed from: t  reason: collision with root package name */
    public Drawable f4565t;

    /* renamed from: u  reason: collision with root package name */
    public int f4566u;

    /* renamed from: v  reason: collision with root package name */
    public g f4567v = new g();
    public Map<Class<?>, k<?>> w = new b();

    /* renamed from: x  reason: collision with root package name */
    public Class<?> f4568x = Object.class;
    public boolean y;

    /* renamed from: z  reason: collision with root package name */
    public Resources.Theme f4569z;

    public static boolean e(int i8, int i9) {
        return (i8 & i9) != 0;
    }

    public T a(a<?> aVar) {
        if (this.A) {
            return clone().a(aVar);
        }
        if (e(aVar.f4552f, 2)) {
            this.f4553g = aVar.f4553g;
        }
        if (e(aVar.f4552f, 262144)) {
            this.B = aVar.B;
        }
        if (e(aVar.f4552f, 1048576)) {
            this.E = aVar.E;
        }
        if (e(aVar.f4552f, 4)) {
            this.f4554h = aVar.f4554h;
        }
        if (e(aVar.f4552f, 8)) {
            this.f4555i = aVar.f4555i;
        }
        if (e(aVar.f4552f, 16)) {
            this.f4556j = aVar.f4556j;
            this.f4557k = 0;
            this.f4552f &= -33;
        }
        if (e(aVar.f4552f, 32)) {
            this.f4557k = aVar.f4557k;
            this.f4556j = null;
            this.f4552f &= -17;
        }
        if (e(aVar.f4552f, 64)) {
            this.f4558l = aVar.f4558l;
            this.f4559m = 0;
            this.f4552f &= -129;
        }
        if (e(aVar.f4552f, 128)) {
            this.f4559m = aVar.f4559m;
            this.f4558l = null;
            this.f4552f &= -65;
        }
        if (e(aVar.f4552f, 256)) {
            this.f4560n = aVar.f4560n;
        }
        if (e(aVar.f4552f, 512)) {
            this.f4562p = aVar.f4562p;
            this.f4561o = aVar.f4561o;
        }
        if (e(aVar.f4552f, 1024)) {
            this.f4563q = aVar.f4563q;
        }
        if (e(aVar.f4552f, 4096)) {
            this.f4568x = aVar.f4568x;
        }
        if (e(aVar.f4552f, 8192)) {
            this.f4565t = aVar.f4565t;
            this.f4566u = 0;
            this.f4552f &= -16385;
        }
        if (e(aVar.f4552f, 16384)) {
            this.f4566u = aVar.f4566u;
            this.f4565t = null;
            this.f4552f &= -8193;
        }
        if (e(aVar.f4552f, 32768)) {
            this.f4569z = aVar.f4569z;
        }
        if (e(aVar.f4552f, 65536)) {
            this.f4564s = aVar.f4564s;
        }
        if (e(aVar.f4552f, 131072)) {
            this.r = aVar.r;
        }
        if (e(aVar.f4552f, 2048)) {
            ((p.a) this.w).putAll(aVar.w);
            this.D = aVar.D;
        }
        if (e(aVar.f4552f, 524288)) {
            this.C = aVar.C;
        }
        if (!this.f4564s) {
            ((b) this.w).clear();
            this.r = false;
            this.f4552f = this.f4552f & -2049 & -131073;
            this.D = true;
        }
        this.f4552f |= aVar.f4552f;
        this.f4567v.f6312b.i(aVar.f4567v.f6312b);
        h();
        return this;
    }

    /* renamed from: b */
    public T clone() {
        try {
            T t8 = (a) super.clone();
            g gVar = new g();
            t8.f4567v = gVar;
            gVar.f6312b.i(this.f4567v.f6312b);
            b bVar = new b();
            t8.w = bVar;
            bVar.putAll(this.w);
            t8.y = false;
            t8.A = false;
            return t8;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final T c(Class<?> cls) {
        if (this.A) {
            return clone().c(cls);
        }
        this.f4568x = cls;
        this.f4552f |= 4096;
        h();
        return this;
    }

    public final T d(l lVar) {
        if (this.A) {
            return clone().d(lVar);
        }
        j.l(lVar);
        this.f4554h = lVar;
        this.f4552f |= 4;
        h();
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (Float.compare(aVar.f4553g, this.f4553g) != 0 || this.f4557k != aVar.f4557k || !k3.k.a(this.f4556j, aVar.f4556j) || this.f4559m != aVar.f4559m || !k3.k.a(this.f4558l, aVar.f4558l) || this.f4566u != aVar.f4566u || !k3.k.a(this.f4565t, aVar.f4565t) || this.f4560n != aVar.f4560n || this.f4561o != aVar.f4561o || this.f4562p != aVar.f4562p || this.r != aVar.r || this.f4564s != aVar.f4564s || this.B != aVar.B || this.C != aVar.C || !this.f4554h.equals(aVar.f4554h) || this.f4555i != aVar.f4555i || !this.f4567v.equals(aVar.f4567v)) {
            return false;
        }
        return ((f) this.w).equals(aVar.w) && this.f4568x.equals(aVar.f4568x) && k3.k.a(this.f4563q, aVar.f4563q) && k3.k.a(this.f4569z, aVar.f4569z);
    }

    public final T f(int i8, int i9) {
        if (this.A) {
            return clone().f(i8, i9);
        }
        this.f4562p = i8;
        this.f4561o = i9;
        this.f4552f |= 512;
        h();
        return this;
    }

    public final a g() {
        h hVar = h.f2934i;
        if (this.A) {
            return clone().g();
        }
        this.f4555i = hVar;
        this.f4552f |= 8;
        h();
        return this;
    }

    public final void h() {
        if (this.y) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public final int hashCode() {
        float f9 = this.f4553g;
        char[] cArr = k3.k.f5169a;
        return k3.k.f(k3.k.f(k3.k.f(k3.k.f(k3.k.f(k3.k.f(k3.k.f((((((((((((((k3.k.f((k3.k.f((k3.k.f(((Float.floatToIntBits(f9) + 527) * 31) + this.f4557k, this.f4556j) * 31) + this.f4559m, this.f4558l) * 31) + this.f4566u, this.f4565t) * 31) + (this.f4560n ? 1 : 0)) * 31) + this.f4561o) * 31) + this.f4562p) * 31) + (this.r ? 1 : 0)) * 31) + (this.f4564s ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0), this.f4554h), this.f4555i), this.f4567v), this.w), this.f4568x), this.f4563q), this.f4569z);
    }

    public final T i(e eVar) {
        if (this.A) {
            return clone().i(eVar);
        }
        this.f4563q = eVar;
        this.f4552f |= 1024;
        h();
        return this;
    }

    public final T j(boolean z8) {
        if (this.A) {
            return clone().j(true);
        }
        this.f4560n = !z8;
        this.f4552f |= 256;
        h();
        return this;
    }

    public final a k(Class cls, k kVar) {
        if (this.A) {
            return clone().k(cls, kVar);
        }
        j.l(kVar);
        ((b) this.w).put(cls, kVar);
        this.f4564s = true;
        this.D = false;
        this.f4552f = this.f4552f | 2048 | 65536 | 131072;
        this.r = true;
        h();
        return this;
    }

    public final a l(k kVar) {
        if (this.A) {
            return clone().l(kVar);
        }
        y2.j jVar = new y2.j(kVar);
        k(Bitmap.class, kVar);
        k(Drawable.class, jVar);
        k(BitmapDrawable.class, jVar);
        k(c.class, new d(kVar));
        h();
        return this;
    }

    public final a m() {
        if (this.A) {
            return clone().m();
        }
        this.E = true;
        this.f4552f |= 1048576;
        h();
        return this;
    }
}
