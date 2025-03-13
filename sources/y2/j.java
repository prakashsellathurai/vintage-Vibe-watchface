package y2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.b;
import java.security.MessageDigest;
import p2.k;
import r2.v;
import s2.c;

public final class j implements k<Drawable> {

    /* renamed from: b  reason: collision with root package name */
    public final k<Bitmap> f8366b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f8367c = true;

    public j(k kVar) {
        this.f8366b = kVar;
    }

    public final void a(MessageDigest messageDigest) {
        this.f8366b.a(messageDigest);
    }

    public final v<Drawable> b(Context context, v<Drawable> vVar, int i8, int i9) {
        c cVar = b.b(context).f2913a;
        Drawable drawable = vVar.get();
        c a9 = i.a(cVar, drawable, i8, i9);
        if (a9 != null) {
            v<Bitmap> b9 = this.f8366b.b(context, a9, i8, i9);
            if (!b9.equals(a9)) {
                return new c(context.getResources(), (v) b9);
            }
            b9.d();
            return vVar;
        } else if (!this.f8367c) {
            return vVar;
        } else {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f8366b.equals(((j) obj).f8366b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8366b.hashCode();
    }
}
