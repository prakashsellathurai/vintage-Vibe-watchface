package v2;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.InputStream;
import p2.g;
import v2.n;

public final class s<Data> implements n<Integer, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final n<Uri, Data> f7908a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f7909b;

    public static final class a implements o<Integer, AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f7910a;

        public a(Resources resources) {
            this.f7910a = resources;
        }

        public final n<Integer, AssetFileDescriptor> b(r rVar) {
            return new s(this.f7910a, rVar.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements o<Integer, ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f7911a;

        public b(Resources resources) {
            this.f7911a = resources;
        }

        public final n<Integer, ParcelFileDescriptor> b(r rVar) {
            return new s(this.f7911a, rVar.b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class c implements o<Integer, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f7912a;

        public c(Resources resources) {
            this.f7912a = resources;
        }

        public final n<Integer, InputStream> b(r rVar) {
            return new s(this.f7912a, rVar.b(Uri.class, InputStream.class));
        }
    }

    public static class d implements o<Integer, Uri> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f7913a;

        public d(Resources resources) {
            this.f7913a = resources;
        }

        public final n<Integer, Uri> b(r rVar) {
            return new s(this.f7913a, u.f7915a);
        }
    }

    public s(Resources resources, n<Uri, Data> nVar) {
        this.f7909b = resources;
        this.f7908a = nVar;
    }

    public final n.a a(Object obj, int i8, int i9, g gVar) {
        Uri uri;
        Integer num = (Integer) obj;
        Resources resources = this.f7909b;
        try {
            uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num.intValue()) + '/' + resources.getResourceTypeName(num.intValue()) + '/' + resources.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num, e);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.f7908a.a(uri, i8, i9, gVar);
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        Integer num = (Integer) obj;
        return true;
    }
}
