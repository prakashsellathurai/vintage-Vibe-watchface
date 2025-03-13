package r6;

import android.graphics.Canvas;
import i5.j;
import java.util.ArrayList;
import o6.m;
import o6.q;
import o6.r;

public final class a extends r implements m {
    public final ArrayList F = new ArrayList();

    public a(q qVar) {
        super(qVar);
    }

    public final boolean H(Canvas canvas) {
        boolean z8 = this.f6148x;
        ArrayList arrayList = this.F;
        if (z8) {
            if (this.f6149z) {
                L(canvas.getWidth(), canvas.getHeight());
                arrayList.forEach(new com.samsung.android.wearable.watchfacestudio.editor.r(this, 8, this.f6147v));
                this.f6149z = false;
            }
            canvas.drawBitmap(this.w, 0.0f, 0.0f, this.f6137k);
            return true;
        }
        arrayList.forEach(new com.samsung.android.wearable.watchfacestudio.editor.r(this, 8, canvas));
        return true;
    }

    public final void c() {
        this.f6149z = true;
        K();
    }

    public final void r() {
        super.r();
        ArrayList arrayList = this.F;
        arrayList.forEach(new j(8));
        arrayList.clear();
    }
}
