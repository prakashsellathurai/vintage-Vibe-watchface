package a2;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.fragment.app.i0;
import b2.a;
import b2.c;
import d2.e;
import f2.h;
import g2.b;
import java.util.ArrayList;
import java.util.List;
import k2.f;
import s.g;
import y1.l;
import y1.q;

public final class n implements m, a.C0028a, k {

    /* renamed from: a  reason: collision with root package name */
    public final Path f121a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final String f122b;

    /* renamed from: c  reason: collision with root package name */
    public final l f123c;

    /* renamed from: d  reason: collision with root package name */
    public final int f124d;
    public final boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final c f125f;

    /* renamed from: g  reason: collision with root package name */
    public final a<?, PointF> f126g;

    /* renamed from: h  reason: collision with root package name */
    public final c f127h;

    /* renamed from: i  reason: collision with root package name */
    public final c f128i;

    /* renamed from: j  reason: collision with root package name */
    public final c f129j;

    /* renamed from: k  reason: collision with root package name */
    public final c f130k;

    /* renamed from: l  reason: collision with root package name */
    public final c f131l;

    /* renamed from: m  reason: collision with root package name */
    public final b f132m = new b(0);

    /* renamed from: n  reason: collision with root package name */
    public boolean f133n;

    public n(l lVar, b bVar, h hVar) {
        a<Float, Float> aVar;
        this.f123c = lVar;
        this.f122b = hVar.f4335a;
        int i8 = hVar.f4336b;
        this.f124d = i8;
        this.e = hVar.f4343j;
        a<Float, Float> a9 = hVar.f4337c.a();
        this.f125f = (c) a9;
        a<PointF, PointF> a10 = hVar.f4338d.a();
        this.f126g = a10;
        a<Float, Float> a11 = hVar.e.a();
        this.f127h = (c) a11;
        a<Float, Float> a12 = hVar.f4340g.a();
        this.f129j = (c) a12;
        a<Float, Float> a13 = hVar.f4342i.a();
        this.f131l = (c) a13;
        if (i8 == 1) {
            this.f128i = (c) hVar.f4339f.a();
            aVar = hVar.f4341h.a();
        } else {
            aVar = null;
            this.f128i = null;
        }
        c cVar = (c) aVar;
        this.f130k = cVar;
        bVar.e(a9);
        bVar.e(a10);
        bVar.e(a11);
        bVar.e(a12);
        bVar.e(a13);
        if (i8 == 1) {
            bVar.e(this.f128i);
            bVar.e(cVar);
        }
        a9.a(this);
        a10.a(this);
        a11.a(this);
        a12.a(this);
        a13.a(this);
        if (i8 == 1) {
            this.f128i.a(this);
            cVar.a(this);
        }
    }

    public final void b() {
        this.f133n = false;
        this.f123c.invalidateSelf();
    }

    public final void c(e eVar, int i8, ArrayList arrayList, e eVar2) {
        f.d(eVar, i8, arrayList, eVar2, this);
    }

