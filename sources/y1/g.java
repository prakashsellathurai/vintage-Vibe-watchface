package y1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PathMeasure;
import g8.e;
import g8.i;
import i2.q;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f8233a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f8234b = {80, 75, 3, 4};

    public class a implements o<f> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8235a;

        public a(String str) {
            this.f8235a = str;
        }

        public final void a(Object obj) {
            f fVar = (f) obj;
            g.f8233a.remove(this.f8235a);
        }
    }

    public class b implements o<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8236a;

        public b(String str) {
            this.f8236a = str;
        }

        public final void a(Object obj) {
            Throwable th = (Throwable) obj;
            g.f8233a.remove(this.f8236a);
        }
    }

    public class c implements Callable<r<f>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f8237a;

        public c(f fVar) {
            this.f8237a = fVar;
        }

        public final Object call() {
            return new r(this.f8237a);
        }
    }

    public static t<f> a(String str, Callable<r<f>> callable) {
        f a9 = str == null ? null : d2.g.f3999b.f4000a.a(str);
        if (a9 != null) {
            return new t<>(new c(a9), false);
        }
        HashMap hashMap = f8233a;
        if (str != null && hashMap.containsKey(str)) {
            return (t) hashMap.get(str);
        }
        t<f> tVar = new t<>(callable, false);
        if (str != null) {
            a aVar = new a(str);
            synchronized (tVar) {
                if (!(tVar.f8327d == null || tVar.f8327d.f8321a == null)) {
                    aVar.a(tVar.f8327d.f8321a);
                }
                tVar.f8324a.add(aVar);
            }
            b bVar = new b(str);
            synchronized (tVar) {
                if (!(tVar.f8327d == null || tVar.f8327d.f8322b == null)) {
                    bVar.a(tVar.f8327d.f8322b);
                }
                tVar.f8325b.add(bVar);
            }
            hashMap.put(str, tVar);
        }
        return tVar;
    }

    public static r<f> b(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip")) {
                if (!str.endsWith(".lottie")) {
                    return c(context.getAssets().open(str), str2);
                }
            }
            return f(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new r<>((Throwable) e);
        }
    }

    public static r<f> c(InputStream inputStream, String str) {
        try {
            i iVar = new i(e.a(inputStream));
            String[] strArr = j2.b.f4966j;
            return d(new j2.c(iVar), str, true);
        } finally {
            k2.g.b(inputStream);
        }
    }

    public static r d(j2.c cVar, String str, boolean z8) {
        try {
            f a9 = q.a(cVar);
            if (str != null) {
                d2.g.f3999b.f4000a.b(str, a9);
            }
            r rVar = new r(a9);
            if (z8) {
                k2.g.b(cVar);
            }
            return rVar;
        } catch (Exception e) {
            r rVar2 = new r((Throwable) e);
            if (z8) {
                k2.g.b(cVar);
            }
            return rVar2;
        } catch (Throwable th) {
            if (z8) {
                k2.g.b(cVar);
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        k2.c.f5106a.getClass();
        r5 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static y1.r<y1.f> e(android.content.Context r5, int r6, java.lang.String r7) {
        /*
            android.content.res.Resources r5 = r5.getResources()     // Catch:{ NotFoundException -> 0x0055 }
            java.io.InputStream r5 = r5.openRawResource(r6)     // Catch:{ NotFoundException -> 0x0055 }
            g8.d r5 = g8.e.a(r5)     // Catch:{ NotFoundException -> 0x0055 }
            g8.i r6 = new g8.i     // Catch:{ NotFoundException -> 0x0055 }
            r6.<init>(r5)     // Catch:{ NotFoundException -> 0x0055 }
            g8.i r5 = r6.a()     // Catch:{ Exception -> 0x002f }
            byte[] r0 = f8234b     // Catch:{ Exception -> 0x002f }
            int r1 = r0.length     // Catch:{ Exception -> 0x002f }
            r2 = 0
        L_0x0019:
            if (r2 >= r1) goto L_0x0029
            byte r3 = r0[r2]     // Catch:{ Exception -> 0x002f }
            byte r4 = r5.c()     // Catch:{ Exception -> 0x002f }
            if (r4 == r3) goto L_0x0026
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x002f }
            goto L_0x0036
        L_0x0026:
            int r2 = r2 + 1
            goto L_0x0019
        L_0x0029:
            r5.close()     // Catch:{ Exception -> 0x002f }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x002f }
            goto L_0x0036
        L_0x002f:
            k2.b r5 = k2.c.f5106a     // Catch:{ NotFoundException -> 0x0055 }
            r5.getClass()     // Catch:{ NotFoundException -> 0x0055 }
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ NotFoundException -> 0x0055 }
        L_0x0036:
            boolean r5 = r5.booleanValue()     // Catch:{ NotFoundException -> 0x0055 }
            if (r5 == 0) goto L_0x004b
            java.util.zip.ZipInputStream r5 = new java.util.zip.ZipInputStream     // Catch:{ NotFoundException -> 0x0055 }
            g8.h r0 = new g8.h     // Catch:{ NotFoundException -> 0x0055 }
            r0.<init>(r6)     // Catch:{ NotFoundException -> 0x0055 }
            r5.<init>(r0)     // Catch:{ NotFoundException -> 0x0055 }
            y1.r r5 = f(r5, r7)     // Catch:{ NotFoundException -> 0x0055 }
            return r5
        L_0x004b:
            g8.h r5 = new g8.h     // Catch:{ NotFoundException -> 0x0055 }
            r5.<init>(r6)     // Catch:{ NotFoundException -> 0x0055 }
            y1.r r5 = c(r5, r7)     // Catch:{ NotFoundException -> 0x0055 }
            return r5
        L_0x0055:
            r5 = move-exception
            y1.r r6 = new y1.r
            r6.<init>((java.lang.Throwable) r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.g.e(android.content.Context, int, java.lang.String):y1.r");
    }

    public static r<f> f(ZipInputStream zipInputStream, String str) {
        try {
            return g(zipInputStream, str);
        } finally {
            k2.g.b(zipInputStream);
        }
    }

    public static r<f> g(ZipInputStream zipInputStream, String str) {
        n nVar;
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            f fVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (!name.contains("__MACOSX")) {
                    if (!nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                        if (nextEntry.getName().contains(".json")) {
                            i iVar = new i(e.a(zipInputStream));
                            String[] strArr = j2.b.f4966j;
                            fVar = (f) d(new j2.c(iVar), (String) null, false).f8321a;
                        } else {
                            if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg")) {
                                if (name.contains(".jpeg")) {
                                }
                            }
                            String[] split = name.split("/");
                            hashMap.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                        }
                        nextEntry = zipInputStream.getNextEntry();
                    }
                }
                zipInputStream.closeEntry();
                nextEntry = zipInputStream.getNextEntry();
            }
            if (fVar == null) {
                return new r<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                Iterator<n> it = fVar.f8222d.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        nVar = null;
                        break;
                    }
                    nVar = it.next();
                    if (nVar.f8297c.equals(str2)) {
                        break;
                    }
                }
                if (nVar != null) {
                    Bitmap bitmap = (Bitmap) entry.getValue();
                    ThreadLocal<PathMeasure> threadLocal = k2.g.f5118a;
                    int width = bitmap.getWidth();
                    int i8 = nVar.f8295a;
                    int i9 = nVar.f8296b;
                    if (!(width == i8 && bitmap.getHeight() == i9)) {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i8, i9, true);
                        bitmap.recycle();
                        bitmap = createScaledBitmap;
                    }
                    nVar.f8298d = bitmap;
                }
            }
            for (Map.Entry next : fVar.f8222d.entrySet()) {
                if (((n) next.getValue()).f8298d == null) {
                    return new r<>((Throwable) new IllegalStateException("There is no image for " + ((n) next.getValue()).f8297c));
                }
            }
            if (str != null) {
                d2.g.f3999b.f4000a.b(str, fVar);
            }
            return new r<>(fVar);
        } catch (IOException e) {
            return new r<>((Throwable) e);
        }
    }

    public static String h(Context context, int i8) {
        StringBuilder sb = new StringBuilder("rawRes");
        sb.append((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_");
        sb.append(i8);
        return sb.toString();
    }
}
