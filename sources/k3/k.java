package k3;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Set;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f5169a = "0123456789abcdef".toCharArray();

    /* renamed from: b  reason: collision with root package name */
    public static final char[] f5170b = new char[64];

    /* renamed from: c  reason: collision with root package name */
    public static volatile Handler f5171c;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5172a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5172a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5172a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5172a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f5172a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f5172a     // Catch:{ NoSuchFieldError -> 0x003e }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: k3.k.a.<clinit>():void");
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int b(int i8, int i9, Bitmap.Config config) {
        int i10 = i8 * i9;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i11 = a.f5172a[config.ordinal()];
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (!(i11 == 2 || i11 == 3)) {
                i12 = 4;
                if (i11 == 4) {
                    i12 = 8;
                }
            }
        }
        return i10 * i12;
    }

    @TargetApi(19)
    public static int c(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        } else {
            throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
        }
    }

    public static ArrayList d(Set set) {
        ArrayList arrayList = new ArrayList(set.size());
        for (Object next : set) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static Handler e() {
        if (f5171c == null) {
            synchronized (k.class) {
                if (f5171c == null) {
                    f5171c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f5171c;
    }

    public static int f(int i8, Object obj) {
        return (i8 * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public static boolean g(int i8, int i9) {
        if (!(i8 > 0 || i8 == Integer.MIN_VALUE)) {
            return false;
        }
        return i9 > 0 || i9 == Integer.MIN_VALUE;
    }
}
