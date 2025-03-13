package i7;

import java.util.Iterator;
import q7.b;
import q7.k;

public final class d implements v7.d<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int[] f4876a;

    public d(int[] iArr) {
        this.f4876a = iArr;
    }

    public final Iterator<Integer> iterator() {
        int[] iArr = this.f4876a;
        k.e(iArr, "array");
        return new b(iArr);
    }
}
