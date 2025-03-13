package c6;

import android.content.Context;
import android.util.Log;
import d6.c;
import i5.d;
import java.util.ArrayList;
import java.util.Arrays;
import r5.g;
import w5.f;

public final class j extends d {

    /* renamed from: j  reason: collision with root package name */
    public static final double[][] f2740j = {new double[]{-0.4072d, -0.40614d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d}, new double[]{0.17241d, 0.17302d, 1.0d, 0.0d, 1.0d, 0.0d, 0.0d}, new double[]{0.01608d, 0.01614d, 0.0d, 0.0d, 0.0d, 2.0d, 0.0d}, new double[]{0.01039d, 0.01043d, 0.0d, 2.0d, 0.0d, 0.0d, 0.0d}, new double[]{0.00739d, 0.00734d, 1.0d, 0.0d, -1.0d, 1.0d, 0.0d}, new double[]{-0.00514d, -0.00515d, 1.0d, 0.0d, 1.0d, 1.0d, 0.0d}, new double[]{0.00208d, 0.00209d, 2.0d, 0.0d, 2.0d, 0.0d, 0.0d}, new double[]{-0.00111d, -0.00111d, 0.0d, -2.0d, 0.0d, 1.0d, 0.0d}, new double[]{-5.7E-4d, -5.7E-4d, 0.0d, 2.0d, 0.0d, 1.0d, 0.0d}, new double[]{5.6E-4d, 5.6E-4d, 1.0d, 0.0d, 1.0d, 2.0d, 0.0d}, new double[]{-4.2E-4d, -4.2E-4d, 0.0d, 0.0d, 0.0d, 3.0d, 0.0d}, new double[]{4.2E-4d, 4.2E-4d, 1.0d, 2.0d, 1.0d, 0.0d, 0.0d}, new double[]{3.8E-4d, 3.8E-4d, 1.0d, -2.0d, 1.0d, 0.0d, 0.0d}, new double[]{-2.4E-4d, -2.4E-4d, 1.0d, 0.0d, -1.0d, 2.0d, 0.0d}, new double[]{-1.7E-4d, -1.7E-4d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d}, new double[]{-7.0E-5d, -7.0E-5d, 0.0d, 0.0d, 2.0d, 1.0d, 0.0d}, new double[]{4.0E-5d, 4.0E-5d, 0.0d, -2.0d, 0.0d, 2.0d, 0.0d}, new double[]{4.0E-5d, 4.0E-5d, 0.0d, 0.0d, 3.0d, 0.0d, 0.0d}, new double[]{3.0E-5d, 3.0E-5d, 0.0d, -2.0d, 1.0d, 1.0d, 0.0d}, new double[]{3.0E-5d, 3.0E-5d, 0.0d, 2.0d, 0.0d, 2.0d, 0.0d}, new double[]{-3.0E-5d, -3.0E-5d, 0.0d, 2.0d, 1.0d, 1.0d, 0.0d}, new double[]{3.0E-5d, 3.0E-5d, 0.0d, 2.0d, -1.0d, 1.0d, 0.0d}, new double[]{-2.0E-5d, -2.0E-5d, 0.0d, -2.0d, -1.0d, 1.0d, 0.0d}, new double[]{-2.0E-5d, -2.0E-5d, 0.0d, 0.0d, 1.0d, 3.0d, 0.0d}, new double[]{2.0E-5d, 2.0E-5d, 0.0d, 0.0d, 0.0d, 4.0d, 0.0d}};

    /* renamed from: k  reason: collision with root package name */
    public static final double[][] f2741k = {new double[]{-0.62801d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d}, new double[]{0.17172d, 1.0d, 0.0d, 1.0d, 0.0d, 0.0d}, new double[]{-0.01183d, 1.0d, 0.0d, 1.0d, 1.0d, 0.0d}, new double[]{0.00862d, 0.0d, 0.0d, 0.0d, 2.0d, 0.0d}, new double[]{0.00804d, 0.0d, 2.0d, 0.0d, 0.0d, 0.0d}, new double[]{0.00454d, 1.0d, 0.0d, -1.0d, 1.0d, 0.0d}, new double[]{0.00204d, 2.0d, 0.0d, 2.0d, 0.0d, 0.0d}, new double[]{-0.0018d, 0.0d, -2.0d, 0.0d, 1.0d, 0.0d}, new double[]{-7.0E-4d, 0.0d, 2.0d, 0.0d, 1.0d, 0.0d}, new double[]{-4.0E-4d, 0.0d, 0.0d, 0.0d, 3.0d, 0.0d}, new double[]{-3.4E-4d, 1.0d, 0.0d, -1.0d, 2.0d, 0.0d}, new double[]{3.2E-4d, 1.0d, 2.0d, 1.0d, 0.0d, 0.0d}, new double[]{3.2E-4d, 1.0d, -2.0d, 1.0d, 0.0d, 0.0d}, new double[]{-2.8E-4d, 2.0d, 0.0d, 2.0d, 1.0d, 0.0d}, new double[]{2.7E-4d, 1.0d, 0.0d, 1.0d, 2.0d, 0.0d}, new double[]{-1.7E-4d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d}, new double[]{-5.0E-5d, 0.0d, -2.0d, -1.0d, 1.0d, 0.0d}, new double[]{4.0E-5d, 0.0d, 2.0d, 0.0d, 2.0d, 0.0d}, new double[]{-4.0E-5d, 0.0d, 2.0d, 1.0d, 1.0d, 0.0d}, new double[]{4.0E-5d, 0.0d, 0.0d, -2.0d, 1.0d, 0.0d}, new double[]{3.0E-5d, 0.0d, -2.0d, 1.0d, 1.0d, 0.0d}, new double[]{3.0E-5d, 0.0d, 0.0d, 3.0d, 0.0d, 0.0d}, new double[]{2.0E-5d, 0.0d, -2.0d, 0.0d, 2.0d, 0.0d}, new double[]{2.0E-5d, 0.0d, 2.0d, -1.0d, 1.0d, 0.0d}, new double[]{-2.0E-5d, 0.0d, 0.0d, 1.0d, 3.0d, 0.0d}};

