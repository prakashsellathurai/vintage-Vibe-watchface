package b2;

import a2.b;
import android.graphics.Matrix;
import android.graphics.PointF;
import androidx.fragment.app.i0;
import b2.a;
import e2.a;
import e2.d;
import e2.e;
import java.util.Collections;
import l2.c;
import y1.q;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f2542a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    public final Matrix f2543b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f2544c;

    /* renamed from: d  reason: collision with root package name */
    public final Matrix f2545d;
    public final float[] e;

    /* renamed from: f  reason: collision with root package name */
    public a<PointF, PointF> f2546f;

    /* renamed from: g  reason: collision with root package name */
    public a<?, PointF> f2547g;

    /* renamed from: h  reason: collision with root package name */
    public a<c, c> f2548h;

    /* renamed from: i  reason: collision with root package name */
    public a<Float, Float> f2549i;

    /* renamed from: j  reason: collision with root package name */
    public a<Integer, Integer> f2550j;

    /* renamed from: k  reason: collision with root package name */
    public c f2551k;

    /* renamed from: l  reason: collision with root package name */
    public c f2552l;

    /* renamed from: m  reason: collision with root package name */
    public a<?, Float> f2553m;

    /* renamed from: n  reason: collision with root package name */
    public a<?, Float> f2554n;

    public l(d dVar) {
        b bVar = dVar.f4242a;
        this.f2546f = bVar == null ? null : bVar.a();
        e<PointF, PointF> eVar = dVar.f4243b;
        this.f2547g = eVar == null ? null : eVar.a();
        a aVar = dVar.f4244c;
        this.f2548h = aVar == null ? null : aVar.a();
        e2.b bVar2 = dVar.f4245d;
        this.f2549i = bVar2 == null ? null : bVar2.a();
        e2.b bVar3 = dVar.f4246f;
        c cVar = bVar3 == null ? null : (c) bVar3.a();
        this.f2551k = cVar;
        if (cVar != null) {
            this.f2543b = new Matrix();
            this.f2544c = new Matrix();
            this.f2545d = new Matrix();
            this.e = new float[9];
        } else {
            this.f2543b = null;
            this.f2544c = null;
            this.f2545d = null;
            this.e = null;
        }
        e2.b bVar4 = dVar.f4247g;
        this.f2552l = bVar4 == null ? null : (c) bVar4.a();
        a aVar2 = dVar.e;
        if (aVar2 != null) {
            this.f2550j = aVar2.a();
        }
        e2.b bVar5 = dVar.f4248h;
        if (bVar5 != null) {
            this.f2553m = bVar5.a();
        } else {
            this.f2553m = null;
        }
        e2.b bVar6 = dVar.f4249i;
        if (bVar6 != null) {
            this.f2554n = bVar6.a();
        } else {
            this.f2554n = null;
        }
    }

    public final void a(g2.b bVar) {
        bVar.e(this.f2550j);
        bVar.e(this.f2553m);
        bVar.e(this.f2554n);
        bVar.e(this.f2546f);
        bVar.e(this.f2547g);
        bVar.e(this.f2548h);
        bVar.e(this.f2549i);
        bVar.e(this.f2551k);
        bVar.e(this.f2552l);
    }

    public final void b(a.C0028a aVar) {
        a<Integer, Integer> aVar2 = this.f2550j;
        if (aVar2 != null) {
            aVar2.a(aVar);
        }
        a<?, Float> aVar3 = this.f2553m;
        if (aVar3 != null) {
            aVar3.a(aVar);
        }
        a<?, Float> aVar4 = this.f2554n;
        if (aVar4 != null) {
            aVar4.a(aVar);
        }
        a<PointF, PointF> aVar5 = this.f2546f;
        if (aVar5 != null) {
            aVar5.a(aVar);
        }
        a<?, PointF> aVar6 = this.f2547g;
        if (aVar6 != null) {
            aVar6.a(aVar);
        }
        a<c, c> aVar7 = this.f2548h;
        if (aVar7 != null) {
            aVar7.a(aVar);
        }
        a<Float, Float> aVar8 = this.f2549i;
        if (aVar8 != null) {
            aVar8.a(aVar);
        }
        c cVar = this.f2551k;
        if (cVar != null) {
            cVar.a(aVar);
        }
        c cVar2 = this.f2552l;
        if (cVar2 != null) {
            cVar2.a(aVar);
        }
    }

    public final boolean c(i0 i0Var, Object obj) {
        c cVar;
        c cVar2;
        c cVar3;
        a<?, Float> aVar;
        a aVar2;
        if (obj == q.e) {
            aVar2 = this.f2546f;
            if (aVar2 == null) {
                this.f2546f = new m(i0Var, new PointF());
                return true;
            }
        } else if (obj == q.f8303f) {
            aVar2 = this.f2547g;
            if (aVar2 == null) {
                this.f2547g = new m(i0Var, new PointF());
                return true;
            }
        } else {
            if (obj == q.f8304g) {
                a<?, PointF> aVar3 = this.f2547g;
                if (aVar3 instanceof j) {
                    j jVar = (j) aVar3;
                    i0 i0Var2 = jVar.f2540m;
                    if (i0Var2 != null) {
                        i0Var2.f1189b = null;
                    }
                    jVar.f2540m = i0Var;
                    if (i0Var == null) {
                        return true;
                    }
                    i0Var.f1189b = jVar;
                    return true;
                }
            }
            if (obj == q.f8305h) {
                a<?, PointF> aVar4 = this.f2547g;
                if (aVar4 instanceof j) {
                    j jVar2 = (j) aVar4;
                    i0 i0Var3 = jVar2.f2541n;
                    if (i0Var3 != null) {
                        i0Var3.f1189b = null;
                    }
                    jVar2.f2541n = i0Var;
                    if (i0Var == null) {
                        return true;
                    }
                    i0Var.f1189b = jVar2;
                    return true;
                }
            }
            if (obj == q.f8310m) {
                aVar2 = this.f2548h;
                if (aVar2 == null) {
                    this.f2548h = new m(i0Var, new c());
                    return true;
                }
            } else if (obj == q.f8311n) {
                aVar2 = this.f2549i;
                if (aVar2 == null) {
                    this.f2549i = new m(i0Var, Float.valueOf(0.0f));
                    return true;
                }
            } else if (obj == q.f8301c) {
                aVar2 = this.f2550j;
                if (aVar2 == null) {
                    this.f2550j = new m(i0Var, 100);
                    return true;
                }
            } else {
                if (obj != q.A || (aVar = this.f2553m) == null) {
                    if (obj != q.B || (aVar = this.f2554n) == null) {
                        if (obj == q.f8312o && (cVar3 = this.f2551k) != null) {
                            if (cVar3 == null) {
                                this.f2551k = new c(Collections.singletonList(new l2.a(Float.valueOf(0.0f))));
                            }
                            cVar2 = this.f2551k;
                        } else if (obj != q.f8313p || (cVar = this.f2552l) == null) {
                            return false;
                        } else {
                            if (cVar == null) {
                                this.f2552l = new c(Collections.singletonList(new l2.a(Float.valueOf(0.0f))));
                            }
                            cVar2 = this.f2552l;
                        }
                        cVar2.k(i0Var);
                        return true;
                    } else if (aVar == null) {
                        this.f2554n = new m(i0Var, 100);
                        return true;
                    }
                } else if (aVar == null) {
                    this.f2553m = new m(i0Var, 100);
                    return true;
                }
                aVar.k(i0Var);
                return true;
            }
        }
        aVar2.k(i0Var);
        return true;
    }

    public final Matrix d() {
        float[] fArr;
        Matrix matrix = this.f2542a;
        matrix.reset();
        a<?, PointF> aVar = this.f2547g;
        if (aVar != null) {
            PointF f9 = aVar.f();
            float f10 = f9.x;
            if (!(f10 == 0.0f && f9.y == 0.0f)) {
                matrix.preTranslate(f10, f9.y);
            }
        }
        a<Float, Float> aVar2 = this.f2549i;
        if (aVar2 != null) {
            float floatValue = aVar2 instanceof m ? aVar2.f().floatValue() : ((c) aVar2).l();
            if (floatValue != 0.0f) {
                matrix.preRotate(floatValue);
            }
        }
        if (this.f2551k != null) {
            c cVar = this.f2552l;
            float cos = cVar == null ? 0.0f : (float) Math.cos(Math.toRadians((double) ((-cVar.l()) + 90.0f)));
            c cVar2 = this.f2552l;
            float sin = cVar2 == null ? 1.0f : (float) Math.sin(Math.toRadians((double) ((-cVar2.l()) + 90.0f)));
            float tan = (float) Math.tan(Math.toRadians((double) this.f2551k.l()));
            int i8 = 0;
            while (true) {
                fArr = this.e;
                if (i8 >= 9) {
                    break;
                }
                fArr[i8] = 0.0f;
                i8++;
            }
            fArr[0] = cos;
            fArr[1] = sin;
            float f11 = -sin;
            fArr[3] = f11;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.f2543b;
            matrix2.setValues(fArr);
            for (int i9 = 0; i9 < 9; i9++) {
                fArr[i9] = 0.0f;
            }
            fArr[0] = 1.0f;
            fArr[3] = tan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.f2544c;
            matrix3.setValues(fArr);
            for (int i10 = 0; i10 < 9; i10++) {
                fArr[i10] = 0.0f;
            }
            fArr[0] = cos;
            fArr[1] = f11;
            fArr[3] = sin;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.f2545d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        a<c, c> aVar3 = this.f2548h;
        if (aVar3 != null) {
            c f12 = aVar3.f();
            float f13 = f12.f5285a;
            if (!(f13 == 1.0f && f12.f5286b == 1.0f)) {
                matrix.preScale(f13, f12.f5286b);
            }
        }
        a<PointF, PointF> aVar4 = this.f2546f;
        if (aVar4 != null) {
            PointF f14 = aVar4.f();
            float f15 = f14.x;
            if (!(f15 == 0.0f && f14.y == 0.0f)) {
                matrix.preTranslate(-f15, -f14.y);
            }
        }
        return matrix;
    }

    public final Matrix e(float f9) {
        a<?, PointF> aVar = this.f2547g;
        PointF pointF = null;
        PointF f10 = aVar == null ? null : aVar.f();
        a<c, c> aVar2 = this.f2548h;
        c f11 = aVar2 == null ? null : aVar2.f();
        Matrix matrix = this.f2542a;
        matrix.reset();
        if (f10 != null) {
            matrix.preTranslate(f10.x * f9, f10.y * f9);
        }
        if (f11 != null) {
            double d9 = (double) f9;
            matrix.preScale((float) Math.pow((double) f11.f5285a, d9), (float) Math.pow((double) f11.f5286b, d9));
        }
        a<Float, Float> aVar3 = this.f2549i;
        if (aVar3 != null) {
            float floatValue = aVar3.f().floatValue();
            a<PointF, PointF> aVar4 = this.f2546f;
            if (aVar4 != null) {
                pointF = aVar4.f();
            }
            float f12 = floatValue * f9;
            float f13 = 0.0f;
            float f14 = pointF == null ? 0.0f : pointF.x;
            if (pointF != null) {
                f13 = pointF.y;
            }
            matrix.preRotate(f12, f14, f13);
        }
        return matrix;
    }
}
