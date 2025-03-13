package androidx.wear.watchface.control;

import android.content.ComponentName;
import android.graphics.RectF;
import android.os.Bundle;
import androidx.wear.watchface.control.b;
import androidx.wear.watchface.data.BoundingArcWireFormat;
import androidx.wear.watchface.data.ComplicationSlotMetadataWireFormat;
import i7.f;
import i7.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n1.a;
import n1.h;
import n1.t0;
import q1.a0;
import q7.k;
import q7.l;

public final class d extends l implements p7.l<b.a, ComplicationSlotMetadataWireFormat[]> {

    /* renamed from: f  reason: collision with root package name */
    public static final d f2259f = new d();

    public d() {
        super(1);
    }

    public final Object invoke(Object obj) {
        ArrayList arrayList;
        Iterator it;
        Bundle bundle;
        BoundingArcWireFormat boundingArcWireFormat;
        b.a aVar = (b.a) obj;
        k.e(aVar, "it");
        t0 t0Var = t0.this;
        LinkedHashMap linkedHashMap = t0Var.a(new u1.b(t0Var.b())).e;
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            int i8 = ((h) entry.getValue()).f5577s.f6293f.f6450f;
            int intValue = ((Number) entry.getKey()).intValue();
            Set<q1.d> keySet = ((h) entry.getValue()).f5574o.f6279a.keySet();
            ArrayList arrayList3 = new ArrayList(f.M(keySet));
            for (q1.d dVar : keySet) {
                arrayList3.add(Integer.valueOf(dVar.f6450f));
            }
            int[] b02 = i.b0(arrayList3);
            RectF[] rectFArr = (RectF[]) ((h) entry.getValue()).f5574o.f6279a.values().toArray(new RectF[0]);
            List<T> c02 = i.c0(((h) entry.getValue()).f5574o.f6280b.values());
            int i9 = ((h) entry.getValue()).f5562b;
            int[] a9 = a0.a(((h) entry.getValue()).f5564d);
            ArrayList<ComponentName> a10 = ((h) entry.getValue()).f5577s.a();
            int i10 = ((h) entry.getValue()).f5577s.e;
            q1.d dVar2 = ((h) entry.getValue()).f5577s.f6290b;
            int i11 = dVar2 != null ? dVar2.f6450f : i8;
            q1.d dVar3 = ((h) entry.getValue()).f5577s.f6292d;
            int i12 = dVar3 != null ? dVar3.f6450f : i8;
            boolean z8 = ((h) entry.getValue()).e;
            boolean z9 = ((h) entry.getValue()).f5565f;
            Bundle bundle2 = ((h) entry.getValue()).f5569j;
            a aVar2 = ((h) entry.getValue()).f5567h;
            if (aVar2 != null) {
                it = it2;
                bundle = bundle2;
                arrayList = arrayList2;
                boundingArcWireFormat = new BoundingArcWireFormat(aVar2.f5494a, aVar2.f5495b, aVar2.f5496c);
            } else {
                it = it2;
                arrayList = arrayList2;
                bundle = bundle2;
                boundingArcWireFormat = null;
            }
            arrayList2 = arrayList;
            arrayList2.add(new ComplicationSlotMetadataWireFormat(intValue, b02, rectFArr, c02, i9, a9, a10, i10, i8, i11, i12, z8, z9, bundle, boundingArcWireFormat));
            it2 = it;
        }
        return (ComplicationSlotMetadataWireFormat[]) arrayList2.toArray(new ComplicationSlotMetadataWireFormat[0]);
    }
}
