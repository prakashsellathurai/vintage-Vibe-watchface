package androidx.health.services.client.impl.response;

import android.os.Parcelable;
import androidx.health.services.client.data.DataPoint;
import androidx.health.services.client.data.IntervalDataPoint;
import androidx.health.services.client.data.ProtoParcelable;
import androidx.health.services.client.data.SampleDataPoint;
import androidx.health.services.client.proto.DataProto;
import androidx.health.services.client.proto.ResponsesProto;
import com.google.protobuf.y;
import i7.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q7.g;
import q7.k;

public final class DataPointsResponse extends ProtoParcelable<ResponsesProto.DataPointsResponse> {
    public static final Parcelable.Creator<DataPointsResponse> CREATOR = new DataPointsResponse$special$$inlined$newCreator$1();
    public static final Companion Companion = new Companion((g) null);
    private final List<DataPoint<?>> dataPoints;
    private final ResponsesProto.DataPointsResponse proto;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DataPointsResponse(androidx.health.services.client.proto.ResponsesProto.DataPointsResponse r5) {
        /*
            r4 = this;
            java.lang.String r0 = "proto"
            q7.k.e(r5, r0)
            java.util.List r5 = r5.getDataPointsList()
            java.lang.String r0 = "proto.dataPointsList"
            q7.k.d(r5, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = i7.f.M(r5)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L_0x001b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0036
            java.lang.Object r1 = r5.next()
            androidx.health.services.client.proto.DataProto$DataPoint r1 = (androidx.health.services.client.proto.DataProto.DataPoint) r1
            androidx.health.services.client.data.DataPoint$Companion r2 = androidx.health.services.client.data.DataPoint.Companion
            java.lang.String r3 = "it"
            q7.k.d(r1, r3)
            androidx.health.services.client.data.DataPoint r1 = r2.fromProto$health_services_client_release((androidx.health.services.client.proto.DataProto.DataPoint) r1)
            r0.add(r1)
            goto L_0x001b
        L_0x0036:
            r4.<init>((java.util.List<? extends androidx.health.services.client.data.DataPoint<?>>) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.services.client.impl.response.DataPointsResponse.<init>(androidx.health.services.client.proto.ResponsesProto$DataPointsResponse):void");
    }

    public DataPointsResponse(List<? extends DataPoint<?>> list) {
        DataProto.DataPoint dataPoint;
        k.e(list, "dataPoints");
        this.dataPoints = list;
        ResponsesProto.DataPointsResponse.Builder newBuilder = ResponsesProto.DataPointsResponse.newBuilder();
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            DataPoint dataPoint2 = (DataPoint) next;
            if ((dataPoint2 instanceof IntervalDataPoint) || (dataPoint2 instanceof SampleDataPoint)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(f.M(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            DataPoint dataPoint3 = (DataPoint) it.next();
            if (dataPoint3 instanceof IntervalDataPoint) {
                dataPoint = ((IntervalDataPoint) dataPoint3).getProto$health_services_client_release();
            } else if (dataPoint3 instanceof SampleDataPoint) {
                dataPoint = ((SampleDataPoint) dataPoint3).getProto$health_services_client_release();
            } else {
                throw new IllegalStateException("Invalid DataPoint type: " + dataPoint3);
            }
            arrayList2.add(dataPoint);
        }
        y build = newBuilder.addAllDataPoints(arrayList2).build();
        k.d(build, "newBuilder()\n           …   )\n            .build()");
        this.proto = (ResponsesProto.DataPointsResponse) build;
    }

    public final List<DataPoint<?>> getDataPoints() {
        return this.dataPoints;
    }

    public ResponsesProto.DataPointsResponse getProto() {
        return this.proto;
    }
}
