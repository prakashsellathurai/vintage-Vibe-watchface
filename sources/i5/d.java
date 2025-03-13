package i5;

import c6.j;
import java.util.function.Predicate;
import x5.c;

public final /* synthetic */ class d implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4845a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f4846b;

    public /* synthetic */ d(int i8, int i9) {
        this.f4845a = i9;
        this.f4846b = i8;
    }

    public final boolean test(Object obj) {
        int i8 = this.f4845a;
        int i9 = this.f4846b;
        switch (i8) {
            case 0:
                return ((c) obj).f8147a == i9;
            default:
                return i9 == ((j.a) obj).ordinal();
        }
    }
}
