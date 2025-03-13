package androidx.health.services.client.data;

import androidx.health.services.client.proto.DataProto;
import com.google.protobuf.y;
import i7.f;
import java.util.ArrayList;
import java.util.Set;
import q7.k;

public final class MeasureCapabilities {
    private final DataProto.MeasureCapabilities proto;
    private final Set<DeltaDataType<?, ?>> supportedDataTypesMeasure;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MeasureCapabilities(androidx.health.services.client.proto.DataProto.MeasureCapabilities r5) {
        /*
            r4 = this;
            java.lang.String r0 = "proto"
            q7.k.e(r5, r0)
            java.util.List r5 = r5.getSupportedDataTypesList()
            java.lang.String r0 = "proto.supportedDataTypesList"
            q7.k.d(r5, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = i7.f.M(r5)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L_0x001b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0036
            java.lang.Object r1 = r5.next()
            androidx.health.services.client.proto.DataProto$DataType r1 = (androidx.health.services.client.proto.DataProto.DataType) r1
            androidx.health.services.client.data.DataType$Companion r2 = androidx.health.services.client.data.DataType.Companion
            java.lang.String r3 = "it"
            q7.k.d(r1, r3)
            androidx.health.services.client.data.DeltaDataType r1 = r2.deltaFromProto$health_services_client_release(r1)
            r0.add(r1)
            goto L_0x001b
        L_0x0036:
            java.util.Set r5 = i7.i.d0(r0)
            r4.<init>((java.util.Set<? extends androidx.health.services.client.data.DeltaDataType<?, ?>>) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.services.client.data.MeasureCapabilities.<init>(androidx.health.services.client.proto.DataProto$MeasureCapabilities):void");
    }

    public MeasureCapabilities(Set<? extends DeltaDataType<?, ?>> set) {
        k.e(set, "supportedDataTypesMeasure");
        this.supportedDataTypesMeasure = set;
        DataProto.MeasureCapabilities.Builder newBuilder = DataProto.MeasureCapabilities.newBuilder();
        ArrayList arrayList = new ArrayList(f.M(set));
        for (DeltaDataType proto$health_services_client_release : set) {
            arrayList.add(proto$health_services_client_release.getProto$health_services_client_release());
        }
        y build = newBuilder.addAllSupportedDataTypes(arrayList).build();
        k.d(build, "newBuilder()\n           …o })\n            .build()");
        this.proto = (DataProto.MeasureCapabilities) build;
    }

    public final DataProto.MeasureCapabilities getProto$health_services_client_release() {
        return this.proto;
    }

    public final Set<DeltaDataType<?, ?>> getSupportedDataTypesMeasure() {
        return this.supportedDataTypesMeasure;
    }

    public String toString() {
        return "MeasureCapabilities(supportedDataTypesMeasure=" + this.supportedDataTypesMeasure + ')';
    }
}
