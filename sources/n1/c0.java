package n1;

import android.graphics.drawable.Drawable;
import c7.h;
import c7.n;
import c7.o;
import d7.f;
import java.util.ArrayList;
import java.util.function.Function;
import m6.d;
import p7.l;
import q7.k;
import r5.e;
import t5.a;

public final /* synthetic */ class c0 implements Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5536a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f5537b;

    public /* synthetic */ c0(int i8, Object obj) {
        this.f5536a = i8;
        this.f5537b = obj;
    }

    public final Object apply(Object obj) {
        String str;
        ArrayList<Drawable> a9;
        int i8 = this.f5536a;
        boolean z8 = true;
        Object obj2 = this.f5537b;
        switch (i8) {
            case 0:
                l lVar = (l) obj2;
                k.e(lVar, "$tmp0");
                return (d0) lVar.invoke(obj);
            case 1:
                return new a((e) obj2, (a.b) obj);
            case 2:
                if (((d) obj).f5463a != ((g6.a) obj2)) {
                    z8 = false;
                }
                return Boolean.valueOf(z8);
            default:
                n nVar = (n) obj;
                ((f) obj2).getClass();
                o oVar = nVar.f2820h;
                if (oVar == null || !oVar.f2824c) {
                    z8 = false;
                }
                if (!z8) {
                    return (n) nVar.clone();
                }
                if (oVar == null || !oVar.f2824c || (str = nVar.f2818f) == null || (a9 = oVar.a(str)) == null || a9.size() <= 0) {
                    return null;
                }
                h hVar = new h(str, (ArrayList) oVar.a(str));
                hVar.c(oVar);
                return hVar;
        }
    }
}
