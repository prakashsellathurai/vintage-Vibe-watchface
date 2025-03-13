package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final q.b<c> f1544a = new q.b<>();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f1545b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static c f1546c = null;

    public static class a {
        public static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0));
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f1547a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1548b;

        /* renamed from: c  reason: collision with root package name */
        public final long f1549c;

        /* renamed from: d  reason: collision with root package name */
        public final long f1550d;

        public b(int i8, int i9, long j8, long j9) {
            this.f1547a = i8;
            this.f1548b = i9;
            this.f1549c = j8;
            this.f1550d = j9;
        }

        public static b a(File file) {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        }

        public final void b(File file) {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f1547a);
                dataOutputStream.writeInt(this.f1548b);
                dataOutputStream.writeLong(this.f1549c);
                dataOutputStream.writeLong(this.f1550d);
                dataOutputStream.close();
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f1548b == bVar.f1548b && this.f1549c == bVar.f1549c && this.f1547a == bVar.f1547a && this.f1550d == bVar.f1550d;
        }

        public final int hashCode() {
            return Objects.hash(new Object[]{Integer.valueOf(this.f1548b), Long.valueOf(this.f1549c), Integer.valueOf(this.f1547a), Long.valueOf(this.f1550d)});
        }
    }

    public static class c {
    }

    public static c a(int i8, boolean z8, boolean z9) {
        c cVar = new c();
        f1546c = cVar;
        f1544a.h(cVar);
        return f1546c;
    }

    public static void b(Context context, boolean z8) {
        PackageInfo packageInfo;
        b bVar;
        b bVar2;
        if (z8 || f1546c == null) {
            synchronized (f1545b) {
                if (!z8) {
                    if (f1546c != null) {
                        return;
                    }
                }
                int i8 = Build.VERSION.SDK_INT;
                int i9 = 0;
                if (i8 == 30) {
                    a(262144, false, false);
                    return;
                }
                File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length = file.length();
                boolean z9 = file.exists() && length > 0;
                File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                long length2 = file2.length();
                boolean z10 = file2.exists() && length2 > 0;
                try {
                    PackageManager packageManager = context.getApplicationContext().getPackageManager();
                    if (i8 >= 33) {
                        packageInfo = a.a(packageManager, context);
                    } else {
                        Context context2 = context;
                        packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
                    }
                    long j8 = packageInfo.lastUpdateTime;
                    File file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            bVar = b.a(file3);
                        } catch (IOException unused) {
                            a(131072, z9, z10);
                            return;
                        }
                    } else {
                        bVar = null;
                    }
                    if (bVar != null && bVar.f1549c == j8) {
                        int i10 = bVar.f1548b;
                        if (i10 != 2) {
                            i9 = i10;
                            if (z8 && z10 && i9 != 1) {
                                i9 = 2;
                            }
                            if (bVar != null && bVar.f1548b == 2 && i9 == 1 && length < bVar.f1550d) {
                                i9 = 3;
                            }
                            bVar2 = new b(1, i9, j8, length2);
                            if (bVar == null || !bVar.equals(bVar2)) {
                                bVar2.b(file3);
                            }
                            a(i9, z9, z10);
                        }
                    }
                    if (z9) {
                        i9 = 1;
                    } else if (z10) {
                        i9 = 2;
                    }
                    i9 = 2;
                    i9 = 3;
                    bVar2 = new b(1, i9, j8, length2);
                    try {
                        bVar2.b(file3);
                    } catch (IOException unused2) {
                        i9 = 196608;
                    }
                    a(i9, z9, z10);
                } catch (PackageManager.NameNotFoundException unused3) {
                    a(65536, z9, z10);
                }
            }
        }
    }
}
