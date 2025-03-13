package u6;

import android.graphics.Color;
import android.graphics.Paint;
import s5.x;
import s6.b;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public final Paint f7810a = new Paint(1);

    /* renamed from: b  reason: collision with root package name */
    public final t6.d f7811b;

    /* renamed from: c  reason: collision with root package name */
    public s6.a f7812c = null;

    /* renamed from: d  reason: collision with root package name */
    public int f7813d = 255;
    public final a e = new a();

    public class a implements b {
        public a() {
        }
    }

    public d(x xVar) {
        this.f7811b = xVar;
    }

    public final void b(Color color) {
        Paint paint = this.f7810a;
        paint.setColor(color.toArgb());
        this.f7813d = paint.getAlpha();
        t6.d dVar = this.f7811b;
        if (dVar != null) {
            ((x) dVar).a();
        }
    }
}
