package androidx.wear.protolayout.protobuf;

import androidx.wear.protolayout.protobuf.g;
import androidx.wear.protolayout.protobuf.v;

public interface o0 extends p0 {

    public interface a extends p0, Cloneable {
    }

    void a(j jVar);

    int getSerializedSize();

    v.a newBuilderForType();

    v.a toBuilder();

    g.f toByteString();
}
