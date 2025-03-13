package androidx.health.services.client.data;

import androidx.health.services.client.proto.DataProto;
import com.google.protobuf.y;
import i7.f;
import i7.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import q7.k;

public final class ExerciseCapabilities {
    private final DataProto.ExerciseCapabilities proto;
    private final Map<ExerciseType, ExerciseTypeCapabilities> typeToCapabilities;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExerciseCapabilities(androidx.health.services.client.proto.DataProto.ExerciseCapabilities r6) {
        /*
            r5 = this;
            java.lang.String r0 = "proto"
            q7.k.e(r6, r0)
            java.util.List r6 = r6.getTypeToCapabilitiesList()
            java.lang.String r0 = "proto\n            .typeToCapabilitiesList"
            q7.k.d(r6, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = i7.f.M(r6)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L_0x001b:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x004d
            java.lang.Object r1 = r6.next()
            androidx.health.services.client.proto.DataProto$ExerciseCapabilities$TypeToCapabilitiesEntry r1 = (androidx.health.services.client.proto.DataProto.ExerciseCapabilities.TypeToCapabilitiesEntry) r1
            androidx.health.services.client.data.ExerciseType$Companion r2 = androidx.health.services.client.data.ExerciseType.Companion
            androidx.health.services.client.proto.DataProto$ExerciseType r3 = r1.getType()
            java.lang.String r4 = "entry.type"
            q7.k.d(r3, r4)
            androidx.health.services.client.data.ExerciseType r2 = r2.fromProto(r3)
            androidx.health.services.client.data.ExerciseTypeCapabilities r3 = new androidx.health.services.client.data.ExerciseTypeCapabilities
            androidx.health.services.client.proto.DataProto$ExerciseTypeCapabilities r1 = r1.getCapabilities()
            java.lang.String r4 = "entry.capabilities"
            q7.k.d(r1, r4)
            r3.<init>(r1)
            h7.d r1 = new h7.d
            r1.<init>(r2, r3)
            r0.add(r1)
            goto L_0x001b
        L_0x004d:
            java.util.Map r6 = i7.f.P(r0)
            r5.<init>((java.util.Map<androidx.health.services.client.data.ExerciseType, androidx.health.services.client.data.ExerciseTypeCapabilities>) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.services.client.data.ExerciseCapabilities.<init>(androidx.health.services.client.proto.DataProto$ExerciseCapabilities):void");
    }

    public ExerciseCapabilities(Map<ExerciseType, ExerciseTypeCapabilities> map) {
        k.e(map, "typeToCapabilities");
        this.typeToCapabilities = map;
        DataProto.ExerciseCapabilities.Builder newBuilder = DataProto.ExerciseCapabilities.newBuilder();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add((DataProto.ExerciseCapabilities.TypeToCapabilitiesEntry) DataProto.ExerciseCapabilities.TypeToCapabilitiesEntry.newBuilder().setType(((ExerciseType) next.getKey()).toProto()).setCapabilities(((ExerciseTypeCapabilities) next.getValue()).getProto$health_services_client_release()).build());
        }
        y build = newBuilder.addAllTypeToCapabilities(i.Y(arrayList, new ExerciseCapabilities$special$$inlined$sortedBy$1())).build();
        k.d(build, "newBuilder()\n           …   )\n            .build()");
        this.proto = (DataProto.ExerciseCapabilities) build;
    }

    public final Set<ExerciseType> getAutoPauseAndResumeEnabledExercises() {
        Set<Map.Entry<ExerciseType, ExerciseTypeCapabilities>> entrySet = this.typeToCapabilities.entrySet();
        ArrayList arrayList = new ArrayList();
        for (T next : entrySet) {
            if (((ExerciseTypeCapabilities) ((Map.Entry) next).getValue()).getSupportsAutoPauseAndResume()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(f.M(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((ExerciseType) ((Map.Entry) it.next()).getKey());
        }
        return i.d0(arrayList2);
    }

    public final ExerciseTypeCapabilities getExerciseTypeCapabilities(ExerciseType exerciseType) {
        k.e(exerciseType, "exercise");
        ExerciseTypeCapabilities exerciseTypeCapabilities = this.typeToCapabilities.get(exerciseType);
        if (exerciseTypeCapabilities != null) {
            return exerciseTypeCapabilities;
        }
        String format = String.format("%s exercise type is not supported", Arrays.copyOf(new Object[]{exerciseType}, 1));
        k.d(format, "format(format, *args)");
        throw new IllegalArgumentException(format);
    }

    public final DataProto.ExerciseCapabilities getProto$health_services_client_release() {
        return this.proto;
    }

    public final Set<ExerciseType> getSupportedExerciseTypes() {
        return this.typeToCapabilities.keySet();
    }

    public final Map<ExerciseType, ExerciseTypeCapabilities> getTypeToCapabilities() {
        return this.typeToCapabilities;
    }

    public String toString() {
        return "ExerciseCapabilities(typeToCapabilities=" + this.typeToCapabilities + ')';
    }
}
