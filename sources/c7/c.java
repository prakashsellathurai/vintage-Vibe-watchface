package c7;

import android.graphics.Color;
import java.util.function.Consumer;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public Consumer<Void> f2794a;

    /* renamed from: b  reason: collision with root package name */
    public int f2795b = -1;

    public abstract o a(o oVar);

    public abstract boolean b();

    public final void c(Color color) {
        int argb;
        if (color != null && this.f2795b != (argb = color.toArgb())) {
            this.f2795b = argb;
            Consumer<Void> consumer = this.f2794a;
            if (consumer != null) {
                consumer.accept((Object) null);
            }
        }
    }
}
