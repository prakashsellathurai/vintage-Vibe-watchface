package y7;

import android.graphics.Color;
import android.graphics.PointF;
import android.util.Log;
import c3.b;
import d3.f;
import d3.g;
import d3.k;
import d8.h;
import f2.c;
import h2.a;
import h7.e;
import i2.e0;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import k3.a;
import p2.d;
import p2.j;
import r2.v;
import y4.l;

public class b0 implements j, d, b, f, k, h, e0 {

    /* renamed from: a  reason: collision with root package name */
    public int f8547a;

    public /* synthetic */ b0(int i8) {
        this.f8547a = i8;
    }

    public static a j(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new a(httpURLConnection);
    }

    public static final String l(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String m(j7.d dVar) {
        String str;
        if (dVar instanceof c8.f) {
            return dVar.toString();
        }
        try {
            str = dVar + '@' + l(dVar);
        } catch (Throwable th) {
            str = a1.a.q(th);
        }
        Throwable a9 = e.a(str);
        String str2 = str;
        if (a9 != null) {
            str2 = dVar.getClass().getName() + '@' + l(dVar);
        }
        return (String) str2;
    }

    public void a(g gVar) {
        gVar.j();
    }

    public void b() {
    }

    public void c(g gVar) {
    }

    public Object d(j2.b bVar, float f9) {
        int i8;
        int i9;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        boolean z8 = bVar.t() == 1;
        if (z8) {
            bVar.a();
        }
        while (bVar.j()) {
            arrayList.add(Float.valueOf((float) bVar.o()));
        }
        if (z8) {
            bVar.d();
        }
        if (this.f8547a == -1) {
            this.f8547a = arrayList.size() / 4;
        }
        int i11 = this.f8547a;
        float[] fArr = new float[i11];
        int[] iArr = new int[i11];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            i8 = this.f8547a * 4;
            if (i12 >= i8) {
                break;
            }
            int i15 = i12 / 4;
            double floatValue = (double) ((Float) arrayList.get(i12)).floatValue();
            int i16 = i12 % 4;
            if (i16 == 0) {
                if (i15 > 0) {
                    float f10 = (float) floatValue;
                    if (fArr[i15 - 1] >= f10) {
                        fArr[i15] = f10 + 0.01f;
                    }
                }
                fArr[i15] = (float) floatValue;
            } else if (i16 == 1) {
                i13 = (int) (floatValue * 255.0d);
            } else if (i16 == 2) {
                i14 = (int) (floatValue * 255.0d);
            } else if (i16 == 3) {
                iArr[i15] = Color.argb(255, i13, i14, (int) (floatValue * 255.0d));
            }
            i12++;
        }
        c cVar = new c(fArr, iArr);
        if (arrayList.size() > i8) {
            int size = (arrayList.size() - i8) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i17 = 0;
            while (i8 < arrayList.size()) {
                if (i8 % 2 == 0) {
                    dArr[i17] = (double) ((Float) arrayList.get(i8)).floatValue();
                } else {
                    dArr2[i17] = (double) ((Float) arrayList.get(i8)).floatValue();
                    i17++;
                }
                i8++;
            }
            while (true) {
                int[] iArr2 = cVar.f4309b;
                if (i10 >= iArr2.length) {
                    break;
                }
                int i18 = iArr2[i10];
                double d9 = (double) cVar.f4308a[i10];
                int i19 = 1;
                while (true) {
                    if (i19 >= size) {
                        i9 = (int) (dArr2[size - 1] * 255.0d);
                        break;
                    }
                    int i20 = i19 - 1;
                    double d10 = dArr[i20];
                    double d11 = dArr[i19];
                    if (d11 >= d9) {
                        PointF pointF = k2.f.f5117a;
                        double max = Math.max(0.0d, Math.min(1.0d, (d9 - d10) / (d11 - d10)));
                        double d12 = dArr2[i20];
                        i9 = (int) ((d12 + (max * (dArr2[i19] - d12))) * 255.0d);
                        break;
                    }
                    i19++;
                }
                iArr2[i10] = Color.argb(i9, Color.red(i18), Color.green(i18), Color.blue(i18));
                i10++;
            }
        }
        return cVar;
    }

    public v e(v vVar, p2.g gVar) {
        byte[] bArr;
        ByteBuffer asReadOnlyBuffer = ((b3.c) vVar.get()).f2565a.f2574a.f2576a.a().asReadOnlyBuffer();
        AtomicReference<byte[]> atomicReference = k3.a.f5123a;
        a.b bVar = (asReadOnlyBuffer.isReadOnly() || !asReadOnlyBuffer.hasArray()) ? null : new a.b(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit());
        if (bVar != null && bVar.f5126a == 0 && bVar.f5127b == bVar.f5128c.length) {
            bArr = asReadOnlyBuffer.array();
        } else {
            ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
            asReadOnlyBuffer2.position(0);
            asReadOnlyBuffer2.get(bArr2);
            bArr = bArr2;
        }
        return new z2.b(bArr);
    }

    public boolean f(Object obj, File file, p2.g gVar) {
        switch (this.f8547a) {
            case 3:
                return i((v) obj, file);
            case 6:
                try {
                    k3.a.b((ByteBuffer) obj, file);
                    return true;
                } catch (IOException unused) {
                    Log.isLoggable("ByteBufferEncoder", 3);
                    return false;
                }
            default:
                return i((v) obj, file);
        }
    }

    public int g() {
        return this.f8547a;
    }

    public p2.c h(p2.g gVar) {
        return p2.c.f6303f;
    }

    public boolean i(v vVar, File file) {
        switch (this.f8547a) {
            case 3:
                try {
                    k3.a.b(((o2.j) vVar.get()).f6041a.f6050a.f6056a.f6023a.asReadOnlyBuffer(), file);
                    return true;
                } catch (IOException e) {
                    if (Log.isLoggable("WebpEncoder", 5)) {
                        Log.w("WebpEncoder", "Failed to encode WebP drawable data", e);
                    }
                    return false;
                }
            default:
                try {
                    k3.a.b(((b3.c) vVar.get()).f2565a.f2574a.f2576a.a().asReadOnlyBuffer(), file);
                    return true;
                } catch (IOException e4) {
                    if (Log.isLoggable("GifEncoder", 5)) {
                        Log.w("GifEncoder", "Failed to encode GIF drawable data", e4);
                    }
                    return false;
                }
        }
    }

    public void k(float f9, float f10, l lVar) {
        throw null;
    }
}
