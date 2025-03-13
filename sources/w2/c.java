package w2;

import android.content.Context;
import android.net.Uri;
import j3.b;
import java.io.InputStream;
import k3.j;
import p2.g;
import q2.a;
import v2.n;
import v2.o;
import v2.r;
import y2.s;

public final class c implements n<Uri, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f7988a;

    public static class a implements o<Uri, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f7989a;

        public a(Context context) {
            this.f7989a = context;
        }

        public final n<Uri, InputStream> b(r rVar) {
            return new c(this.f7989a);
        }
    }

    public c(Context context) {
        this.f7988a = context.getApplicationContext();
    }

    public final n.a a(Object obj, int i8, int i9, g gVar) {
        Uri uri = (Uri) obj;
        boolean z8 = true;
        if (i8 != Integer.MIN_VALUE && i9 != Integer.MIN_VALUE && i8 <= 512 && i9 <= 384) {
            Long l8 = (Long) gVar.c(s.f8394d);
            if (l8 == null || l8.longValue() != -1) {
                z8 = false;
            }
            if (z8) {
                b bVar = new b(uri);
                Context context = this.f7988a;
                return new n.a(bVar, q2.a.c(context, uri, new a.b(context.getContentResolver())));
            }
        }
        return null;
    }

    public final boolean b(Object obj) {
        Uri uri = (Uri) obj;
        return j.H(uri) && uri.getPathSegments().contains("video");
    }
}
