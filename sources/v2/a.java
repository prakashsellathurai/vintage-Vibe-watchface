package v2;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.h;
import java.io.InputStream;
import p2.g;
import v2.n;

public final class a<Data> implements n<Uri, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final AssetManager f7844a;

    /* renamed from: b  reason: collision with root package name */
    public final C0144a<Data> f7845b;

    /* renamed from: v2.a$a  reason: collision with other inner class name */
    public interface C0144a<Data> {
        h a(AssetManager assetManager, String str);
    }

    public static class b implements o<Uri, ParcelFileDescriptor>, C0144a<ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final AssetManager f7846a;

        public b(AssetManager assetManager) {
            this.f7846a = assetManager;
        }

        public final h a(AssetManager assetManager, String str) {
            return new h(assetManager, str, 0);
        }

        public final n<Uri, ParcelFileDescriptor> b(r rVar) {
            return new a(this.f7846a, this);
        }
    }

    public static class c implements o<Uri, InputStream>, C0144a<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final AssetManager f7847a;

        public c(AssetManager assetManager) {
            this.f7847a = assetManager;
        }

        public final h a(AssetManager assetManager, String str) {
            return new h(assetManager, str, 1);
        }

        public final n<Uri, InputStream> b(r rVar) {
            return new a(this.f7847a, this);
        }
    }

    public a(AssetManager assetManager, C0144a<Data> aVar) {
        this.f7844a = assetManager;
        this.f7845b = aVar;
    }

    public final n.a a(Object obj, int i8, int i9, g gVar) {
        Uri uri = (Uri) obj;
        return new n.a(new j3.b(uri), this.f7845b.a(this.f7844a, uri.toString().substring(22)));
    }

    public final boolean b(Object obj) {
        Uri uri = (Uri) obj;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
