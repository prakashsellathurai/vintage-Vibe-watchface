package g6;

import java.util.function.BiConsumer;
import n6.c;

public final /* synthetic */ class b implements BiConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StringBuilder f4669a;

    public /* synthetic */ b(StringBuilder sb) {
        this.f4669a = sb;
    }

    public final void accept(Object obj, Object obj2) {
        StringBuilder sb = this.f4669a;
        sb.append("## " + ((String) obj) + " : " + ((String) obj2));
        sb.append(c.f5960a);
    }
}
