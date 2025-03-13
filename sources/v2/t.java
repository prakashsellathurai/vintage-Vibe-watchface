package v2;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

public final class t<Data> implements n<String, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final n<Uri, Data> f7914a;

    public static final class a implements o<String, AssetFileDescriptor> {
        public final n<String, AssetFileDescriptor> b(r rVar) {
            return new t(rVar.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements o<String, ParcelFileDescriptor> {
        public final n<String, ParcelFileDescriptor> b(r rVar) {
            return new t(rVar.b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class c implements o<String, InputStream> {
        public final n<String, InputStream> b(r rVar) {
            return new t(rVar.b(Uri.class, InputStream.class));
        }
    }

    public t(n<Uri, Data> nVar) {
        this.f7914a = nVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        if (r0.getScheme() == null) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final v2.n.a a(java.lang.Object r4, int r5, int r6, p2.g r7) {
        /*
            r3 = this;
            java.lang.String r4 = (java.lang.String) r4
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L_0x000b
            r0 = r1
            goto L_0x0028
        L_0x000b:
            r0 = 0
            char r0 = r4.charAt(r0)
            r2 = 47
            if (r0 != r2) goto L_0x0015
            goto L_0x001f
        L_0x0015:
            android.net.Uri r0 = android.net.Uri.parse(r4)
            java.lang.String r2 = r0.getScheme()
            if (r2 != 0) goto L_0x0028
        L_0x001f:
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
        L_0x0028:
            if (r0 == 0) goto L_0x0037
            v2.n<android.net.Uri, Data> r3 = r3.f7914a
            boolean r4 = r3.b(r0)
            if (r4 != 0) goto L_0x0033
            goto L_0x0037
        L_0x0033:
            v2.n$a r1 = r3.a(r0, r5, r6, r7)
        L_0x0037:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.t.a(java.lang.Object, int, int, p2.g):v2.n$a");
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        String str = (String) obj;
        return true;
    }
}
