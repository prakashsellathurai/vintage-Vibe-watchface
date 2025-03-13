package androidx.health.services.client.data;

import android.os.Bundle;
import androidx.health.services.client.proto.DataProto;
import com.google.protobuf.y;
import i7.f;
import i7.i;
import i7.k;
import i7.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import q7.g;

public final class ExerciseConfig {
    public static final Companion Companion = new Companion((g) null);
    public static final float SWIMMING_POOL_LENGTH_UNSPECIFIED = 0.0f;
    private final Set<DataType<?, ?>> dataTypes;
    private final List<ExerciseGoal<?>> exerciseGoals;
    private final Bundle exerciseParams;
    private final ExerciseType exerciseType;
    private final boolean isAutoPauseAndResumeEnabled;
    private final boolean isGpsEnabled;
    private final float swimmingPoolLengthMeters;

    public static final class Builder {
        private Set<? extends DataType<?, ?>> dataTypes = m.f4881f;
        private List<? extends ExerciseGoal<?>> exerciseGoals = k.f4879f;
        private Bundle exerciseParams;
        private final ExerciseType exerciseType;
        private boolean isAutoPauseAndResumeEnabled;
        private boolean isGpsEnabled;
        private float swimmingPoolLength;

        public Builder(ExerciseType exerciseType2) {
            q7.k.e(exerciseType2, "exerciseType");
            this.exerciseType = exerciseType2;
            Bundle bundle = Bundle.EMPTY;
            q7.k.d(bundle, "EMPTY");
            this.exerciseParams = bundle;
        }

        public final ExerciseConfig build() {
            return new ExerciseConfig(this.exerciseType, this.dataTypes, this.isAutoPauseAndResumeEnabled, this.isGpsEnabled, this.exerciseGoals, this.exerciseParams, this.swimmingPoolLength);
        }

        public final Builder setDataTypes(Set<? extends DataType<?, ?>> set) {
            q7.k.e(set, "dataTypes");
            this.dataTypes = i.d0(set);
            return this;
        }

        public final Builder setExerciseGoals(List<? extends ExerciseGoal<?>> list) {
            q7.k.e(list, "exerciseGoals");
            this.exerciseGoals = list;
            return this;
        }

        public final Builder setExerciseParams(Bundle bundle) {
            q7.k.e(bundle, "exerciseParams");
            this.exerciseParams = bundle;
            return this;
        }

        public final Builder setIsAutoPauseAndResumeEnabled(boolean z8) {
            this.isAutoPauseAndResumeEnabled = z8;
            return this;
        }

        public final Builder setIsGpsEnabled(boolean z8) {
            this.isGpsEnabled = z8;
            return this;
        }

        public final Builder setSwimmingPoolLengthMeters(float f9) {
            this.swimmingPoolLength = f9;
            return this;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final Builder builder(ExerciseType exerciseType) {
            q7.k.e(exerciseType, "exerciseType");
            return new Builder(exerciseType);
        }
    }

