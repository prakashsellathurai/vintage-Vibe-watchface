package androidx.health.services.client.data;

import a1.a;
import androidx.health.services.client.proto.DataProto;
import c1.c;
import java.util.List;
import q7.g;
import q7.k;

public final class ComparisonType {
    public static final Companion Companion = new Companion((g) null);
    public static final ComparisonType GREATER_THAN;
    public static final ComparisonType GREATER_THAN_OR_EQUAL;
    public static final ComparisonType LESS_THAN;
    public static final ComparisonType LESS_THAN_OR_EQUAL;
    public static final ComparisonType UNKNOWN = new ComparisonType(0, "UNKNOWN");
    public static final List<ComparisonType> VALUES;
    private final int id;
    private final String name;

    public static final class Companion {

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    androidx.health.services.client.proto.DataProto$ComparisonType[] r0 = androidx.health.services.client.proto.DataProto.ComparisonType.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.health.services.client.proto.DataProto$ComparisonType r1 = androidx.health.services.client.proto.DataProto.ComparisonType.COMPARISON_TYPE_GREATER_THAN     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    androidx.health.services.client.proto.DataProto$ComparisonType r1 = androidx.health.services.client.proto.DataProto.ComparisonType.COMPARISON_TYPE_GREATER_THAN_OR_EQUAL     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    androidx.health.services.client.proto.DataProto$ComparisonType r1 = androidx.health.services.client.proto.DataProto.ComparisonType.COMPARISON_TYPE_LESS_THAN     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    androidx.health.services.client.proto.DataProto$ComparisonType r1 = androidx.health.services.client.proto.DataProto.ComparisonType.COMPARISON_TYPE_LESS_THAN_OR_EQUAL     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    androidx.health.services.client.proto.DataProto$ComparisonType r1 = androidx.health.services.client.proto.DataProto.ComparisonType.COMPARISON_TYPE_UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    $EnumSwitchMapping$0 = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.health.services.client.data.ComparisonType.Companion.WhenMappings.<clinit>():void");
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final ComparisonType fromProto$health_services_client_release(DataProto.ComparisonType comparisonType) {
            k.e(comparisonType, "proto");
            int i8 = WhenMappings.$EnumSwitchMapping$0[comparisonType.ordinal()];
            if (i8 == 1) {
                return ComparisonType.GREATER_THAN;
            }
            if (i8 == 2) {
                return ComparisonType.GREATER_THAN_OR_EQUAL;
            }
            if (i8 == 3) {
                return ComparisonType.LESS_THAN;
            }
            if (i8 == 4) {
                return ComparisonType.LESS_THAN_OR_EQUAL;
            }
            if (i8 == 5) {
                return ComparisonType.UNKNOWN;
            }
            throw new c();
        }
    }

    static {
        ComparisonType comparisonType = new ComparisonType(1, "GREATER_THAN");
        GREATER_THAN = comparisonType;
        ComparisonType comparisonType2 = new ComparisonType(2, "GREATER_THAN_OR_EQUAL");
        GREATER_THAN_OR_EQUAL = comparisonType2;
        ComparisonType comparisonType3 = new ComparisonType(3, "LESS_THAN");
        LESS_THAN = comparisonType3;
        ComparisonType comparisonType4 = new ComparisonType(4, "LESS_THAN_OR_EQUAL");
        LESS_THAN_OR_EQUAL = comparisonType4;
        VALUES = a.B(comparisonType, comparisonType2, comparisonType3, comparisonType4);
    }

    private ComparisonType(int i8, String str) {
        this.id = i8;
        this.name = str;
    }

    public static final ComparisonType fromProto$health_services_client_release(DataProto.ComparisonType comparisonType) {
        return Companion.fromProto$health_services_client_release(comparisonType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ComparisonType) && this.id == ((ComparisonType) obj).id;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.id;
    }

    public final DataProto.ComparisonType toProto$health_services_client_release() {
        return k.a(this, GREATER_THAN) ? DataProto.ComparisonType.COMPARISON_TYPE_GREATER_THAN : k.a(this, GREATER_THAN_OR_EQUAL) ? DataProto.ComparisonType.COMPARISON_TYPE_GREATER_THAN_OR_EQUAL : k.a(this, LESS_THAN) ? DataProto.ComparisonType.COMPARISON_TYPE_LESS_THAN : k.a(this, LESS_THAN_OR_EQUAL) ? DataProto.ComparisonType.COMPARISON_TYPE_LESS_THAN_OR_EQUAL : DataProto.ComparisonType.COMPARISON_TYPE_UNKNOWN;
    }

    public String toString() {
        return this.name;
    }
}
