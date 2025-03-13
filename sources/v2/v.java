package v2;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.l;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p2.g;
import v2.n;

public final class v<Data> implements n<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f7918b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", "content"})));

    /* renamed from: a  reason: collision with root package name */
    public final c<Data> f7919a;

    public static final class a implements o<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f7920a;

        public a(ContentResolver contentResolver) {
            this.f7920a = contentResolver;
        }

        public final com.bumptech.glide.load.data.d<AssetFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f7920a, uri, 0);
        }

        public final n<Uri, AssetFileDescriptor> b(r rVar) {
            return new v(this);
        }
    }

    public static class b implements o<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f7921a;

        public b(ContentResolver contentResolver) {
            this.f7921a = contentResolver;
        }

        public final com.bumptech.glide.load.data.d<ParcelFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f7921a, uri, 1);
        }

        public final n<Uri, ParcelFileDescriptor> b(r rVar) {
            return new v(this);
        }
    }

    public interface c<Data> {
        com.bumptech.glide.load.data.d<Data> a(Uri uri);
    }

    public static class d implements o<Uri, InputStream>, c<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f7922a;

        public d(ContentResolver contentResolver) {
            this.f7922a = contentResolver;
        }

        public final com.bumptech.glide.load.data.d<InputStream> a(Uri uri) {
            return new l(this.f7922a, uri);
        }

        public final n<Uri, InputStream> b(r rVar) {
            return new v(this);
        }
    }

    public v(c<Data> cVar) {
        this.f7919a = cVar;
    }

    public final n.a a(Object obj, int i8, int i9, g gVar) {
        Uri uri = (Uri) obj;
        return new n.a(new j3.b(uri), this.f7919a.a(uri));
    }

    public final boolean b(Object obj) {
        return f7918b.contains(((Uri) obj).getScheme());
    }
}
