package androidx.health.services.client;

import androidx.health.services.client.data.DeltaDataType;
import androidx.health.services.client.data.MeasureCapabilities;
import g5.j;
import java.util.concurrent.Executor;

public interface MeasureClient {
    j<MeasureCapabilities> getCapabilitiesAsync();

    void registerMeasureCallback(DeltaDataType<?, ?> deltaDataType, MeasureCallback measureCallback);

    void registerMeasureCallback(DeltaDataType<?, ?> deltaDataType, Executor executor, MeasureCallback measureCallback);

    j<Void> unregisterMeasureCallbackAsync(DeltaDataType<?, ?> deltaDataType, MeasureCallback measureCallback);
}
