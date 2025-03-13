package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

public abstract class j0 {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f1479a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashSet f1480b = new LinkedHashSet();

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f1481c = false;

    public static void a(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void b() {
    }
}
