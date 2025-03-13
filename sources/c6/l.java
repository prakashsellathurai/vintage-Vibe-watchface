package c6;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.SystemClock;
import android.util.Log;
import d6.c;
import java.util.ArrayList;
import java.util.Arrays;
import w5.d;
import w5.f;

public final class l extends d implements SensorEventListener {

    /* renamed from: g  reason: collision with root package name */
    public final SensorManager f2754g;

    /* renamed from: h  reason: collision with root package name */
    public final Sensor f2755h;

    /* renamed from: i  reason: collision with root package name */
    public final float[] f2756i = new float[3];

    /* renamed from: j  reason: collision with root package name */
    public boolean f2757j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2758k;

    /* renamed from: l  reason: collision with root package name */
    public float f2759l;

    /* renamed from: m  reason: collision with root package name */
    public float f2760m;

    /* renamed from: n  reason: collision with root package name */
    public float f2761n;

    /* renamed from: o  reason: collision with root package name */
    public float f2762o;

    /* renamed from: p  reason: collision with root package name */
    public float f2763p;

    /* renamed from: q  reason: collision with root package name */
    public float f2764q;
    public float r;

    /* renamed from: s  reason: collision with root package name */
    public long f2765s;

    public l(Context context, boolean z8, c cVar) {
        super(context, z8, cVar);
        boolean z9 = false;
        this.f2757j = false;
        SensorManager sensorManager = (SensorManager) this.f2716a.getSystemService("sensor");
        this.f2754g = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        this.f2755h = defaultSensor;
        this.f2758k = defaultSensor != null ? true : z9;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(w5.d r2, w5.f r3) {
        /*
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r2 = r2.ordinal()
            switch(r2) {
                case 71: goto L_0x0068;
                case 72: goto L_0x005b;
                case 73: goto L_0x004e;
                case 74: goto L_0x0041;
                case 75: goto L_0x0034;
                case 76: goto L_0x0027;
                case 77: goto L_0x001a;
                case 78: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0077
        L_0x000d:
            java.lang.String r2 = r3.h()
            float r2 = java.lang.Float.parseFloat(r2)
            r1.r = r2
            w5.d r2 = w5.d.G0
            goto L_0x0074
        L_0x001a:
            java.lang.String r2 = r3.h()
            float r2 = java.lang.Float.parseFloat(r2)
            r1.f2764q = r2
            w5.d r2 = w5.d.F0
            goto L_0x0074
        L_0x0027:
            java.lang.String r2 = r3.h()
            float r2 = java.lang.Float.parseFloat(r2)
            r1.f2763p = r2
            w5.d r2 = w5.d.E0
            goto L_0x0074
        L_0x0034:
            java.lang.String r2 = r3.h()
            float r2 = java.lang.Float.parseFloat(r2)
            r1.f2762o = r2
            w5.d r2 = w5.d.D0
            goto L_0x0074
        L_0x0041:
            java.lang.String r2 = r3.h()
            float r2 = java.lang.Float.parseFloat(r2)
            r1.f2761n = r2
            w5.d r2 = w5.d.C0
            goto L_0x0074
        L_0x004e:
            java.lang.String r2 = r3.h()
            float r2 = java.lang.Float.parseFloat(r2)
            r1.f2760m = r2
            w5.d r2 = w5.d.B0
            goto L_0x0074
        L_0x005b:
            java.lang.String r2 = r3.h()
            float r2 = java.lang.Float.parseFloat(r2)
            r1.f2759l = r2
            w5.d r2 = w5.d.A0
            goto L_0x0074
        L_0x0068:
            java.lang.String r2 = r3.h()
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            r1.f2758k = r2
            w5.d r2 = w5.d.f8058z0
        L_0x0074:
            r0.add(r2)
        L_0x0077:
            int r2 = r0.size()
            if (r2 <= 0) goto L_0x0082
            c6.c r1 = r1.f2717b
            r1.a(r0)
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.l.b(w5.d, w5.f):void");
    }

    public final void c() {
        this.f2754g.unregisterListener(this);
    }

    public final d d() {
        return d.y0;
    }

    public final f e(d dVar) {
        switch (dVar.ordinal()) {
            case EXERCISE_TYPE_STRETCHING_VALUE:
                return new f(this.f2758k);
            case EXERCISE_TYPE_SURFING_VALUE:
                return new f(this.f2759l);
            case EXERCISE_TYPE_SWIMMING_OPEN_WATER_VALUE:
                return new f(this.f2760m);
            case EXERCISE_TYPE_SWIMMING_POOL_VALUE:
                return new f(this.f2761n);
            case EXERCISE_TYPE_TABLE_TENNIS_VALUE:
                return new f(this.f2762o);
            case EXERCISE_TYPE_TENNIS_VALUE:
                return new f(this.f2763p);
            case EXERCISE_TYPE_UPPER_TWIST_VALUE:
                return new f(this.f2764q);
            case EXERCISE_TYPE_VOLLEYBALL_VALUE:
                return new f(this.r);
            default:
                return null;
        }
    }

    public final boolean f(d dVar) {
        return g();
    }

    public final void h(boolean z8) {
        if (!this.f2757j) {
            return;
        }
        if (z8) {
            Sensor sensor = this.f2755h;
            if (sensor != null) {
                this.f2754g.unregisterListener(this, sensor);
            } else {
                Log.w("DWF:ModelSensor", "unregisterListener: mAccelerometer is null");
            }
        } else {
            n();
        }
    }

    public final void i(d dVar) {
        Log.i("DWF:ModelSensor", "onConnected: " + dVar);
        this.f2757j = true;
        n();
    }

    public final void j(d dVar) {
        Log.i("DWF:ModelSensor", "onDisconnected: " + dVar);
        this.f2757j = false;
        Sensor sensor = this.f2755h;
        if (sensor != null) {
            this.f2754g.unregisterListener(this, sensor);
        } else {
            Log.w("DWF:ModelSensor", "unregisterListener: mAccelerometer is null");
        }
    }

    public final void k() {
        this.f2754g.unregisterListener(this);
    }

    public final void l() {
        if (g() && !this.e) {
            n();
        }
    }

    public final d m() {
        return d.H0;
    }

    public final void n() {
        Sensor sensor = this.f2755h;
        if (sensor != null) {
            this.f2754g.registerListener(this, sensor, 2);
        } else {
            Log.w("DWF:ModelSensor", "registerListener: mAccelerometer is null");
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i8) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (sensorEvent.sensor.getType() == 1) {
            float[] fArr = sensorEvent.values;
            float[] fArr2 = this.f2756i;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            if (!this.f2757j) {
                return;
            }
            if (Math.abs(this.f2759l - sensorEvent.values[0]) >= 0.3f || Math.abs(this.f2760m - sensorEvent.values[1]) >= 0.3f || Math.abs(this.f2761n - sensorEvent.values[2]) >= 0.3f) {
                float[] fArr3 = sensorEvent.values;
                float f9 = fArr3[0];
                this.f2759l = f9;
                float f10 = fArr3[1];
                this.f2760m = f10;
                float f11 = fArr3[2];
                this.f2761n = f11;
                float f12 = (-f9) * 9.0f;
                this.f2762o = f12;
                float f13 = f10 * 9.0f;
                this.f2763p = f13;
                float f14 = f11 * 9.0f;
                this.f2764q = f14;
                if (f12 < -90.0f) {
                    f12 = -90.0f;
                } else if (f12 > 90.0f) {
                    f12 = 90.0f;
                }
                this.f2762o = f12;
                if (f13 < -90.0f) {
                    f13 = -90.0f;
                } else if (f13 > 90.0f) {
                    f13 = 90.0f;
                }
                this.f2763p = f13;
                if (f14 < -90.0f) {
                    f14 = -90.0f;
                } else if (f14 > 90.0f) {
                    f14 = 90.0f;
                }
                this.f2764q = f14;
                this.r = f12 + f13;
                if (elapsedRealtime - this.f2765s >= 100) {
                    this.f2765s = elapsedRealtime;
                    this.f2717b.a(new ArrayList(Arrays.asList(new d[]{d.A0, d.B0, d.C0, d.D0, d.E0, d.F0, d.G0})));
                }
            }
        }
    }
}
