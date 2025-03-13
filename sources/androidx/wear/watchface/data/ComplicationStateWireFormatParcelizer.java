package androidx.wear.watchface.data;

import android.graphics.Rect;
import g1.a;

public final class ComplicationStateWireFormatParcelizer {
    public static ComplicationStateWireFormat read(a aVar) {
        ComplicationStateWireFormat complicationStateWireFormat = new ComplicationStateWireFormat();
        complicationStateWireFormat.f2321f = (Rect) aVar.z(complicationStateWireFormat.f2321f, 1);
        complicationStateWireFormat.f2330o = aVar.i(10, complicationStateWireFormat.f2330o);
        complicationStateWireFormat.f2331p = aVar.k(11, complicationStateWireFormat.f2331p);
        complicationStateWireFormat.f2332q = aVar.t(complicationStateWireFormat.f2332q, 12);
        complicationStateWireFormat.r = aVar.t(complicationStateWireFormat.r, 13);
        complicationStateWireFormat.f2333s = aVar.t(complicationStateWireFormat.f2333s, 14);
        complicationStateWireFormat.f2334t = aVar.t(complicationStateWireFormat.f2334t, 15);
        complicationStateWireFormat.f2335u = (BoundingArcWireFormat) aVar.F(complicationStateWireFormat.f2335u, 16);
        complicationStateWireFormat.f2336v = (Rect) aVar.z(complicationStateWireFormat.f2336v, 17);
        complicationStateWireFormat.f2322g = aVar.t(complicationStateWireFormat.f2322g, 2);
        int[] iArr = complicationStateWireFormat.f2323h;
        if (aVar.q(3)) {
            int s8 = aVar.s();
            if (s8 < 0) {
                iArr = null;
            } else {
                int[] iArr2 = new int[s8];
                for (int i8 = 0; i8 < s8; i8++) {
                    iArr2[i8] = aVar.s();
                }
                iArr = iArr2;
            }
        }
        complicationStateWireFormat.f2323h = iArr;
        complicationStateWireFormat.f2324i = aVar.u(4, complicationStateWireFormat.f2324i);
        complicationStateWireFormat.f2325j = aVar.t(complicationStateWireFormat.f2325j, 5);
        complicationStateWireFormat.f2326k = aVar.t(complicationStateWireFormat.f2326k, 6);
        complicationStateWireFormat.f2327l = aVar.i(7, complicationStateWireFormat.f2327l);
        complicationStateWireFormat.f2328m = aVar.i(8, complicationStateWireFormat.f2328m);
        complicationStateWireFormat.f2329n = aVar.t(complicationStateWireFormat.f2329n, 9);
        return complicationStateWireFormat;
    }

    public static void write(ComplicationStateWireFormat complicationStateWireFormat, a aVar) {
        aVar.H(false, false);
        aVar.a0(complicationStateWireFormat.f2321f, 1);
        aVar.J(10, complicationStateWireFormat.f2330o);
        aVar.L(11, complicationStateWireFormat.f2331p);
        aVar.U(complicationStateWireFormat.f2332q, 12);
        aVar.U(complicationStateWireFormat.r, 13);
        aVar.U(complicationStateWireFormat.f2333s, 14);
        aVar.U(complicationStateWireFormat.f2334t, 15);
        aVar.g0(complicationStateWireFormat.f2335u, 16);
        Rect rect = complicationStateWireFormat.f2336v;
        if (rect != null) {
            aVar.a0(rect, 17);
        }
        aVar.U(complicationStateWireFormat.f2322g, 2);
        int[] iArr = complicationStateWireFormat.f2323h;
        aVar.G(3);
        if (iArr != null) {
            aVar.T(r2);
            for (int T : iArr) {
                aVar.T(T);
            }
        } else {
            aVar.T(-1);
        }
        aVar.V(4, complicationStateWireFormat.f2324i);
        aVar.U(complicationStateWireFormat.f2325j, 5);
        aVar.U(complicationStateWireFormat.f2326k, 6);
        aVar.J(7, complicationStateWireFormat.f2327l);
        aVar.J(8, complicationStateWireFormat.f2328m);
        aVar.U(complicationStateWireFormat.f2329n, 9);
    }
}
