package g0;

import android.content.Context;
import g0.k;
import java.util.concurrent.Callable;

public final class i implements Callable<k.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f4457a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f4458b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f4459c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f4460d;

    public i(String str, Context context, f fVar, int i8) {
        this.f4457a = str;
        this.f4458b = context;
        this.f4459c = fVar;
        this.f4460d = i8;
    }

    public final Object call() {
        try {
            return k.a(this.f4457a, this.f4458b, this.f4459c, this.f4460d);
        } catch (Throwable unused) {
            return new k.a(-3);
        }
    }
}
