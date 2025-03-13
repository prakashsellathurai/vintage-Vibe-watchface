package r2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public boolean f6923a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f6924b = new Handler(Looper.getMainLooper(), new a());

    public static final class a implements Handler.Callback {
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((v) message.obj).d();
            return true;
        }
    }

    public final synchronized void a(v<?> vVar, boolean z8) {
        if (!this.f6923a) {
            if (!z8) {
                this.f6923a = true;
                vVar.d();
                this.f6923a = false;
            }
        }
        this.f6924b.obtainMessage(1, vVar).sendToTarget();
    }
}
