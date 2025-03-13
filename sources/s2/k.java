package s2;

import android.graphics.Bitmap;
import e2.f;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public final class k implements i {

    /* renamed from: d  reason: collision with root package name */
    public static final Bitmap.Config[] f7195d;
    public static final Bitmap.Config[] e;

    /* renamed from: f  reason: collision with root package name */
    public static final Bitmap.Config[] f7196f = {Bitmap.Config.RGB_565};

    /* renamed from: g  reason: collision with root package name */
    public static final Bitmap.Config[] f7197g = {Bitmap.Config.ARGB_4444};

    /* renamed from: h  reason: collision with root package name */
    public static final Bitmap.Config[] f7198h = {Bitmap.Config.ALPHA_8};

    /* renamed from: a  reason: collision with root package name */
    public final c f7199a = new c();

    /* renamed from: b  reason: collision with root package name */
    public final f<b, Bitmap> f7200b = new f<>();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f7201c = new HashMap();

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7202a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7202a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7202a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f7202a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f7202a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: s2.k.a.<clinit>():void");
        }
    }

    public static final class b implements j {

        /* renamed from: a  reason: collision with root package name */
        public final c f7203a;

        /* renamed from: b  reason: collision with root package name */
        public int f7204b;

        /* renamed from: c  reason: collision with root package name */
        public Bitmap.Config f7205c;

        public b(c cVar) {
            this.f7203a = cVar;
        }

        public final void a() {
            this.f7203a.f(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f7204b == bVar.f7204b && k3.k.a(this.f7205c, bVar.f7205c);
        }

        public final int hashCode() {
            int i8 = this.f7204b * 31;
            Bitmap.Config config = this.f7205c;
            return i8 + (config != null ? config.hashCode() : 0);
        }

        public final String toString() {
            return k.c(this.f7204b, this.f7205c);
        }
    }

    public static class c extends f {
        public final j d() {
            return new b(this);
        }
    }

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        f7195d = configArr;
        e = configArr;
    }

    public static String c(int i8, Bitmap.Config config) {
        return "[" + i8 + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> d9 = d(bitmap.getConfig());
        Integer num2 = d9.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(bitmap) + ", this: " + this);
        } else if (num2.intValue() == 1) {
            d9.remove(num);
        } else {
            d9.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [s2.j] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap b(int r11, int r12, android.graphics.Bitmap.Config r13) {
        /*
            r10 = this;
            int r0 = k3.k.b(r11, r12, r13)
            s2.k$c r1 = r10.f7199a
            s2.j r2 = r1.e()
            s2.k$b r2 = (s2.k.b) r2
            r2.f7204b = r0
            r2.f7205c = r13
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.RGBA_F16
            boolean r3 = r3.equals(r13)
            r4 = 0
            if (r3 == 0) goto L_0x001c
            android.graphics.Bitmap$Config[] r3 = e
            goto L_0x0040
        L_0x001c:
            int[] r3 = s2.k.a.f7202a
            int r5 = r13.ordinal()
            r3 = r3[r5]
            r5 = 1
            if (r3 == r5) goto L_0x003e
            r6 = 2
            if (r3 == r6) goto L_0x003b
            r6 = 3
            if (r3 == r6) goto L_0x0038
            r6 = 4
            if (r3 == r6) goto L_0x0035
            android.graphics.Bitmap$Config[] r3 = new android.graphics.Bitmap.Config[r5]
            r3[r4] = r13
            goto L_0x0040
        L_0x0035:
            android.graphics.Bitmap$Config[] r3 = f7198h
            goto L_0x0040
        L_0x0038:
            android.graphics.Bitmap$Config[] r3 = f7197g
            goto L_0x0040
        L_0x003b:
            android.graphics.Bitmap$Config[] r3 = f7196f
            goto L_0x0040
        L_0x003e:
            android.graphics.Bitmap$Config[] r3 = f7195d
        L_0x0040:
            int r5 = r3.length
        L_0x0041:
            if (r4 >= r5) goto L_0x0084
            r6 = r3[r4]
            java.util.NavigableMap r7 = r10.d(r6)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            java.lang.Object r7 = r7.ceilingKey(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L_0x0081
            int r8 = r7.intValue()
            int r9 = r0 * 8
            if (r8 > r9) goto L_0x0081
            int r3 = r7.intValue()
            if (r3 != r0) goto L_0x006e
            if (r6 != 0) goto L_0x0068
            if (r13 == 0) goto L_0x0084
            goto L_0x006e
        L_0x0068:
            boolean r0 = r6.equals(r13)
            if (r0 != 0) goto L_0x0084
        L_0x006e:
            r1.f(r2)
            int r0 = r7.intValue()
            s2.j r1 = r1.e()
            r2 = r1
            s2.k$b r2 = (s2.k.b) r2
            r2.f7204b = r0
            r2.f7205c = r6
            goto L_0x0084
        L_0x0081:
            int r4 = r4 + 1
            goto L_0x0041
        L_0x0084:
            s2.f<s2.k$b, android.graphics.Bitmap> r0 = r10.f7200b
            java.lang.Object r0 = r0.a(r2)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto L_0x009a
            int r1 = r2.f7204b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.a(r1, r0)
            r0.reconfigure(r11, r12, r13)
        L_0x009a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.k.b(int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    public final NavigableMap<Integer, Integer> d(Bitmap.Config config) {
        HashMap hashMap = this.f7201c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) hashMap.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        hashMap.put(config, treeMap);
        return treeMap;
    }

    public final String e(Bitmap bitmap) {
        return c(k3.k.c(bitmap), bitmap.getConfig());
    }

    public final void f(Bitmap bitmap) {
        int c9 = k3.k.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        b bVar = (b) this.f7199a.e();
        bVar.f7204b = c9;
        bVar.f7205c = config;
        this.f7200b.b(bVar, bitmap);
        NavigableMap<Integer, Integer> d9 = d(bitmap.getConfig());
        Integer num = d9.get(Integer.valueOf(bVar.f7204b));
        Integer valueOf = Integer.valueOf(bVar.f7204b);
        int i8 = 1;
        if (num != null) {
            i8 = 1 + num.intValue();
        }
        d9.put(valueOf, Integer.valueOf(i8));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f7200b);
        sb.append(", sortedSizes=(");
        HashMap hashMap = this.f7201c;
        for (Map.Entry entry : hashMap.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!hashMap.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
