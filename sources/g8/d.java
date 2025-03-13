package g8;

import a1.a;
import java.io.IOException;
import java.io.InputStream;

public final class d implements m {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a f4689f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ InputStream f4690g;

    public d(InputStream inputStream, a aVar) {
        this.f4689f = aVar;
        this.f4690g = inputStream;
    }

    public final void close() {
        this.f4690g.close();
    }

    public final String toString() {
        return "source(" + this.f4690g + ")";
    }

    public final long y(a aVar, long j8) {
        boolean z8 = true;
        try {
            this.f4689f.H();
            j q8 = aVar.q(1);
            int read = this.f4690g.read(q8.f4703a, q8.f4705c, (int) Math.min(8192, (long) (8192 - q8.f4705c)));
            if (read == -1) {
                return -1;
            }
            q8.f4705c += read;
            long j9 = (long) read;
            aVar.f4683g += j9;
            return j9;
        } catch (AssertionError e) {
            if (e.getCause() == null || e.getMessage() == null || !e.getMessage().contains("getsockname failed")) {
                z8 = false;
            }
            if (z8) {
                throw new IOException(e);
            }
            throw e;
        }
    }
}
