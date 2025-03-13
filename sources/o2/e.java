package o2;

import a3.b;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.InputStream;
import p2.g;
import p2.i;
import r2.v;
import y2.c;

public final class e implements i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6016a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f6017b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f6018c;

    public e(Resources resources, i iVar) {
        this.f6016a = 1;
        this.f6018c = resources;
        this.f6017b = iVar;
    }

    public final boolean a(Object obj, g gVar) {
        int i8 = this.f6016a;
        Object obj2 = this.f6017b;
        switch (i8) {
            case 0:
                InputStream inputStream = (InputStream) obj;
                ((i) obj2).getClass();
                ((Boolean) gVar.c(i.e)).booleanValue();
                return false;
            case 1:
                return ((i) obj2).a(obj, gVar);
            default:
                return "android.resource".equals(((Uri) obj).getScheme());
        }
    }

    public final v b(Object obj, int i8, int i9, g gVar) {
        int i10 = this.f6016a;
        Object obj2 = this.f6018c;
        Object obj3 = this.f6017b;
        switch (i10) {
            case 0:
                return ((i) obj3).a((InputStream) obj, i8, i9, gVar);
            case 1:
                v b9 = ((i) obj3).b(obj, i8, i9, gVar);
                Resources resources = (Resources) obj2;
                if (b9 == null) {
                    return null;
                }
                return new c(resources, b9);
            default:
                v c9 = ((a3.c) obj3).c((Uri) obj);
                if (c9 == null) {
                    return null;
                }
                return y2.i.a((s2.c) obj2, (Drawable) ((b) c9).get(), i8, i9);
        }
    }

    public /* synthetic */ e(Object obj, int i8, Object obj2) {
        this.f6016a = i8;
        this.f6017b = obj;
        this.f6018c = obj2;
    }
}
