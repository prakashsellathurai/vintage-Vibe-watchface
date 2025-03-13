package androidx.health.services.client;

import androidx.health.services.client.data.Availability;
import androidx.health.services.client.data.DataPointContainer;
import androidx.health.services.client.data.DeltaDataType;
import q7.k;

public interface MeasureCallback {

    public static final class DefaultImpls {
        public static void onRegistered(MeasureCallback measureCallback) {
        }

        public static void onRegistrationFailed(MeasureCallback measureCallback, Throwable th) {
            k.e(th, "throwable");
        }
    }

    void onAvailabilityChanged(DeltaDataType<?, ?> deltaDataType, Availability availability);

    void onDataReceived(DataPointContainer dataPointContainer);

    void onRegistered();

    void onRegistrationFailed(Throwable th);
}
