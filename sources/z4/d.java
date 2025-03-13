package z4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static d f8694b;

    /* renamed from: a  reason: collision with root package name */
    public final Object f8695a = new Object();

    public class a implements Handler.Callback {
        public a() {
        }

        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            d dVar = d.this;
            b bVar = (b) message.obj;
            synchronized (dVar.f8695a) {
                if (bVar == null) {
                    bVar.getClass();
                    throw null;
                }
            }
            return true;
        }
    }

    public static class b {
    }

    public d() {
        new Handler(Looper.getMainLooper(), new a());
    }
}
