package i7;

import java.util.Iterator;
import q7.a;
import q7.k;
import v7.d;

public final class e implements d<Float> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ float[] f4877a;

    public e(float[] fArr) {
        this.f4877a = fArr;
    }

    public final Iterator<Float> iterator() {
        float[] fArr = this.f4877a;
        k.e(fArr, "array");
        return new a(fArr);
    }
}
