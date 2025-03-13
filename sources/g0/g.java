package g0;

import android.content.Context;
import g0.k;
import java.util.concurrent.Callable;

public final class g implements Callable<k.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f4452a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f4453b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f4454c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f4455d;

    public g(String str, Context context, f fVar, int i8) {
        this.f4452a = str;
        this.f4453b = context;
        this.f4454c = fVar;
        this.f4455d = i8;
    }

    public final Object call() {
        return k.a(this.f4452a, this.f4453b, this.f4454c, this.f4455d);
    }
}
