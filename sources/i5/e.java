package i5;

import android.graphics.Canvas;
import android.graphics.Rect;
import c7.l;
import c7.m;
import com.samsung.android.wearable.watchfacestudio.a;
import java.util.function.Consumer;
import n1.h;
import n1.z;
import s5.o;
import v5.b;
import x5.c;

public final /* synthetic */ class e implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4847a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4848b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f4849c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f4850d;
    public final /* synthetic */ Object e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f4851f;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i8) {
        this.f4847a = i8;
        this.f4848b = obj;
        this.f4849c = obj2;
        this.f4850d = obj3;
        this.e = obj4;
        this.f4851f = obj5;
    }

    public final void accept(Object obj) {
        String str;
        int i8 = this.f4847a;
        Object obj2 = this.f4851f;
        Object obj3 = this.e;
        Object obj4 = this.f4850d;
        Object obj5 = this.f4849c;
        Object obj6 = this.f4848b;
        switch (i8) {
            case 0:
                a aVar = (a) obj6;
                aVar.getClass();
                aVar.m((Canvas) obj5, (Rect) obj4, ((z.a) obj3).f5896b, (h) obj2, (c) obj);
                return;
            default:
                b bVar = (b) obj5;
                String str2 = (String) obj4;
                b7.a aVar2 = (b7.a) obj3;
                r5.e eVar = (r5.e) obj2;
                String str3 = (String) obj;
                l lVar = new l((m) obj6, 1);
                str3.getClass();
                char c9 = 65535;
                switch (str3.hashCode()) {
                    case 104:
                        if (str3.equals("h")) {
                            c9 = 0;
                            break;
                        }
                        break;
                    case 109:
                        if (str3.equals("m")) {
                            c9 = 1;
                            break;
                        }
                        break;
                    case 115:
                        if (str3.equals("s")) {
                            c9 = 2;
                            break;
                        }
                        break;
                    case 3328:
                        if (str3.equals("hh")) {
                            c9 = 3;
                            break;
                        }
                        break;
                    case 3488:
                        if (str3.equals("mm")) {
                            c9 = 4;
                            break;
                        }
                        break;
                    case 3680:
                        if (str3.equals("ss")) {
                            c9 = 5;
                            break;
                        }
                        break;
                }
                switch (c9) {
                    case 0:
                        str = o.a(str2, false);
                        break;
                    case 1:
                        str = "[MINUTE]";
                        break;
                    case 2:
                        str = "[SECOND]";
                        break;
                    case 3:
                        str = o.a(str2, true);
                        break;
                    case 4:
                        str = "[MINUTE_Z]";
                        break;
                    case 5:
                        str = "[SECOND_Z]";
                        break;
                    default:
                        o.b(eVar, aVar2, lVar);
                        return;
                }
                lVar.G(new s5.m(bVar, new z5.b(str, bVar, aVar2.C), lVar).f4416b.h());
                o.b(eVar, aVar2, lVar);
                return;
        }
    }
}
