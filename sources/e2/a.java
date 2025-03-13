package e2;

import b2.b;
import b2.d;
import b2.e;
import b2.i;
import b2.k;
import java.util.Collection;
import java.util.List;

public final class a extends f {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f4239c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i8, List list) {
        super(list);
        this.f4239c = i8;
    }

    public final b2.a a() {
        int i8 = this.f4239c;
        Collection collection = this.f4251b;
        switch (i8) {
            case 0:
                return new b((List) collection);
            case 1:
                return new d(0, (List) collection);
            case 2:
                return new e((List) collection);
            case 3:
                return new d(1, (List) collection);
            case 4:
                return new d(2, (List) collection);
            case 5:
                return new i((List) collection);
            default:
                return new k((List) collection);
        }
    }
}
