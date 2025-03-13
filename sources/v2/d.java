package v2;

import android.util.Base64;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import p2.g;
import v2.n;

public final class d<Model, Data> implements n<Model, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final a<Data> f7852a;

    public interface a<Data> {
    }

    public static final class b<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: f  reason: collision with root package name */
        public final String f7853f;

        /* renamed from: g  reason: collision with root package name */
        public final a<Data> f7854g;

        /* renamed from: h  reason: collision with root package name */
        public ByteArrayInputStream f7855h;

        public b(String str, a<Data> aVar) {
            this.f7853f = str;
            this.f7854g = aVar;
        }

        public final Class<Data> a() {
            this.f7854g.getClass();
            return InputStream.class;
        }

        public final void b() {
            try {
                a<Data> aVar = this.f7854g;
                ByteArrayInputStream byteArrayInputStream = this.f7855h;
                ((c.a) aVar).getClass();
                byteArrayInputStream.close();
            } catch (IOException unused) {
            }
        }

        public final void cancel() {
        }

        public final p2.a e() {
            return p2.a.f6294f;
        }

        public final void f(h hVar, d.a<? super Data> aVar) {
            try {
                ByteArrayInputStream a9 = ((c.a) this.f7854g).a(this.f7853f);
                this.f7855h = a9;
                aVar.d(a9);
            } catch (IllegalArgumentException e) {
                aVar.c(e);
            }
        }
    }

    public static final class c<Model> implements o<Model, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final a f7856a = new a();

        public class a implements a<InputStream> {
            public final ByteArrayInputStream a(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }
        }

        public final n<Model, InputStream> b(r rVar) {
            return new d(this.f7856a);
        }
    }

    public d(c.a aVar) {
        this.f7852a = aVar;
    }

    public final n.a<Data> a(Model model, int i8, int i9, g gVar) {
        return new n.a<>(new j3.b(model), new b(model.toString(), this.f7852a));
    }

    public final boolean b(Model model) {
        return model.toString().startsWith("data:image");
    }
}
