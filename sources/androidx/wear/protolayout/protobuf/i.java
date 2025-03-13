package androidx.wear.protolayout.protobuf;

import androidx.wear.protolayout.protobuf.y;
import java.nio.charset.Charset;
import java.util.List;

public final class i implements a1 {

    /* renamed from: a  reason: collision with root package name */
    public final h f2114a;

    /* renamed from: b  reason: collision with root package name */
    public int f2115b;

    /* renamed from: c  reason: collision with root package name */
    public int f2116c;

    /* renamed from: d  reason: collision with root package name */
    public int f2117d = 0;

    public i(h hVar) {
        Charset charset = x.f2214a;
        if (hVar != null) {
            this.f2114a = hVar;
            hVar.f2107c = this;
            return;
        }
        throw new NullPointerException("input");
    }

    public static void x(int i8) {
        if ((i8 & 3) != 0) {
            throw new y("Failed to parse the message.");
        }
    }

    public static void y(int i8) {
        if ((i8 & 7) != 0) {
            throw new y("Failed to parse the message.");
        }
    }

    public final int a() {
        int i8 = this.f2117d;
        if (i8 != 0) {
            this.f2115b = i8;
            this.f2117d = 0;
        } else {
            this.f2115b = this.f2114a.v();
        }
        int i9 = this.f2115b;
        if (i9 == 0 || i9 == this.f2116c) {
            return Integer.MAX_VALUE;
        }
        return i9 >>> 3;
    }

    public final <T> void b(T t8, b1<T> b1Var, n nVar) {
        int i8 = this.f2116c;
        this.f2116c = ((this.f2115b >>> 3) << 3) | 4;
        try {
            b1Var.h(t8, this, nVar);
            if (this.f2115b != this.f2116c) {
                throw new y("Failed to parse the message.");
            }
        } finally {
            this.f2116c = i8;
        }
    }

