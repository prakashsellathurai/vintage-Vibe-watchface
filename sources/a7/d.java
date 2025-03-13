package a7;

import android.graphics.drawable.Drawable;
import x6.h;

public final class d extends b {

    /* renamed from: b  reason: collision with root package name */
    public final a f194b;

    public d(a aVar) {
        this.f194b = aVar;
    }

    public final Drawable a() {
        return this.f191a;
    }

    public final Drawable b(int i8, int i9) {
        return this.f191a;
    }

    public final void c(Drawable drawable) {
        this.f191a = drawable;
        a aVar = this.f194b;
        if (aVar != null) {
            ((h) aVar).A();
        }
    }
}
