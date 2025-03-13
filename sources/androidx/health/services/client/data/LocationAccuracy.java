package androidx.health.services.client.data;

import android.util.Log;
import androidx.health.services.client.proto.DataProto;
import com.google.protobuf.y;
import q7.g;
import q7.k;

public final class LocationAccuracy extends DataPointAccuracy {
    public static final Companion Companion = new Companion((g) null);
    private static final String TAG = "LocationAccuracy";
    private final double horizontalPositionErrorMeters;
    private final double verticalPositionErrorMeters;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public LocationAccuracy(double d9, double d10) {
        this.horizontalPositionErrorMeters = d9;
        this.verticalPositionErrorMeters = d10;
        if (d9 < 0.0d) {
            Log.w(TAG, "horizontalPositionErrorMeters value " + d9 + " is out of range");
        }
        if (d10 < 0.0d) {
            Log.w(TAG, "verticalPositionErrorMeters value " + d10 + " is out of range");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LocationAccuracy(double d9, double d10, int i8, g gVar) {
        this(d9, (i8 & 2) != 0 ? Double.MAX_VALUE : d10);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LocationAccuracy(DataProto.DataPointAccuracy dataPointAccuracy) {
        this(dataPointAccuracy.getLocationAccuracy().getHorizontalPositionError(), dataPointAccuracy.getLocationAccuracy().hasVerticalPositionError() ? dataPointAccuracy.getLocationAccuracy().getVerticalPositionError() : Double.MAX_VALUE);
        k.e(dataPointAccuracy, "proto");
    }

    public final DataProto.DataPointAccuracy getDataPointAccuracyProto$health_services_client_release() {
        y build = DataProto.DataPointAccuracy.newBuilder().setLocationAccuracy(DataProto.DataPointAccuracy.LocationAccuracy.newBuilder().setHorizontalPositionError(this.horizontalPositionErrorMeters).setVerticalPositionError(this.verticalPositionErrorMeters)).build();
        k.d(build, "newBuilder()\n           …der)\n            .build()");
        return (DataProto.DataPointAccuracy) build;
    }

    public final double getHorizontalPositionErrorMeters() {
        return this.horizontalPositionErrorMeters;
    }

    public final double getVerticalPositionErrorMeters() {
        return this.verticalPositionErrorMeters;
    }

    public String toString() {
        return "LocationAccuracy(horizontalPositionErrorMeters=" + this.horizontalPositionErrorMeters + ",verticalPositionErrorMeters=" + this.verticalPositionErrorMeters + ')';
    }
}
