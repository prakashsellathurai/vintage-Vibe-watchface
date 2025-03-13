package u4;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.fragment.app.u;
import java.lang.ref.WeakReference;
import v4.d;
import v4.e;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f7774a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    public final a f7775b = new a();

    /* renamed from: c  reason: collision with root package name */
    public float f7776c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7777d = true;
    public WeakReference<b> e = new WeakReference<>((Object) null);

    /* renamed from: f  reason: collision with root package name */
    public d f7778f;

    public class a extends u {
        public a() {
        }

        public final void f(int i8) {
            i iVar = i.this;
            iVar.f7777d = true;
            b bVar = iVar.e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        public final void g(Typeface typeface, boolean z8) {
            if (!z8) {
                i iVar = i.this;
                iVar.f7777d = true;
                b bVar = iVar.e.get();
                if (bVar != null) {
                    bVar.a();
                }
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public i(b bVar) {
        this.e = new WeakReference<>(bVar);
    }

    public final float a(String str) {
        if (!this.f7777d) {
            return this.f7776c;
        }
        float measureText = str == null ? 0.0f : this.f7774a.measureText(str, 0, str.length());
        this.f7776c = measureText;
        this.f7777d = false;
        return measureText;
    }

    public final void b(d dVar, Context context) {
        if (this.f7778f != dVar) {
            this.f7778f = dVar;
            if (dVar != null) {
                TextPaint textPaint = this.f7774a;
                dVar.a();
                dVar.d(textPaint, dVar.f7944n);
                a aVar = this.f7775b;
                dVar.b(context, new e(dVar, textPaint, aVar));
                b bVar = this.e.get();
                if (bVar != null) {
                    textPaint.drawableState = bVar.getState();
                }
                dVar.c(context, textPaint, aVar);
                this.f7777d = true;
            }
            b bVar2 = this.e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }
}
