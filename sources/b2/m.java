package b2;

import androidx.fragment.app.i0;
import java.util.Collections;
import l2.a;

public final class m<K, A> extends a<K, A> {

    /* renamed from: i  reason: collision with root package name */
    public final A f2555i;

    public m(i0 i0Var, A a9) {
        super(Collections.emptyList());
        k(i0Var);
        this.f2555i = a9;
    }

    public final float c() {
        return 1.0f;
    }

    public final A f() {
        i0 i0Var = this.e;
        A a9 = this.f2555i;
        return i0Var.j(a9, a9);
    }

    public final A g(a<K> aVar, float f9) {
        return f();
    }

    public final void i() {
        if (this.e != null) {
            super.i();
        }
    }

    public final void j(float f9) {
        this.f2517d = f9;
    }
}
