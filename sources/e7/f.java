package e7;

import android.util.Pair;
import java.util.function.BiFunction;
import n6.a;
import p6.c;

public final /* synthetic */ class f implements BiFunction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f4272a;

    public /* synthetic */ f(c cVar) {
        this.f4272a = cVar;
    }

    public final Object apply(Object obj, Object obj2) {
        a.C0095a a9 = a.a(((w5.f) obj).d(), ((w5.f) obj2).d(), this.f4272a.e);
        return new Pair(new w5.f(a9.f5956a), new w5.f(a9.f5958c));
    }
}
