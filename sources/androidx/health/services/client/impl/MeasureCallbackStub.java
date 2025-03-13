package androidx.health.services.client.impl;

import android.util.Log;
import androidx.health.services.client.MeasureCallback;
import androidx.health.services.client.data.Availability;
import androidx.health.services.client.data.DataPoint;
import androidx.health.services.client.data.DataPointContainer;
import androidx.health.services.client.data.DataType;
import androidx.health.services.client.data.DeltaDataType;
import androidx.health.services.client.impl.IMeasureCallback;
import androidx.health.services.client.impl.event.MeasureCallbackEvent;
import androidx.health.services.client.impl.ipc.internal.ListenerKey;
import androidx.health.services.client.impl.response.DataPointsResponse;
import androidx.health.services.client.proto.DataProto;
import androidx.health.services.client.proto.EventsProto;
import androidx.health.services.client.proto.ResponsesProto;
import b0.c;
import g5.d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import q7.g;
import q7.k;

public final class MeasureCallbackStub extends IMeasureCallback.Stub {
    private static final Companion Companion = new Companion((g) null);
    @Deprecated
    public static final String TAG = "MeasureCallbackStub";
    private final MeasureCallback callback;
    /* access modifiers changed from: private */
    public Executor executor;
    private final ListenerKey listenerKey;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public static final class MeasureCallbackCache {
        public static final Companion Companion = new Companion((g) null);
        public static final MeasureCallbackCache INSTANCE = new MeasureCallbackCache();
        private final Map<MeasureCallbackKey, MeasureCallbackStub> listeners = new HashMap();

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }
        }

        private MeasureCallbackCache() {
        }

        public final synchronized MeasureCallbackStub getOrCreate(DataType<?, ?> dataType, Executor executor, MeasureCallback measureCallback) {
            MeasureCallbackStub measureCallbackStub;
            k.e(dataType, "dataType");
            k.e(executor, "executor");
            k.e(measureCallback, "measureCallback");
            MeasureCallbackKey measureCallbackKey = new MeasureCallbackKey(dataType, measureCallback);
            measureCallbackStub = this.listeners.get(measureCallbackKey);
            if (measureCallbackStub == null) {
                measureCallbackStub = new MeasureCallbackStub(measureCallbackKey, measureCallback, (g) null);
                this.listeners.put(measureCallbackKey, measureCallbackStub);
            }
            measureCallbackStub.executor = executor;
            return measureCallbackStub;
        }

        public final synchronized MeasureCallbackStub remove(DataType<?, ?> dataType, MeasureCallback measureCallback) {
            k.e(dataType, "dataType");
            k.e(measureCallback, "measureCallback");
            return this.listeners.remove(new MeasureCallbackKey(dataType, measureCallback));
        }
    }

    public static final class MeasureCallbackKey {
        private final DataType<?, ?> dataType;
        private final MeasureCallback measureCallback;

        public MeasureCallbackKey(DataType<?, ?> dataType2, MeasureCallback measureCallback2) {
            k.e(dataType2, "dataType");
            k.e(measureCallback2, "measureCallback");
            this.dataType = dataType2;
            this.measureCallback = measureCallback2;
        }

        private final DataType<?, ?> component1() {
            return this.dataType;
        }

        private final MeasureCallback component2() {
            return this.measureCallback;
        }

        public static /* synthetic */ MeasureCallbackKey copy$default(MeasureCallbackKey measureCallbackKey, DataType<?, ?> dataType2, MeasureCallback measureCallback2, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                dataType2 = measureCallbackKey.dataType;
            }
            if ((i8 & 2) != 0) {
                measureCallback2 = measureCallbackKey.measureCallback;
            }
            return measureCallbackKey.copy(dataType2, measureCallback2);
        }

        public final MeasureCallbackKey copy(DataType<?, ?> dataType2, MeasureCallback measureCallback2) {
            k.e(dataType2, "dataType");
            k.e(measureCallback2, "measureCallback");
            return new MeasureCallbackKey(dataType2, measureCallback2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MeasureCallbackKey)) {
                return false;
            }
            MeasureCallbackKey measureCallbackKey = (MeasureCallbackKey) obj;
            return k.a(this.dataType, measureCallbackKey.dataType) && k.a(this.measureCallback, measureCallbackKey.measureCallback);
        }

        public int hashCode() {
            return (this.dataType.hashCode() * 31) + this.measureCallback.hashCode();
        }

        public String toString() {
            return "MeasureCallbackKey(dataType=" + this.dataType + ", measureCallback=" + this.measureCallback + ')';
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.health.services.client.proto.EventsProto$MeasureCallbackEvent$EventCase[] r0 = androidx.health.services.client.proto.EventsProto.MeasureCallbackEvent.EventCase.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.health.services.client.proto.EventsProto$MeasureCallbackEvent$EventCase r1 = androidx.health.services.client.proto.EventsProto.MeasureCallbackEvent.EventCase.DATA_POINT_RESPONSE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.health.services.client.proto.EventsProto$MeasureCallbackEvent$EventCase r1 = androidx.health.services.client.proto.EventsProto.MeasureCallbackEvent.EventCase.AVAILABILITY_RESPONSE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.health.services.client.proto.EventsProto$MeasureCallbackEvent$EventCase r1 = androidx.health.services.client.proto.EventsProto.MeasureCallbackEvent.EventCase.EVENT_NOT_SET     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.health.services.client.impl.MeasureCallbackStub.WhenMappings.<clinit>():void");
        }
    }

    private MeasureCallbackStub(MeasureCallbackKey measureCallbackKey, MeasureCallback measureCallback) {
        this.callback = measureCallback;
        this.listenerKey = new ListenerKey(measureCallbackKey);
        this.executor = d.f4656f;
    }

    public /* synthetic */ MeasureCallbackStub(MeasureCallbackKey measureCallbackKey, MeasureCallback measureCallback, g gVar) {
        this(measureCallbackKey, measureCallback);
    }

    /* access modifiers changed from: private */
    public static final void onMeasureCallbackEvent$lambda$0(MeasureCallbackStub measureCallbackStub, MeasureCallbackEvent measureCallbackEvent) {
        k.e(measureCallbackStub, "this$0");
        k.e(measureCallbackEvent, "$event");
        measureCallbackStub.triggerListener(measureCallbackEvent.getProto());
    }

    private final void triggerListener(EventsProto.MeasureCallbackEvent measureCallbackEvent) {
        EventsProto.MeasureCallbackEvent.EventCase eventCase = measureCallbackEvent.getEventCase();
        int i8 = eventCase == null ? -1 : WhenMappings.$EnumSwitchMapping$0[eventCase.ordinal()];
        if (i8 != -1) {
            if (i8 == 1) {
                ResponsesProto.DataPointsResponse dataPointResponse = measureCallbackEvent.getDataPointResponse();
                k.d(dataPointResponse, "proto.dataPointResponse");
                this.callback.onDataReceived(new DataPointContainer((List<? extends DataPoint<?>>) new DataPointsResponse(dataPointResponse).getDataPoints()));
                return;
            } else if (i8 == 2) {
                MeasureCallback measureCallback = this.callback;
                DataType.Companion companion = DataType.Companion;
                DataProto.DataType dataType = measureCallbackEvent.getAvailabilityResponse().getDataType();
                k.d(dataType, "proto.availabilityResponse.dataType");
                DeltaDataType<? extends Object, ? extends DataPoint<? extends Object>> deltaFromProto$health_services_client_release = companion.deltaFromProto$health_services_client_release(dataType);
                Availability.Companion companion2 = Availability.Companion;
                DataProto.Availability availability = measureCallbackEvent.getAvailabilityResponse().getAvailability();
                k.d(availability, "proto.availabilityResponse.availability");
                measureCallback.onAvailabilityChanged(deltaFromProto$health_services_client_release, companion2.fromProto(availability));
                return;
            } else if (i8 != 3) {
                return;
            }
        }
        Log.w(TAG, "Received unknown event " + measureCallbackEvent.getEventCase());
    }

    public final Executor getExecutor() {
        return this.executor;
    }

    public final ListenerKey getListenerKey() {
        return this.listenerKey;
    }

    public void onMeasureCallbackEvent(MeasureCallbackEvent measureCallbackEvent) {
        k.e(measureCallbackEvent, "event");
        this.executor.execute(new c(this, 2, measureCallbackEvent));
    }
}
