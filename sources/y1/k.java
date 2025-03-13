package y1;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.concurrent.Callable;

public final class k implements Callable<r<f>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InputStream f8248a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f8249b = null;

    public k(ByteArrayInputStream byteArrayInputStream) {
        this.f8248a = byteArrayInputStream;
    }

    public final Object call() {
        return g.c(this.f8248a, this.f8249b);
    }
}
