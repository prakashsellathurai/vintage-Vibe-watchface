package q2;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public final class a implements d<InputStream> {

    /* renamed from: f  reason: collision with root package name */
    public final Uri f6513f;

    /* renamed from: g  reason: collision with root package name */
    public final c f6514g;

    /* renamed from: h  reason: collision with root package name */
    public InputStream f6515h;

    /* renamed from: q2.a$a  reason: collision with other inner class name */
    public static class C0113a implements b {

        /* renamed from: b  reason: collision with root package name */
        public static final String[] f6516b = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f6517a;

        public C0113a(ContentResolver contentResolver) {
            this.f6517a = contentResolver;
        }

        public final Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f6517a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f6516b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    public static class b implements b {

        /* renamed from: b  reason: collision with root package name */
        public static final String[] f6518b = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f6519a;

        public b(ContentResolver contentResolver) {
            this.f6519a = contentResolver;
        }

        public final Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f6519a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f6518b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    public a(Uri uri, c cVar) {
        this.f6513f = uri;
        this.f6514g = cVar;
    }

    public static a c(Context context, Uri uri, b bVar) {
        return new a(uri, new c(com.bumptech.glide.b.b(context).f2916d.d(), bVar, com.bumptech.glide.b.b(context).e, context.getContentResolver()));
    }

    public final Class<InputStream> a() {
        return InputStream.class;
    }

    public final void b() {
        InputStream inputStream = this.f6515h;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public final void cancel() {
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:15|16|(1:18)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:43|44|(1:46)|(2:48|49)) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        r3 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r5 != null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        if (android.util.Log.isLoggable("ThumbStreamOpener", 3) != false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        java.util.Objects.toString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        if (r5 != null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
        r6 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0081, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0087, code lost:
        if (android.util.Log.isLoggable("ThumbStreamOpener", 3) != false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0089, code lost:
        java.util.Objects.toString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0092, code lost:
        if (r3 != 0) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0097, code lost:
        throw r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00c7, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        r10 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0083 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.InputStream d() {
        /*
            r10 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            android.net.Uri r1 = r10.f6513f
            q2.c r10 = r10.f6514g
            r10.getClass()
            r2 = 3
            r3 = 0
            r4 = 0
            q2.b r5 = r10.f6520a     // Catch:{ SecurityException -> 0x002c, all -> 0x0029 }
            android.database.Cursor r5 = r5.a(r1)     // Catch:{ SecurityException -> 0x002c, all -> 0x0029 }
            if (r5 == 0) goto L_0x0026
            boolean r6 = r5.moveToFirst()     // Catch:{ SecurityException -> 0x002d }
            if (r6 == 0) goto L_0x0026
            java.lang.String r6 = r5.getString(r4)     // Catch:{ SecurityException -> 0x002d }
            r5.close()
            goto L_0x003c
        L_0x0022:
            r10 = move-exception
            r3 = r5
            goto L_0x00c5
        L_0x0026:
            if (r5 == 0) goto L_0x003b
            goto L_0x0038
        L_0x0029:
            r10 = move-exception
            goto L_0x00c5
        L_0x002c:
            r5 = r3
        L_0x002d:
            boolean r6 = android.util.Log.isLoggable(r0, r2)     // Catch:{ all -> 0x0022 }
            if (r6 == 0) goto L_0x0036
            java.util.Objects.toString(r1)     // Catch:{ all -> 0x0022 }
        L_0x0036:
            if (r5 == 0) goto L_0x003b
        L_0x0038:
            r5.close()
        L_0x003b:
            r6 = r3
        L_0x003c:
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 == 0) goto L_0x0044
        L_0x0042:
            r4 = r3
            goto L_0x0067
        L_0x0044:
            java.io.File r5 = new java.io.File
            r5.<init>(r6)
            boolean r6 = r5.exists()
            if (r6 == 0) goto L_0x005a
            long r6 = r5.length()
            r8 = 0
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x005a
            r4 = 1
        L_0x005a:
            if (r4 != 0) goto L_0x005d
            goto L_0x0042
        L_0x005d:
            android.net.Uri r4 = android.net.Uri.fromFile(r5)
            android.content.ContentResolver r5 = r10.f6522c     // Catch:{ NullPointerException -> 0x00a2 }
            java.io.InputStream r4 = r5.openInputStream(r4)     // Catch:{ NullPointerException -> 0x00a2 }
        L_0x0067:
            r5 = -1
            if (r4 == 0) goto L_0x0098
            r10.getClass()
            android.content.ContentResolver r6 = r10.f6522c     // Catch:{ IOException | NullPointerException -> 0x0083 }
            java.io.InputStream r3 = r6.openInputStream(r1)     // Catch:{ IOException | NullPointerException -> 0x0083 }
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r6 = r10.f6523d     // Catch:{ IOException | NullPointerException -> 0x0083 }
            s2.b r10 = r10.f6521b     // Catch:{ IOException | NullPointerException -> 0x0083 }
            int r10 = com.bumptech.glide.load.a.a(r10, r3, r6)     // Catch:{ IOException | NullPointerException -> 0x0083 }
            if (r3 == 0) goto L_0x0099
            r3.close()     // Catch:{ IOException -> 0x0099 }
            goto L_0x0099
        L_0x0081:
            r10 = move-exception
            goto L_0x0092
        L_0x0083:
            boolean r10 = android.util.Log.isLoggable(r0, r2)     // Catch:{ all -> 0x0081 }
            if (r10 == 0) goto L_0x008c
            java.util.Objects.toString(r1)     // Catch:{ all -> 0x0081 }
        L_0x008c:
            if (r3 == 0) goto L_0x0098
            r3.close()     // Catch:{ IOException -> 0x0098 }
            goto L_0x0098
        L_0x0092:
            if (r3 == 0) goto L_0x0097
            r3.close()     // Catch:{ IOException -> 0x0097 }
        L_0x0097:
            throw r10
        L_0x0098:
            r10 = r5
        L_0x0099:
            if (r10 == r5) goto L_0x00a1
            com.bumptech.glide.load.data.g r0 = new com.bumptech.glide.load.data.g
            r0.<init>(r10, r4)
            r4 = r0
        L_0x00a1:
            return r4
        L_0x00a2:
            r10 = move-exception
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "NPE opening uri: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " -> "
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            java.lang.Throwable r10 = r0.initCause(r10)
            java.io.FileNotFoundException r10 = (java.io.FileNotFoundException) r10
            throw r10
        L_0x00c5:
            if (r3 == 0) goto L_0x00ca
            r3.close()
        L_0x00ca:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.a.d():java.io.InputStream");
    }

    public final p2.a e() {
        return p2.a.f6294f;
    }

    public final void f(h hVar, d.a<? super InputStream> aVar) {
        try {
            InputStream d9 = d();
            this.f6515h = d9;
            aVar.d(d9);
        } catch (FileNotFoundException e) {
            Log.isLoggable("MediaStoreThumbFetcher", 3);
            aVar.c(e);
        }
    }
}
