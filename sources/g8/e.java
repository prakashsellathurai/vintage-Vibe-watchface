package g8;

import a1.a;
import java.io.InputStream;
import java.util.logging.Logger;

public final class e {
    static {
        Logger.getLogger(e.class.getName());
    }

    public static d a(InputStream inputStream) {
        a aVar = new a();
        if (inputStream != null) {
            return new d(inputStream, aVar);
        }
        throw new IllegalArgumentException("in == null");
    }
}
