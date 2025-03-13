package v4;

import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.fragment.app.u;

public final class e extends u {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TextPaint f7947a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u f7948b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f7949c;

    public e(d dVar, TextPaint textPaint, u uVar) {
        this.f7949c = dVar;
        this.f7947a = textPaint;
        this.f7948b = uVar;
    }

    public final void f(int i8) {
        this.f7948b.f(i8);
    }

    public final void g(Typeface typeface, boolean z8) {
        this.f7949c.d(this.f7947a, typeface);
        this.f7948b.g(typeface, z8);
    }
}
