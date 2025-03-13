package androidx.profileinstaller;

import android.content.pm.PackageInfo;
import android.util.Log;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f1542a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final b f1543b = new b();

    public class a implements C0013c {
        public final void a() {
        }

        public final void b(int i8, Object obj) {
        }
    }

    public class b implements C0013c {
        public final void a() {
        }

        public final void b(int i8, Object obj) {
            String str;
            switch (i8) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
                default:
                    str = "";
                    break;
            }
            if (i8 == 6 || i8 == 7 || i8 == 8) {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            }
        }
    }

    /* renamed from: androidx.profileinstaller.c$c  reason: collision with other inner class name */
    public interface C0013c {
        void a();

        void b(int i8, Object obj);
    }

    public static void a(PackageInfo packageInfo, File file) {
        DataOutputStream dataOutputStream;
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
            return;
        } catch (IOException unused) {
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.io.FileNotFoundException} */
    /* JADX WARNING: type inference failed for: r2v13, types: [z0.b[], byte[]] */
    /* JADX WARNING: type inference failed for: r1v1, types: [z0.b[], byte[]] */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0222, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x022d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:?, code lost:
        r5.addSuppressed(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:186:0x0216, B:196:0x0229] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x01a4 A[SYNTHETIC, Splitter:B:136:0x01a4] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x025e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e3 A[SYNTHETIC, Splitter:B:58:0x00e3] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0135  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(android.content.Context r17, java.util.concurrent.Executor r18, androidx.profileinstaller.c.C0013c r19, boolean r20) {
        /*
            r1 = r17
            r8 = r19
            android.content.Context r0 = r17.getApplicationContext()
            java.lang.String r2 = r0.getPackageName()
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo()
            android.content.res.AssetManager r9 = r0.getAssets()
            java.io.File r0 = new java.io.File
            java.lang.String r3 = r3.sourceDir
            r0.<init>(r3)
            java.lang.String r6 = r0.getName()
            android.content.pm.PackageManager r0 = r17.getPackageManager()
            r11 = 0
            android.content.pm.PackageInfo r12 = r0.getPackageInfo(r2, r11)     // Catch:{ NameNotFoundException -> 0x0279 }
            java.io.File r13 = r17.getFilesDir()
            r14 = 1
            r15 = 0
            if (r20 != 0) goto L_0x0079
            java.io.File r0 = new java.io.File
            java.lang.String r3 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r13, r3)
            boolean r3 = r0.exists()
            if (r3 != 0) goto L_0x003f
            r0 = r11
            goto L_0x006d
        L_0x003f:
            java.io.DataInputStream r3 = new java.io.DataInputStream     // Catch:{ IOException -> 0x006c }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x006c }
            r4.<init>(r0)     // Catch:{ IOException -> 0x006c }
            r3.<init>(r4)     // Catch:{ IOException -> 0x006c }
            long r4 = r3.readLong()     // Catch:{ all -> 0x0060 }
            r3.close()     // Catch:{ IOException -> 0x006c }
            long r10 = r12.lastUpdateTime
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0058
            r0 = r14
            goto L_0x0059
        L_0x0058:
            r0 = 0
        L_0x0059:
            if (r0 == 0) goto L_0x006d
            r3 = 2
            r8.b(r3, r15)
            goto L_0x006d
        L_0x0060:
            r0 = move-exception
            r4 = r0
            r3.close()     // Catch:{ all -> 0x0066 }
            goto L_0x006b
        L_0x0066:
            r0 = move-exception
            r3 = r0
            r4.addSuppressed(r3)     // Catch:{ IOException -> 0x006c }
        L_0x006b:
            throw r4     // Catch:{ IOException -> 0x006c }
        L_0x006c:
            r0 = 0
        L_0x006d:
            if (r0 != 0) goto L_0x0070
            goto L_0x0079
        L_0x0070:
            r17.getPackageName()
            r2 = 0
            androidx.profileinstaller.d.b(r1, r2)
            goto L_0x0266
        L_0x0079:
            r17.getPackageName()
            int r0 = android.os.Build.VERSION.SDK_INT
            java.io.File r10 = new java.io.File
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "/data/misc/profiles/cur/0"
            r3.<init>(r4, r2)
            java.lang.String r2 = "primary.prof"
            r10.<init>(r3, r2)
            androidx.profileinstaller.b r11 = new androidx.profileinstaller.b
            java.lang.String r7 = "dexopt/baseline.prof"
            r2 = r11
            r3 = r9
            r4 = r18
            r5 = r19
            r16 = r7
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r2 = 4
            byte[] r3 = r11.f1537c
            if (r3 != 0) goto L_0x00aa
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4 = 3
            r11.b(r4, r0)
            goto L_0x00b3
        L_0x00aa:
            boolean r0 = r10.canWrite()
            if (r0 != 0) goto L_0x00b5
            r11.b(r2, r15)
        L_0x00b3:
            r0 = 0
            goto L_0x00b8
        L_0x00b5:
            r11.f1539f = r14
            r0 = r14
        L_0x00b8:
            if (r0 != 0) goto L_0x00be
            r4 = r14
            r2 = 0
            goto L_0x025c
        L_0x00be:
            boolean r0 = r11.f1539f
            java.lang.String r4 = "This device doesn't support aot. Did you call deviceSupportsAotProfile()?"
            if (r0 == 0) goto L_0x0273
            byte[] r5 = z0.e.f8674a
            r6 = 8
            if (r3 != 0) goto L_0x00cc
            goto L_0x0195
        L_0x00cc:
            r0 = r16
            java.io.FileInputStream r0 = r11.a(r9, r0)     // Catch:{ FileNotFoundException -> 0x00d8, IOException -> 0x00d4 }
            r10 = r0
            goto L_0x00df
        L_0x00d4:
            r0 = move-exception
            r10 = r0
            r0 = 7
            goto L_0x00db
        L_0x00d8:
            r0 = move-exception
            r10 = r0
            r0 = 6
        L_0x00db:
            r8.b(r0, r10)
            r10 = r15
        L_0x00df:
            java.lang.String r7 = "Invalid magic"
            if (r10 == 0) goto L_0x0131
            byte[] r0 = k3.j.S(r2, r10)     // Catch:{ IOException -> 0x0106, IllegalStateException -> 0x0102 }
            boolean r0 = java.util.Arrays.equals(r5, r0)     // Catch:{ IOException -> 0x0106, IllegalStateException -> 0x0102 }
            if (r0 == 0) goto L_0x0108
            byte[] r0 = k3.j.S(r2, r10)     // Catch:{ IOException -> 0x0106, IllegalStateException -> 0x0102 }
            java.lang.String r14 = r11.e     // Catch:{ IOException -> 0x0106, IllegalStateException -> 0x0102 }
            z0.b[] r14 = z0.e.h(r10, r0, r14)     // Catch:{ IOException -> 0x0106, IllegalStateException -> 0x0102 }
            r10.close()     // Catch:{ IOException -> 0x00fb }
            goto L_0x0123
        L_0x00fb:
            r0 = move-exception
            r10 = r0
            r15 = 7
            r8.b(r15, r10)
            goto L_0x0123
        L_0x0102:
            r0 = move-exception
            goto L_0x0110
        L_0x0104:
            r0 = move-exception
            goto L_0x010e
        L_0x0106:
            r0 = move-exception
            goto L_0x0115
        L_0x0108:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0106, IllegalStateException -> 0x0102 }
            r0.<init>(r7)     // Catch:{ IOException -> 0x0106, IllegalStateException -> 0x0102 }
            throw r0     // Catch:{ IOException -> 0x0106, IllegalStateException -> 0x0102 }
        L_0x010e:
            r1 = r0
            goto L_0x0126
        L_0x0110:
            r8.b(r6, r0)     // Catch:{ all -> 0x0104 }
            r14 = 7
            goto L_0x0119
        L_0x0115:
            r14 = 7
            r8.b(r14, r0)     // Catch:{ all -> 0x0104 }
        L_0x0119:
            r10.close()     // Catch:{ IOException -> 0x011d }
            goto L_0x0122
        L_0x011d:
            r0 = move-exception
            r10 = r0
            r8.b(r14, r10)
        L_0x0122:
            r14 = 0
        L_0x0123:
            r11.f1540g = r14
            goto L_0x0131
        L_0x0126:
            r10.close()     // Catch:{ IOException -> 0x012a }
            goto L_0x0130
        L_0x012a:
            r0 = move-exception
            r2 = r0
            r3 = 7
            r8.b(r3, r2)
        L_0x0130:
            throw r1
        L_0x0131:
            z0.b[] r0 = r11.f1540g
            if (r0 == 0) goto L_0x0195
            int r10 = android.os.Build.VERSION.SDK_INT
            r14 = 33
            if (r10 <= r14) goto L_0x013c
            goto L_0x0142
        L_0x013c:
            switch(r10) {
                case 31: goto L_0x0140;
                case 32: goto L_0x0140;
                case 33: goto L_0x0140;
                default: goto L_0x013f;
            }
        L_0x013f:
            goto L_0x0142
        L_0x0140:
            r10 = 1
            goto L_0x0143
        L_0x0142:
            r10 = 0
        L_0x0143:
            if (r10 == 0) goto L_0x0195
            java.lang.String r10 = "dexopt/baseline.profm"
            java.io.FileInputStream r9 = r11.a(r9, r10)     // Catch:{ FileNotFoundException -> 0x018b, IOException -> 0x0188, IllegalStateException -> 0x0180 }
            if (r9 == 0) goto L_0x017a
            byte[] r10 = z0.e.f8675b     // Catch:{ all -> 0x016e }
            byte[] r14 = k3.j.S(r2, r9)     // Catch:{ all -> 0x016e }
            boolean r10 = java.util.Arrays.equals(r10, r14)     // Catch:{ all -> 0x016e }
            if (r10 == 0) goto L_0x0168
            byte[] r2 = k3.j.S(r2, r9)     // Catch:{ all -> 0x016e }
            z0.b[] r0 = z0.e.e(r9, r2, r3, r0)     // Catch:{ all -> 0x016e }
            r11.f1540g = r0     // Catch:{ all -> 0x016e }
            r9.close()     // Catch:{ FileNotFoundException -> 0x018b, IOException -> 0x0188, IllegalStateException -> 0x0180 }
            r0 = r11
            goto L_0x0192
        L_0x0168:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x016e }
            r0.<init>(r7)     // Catch:{ all -> 0x016e }
            throw r0     // Catch:{ all -> 0x016e }
        L_0x016e:
            r0 = move-exception
            r2 = r0
            r9.close()     // Catch:{ all -> 0x0174 }
            goto L_0x0179
        L_0x0174:
            r0 = move-exception
            r3 = r0
            r2.addSuppressed(r3)     // Catch:{ FileNotFoundException -> 0x018b, IOException -> 0x0188, IllegalStateException -> 0x0180 }
        L_0x0179:
            throw r2     // Catch:{ FileNotFoundException -> 0x018b, IOException -> 0x0188, IllegalStateException -> 0x0180 }
        L_0x017a:
            if (r9 == 0) goto L_0x0191
            r9.close()     // Catch:{ FileNotFoundException -> 0x018b, IOException -> 0x0188, IllegalStateException -> 0x0180 }
            goto L_0x0191
        L_0x0180:
            r0 = move-exception
            r2 = 0
            r11.f1540g = r2
            r8.b(r6, r0)
            goto L_0x0191
        L_0x0188:
            r0 = move-exception
            r2 = 7
            goto L_0x018e
        L_0x018b:
            r0 = move-exception
            r2 = 9
        L_0x018e:
            r8.b(r2, r0)
        L_0x0191:
            r0 = 0
        L_0x0192:
            if (r0 == 0) goto L_0x0195
            r11 = r0
        L_0x0195:
            androidx.profileinstaller.c$c r2 = r11.f1536b
            z0.b[] r0 = r11.f1540g
            if (r0 == 0) goto L_0x01e7
            byte[] r3 = r11.f1537c
            if (r3 != 0) goto L_0x01a0
            goto L_0x01e7
        L_0x01a0:
            boolean r7 = r11.f1539f
            if (r7 == 0) goto L_0x01e1
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x01d8, IllegalStateException -> 0x01d6 }
            r7.<init>()     // Catch:{ IOException -> 0x01d8, IllegalStateException -> 0x01d6 }
            r7.write(r5)     // Catch:{ all -> 0x01ca }
            r7.write(r3)     // Catch:{ all -> 0x01ca }
            boolean r0 = z0.e.j(r7, r3, r0)     // Catch:{ all -> 0x01ca }
            if (r0 != 0) goto L_0x01c0
            r0 = 5
            r3 = 0
            r2.b(r0, r3)     // Catch:{ all -> 0x01ca }
            r11.f1540g = r3     // Catch:{ all -> 0x01ca }
            r7.close()     // Catch:{ IOException -> 0x01d8, IllegalStateException -> 0x01d6 }
            goto L_0x01e7
        L_0x01c0:
            byte[] r0 = r7.toByteArray()     // Catch:{ all -> 0x01ca }
            r11.f1541h = r0     // Catch:{ all -> 0x01ca }
            r7.close()     // Catch:{ IOException -> 0x01d8, IllegalStateException -> 0x01d6 }
            goto L_0x01dd
        L_0x01ca:
            r0 = move-exception
            r3 = r0
            r7.close()     // Catch:{ all -> 0x01d0 }
            goto L_0x01d5
        L_0x01d0:
            r0 = move-exception
            r5 = r0
            r3.addSuppressed(r5)     // Catch:{ IOException -> 0x01d8, IllegalStateException -> 0x01d6 }
        L_0x01d5:
            throw r3     // Catch:{ IOException -> 0x01d8, IllegalStateException -> 0x01d6 }
        L_0x01d6:
            r0 = move-exception
            goto L_0x01da
        L_0x01d8:
            r0 = move-exception
            r6 = 7
        L_0x01da:
            r2.b(r6, r0)
        L_0x01dd:
            r2 = 0
            r11.f1540g = r2
            goto L_0x01e7
        L_0x01e1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x01e7:
            byte[] r0 = r11.f1541h
            if (r0 != 0) goto L_0x01ee
            r4 = 1
            goto L_0x0256
        L_0x01ee:
            boolean r2 = r11.f1539f
            if (r2 == 0) goto L_0x026d
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ FileNotFoundException -> 0x024d, IOException -> 0x0246 }
            r2.<init>(r0)     // Catch:{ FileNotFoundException -> 0x024d, IOException -> 0x0246 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0233 }
            java.io.File r0 = r11.f1538d     // Catch:{ all -> 0x0233 }
            r3.<init>(r0)     // Catch:{ all -> 0x0233 }
            r0 = 512(0x200, float:7.175E-43)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0226 }
        L_0x0202:
            int r4 = r2.read(r0)     // Catch:{ all -> 0x0226 }
            if (r4 <= 0) goto L_0x0211
            r5 = 0
            r3.write(r0, r5, r4)     // Catch:{ all -> 0x020d }
            goto L_0x0202
        L_0x020d:
            r0 = move-exception
            r5 = r0
            r4 = 1
            goto L_0x0229
        L_0x0211:
            r4 = 1
            r5 = 0
            r11.b(r4, r5)     // Catch:{ all -> 0x0224 }
            r3.close()     // Catch:{ all -> 0x0222 }
            r2.close()     // Catch:{ FileNotFoundException -> 0x0242, IOException -> 0x0240 }
            r11.f1541h = r5
            r11.f1540g = r5
            r2 = r4
            goto L_0x0257
        L_0x0222:
            r0 = move-exception
            goto L_0x0235
        L_0x0224:
            r0 = move-exception
            goto L_0x0228
        L_0x0226:
            r0 = move-exception
            r4 = 1
        L_0x0228:
            r5 = r0
        L_0x0229:
            r3.close()     // Catch:{ all -> 0x022d }
            goto L_0x0232
        L_0x022d:
            r0 = move-exception
            r3 = r0
            r5.addSuppressed(r3)     // Catch:{ all -> 0x0222 }
        L_0x0232:
            throw r5     // Catch:{ all -> 0x0222 }
        L_0x0233:
            r0 = move-exception
            r4 = 1
        L_0x0235:
            r3 = r0
            r2.close()     // Catch:{ all -> 0x023a }
            goto L_0x023f
        L_0x023a:
            r0 = move-exception
            r2 = r0
            r3.addSuppressed(r2)     // Catch:{ FileNotFoundException -> 0x0242, IOException -> 0x0240 }
        L_0x023f:
            throw r3     // Catch:{ FileNotFoundException -> 0x0242, IOException -> 0x0240 }
        L_0x0240:
            r0 = move-exception
            goto L_0x0248
        L_0x0242:
            r0 = move-exception
            goto L_0x024f
        L_0x0244:
            r0 = move-exception
            goto L_0x0267
        L_0x0246:
            r0 = move-exception
            r4 = 1
        L_0x0248:
            r2 = 7
        L_0x0249:
            r11.b(r2, r0)     // Catch:{ all -> 0x0244 }
            goto L_0x0251
        L_0x024d:
            r0 = move-exception
            r4 = 1
        L_0x024f:
            r2 = 6
            goto L_0x0249
        L_0x0251:
            r2 = 0
            r11.f1541h = r2
            r11.f1540g = r2
        L_0x0256:
            r2 = 0
        L_0x0257:
            if (r2 == 0) goto L_0x025c
            a(r12, r13)
        L_0x025c:
            if (r2 == 0) goto L_0x0262
            if (r20 == 0) goto L_0x0262
            r11 = r4
            goto L_0x0263
        L_0x0262:
            r11 = 0
        L_0x0263:
            androidx.profileinstaller.d.b(r1, r11)
        L_0x0266:
            return
        L_0x0267:
            r1 = 0
            r11.f1541h = r1
            r11.f1540g = r1
            throw r0
        L_0x026d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x0273:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x0279:
            r0 = move-exception
            r2 = r0
            r3 = 7
            r8.b(r3, r2)
            r2 = 0
            androidx.profileinstaller.d.b(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.c.b(android.content.Context, java.util.concurrent.Executor, androidx.profileinstaller.c$c, boolean):void");
    }
}
