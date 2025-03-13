package y1;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

public final class j implements Callable<r<f>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WeakReference f8244a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f8245b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f8246c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f8247d;

    public j(WeakReference weakReference, Context context, int i8, String str) {
        this.f8244a = weakReference;
        this.f8245b = context;
        this.f8246c = i8;
        this.f8247d = str;
    }

    public final Object call() {
        Context context = (Context) this.f8244a.get();
        if (context == null) {
            context = this.f8245b;
        }
        return g.e(context, this.f8246c, this.f8247d);
    }
}
