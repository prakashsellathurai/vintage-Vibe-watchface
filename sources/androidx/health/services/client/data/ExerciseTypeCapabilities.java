package androidx.health.services.client.data;

import androidx.health.services.client.proto.DataProto;
import com.google.protobuf.y;
import i7.f;
import i7.i;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import q7.k;

public final class ExerciseTypeCapabilities {
    private final DataProto.ExerciseTypeCapabilities proto;
    private final Set<DataType<?, ?>> supportedDataTypes;
    private final Map<AggregateDataType<?, ?>, Set<ComparisonType>> supportedGoals;
    private final Map<AggregateDataType<?, ?>, Set<ComparisonType>> supportedMilestones;
    private final boolean supportsAutoPauseAndResume;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExerciseTypeCapabilities(androidx.health.services.client.proto.DataProto.ExerciseTypeCapabilities r14) {
        /*
            r13 = this;
            java.lang.String r0 = "proto"
            q7.k.e(r14, r0)
            java.util.List r0 = r14.getSupportedDataTypesList()
            java.lang.String r1 = "proto.supportedDataTypesList"
            q7.k.d(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = i7.f.M(r0)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x001b:
            boolean r2 = r0.hasNext()
            java.lang.String r3 = "it"
            if (r2 == 0) goto L_0x0036
            java.lang.Object r2 = r0.next()
            androidx.health.services.client.proto.DataProto$DataType r2 = (androidx.health.services.client.proto.DataProto.DataType) r2
            androidx.health.services.client.data.DataType$Companion r4 = androidx.health.services.client.data.DataType.Companion
            q7.k.d(r2, r3)
            java.util.List r2 = r4.deltaAndAggregateFromProto$health_services_client_release(r2)
            r1.add(r2)
            goto L_0x001b
        L_0x0036:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x003f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x004f
            java.lang.Object r2 = r1.next()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            i7.h.S(r2, r0)
            goto L_0x003f
        L_0x004f:
            java.util.Set r0 = i7.i.d0(r0)
            java.util.List r1 = r14.getSupportedGoalsList()
            java.lang.String r2 = "proto\n            .supportedGoalsList"
            q7.k.d(r1, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r4 = i7.f.M(r1)
            r2.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x0069:
            boolean r4 = r1.hasNext()
            java.lang.String r5 = "entry\n                        .comparisonTypesList"
            java.lang.String r6 = "entry.dataType"
            if (r4 == 0) goto L_0x00e4
            java.lang.Object r4 = r1.next()
            androidx.health.services.client.proto.DataProto$ExerciseTypeCapabilities$SupportedGoalEntry r4 = (androidx.health.services.client.proto.DataProto.ExerciseTypeCapabilities.SupportedGoalEntry) r4
            androidx.health.services.client.data.DataType$Companion r7 = androidx.health.services.client.data.DataType.Companion
            androidx.health.services.client.proto.DataProto$DataType r8 = r4.getDataType()
            q7.k.d(r8, r6)
            androidx.health.services.client.data.AggregateDataType r6 = r7.aggregateFromProto$health_services_client_release(r8)
            java.util.List r4 = r4.getComparisonTypesList()
            q7.k.d(r4, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            int r7 = i7.f.M(r4)
            r5.<init>(r7)
            java.util.Iterator r4 = r4.iterator()
        L_0x009a:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x00b3
            java.lang.Object r7 = r4.next()
            androidx.health.services.client.proto.DataProto$ComparisonType r7 = (androidx.health.services.client.proto.DataProto.ComparisonType) r7
            androidx.health.services.client.data.ComparisonType$Companion r8 = androidx.health.services.client.data.ComparisonType.Companion
            q7.k.d(r7, r3)
            androidx.health.services.client.data.ComparisonType r7 = r8.fromProto$health_services_client_release(r7)
            r5.add(r7)
            goto L_0x009a
        L_0x00b3:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x00bc:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x00d7
            java.lang.Object r7 = r5.next()
            r8 = r7
            androidx.health.services.client.data.ComparisonType r8 = (androidx.health.services.client.data.ComparisonType) r8
            androidx.health.services.client.data.ComparisonType r9 = androidx.health.services.client.data.ComparisonType.UNKNOWN
            boolean r8 = q7.k.a(r8, r9)
            r8 = r8 ^ 1
            if (r8 == 0) goto L_0x00bc
            r4.add(r7)
            goto L_0x00bc
        L_0x00d7:
            java.util.Set r4 = i7.i.d0(r4)
            h7.d r5 = new h7.d
            r5.<init>(r6, r4)
            r2.add(r5)
            goto L_0x0069
        L_0x00e4:
            java.util.Map r1 = i7.f.P(r2)
            java.util.List r2 = r14.getSupportedMilestonesList()
            java.lang.String r4 = "proto\n            .supportedMilestonesList"
            q7.k.d(r2, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r7 = i7.f.M(r2)
            r4.<init>(r7)
            java.util.Iterator r2 = r2.iterator()
        L_0x00fe:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0175
            java.lang.Object r7 = r2.next()
            androidx.health.services.client.proto.DataProto$ExerciseTypeCapabilities$SupportedMilestoneEntry r7 = (androidx.health.services.client.proto.DataProto.ExerciseTypeCapabilities.SupportedMilestoneEntry) r7
            androidx.health.services.client.data.DataType$Companion r8 = androidx.health.services.client.data.DataType.Companion
            androidx.health.services.client.proto.DataProto$DataType r9 = r7.getDataType()
            q7.k.d(r9, r6)
            androidx.health.services.client.data.AggregateDataType r8 = r8.aggregateFromProto$health_services_client_release(r9)
            java.util.List r7 = r7.getComparisonTypesList()
            q7.k.d(r7, r5)
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = i7.f.M(r7)
            r9.<init>(r10)
            java.util.Iterator r7 = r7.iterator()
        L_0x012b:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x0144
            java.lang.Object r10 = r7.next()
            androidx.health.services.client.proto.DataProto$ComparisonType r10 = (androidx.health.services.client.proto.DataProto.ComparisonType) r10
            androidx.health.services.client.data.ComparisonType$Companion r11 = androidx.health.services.client.data.ComparisonType.Companion
            q7.k.d(r10, r3)
            androidx.health.services.client.data.ComparisonType r10 = r11.fromProto$health_services_client_release(r10)
            r9.add(r10)
            goto L_0x012b
        L_0x0144:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x014d:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0168
            java.lang.Object r10 = r9.next()
            r11 = r10
            androidx.health.services.client.data.ComparisonType r11 = (androidx.health.services.client.data.ComparisonType) r11
            androidx.health.services.client.data.ComparisonType r12 = androidx.health.services.client.data.ComparisonType.UNKNOWN
            boolean r11 = q7.k.a(r11, r12)
            r11 = r11 ^ 1
            if (r11 == 0) goto L_0x014d
            r7.add(r10)
            goto L_0x014d
        L_0x0168:
            java.util.Set r7 = i7.i.d0(r7)
            h7.d r9 = new h7.d
            r9.<init>(r8, r7)
            r4.add(r9)
            goto L_0x00fe
        L_0x0175:
            java.util.Map r2 = i7.f.P(r4)
            boolean r14 = r14.getIsAutoPauseAndResumeSupported()
            r13.<init>(r0, r1, r2, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.services.client.data.ExerciseTypeCapabilities.<init>(androidx.health.services.client.proto.DataProto$ExerciseTypeCapabilities):void");
    }

    public ExerciseTypeCapabilities(Set<? extends DataType<?, ?>> set, Map<AggregateDataType<?, ?>, ? extends Set<ComparisonType>> map, Map<AggregateDataType<?, ?>, ? extends Set<ComparisonType>> map2, boolean z8) {
        k.e(set, "supportedDataTypes");
        k.e(map, "supportedGoals");
        k.e(map2, "supportedMilestones");
        this.supportedDataTypes = set;
        this.supportedGoals = map;
        this.supportedMilestones = map2;
        this.supportsAutoPauseAndResume = z8;
        DataProto.ExerciseTypeCapabilities.Builder newBuilder = DataProto.ExerciseTypeCapabilities.newBuilder();
        ArrayList arrayList = new ArrayList(f.M(set));
        for (DataType proto$health_services_client_release : set) {
            arrayList.add(proto$health_services_client_release.getProto$health_services_client_release());
        }
        DataProto.ExerciseTypeCapabilities.Builder addAllSupportedDataTypes = newBuilder.addAllSupportedDataTypes(arrayList);
        Map<AggregateDataType<?, ?>, Set<ComparisonType>> map3 = this.supportedGoals;
        ArrayList arrayList2 = new ArrayList(map3.size());
        for (Map.Entry next : map3.entrySet()) {
            DataProto.ExerciseTypeCapabilities.SupportedGoalEntry.Builder dataType = DataProto.ExerciseTypeCapabilities.SupportedGoalEntry.newBuilder().setDataType(((AggregateDataType) next.getKey()).getProto$health_services_client_release());
            Iterable<ComparisonType> iterable = (Iterable) next.getValue();
            ArrayList arrayList3 = new ArrayList(f.M(iterable));
            for (ComparisonType proto$health_services_client_release2 : iterable) {
                arrayList3.add(proto$health_services_client_release2.toProto$health_services_client_release());
            }
            arrayList2.add((DataProto.ExerciseTypeCapabilities.SupportedGoalEntry) dataType.addAllComparisonTypes(arrayList3).build());
        }
        DataProto.ExerciseTypeCapabilities.Builder addAllSupportedGoals = addAllSupportedDataTypes.addAllSupportedGoals(i.Y(arrayList2, new ExerciseTypeCapabilities$special$$inlined$sortedBy$1()));
        Map<AggregateDataType<?, ?>, Set<ComparisonType>> map4 = this.supportedMilestones;
        ArrayList arrayList4 = new ArrayList(map4.size());
        for (Map.Entry next2 : map4.entrySet()) {
            DataProto.ExerciseTypeCapabilities.SupportedMilestoneEntry.Builder dataType2 = DataProto.ExerciseTypeCapabilities.SupportedMilestoneEntry.newBuilder().setDataType(((AggregateDataType) next2.getKey()).getProto$health_services_client_release());
            Iterable<ComparisonType> iterable2 = (Iterable) next2.getValue();
            ArrayList arrayList5 = new ArrayList(f.M(iterable2));
            for (ComparisonType proto$health_services_client_release3 : iterable2) {
                arrayList5.add(proto$health_services_client_release3.toProto$health_services_client_release());
            }
            arrayList4.add((DataProto.ExerciseTypeCapabilities.SupportedMilestoneEntry) dataType2.addAllComparisonTypes(arrayList5).build());
        }
        y build = addAllSupportedGoals.addAllSupportedMilestones(i.Y(arrayList4, new ExerciseTypeCapabilities$special$$inlined$sortedBy$2())).setIsAutoPauseAndResumeSupported(this.supportsAutoPauseAndResume).build();
        k.d(build, "newBuilder()\n           …ume)\n            .build()");
        this.proto = (DataProto.ExerciseTypeCapabilities) build;
    }

    public final DataProto.ExerciseTypeCapabilities getProto$health_services_client_release() {
        return this.proto;
    }

    public final Set<DataType<?, ?>> getSupportedDataTypes() {
        return this.supportedDataTypes;
    }

    public final Map<AggregateDataType<?, ?>, Set<ComparisonType>> getSupportedGoals() {
        return this.supportedGoals;
    }

    public final Map<AggregateDataType<?, ?>, Set<ComparisonType>> getSupportedMilestones() {
        return this.supportedMilestones;
    }

    public final boolean getSupportsAutoPauseAndResume() {
        return this.supportsAutoPauseAndResume;
    }

    public String toString() {
        return "ExerciseTypeCapabilities(supportedDataTypes=" + this.supportedDataTypes + ", supportedGoals=" + this.supportedGoals + ", supportedMilestones=" + this.supportedMilestones + ", supportsAutoPauseAndResume=" + this.supportsAutoPauseAndResume + ", ";
    }
}
