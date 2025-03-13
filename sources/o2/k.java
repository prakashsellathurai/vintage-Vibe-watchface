package o2;

import a3.b;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import b3.c;
import b3.e;
import o2.m;

public final class k extends b {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f6051g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Drawable drawable, int i8) {
        super(drawable);
        this.f6051g = i8;
    }

    public final void a() {
        Bitmap bitmap;
        int i8 = this.f6051g;
        T t8 = this.f167f;
        switch (i8) {
            case 0:
                ((j) t8).f6041a.f6050a.f6066l.prepareToDraw();
                return;
            case 2:
                ((c) t8).f2565a.f2574a.f2586l.prepareToDraw();
                return;
            default:
                if (t8 instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) t8).getBitmap();
                } else if (t8 instanceof c) {
                    bitmap = ((c) t8).f2565a.f2574a.f2586l;
                } else {
                    return;
                }
                bitmap.prepareToDraw();
                return;
        }
    }

    public final int b() {
        int h8;
        int i8;
        int i9 = this.f6051g;
        T t8 = this.f167f;
        switch (i9) {
            case 0:
                m mVar = ((j) t8).f6041a.f6050a;
                h8 = mVar.f6056a.h();
                i8 = mVar.f6069o;
                break;
            case 1:
                return Math.max(1, t8.getIntrinsicWidth() * t8.getIntrinsicHeight() * 4);
            default:
                e eVar = ((c) t8).f2565a.f2574a;
                h8 = eVar.f2576a.h();
                i8 = eVar.f2589o;
                break;
        }
        return h8 + i8;
    }

    public final Class c() {
        switch (this.f6051g) {
            case 0:
                return j.class;
            case 1:
                return this.f167f.getClass();
            default:
                return c.class;
        }
    }

    public final void d() {
        int i8 = this.f6051g;
        T t8 = this.f167f;
        switch (i8) {
            case 0:
                j jVar = (j) t8;
                jVar.stop();
                jVar.f6044d = true;
                m mVar = jVar.f6041a.f6050a;
                mVar.f6058c.clear();
                Bitmap bitmap = mVar.f6066l;
                if (bitmap != null) {
                    mVar.e.e(bitmap);
                    mVar.f6066l = null;
                }
                mVar.f6060f = false;
                m.a aVar = mVar.f6063i;
                com.bumptech.glide.k kVar = mVar.f6059d;
                if (aVar != null) {
                    kVar.l(aVar);
                    mVar.f6063i = null;
                }
                m.a aVar2 = mVar.f6065k;
                if (aVar2 != null) {
                    kVar.l(aVar2);
                    mVar.f6065k = null;
                }
                m.a aVar3 = mVar.f6068n;
                if (aVar3 != null) {
                    kVar.l(aVar3);
                    mVar.f6068n = null;
                }
                mVar.f6056a.clear();
                mVar.f6064j = true;
                return;
            case 1:
                return;
            default:
                c cVar = (c) t8;
                cVar.stop();
                cVar.f2568d = true;
                e eVar = cVar.f2565a.f2574a;
                eVar.f2578c.clear();
                Bitmap bitmap2 = eVar.f2586l;
                if (bitmap2 != null) {
                    eVar.e.e(bitmap2);
                    eVar.f2586l = null;
                }
                eVar.f2580f = false;
                e.a aVar4 = eVar.f2583i;
                com.bumptech.glide.k kVar2 = eVar.f2579d;
                if (aVar4 != null) {
                    kVar2.l(aVar4);
                    eVar.f2583i = null;
                }
                e.a aVar5 = eVar.f2585k;
                if (aVar5 != null) {
                    kVar2.l(aVar5);
                    eVar.f2585k = null;
                }
                e.a aVar6 = eVar.f2588n;
                if (aVar6 != null) {
                    kVar2.l(aVar6);
                    eVar.f2588n = null;
                }
                eVar.f2576a.clear();
                eVar.f2584j = true;
                return;
        }
    }
}
