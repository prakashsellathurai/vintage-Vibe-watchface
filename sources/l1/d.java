package l1;

import m1.e;
import m1.f;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final f f5234a;

    static {
        f.a B = f.B();
        e e = e.e(1);
        B.e();
        f.t((f) B.f2202g, e);
        f fVar = (f) B.c();
        f.a B2 = f.B();
        e e4 = e.e(2);
        B2.e();
        f.t((f) B2.f2202g, e4);
        f fVar2 = (f) B2.c();
    }

    public d(f fVar) {
        this.f5234a = fVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repeatable{iterations=");
        f fVar = this.f5234a;
        boolean z8 = true;
        if (fVar.w() >= 1) {
            z8 = false;
        }
        if (!z8) {
            sb.append(fVar.w());
            sb.append(", repeatMode=");
            sb.append(fVar.x().getNumber());
            sb.append(", forwardRepeatOverride=");
            a aVar = null;
            sb.append(fVar.z() ? new a(fVar.v()) : null);
            sb.append(", reverseRepeatOverride=");
            if (fVar.A()) {
                aVar = new a(fVar.y());
            }
            sb.append(aVar);
            sb.append("}");
            return sb.toString();
        }
        throw new IllegalStateException("Repeatable has infinite iteration.");
    }
}
