package m6;

import java.util.Comparator;

public final /* synthetic */ class a implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f5459a;

    public /* synthetic */ a(c cVar) {
        this.f5459a = cVar;
    }

    public final int compare(Object obj, Object obj2) {
        int i8;
        d dVar = (d) obj;
        d dVar2 = (d) obj2;
        c cVar = this.f5459a;
        int i9 = cVar.f5461b;
        double d9 = (double) i9;
        int i10 = cVar.f5462c;
        double d10 = (double) i10;
        double d11 = (double) dVar.f5465c;
        double min = Math.min(d9 / ((double) dVar.f5464b), d10 / d11);
        double d12 = d9 / ((double) dVar2.f5464b);
        double d13 = (double) dVar2.f5465c;
        double min2 = Math.min(d12, d10 / d13);
        int i11 = i9 * i10;
        int i12 = i11 - ((int) (((((double) dVar.f5464b) * min) * min) * d11));
        int i13 = i11 - ((int) (((((double) dVar2.f5464b) * min2) * min2) * d13));
        if (!(i12 == 0 && i13 == 0)) {
            if (i12 != 0) {
                if (i13 == 0) {
                    return 1;
                }
                if (i12 != i13) {
                    return Integer.compare(i12, i13);
                }
            }
            return -1;
        }
        double log = Math.log(min) / Math.log(2.0d);
        double log2 = Math.log(min2) / Math.log(2.0d);
        double abs = Math.abs(log);
        double abs2 = Math.abs(log2);
        if (abs == abs2) {
            if (log >= 0.0d || log2 <= 0.0d) {
                if (log2 < 0.0d && log > 0.0d) {
                    return 1;
                }
                i8 = 0;
            }
            return -1;
        }
        i8 = Double.compare(abs, abs2);
        return i8;
    }
}
