package u;

import java.util.ArrayList;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final p f7584a = null;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<p> f7585b = new ArrayList<>();

    public m(p pVar) {
        this.f7584a = pVar;
    }

    public static long a(f fVar, long j8) {
        p pVar = fVar.f7573d;
        if (pVar instanceof k) {
            return j8;
        }
        ArrayList arrayList = fVar.f7579k;
        int size = arrayList.size();
        long j9 = j8;
        for (int i8 = 0; i8 < size; i8++) {
            d dVar = (d) arrayList.get(i8);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f7573d != pVar) {
                    j9 = Math.min(j9, a(fVar2, ((long) fVar2.f7574f) + j8));
                }
            }
        }
        if (fVar != pVar.f7600i) {
            return j9;
        }
        long j10 = pVar.j();
        f fVar3 = pVar.f7599h;
        long j11 = j8 - j10;
        return Math.min(Math.min(j9, a(fVar3, j11)), j11 - ((long) fVar3.f7574f));
    }

    public static long b(f fVar, long j8) {
        p pVar = fVar.f7573d;
        if (pVar instanceof k) {
            return j8;
        }
        ArrayList arrayList = fVar.f7579k;
        int size = arrayList.size();
        long j9 = j8;
        for (int i8 = 0; i8 < size; i8++) {
            d dVar = (d) arrayList.get(i8);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f7573d != pVar) {
                    j9 = Math.max(j9, b(fVar2, ((long) fVar2.f7574f) + j8));
                }
            }
        }
        if (fVar != pVar.f7599h) {
            return j9;
        }
        long j10 = pVar.j();
        f fVar3 = pVar.f7600i;
        long j11 = j8 + j10;
        return Math.max(Math.max(j9, b(fVar3, j11)), j11 - ((long) fVar3.f7574f));
    }
}
