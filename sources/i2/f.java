package i2;

import d2.b;
import j2.b;
import s.g;

public final class f implements e0<b> {

    /* renamed from: a  reason: collision with root package name */
    public static final f f4804a = new f();

    /* renamed from: b  reason: collision with root package name */
    public static final b.a f4805b = b.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    public final Object d(j2.b bVar, float f9) {
        bVar.c();
        int i8 = 3;
        String str = null;
        String str2 = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        boolean z8 = true;
        while (bVar.j()) {
            switch (bVar.v(f4805b)) {
                case 0:
                    str = bVar.s();
                    break;
                case 1:
                    str2 = bVar.s();
                    break;
                case 2:
                    f10 = (float) bVar.o();
                    break;
                case 3:
                    int q8 = bVar.q();
                    if (q8 <= 2 && q8 >= 0) {
                        i8 = g.c(3)[q8];
                        break;
                    } else {
                        i8 = 3;
                        break;
                    }
                case 4:
                    i9 = bVar.q();
                    break;
                case 5:
                    f11 = (float) bVar.o();
                    break;
                case 6:
                    f12 = (float) bVar.o();
                    break;
                case 7:
                    i10 = m.a(bVar);
                    break;
                case 8:
                    i11 = m.a(bVar);
                    break;
                case 9:
                    f13 = (float) bVar.o();
                    break;
                case 10:
                    z8 = bVar.n();
                    break;
                default:
                    bVar.w();
                    bVar.x();
                    break;
            }
        }
        j2.b bVar2 = bVar;
        bVar.g();
        return new d2.b(str, str2, f10, i8, i9, f11, f12, i10, i11, f13, z8);
    }
}