    public final <T> void c(T t8, b1<T> b1Var, n nVar) {
        h hVar = this.f2114a;
        int w = hVar.w();
        if (hVar.f2105a < hVar.f2106b) {
            int f9 = hVar.f(w);
            hVar.f2105a++;
            b1Var.h(t8, this, nVar);
            hVar.a(0);
            hVar.f2105a--;
            hVar.e(f9);
            return;
        }
        throw new y("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public final void d(List<Boolean> list) {
        int i8;
        int v8;
        int v9;
        boolean z8 = list instanceof e;
        h hVar = this.f2114a;
        if (z8) {
            e eVar = (e) list;
            int i9 = this.f2115b & 7;
            if (i9 == 0) {
                do {
                    eVar.j(hVar.g());
                    if (!hVar.c()) {
                        v9 = hVar.v();
                    } else {
                        return;
                    }
                } while (v9 == this.f2115b);
                this.f2117d = v9;
                return;
            } else if (i9 == 2) {
                i8 = hVar.b() + hVar.w();
                do {
                    eVar.j(hVar.g());
                } while (hVar.b() < i8);
            } else {
                throw y.b();
            }
        } else {
            int i10 = this.f2115b & 7;
            if (i10 == 0) {
                do {
                    list.add(Boolean.valueOf(hVar.g()));
                    if (!hVar.c()) {
                        v8 = hVar.v();
                    } else {
                        return;
                    }
                } while (v8 == this.f2115b);
                this.f2117d = v8;
                return;
            } else if (i10 == 2) {
                i8 = hVar.b() + hVar.w();
                do {
                    list.add(Boolean.valueOf(hVar.g()));
                } while (hVar.b() < i8);
            } else {
                throw y.b();
            }
        }
        u(i8);
    }

    public final g e() {
        v(2);
        return this.f2114a.h();
    }

    public final void f(List<g> list) {
        int v8;
        if ((this.f2115b & 7) == 2) {
            do {
                list.add(e());
                h hVar = this.f2114a;
                if (!hVar.c()) {
                    v8 = hVar.v();
                } else {
                    return;
                }
            } while (v8 == this.f2115b);
            this.f2117d = v8;
            return;
        }
        throw y.b();
    }

    public final void g(List<Double> list) {
        int v8;
        int v9;
        boolean z8 = list instanceof l;
        h hVar = this.f2114a;
        if (z8) {
            l lVar = (l) list;
            int i8 = this.f2115b & 7;
            if (i8 == 1) {
                do {
                    lVar.j(hVar.i());
                    if (!hVar.c()) {
                        v9 = hVar.v();
                    } else {
                        return;
                    }
                } while (v9 == this.f2115b);
                this.f2117d = v9;
            } else if (i8 == 2) {
                int w = hVar.w();
                y(w);
                int b9 = hVar.b() + w;
                do {
                    lVar.j(hVar.i());
                } while (hVar.b() < b9);
            } else {
                int i9 = y.f2216f;
                throw new y.a();
            }
        } else {
            int i10 = this.f2115b & 7;
            if (i10 == 1) {
                do {
                    list.add(Double.valueOf(hVar.i()));
                    if (!hVar.c()) {
                        v8 = hVar.v();
                    } else {
                        return;
                    }
                } while (v8 == this.f2115b);
                this.f2117d = v8;
            } else if (i10 == 2) {
                int w8 = hVar.w();
                y(w8);
                int b10 = hVar.b() + w8;
                do {
                    list.add(Double.valueOf(hVar.i()));
                } while (hVar.b() < b10);
            } else {
                int i11 = y.f2216f;
                throw new y.a();
            }
        }
    }

    public final void h(List<Integer> list) {
        int i8;
        int v8;
        int v9;
        boolean z8 = list instanceof w;
        h hVar = this.f2114a;
        if (z8) {
            w wVar = (w) list;
            int i9 = this.f2115b & 7;
            if (i9 == 0) {
                do {
                    wVar.j(hVar.j());
                    if (!hVar.c()) {
                        v9 = hVar.v();
                    } else {
                        return;
                    }
                } while (v9 == this.f2115b);
                this.f2117d = v9;
                return;
            } else if (i9 == 2) {
                i8 = hVar.b() + hVar.w();
                do {
                    wVar.j(hVar.j());
                } while (hVar.b() < i8);
            } else {
                throw y.b();
            }
        } else {
            int i10 = this.f2115b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(hVar.j()));
                    if (!hVar.c()) {
                        v8 = hVar.v();
                    } else {
                        return;
                    }
                } while (v8 == this.f2115b);
                this.f2117d = v8;
                return;
            } else if (i10 == 2) {
                i8 = hVar.b() + hVar.w();
                do {
                    list.add(Integer.valueOf(hVar.j()));
                } while (hVar.b() < i8);
            } else {
                throw y.b();
            }
        }
        u(i8);
    }

    public final void i(List<Integer> list) {
        int v8;
        int v9;
        boolean z8 = list instanceof w;
        h hVar = this.f2114a;
        if (z8) {
            w wVar = (w) list;
            int i8 = this.f2115b & 7;
            if (i8 == 2) {
                int w = hVar.w();
                x(w);
                int b9 = hVar.b() + w;
                do {
                    wVar.j(hVar.k());
                } while (hVar.b() < b9);
            } else if (i8 == 5) {
                do {
                    wVar.j(hVar.k());
                    if (!hVar.c()) {
                        v9 = hVar.v();
                    } else {
                        return;
                    }
                } while (v9 == this.f2115b);
                this.f2117d = v9;
            } else {
                int i9 = y.f2216f;
                throw new y.a();
            }
        } else {
            int i10 = this.f2115b & 7;
            if (i10 == 2) {
                int w8 = hVar.w();
                x(w8);
                int b10 = hVar.b() + w8;
                do {
                    list.add(Integer.valueOf(hVar.k()));
                } while (hVar.b() < b10);
            } else if (i10 == 5) {
                do {
                    list.add(Integer.valueOf(hVar.k()));
                    if (!hVar.c()) {
                        v8 = hVar.v();
                    } else {
                        return;
                    }
                } while (v8 == this.f2115b);
                this.f2117d = v8;
            } else {
                int i11 = y.f2216f;
                throw new y.a();
            }
        }
    }

    public final void j(List<Long> list) {
        int v8;
        int v9;
        boolean z8 = list instanceof f0;
        h hVar = this.f2114a;
        if (z8) {
            f0 f0Var = (f0) list;
            int i8 = this.f2115b & 7;
            if (i8 == 1) {
                do {
                    f0Var.j(hVar.l());
                    if (!hVar.c()) {
                        v9 = hVar.v();
                    } else {
                        return;
                    }
                } while (v9 == this.f2115b);
                this.f2117d = v9;
            } else if (i8 == 2) {
                int w = hVar.w();
                y(w);
                int b9 = hVar.b() + w;
                do {
                    f0Var.j(hVar.l());
                } while (hVar.b() < b9);
            } else {
                int i9 = y.f2216f;
                throw new y.a();
            }
        } else {
            int i10 = this.f2115b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(hVar.l()));
                    if (!hVar.c()) {
                        v8 = hVar.v();
                    } else {
                        return;
                    }
                } while (v8 == this.f2115b);
                this.f2117d = v8;
            } else if (i10 == 2) {
                int w8 = hVar.w();
                y(w8);
                int b10 = hVar.b() + w8;
                do {
                    list.add(Long.valueOf(hVar.l()));
                } while (hVar.b() < b10);
            } else {
                int i11 = y.f2216f;
                throw new y.a();
            }
        }
    }

    public final void k(List<Float> list) {
        int v8;
        int v9;
        boolean z8 = list instanceof t;
        h hVar = this.f2114a;
        if (z8) {
            t tVar = (t) list;
            int i8 = this.f2115b & 7;
            if (i8 == 2) {
                int w = hVar.w();
                x(w);
                int b9 = hVar.b() + w;
                do {
                    tVar.j(hVar.m());
                } while (hVar.b() < b9);
            } else if (i8 == 5) {
                do {
                    tVar.j(hVar.m());
                    if (!hVar.c()) {
                        v9 = hVar.v();
                    } else {
                        return;
                    }
                } while (v9 == this.f2115b);
                this.f2117d = v9;
            } else {
                int i9 = y.f2216f;
                throw new y.a();
            }
        } else {
            int i10 = this.f2115b & 7;
            if (i10 == 2) {
                int w8 = hVar.w();
                x(w8);
                int b10 = hVar.b() + w8;
                do {
                    list.add(Float.valueOf(hVar.m()));
                } while (hVar.b() < b10);
            } else if (i10 == 5) {
                do {
                    list.add(Float.valueOf(hVar.m()));
                    if (!hVar.c()) {
                        v8 = hVar.v();
                    } else {
                        return;
                    }
                } while (v8 == this.f2115b);
                this.f2117d = v8;
            } else {
                int i11 = y.f2216f;
                throw new y.a();
            }
        }
    }

    public final void l(List<Integer> list) {
        int i8;
        int v8;
        int v9;
        boolean z8 = list instanceof w;
        h hVar = this.f2114a;
        if (z8) {
            w wVar = (w) list;
            int i9 = this.f2115b & 7;
            if (i9 == 0) {
                do {
                    wVar.j(hVar.n());
                    if (!hVar.c()) {
                        v9 = hVar.v();
                    } else {
                        return;
                    }
                } while (v9 == this.f2115b);
                this.f2117d = v9;
                return;
            } else if (i9 == 2) {
                i8 = hVar.b() + hVar.w();
                do {
                    wVar.j(hVar.n());
                } while (hVar.b() < i8);
            } else {
                throw y.b();
            }
        } else {
            int i10 = this.f2115b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(hVar.n()));
                    if (!hVar.c()) {
                        v8 = hVar.v();
                    } else {
                        return;
                    }
                } while (v8 == this.f2115b);
                this.f2117d = v8;
                return;
            } else if (i10 == 2) {
                i8 = hVar.b() + hVar.w();
                do {
                    list.add(Integer.valueOf(hVar.n()));
                } while (hVar.b() < i8);
            } else {
                throw y.b();
            }
        }
        u(i8);
    }

    public final void m(List<Long> list) {
        int i8;
        int v8;
        int v9;
        boolean z8 = list instanceof f0;
        h hVar = this.f2114a;
        if (z8) {
            f0 f0Var = (f0) list;
            int i9 = this.f2115b & 7;
            if (i9 == 0) {
                do {
                    f0Var.j(hVar.o());
                    if (!hVar.c()) {
                        v9 = hVar.v();
                    } else {
                        return;
                    }
                } while (v9 == this.f2115b);
                this.f2117d = v9;
                return;
            } else if (i9 == 2) {
                i8 = hVar.b() + hVar.w();
                do {
                    f0Var.j(hVar.o());
                } while (hVar.b() < i8);
            } else {
                throw y.b();
            }
        } else {
            int i10 = this.f2115b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(hVar.o()));
                    if (!hVar.c()) {
                        v8 = hVar.v();
                    } else {
                        return;
                    }
                } while (v8 == this.f2115b);
                this.f2117d = v8;
                return;
            } else if (i10 == 2) {
                i8 = hVar.b() + hVar.w();
                do {
                    list.add(Long.valueOf(hVar.o()));
                } while (hVar.b() < i8);
            } else {
                throw y.b();
            }
        }
        u(i8);
    }

    public final void n(List<Integer> list) {
        int v8;
        int v9;
        boolean z8 = list instanceof w;
        h hVar = this.f2114a;
        if (z8) {
            w wVar = (w) list;
            int i8 = this.f2115b & 7;
            if (i8 == 2) {
                int w = hVar.w();
                x(w);
                int b9 = hVar.b() + w;
                do {
                    wVar.j(hVar.p());
                } while (hVar.b() < b9);
            } else if (i8 == 5) {
                do {
                    wVar.j(hVar.p());
                    if (!hVar.c()) {
                        v9 = hVar.v();
                    } else {
                        return;
                    }
                } while (v9 == this.f2115b);
                this.f2117d = v9;
            } else {
                int i9 = y.f2216f;
                throw new y.a();
            }
        } else {
            int i10 = this.f2115b & 7;
            if (i10 == 2) {
                int w8 = hVar.w();
                x(w8);
                int b10 = hVar.b() + w8;
                do {
                    list.add(Integer.valueOf(hVar.p()));
                } while (hVar.b() < b10);
            } else if (i10 == 5) {
                do {
                    list.add(Integer.valueOf(hVar.p()));
                    if (!hVar.c()) {
                        v8 = hVar.v();
                    } else {
                        return;
                    }
                } while (v8 == this.f2115b);
                this.f2117d = v8;
            } else {
                int i11 = y.f2216f;
                throw new y.a();
            }
        }
    }

    public final void o(List<Long> list) {
        int v8;
        int v9;
        boolean z8 = list instanceof f0;
        h hVar = this.f2114a;
        if (z8) {
            f0 f0Var = (f0) list;
            int i8 = this.f2115b & 7;
            if (i8 == 1) {
                do {
                    f0Var.j(hVar.q());
                    if (!hVar.c()) {
                        v9 = hVar.v();
                    } else {
                        return;
                    }
                } while (v9 == this.f2115b);
                this.f2117d = v9;
            } else if (i8 == 2) {
                int w = hVar.w();
                y(w);
                int b9 = hVar.b() + w;
                do {
                    f0Var.j(hVar.q());
                } while (hVar.b() < b9);
            } else {
                int i9 = y.f2216f;
                throw new y.a();
            }
        } else {
            int i10 = this.f2115b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(hVar.q()));
                    if (!hVar.c()) {
                        v8 = hVar.v();
                    } else {
                        return;
                    }
                } while (v8 == this.f2115b);
                this.f2117d = v8;
            } else if (i10 == 2) {
                int w8 = hVar.w();
                y(w8);
                int b10 = hVar.b() + w8;
                do {
                    list.add(Long.valueOf(hVar.q()));
                } while (hVar.b() < b10);
            } else {
                int i11 = y.f2216f;
                throw new y.a();
            }
        }
    }

    public final void p(List<Integer> list) {
        int i8;
        int v8;
        int v9;
        boolean z8 = list instanceof w;
        h hVar = this.f2114a;
        if (z8) {
            w wVar = (w) list;
            int i9 = this.f2115b & 7;
            if (i9 == 0) {
                do {
                    wVar.j(hVar.r());
                    if (!hVar.c()) {
                        v9 = hVar.v();
                    } else {
                        return;
                    }
                } while (v9 == this.f2115b);
                this.f2117d = v9;
                return;
            } else if (i9 == 2) {
                i8 = hVar.b() + hVar.w();
                do {
                    wVar.j(hVar.r());
                } while (hVar.b() < i8);
            } else {
                throw y.b();
            }
        } else {
            int i10 = this.f2115b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(hVar.r()));
                    if (!hVar.c()) {
                        v8 = hVar.v();
                    } else {
                        return;
                    }
                } while (v8 == this.f2115b);
                this.f2117d = v8;
                return;
            } else if (i10 == 2) {
                i8 = hVar.b() + hVar.w();
                do {
                    list.add(Integer.valueOf(hVar.r()));
                } while (hVar.b() < i8);
            } else {
                throw y.b();
            }
        }
        u(i8);
    }

    public final void q(List<Long> list) {
        int i8;
        int v8;
        int v9;
        boolean z8 = list instanceof f0;
        h hVar = this.f2114a;
        if (z8) {
            f0 f0Var = (f0) list;
            int i9 = this.f2115b & 7;
            if (i9 == 0) {
                do {
                    f0Var.j(hVar.s());
                    if (!hVar.c()) {
                        v9 = hVar.v();
                    } else {
                        return;
                    }
                } while (v9 == this.f2115b);
                this.f2117d = v9;
                return;
            } else if (i9 == 2) {
                i8 = hVar.b() + hVar.w();
                do {
                    f0Var.j(hVar.s());
                } while (hVar.b() < i8);
            } else {
                throw y.b();
            }
        } else {
            int i10 = this.f2115b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(hVar.s()));
                    if (!hVar.c()) {
                        v8 = hVar.v();
                    } else {
                        return;
                    }
                } while (v8 == this.f2115b);
                this.f2117d = v8;
                return;
            } else if (i10 == 2) {
                i8 = hVar.b() + hVar.w();
                do {
                    list.add(Long.valueOf(hVar.s()));
                } while (hVar.b() < i8);
            } else {
                throw y.b();
            }
        }
        u(i8);
    }

    public final void r(List<String> list, boolean z8) {
        String str;
        int v8;
        int v9;
        if ((this.f2115b & 7) == 2) {
            boolean z9 = list instanceof d0;
            h hVar = this.f2114a;
            if (!z9 || z8) {
                do {
                    if (z8) {
                        v(2);
                        str = hVar.u();
                    } else {
                        v(2);
                        str = hVar.t();
                    }
                    list.add(str);
                    if (!hVar.c()) {
                        v8 = hVar.v();
                    } else {
                        return;
                    }
                } while (v8 == this.f2115b);
                this.f2117d = v8;
                return;
            }
            d0 d0Var = (d0) list;
            do {
                d0Var.g(e());
                if (!hVar.c()) {
                    v9 = hVar.v();
                } else {
                    return;
                }
            } while (v9 == this.f2115b);
            this.f2117d = v9;
            return;
        }
        int i8 = y.f2216f;
        throw new y.a();
    }

    public final void s(List<Integer> list) {
        int i8;
        int v8;
        int v9;
        boolean z8 = list instanceof w;
        h hVar = this.f2114a;
        if (z8) {
            w wVar = (w) list;
            int i9 = this.f2115b & 7;
            if (i9 == 0) {
                do {
                    wVar.j(hVar.w());
                    if (!hVar.c()) {
                        v9 = hVar.v();
                    } else {
                        return;
                    }
                } while (v9 == this.f2115b);
                this.f2117d = v9;
                return;
            } else if (i9 == 2) {
                i8 = hVar.b() + hVar.w();
                do {
                    wVar.j(hVar.w());
                } while (hVar.b() < i8);
            } else {
                throw y.b();
            }
        } else {
            int i10 = this.f2115b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(hVar.w()));
                    if (!hVar.c()) {
                        v8 = hVar.v();
                    } else {
                        return;
                    }
                } while (v8 == this.f2115b);
                this.f2117d = v8;
                return;
            } else if (i10 == 2) {
                i8 = hVar.b() + hVar.w();
                do {
                    list.add(Integer.valueOf(hVar.w()));
                } while (hVar.b() < i8);
            } else {
                throw y.b();
            }
        }
        u(i8);
    }

    public final void t(List<Long> list) {
        int i8;
        int v8;
        int v9;
        boolean z8 = list instanceof f0;
        h hVar = this.f2114a;
        if (z8) {
            f0 f0Var = (f0) list;
            int i9 = this.f2115b & 7;
            if (i9 == 0) {
                do {
                    f0Var.j(hVar.x());
                    if (!hVar.c()) {
                        v9 = hVar.v();
                    } else {
                        return;
                    }
                } while (v9 == this.f2115b);
                this.f2117d = v9;
                return;
            } else if (i9 == 2) {
                i8 = hVar.b() + hVar.w();
                do {
                    f0Var.j(hVar.x());
                } while (hVar.b() < i8);
            } else {
                throw y.b();
            }
        } else {
            int i10 = this.f2115b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(hVar.x()));
                    if (!hVar.c()) {
                        v8 = hVar.v();
                    } else {
                        return;
                    }
                } while (v8 == this.f2115b);
                this.f2117d = v8;
                return;
            } else if (i10 == 2) {
                i8 = hVar.b() + hVar.w();
                do {
                    list.add(Long.valueOf(hVar.x()));
                } while (hVar.b() < i8);
            } else {
                throw y.b();
            }
        }
        u(i8);
    }

    public final void u(int i8) {
        if (this.f2114a.b() != i8) {
            throw y.c();
        }
    }

    public final void v(int i8) {
        if ((this.f2115b & 7) != i8) {
            throw y.b();
        }
    }

    public final boolean w() {
        int i8;
        h hVar = this.f2114a;
        if (hVar.c() || (i8 = this.f2115b) == this.f2116c) {
            return false;
        }
        return hVar.y(i8);
    }
}
