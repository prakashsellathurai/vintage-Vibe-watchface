package com.google.protobuf;

public interface r0 extends s0 {

    public interface a extends s0, Cloneable {
        r0 build();

        r0 buildPartial();

        a mergeFrom(r0 r0Var);
    }

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();

    byte[] toByteArray();

    i toByteString();

    void writeTo(l lVar);
}
