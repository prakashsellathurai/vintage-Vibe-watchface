package v1;

import android.os.Trace;
import java.io.Closeable;
import q7.k;

public final class c implements Closeable {
    public c(String str) {
        k.e(str, "traceName");
        Trace.beginSection(str);
    }

    public final void close() {
        Trace.endSection();
    }
}
