package b3;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.b;
import java.security.MessageDigest;
import k3.j;
import p2.k;
import r2.v;
import y2.c;

public final class d implements k<c> {

    /* renamed from: b  reason: collision with root package name */
    public final k<Bitmap> f2575b;

    public d(k<Bitmap> kVar) {
        j.l(kVar);
        this.f2575b = kVar;
    }

    public final void a(MessageDigest messageDigest) {
        this.f2575b.a(messageDigest);
    }

    public final v<c> b(Context context, v<c> vVar, int i8, int i9) {
        c cVar = vVar.get();
        c cVar2 = new c(cVar.f2565a.f2574a.f2586l, b.b(context).f2913a);
        k<Bitmap> kVar = this.f2575b;
        v<Bitmap> b9 = kVar.b(context, cVar2, i8, i9);
        if (!cVar2.equals(b9)) {
            cVar2.d();
        }
        cVar.f2565a.f2574a.c(kVar, b9.get());
        return vVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f2575b.equals(((d) obj).f2575b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2575b.hashCode();
    }
}
