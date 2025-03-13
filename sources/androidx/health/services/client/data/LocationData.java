package androidx.health.services.client.data;

import android.util.Log;
import androidx.health.services.client.proto.DataProto;
import q7.g;
import q7.k;

public final class LocationData {
    private static final int ALTITUDE_INDEX = 2;
    public static final double ALTITUDE_UNAVAILABLE = Double.NaN;
    private static final int BEARING_INDEX = 3;
    public static final double BEARING_UNAVAILABLE = Double.NaN;
    public static final Companion Companion = new Companion((g) null);
    private static final int LATITUDE_INDEX = 0;
    private static final int LONGITUDE_INDEX = 1;
    private static final String TAG = "LocationData";
    private final double altitude;
    private final double bearing;
    private final double latitude;
    private final double longitude;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final LocationData fromDataProtoValue$health_services_client_release(DataProto.Value value) {
            k.e(value, "proto");
            if (value.hasDoubleArrayVal()) {
                return new LocationData(value.getDoubleArrayVal().getDoubleArray(0), value.getDoubleArrayVal().getDoubleArray(1), value.getDoubleArrayVal().getDoubleArrayCount() > 2 ? value.getDoubleArrayVal().getDoubleArray(2) : Double.NaN, value.getDoubleArrayVal().getDoubleArrayCount() > 3 ? value.getDoubleArrayVal().getDoubleArray(3) : Double.NaN);
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public LocationData(double d9, double d10, double d11, double d12) {
        this.latitude = d9;
        this.longitude = d10;
        this.altitude = d11;
        this.bearing = d12;
        boolean z8 = true;
        if (!(-90.0d <= d9 && d9 <= 90.0d)) {
            Log.w(TAG, "latitude value " + d9 + " is out of range");
        }
        if (!((-180.0d > d10 || d10 > 180.0d) ? false : z8)) {
            Log.w(TAG, "longitude value " + d10 + " is out of range");
        }
        if (d12 < -1.0d || d12 >= 360.0d) {
            Log.w(TAG, "bearing value " + d12 + " is out of range");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LocationData(double d9, double d10, double d11, double d12, int i8, g gVar) {
        this(d9, d10, (i8 & 4) != 0 ? Double.NaN : d11, (i8 & 8) != 0 ? Double.NaN : d12);
    }

    public final void addToValueProtoBuilder$health_services_client_release(DataProto.Value.Builder builder) {
        k.e(builder, "proto");
        DataProto.Value.DoubleArray.Builder newBuilder = DataProto.Value.DoubleArray.newBuilder();
        newBuilder.addDoubleArray(this.latitude);
        newBuilder.addDoubleArray(this.longitude);
        newBuilder.addDoubleArray(this.altitude);
        newBuilder.addDoubleArray(this.bearing);
        builder.setDoubleArrayVal(newBuilder);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationData)) {
            return false;
        }
        LocationData locationData = (LocationData) obj;
        if (!(this.latitude == locationData.latitude)) {
            return false;
        }
        if (!(this.longitude == locationData.longitude)) {
            return false;
        }
        if (!(this.altitude == locationData.altitude)) {
            return false;
        }
        return (this.bearing > locationData.bearing ? 1 : (this.bearing == locationData.bearing ? 0 : -1)) == 0;
    }

    public final double getAltitude() {
        return this.altitude;
    }

    public final double getBearing() {
        return this.bearing;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.latitude) * 31) + Double.hashCode(this.longitude)) * 31) + Double.hashCode(this.altitude)) * 31) + Double.hashCode(this.bearing);
    }

    public String toString() {
        return "LocationData(latitude=" + this.latitude + ", longitude=" + this.longitude + ", altitude=" + this.altitude + ", bearing=" + this.bearing + ')';
    }
}
