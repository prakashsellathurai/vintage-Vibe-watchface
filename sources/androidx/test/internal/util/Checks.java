package androidx.test.internal.util;

import android.os.StrictMode;
import androidx.test.internal.platform.ThreadChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;

public final class Checks {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadChecker f1929a;

    static {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        ArrayList arrayList = new ArrayList();
        Class<ThreadChecker> cls = ThreadChecker.class;
        Iterator<S> it = ServiceLoader.load(cls).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        if (arrayList.isEmpty()) {
            new ThreadChecker() {
            };
        } else if (arrayList.size() == 1) {
            f1929a = (ThreadChecker) arrayList.get(0);
        } else {
            throw new IllegalStateException(String.format("Found more than one %s implementations.", new Object[]{cls.getName()}));
        }
    }
}
