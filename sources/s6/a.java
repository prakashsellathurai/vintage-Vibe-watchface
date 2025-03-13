package s6;

import android.graphics.PointF;
import android.graphics.Shader;
import e7.d;
import e7.i;
import e7.k;
import s5.x;
import w5.f;

public abstract class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public Shader f7254a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f7255b;

    /* renamed from: c  reason: collision with root package name */
    public final float[] f7256c;

    /* renamed from: d  reason: collision with root package name */
    public b f7257d;
    public i e;

    /* renamed from: f  reason: collision with root package name */
    public PointF f7258f = new PointF(1.0f, 1.0f);

    /* renamed from: g  reason: collision with root package name */
    public final k f7259g;

    public a(float[] fArr, int[] iArr) {
        if (iArr.length <= 1 || fArr.length <= 1) {
            throw new IllegalArgumentException("colors and position should have more than 1 value");
        }
        this.f7255b = iArr;
        this.f7256c = fArr;
        this.f7259g = new k(this);
    }

    public final f a(i.a aVar) {
        return this.e.b(aVar);
    }

    public abstract void b();

    public final void e(i.a aVar, f fVar) {
        this.e.d(aVar, fVar);
        b();
        b bVar = this.f7257d;
        if (bVar != null) {
            u6.d.this.f7810a.setShader(this.f7254a);
            ((x) u6.d.this.f7811b).a();
        }
    }
}
