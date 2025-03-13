package m2;

import android.annotation.TargetApi;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class a implements Closeable {

    /* renamed from: f  reason: collision with root package name */
    public final File f5413f;

    /* renamed from: g  reason: collision with root package name */
    public final File f5414g;

    /* renamed from: h  reason: collision with root package name */
    public final File f5415h;

    /* renamed from: i  reason: collision with root package name */
    public final File f5416i;

    /* renamed from: j  reason: collision with root package name */
    public final int f5417j;

    /* renamed from: k  reason: collision with root package name */
    public final long f5418k;

    /* renamed from: l  reason: collision with root package name */
    public final int f5419l;

    /* renamed from: m  reason: collision with root package name */
    public long f5420m = 0;

    /* renamed from: n  reason: collision with root package name */
    public BufferedWriter f5421n;

    /* renamed from: o  reason: collision with root package name */
    public final LinkedHashMap<String, d> f5422o = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: p  reason: collision with root package name */
    public int f5423p;

    /* renamed from: q  reason: collision with root package name */
    public long f5424q = 0;
    public final ThreadPoolExecutor r = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b());

    /* renamed from: s  reason: collision with root package name */
    public final Callable<Void> f5425s = new C0080a();

    /* renamed from: m2.a$a  reason: collision with other inner class name */
    public class C0080a implements Callable<Void> {
        public C0080a() {
        }

        public final Object call() {
            synchronized (a.this) {
                a aVar = a.this;
                if (aVar.f5421n != null) {
                    aVar.w();
                    if (a.this.n()) {
                        a.this.u();
                        a.this.f5423p = 0;
                    }
                }
            }
            return null;
        }
    }

    public static final class b implements ThreadFactory {
        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    public final class c {

        /* renamed from: a  reason: collision with root package name */
        public final d f5427a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f5428b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f5429c;

        public c(d dVar) {
            this.f5427a = dVar;
            this.f5428b = dVar.e ? null : new boolean[a.this.f5419l];
        }

        public final void a() {
            a.a(a.this, this, false);
        }

        public final File b() {
            File file;
            synchronized (a.this) {
                d dVar = this.f5427a;
                if (dVar.f5435f == this) {
                    if (!dVar.e) {
                        this.f5428b[0] = true;
                    }
                    file = dVar.f5434d[0];
                    a.this.f5413f.mkdirs();
                } else {
                    throw new IllegalStateException();
                }
            }
            return file;
        }
    }

    public final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f5431a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f5432b;

        /* renamed from: c  reason: collision with root package name */
        public final File[] f5433c;

        /* renamed from: d  reason: collision with root package name */
        public final File[] f5434d;
        public boolean e;

        /* renamed from: f  reason: collision with root package name */
        public c f5435f;

        public d(String str) {
            this.f5431a = str;
            int i8 = a.this.f5419l;
            this.f5432b = new long[i8];
            this.f5433c = new File[i8];
            this.f5434d = new File[i8];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i9 = 0; i9 < a.this.f5419l; i9++) {
                sb.append(i9);
                File[] fileArr = this.f5433c;
                String sb2 = sb.toString();
                File file = a.this.f5413f;
                fileArr[i9] = new File(file, sb2);
                sb.append(".tmp");
                this.f5434d[i9] = new File(file, sb.toString());
                sb.setLength(length);
            }
        }

        public final String a() {
            StringBuilder sb = new StringBuilder();
            for (long append : this.f5432b) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }
    }

    public final class e {

        /* renamed from: a  reason: collision with root package name */
        public final File[] f5437a;

        public e(File[] fileArr) {
            this.f5437a = fileArr;
        }
    }

    public a(File file, long j8) {
        File file2 = file;
        this.f5413f = file2;
        this.f5417j = 1;
        this.f5414g = new File(file2, "journal");
        this.f5415h = new File(file2, "journal.tmp");
        this.f5416i = new File(file2, "journal.bkp");
        this.f5419l = 1;
        this.f5418k = j8;
    }

    public static void a(a aVar, c cVar, boolean z8) {
        synchronized (aVar) {
            d dVar = cVar.f5427a;
            if (dVar.f5435f == cVar) {
                if (z8 && !dVar.e) {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= aVar.f5419l) {
                            break;
                        } else if (!cVar.f5428b[i8]) {
                            cVar.a();
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i8);
                        } else if (!dVar.f5434d[i8].exists()) {
                            cVar.a();
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
                for (int i9 = 0; i9 < aVar.f5419l; i9++) {
                    File file = dVar.f5434d[i9];
                    if (!z8) {
                        d(file);
                    } else if (file.exists()) {
                        File file2 = dVar.f5433c[i9];
                        file.renameTo(file2);
                        long j8 = dVar.f5432b[i9];
                        long length = file2.length();
                        dVar.f5432b[i9] = length;
                        aVar.f5420m = (aVar.f5420m - j8) + length;
                    }
                }
                aVar.f5423p++;
                dVar.f5435f = null;
                if (dVar.e || z8) {
                    dVar.e = true;
                    aVar.f5421n.append("CLEAN");
                    aVar.f5421n.append(' ');
                    aVar.f5421n.append(dVar.f5431a);
                    aVar.f5421n.append(dVar.a());
                    aVar.f5421n.append(10);
                    if (z8) {
                        aVar.f5424q++;
                        dVar.getClass();
                    }
                } else {
                    aVar.f5422o.remove(dVar.f5431a);
                    aVar.f5421n.append("REMOVE");
                    aVar.f5421n.append(' ');
                    aVar.f5421n.append(dVar.f5431a);
                    aVar.f5421n.append(10);
                }
                h(aVar.f5421n);
                if (aVar.f5420m > aVar.f5418k || aVar.n()) {
                    aVar.r.submit(aVar.f5425s);
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @TargetApi(26)
    public static void c(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void d(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    public static void h(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static a o(File file, long j8) {
        if (j8 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    v(file2, file3, false);
                }
            }
            a aVar = new a(file, j8);
            if (aVar.f5414g.exists()) {
                try {
                    aVar.s();
                    aVar.q();
                    return aVar;
                } catch (IOException e4) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e4.getMessage() + ", removing");
                    aVar.close();
                    c.a(aVar.f5413f);
                }
            }
            file.mkdirs();
            a aVar2 = new a(file, j8);
            aVar2.u();
            return aVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public static void v(File file, File file2, boolean z8) {
        if (z8) {
            d(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final synchronized void close() {
        if (this.f5421n != null) {
            Iterator it = new ArrayList(this.f5422o.values()).iterator();
            while (it.hasNext()) {
                c cVar = ((d) it.next()).f5435f;
                if (cVar != null) {
                    cVar.a();
                }
            }
            w();
            c(this.f5421n);
            this.f5421n = null;
        }
    }

    public final c g(String str) {
        synchronized (this) {
            if (this.f5421n != null) {
                d dVar = this.f5422o.get(str);
                if (dVar == null) {
                    dVar = new d(str);
                    this.f5422o.put(str, dVar);
                } else if (dVar.f5435f != null) {
                    return null;
                }
                c cVar = new c(dVar);
                dVar.f5435f = cVar;
                this.f5421n.append("DIRTY");
                this.f5421n.append(' ');
                this.f5421n.append(str);
                this.f5421n.append(10);
                h(this.f5421n);
                return cVar;
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized e j(String str) {
        if (this.f5421n != null) {
            d dVar = this.f5422o.get(str);
            if (dVar == null) {
                return null;
            }
            if (!dVar.e) {
                return null;
            }
            for (File exists : dVar.f5433c) {
                if (!exists.exists()) {
                    return null;
                }
            }
            this.f5423p++;
            this.f5421n.append("READ");
            this.f5421n.append(' ');
            this.f5421n.append(str);
            this.f5421n.append(10);
            if (n()) {
                this.r.submit(this.f5425s);
            }
            return new e(dVar.f5433c);
        }
        throw new IllegalStateException("cache is closed");
    }

    public final boolean n() {
        int i8 = this.f5423p;
        return i8 >= 2000 && i8 >= this.f5422o.size();
    }

    public final void q() {
        d(this.f5415h);
        Iterator<d> it = this.f5422o.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            c cVar = next.f5435f;
            int i8 = this.f5419l;
            int i9 = 0;
            if (cVar == null) {
                while (i9 < i8) {
                    this.f5420m += next.f5432b[i9];
                    i9++;
                }
            } else {
                next.f5435f = null;
                while (i9 < i8) {
                    d(next.f5433c[i9]);
                    d(next.f5434d[i9]);
                    i9++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:16|17|(1:19)|(1:21)(1:22)|23|24|38) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r10.f5423p = r1 - r10.f5422o.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006f, code lost:
        if (r2.f5442j == -1) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0071, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        if (r0 != false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0074, code lost:
        u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        r10.f5421n = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r4, true), m2.c.f5444a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        throw r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0062 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0062=Splitter:B:16:0x0062, B:29:0x0093=Splitter:B:29:0x0093} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s() {
        /*
            r10 = this;
            java.lang.String r0 = ", "
            java.lang.String r1 = "unexpected journal header: ["
            m2.b r2 = new m2.b
            java.io.FileInputStream r3 = new java.io.FileInputStream
            java.io.File r4 = r10.f5414g
            r3.<init>(r4)
            java.nio.charset.Charset r5 = m2.c.f5444a
            r2.<init>(r3, r5)
            java.lang.String r3 = r2.a()     // Catch:{ all -> 0x0091 }
            java.lang.String r5 = r2.a()     // Catch:{ all -> 0x0091 }
            java.lang.String r6 = r2.a()     // Catch:{ all -> 0x0091 }
            java.lang.String r7 = r2.a()     // Catch:{ all -> 0x0091 }
            java.lang.String r8 = r2.a()     // Catch:{ all -> 0x0091 }
            java.lang.String r9 = "libcore.io.DiskLruCache"
            boolean r9 = r9.equals(r3)     // Catch:{ all -> 0x0091 }
            if (r9 == 0) goto L_0x0093
            java.lang.String r9 = "1"
            boolean r9 = r9.equals(r5)     // Catch:{ all -> 0x0091 }
            if (r9 == 0) goto L_0x0093
            int r9 = r10.f5417j     // Catch:{ all -> 0x0091 }
            java.lang.String r9 = java.lang.Integer.toString(r9)     // Catch:{ all -> 0x0091 }
            boolean r6 = r9.equals(r6)     // Catch:{ all -> 0x0091 }
            if (r6 == 0) goto L_0x0093
            int r6 = r10.f5419l     // Catch:{ all -> 0x0091 }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x0091 }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x0091 }
            if (r6 == 0) goto L_0x0093
            java.lang.String r6 = ""
            boolean r6 = r6.equals(r8)     // Catch:{ all -> 0x0091 }
            if (r6 == 0) goto L_0x0093
            r0 = 0
            r1 = r0
        L_0x0058:
            java.lang.String r3 = r2.a()     // Catch:{ EOFException -> 0x0062 }
            r10.t(r3)     // Catch:{ EOFException -> 0x0062 }
            int r1 = r1 + 1
            goto L_0x0058
        L_0x0062:
            java.util.LinkedHashMap<java.lang.String, m2.a$d> r3 = r10.f5422o     // Catch:{ all -> 0x0091 }
            int r3 = r3.size()     // Catch:{ all -> 0x0091 }
            int r1 = r1 - r3
            r10.f5423p = r1     // Catch:{ all -> 0x0091 }
            int r1 = r2.f5442j     // Catch:{ all -> 0x0091 }
            r3 = -1
            r5 = 1
            if (r1 != r3) goto L_0x0072
            r0 = r5
        L_0x0072:
            if (r0 == 0) goto L_0x0078
            r10.u()     // Catch:{ all -> 0x0091 }
            goto L_0x008b
        L_0x0078:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x0091 }
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0091 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0091 }
            r3.<init>(r4, r5)     // Catch:{ all -> 0x0091 }
            java.nio.charset.Charset r4 = m2.c.f5444a     // Catch:{ all -> 0x0091 }
            r1.<init>(r3, r4)     // Catch:{ all -> 0x0091 }
            r0.<init>(r1)     // Catch:{ all -> 0x0091 }
            r10.f5421n = r0     // Catch:{ all -> 0x0091 }
        L_0x008b:
            r2.close()     // Catch:{ RuntimeException -> 0x008f, Exception -> 0x008e }
        L_0x008e:
            return
        L_0x008f:
            r10 = move-exception
            throw r10
        L_0x0091:
            r10 = move-exception
            goto L_0x00bc
        L_0x0093:
            java.io.IOException r10 = new java.io.IOException     // Catch:{ all -> 0x0091 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0091 }
            r4.<init>(r1)     // Catch:{ all -> 0x0091 }
            r4.append(r3)     // Catch:{ all -> 0x0091 }
            r4.append(r0)     // Catch:{ all -> 0x0091 }
            r4.append(r5)     // Catch:{ all -> 0x0091 }
            r4.append(r0)     // Catch:{ all -> 0x0091 }
            r4.append(r7)     // Catch:{ all -> 0x0091 }
            r4.append(r0)     // Catch:{ all -> 0x0091 }
            r4.append(r8)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "]"
            r4.append(r0)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0091 }
            r10.<init>(r0)     // Catch:{ all -> 0x0091 }
            throw r10     // Catch:{ all -> 0x0091 }
        L_0x00bc:
            r2.close()     // Catch:{ RuntimeException -> 0x00c0, Exception -> 0x00bf }
        L_0x00bf:
            throw r10
        L_0x00c0:
            r10 = move-exception
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.a.s():void");
    }

    public final void t(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i8 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i8);
            LinkedHashMap<String, d> linkedHashMap = this.f5422o;
            if (indexOf2 == -1) {
                str2 = str.substring(i8);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    linkedHashMap.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i8, indexOf2);
            }
            d dVar = linkedHashMap.get(str2);
            if (dVar == null) {
                dVar = new d(str2);
                linkedHashMap.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.e = true;
                dVar.f5435f = null;
                if (split.length == a.this.f5419l) {
                    int i9 = 0;
                    while (i9 < split.length) {
                        try {
                            dVar.f5432b[i9] = Long.parseLong(split[i9]);
                            i9++;
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(split));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f5435f = new c(dVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: ".concat(str));
            }
        } else {
            throw new IOException("unexpected journal line: ".concat(str));
        }
    }

    /* JADX INFO: finally extract failed */
    public final synchronized void u() {
        StringBuilder sb;
        BufferedWriter bufferedWriter = this.f5421n;
        if (bufferedWriter != null) {
            c(bufferedWriter);
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f5415h), c.f5444a));
        try {
            bufferedWriter2.write("libcore.io.DiskLruCache");
            bufferedWriter2.write("\n");
            bufferedWriter2.write("1");
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f5417j));
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f5419l));
            bufferedWriter2.write("\n");
            bufferedWriter2.write("\n");
            for (d next : this.f5422o.values()) {
                if (next.f5435f != null) {
                    sb = new StringBuilder();
                    sb.append("DIRTY ");
                    sb.append(next.f5431a);
                    sb.append(10);
                } else {
                    sb = new StringBuilder();
                    sb.append("CLEAN ");
                    sb.append(next.f5431a);
                    sb.append(next.a());
                    sb.append(10);
                }
                bufferedWriter2.write(sb.toString());
            }
            c(bufferedWriter2);
            if (this.f5414g.exists()) {
                v(this.f5414g, this.f5416i, true);
            }
            v(this.f5415h, this.f5414g, false);
            this.f5416i.delete();
            this.f5421n = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f5414g, true), c.f5444a));
        } catch (Throwable th) {
            c(bufferedWriter2);
            throw th;
        }
    }

    public final void w() {
        while (this.f5420m > this.f5418k) {
            String str = (String) this.f5422o.entrySet().iterator().next().getKey();
            synchronized (this) {
                if (this.f5421n != null) {
                    d dVar = this.f5422o.get(str);
                    if (dVar != null) {
                        if (dVar.f5435f == null) {
                            for (int i8 = 0; i8 < this.f5419l; i8++) {
                                File file = dVar.f5433c[i8];
                                if (file.exists()) {
                                    if (!file.delete()) {
                                        throw new IOException("failed to delete " + file);
                                    }
                                }
                                long j8 = this.f5420m;
                                long[] jArr = dVar.f5432b;
                                this.f5420m = j8 - jArr[i8];
                                jArr[i8] = 0;
                            }
                            this.f5423p++;
                            this.f5421n.append("REMOVE");
                            this.f5421n.append(' ');
                            this.f5421n.append(str);
                            this.f5421n.append(10);
                            this.f5422o.remove(str);
                            if (n()) {
                                this.r.submit(this.f5425s);
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("cache is closed");
                }
            }
        }
    }
}
