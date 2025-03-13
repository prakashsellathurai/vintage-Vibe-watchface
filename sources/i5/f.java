package i5;

import android.graphics.Canvas;
import android.graphics.Rect;
import com.samsung.android.wearable.watchfacestudio.a;
import java.util.function.Consumer;
import n1.h;
import n1.z;
import r5.e;
import s5.u;
import w5.i;
import x5.c;
import z5.b;

public final /* synthetic */ class f implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4852a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4853b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f4854c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f4855d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, int i8) {
        this.f4852a = i8;
        this.f4853b = obj;
        this.f4854c = obj2;
        this.f4855d = obj3;
        this.e = obj4;
    }

    public final void accept(Object obj) {
        b bVar;
        int i8 = this.f4852a;
        Object obj2 = this.e;
        Object obj3 = this.f4855d;
        Object obj4 = this.f4854c;
        Object obj5 = this.f4853b;
        switch (i8) {
            case 0:
                a aVar = (a) obj5;
                Canvas canvas = (Canvas) obj4;
                Rect rect = (Rect) obj3;
                z.a aVar2 = (z.a) obj2;
                c cVar = (c) obj;
                h hVar = (h) aVar.r.e.get(Integer.valueOf(cVar.f8147a));
                if (hVar != null && hVar.f5576q) {
                    aVar.m(canvas, rect, aVar2.f5896b, hVar, cVar);
                    return;
                }
                return;
            default:
                e eVar = (e) obj3;
                o6.b bVar2 = (o6.b) obj2;
                i6.e eVar2 = (i6.e) obj;
                String e4 = eVar2.b("type").e("EMPTY");
                String str = "[COMPLICATION." + ((String) obj5) + ".TYPE]";
                if (e4.equals((String) obj4)) {
                    bVar = new b(str + " == " + e4 + " || " + str + " == NO_PERMISSION", eVar.f7077h, (i) null);
                } else {
                    bVar = new b(str + " == " + e4, eVar.f7077h, (i) null);
                }
                o6.a aVar3 = new o6.a(bVar2, bVar, eVar.f7077h);
                aVar3.f6179h = eVar.f7074d;
                u.c(eVar, eVar2, aVar3);
                return;
        }
    }
}
