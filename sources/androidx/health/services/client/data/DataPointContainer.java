package androidx.health.services.client.data;

import i7.h;
import i7.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import q7.k;

public final class DataPointContainer {
    private final Map<DataType<?, ?>, List<DataPoint<?>>> dataPoints;
    private final Set<DataType<?, ?>> dataTypes;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DataPointContainer(java.util.List<? extends androidx.health.services.client.data.DataPoint<?>> r5) {
        /*
            r4 = this;
            java.lang.String r0 = "dataPointList"
            q7.k.e(r5, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x000e:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0033
            java.lang.Object r1 = r5.next()
            r2 = r1
            androidx.health.services.client.data.DataPoint r2 = (androidx.health.services.client.data.DataPoint) r2
            androidx.health.services.client.data.DataType r2 = r2.getDataType()
            java.lang.Object r3 = r0.get(r2)
            if (r3 != 0) goto L_0x002d
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.put(r2, r3)
        L_0x002d:
            java.util.List r3 = (java.util.List) r3
            r3.add(r1)
            goto L_0x000e
        L_0x0033:
            r4.<init>((java.util.Map<androidx.health.services.client.data.DataType<?, ?>, ? extends java.util.List<? extends androidx.health.services.client.data.DataPoint<?>>>) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.services.client.data.DataPointContainer.<init>(java.util.List):void");
    }

    public DataPointContainer(Map<DataType<?, ?>, ? extends List<? extends DataPoint<?>>> map) {
        k.e(map, "dataPoints");
        this.dataPoints = map;
        this.dataTypes = map.keySet();
    }

    public final List<CumulativeDataPoint<?>> getCumulativeDataPoints() {
        Map<DataType<?, ?>, List<DataPoint<?>>> map = this.dataPoints;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<DataType<?, ?>, List<DataPoint<?>>> value : map.entrySet()) {
            h.S((List) value.getValue(), arrayList);
        }
        return i.c0(i.T(arrayList, CumulativeDataPoint.class));
    }

    public final <T extends Number, D extends DataPoint<T>> D getData(AggregateDataType<T, D> aggregateDataType) {
        k.e(aggregateDataType, "type");
        List<DataPoint<?>> list = this.dataPoints.get(aggregateDataType);
        D d9 = null;
        List list2 = list instanceof List ? list : null;
        if (list2 == null) {
            return null;
        }
        if (!list2.isEmpty()) {
            d9 = list2.get(list2.size() - 1);
        }
        return (DataPoint) d9;
    }

    public final <T, D extends DataPoint<T>> List<D> getData(DeltaDataType<T, D> deltaDataType) {
        k.e(deltaDataType, "type");
        List<DataPoint<?>> list = this.dataPoints.get(deltaDataType);
        List<D> list2 = list instanceof List ? list : null;
        return list2 == null ? i7.k.f4879f : list2;
    }

    public final Map<DataType<?, ?>, List<DataPoint<?>>> getDataPoints$health_services_client_release() {
        return this.dataPoints;
    }

    public final Set<DataType<?, ?>> getDataTypes() {
        return this.dataTypes;
    }

    public final List<IntervalDataPoint<?>> getIntervalDataPoints() {
        Map<DataType<?, ?>, List<DataPoint<?>>> map = this.dataPoints;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<DataType<?, ?>, List<DataPoint<?>>> value : map.entrySet()) {
            h.S((List) value.getValue(), arrayList);
        }
        return i.c0(i.T(arrayList, IntervalDataPoint.class));
    }

    public final List<SampleDataPoint<?>> getSampleDataPoints() {
        Map<DataType<?, ?>, List<DataPoint<?>>> map = this.dataPoints;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<DataType<?, ?>, List<DataPoint<?>>> value : map.entrySet()) {
            h.S((List) value.getValue(), arrayList);
        }
        return i.c0(i.T(arrayList, SampleDataPoint.class));
    }

    public final List<StatisticalDataPoint<?>> getStatisticalDataPoints() {
        Map<DataType<?, ?>, List<DataPoint<?>>> map = this.dataPoints;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<DataType<?, ?>, List<DataPoint<?>>> value : map.entrySet()) {
            h.S((List) value.getValue(), arrayList);
        }
        return i.c0(i.T(arrayList, StatisticalDataPoint.class));
    }
}
