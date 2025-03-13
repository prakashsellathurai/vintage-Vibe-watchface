package w2;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import k3.j;
import p2.g;
import v2.n;
import v2.o;
import v2.r;

public final class d<DataT> implements n<Uri, DataT> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f7990a;

    /* renamed from: b  reason: collision with root package name */
    public final n<File, DataT> f7991b;

    /* renamed from: c  reason: collision with root package name */
    public final n<Uri, DataT> f7992c;

    /* renamed from: d  reason: collision with root package name */
    public final Class<DataT> f7993d;

    public static abstract class a<DataT> implements o<Uri, DataT> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f7994a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<DataT> f7995b;

        public a(Context context, Class<DataT> cls) {
            this.f7994a = context;
            this.f7995b = cls;
        }

        public final n<Uri, DataT> b(r rVar) {
            Class<DataT> cls = this.f7995b;
            return new d(this.f7994a, rVar.b(File.class, cls), rVar.b(Uri.class, cls), cls);
        }
    }

    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: w2.d$d  reason: collision with other inner class name */
    public static final class C0152d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* renamed from: p  reason: collision with root package name */
        public static final String[] f7996p = {"_data"};

        /* renamed from: f  reason: collision with root package name */
        public final Context f7997f;

        /* renamed from: g  reason: collision with root package name */
        public final n<File, DataT> f7998g;

        /* renamed from: h  reason: collision with root package name */
        public final n<Uri, DataT> f7999h;

        /* renamed from: i  reason: collision with root package name */
        public final Uri f8000i;

        /* renamed from: j  reason: collision with root package name */
        public final int f8001j;

        /* renamed from: k  reason: collision with root package name */
        public final int f8002k;

        /* renamed from: l  reason: collision with root package name */
        public final g f8003l;

        /* renamed from: m  reason: collision with root package name */
        public final Class<DataT> f8004m;

        /* renamed from: n  reason: collision with root package name */
        public volatile boolean f8005n;

        /* renamed from: o  reason: collision with root package name */
        public volatile com.bumptech.glide.load.data.d<DataT> f8006o;

        public C0152d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Uri uri, int i8, int i9, g gVar, Class<DataT> cls) {
            this.f7997f = context.getApplicationContext();
            this.f7998g = nVar;
            this.f7999h = nVar2;
            this.f8000i = uri;
            this.f8001j = i8;
            this.f8002k = i9;
            this.f8003l = gVar;
            this.f8004m = cls;
        }

        public final Class<DataT> a() {
            return this.f8004m;
        }

        public final void b() {
            com.bumptech.glide.load.data.d<DataT> dVar = this.f8006o;
            if (dVar != null) {
                dVar.b();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0074  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bumptech.glide.load.data.d<DataT> c() {
            /*
                r14 = this;
                boolean r0 = android.os.Environment.isExternalStorageLegacy()
                r1 = 0
                p2.g r2 = r14.f8003l
                int r3 = r14.f8002k
                int r4 = r14.f8001j
                android.content.Context r5 = r14.f7997f
                if (r0 == 0) goto L_0x0078
                android.net.Uri r0 = r14.f8000i
                java.lang.String r12 = "File path was empty in media store for: "
                java.lang.String r13 = "Failed to media store entry for: "
                android.content.ContentResolver r6 = r5.getContentResolver()     // Catch:{ all -> 0x0071 }
                java.lang.String[] r8 = f7996p     // Catch:{ all -> 0x0071 }
                r9 = 0
                r10 = 0
                r11 = 0
                r7 = r0
                android.database.Cursor r5 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0071 }
                if (r5 == 0) goto L_0x005c
                boolean r6 = r5.moveToFirst()     // Catch:{ all -> 0x006e }
                if (r6 == 0) goto L_0x005c
                java.lang.String r6 = "_data"
                int r6 = r5.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x006e }
                java.lang.String r6 = r5.getString(r6)     // Catch:{ all -> 0x006e }
                boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x006e }
                if (r7 != 0) goto L_0x004a
                java.io.File r0 = new java.io.File     // Catch:{ all -> 0x006e }
                r0.<init>(r6)     // Catch:{ all -> 0x006e }
                r5.close()
                v2.n<java.io.File, DataT> r14 = r14.f7998g
                v2.n$a r14 = r14.a(r0, r4, r3, r2)
                goto L_0x0091
            L_0x004a:
                java.io.FileNotFoundException r14 = new java.io.FileNotFoundException     // Catch:{ all -> 0x006e }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x006e }
                r1.<init>(r12)     // Catch:{ all -> 0x006e }
                r1.append(r0)     // Catch:{ all -> 0x006e }
                java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x006e }
                r14.<init>(r0)     // Catch:{ all -> 0x006e }
                throw r14     // Catch:{ all -> 0x006e }
            L_0x005c:
                java.io.FileNotFoundException r14 = new java.io.FileNotFoundException     // Catch:{ all -> 0x006e }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x006e }
                r1.<init>(r13)     // Catch:{ all -> 0x006e }
                r1.append(r0)     // Catch:{ all -> 0x006e }
                java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x006e }
                r14.<init>(r0)     // Catch:{ all -> 0x006e }
                throw r14     // Catch:{ all -> 0x006e }
            L_0x006e:
                r14 = move-exception
                r1 = r5
                goto L_0x0072
            L_0x0071:
                r14 = move-exception
            L_0x0072:
                if (r1 == 0) goto L_0x0077
                r1.close()
            L_0x0077:
                throw r14
            L_0x0078:
                java.lang.String r0 = "android.permission.ACCESS_MEDIA_LOCATION"
                int r0 = r5.checkSelfPermission(r0)
                if (r0 != 0) goto L_0x0082
                r0 = 1
                goto L_0x0083
            L_0x0082:
                r0 = 0
            L_0x0083:
                android.net.Uri r5 = r14.f8000i
                if (r0 == 0) goto L_0x008b
                android.net.Uri r5 = android.provider.MediaStore.setRequireOriginal(r5)
            L_0x008b:
                v2.n<android.net.Uri, DataT> r14 = r14.f7999h
                v2.n$a r14 = r14.a(r5, r4, r3, r2)
            L_0x0091:
                if (r14 == 0) goto L_0x0095
                com.bumptech.glide.load.data.d<Data> r1 = r14.f7886c
            L_0x0095:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: w2.d.C0152d.c():com.bumptech.glide.load.data.d");
        }

        public final void cancel() {
            this.f8005n = true;
            com.bumptech.glide.load.data.d<DataT> dVar = this.f8006o;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        public final p2.a e() {
            return p2.a.f6294f;
        }

        public final void f(h hVar, d.a<? super DataT> aVar) {
            try {
                com.bumptech.glide.load.data.d<DataT> c9 = c();
                if (c9 == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f8000i));
                    return;
                }
                this.f8006o = c9;
                if (this.f8005n) {
                    cancel();
                } else {
                    c9.f(hVar, aVar);
                }
            } catch (FileNotFoundException e) {
                aVar.c(e);
            }
        }
    }

    public d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Class<DataT> cls) {
        this.f7990a = context.getApplicationContext();
        this.f7991b = nVar;
        this.f7992c = nVar2;
        this.f7993d = cls;
    }

    public final n.a a(Object obj, int i8, int i9, g gVar) {
        Uri uri = (Uri) obj;
        return new n.a(new j3.b(uri), new C0152d(this.f7990a, this.f7991b, this.f7992c, uri, i8, i9, gVar, this.f7993d));
    }

    public final boolean b(Object obj) {
        return j.H((Uri) obj);
    }
}
