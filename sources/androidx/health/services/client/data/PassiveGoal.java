package androidx.health.services.client.data;

import androidx.health.services.client.proto.DataProto;
import com.google.protobuf.y;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import q7.k;

public final class PassiveGoal {
    private final DataTypeCondition<? extends Number, ? extends DeltaDataType<? extends Number, ?>> dataTypeCondition;
    private final DataProto.PassiveGoal proto;
    private final int triggerFrequency;

    @Retention(RetentionPolicy.SOURCE)
    public @interface TriggerFrequency {
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final int ONCE = 1;
        public static final int REPEATED = 2;
        public static final int UNKNOWN = 0;

        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int ONCE = 1;
            public static final int REPEATED = 2;
            public static final int UNKNOWN = 0;

            private Companion() {
            }

            public final int fromProto(DataProto.PassiveGoal.TriggerFrequency triggerFrequency) {
                k.e(triggerFrequency, "proto");
                return triggerFrequency.getNumber();
            }

            public final DataProto.PassiveGoal.TriggerFrequency toProto$health_services_client_release(int i8) {
                DataProto.PassiveGoal.TriggerFrequency forNumber = DataProto.PassiveGoal.TriggerFrequency.forNumber(i8);
                return forNumber == null ? DataProto.PassiveGoal.TriggerFrequency.TRIGGER_FREQUENCY_UNKNOWN : forNumber;
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PassiveGoal(DataTypeCondition<? extends Number, ? extends DeltaDataType<? extends Number, ?>> dataTypeCondition2) {
        this(dataTypeCondition2, 2);
        k.e(dataTypeCondition2, "dataTypeCondition");
    }

    private PassiveGoal(DataTypeCondition<? extends Number, ? extends DeltaDataType<? extends Number, ?>> dataTypeCondition2, int i8) {
        this.dataTypeCondition = dataTypeCondition2;
        this.triggerFrequency = i8;
        y build = DataProto.PassiveGoal.newBuilder().setCondition(dataTypeCondition2.getProto$health_services_client_release()).setTriggerFrequency(TriggerFrequency.Companion.toProto$health_services_client_release(i8)).build();
        k.d(build, "newBuilder().setConditio…quency.toProto()).build()");
        this.proto = (DataProto.PassiveGoal) build;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PassiveGoal(androidx.health.services.client.proto.DataProto.PassiveGoal r4) {
        /*
            r3 = this;
            java.lang.String r0 = "proto"
            q7.k.e(r4, r0)
            androidx.health.services.client.data.DataTypeCondition$Companion r0 = androidx.health.services.client.data.DataTypeCondition.Companion
            androidx.health.services.client.proto.DataProto$DataTypeCondition r1 = r4.getCondition()
            java.lang.String r2 = "proto.condition"
            q7.k.d(r1, r2)
            androidx.health.services.client.data.DataTypeCondition r0 = r0.deltaFromProto$health_services_client_release(r1)
            androidx.health.services.client.data.PassiveGoal$TriggerFrequency$Companion r1 = androidx.health.services.client.data.PassiveGoal.TriggerFrequency.Companion
            androidx.health.services.client.proto.DataProto$PassiveGoal$TriggerFrequency r4 = r4.getTriggerFrequency()
            java.lang.String r2 = "proto.triggerFrequency"
            q7.k.d(r4, r2)
            int r4 = r1.fromProto(r4)
            r3.<init>(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.services.client.data.PassiveGoal.<init>(androidx.health.services.client.proto.DataProto$PassiveGoal):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassiveGoal)) {
            return false;
        }
        PassiveGoal passiveGoal = (PassiveGoal) obj;
        return k.a(this.dataTypeCondition, passiveGoal.dataTypeCondition) && this.triggerFrequency == passiveGoal.triggerFrequency;
    }

    public final DataTypeCondition<? extends Number, ? extends DeltaDataType<? extends Number, ?>> getDataTypeCondition() {
        return this.dataTypeCondition;
    }

    public final DataProto.PassiveGoal getProto$health_services_client_release() {
        return this.proto;
    }

    public final int getTriggerFrequency$health_services_client_release() {
        return this.triggerFrequency;
    }

    public int hashCode() {
        return (this.dataTypeCondition.hashCode() * 31) + this.triggerFrequency;
    }

    public String toString() {
        return "PassiveGoal(dataTypeCondition=" + this.dataTypeCondition + ", triggerFrequency=" + this.triggerFrequency + ')';
    }
}
