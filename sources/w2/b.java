package w2;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import k3.j;
import p2.g;
import q2.a;
import v2.n;
import v2.o;
import v2.r;

public final class b implements n<Uri, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f7986a;

    public static class a implements o<Uri, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f7987a;

        public a(Context context) {
            this.f7987a = context;
        }

        public final n<Uri, InputStream> b(r rVar) {
            return new b(this.f7987a);
        }
    }

    public b(Context context) {
        this.f7986a = context.getApplicationContext();
    }

    public final n.a a(Object obj, int i8, int i9, g gVar) {
        Uri uri = (Uri) obj;
        if (!(i8 != Integer.MIN_VALUE && i9 != Integer.MIN_VALUE && i8 <= 512 && i9 <= 384)) {
            return null;
        }
        j3.b bVar = new j3.b(uri);
        Context context = this.f7986a;
        return new n.a(bVar, q2.a.c(context, uri, new a.C0113a(context.getContentResolver())));
    }

    public final boolean b(Object obj) {
        Uri uri = (Uri) obj;
        return j.H(uri) && !uri.getPathSegments().contains("video");
    }
}