    public final void d(List<c> list, List<c> list2) {
        int i8 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i8 < arrayList.size()) {
                c cVar = (c) arrayList.get(i8);
                if (cVar instanceof s) {
                    s sVar = (s) cVar;
                    if (sVar.f163c == 1) {
                        this.f132m.f66a.add(sVar);
                        sVar.c(this);
                    }
                }
                i8++;
            } else {
                return;
            }
        }
    }

    public final Path g() {
        n nVar;
        Path path;
        float f9;
        float f10;
        float f11;
        float f12;
        double d9;
        float f13;
        float f14;
        float f15;
        Path path2;
        n nVar2;
        double d10;
        int i8;
        double d11;
        boolean z8 = this.f133n;
        Path path3 = this.f121a;
        if (z8) {
            return path3;
        }
        path3.reset();
        if (this.e) {
            this.f133n = true;
            return path3;
        }
        int b9 = g.b(this.f124d);
        a<?, PointF> aVar = this.f126g;
        c cVar = this.f131l;
        c cVar2 = this.f129j;
        double d12 = 0.0d;
        c cVar3 = this.f127h;
        c cVar4 = this.f125f;
        if (b9 == 0) {
            a<?, PointF> aVar2 = aVar;
            float floatValue = ((Float) cVar4.f()).floatValue();
            if (cVar3 != null) {
                d12 = (double) ((Float) cVar3.f()).floatValue();
            }
            double radians = Math.toRadians(d12 - 90.0d);
            double d13 = (double) floatValue;
            float f16 = (float) (6.283185307179586d / d13);
            float f17 = f16 / 2.0f;
            float f18 = floatValue - ((float) ((int) floatValue));
            int i9 = (f18 > 0.0f ? 1 : (f18 == 0.0f ? 0 : -1));
            if (i9 != 0) {
                radians += (double) ((1.0f - f18) * f17);
            }
            float floatValue2 = ((Float) cVar2.f()).floatValue();
            n nVar3 = this;
            float floatValue3 = ((Float) nVar3.f128i.f()).floatValue();
            c cVar5 = nVar3.f130k;
            float floatValue4 = cVar5 != null ? ((Float) cVar5.f()).floatValue() / 100.0f : 0.0f;
            float floatValue5 = cVar != null ? ((Float) cVar.f()).floatValue() / 100.0f : 0.0f;
            if (i9 != 0) {
                float f19 = floatValue3 + ((floatValue2 - floatValue3) * f18);
                double d14 = (double) f19;
                float f20 = f17;
                f11 = (float) (d14 * Math.cos(radians));
                f12 = (float) (d14 * Math.sin(radians));
                path3.moveTo(f11, f12);
                d9 = radians + ((double) ((f16 * f18) / 2.0f));
                f9 = f19;
                f10 = f20;
            } else {
                double d15 = (double) floatValue2;
                f11 = (float) (Math.cos(radians) * d15);
                float sin = (float) (d15 * Math.sin(radians));
                path3.moveTo(f11, sin);
                f10 = f17;
                d9 = radians + ((double) f10);
                f12 = sin;
                f9 = 0.0f;
            }
            double ceil = Math.ceil(d13) * 2.0d;
            double d16 = d9;
            int i10 = 0;
            boolean z9 = false;
            while (true) {
                double d17 = (double) i10;
                if (d17 >= ceil) {
                    break;
                }
                float f21 = z9 ? floatValue2 : floatValue3;
                int i11 = (f9 > 0.0f ? 1 : (f9 == 0.0f ? 0 : -1));
                if (i11 == 0 || d17 != ceil - 2.0d) {
                    f13 = f16;
                    f14 = f10;
                } else {
                    f13 = f16;
                    f14 = (f16 * f18) / 2.0f;
                }
                if (i11 == 0 || d17 != ceil - 1.0d) {
                    f15 = floatValue2;
                } else {
                    f15 = floatValue2;
                    f21 = f9;
                }
                double d18 = (double) f21;
                float f22 = f10;
                float f23 = f9;
                float cos = (float) (d18 * Math.cos(d16));
                float sin2 = (float) (d18 * Math.sin(d16));
                if (floatValue4 == 0.0f && floatValue5 == 0.0f) {
                    path3.lineTo(cos, sin2);
                    path2 = path3;
                    nVar2 = this;
                } else {
                    float f24 = f12;
                    double atan2 = (double) ((float) (Math.atan2((double) f12, (double) f11) - 1.5707963267948966d));
                    float cos2 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    path2 = path3;
                    float f25 = f11;
                    double atan22 = (double) ((float) (Math.atan2((double) sin2, (double) cos) - 1.5707963267948966d));
                    float cos3 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    float f26 = z9 ? floatValue4 : floatValue5;
                    float f27 = z9 ? floatValue5 : floatValue4;
                    float f28 = (z9 ? floatValue3 : f15) * f26 * 0.47829f;
                    float f29 = cos2 * f28;
                    float f30 = f28 * sin3;
                    float f31 = (z9 ? f15 : floatValue3) * f27 * 0.47829f;
                    float f32 = cos3 * f31;
                    float f33 = f31 * sin4;
                    if (i9 != 0) {
                        if (i10 == 0) {
                            f29 *= f18;
                            f30 *= f18;
                        } else if (d17 == ceil - 1.0d) {
                            f32 *= f18;
                            f33 *= f18;
                        }
                    }
                    nVar2 = this;
                    path2.cubicTo(f25 - f29, f24 - f30, cos + f32, sin2 + f33, cos, sin2);
                }
                d16 += (double) f14;
                z9 = !z9;
                i10++;
                nVar3 = nVar2;
                f11 = cos;
                f12 = sin2;
                floatValue2 = f15;
                f16 = f13;
                path3 = path2;
                f10 = f22;
                f9 = f23;
            }
            Path path4 = path3;
            nVar = nVar3;
            PointF f34 = aVar2.f();
            path = path4;
            path.offset(f34.x, f34.y);
            path.close();
        } else if (b9 != 1) {
            path = path3;
            nVar = this;
        } else {
            int floor = (int) Math.floor((double) ((Float) cVar4.f()).floatValue());
            if (cVar3 != null) {
                d12 = (double) ((Float) cVar3.f()).floatValue();
            }
            double radians2 = Math.toRadians(d12 - 90.0d);
            double d19 = (double) floor;
            float floatValue6 = ((Float) cVar.f()).floatValue() / 100.0f;
            float floatValue7 = ((Float) cVar2.f()).floatValue();
            double d20 = (double) floatValue7;
            float cos4 = (float) (Math.cos(radians2) * d20);
            float sin5 = (float) (Math.sin(radians2) * d20);
            path3.moveTo(cos4, sin5);
            double d21 = (double) ((float) (6.283185307179586d / d19));
            double d22 = radians2 + d21;
            double ceil2 = Math.ceil(d19);
            a<?, PointF> aVar3 = aVar;
            int i12 = 0;
            while (((double) i12) < ceil2) {
                float cos5 = (float) (Math.cos(d22) * d20);
                double d23 = d21;
                float sin6 = (float) (Math.sin(d22) * d20);
                if (floatValue6 != 0.0f) {
                    d10 = d20;
                    double atan23 = (double) ((float) (Math.atan2((double) sin5, (double) cos4) - 1.5707963267948966d));
                    i8 = i12;
                    double atan24 = (double) ((float) (Math.atan2((double) sin6, (double) cos5) - 1.5707963267948966d));
                    float f35 = floatValue7 * floatValue6 * 0.25f;
                    float cos6 = ((float) Math.cos(atan23)) * f35;
                    float sin7 = ((float) Math.sin(atan23)) * f35;
                    float cos7 = ((float) Math.cos(atan24)) * f35;
                    d11 = d23;
                    path3.cubicTo(cos4 - cos6, sin5 - sin7, cos7 + cos5, (f35 * ((float) Math.sin(atan24))) + sin6, cos5, sin6);
                } else {
                    i8 = i12;
                    d10 = d20;
                    d11 = d23;
                    path3.lineTo(cos5, sin6);
                }
                d22 += d11;
                d21 = d11;
                i12 = i8 + 1;
                cos4 = cos5;
                sin5 = sin6;
                d20 = d10;
            }
            PointF f36 = aVar3.f();
            path3.offset(f36.x, f36.y);
            path3.close();
            path = path3;
            nVar = this;
        }
        path.close();
        nVar.f132m.d(path);
        nVar.f133n = true;
        return path;
    }

    public final String getName() {
        return this.f122b;
    }

    public final void h(i0 i0Var, Object obj) {
        a aVar;
        c cVar;
        if (obj == q.f8317u) {
            aVar = this.f125f;
        } else if (obj == q.f8318v) {
            aVar = this.f127h;
        } else if (obj == q.f8309l) {
            aVar = this.f126g;
        } else {
            if (obj != q.w || (cVar = this.f128i) == null) {
                if (obj == q.f8319x) {
                    aVar = this.f129j;
                } else if (obj != q.y || (cVar = this.f130k) == null) {
                    if (obj == q.f8320z) {
                        aVar = this.f131l;
                    } else {
                        return;
                    }
                }
            }
            cVar.k(i0Var);
            return;
        }
        aVar.k(i0Var);
    }
}
