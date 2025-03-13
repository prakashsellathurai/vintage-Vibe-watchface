package z6;

import android.graphics.drawable.BitmapDrawable;
import android.os.SystemClock;
import android.util.Log;
import j6.b;
import java.util.concurrent.atomic.AtomicReference;

public final class f extends d {
    public final BitmapDrawable a() {
        if (this.e) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            AtomicReference atomicReference = new AtomicReference();
            b bVar = this.f8714a;
            String str = this.f8708d;
            int i8 = this.f8716h;
            a aVar = new a(this, atomicReference, elapsedRealtime, 3);
            bVar.getClass();
            try {
                bVar.f5041h.d(str, i8, aVar, bVar.g(this, str));
            } catch (Exception e) {
                Log.e("DWF:ResourceManager", e.getMessage());
            }
            d();
            this.e = false;
        }
        return this.f8707c;
    }
}
