package androidx.lifecycle;

import androidx.lifecycle.m;
import q7.k;

public final class DefaultLifecycleObserverAdapter implements p {

    /* renamed from: f  reason: collision with root package name */
    public final h f1397f;

    /* renamed from: g  reason: collision with root package name */
    public final p f1398g;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1399a;

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
                androidx.lifecycle.m$a r1 = androidx.lifecycle.m.a.ON_START     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.lifecycle.m$a r1 = androidx.lifecycle.m.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.lifecycle.m$a r1 = androidx.lifecycle.m.a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.lifecycle.m$a r1 = androidx.lifecycle.m.a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0034 }
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
                f1399a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.DefaultLifecycleObserverAdapter.a.<clinit>():void");
        }
    }

    public DefaultLifecycleObserverAdapter(h hVar, p pVar) {
        k.e(hVar, "defaultLifecycleObserver");
        this.f1397f = hVar;
        this.f1398g = pVar;
    }

    public final void c(r rVar, m.a aVar) {
        int i8 = a.f1399a[aVar.ordinal()];
        h hVar = this.f1397f;
        switch (i8) {
            case 1:
                hVar.b(rVar);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                hVar.getClass();
                break;
            case 6:
                hVar.a(rVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        p pVar = this.f1398g;
        if (pVar != null) {
            pVar.c(rVar, aVar);
        }
    }
}
