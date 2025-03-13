package androidx.health.services.client.data;

import androidx.health.services.client.data.HealthEvent;
import androidx.health.services.client.proto.DataProto;
import com.google.protobuf.y;
import i7.f;
import java.util.ArrayList;
import java.util.Set;
import q7.k;

public final class PassiveMonitoringCapabilities {
    private final DataProto.PassiveMonitoringCapabilities proto;
    private final Set<DataType<?, ?>> supportedDataTypesPassiveGoals;
    private final Set<DataType<?, ?>> supportedDataTypesPassiveMonitoring;
    private final Set<HealthEvent.Type> supportedHealthEventTypes;
    private final Set<UserActivityState> supportedUserActivityStates;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PassiveMonitoringCapabilities(androidx.health.services.client.proto.DataProto.PassiveMonitoringCapabilities r8) {
        /*
            r7 = this;
            java.lang.String r0 = "proto"
            q7.k.e(r8, r0)
            java.util.List r0 = r8.getSupportedDataTypesPassiveMonitoringList()
            java.lang.String r1 = "proto.supportedDataTypesPassiveMonitoringList"
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
            androidx.health.services.client.data.DeltaDataType r2 = r4.deltaFromProto$health_services_client_release(r2)
            r1.add(r2)
            goto L_0x001b
        L_0x0036:
            java.util.Set r0 = i7.i.d0(r1)
            java.util.List r1 = r8.getSupportedDataTypesPassiveGoalsList()
            java.lang.String r2 = "proto.supportedDataTypesPassiveGoalsList"
            q7.k.d(r1, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r4 = i7.f.M(r1)
            r2.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x0050:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0069
            java.lang.Object r4 = r1.next()
            androidx.health.services.client.proto.DataProto$DataType r4 = (androidx.health.services.client.proto.DataProto.DataType) r4
            androidx.health.services.client.data.DataType$Companion r5 = androidx.health.services.client.data.DataType.Companion
            q7.k.d(r4, r3)
            androidx.health.services.client.data.DeltaDataType r4 = r5.deltaFromProto$health_services_client_release(r4)
            r2.add(r4)
            goto L_0x0050
        L_0x0069:
            java.util.Set r1 = i7.i.d0(r2)
            java.util.List r2 = r8.getSupportedHealthEventTypesList()
            java.lang.String r4 = "proto.supportedHealthEventTypesList"
            q7.k.d(r2, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x007f:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x009a
            java.lang.Object r5 = r2.next()
            androidx.health.services.client.proto.DataProto$HealthEvent$HealthEventType r5 = (androidx.health.services.client.proto.DataProto.HealthEvent.HealthEventType) r5
            androidx.health.services.client.data.HealthEvent$Type$Companion r6 = androidx.health.services.client.data.HealthEvent.Type.Companion
            q7.k.d(r5, r3)
            androidx.health.services.client.data.HealthEvent$Type r5 = r6.fromProto$health_services_client_release(r5)
            if (r5 == 0) goto L_0x007f
            r4.add(r5)
            goto L_0x007f
        L_0x009a:
            java.util.Set r2 = i7.i.d0(r4)
            java.util.List r8 = r8.getSupportedUserActivityStatesList()
            java.lang.String r4 = "proto.supportedUserActivityStatesList"
            q7.k.d(r8, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x00b0:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L_0x00cb
            java.lang.Object r5 = r8.next()
            androidx.health.services.client.proto.DataProto$UserActivityState r5 = (androidx.health.services.client.proto.DataProto.UserActivityState) r5
            androidx.health.services.client.data.UserActivityState$Companion r6 = androidx.health.services.client.data.UserActivityState.Companion
            q7.k.d(r5, r3)
            androidx.health.services.client.data.UserActivityState r5 = r6.fromProto(r5)
            if (r5 == 0) goto L_0x00b0
            r4.add(r5)
            goto L_0x00b0
        L_0x00cb:
            java.util.Set r8 = i7.i.d0(r4)
            r7.<init>(r0, r1, r2, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.services.client.data.PassiveMonitoringCapabilities.<init>(androidx.health.services.client.proto.DataProto$PassiveMonitoringCapabilities):void");
    }

    public PassiveMonitoringCapabilities(Set<? extends DataType<?, ?>> set, Set<? extends DataType<?, ?>> set2, Set<HealthEvent.Type> set3, Set<UserActivityState> set4) {
        k.e(set, "supportedDataTypesPassiveMonitoring");
        k.e(set2, "supportedDataTypesPassiveGoals");
        k.e(set3, "supportedHealthEventTypes");
        k.e(set4, "supportedUserActivityStates");
        this.supportedDataTypesPassiveMonitoring = set;
        this.supportedDataTypesPassiveGoals = set2;
        this.supportedHealthEventTypes = set3;
        this.supportedUserActivityStates = set4;
        DataProto.PassiveMonitoringCapabilities.Builder newBuilder = DataProto.PassiveMonitoringCapabilities.newBuilder();
        ArrayList arrayList = new ArrayList(f.M(set));
        for (DataType proto$health_services_client_release : set) {
            arrayList.add(proto$health_services_client_release.getProto$health_services_client_release());
        }
        DataProto.PassiveMonitoringCapabilities.Builder addAllSupportedDataTypesPassiveMonitoring = newBuilder.addAllSupportedDataTypesPassiveMonitoring(arrayList);
        Set<DataType<?, ?>> set5 = this.supportedDataTypesPassiveGoals;
        ArrayList arrayList2 = new ArrayList(f.M(set5));
        for (DataType proto$health_services_client_release2 : set5) {
            arrayList2.add(proto$health_services_client_release2.getProto$health_services_client_release());
        }
        DataProto.PassiveMonitoringCapabilities.Builder addAllSupportedDataTypesPassiveGoals = addAllSupportedDataTypesPassiveMonitoring.addAllSupportedDataTypesPassiveGoals(arrayList2);
        Set<HealthEvent.Type> set6 = this.supportedHealthEventTypes;
        ArrayList arrayList3 = new ArrayList(f.M(set6));
        for (HealthEvent.Type proto$health_services_client_release3 : set6) {
            arrayList3.add(proto$health_services_client_release3.toProto$health_services_client_release());
        }
        DataProto.PassiveMonitoringCapabilities.Builder addAllSupportedHealthEventTypes = addAllSupportedDataTypesPassiveGoals.addAllSupportedHealthEventTypes(arrayList3);
        Set<UserActivityState> set7 = this.supportedUserActivityStates;
        ArrayList arrayList4 = new ArrayList(f.M(set7));
        for (UserActivityState proto$health_services_client_release4 : set7) {
            arrayList4.add(proto$health_services_client_release4.toProto$health_services_client_release());
        }
        y build = addAllSupportedHealthEventTypes.addAllSupportedUserActivityStates(arrayList4).build();
        k.d(build, "newBuilder()\n           …) })\n            .build()");
        this.proto = (DataProto.PassiveMonitoringCapabilities) build;
    }

    public final DataProto.PassiveMonitoringCapabilities getProto$health_services_client_release() {
        return this.proto;
    }

    public final Set<DataType<?, ?>> getSupportedDataTypesPassiveGoals() {
        return this.supportedDataTypesPassiveGoals;
    }

    public final Set<DataType<?, ?>> getSupportedDataTypesPassiveMonitoring() {
        return this.supportedDataTypesPassiveMonitoring;
    }

    public final Set<HealthEvent.Type> getSupportedHealthEventTypes() {
        return this.supportedHealthEventTypes;
    }

    public final Set<UserActivityState> getSupportedUserActivityStates() {
        return this.supportedUserActivityStates;
    }

    public String toString() {
        return "PassiveMonitoringCapabilities(supportedDataTypesPassiveMonitoring=" + this.supportedDataTypesPassiveMonitoring + ", supportedDataTypesPassiveGoals=" + this.supportedDataTypesPassiveGoals + ", supportedHealthEventTypes=" + this.supportedHealthEventTypes + ", supportedUserActivityStates=" + this.supportedUserActivityStates + ')';
    }
}
