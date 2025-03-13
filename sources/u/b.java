package u;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import t.d;
import t.e;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<d> f7549a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final a f7550b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final e f7551c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f7552a;

        /* renamed from: b  reason: collision with root package name */
        public int f7553b;

        /* renamed from: c  reason: collision with root package name */
        public int f7554c;

        /* renamed from: d  reason: collision with root package name */
        public int f7555d;
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public int f7556f;

        /* renamed from: g  reason: collision with root package name */
        public int f7557g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f7558h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f7559i;

        /* renamed from: j  reason: collision with root package name */
        public int f7560j;
    }

    /* renamed from: u.b$b  reason: collision with other inner class name */
    public interface C0126b {
    }

    public b(e eVar) {
        this.f7551c = eVar;
    }

    public final boolean a(C0126b bVar, d dVar, int i8) {
        int[] iArr = dVar.P;
        int i9 = iArr[0];
        a aVar = this.f7550b;
        aVar.f7552a = i9;
        boolean z8 = true;
        aVar.f7553b = iArr[1];
        aVar.f7554c = dVar.k();
        aVar.f7555d = dVar.i();
        aVar.f7559i = false;
        aVar.f7560j = i8;
        boolean z9 = aVar.f7552a == 3;
        boolean z10 = aVar.f7553b == 3;
        boolean z11 = z9 && dVar.T > 0.0f;
        boolean z12 = z10 && dVar.T > 0.0f;
        int[] iArr2 = dVar.f7343o;
        if (z11 && iArr2[0] == 4) {
            aVar.f7552a = 1;
        }
        if (z12 && iArr2[1] == 4) {
            aVar.f7553b = 1;
        }
        ((ConstraintLayout.b) bVar).b(dVar, aVar);
        dVar.C(aVar.e);
        dVar.z(aVar.f7556f);
        dVar.f7351z = aVar.f7558h;
        int i10 = aVar.f7557g;
        dVar.X = i10;
        if (i10 <= 0) {
            z8 = false;
        }
        dVar.f7351z = z8;
        aVar.f7560j = 0;
        return aVar.f7559i;
    }

    public final void b(e eVar, int i8, int i9) {
        int i10 = eVar.Y;
        int i11 = eVar.Z;
        eVar.Y = 0;
        eVar.Z = 0;
        eVar.C(i8);
        eVar.z(i9);
        if (i10 < 0) {
            i10 = 0;
        }
        eVar.Y = i10;
        if (i11 < 0) {
            i11 = 0;
        }
        eVar.Z = i11;
        this.f7551c.F();
    }

    public final void c(e eVar) {
        ArrayList<d> arrayList = this.f7549a;
        arrayList.clear();
        int size = eVar.f7370m0.size();
        for (int i8 = 0; i8 < size; i8++) {
            d dVar = eVar.f7370m0.get(i8);
            int[] iArr = dVar.P;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(dVar);
            }
        }
        eVar.f7353o0.f7564b = true;
    }
}
