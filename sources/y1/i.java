package y1;

import android.content.Context;
import java.util.concurrent.Callable;

public final class i implements Callable<r<f>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f8241a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f8242b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f8243c;

    public i(Context context, String str, String str2) {
        this.f8241a = context;
        this.f8242b = str;
        this.f8243c = str2;
    }

    public final Object call() {
        return g.b(this.f8241a, this.f8242b, this.f8243c);
    }
}
