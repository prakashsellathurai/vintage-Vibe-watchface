package androidx.health.services.client.data;

import androidx.health.services.client.proto.DataProto;
import com.google.protobuf.y;
import i7.f;
import java.util.ArrayList;
import java.util.List;
import q7.k;

public final class PassiveMonitoringUpdate {
    private final DataPointContainer dataPoints;
    private final DataProto.PassiveMonitoringUpdate proto;
    private final List<UserActivityInfo> userActivityInfoUpdates;

    public PassiveMonitoringUpdate(DataPointContainer dataPointContainer, List<UserActivityInfo> list) {
        k.e(dataPointContainer, "dataPoints");
        k.e(list, "userActivityInfoUpdates");
        this.dataPoints = dataPointContainer;
        this.userActivityInfoUpdates = list;
        DataProto.PassiveMonitoringUpdate.Builder newBuilder = DataProto.PassiveMonitoringUpdate.newBuilder();
        List<SampleDataPoint<?>> sampleDataPoints = dataPointContainer.getSampleDataPoints();
        ArrayList arrayList = new ArrayList(f.M(sampleDataPoints));
        for (SampleDataPoint proto$health_services_client_release : sampleDataPoints) {
            arrayList.add(proto$health_services_client_release.getProto$health_services_client_release());
        }
        DataProto.PassiveMonitoringUpdate.Builder addAllDataPoints = newBuilder.addAllDataPoints(arrayList);
        List<IntervalDataPoint<?>> intervalDataPoints = this.dataPoints.getIntervalDataPoints();
        ArrayList arrayList2 = new ArrayList(f.M(intervalDataPoints));
        for (IntervalDataPoint proto$health_services_client_release2 : intervalDataPoints) {
            arrayList2.add(proto$health_services_client_release2.getProto$health_services_client_release());
        }
        DataProto.PassiveMonitoringUpdate.Builder addAllDataPoints2 = addAllDataPoints.addAllDataPoints(arrayList2);
        List<UserActivityInfo> list2 = this.userActivityInfoUpdates;
        ArrayList arrayList3 = new ArrayList(f.M(list2));
        for (UserActivityInfo proto$health_services_client_release3 : list2) {
            arrayList3.add(proto$health_services_client_release3.getProto$health_services_client_release());
        }
        y build = addAllDataPoints2.addAllUserActivityInfoUpdates(arrayList3).build();
        k.d(build, "newBuilder()\n           …o })\n            .build()");
        this.proto = (DataProto.PassiveMonitoringUpdate) build;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PassiveMonitoringUpdate(androidx.health.services.client.proto.DataProto.PassiveMonitoringUpdate r6) {
        /*
            r5 = this;
            java.lang.String r0 = "proto"
            q7.k.e(r6, r0)
            java.util.List r0 = r6.getDataPointsList()
            java.lang.String r1 = "proto.dataPointsList"
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
            androidx.health.services.client.proto.DataProto$DataPoint r2 = (androidx.health.services.client.proto.DataProto.DataPoint) r2
            androidx.health.services.client.data.DataPoint$Companion r4 = androidx.health.services.client.data.DataPoint.Companion
            q7.k.d(r2, r3)
            androidx.health.services.client.data.DataPoint r2 = r4.fromProto$health_services_client_release((androidx.health.services.client.proto.DataProto.DataPoint) r2)
            r1.add(r2)
            goto L_0x001b
        L_0x0036:
            androidx.health.services.client.data.DataPointContainer r0 = new androidx.health.services.client.data.DataPointContainer
            r0.<init>((java.util.List<? extends androidx.health.services.client.data.DataPoint<?>>) r1)
            java.util.List r6 = r6.getUserActivityInfoUpdatesList()
            java.lang.String r1 = "proto.userActivityInfoUpdatesList"
            q7.k.d(r6, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = i7.f.M(r6)
            r1.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
        L_0x0051:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0069
            java.lang.Object r2 = r6.next()
            androidx.health.services.client.proto.DataProto$UserActivityInfo r2 = (androidx.health.services.client.proto.DataProto.UserActivityInfo) r2
            androidx.health.services.client.data.UserActivityInfo r4 = new androidx.health.services.client.data.UserActivityInfo
            q7.k.d(r2, r3)
            r4.<init>(r2)
            r1.add(r4)
            goto L_0x0051
        L_0x0069:
            r5.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.services.client.data.PassiveMonitoringUpdate.<init>(androidx.health.services.client.proto.DataProto$PassiveMonitoringUpdate):void");
    }

    public final DataPointContainer getDataPoints() {
        return this.dataPoints;
    }

    public final DataProto.PassiveMonitoringUpdate getProto$health_services_client_release() {
        return this.proto;
    }

    public final List<UserActivityInfo> getUserActivityInfoUpdates() {
        return this.userActivityInfoUpdates;
    }

    public String toString() {
        return "PassiveMonitoringUpdate(dataPoints=" + this.dataPoints + ", userActivityInfoUpdates=" + this.userActivityInfoUpdates + ')';
    }
}
