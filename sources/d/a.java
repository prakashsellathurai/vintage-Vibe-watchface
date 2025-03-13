package d;

import android.content.Context;
import android.content.Intent;
import q7.k;

public abstract class a<I, O> {

    /* renamed from: d.a$a  reason: collision with other inner class name */
    public static final class C0047a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f3974a;

        public C0047a(T t8) {
            this.f3974a = t8;
        }
    }

    public abstract Intent a(Context context, I i8);

    public C0047a<O> b(Context context, I i8) {
        k.e(context, "context");
        return null;
    }

    public abstract Object c(Intent intent, int i8);
}
