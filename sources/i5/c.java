package i5;

import a8.b;
import com.samsung.android.wearable.watchfacestudio.a;
import d6.f;
import j7.d;
import java.util.ArrayList;
import java.util.Map;
import u1.e;
import u1.m;

public final /* synthetic */ class c implements b {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f4843f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f4844g;

    public /* synthetic */ c(int i8, Object obj) {
        this.f4843f = i8;
        this.f4844g = obj;
    }

    public final Object emit(Object obj, d dVar) {
        int i8 = this.f4843f;
        Object obj2 = this.f4844g;
        switch (i8) {
            case 0:
                ((a) obj2).f3849x.s(f.b.f4082h, new w5.f((Object) (Integer) obj));
                return null;
            case 1:
                a aVar = (a) obj2;
                aVar.getClass();
                aVar.n(((Boolean) obj).booleanValue());
                return null;
            case 2:
                ((a) obj2).f3849x.s(f.b.f4085k, new w5.f((Object) (Boolean) obj));
                return null;
            case 3:
                a aVar2 = (a) obj2;
                aVar2.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (!aVar2.B.equals(Boolean.valueOf(booleanValue))) {
                    aVar2.B = Boolean.valueOf(booleanValue);
                    aVar2.l();
                }
                return null;
            default:
                q5.c cVar = (q5.c) obj2;
                cVar.getClass();
                for (Map.Entry next : ((e) obj).entrySet()) {
                    String str = ((m) next.getKey()).f7641a.f7683a;
                    ArrayList a9 = g7.a.a(cVar.f4047j.get(str), (m.h) next.getValue());
                    cVar.q(str, (w5.f) a9.get(0));
                    if (a9.size() > 1) {
                        a9.forEach(new g(cVar, str, a9, 2));
                    }
                }
                return null;
        }
    }
}
