package n6;

import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.util.Log;
import i6.g;
import java.util.function.Consumer;
import s5.d;
import w5.c;
import w5.f;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final ColorMatrix f5959a = new ColorMatrix();

    public class a extends f6.a {
        public final /* synthetic */ Consumer e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(v5.b bVar, c cVar, Consumer consumer) {
            super(bVar, cVar);
            this.e = consumer;
        }

        public final void b(f fVar) {
            this.e.accept(fVar.b());
        }
    }

    public static Color a(String str, v5.b bVar, Consumer<Color> consumer, d dVar) {
        try {
            return Color.valueOf(Color.parseColor(str));
        } catch (Exception unused) {
            c a9 = g.a(str);
            if (a9 == null) {
                Log.w("DWF:ColorUtil", "color attribute (" + str + ") is not a correct value");
                return null;
            }
            f c9 = bVar.c(a9);
            if (c9.f8067a == 7) {
                dVar.k(new s5.f(new a(bVar, a9, consumer), 5));
                return c9.b();
            }
            Log.w("DWF:ColorUtil", "color has wrong type of source:" + a9.f8018a + "[" + b6.a.t(c9.f8067a) + ":" + c9.h() + "]");
            return null;
        }
    }
}
