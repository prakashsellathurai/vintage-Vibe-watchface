package n1;

import android.content.ComponentName;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import androidx.wear.watchface.data.BoundingArcWireFormat;
import androidx.wear.watchface.data.ComplicationStateWireFormat;
import androidx.wear.watchface.data.IdAndComplicationStateWireFormat;
import h7.h;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k3.j;
import n1.t0;
import p1.f;
import q1.a0;
import q1.d;
import q7.k;
import v1.c;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final u1.b f5651a;

    /* renamed from: b  reason: collision with root package name */
    public j1 f5652b;

    /* renamed from: c  reason: collision with root package name */
    public j0 f5653c;

    /* renamed from: d  reason: collision with root package name */
    public b0 f5654d;
    public final LinkedHashMap e;

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f5655f;

    /* renamed from: g  reason: collision with root package name */
    public final LinkedHashMap f5656g;

    /* renamed from: h  reason: collision with root package name */
    public final HashSet<b> f5657h;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final f f5658a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f5659b;

        /* renamed from: c  reason: collision with root package name */
        public final int f5660c;

        /* renamed from: d  reason: collision with root package name */
        public final Integer f5661d;
        public final Integer e;

        public a(f fVar, boolean z8, int i8, Integer num, Integer num2) {
            k.e(fVar, "complicationSlotBounds");
            this.f5658a = fVar;
            this.f5659b = z8;
            this.f5660c = i8;
            this.f5661d = num;
            this.e = num2;
        }
    }

    public interface b {
    }

    public l(Collection<h> collection, u1.b bVar) {
        this.f5651a = bVar;
        int C = a1.a.C(i7.f.M(collection));
        int i8 = 16;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C < 16 ? 16 : C);
        for (T next : collection) {
            linkedHashMap.put(Integer.valueOf(((h) next).f5561a), next);
        }
        this.e = linkedHashMap;
        this.f5655f = new HashMap();
        int C2 = a1.a.C(i7.f.M(collection));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2 >= 16 ? C2 : i8);
        for (h hVar : collection) {
            linkedHashMap2.put(Integer.valueOf(hVar.f5561a), new a(hVar.f5574o, hVar.f5576q, hVar.f5580v, hVar.f5581x, hVar.f5582z));
        }
        this.f5656g = linkedHashMap2;
        this.f5657h = new HashSet<>();
        for (Map.Entry value : this.e.entrySet()) {
            h hVar2 = (h) value.getValue();
            hVar2.getClass();
            hVar2.f5568i = this;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0063, code lost:
        r3 = r4.f7669b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(u1.m.c.C0133c r8) {
        /*
            r7 = this;
            java.util.LinkedHashMap r0 = r7.e
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00aa
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r1 = r1.getValue()
            n1.h r1 = (n1.h) r1
            java.util.Collection<u1.m$c$b> r3 = r8.f7674c
            java.util.Iterator r3 = r3.iterator()
        L_0x002c:
            boolean r4 = r3.hasNext()
            r5 = 1
            if (r4 == 0) goto L_0x0044
            java.lang.Object r4 = r3.next()
            r6 = r4
            u1.m$c$b r6 = (u1.m.c.b) r6
            int r6 = r6.f7668a
            if (r6 != r2) goto L_0x0040
            r6 = r5
            goto L_0x0041
        L_0x0040:
            r6 = 0
        L_0x0041:
            if (r6 == 0) goto L_0x002c
            goto L_0x0045
        L_0x0044:
            r4 = 0
        L_0x0045:
            u1.m$c$b r4 = (u1.m.c.b) r4
            java.util.LinkedHashMap r3 = r7.f5656g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r3.get(r2)
            q7.k.b(r2)
            n1.l$a r2 = (n1.l.a) r2
            if (r4 == 0) goto L_0x005c
            p1.f r3 = r4.f7670c
            if (r3 != 0) goto L_0x005e
        L_0x005c:
            p1.f r3 = r2.f5658a
        L_0x005e:
            r1.i(r3)
            if (r4 == 0) goto L_0x006c
            java.lang.Boolean r3 = r4.f7669b
            if (r3 == 0) goto L_0x006c
            boolean r3 = r3.booleanValue()
            goto L_0x006e
        L_0x006c:
            boolean r3 = r2.f5659b
        L_0x006e:
            boolean r6 = r1.f5576q
            if (r6 != r3) goto L_0x0073
            goto L_0x0077
        L_0x0073:
            r1.f5576q = r3
            r1.f5575p = r5
        L_0x0077:
            if (r4 == 0) goto L_0x0082
            java.lang.Integer r3 = r4.f7671d
            if (r3 == 0) goto L_0x0082
            int r3 = r3.intValue()
            goto L_0x0084
        L_0x0082:
            int r3 = r2.f5660c
        L_0x0084:
            r1.g(r3)
            if (r4 == 0) goto L_0x008d
            java.lang.Integer r3 = r4.e
            if (r3 != 0) goto L_0x008f
        L_0x008d:
            java.lang.Integer r3 = r2.f5661d
        L_0x008f:
            r1.j(r3)
            if (r4 == 0) goto L_0x0098
            java.lang.Integer r3 = r4.f7672f
            if (r3 != 0) goto L_0x009a
        L_0x0098:
            java.lang.Integer r3 = r2.e
        L_0x009a:
            java.lang.Integer r2 = r1.f5582z
            boolean r2 = q7.k.a(r2, r3)
            if (r2 == 0) goto L_0x00a4
            goto L_0x000a
        L_0x00a4:
            r1.f5582z = r3
            r1.y = r5
            goto L_0x000a
        L_0x00aa:
            r7.f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.l.a(u1.m$c$c):void");
    }

    public final h b(p7.l<? super h, Boolean> lVar) {
        h hVar = null;
        int i8 = 0;
        for (Map.Entry entry : this.e.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            h hVar2 = (h) entry.getValue();
            if (lVar.invoke(hVar2).booleanValue() && (hVar == null || i8 > intValue)) {
                hVar = hVar2;
                i8 = intValue;
            }
        }
        return hVar;
    }

    public final ArrayList c(Rect rect) {
        ArrayList arrayList;
        int i8;
        Integer num;
        BoundingArcWireFormat boundingArcWireFormat;
        Rect rect2 = rect;
        LinkedHashMap linkedHashMap = this.e;
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int i9 = ((h) entry.getValue()).f5577s.f6293f.f6450f;
            int intValue = ((Number) entry.getKey()).intValue();
            Rect b9 = ((h) entry.getValue()).b(rect2, false);
            Rect b10 = ((h) entry.getValue()).b(rect2, true);
            int i10 = ((h) entry.getValue()).f5562b;
            List<d> list = ((h) entry.getValue()).f5564d;
            k.e(list, "types");
            int[] a9 = a0.a(list);
            ArrayList<ComponentName> a10 = ((h) entry.getValue()).f5577s.a();
            int i11 = ((h) entry.getValue()).f5577s.e;
            d dVar = ((h) entry.getValue()).f5577s.f6290b;
            int i12 = dVar != null ? dVar.f6450f : i9;
            d dVar2 = ((h) entry.getValue()).f5577s.f6292d;
            int i13 = dVar2 != null ? dVar2.f6450f : i9;
            boolean z8 = ((h) entry.getValue()).f5576q;
            Iterator it2 = it;
            boolean z9 = ((h) entry.getValue()).e;
            int i14 = ((h) entry.getValue()).c().a().f6418a.f6450f;
            boolean z10 = z8;
            boolean z11 = ((h) entry.getValue()).f5565f;
            Bundle bundle = ((h) entry.getValue()).f5569j;
            Integer num2 = ((h) entry.getValue()).f5581x;
            Integer num3 = ((h) entry.getValue()).f5582z;
            a aVar = ((h) entry.getValue()).f5567h;
            if (aVar != null) {
                num = num3;
                i8 = intValue;
                arrayList = arrayList2;
                boundingArcWireFormat = new BoundingArcWireFormat(aVar.f5494a, aVar.f5495b, aVar.f5496c);
            } else {
                arrayList = arrayList2;
                num = num3;
                i8 = intValue;
                boundingArcWireFormat = null;
            }
            ComplicationStateWireFormat complicationStateWireFormat = r5;
            ComplicationStateWireFormat complicationStateWireFormat2 = new ComplicationStateWireFormat(b9, b10, i10, a9, a10, i11, i9, i12, i13, z10, z9, i14, z11, bundle, num2, num, boundingArcWireFormat);
            ArrayList arrayList3 = arrayList;
            arrayList3.add(new IdAndComplicationStateWireFormat(i8, complicationStateWireFormat));
            rect2 = rect;
            arrayList2 = arrayList3;
            it = it2;
        }
        return arrayList2;
    }

    public final j0 d() {
        j0 j0Var = this.f5653c;
        if (j0Var != null) {
            return j0Var;
        }
        k.h("watchFaceHostApi");
        throw null;
    }

    public final void e(b0 b0Var, t0.c.i iVar) {
        k.e(b0Var, "renderer");
        c cVar = new c("ComplicationSlotsManager.init");
        try {
            this.f5654d = b0Var;
            LinkedHashMap linkedHashMap = this.e;
            for (Map.Entry value : linkedHashMap.entrySet()) {
                h hVar = (h) value.getValue();
                hVar.d(iVar, b0Var.f5514a.f5639j);
                hVar.c().b(b0Var);
            }
            Collection values = linkedHashMap.values();
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object next : values) {
                if (hashSet.add(((h) next).c())) {
                    arrayList.add(next);
                }
            }
            if (arrayList.size() == linkedHashMap.values().size()) {
                f();
                h hVar2 = h.f4787a;
                j.n(cVar, (Throwable) null);
                return;
            }
            throw new IllegalArgumentException("Complication renderer instances are not sharable.".toString());
        } catch (Throwable th) {
            j.n(cVar, th);
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.a(l.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        k.c(obj, "null cannot be cast to non-null type androidx.wear.watchface.ComplicationSlotsManager");
        return k.a(this.e, ((l) obj).e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b A[Catch:{ all -> 0x00a3, all -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0059 A[SYNTHETIC, Splitter:B:27:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00a5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f() {
        /*
            r13 = this;
            v1.c r0 = new v1.c
            java.lang.String r1 = "ComplicationSlotsManager.updateComplications"
            r0.<init>(r1)
            n1.j0 r1 = r13.f5653c     // Catch:{ all -> 0x00a3 }
            r2 = 0
            if (r1 != 0) goto L_0x0010
            k3.j.n(r0, r2)
            return
        L_0x0010:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00a3 }
            r1.<init>()     // Catch:{ all -> 0x00a3 }
            java.util.LinkedHashMap r3 = r13.e     // Catch:{ all -> 0x00a3 }
            java.util.Set r3 = r3.entrySet()     // Catch:{ all -> 0x00a3 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00a3 }
            r4 = 0
            r5 = r4
            r6 = r5
        L_0x0022:
            boolean r7 = r3.hasNext()     // Catch:{ all -> 0x00a3 }
            if (r7 == 0) goto L_0x00a9
            java.lang.Object r7 = r3.next()     // Catch:{ all -> 0x00a3 }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ all -> 0x00a3 }
            java.lang.Object r8 = r7.getKey()     // Catch:{ all -> 0x00a3 }
            java.lang.Number r8 = (java.lang.Number) r8     // Catch:{ all -> 0x00a3 }
            int r8 = r8.intValue()     // Catch:{ all -> 0x00a3 }
            java.lang.Object r7 = r7.getValue()     // Catch:{ all -> 0x00a3 }
            n1.h r7 = (n1.h) r7     // Catch:{ all -> 0x00a3 }
            r9 = 1
            if (r5 != 0) goto L_0x0048
            boolean r5 = r7.f5575p     // Catch:{ all -> 0x00a3 }
            if (r5 == 0) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            r5 = r4
            goto L_0x0049
        L_0x0048:
            r5 = r9
        L_0x0049:
            if (r6 != 0) goto L_0x0052
            boolean r6 = r7.f5575p     // Catch:{ all -> 0x00a3 }
            if (r6 == 0) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r6 = r4
            goto L_0x0053
        L_0x0052:
            r6 = r9
        L_0x0053:
            boolean r10 = r7.f5576q     // Catch:{ all -> 0x00a3 }
            p1.g r11 = r7.f5577s
            if (r10 == 0) goto L_0x00a5
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x00a3 }
            r1.add(r8)     // Catch:{ all -> 0x00a3 }
            if (r6 != 0) goto L_0x0078
            boolean r6 = r7.A     // Catch:{ all -> 0x00a3 }
            if (r6 != 0) goto L_0x0078
            boolean r6 = r7.f5573n     // Catch:{ all -> 0x00a3 }
            if (r6 != 0) goto L_0x0078
            boolean r6 = r7.f5579u     // Catch:{ all -> 0x00a3 }
            if (r6 != 0) goto L_0x0078
            boolean r6 = r7.w     // Catch:{ all -> 0x00a3 }
            if (r6 != 0) goto L_0x0078
            boolean r6 = r7.y     // Catch:{ all -> 0x00a3 }
            if (r6 == 0) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r9 = r4
        L_0x0078:
            boolean r6 = r7.r     // Catch:{ all -> 0x00a3 }
            if (r6 != 0) goto L_0x0080
            boolean r6 = r7.f5578t     // Catch:{ all -> 0x00a3 }
            if (r6 == 0) goto L_0x0093
        L_0x0080:
            n1.j0 r6 = r13.d()     // Catch:{ all -> 0x00a3 }
            int r8 = r7.f5561a     // Catch:{ all -> 0x00a3 }
            java.util.ArrayList r10 = r11.a()     // Catch:{ all -> 0x00a3 }
            int r12 = r11.e     // Catch:{ all -> 0x00a3 }
            q1.d r11 = r11.f6293f     // Catch:{ all -> 0x00a3 }
            int r11 = r11.f6450f     // Catch:{ all -> 0x00a3 }
            r6.k(r8, r10, r12, r11)     // Catch:{ all -> 0x00a3 }
        L_0x0093:
            r7.A = r4     // Catch:{ all -> 0x00a3 }
            r7.f5573n = r4     // Catch:{ all -> 0x00a3 }
            r7.r = r4     // Catch:{ all -> 0x00a3 }
            r7.f5578t = r4     // Catch:{ all -> 0x00a3 }
            r7.f5579u = r4     // Catch:{ all -> 0x00a3 }
            r7.w = r4     // Catch:{ all -> 0x00a3 }
            r7.y = r4     // Catch:{ all -> 0x00a3 }
            r6 = r9
            goto L_0x00a5
        L_0x00a3:
            r13 = move-exception
            goto L_0x00c5
        L_0x00a5:
            r7.f5575p = r4     // Catch:{ all -> 0x00a3 }
            goto L_0x0022
        L_0x00a9:
            if (r5 == 0) goto L_0x00b6
            n1.j0 r3 = r13.d()     // Catch:{ all -> 0x00a3 }
            int[] r1 = i7.i.b0(r1)     // Catch:{ all -> 0x00a3 }
            r3.j(r1)     // Catch:{ all -> 0x00a3 }
        L_0x00b6:
            if (r6 == 0) goto L_0x00bf
            n1.j0 r13 = r13.d()     // Catch:{ all -> 0x00a3 }
            r13.g()     // Catch:{ all -> 0x00a3 }
        L_0x00bf:
            h7.h r13 = h7.h.f4787a     // Catch:{ all -> 0x00a3 }
            k3.j.n(r0, r2)
            return
        L_0x00c5:
            throw r13     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            r1 = move-exception
            k3.j.n(r0, r13)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.l.f():void");
    }

    public final AutoCloseable g(Map<Integer, ? extends q1.b> map, Instant instant) {
        g gVar;
        k.e(map, "slotIdToData");
        k.e(instant, "instant");
        ArrayList arrayList = new ArrayList();
        k kVar = new k(arrayList);
        try {
            for (Map.Entry next : map.entrySet()) {
                int intValue = ((Number) next.getKey()).intValue();
                q1.b bVar = (q1.b) next.getValue();
                h hVar = (h) this.e.get(Integer.valueOf(intValue));
                if (hVar == null) {
                    Log.e("ComplicationSlotsManager", "setComplicationDataForScreenshot failed due to invalid complicationSlotId=" + intValue + " with data=" + bVar);
                } else {
                    k.e(bVar, "complicationData");
                    gVar = new g(hVar, bVar, hVar.E, hVar.f5571l);
                    hVar.k(bVar, instant);
                    hVar.f(instant, true, true);
                    arrayList.add(gVar);
                }
            }
            return kVar;
        } catch (Throwable th) {
            kVar.close();
            throw th;
        }
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
