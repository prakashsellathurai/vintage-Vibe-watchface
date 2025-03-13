package v2;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import p2.g;
import v2.n;

public final class j implements n<Uri, File> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f7874a;

    public static final class a implements o<Uri, File> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f7875a;

        public a(Context context) {
            this.f7875a = context;
        }

        public final n<Uri, File> b(r rVar) {
            return new j(this.f7875a);
        }
    }

    public static class b implements d<File> {

        /* renamed from: h  reason: collision with root package name */
        public static final String[] f7876h = {"_data"};

        /* renamed from: f  reason: collision with root package name */
        public final Context f7877f;

        /* renamed from: g  reason: collision with root package name */
        public final Uri f7878g;

        public b(Context context, Uri uri) {
            this.f7877f = context;
            this.f7878g = uri;
        }

        public final Class<File> a() {
            return File.class;
        }

        public final void b() {
        }

        public final void cancel() {
        }

        public final p2.a e() {
            return p2.a.f6294f;
        }

        public final void f(h hVar, d.a<? super File> aVar) {
            Cursor query = this.f7877f.getContentResolver().query(this.f7878g, f7876h, (String) null, (String[]) null, (String) null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                aVar.c(new FileNotFoundException("Failed to find file path for: " + this.f7878g));
                return;
            }
            aVar.d(new File(str));
        }
    }

    public j(Context context) {
        this.f7874a = context;
    }

    public final n.a a(Object obj, int i8, int i9, g gVar) {
        Uri uri = (Uri) obj;
        return new n.a(new j3.b(uri), new b(this.f7874a, uri));
    }

    public final boolean b(Object obj) {
        return k3.j.H((Uri) obj);
    }
}
