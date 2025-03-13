package androidx.wear.protolayout.protobuf;

import androidx.wear.protolayout.protobuf.r;
import java.util.Map;

public final class d1 extends e1<Object, Object> {
    public d1(int i8) {
        super(i8);
    }

    public final void g() {
        if (!this.f2078i) {
            for (int i8 = 0; i8 < d(); i8++) {
                ((r.a) c(i8).getKey()).a();
            }
            for (Map.Entry key : e()) {
                ((r.a) key.getKey()).a();
            }
        }
        super.g();
    }

    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((r.a) obj, obj2);
    }
}
