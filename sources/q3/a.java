package q3;

import java.util.Arrays;
import p3.a;
import p3.a.c;
import r3.l;
import r3.p;

public final class a<O extends a.c> {

    /* renamed from: a  reason: collision with root package name */
    public final int f6524a;

    /* renamed from: b  reason: collision with root package name */
    public final p3.a<O> f6525b;

    /* renamed from: c  reason: collision with root package name */
    public final O f6526c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6527d;

    public a(p3.a aVar, String str) {
        O o8 = p.f7026b;
        this.f6525b = aVar;
        this.f6526c = o8;
        this.f6527d = str;
        this.f6524a = Arrays.hashCode(new Object[]{aVar, o8, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f6525b, aVar.f6525b) && l.a(this.f6526c, aVar.f6526c) && l.a(this.f6527d, aVar.f6527d);
    }

    public final int hashCode() {
        return this.f6524a;
    }
}
