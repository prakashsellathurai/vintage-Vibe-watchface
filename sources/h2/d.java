package h2;

import android.content.res.Resources;
import c3.b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import p2.g;
import r2.v;
import y1.c;

public final class d implements p2.d, b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4744a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4745b;

    public d() {
        throw null;
    }

    public d(int i8) {
        this.f4744a = 8;
        this.f4745b = new ArrayList(i8);
    }

    public static String c(String str, b bVar, boolean z8) {
        StringBuilder sb = new StringBuilder("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        String str2 = bVar.f4743f;
        if (z8) {
            str2 = ".temp" + str2;
        }
        sb.append(str2);
        return sb.toString();
    }

    public final void a(String str) {
        ((ArrayList) this.f4745b).add(str);
    }

    public final void b(Object obj) {
        Object[] objArr = (Object[]) obj;
        if (objArr.length > 0) {
            ArrayList arrayList = (ArrayList) this.f4745b;
            arrayList.ensureCapacity(arrayList.size() + objArr.length);
            Collections.addAll(arrayList, objArr);
        }
    }

    public final File d() {
        c cVar = (c) ((c) this.f4745b);
        cVar.getClass();
        File file = new File(cVar.f8214a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final v e(v vVar, g gVar) {
        Resources resources = (Resources) this.f4745b;
        if (vVar == null) {
            return null;
        }
        return new y2.c(resources, vVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003b A[SYNTHETIC, Splitter:B:21:0x003b] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045 A[SYNTHETIC, Splitter:B:27:0x0045] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f(java.lang.Object r4, java.io.File r5, p2.g r6) {
        /*
            r3 = this;
            java.io.InputStream r4 = (java.io.InputStream) r4
            java.lang.Object r3 = r3.f4745b
            s2.b r3 = (s2.b) r3
            r6 = 65536(0x10000, float:9.18355E-41)
            java.lang.Class<byte[]> r0 = byte[].class
            java.lang.Object r6 = r3.d(r6, r0)
            byte[] r6 = (byte[]) r6
            r0 = 0
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0033 }
            r2.<init>(r5)     // Catch:{ IOException -> 0x0033 }
        L_0x0017:
            int r5 = r4.read(r6)     // Catch:{ IOException -> 0x002f, all -> 0x002d }
            r1 = -1
            if (r5 == r1) goto L_0x0022
            r2.write(r6, r0, r5)     // Catch:{ IOException -> 0x002f, all -> 0x002d }
            goto L_0x0017
        L_0x0022:
            r2.close()     // Catch:{ IOException -> 0x002f, all -> 0x002d }
            r2.close()     // Catch:{ IOException -> 0x0028 }
        L_0x0028:
            r3.c(r6)
            r0 = 1
            goto L_0x0041
        L_0x002d:
            r4 = move-exception
            goto L_0x0043
        L_0x002f:
            r1 = r2
            goto L_0x0033
        L_0x0031:
            r4 = move-exception
            goto L_0x0042
        L_0x0033:
            java.lang.String r4 = "StreamEncoder"
            r5 = 3
            android.util.Log.isLoggable(r4, r5)     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x003e
            r1.close()     // Catch:{ IOException -> 0x003e }
        L_0x003e:
            r3.c(r6)
        L_0x0041:
            return r0
        L_0x0042:
            r2 = r1
        L_0x0043:
            if (r2 == 0) goto L_0x0048
            r2.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            r3.c(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.d.f(java.lang.Object, java.io.File, p2.g):boolean");
    }

    public final int g() {
        return ((ArrayList) this.f4745b).size();
    }

    public final Object[] i(Object[] objArr) {
        return ((ArrayList) this.f4745b).toArray(objArr);
    }

    public final File j(String str, InputStream inputStream, b bVar) {
        FileOutputStream fileOutputStream;
        File file = new File(d(), c(str, bVar, true));
        try {
            fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    return file;
                }
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }

    public final String toString() {
        switch (this.f4744a) {
            case 9:
                return "<" + ((String) this.f4745b) + '>';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ d(int i8, Object obj) {
        this.f4744a = i8;
        this.f4745b = obj;
    }

    public d(Resources resources) {
        this.f4744a = 6;
        this.f4745b = resources;
    }
}
