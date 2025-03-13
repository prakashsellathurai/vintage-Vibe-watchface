package com.google.protobuf;

import com.google.protobuf.u;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class h1 extends i1<Object, Object> {
    public h1(int i8) {
        super(i8);
    }

    public final void g() {
        if (!this.f3661i) {
            for (int i8 = 0; i8 < d(); i8++) {
                Map.Entry c9 = c(i8);
                if (((u.a) c9.getKey()).a()) {
                    c9.setValue(Collections.unmodifiableList((List) c9.getValue()));
                }
            }
            for (Map.Entry entry : e()) {
                if (((u.a) entry.getKey()).a()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.g();
    }

    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((u.a) obj, obj2);
    }
}
