package c6;

import c6.j;
import java.util.function.Predicate;

public final /* synthetic */ class i implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ double f2739a;

    public /* synthetic */ i(double d9) {
        this.f2739a = d9;
    }

    public final boolean test(Object obj) {
        return this.f2739a < ((j.a) obj).f2750g;
    }
}
