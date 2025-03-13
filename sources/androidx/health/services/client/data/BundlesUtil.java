package androidx.health.services.client.data;

import android.os.Bundle;
import androidx.health.services.client.proto.DataProto;
import com.google.protobuf.i;
import com.google.protobuf.y;
import java.util.Map;
import q7.k;

public final class BundlesUtil {
    public static final BundlesUtil INSTANCE = new BundlesUtil();

    private BundlesUtil() {
    }

    public static final Bundle fromProto$health_services_client_release(DataProto.Bundle bundle) {
        k.e(bundle, "proto");
        Bundle bundle2 = new Bundle();
        Map<String, Boolean> boolsMap = bundle.getBoolsMap();
        k.d(boolsMap, "proto.boolsMap");
        for (Map.Entry next : boolsMap.entrySet()) {
            Object value = next.getValue();
            k.d(value, "it.value");
            bundle2.putBoolean((String) next.getKey(), ((Boolean) value).booleanValue());
        }
        Map<String, String> stringsMap = bundle.getStringsMap();
        k.d(stringsMap, "proto.stringsMap");
        for (Map.Entry next2 : stringsMap.entrySet()) {
            bundle2.putString((String) next2.getKey(), (String) next2.getValue());
        }
        Map<String, Integer> intsMap = bundle.getIntsMap();
        k.d(intsMap, "proto.intsMap");
        for (Map.Entry next3 : intsMap.entrySet()) {
            Object value2 = next3.getValue();
            k.d(value2, "it.value");
            bundle2.putInt((String) next3.getKey(), ((Number) value2).intValue());
        }
        Map<String, Long> longsMap = bundle.getLongsMap();
        k.d(longsMap, "proto.longsMap");
        for (Map.Entry next4 : longsMap.entrySet()) {
            Object value3 = next4.getValue();
            k.d(value3, "it.value");
            bundle2.putLong((String) next4.getKey(), ((Number) value3).longValue());
        }
        Map<String, Float> floatsMap = bundle.getFloatsMap();
        k.d(floatsMap, "proto.floatsMap");
        for (Map.Entry next5 : floatsMap.entrySet()) {
            Object value4 = next5.getValue();
            k.d(value4, "it.value");
            bundle2.putFloat((String) next5.getKey(), ((Number) value4).floatValue());
        }
        Map<String, Double> doublesMap = bundle.getDoublesMap();
        k.d(doublesMap, "proto.doublesMap");
        for (Map.Entry next6 : doublesMap.entrySet()) {
            Object value5 = next6.getValue();
            k.d(value5, "it.value");
            bundle2.putDouble((String) next6.getKey(), ((Number) value5).doubleValue());
        }
        Map<String, Integer> bytesMap = bundle.getBytesMap();
        k.d(bytesMap, "proto.bytesMap");
        for (Map.Entry next7 : bytesMap.entrySet()) {
            bundle2.putByte((String) next7.getKey(), (byte) ((Number) next7.getValue()).intValue());
        }
        Map<String, i> byteArraysMap = bundle.getByteArraysMap();
        k.d(byteArraysMap, "proto.byteArraysMap");
        for (Map.Entry next8 : byteArraysMap.entrySet()) {
            bundle2.putByteArray((String) next8.getKey(), ((i) next8.getValue()).s());
        }
        Map<String, DataProto.Bundle> bundlesMap = bundle.getBundlesMap();
        k.d(bundlesMap, "proto.bundlesMap");
        for (Map.Entry next9 : bundlesMap.entrySet()) {
            Object value6 = next9.getValue();
            k.d(value6, "it.value");
            bundle2.putBundle((String) next9.getKey(), fromProto$health_services_client_release((DataProto.Bundle) value6));
        }
        return bundle2;
    }

    public static final DataProto.Bundle toProto$health_services_client_release(Bundle bundle) {
        k.e(bundle, "bundle");
        DataProto.Bundle.Builder newBuilder = DataProto.Bundle.newBuilder();
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            if (obj instanceof Boolean) {
                newBuilder.putBools(next, ((Boolean) obj).booleanValue());
            } else if (obj instanceof String) {
                newBuilder.putStrings(next, (String) obj);
            } else if (obj instanceof Integer) {
                newBuilder.putInts(next, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                newBuilder.putLongs(next, ((Number) obj).longValue());
            } else if (obj instanceof Float) {
                newBuilder.putFloats(next, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                newBuilder.putDoubles(next, ((Number) obj).doubleValue());
            } else if (obj instanceof Byte) {
                newBuilder.putBytes(next, ((Number) obj).byteValue());
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                i.f fVar = i.f3648g;
                newBuilder.putByteArrays(next, i.k(bArr, 0, bArr.length));
            } else if ((obj instanceof Bundle) && !k.a(obj, bundle)) {
                newBuilder.putBundles(next, toProto$health_services_client_release((Bundle) obj));
            }
        }
        y build = newBuilder.build();
        k.d(build, "builder.build()");
        return (DataProto.Bundle) build;
    }
}
