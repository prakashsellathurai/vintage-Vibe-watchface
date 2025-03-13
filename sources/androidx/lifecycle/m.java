package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
import q7.k;

public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<Object> f1489a = new AtomicReference<>();

    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;
        
        public static final C0012a Companion = null;

        /* renamed from: androidx.lifecycle.m$a$a  reason: collision with other inner class name */
        public static final class C0012a {
            public static a a(b bVar) {
                k.e(bVar, "state");
                int ordinal = bVar.ordinal();
                if (ordinal == 1) {
                    return a.ON_CREATE;
                }
                if (ordinal == 2) {
                    return a.ON_START;
                }
                if (ordinal != 3) {
                    return null;
                }
                return a.ON_RESUME;
            }
        }

        public /* synthetic */ class b {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f1490a = null;

            /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    androidx.lifecycle.m$a[] r0 = androidx.lifecycle.m.a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.lifecycle.m$a r1 = androidx.lifecycle.m.a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    androidx.lifecycle.m$a r1 = androidx.lifecycle.m.a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    androidx.lifecycle.m$a r1 = androidx.lifecycle.m.a.ON_START     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    androidx.lifecycle.m$a r1 = androidx.lifecycle.m.a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    androidx.lifecycle.m$a r1 = androidx.lifecycle.m.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    androidx.lifecycle.m$a r1 = androidx.lifecycle.m.a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    androidx.lifecycle.m$a r1 = androidx.lifecycle.m.a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0046 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                    r2 = 7
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
                L_0x0046:
                    f1490a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.m.a.b.<clinit>():void");
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new C0012a();
        }

        /* access modifiers changed from: public */
        a() {
        }

        public final b e() {
            switch (b.f1490a[ordinal()]) {
                case 1:
                case 2:
                    return b.f1493h;
                case 3:
                case 4:
                    return b.f1494i;
                case 5:
                    return b.f1495j;
                case 6:
                    return b.f1491f;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    public enum b {
        f1491f,
        f1492g,
        f1493h,
        f1494i,
        f1495j;

        /* access modifiers changed from: public */
        b() {
        }

        public final boolean e(b bVar) {
            return compareTo(bVar) >= 0;
        }
    }

    public abstract void a(q qVar);

    public abstract void b(q qVar);
}
