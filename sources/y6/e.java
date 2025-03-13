package y6;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import j6.b;
import k6.j;
import k6.m;
import z6.c;
import z6.f;

public final class e extends b {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ int f8543o = 0;

    public e(String str, int i8, int i9, r5.e eVar) {
        super(str, i8, i9, eVar);
    }

    public final void f() {
        String str = this.f8526d;
        b bVar = this.f8524b;
        try {
            m g9 = bVar.g(this, str);
            g9.e = 0;
            j jVar = bVar.f5041h;
            jVar.f5207b = g9;
            this.f8532k = bVar.j(this.e, this.f8527f, jVar.c(str));
            this.f8533l = bVar.g(this, str).f5212g;
            f fVar = new f();
            fVar.f8716h = 0;
            fVar.f8708d = str;
            fVar.e = true;
            fVar.f8709f = new androidx.activity.b(11, this);
            this.f8535n = fVar;
        } catch (Exception e) {
            Log.w("DWF:AnimatedWebpDrawable", e.getMessage());
        }
        Drawable drawable = this.f8532k;
        if (drawable == null || !(drawable instanceof BitmapDrawable)) {
            Log.w("DWF:AnimatedWebpDrawable", "Couldn't load first frame for " + str);
            return;
        }
        this.f8535n.c((BitmapDrawable) drawable);
        this.f8534m = new c(bVar, this.f8523a.f7071a.getResources(), this.f8535n);
    }
}
