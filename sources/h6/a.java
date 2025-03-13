package h6;

import android.util.Log;
import r5.b;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final C0064a f4778a;

    /* renamed from: b  reason: collision with root package name */
    public float f4779b;

    /* renamed from: c  reason: collision with root package name */
    public float f4780c;

    /* renamed from: h6.a$a  reason: collision with other inner class name */
    public interface C0064a {
        void a(b bVar, float f9, float f10);
    }

    public a(C0064a aVar) {
        this.f4778a = aVar;
    }

    public final void a(float f9, float f10, int i8) {
        C0064a aVar = this.f4778a;
        if (i8 != 0) {
            b bVar = b.f7068h;
            boolean z8 = true;
            if (i8 == 1) {
                aVar.a(bVar, f9, f10);
                float f11 = this.f4779b - f9;
                float f12 = this.f4780c - f10;
                if (Math.sqrt((double) ((f11 * f11) + (f12 * f12))) >= 100.0d) {
                    z8 = false;
                }
                if (z8) {
                    this.f4779b = f9;
                    this.f4780c = f10;
                    aVar.a(b.f7066f, f9, f10);
                    Log.i("DWF:GestureDetector", "Tap : " + f9 + ", " + f10);
                }
            } else if (i8 == 3) {
                aVar.a(bVar, f9, f10);
            }
        } else {
            aVar.a(b.f7067g, f9, f10);
            this.f4779b = f9;
            this.f4780c = f10;
        }
    }
}
