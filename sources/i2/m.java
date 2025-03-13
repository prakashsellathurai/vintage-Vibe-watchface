package i2;

import android.graphics.Color;
import android.graphics.PointF;
import b6.a;
import j2.b;
import java.util.ArrayList;
import s.g;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final b.a f4816a = b.a.a("x", "y");

    public static int a(b bVar) {
        bVar.a();
        int o8 = (int) (bVar.o() * 255.0d);
        int o9 = (int) (bVar.o() * 255.0d);
        int o10 = (int) (bVar.o() * 255.0d);
        while (bVar.j()) {
            bVar.x();
        }
        bVar.d();
        return Color.argb(255, o8, o9, o10);
    }

    public static PointF b(b bVar, float f9) {
        int b9 = g.b(bVar.t());
        if (b9 == 0) {
            bVar.a();
            float o8 = (float) bVar.o();
            float o9 = (float) bVar.o();
            while (bVar.t() != 2) {
                bVar.x();
            }
            bVar.d();
            return new PointF(o8 * f9, o9 * f9);
        } else if (b9 == 2) {
            bVar.c();
            float f10 = 0.0f;
            float f11 = 0.0f;
            while (bVar.j()) {
                int v8 = bVar.v(f4816a);
                if (v8 == 0) {
                    f10 = d(bVar);
                } else if (v8 != 1) {
                    bVar.w();
                    bVar.x();
                } else {
                    f11 = d(bVar);
                }
            }
            bVar.g();
            return new PointF(f10 * f9, f11 * f9);
        } else if (b9 == 6) {
            float o10 = (float) bVar.o();
            float o11 = (float) bVar.o();
            while (bVar.j()) {
                bVar.x();
            }
            return new PointF(o10 * f9, o11 * f9);
        } else {
            throw new IllegalArgumentException("Unknown point starts with ".concat(a.p(bVar.t())));
        }
    }

    public static ArrayList c(b bVar, float f9) {
        ArrayList arrayList = new ArrayList();
        bVar.a();
        while (bVar.t() == 1) {
            bVar.a();
            arrayList.add(b(bVar, f9));
            bVar.d();
        }
        bVar.d();
        return arrayList;
    }

    public static float d(b bVar) {
        int t8 = bVar.t();
        int b9 = g.b(t8);
        if (b9 == 0) {
            bVar.a();
            float o8 = (float) bVar.o();
            while (bVar.j()) {
                bVar.x();
            }
            bVar.d();
            return o8;
        } else if (b9 == 6) {
            return (float) bVar.o();
        } else {
            throw new IllegalArgumentException("Unknown value for token of type ".concat(a.p(t8)));
        }
    }
}
