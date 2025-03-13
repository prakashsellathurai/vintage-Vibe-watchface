package w3;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final b f8009b = new b();

    /* renamed from: a  reason: collision with root package name */
    public a f8010a = null;

    @RecentlyNonNull
    public static a a(@RecentlyNonNull Context context) {
        a aVar;
        b bVar = f8009b;
        synchronized (bVar) {
            if (bVar.f8010a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                bVar.f8010a = new a(context);
            }
            aVar = bVar.f8010a;
        }
        return aVar;
    }
}
