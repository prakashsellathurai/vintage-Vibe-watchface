package a3;

import android.graphics.drawable.Drawable;
import java.io.File;
import o2.k;
import p2.g;
import p2.i;
import r2.v;
import z2.b;

public final class d implements i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f169a;

    public /* synthetic */ d(int i8) {
        this.f169a = i8;
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj, g gVar) {
        switch (this.f169a) {
            case 0:
                Drawable drawable = (Drawable) obj;
                return true;
            default:
                File file = (File) obj;
                return true;
        }
    }

    public final v b(Object obj, int i8, int i9, g gVar) {
        switch (this.f169a) {
            case 0:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new k(drawable, 1);
                }
                return null;
            default:
                return new b((File) obj);
        }
    }
}