    public ExerciseConfig(ExerciseType exerciseType2, Set<? extends DataType<?, ?>> set, boolean z8, boolean z9, List<? extends ExerciseGoal<?>> list, Bundle bundle, float f9) {
        q7.k.e(exerciseType2, "exerciseType");
        q7.k.e(set, "dataTypes");
        q7.k.e(list, "exerciseGoals");
        q7.k.e(bundle, "exerciseParams");
        this.exerciseType = exerciseType2;
        this.dataTypes = set;
        this.isAutoPauseAndResumeEnabled = z8;
        this.isGpsEnabled = z9;
        this.exerciseGoals = list;
        this.exerciseParams = bundle;
        this.swimmingPoolLengthMeters = f9;
        boolean contains = set.contains(DataType.LOCATION);
        boolean z10 = false;
        if (!(!contains || z9)) {
            throw new IllegalArgumentException("If LOCATION data is being requested, setGpsEnabled(true) must be configured in the ExerciseConfig. ".toString());
        } else if (q7.k.a(exerciseType2, ExerciseType.SWIMMING_POOL)) {
            if (!(!(f9 == 0.0f ? true : z10))) {
                throw new IllegalArgumentException("If exercise type is SWIMMING_POOL, then swimming pool length must also be specified".toString());
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExerciseConfig(ExerciseType exerciseType2, Set set, boolean z8, boolean z9, List list, Bundle bundle, float f9, int i8, g gVar) {
        this(exerciseType2, set, z8, z9, (i8 & 16) != 0 ? k.f4879f : list, (i8 & 32) != 0 ? new Bundle() : bundle, (i8 & 64) != 0 ? 0.0f : f9);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExerciseConfig(androidx.health.services.client.proto.DataProto.ExerciseConfig r12) {
        /*
            r11 = this;
            java.lang.String r0 = "proto"
            q7.k.e(r12, r0)
            androidx.health.services.client.data.ExerciseType$Companion r0 = androidx.health.services.client.data.ExerciseType.Companion
            androidx.health.services.client.proto.DataProto$ExerciseType r1 = r12.getExerciseType()
            java.lang.String r2 = "proto.exerciseType"
            q7.k.d(r1, r2)
            androidx.health.services.client.data.ExerciseType r4 = r0.fromProto(r1)
            java.util.List r0 = r12.getDataTypesList()
            java.lang.String r1 = "proto.dataTypesList"
            q7.k.d(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = i7.f.M(r0)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x002a:
            boolean r2 = r0.hasNext()
            java.lang.String r3 = "it"
            if (r2 == 0) goto L_0x0045
            java.lang.Object r2 = r0.next()
            androidx.health.services.client.proto.DataProto$DataType r2 = (androidx.health.services.client.proto.DataProto.DataType) r2
            androidx.health.services.client.data.DataType$Companion r5 = androidx.health.services.client.data.DataType.Companion
            q7.k.d(r2, r3)
            androidx.health.services.client.data.DeltaDataType r2 = r5.deltaFromProto$health_services_client_release(r2)
            r1.add(r2)
            goto L_0x002a
        L_0x0045:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>(r1)
            java.util.List r1 = r12.getAggregateDataTypesList()
            java.lang.String r2 = "proto.aggregateDataTypesList"
            q7.k.d(r1, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = i7.f.M(r1)
            r2.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L_0x0060:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0079
            java.lang.Object r5 = r1.next()
            androidx.health.services.client.proto.DataProto$DataType r5 = (androidx.health.services.client.proto.DataProto.DataType) r5
            androidx.health.services.client.data.DataType$Companion r6 = androidx.health.services.client.data.DataType.Companion
            q7.k.d(r5, r3)
            androidx.health.services.client.data.AggregateDataType r5 = r6.aggregateFromProto$health_services_client_release(r5)
            r2.add(r5)
            goto L_0x0060
        L_0x0079:
            int r1 = r2.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            if (r1 == 0) goto L_0x008d
            int r1 = r1.intValue()
            int r5 = r0.size()
            int r5 = r5 + r1
            goto L_0x0093
        L_0x008d:
            int r1 = r0.size()
            int r5 = r1 * 2
        L_0x0093:
            int r1 = a1.a.C(r5)
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>(r1)
            r5.addAll(r0)
            i7.h.S(r2, r5)
            boolean r6 = r12.getIsAutoPauseAndResumeEnabled()
            boolean r7 = r12.getIsGpsUsageEnabled()
            java.util.List r0 = r12.getExerciseGoalsList()
            java.lang.String r1 = "proto.exerciseGoalsList"
            q7.k.d(r0, r1)
            java.util.ArrayList r8 = new java.util.ArrayList
            int r1 = i7.f.M(r0)
            r8.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x00c0:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00d9
            java.lang.Object r1 = r0.next()
            androidx.health.services.client.proto.DataProto$ExerciseGoal r1 = (androidx.health.services.client.proto.DataProto.ExerciseGoal) r1
            androidx.health.services.client.data.ExerciseGoal$Companion r2 = androidx.health.services.client.data.ExerciseGoal.Companion
            q7.k.d(r1, r3)
            androidx.health.services.client.data.ExerciseGoal r1 = r2.fromProto$health_services_client_release(r1)
            r8.add(r1)
            goto L_0x00c0
        L_0x00d9:
            androidx.health.services.client.proto.DataProto$Bundle r0 = r12.getExerciseParams()
            java.lang.String r1 = "proto.exerciseParams"
            q7.k.d(r0, r1)
            android.os.Bundle r9 = androidx.health.services.client.data.BundlesUtil.fromProto$health_services_client_release(r0)
            boolean r0 = r12.hasSwimmingPoolLength()
            if (r0 == 0) goto L_0x00f1
            float r12 = r12.getSwimmingPoolLength()
            goto L_0x00f2
        L_0x00f1:
            r12 = 0
        L_0x00f2:
            r10 = r12
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.services.client.data.ExerciseConfig.<init>(androidx.health.services.client.proto.DataProto$ExerciseConfig):void");
    }

    public static final Builder builder(ExerciseType exerciseType2) {
        return Companion.builder(exerciseType2);
    }

    public final Set<DataType<?, ?>> getDataTypes() {
        return this.dataTypes;
    }

    public final List<ExerciseGoal<?>> getExerciseGoals() {
        return this.exerciseGoals;
    }

    public final Bundle getExerciseParams() {
        return this.exerciseParams;
    }

    public final ExerciseType getExerciseType() {
        return this.exerciseType;
    }

    public final float getSwimmingPoolLengthMeters() {
        return this.swimmingPoolLengthMeters;
    }

    public final boolean isAutoPauseAndResumeEnabled() {
        return this.isAutoPauseAndResumeEnabled;
    }

    public final boolean isGpsEnabled() {
        return this.isGpsEnabled;
    }

    public final DataProto.ExerciseConfig toProto$health_services_client_release() {
        DataProto.ExerciseConfig.Builder exerciseType2 = DataProto.ExerciseConfig.newBuilder().setExerciseType(this.exerciseType.toProto());
        Set<DataType<?, ?>> set = this.dataTypes;
        ArrayList arrayList = new ArrayList();
        for (T next : set) {
            if (!((DataType) next).isAggregate$health_services_client_release()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(f.M(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((DataType) it.next()).getProto$health_services_client_release());
        }
        DataProto.ExerciseConfig.Builder addAllDataTypes = exerciseType2.addAllDataTypes(arrayList2);
        Set<DataType<?, ?>> set2 = this.dataTypes;
        ArrayList arrayList3 = new ArrayList();
        for (T next2 : set2) {
            if (((DataType) next2).isAggregate$health_services_client_release()) {
                arrayList3.add(next2);
            }
        }
        ArrayList arrayList4 = new ArrayList(f.M(arrayList3));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((DataType) it2.next()).getProto$health_services_client_release());
        }
        DataProto.ExerciseConfig.Builder isGpsUsageEnabled = addAllDataTypes.addAllAggregateDataTypes(arrayList4).setIsAutoPauseAndResumeEnabled(this.isAutoPauseAndResumeEnabled).setIsGpsUsageEnabled(this.isGpsEnabled);
        List<ExerciseGoal<?>> list = this.exerciseGoals;
        ArrayList arrayList5 = new ArrayList(f.M(list));
        for (ExerciseGoal proto$health_services_client_release : list) {
            arrayList5.add(proto$health_services_client_release.getProto$health_services_client_release());
        }
        y build = isGpsUsageEnabled.addAllExerciseGoals(arrayList5).setExerciseParams(BundlesUtil.toProto$health_services_client_release(this.exerciseParams)).setSwimmingPoolLength(this.swimmingPoolLengthMeters).build();
        q7.k.d(build, "newBuilder()\n           …ers)\n            .build()");
        return (DataProto.ExerciseConfig) build;
    }

    public String toString() {
        return "ExerciseConfig(exerciseType=" + this.exerciseType + ", dataTypes=" + this.dataTypes + ", isAutoPauseAndResumeEnabled=" + this.isAutoPauseAndResumeEnabled + ", isGpsEnabled=" + this.isGpsEnabled + ", exerciseGoals=" + this.exerciseGoals + ", swimmingPoolLengthMeters=" + this.swimmingPoolLengthMeters + ')';
    }
}
