package androidx.health.services.client.data;

import androidx.health.services.client.data.HealthEvent;
import androidx.health.services.client.proto.DataProto;
import com.google.protobuf.y;
import i7.f;
import i7.i;
import i7.m;
import java.util.ArrayList;
import java.util.Set;
import q7.g;
import q7.k;

public final class PassiveListenerConfig {
    public static final Companion Companion = new Companion((g) null);
    private final Set<PassiveGoal> dailyGoals;
    private final Set<DataType<? extends Object, ? extends DataPoint<? extends Object>>> dataTypes;
    private final Set<HealthEvent.Type> healthEventTypes;
    private final DataProto.PassiveListenerConfig proto;
    private final boolean shouldUserActivityInfoBeRequested;

    public static final class Builder {
        private Set<PassiveGoal> dailyGoals;
        private Set<? extends DataType<?, ?>> dataTypes;
        private Set<HealthEvent.Type> healthEventTypes;
        private boolean requestUserActivityState;

        public Builder() {
            m mVar = m.f4881f;
            this.dataTypes = mVar;
            this.dailyGoals = mVar;
            this.healthEventTypes = mVar;
        }

        public final PassiveListenerConfig build() {
            return new PassiveListenerConfig(this.dataTypes, this.requestUserActivityState, this.dailyGoals, this.healthEventTypes);
        }

        public final Builder setDailyGoals(Set<PassiveGoal> set) {
            k.e(set, "dailyGoals");
            this.dailyGoals = i.d0(set);
            return this;
        }

        public final Builder setDataTypes(Set<? extends DataType<?, ?>> set) {
            k.e(set, "dataTypes");
            this.dataTypes = i.d0(set);
            return this;
        }

        public final Builder setHealthEventTypes(Set<HealthEvent.Type> set) {
            k.e(set, "healthEventTypes");
            this.healthEventTypes = i.d0(set);
            return this;
        }

        public final Builder setShouldUserActivityInfoBeRequested(boolean z8) {
            this.requestUserActivityState = z8;
            return this;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final Builder builder() {
            return new Builder();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PassiveListenerConfig(androidx.health.services.client.proto.DataProto.PassiveListenerConfig r8) {
        /*
            r7 = this;
            java.lang.String r0 = "proto"
            q7.k.e(r8, r0)
            java.util.List r0 = r8.getDataTypesList()
            java.lang.String r1 = "proto.dataTypesList"
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
            boolean r1 = r8.getIncludeUserActivityState()
            java.util.List r2 = r8.getPassiveGoalsList()
            java.lang.String r4 = "proto.passiveGoalsList"
            q7.k.d(r2, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = i7.f.M(r2)
            r4.<init>(r5)
            java.util.Iterator r2 = r2.iterator()
        L_0x0054:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x006c
            java.lang.Object r5 = r2.next()
            androidx.health.services.client.proto.DataProto$PassiveGoal r5 = (androidx.health.services.client.proto.DataProto.PassiveGoal) r5
            androidx.health.services.client.data.PassiveGoal r6 = new androidx.health.services.client.data.PassiveGoal
            q7.k.d(r5, r3)
            r6.<init>((androidx.health.services.client.proto.DataProto.PassiveGoal) r5)
            r4.add(r6)
            goto L_0x0054
        L_0x006c:
            java.util.Set r2 = i7.i.d0(r4)
            java.util.List r8 = r8.getHealthEventTypesList()
            java.lang.String r4 = "proto.healthEventTypesList"
            q7.k.d(r8, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = i7.f.M(r8)
            r4.<init>(r5)
            java.util.Iterator r8 = r8.iterator()
        L_0x0086:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L_0x009f
            java.lang.Object r5 = r8.next()
            androidx.health.services.client.proto.DataProto$HealthEvent$HealthEventType r5 = (androidx.health.services.client.proto.DataProto.HealthEvent.HealthEventType) r5
            androidx.health.services.client.data.HealthEvent$Type$Companion r6 = androidx.health.services.client.data.HealthEvent.Type.Companion
            q7.k.d(r5, r3)
            androidx.health.services.client.data.HealthEvent$Type r5 = r6.fromProto$health_services_client_release(r5)
            r4.add(r5)
            goto L_0x0086
        L_0x009f:
            java.util.Set r8 = i7.i.d0(r4)
            r7.<init>(r0, r1, r2, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.services.client.data.PassiveListenerConfig.<init>(androidx.health.services.client.proto.DataProto$PassiveListenerConfig):void");
    }

    public PassiveListenerConfig(Set<? extends DataType<? extends Object, ? extends DataPoint<? extends Object>>> set, boolean z8, Set<PassiveGoal> set2, Set<HealthEvent.Type> set3) {
        k.e(set, "dataTypes");
        k.e(set2, "dailyGoals");
        k.e(set3, "healthEventTypes");
        this.dataTypes = set;
        this.shouldUserActivityInfoBeRequested = z8;
        this.dailyGoals = set2;
        this.healthEventTypes = set3;
        DataProto.PassiveListenerConfig.Builder newBuilder = DataProto.PassiveListenerConfig.newBuilder();
        ArrayList arrayList = new ArrayList(f.M(set));
        for (DataType proto$health_services_client_release : set) {
            arrayList.add(proto$health_services_client_release.getProto$health_services_client_release());
        }
        DataProto.PassiveListenerConfig.Builder includeUserActivityState = newBuilder.addAllDataTypes(arrayList).setIncludeUserActivityState(this.shouldUserActivityInfoBeRequested);
        Set<PassiveGoal> set4 = this.dailyGoals;
        ArrayList arrayList2 = new ArrayList(f.M(set4));
        for (PassiveGoal proto$health_services_client_release2 : set4) {
            arrayList2.add(proto$health_services_client_release2.getProto$health_services_client_release());
        }
        DataProto.PassiveListenerConfig.Builder addAllPassiveGoals = includeUserActivityState.addAllPassiveGoals(arrayList2);
        Set<HealthEvent.Type> set5 = this.healthEventTypes;
        ArrayList arrayList3 = new ArrayList(f.M(set5));
        for (HealthEvent.Type proto$health_services_client_release3 : set5) {
            arrayList3.add(proto$health_services_client_release3.toProto$health_services_client_release());
        }
        y build = addAllPassiveGoals.addAllHealthEventTypes(arrayList3).build();
        k.d(build, "newBuilder()\n           …) })\n            .build()");
        this.proto = (DataProto.PassiveListenerConfig) build;
    }

    public static final Builder builder() {
        return Companion.builder();
    }

    public final Set<PassiveGoal> getDailyGoals() {
        return this.dailyGoals;
    }

    public final Set<DataType<? extends Object, ? extends DataPoint<? extends Object>>> getDataTypes() {
        return this.dataTypes;
    }

    public final Set<HealthEvent.Type> getHealthEventTypes() {
        return this.healthEventTypes;
    }

    public final DataProto.PassiveListenerConfig getProto$health_services_client_release() {
        return this.proto;
    }

    public final boolean shouldUserActivityInfoBeRequested() {
        return this.shouldUserActivityInfoBeRequested;
    }
}
