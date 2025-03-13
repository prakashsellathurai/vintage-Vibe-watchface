package androidx.wear.watchface.data;

import android.graphics.RectF;
import g1.a;
import java.util.List;

public final class ComplicationSlotMetadataWireFormatParcelizer {
    public static ComplicationSlotMetadataWireFormat read(a aVar) {
        ComplicationSlotMetadataWireFormat complicationSlotMetadataWireFormat = new ComplicationSlotMetadataWireFormat();
        complicationSlotMetadataWireFormat.f2307f = aVar.t(complicationSlotMetadataWireFormat.f2307f, 1);
        complicationSlotMetadataWireFormat.f2316o = aVar.i(10, complicationSlotMetadataWireFormat.f2316o);
        complicationSlotMetadataWireFormat.f2317p = aVar.k(11, complicationSlotMetadataWireFormat.f2317p);
        complicationSlotMetadataWireFormat.f2318q = aVar.t(complicationSlotMetadataWireFormat.f2318q, 12);
        complicationSlotMetadataWireFormat.r = aVar.t(complicationSlotMetadataWireFormat.r, 13);
        complicationSlotMetadataWireFormat.f2319s = (BoundingArcWireFormat) aVar.F(complicationSlotMetadataWireFormat.f2319s, 14);
        complicationSlotMetadataWireFormat.f2320t = aVar.u(15, complicationSlotMetadataWireFormat.f2320t);
        int[] iArr = complicationSlotMetadataWireFormat.f2308g;
        int[] iArr2 = null;
        if (aVar.q(2)) {
            int s8 = aVar.s();
            if (s8 < 0) {
                iArr = null;
            } else {
                int[] iArr3 = new int[s8];
                for (int i8 = 0; i8 < s8; i8++) {
                    iArr3[i8] = aVar.s();
                }
                iArr = iArr3;
            }
        }
        complicationSlotMetadataWireFormat.f2308g = iArr;
        Object[] objArr = complicationSlotMetadataWireFormat.f2309h;
        if (aVar.q(3)) {
            objArr = aVar.g(objArr);
        }
        complicationSlotMetadataWireFormat.f2309h = (RectF[]) objArr;
        complicationSlotMetadataWireFormat.f2310i = aVar.t(complicationSlotMetadataWireFormat.f2310i, 4);
        int[] iArr4 = complicationSlotMetadataWireFormat.f2311j;
        if (aVar.q(5)) {
            int s9 = aVar.s();
            if (s9 >= 0) {
                iArr2 = new int[s9];
                for (int i9 = 0; i9 < s9; i9++) {
                    iArr2[i9] = aVar.s();
                }
            }
            iArr4 = iArr2;
        }
        complicationSlotMetadataWireFormat.f2311j = iArr4;
        complicationSlotMetadataWireFormat.f2312k = aVar.u(6, complicationSlotMetadataWireFormat.f2312k);
        complicationSlotMetadataWireFormat.f2313l = aVar.t(complicationSlotMetadataWireFormat.f2313l, 7);
        complicationSlotMetadataWireFormat.f2314m = aVar.t(complicationSlotMetadataWireFormat.f2314m, 8);
        complicationSlotMetadataWireFormat.f2315n = aVar.i(9, complicationSlotMetadataWireFormat.f2315n);
        return complicationSlotMetadataWireFormat;
    }

    public static void write(ComplicationSlotMetadataWireFormat complicationSlotMetadataWireFormat, a aVar) {
        aVar.H(false, false);
        aVar.U(complicationSlotMetadataWireFormat.f2307f, 1);
        aVar.J(10, complicationSlotMetadataWireFormat.f2316o);
        aVar.L(11, complicationSlotMetadataWireFormat.f2317p);
        aVar.U(complicationSlotMetadataWireFormat.f2318q, 12);
        aVar.U(complicationSlotMetadataWireFormat.r, 13);
        aVar.g0(complicationSlotMetadataWireFormat.f2319s, 14);
        List<RectF> list = complicationSlotMetadataWireFormat.f2320t;
        if (list != null) {
            aVar.V(15, list);
        }
        int[] iArr = complicationSlotMetadataWireFormat.f2308g;
        aVar.G(2);
        if (iArr != null) {
            aVar.T(r3);
            for (int T : iArr) {
                aVar.T(T);
            }
        } else {
            aVar.T(-1);
        }
        RectF[] rectFArr = complicationSlotMetadataWireFormat.f2309h;
        aVar.G(3);
        aVar.I(rectFArr);
        aVar.U(complicationSlotMetadataWireFormat.f2310i, 4);
        int[] iArr2 = complicationSlotMetadataWireFormat.f2311j;
        aVar.G(5);
        if (iArr2 != null) {
            aVar.T(r2);
            for (int T2 : iArr2) {
                aVar.T(T2);
            }
        } else {
            aVar.T(-1);
        }
        aVar.V(6, complicationSlotMetadataWireFormat.f2312k);
        aVar.U(complicationSlotMetadataWireFormat.f2313l, 7);
        aVar.U(complicationSlotMetadataWireFormat.f2314m, 8);
        aVar.J(9, complicationSlotMetadataWireFormat.f2315n);
    }
}