    /* renamed from: l  reason: collision with root package name */
    public static final double[][] f2742l = {new double[]{299.77d, 0.107408d, -0.009173d}, new double[]{251.88d, 0.016321d, 0.0d}, new double[]{251.83d, 26.651886d, 0.0d}, new double[]{349.42d, 36.412478d, 0.0d}, new double[]{84.66d, 18.206239d, 0.0d}, new double[]{141.74d, 53.303771d, 0.0d}, new double[]{207.14d, 2.453732d, 0.0d}, new double[]{154.84d, 7.30686d, 0.0d}, new double[]{34.52d, 27.261239d, 0.0d}, new double[]{207.19d, 0.121824d, 0.0d}, new double[]{291.34d, 1.844379d, 0.0d}, new double[]{161.72d, 24.198154d, 0.0d}, new double[]{239.56d, 25.513099d, 0.0d}, new double[]{331.55d, 3.592518d, 0.0d}};

    /* renamed from: m  reason: collision with root package name */
    public static final double[] f2743m = {3.25E-4d, 1.65E-4d, 1.64E-4d, 1.26E-4d, 1.1E-4d, 6.2E-5d, 6.0E-5d, 5.6E-5d, 4.7E-5d, 4.2E-5d, 4.0E-5d, 3.7E-5d, 3.5E-5d, 2.3E-5d};

    /* renamed from: g  reason: collision with root package name */
    public double f2744g;

    /* renamed from: h  reason: collision with root package name */
    public final double[] f2745h;

    /* renamed from: i  reason: collision with root package name */
    public double f2746i = 0.0d;

    public enum a {
        NEW_MOON("New Moon", 0.5d);
        

        /* renamed from: f  reason: collision with root package name */
        public final String f2749f;

        /* renamed from: g  reason: collision with root package name */
        public final double f2750g;

        /* access modifiers changed from: public */
        a(String str, double d9) {
            this.f2749f = str;
            this.f2750g = d9;
        }

        public static a e(double d9) {
            return (a) Arrays.stream(values()).filter(new i(d9)).findFirst().orElse(NEW_MOON);
        }
    }

    public j(Context context, boolean z8, c cVar) {
        super(context, z8, cVar);
        double[] dArr = new double[5];
        this.f2745h = dArr;
        dArr[0] = 0.0d;
        dArr[1] = 0.0d;
        dArr[2] = 0.0d;
        dArr[3] = 0.0d;
        dArr[4] = 0.0d;
    }

