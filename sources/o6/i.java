package o6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import java.util.Collection;
import java.util.function.Predicate;

public class i extends g {
    public final boolean F;
    public p G;

    public i() {
        throw null;
    }

    public i(q qVar, boolean z8) {
        super(qVar);
        this.G = null;
        this.F = z8;
    }

    public boolean H(Canvas canvas) {
        return I(canvas, (Collection<Integer>) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0082, code lost:
        if (r2 != false) goto L_0x0084;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean I(android.graphics.Canvas r9, java.util.Collection<java.lang.Integer> r10) {
        /*
            r8 = this;
            boolean r0 = r8.F
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0023
            r0 = 1132396544(0x437f0000, float:255.0)
            float r3 = r8.C()
            int r0 = java.lang.Float.compare(r0, r3)
            if (r0 != 0) goto L_0x0023
            android.graphics.ColorMatrix r0 = r8.f6140n
            android.graphics.ColorMatrix r3 = n6.b.f5959a
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0023
            o6.p r0 = r8.G
            if (r0 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r0 = r1
            goto L_0x0024
        L_0x0023:
            r0 = r2
        L_0x0024:
            r8.f6148x = r0
            if (r0 == 0) goto L_0x00d8
            boolean r0 = r8.f6149z
            r3 = 0
            if (r0 == 0) goto L_0x00d0
            int r0 = r9.getWidth()
            int r4 = r9.getHeight()
            r8.L(r0, r4)
            android.graphics.Canvas r0 = r8.f6147v
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.CLEAR
            r0.drawColor(r1, r4)
            java.util.ArrayList r0 = r8.f6176d
            java.util.Iterator r0 = r0.iterator()
        L_0x0045:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0062
            java.lang.Object r4 = r0.next()
            o6.q r4 = (o6.q) r4
            androidx.health.services.client.impl.c r5 = new androidx.health.services.client.impl.c
            r6 = 6
            r5.<init>(r8, r6, r10)
            com.samsung.android.wearable.watchfacestudio.editor.q r6 = new com.samsung.android.wearable.watchfacestudio.editor.q
            r7 = 13
            r6.<init>(r7)
            r4.m(r5, r6)
            goto L_0x0045
        L_0x0062:
            o6.p r10 = r8.G
            if (r10 == 0) goto L_0x00ce
            android.graphics.Canvas r0 = r8.f6147v
            android.graphics.Bitmap r4 = r10.f6170a
            if (r4 == 0) goto L_0x0084
            int r5 = r0.getWidth()
            int r6 = r4.getWidth()
            if (r5 != r6) goto L_0x0082
            int r5 = r0.getHeight()
            int r4 = r4.getHeight()
            if (r5 == r4) goto L_0x0081
            goto L_0x0082
        L_0x0081:
            r2 = r1
        L_0x0082:
            if (r2 == 0) goto L_0x009d
        L_0x0084:
            int r2 = r0.getWidth()
            int r4 = r0.getHeight()
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r4, r5)
            r10.f6170a = r2
            android.graphics.Canvas r2 = new android.graphics.Canvas
            android.graphics.Bitmap r4 = r10.f6170a
            r2.<init>(r4)
            r10.f6171b = r2
        L_0x009d:
            android.graphics.Canvas r2 = r10.f6171b
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.CLEAR
            r2.drawColor(r1, r4)
            java.util.ArrayList<o6.g> r2 = r10.f6173d
            java.util.Iterator r2 = r2.iterator()
        L_0x00aa:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00c7
            java.lang.Object r4 = r2.next()
            o6.g r4 = (o6.g) r4
            androidx.health.services.client.impl.i r5 = new androidx.health.services.client.impl.i
            r6 = 7
            r5.<init>(r6, r10)
            com.samsung.android.wearable.watchfacestudio.editor.q r6 = new com.samsung.android.wearable.watchfacestudio.editor.q
            r7 = 14
            r6.<init>(r7)
            r4.m(r5, r6)
            goto L_0x00aa
        L_0x00c7:
            android.graphics.Bitmap r2 = r10.f6170a
            android.graphics.Paint r10 = r10.f6172c
            r0.drawBitmap(r2, r3, r3, r10)
        L_0x00ce:
            r8.f6149z = r1
        L_0x00d0:
            android.graphics.Bitmap r10 = r8.w
            android.graphics.Paint r8 = r8.f6137k
            r9.drawBitmap(r10, r3, r3, r8)
            return r1
        L_0x00d8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.i.I(android.graphics.Canvas, java.util.Collection):boolean");
    }

    public final void r() {
        super.r();
        p pVar = this.G;
        if (pVar != null) {
            pVar.f6173d.clear();
            Bitmap bitmap = pVar.f6170a;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }

    public final void v(l lVar, Predicate<q> predicate) {
        super.v(lVar, predicate);
    }
}
