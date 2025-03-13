package androidx.health.services.client.data;

import androidx.health.services.client.proto.DataProto;
import com.google.protobuf.y;
import i7.f;
import java.util.ArrayList;
import java.util.Set;
import q7.k;

public final class WarmUpConfig {
    private final Set<DeltaDataType<?, ?>> dataTypes;
    private final ExerciseType exerciseType;
    private final DataProto.WarmUpConfig proto;

    public WarmUpConfig(ExerciseType exerciseType2, Set<? extends DeltaDataType<?, ?>> set) {
        k.e(exerciseType2, "exerciseType");
        k.e(set, "dataTypes");
        this.exerciseType = exerciseType2;
        this.dataTypes = set;
        if (!set.isEmpty()) {
            DataProto.WarmUpConfig.Builder exerciseType3 = DataProto.WarmUpConfig.newBuilder().setExerciseType(exerciseType2.toProto());
            ArrayList arrayList = new ArrayList(f.M(set));
            for (DeltaDataType proto$health_services_client_release : set) {
                arrayList.add(proto$health_services_client_release.getProto$health_services_client_release());
            }
            y build = exerciseType3.addAllDataTypes(arrayList).build();
            k.d(build, "newBuilder()\n           …o })\n            .build()");
            this.proto = (DataProto.WarmUpConfig) build;
            return;
        }
        throw new IllegalArgumentException("Must specify the desired data types.".toString());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public WarmUpConfig(androidx.health.services.client.proto.DataProto.WarmUpConfig r6) {
        /*
            r5 = this;
            java.lang.String r0 = "proto"
            q7.k.e(r6, r0)
            androidx.health.services.client.data.ExerciseType$Companion r0 = androidx.health.services.client.data.ExerciseType.Companion
            androidx.health.services.client.proto.DataProto$ExerciseType r1 = r6.getExerciseType()
            java.lang.String r2 = "proto.exerciseType"
            q7.k.d(r1, r2)
            androidx.health.services.client.data.ExerciseType r0 = r0.fromProto(r1)
            java.util.List r6 = r6.getDataTypesList()
            java.lang.String r1 = "proto.dataTypesList"
            q7.k.d(r6, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = i7.f.M(r6)
            r1.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
        L_0x002a:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0045
            java.lang.Object r2 = r6.next()
            androidx.health.services.client.proto.DataProto$DataType r2 = (androidx.health.services.client.proto.DataProto.DataType) r2
            androidx.health.services.client.data.DataType$Companion r3 = androidx.health.services.client.data.DataType.Companion
            java.lang.String r4 = "it"
            q7.k.d(r2, r4)
            androidx.health.services.client.data.DeltaDataType r2 = r3.deltaFromProto$health_services_client_release(r2)
            r1.add(r2)
            goto L_0x002a
        L_0x0045:
            java.util.Set r6 = i7.i.d0(r1)
            r5.<init>(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.services.client.data.WarmUpConfig.<init>(androidx.health.services.client.proto.DataProto$WarmUpConfig):void");
    }

    public final Set<DeltaDataType<?, ?>> getDataTypes() {
        return this.dataTypes;
    }

    public final ExerciseType getExerciseType() {
        return this.exerciseType;
    }

    public final DataProto.WarmUpConfig getProto$health_services_client_release() {
        return this.proto;
    }

    public String toString() {
        return "WarmUpConfig(exerciseType=" + this.exerciseType + ", dataTypes=" + this.dataTypes + ')';
    }
}
