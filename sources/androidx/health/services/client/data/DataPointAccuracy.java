package androidx.health.services.client.data;

import androidx.health.services.client.proto.DataProto;
import c1.c;
import q7.g;
import q7.k;

public abstract class DataPointAccuracy {
    public static final Companion Companion = new Companion((g) null);

    public static final class Companion {

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    androidx.health.services.client.proto.DataProto$DataPointAccuracy$AccuracyCase[] r0 = androidx.health.services.client.proto.DataProto.DataPointAccuracy.AccuracyCase.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.health.services.client.proto.DataProto$DataPointAccuracy$AccuracyCase r1 = androidx.health.services.client.proto.DataProto.DataPointAccuracy.AccuracyCase.HR_ACCURACY     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    androidx.health.services.client.proto.DataProto$DataPointAccuracy$AccuracyCase r1 = androidx.health.services.client.proto.DataProto.DataPointAccuracy.AccuracyCase.LOCATION_ACCURACY     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    androidx.health.services.client.proto.DataProto$DataPointAccuracy$AccuracyCase r1 = androidx.health.services.client.proto.DataProto.DataPointAccuracy.AccuracyCase.ACCURACY_NOT_SET     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    $EnumSwitchMapping$0 = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.health.services.client.data.DataPointAccuracy.Companion.WhenMappings.<clinit>():void");
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final DataPointAccuracy fromProto$health_services_client_release(DataProto.DataPointAccuracy dataPointAccuracy) {
            k.e(dataPointAccuracy, "proto");
            DataProto.DataPointAccuracy.AccuracyCase accuracyCase = dataPointAccuracy.getAccuracyCase();
            int i8 = accuracyCase == null ? -1 : WhenMappings.$EnumSwitchMapping$0[accuracyCase.ordinal()];
            if (i8 != -1) {
                if (i8 == 1) {
                    return new HeartRateAccuracy(dataPointAccuracy);
                }
                if (i8 == 2) {
                    return new LocationAccuracy(dataPointAccuracy);
                }
                if (i8 != 3) {
                    throw new c();
                }
            }
            throw new IllegalStateException("Accuracy not set on " + dataPointAccuracy);
        }
    }

    public final DataProto.DataPointAccuracy getProto$health_services_client_release() {
        if (this instanceof LocationAccuracy) {
            return ((LocationAccuracy) this).getDataPointAccuracyProto$health_services_client_release();
        }
        if (this instanceof HeartRateAccuracy) {
            return ((HeartRateAccuracy) this).getDataPointAccuracyProto$health_services_client_release();
        }
        throw new IllegalStateException("No serialization available for this type.");
    }
}
