package k2;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.io.Closeable;
import k3.j;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<PathMeasure> f5118a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<Path> f5119b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final ThreadLocal<Path> f5120c = new c();

    /* renamed from: d  reason: collision with root package name */
    public static final ThreadLocal<float[]> f5121d = new d();
    public static final float e = ((float) (Math.sqrt(2.0d) / 2.0d));

    /* renamed from: f  reason: collision with root package name */
    public static float f5122f = -1.0f;

    public class a extends ThreadLocal<PathMeasure> {
        public final Object initialValue() {
            return new PathMeasure();
        }
    }

    public class b extends ThreadLocal<Path> {
        public final Object initialValue() {
            return new Path();
        }
    }

    public class c extends ThreadLocal<Path> {
        public final Object initialValue() {
            return new Path();
        }
    }

    public class d extends ThreadLocal<float[]> {
        public final Object initialValue() {
            return new float[4];
        }
    }

    public static void a(Path path, float f9, float f10, float f11) {
        PathMeasure pathMeasure = f5118a.get();
        Path path2 = f5119b.get();
        Path path3 = f5120c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f9 == 1.0f && f10 == 0.0f) {
            j.s();
        } else if (length < 1.0f || ((double) Math.abs((f10 - f9) - 1.0f)) < 0.01d) {
            j.s();
        } else {
            float f12 = f9 * length;
            float f13 = f10 * length;
            float f14 = f11 * length;
            float min = Math.min(f12, f13) + f14;
            float max = Math.max(f12, f13) + f14;
            if (min >= length && max >= length) {
                min = (float) f.c(min, length);
                max = (float) f.c(max, length);
            }
            if (min < 0.0f) {
                min = (float) f.c(min, length);
            }
            if (max < 0.0f) {
                max = (float) f.c(max, length);
            }
            int i8 = (min > max ? 1 : (min == max ? 0 : -1));
            if (i8 == 0) {
                path.reset();
            } else {
                if (i8 >= 0) {
                    min -= length;
                }
                path2.reset();
                pathMeasure.getSegment(min, max, path2, true);
                if (max > length) {
                    path3.reset();
                    pathMeasure.getSegment(0.0f, max % length, path3, true);
                } else {
                    if (min < 0.0f) {
                        path3.reset();
                        pathMeasure.getSegment(min + length, length, path3, true);
                    }
                    path.set(path2);
                }
                path2.addPath(path3);
                path.set(path2);
            }
            j.s();
        }
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e4) {
                throw e4;
            } catch (Exception unused) {
            }
        }
    }

    public static float c() {
        if (f5122f == -1.0f) {
            f5122f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f5122f;
    }

    public static float d(Matrix matrix) {
        float[] fArr = f5121d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f9 = e;
        fArr[2] = f9;
        fArr[3] = f9;
        matrix.mapPoints(fArr);
        return (float) Math.hypot((double) (fArr[2] - fArr[0]), (double) (fArr[3] - fArr[1]));
    }
}
