package a3;

import android.graphics.drawable.Drawable;
import k3.j;
import r2.s;
import r2.v;

public abstract class b<T extends Drawable> implements v<T>, s {

    /* renamed from: f  reason: collision with root package name */
    public final T f167f;

    public b(T t8) {
        j.l(t8);
        this.f167f = t8;
    }

    public final Object get() {
        T t8 = this.f167f;
        Drawable.ConstantState constantState = t8.getConstantState();
        return constantState == null ? t8 : constantState.newDrawable();
    }
}
