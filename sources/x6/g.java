package x6;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import i5.j;
import java.util.ArrayList;
import y6.a;

public final class g extends h {

    /* renamed from: p  reason: collision with root package name */
    public final Drawable f8190p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f8191q = false;
    public boolean r = false;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f8192s;

    /* renamed from: t  reason: collision with root package name */
    public a f8193t;

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList f8194u = new ArrayList();

    /* renamed from: v  reason: collision with root package name */
    public int f8195v = 0;

    public g(v6.a aVar, BitmapDrawable bitmapDrawable, boolean z8) {
        super(aVar);
        this.f8190p = bitmapDrawable;
        this.f8192s = z8;
    }

    public final Drawable B(int i8, int i9) {
        boolean z8 = true;
        boolean z9 = this.f8192s;
        Drawable drawable = this.f8190p;
        if (drawable != null && (z9 || this.r)) {
            return drawable;
        }
        a aVar = this.f8193t;
        if (aVar == null || !z9 || aVar.f8528g == null) {
            z8 = false;
        }
        if (z8) {
            return aVar.f8528g;
        }
        if (aVar != null) {
            aVar.setBounds(0, 0, i8, i9);
        }
        return this.f8193t;
    }

    public final void C() {
        a aVar = this.f8193t;
        if (aVar != null) {
            if ((!this.f8192s || aVar.f8528g == null) && !aVar.f8529h) {
                SystemClock.elapsedRealtime();
                aVar.f();
                SystemClock.elapsedRealtime();
                Log.i("DWF:AnimatedDrawable", aVar.getClass().getSimpleName() + " : " + aVar.f8526d + " (" + aVar.b() + "x" + aVar.a() + ", #:" + aVar.d() + ", " + aVar.c() + "ms)");
                aVar.f8529h = true;
            }
        }
    }

    public final void r() {
        super.r();
        ArrayList arrayList = this.f8194u;
        arrayList.forEach(new j(10));
        arrayList.clear();
    }
}