    public static double n(double d9, int i8, int i9) {
        double d10;
        double d11;
        double d12;
        double d13;
        double[] dArr;
        double[] dArr2;
        int i10 = i8;
        double floor = Math.floor(d9) + (((double) i9) * 0.25d * ((double) i10));
        double d14 = floor / 1236.85d;
        double d15 = d14 * d14;
        double d16 = d15 * d14;
        double d17 = d16 * d14;
        double d18 = ((((29.530588853d * floor) + 2451550.09765d) + (1.337E-4d * d15)) - (1.5E-7d * d16)) + (7.3E-10d * d17);
        double d19 = (1.0d - (d14 * 0.002516d)) - (7.4E-6d * d15);
        double d20 = ((((390.67050274d * floor) + 160.7108d) - (0.0016341d * d15)) - (2.27E-6d * d16)) + (d17 * 1.1E-8d);
        double d21 = (124.7746d - (1.5637558d * floor)) + (0.0020691d * d15) + (d16 * 2.15E-6d);
        double q8 = q((((29.10535669d * floor) + 2.5534d) - (2.18E-5d * d15)) - (1.1E-7d * d16));
        double q9 = q(((((385.81693528d * floor) + 201.5643d) + (0.0107438d * d15)) + (1.239E-5d * d16)) - (5.8E-8d * d17));
        double q10 = q(d20);
        double q11 = q(d21);
        double d22 = d18;
        if (i10 == 0 || i10 == 2 || i10 == 4) {
            d10 = floor;
            d11 = d15;
            char c9 = 2;
            char c10 = i10 == 2 ? (char) 1 : 0;
            int i11 = 0;
            double d23 = 0.0d;
            while (i11 < 25) {
                double[][] dArr3 = f2740j;
                double d24 = dArr3[i11][c10];
                double d25 = q9;
                int i12 = 0;
                while (true) {
                    dArr = dArr3[i11];
                    if (((double) i12) >= dArr[c9]) {
                        break;
                    }
                    d24 *= d19;
                    i12++;
                    c9 = 2;
                }
                d23 = d12 + (d24 * Math.sin(p(q((dArr[3] * q10) + (dArr[4] * q8) + (dArr[5] * d25) + (dArr[6] * q11)))));
                i11++;
                q9 = d25;
                c9 = 2;
            }
            d13 = 0.0d;
        } else {
            int i13 = 0;
            d12 = 0.0d;
            while (i13 < 25) {
                double[][] dArr4 = f2741k;
                double d26 = dArr4[i13][0];
                double d27 = floor;
                double d28 = d15;
                int i14 = 0;
                while (true) {
                    dArr2 = dArr4[i13];
                    if (((double) i14) >= dArr2[1]) {
                        break;
                    }
                    d26 *= d19;
                    i14++;
                }
                d12 += d26 * Math.sin(p(q((dArr2[2] * q10) + (dArr2[3] * q8) + (dArr2[4] * q9) + (dArr2[5] * q11))));
                i13++;
                d15 = d28;
                floor = d27;
            }
            d10 = floor;
            d11 = d15;
            d13 = (((0.00306d - ((d19 * 3.8E-4d) * Math.cos(p(q8)))) + (Math.cos(p(q9)) * 2.6E-4d)) - (Math.cos(p(q9 - q8)) * 2.0E-5d)) + (Math.cos(p(q9 + q8)) * 2.0E-5d) + (Math.cos(p(q10 * 2.0d)) * 2.0E-5d);
            if (i10 == 3) {
                d13 *= -1.0d;
            }
        }
        double d29 = 0.0d;
        for (int i15 = 0; i15 < 14; i15++) {
            double[] dArr5 = f2742l[i15];
            double d30 = dArr5[0] + 0.0d + (dArr5[1] * d10);
            if (i15 == 0) {
                d30 += dArr5[2] * d11;
            }
            d29 += Math.sin(p(q(d30))) * f2743m[i15];
        }
        double d31 = (((((d22 + d12) + d13) + d29) - 2440587.5d) * 86400.0d) - 48.0d;
        return d31 - ((double) ((int) (d31 / 1.0E8d)));
    }

    public static double o(int i8) {
        if (i8 < 0) {
            i8 = a.values().length - 1;
        }
        return ((a) Arrays.stream(a.values()).filter(new d(i8, 1)).findFirst().orElse(a.NEW_MOON)).f2750g;
    }

    public static double p(double d9) {
        return (d9 * 3.141592653589793d) / 180.0d;
    }

    public static double q(double d9) {
        double d10 = d9 % 360.0d;
        return d9 >= 0.0d ? d10 : d10 + 360.0d;
    }

    public final void b(w5.d dVar, f fVar) {
        w5.d dVar2;
        ArrayList arrayList = new ArrayList();
        switch (dVar.ordinal()) {
            case EXERCISE_TYPE_SQUASH_VALUE:
                this.f2746i = Double.parseDouble(fVar.h());
                dVar2 = w5.d.u0;
                break;
            case EXERCISE_TYPE_SQUAT_VALUE:
                this.f2746i = o(Integer.parseInt(fVar.h()) - 1);
                dVar2 = w5.d.f8053v0;
                break;
            case EXERCISE_TYPE_STAIR_CLIMBING_VALUE:
                this.f2746i = o(((a) Arrays.stream(a.values()).filter(new g(3, fVar.h())).findFirst().orElse(a.NEW_MOON)).ordinal() - 1);
                dVar2 = w5.d.f8054w0;
                break;
            default:
                return;
        }
        arrayList.add(dVar2);
        this.f2717b.a(arrayList);
    }

    public final w5.d d() {
        return w5.d.f8050t0;
    }

    public final f e(w5.d dVar) {
        switch (dVar.ordinal()) {
            case EXERCISE_TYPE_SQUASH_VALUE:
                return new f(this.f2746i);
            case EXERCISE_TYPE_SQUAT_VALUE:
                return new f(a.e(this.f2746i).ordinal());
            case EXERCISE_TYPE_STAIR_CLIMBING_VALUE:
                return new f(a.e(this.f2746i).f2749f);
            default:
                return null;
        }
    }

    public final boolean f(w5.d dVar) {
        return g();
    }

    public final void i(w5.d dVar) {
        Log.i("DWF:ModelMoonPhase", "onConnected");
    }

    public final void j(w5.d dVar) {
        Log.i("DWF:ModelMoonPhase", "onDisconnected");
    }

    public final void k() {
    }

    public final void l() {
    }

    public final w5.d m() {
        return w5.d.f8056x0;
    }
}
