package androidx.health.services.client.impl;

import androidx.health.services.client.data.MeasureCapabilities;
import androidx.health.services.client.impl.response.MeasureCapabilitiesResponse;
import q7.k;
import q7.l;

public final class ServiceBackedMeasureClient$getCapabilitiesAsync$2 extends l implements p7.l<MeasureCapabilitiesResponse, MeasureCapabilities> {
    public static final ServiceBackedMeasureClient$getCapabilitiesAsync$2 INSTANCE = new ServiceBackedMeasureClient$getCapabilitiesAsync$2();

    public ServiceBackedMeasureClient$getCapabilitiesAsync$2() {
        super(1);
    }

    public final MeasureCapabilities invoke(MeasureCapabilitiesResponse measureCapabilitiesResponse) {
        k.b(measureCapabilitiesResponse);
        return measureCapabilitiesResponse.getMeasureCapabilities();
    }
}
