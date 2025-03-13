package v4;

import android.graphics.Typeface;
import androidx.fragment.app.u;
import u4.b;
import u4.c;

public final class a extends u {

    /* renamed from: a  reason: collision with root package name */
    public final Typeface f7929a;

    /* renamed from: b  reason: collision with root package name */
    public final C0149a f7930b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7931c;

    /* renamed from: v4.a$a  reason: collision with other inner class name */
    public interface C0149a {
    }

    public a(b bVar, Typeface typeface) {
        this.f7929a = typeface;
        this.f7930b = bVar;
    }

    public final void f(int i8) {
        if (!this.f7931c) {
            c cVar = ((b) this.f7930b).f7736a;
            a aVar = cVar.f7756v;
            boolean z8 = true;
            if (aVar != null) {
                aVar.f7931c = true;
            }
            Typeface typeface = cVar.f7753s;
            Typeface typeface2 = this.f7929a;
            if (typeface != typeface2) {
                cVar.f7753s = typeface2;
            } else {
                z8 = false;
            }
            if (z8) {
                cVar.h();
            }
        }
    }

    public final void g(Typeface typeface, boolean z8) {
        if (!this.f7931c) {
            c cVar = ((b) this.f7930b).f7736a;
            a aVar = cVar.f7756v;
            boolean z9 = true;
            if (aVar != null) {
                aVar.f7931c = true;
            }
            if (cVar.f7753s != typeface) {
                cVar.f7753s = typeface;
            } else {
                z9 = false;
            }
            if (z9) {
                cVar.h();
            }
        }
    }
}
