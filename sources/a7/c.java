package a7;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import j6.b;

public final class c extends b {

    /* renamed from: b  reason: collision with root package name */
    public final String f192b;

    /* renamed from: c  reason: collision with root package name */
    public final b f193c;

    public c(String str, b bVar) {
        this.f192b = str;
        this.f193c = bVar;
    }

    public final Drawable a() {
        if (this.f191a == null) {
            b bVar = this.f193c;
            Bitmap i8 = bVar.i(this.f192b);
            this.f191a = i8 != null ? new BitmapDrawable(bVar.e, i8) : null;
        }
        return this.f191a;
    }

    public final Drawable b(int i8, int i9) {
        if (i8 <= 0 || i9 <= 0) {
            return null;
        }
        Drawable drawable = this.f191a;
        if ((drawable != null && drawable.getIntrinsicWidth() == i8 && this.f191a.getIntrinsicHeight() == i9) ? false : true) {
            this.f191a = this.f193c.k(this.f192b, i8, i9);
        }
        return this.f191a;
    }
}
