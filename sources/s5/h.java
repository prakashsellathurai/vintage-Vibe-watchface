package s5;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Log;
import java.util.Iterator;
import o6.b;
import w5.f;
import y5.a;
import y5.c;
import y5.d;
import y5.e;

public final class h {
    public static void a(f fVar, String str, b bVar) {
        Log.i("DWF:ComplicationSlotFactory", "Complication Type is changed id[" + str + "] : " + fVar.h());
        boolean equals = "EMPTY".equals(fVar.h()) ^ true;
        Log.i("DWF:ComplicationSlotNode", "[" + bVar.f6174b + "] Change touchable : " + equals);
        bVar.I = equals;
        bVar.K();
    }

    public static e b(i6.e eVar, RectF rectF, Matrix matrix) {
        i6.e eVar2;
        RectF rectF2 = rectF;
        Matrix matrix2 = matrix;
        Iterator it = eVar.f4863b.iterator();
        while (true) {
            if (!it.hasNext()) {
                eVar2 = null;
                break;
            }
            eVar2 = (i6.e) it.next();
            if (eVar2.f4862a.contains("Bounding")) {
                break;
            }
        }
        if (eVar2 == null) {
            return null;
        }
        float b9 = eVar2.b("x").b(0.0f);
        float b10 = eVar2.b("y").b(0.0f);
        float b11 = eVar2.b("width").b(0.0f);
        float b12 = eVar2.b("height").b(0.0f);
        float b13 = eVar2.b("outlinePadding").b(0.0f);
        RectF rectF3 = new RectF(b9, b10, b9 + b11, b10 + b12);
        y5.b bVar = new y5.b(rectF2, rectF3, 0.0f, matrix2);
        String str = eVar2.f4862a;
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case -1970730175:
                if (str.equals("BoundingRoundBox")) {
                    c9 = 0;
                    break;
                }
                break;
            case -304572362:
                if (str.equals("BoundingOval")) {
                    c9 = 1;
                    break;
                }
                break;
            case 405803502:
                if (str.equals("BoundingArc")) {
                    c9 = 2;
                    break;
                }
                break;
            case 405804391:
                if (str.equals("BoundingBox")) {
                    c9 = 3;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                return new d(rectF, rectF3, b13, eVar2.b("cornerRadius").b(0.0f), matrix);
            case 1:
                return new c(rectF2, rectF3, b13, matrix2);
            case 2:
                float b14 = eVar2.b("centerX").b(0.0f);
                float b15 = eVar2.b("centerY").b(0.0f);
                float b16 = eVar2.b("thickness").b(0.0f);
                float b17 = eVar2.b("startAngle").b(0.0f);
                float b18 = eVar2.b("endAngle").b(0.0f);
                String e = eVar2.b("direction").e("CLOCKWISE");
                float f9 = b11 / 2.0f;
                float f10 = b12 / 2.0f;
                return new a(rectF, new RectF(b14 - f9, b15 - f10, b14 + f9, b15 + f10), b13, b16, b17, b18, "CLOCKWISE".equals(e), eVar2.b("isRoundEdge").a(false), matrix);
            case 3:
                return new y5.b(rectF2, rectF3, b13, matrix2);
            default:
                return bVar;
        }
    }
}
