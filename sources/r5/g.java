package r5;

import b6.c;
import c6.j;
import e7.i;
import i6.b;
import java.util.function.Predicate;
import o6.q;
import t5.a;

public final /* synthetic */ class g implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7086a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f7087b;

    public /* synthetic */ g(int i8, String str) {
        this.f7086a = i8;
        this.f7087b = str;
    }

    public final boolean test(Object obj) {
        int i8 = this.f7086a;
        String str = this.f7087b;
        switch (i8) {
            case 0:
                return ((b) obj).d(str);
            case 1:
                return ((q) obj).f6174b.equals(str);
            case 2:
                return ((a.b) obj).name().equals(str);
            case 3:
                return ((j.a) obj).f2749f.equals(str);
            case 4:
                return ((String) obj).equals(str);
            case 5:
                return ((i.a) obj).getKey().equals(str);
            default:
                return str.equals(((c) obj).f2611a);
        }
    }
}
