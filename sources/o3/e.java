package o3;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.RecentlyNullable;
import java.util.concurrent.atomic.AtomicBoolean;
import r3.w0;
import v3.a;
import w3.b;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final int f6091a = 12451000;

    static {
        AtomicBoolean atomicBoolean = g.f6093a;
    }

    @RecentlyNullable
    public Intent a(Context context, int i8, String str) {
        if (i8 == 1 || i8 == 2) {
            if (context != null) {
                a.a(context);
            }
            StringBuilder sb = new StringBuilder("gcore_");
            sb.append(f6091a);
            sb.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            sb.append("-");
            if (context != null) {
                sb.append(context.getPackageName());
            }
            sb.append("-");
            if (context != null) {
                try {
                    w3.a a9 = b.a(context);
                    sb.append(a9.f8008a.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            String sb2 = sb.toString();
            int i9 = w0.f7051a;
            Intent intent = new Intent("android.intent.action.VIEW");
            Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
            if (!TextUtils.isEmpty(sb2)) {
                appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
            }
            intent.setData(appendQueryParameter.build());
            intent.setPackage("com.android.vending");
            intent.addFlags(524288);
            return intent;
        } else if (i8 != 3) {
            return null;
        } else {
            int i10 = w0.f7051a;
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", (String) null);
            Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent2.setData(fromParts);
            return intent2;
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0208 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0209 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int b(@androidx.annotation.RecentlyNonNull android.content.Context r11, int r12) {
        /*
            r10 = this;
            java.util.concurrent.atomic.AtomicBoolean r10 = o3.g.f6093a
            android.content.res.Resources r10 = r11.getResources()     // Catch:{ all -> 0x000d }
            r0 = -2146369477(0xffffffff8011003b, float:-1.561286E-39)
            r10.getString(r0)     // Catch:{ all -> 0x000d }
            goto L_0x0014
        L_0x000d:
            java.lang.String r10 = "GooglePlayServicesUtil"
            java.lang.String r0 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
            android.util.Log.e(r10, r0)
        L_0x0014:
            java.lang.String r10 = "com.google.android.gms"
            java.lang.String r0 = r11.getPackageName()
            boolean r10 = r10.equals(r0)
            r0 = 1
            if (r10 != 0) goto L_0x007e
            java.util.concurrent.atomic.AtomicBoolean r10 = o3.g.f6094b
            boolean r10 = r10.get()
            if (r10 == 0) goto L_0x002a
            goto L_0x007e
        L_0x002a:
            java.lang.Object r10 = r3.g0.f6987a
            monitor-enter(r10)
            boolean r1 = r3.g0.f6988b     // Catch:{ all -> 0x005b }
            if (r1 == 0) goto L_0x0032
            goto L_0x0065
        L_0x0032:
            r3.g0.f6988b = r0     // Catch:{ all -> 0x005b }
            java.lang.String r1 = r11.getPackageName()     // Catch:{ all -> 0x005b }
            w3.a r2 = w3.b.a(r11)     // Catch:{ all -> 0x005b }
            android.content.Context r2 = r2.f8008a     // Catch:{ NameNotFoundException -> 0x005d }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x005d }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r1, r3)     // Catch:{ NameNotFoundException -> 0x005d }
            android.os.Bundle r1 = r1.metaData     // Catch:{ NameNotFoundException -> 0x005d }
            if (r1 != 0) goto L_0x004d
            goto L_0x0065
        L_0x004d:
            java.lang.String r2 = "com.google.app.id"
            r1.getString(r2)     // Catch:{ NameNotFoundException -> 0x005d }
            java.lang.String r2 = "com.google.android.gms.version"
            int r1 = r1.getInt(r2)     // Catch:{ NameNotFoundException -> 0x005d }
            r3.g0.f6989c = r1     // Catch:{ NameNotFoundException -> 0x005d }
            goto L_0x0065
        L_0x005b:
            r11 = move-exception
            goto L_0x007c
        L_0x005d:
            r1 = move-exception
            java.lang.String r2 = "MetadataValueReader"
            java.lang.String r3 = "This should never happen."
            android.util.Log.wtf(r2, r3, r1)     // Catch:{ all -> 0x005b }
        L_0x0065:
            monitor-exit(r10)     // Catch:{ all -> 0x005b }
            int r10 = r3.g0.f6989c
            if (r10 == 0) goto L_0x0076
            r1 = 12451000(0xbdfcb8, float:1.7447567E-38)
            if (r10 != r1) goto L_0x0070
            goto L_0x007e
        L_0x0070:
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r11 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            r11.<init>(r10)
            throw r11
        L_0x0076:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r10 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r10.<init>()
            throw r10
        L_0x007c:
            monitor-exit(r10)     // Catch:{ all -> 0x005b }
            throw r11
        L_0x007e:
            v3.a.a(r11)
            java.lang.Boolean r10 = v3.a.f7927c
            r1 = 0
            if (r10 != 0) goto L_0x00a8
            android.content.pm.PackageManager r10 = r11.getPackageManager()
            java.lang.String r2 = "android.hardware.type.iot"
            boolean r10 = r10.hasSystemFeature(r2)
            if (r10 != 0) goto L_0x00a1
            android.content.pm.PackageManager r10 = r11.getPackageManager()
            java.lang.String r2 = "android.hardware.type.embedded"
            boolean r10 = r10.hasSystemFeature(r2)
            if (r10 == 0) goto L_0x009f
            goto L_0x00a1
        L_0x009f:
            r10 = r1
            goto L_0x00a2
        L_0x00a1:
            r10 = r0
        L_0x00a2:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            v3.a.f7927c = r10
        L_0x00a8:
            java.lang.Boolean r10 = v3.a.f7927c
            boolean r10 = r10.booleanValue()
            r10 = r10 ^ r0
            if (r12 < 0) goto L_0x00b3
            r2 = r0
            goto L_0x00b4
        L_0x00b3:
            r2 = r1
        L_0x00b4:
            if (r2 == 0) goto L_0x020a
            java.lang.String r2 = r11.getPackageName()
            android.content.pm.PackageManager r3 = r11.getPackageManager()
            if (r10 == 0) goto L_0x00d3
            java.lang.String r4 = "com.android.vending"
            r5 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r4 = r3.getPackageInfo(r4, r5)     // Catch:{ NameNotFoundException -> 0x00c9 }
            goto L_0x00d4
        L_0x00c9:
            java.lang.String r10 = "GooglePlayServicesUtil"
            java.lang.String r12 = java.lang.String.valueOf(r2)
            java.lang.String r2 = " requires the Google Play Store, but it is missing."
            goto L_0x0144
        L_0x00d3:
            r4 = 0
        L_0x00d4:
            java.lang.String r5 = "com.google.android.gms"
            r6 = 64
            android.content.pm.PackageInfo r5 = r3.getPackageInfo(r5, r6)     // Catch:{ NameNotFoundException -> 0x01b8 }
            java.lang.Class<o3.h> r6 = o3.h.class
            monitor-enter(r6)
            o3.h r7 = o3.h.f6095a     // Catch:{ all -> 0x01b5 }
            if (r7 != 0) goto L_0x0106
            o3.m r7 = o3.r.f6106a     // Catch:{ all -> 0x01b5 }
            java.lang.Class<o3.r> r7 = o3.r.class
            monitor-enter(r7)     // Catch:{ all -> 0x01b5 }
            android.content.Context r8 = o3.r.f6108c     // Catch:{ all -> 0x0103 }
            if (r8 != 0) goto L_0x00f3
            android.content.Context r8 = r11.getApplicationContext()     // Catch:{ all -> 0x0103 }
            o3.r.f6108c = r8     // Catch:{ all -> 0x0103 }
            goto L_0x00fa
        L_0x00f3:
            java.lang.String r8 = "GoogleCertificates"
            java.lang.String r9 = "GoogleCertificates has been initialized already"
            android.util.Log.w(r8, r9)     // Catch:{ all -> 0x0103 }
        L_0x00fa:
            monitor-exit(r7)     // Catch:{ all -> 0x01b5 }
            o3.h r7 = new o3.h     // Catch:{ all -> 0x01b5 }
            r7.<init>(r11)     // Catch:{ all -> 0x01b5 }
            o3.h.f6095a = r7     // Catch:{ all -> 0x01b5 }
            goto L_0x0106
        L_0x0103:
            r10 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x01b5 }
            throw r10     // Catch:{ all -> 0x01b5 }
        L_0x0106:
            monitor-exit(r6)     // Catch:{ all -> 0x01b5 }
            boolean r6 = o3.h.b(r5)
            if (r6 != 0) goto L_0x0116
            java.lang.String r10 = "GooglePlayServicesUtil"
            java.lang.String r12 = java.lang.String.valueOf(r2)
            java.lang.String r2 = " requires Google Play services, but their signature is invalid."
            goto L_0x0144
        L_0x0116:
            if (r10 == 0) goto L_0x012a
            r3.b.b(r4)
            boolean r6 = o3.h.b(r4)
            if (r6 != 0) goto L_0x012a
            java.lang.String r10 = "GooglePlayServicesUtil"
            java.lang.String r12 = java.lang.String.valueOf(r2)
            java.lang.String r2 = " requires Google Play Store, but its signature is invalid."
            goto L_0x0144
        L_0x012a:
            if (r10 == 0) goto L_0x014f
            if (r4 == 0) goto L_0x014f
            android.content.pm.Signature[] r10 = r4.signatures
            r10 = r10[r1]
            android.content.pm.Signature[] r4 = r5.signatures
            r4 = r4[r1]
            boolean r10 = r10.equals(r4)
            if (r10 != 0) goto L_0x014f
            java.lang.String r10 = "GooglePlayServicesUtil"
            java.lang.String r12 = java.lang.String.valueOf(r2)
            java.lang.String r2 = " requires Google Play Store, but its signature doesn't match that of Google Play services."
        L_0x0144:
            java.lang.String r12 = r12.concat(r2)
            android.util.Log.w(r10, r12)
            r10 = 9
            goto L_0x01c8
        L_0x014f:
            int r10 = r5.versionCode
            r4 = -1
            if (r10 != r4) goto L_0x0156
            r6 = r4
            goto L_0x0158
        L_0x0156:
            int r6 = r10 / 1000
        L_0x0158:
            if (r12 != r4) goto L_0x015b
            goto L_0x015d
        L_0x015b:
            int r4 = r12 / 1000
        L_0x015d:
            if (r6 >= r4) goto L_0x0191
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 82
            r4.<init>(r3)
            java.lang.String r3 = "Google Play services out of date for "
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = ".  Requires "
            r4.append(r2)
            r4.append(r12)
            java.lang.String r12 = " but found "
            r4.append(r12)
            r4.append(r10)
            java.lang.String r10 = "GooglePlayServicesUtil"
            java.lang.String r12 = r4.toString()
            android.util.Log.w(r10, r12)
            r10 = 2
            goto L_0x01c8
        L_0x0191:
            android.content.pm.ApplicationInfo r10 = r5.applicationInfo
            if (r10 != 0) goto L_0x01ad
            java.lang.String r10 = "com.google.android.gms"
            android.content.pm.ApplicationInfo r10 = r3.getApplicationInfo(r10, r1)     // Catch:{ NameNotFoundException -> 0x019c }
            goto L_0x01ad
        L_0x019c:
            r10 = move-exception
            java.lang.String r12 = "GooglePlayServicesUtil"
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r2 = r2.concat(r3)
            android.util.Log.wtf(r12, r2, r10)
            goto L_0x01c7
        L_0x01ad:
            boolean r10 = r10.enabled
            if (r10 != 0) goto L_0x01b3
            r10 = 3
            goto L_0x01c8
        L_0x01b3:
            r10 = r1
            goto L_0x01c8
        L_0x01b5:
            r10 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x01b5 }
            throw r10
        L_0x01b8:
            java.lang.String r10 = "GooglePlayServicesUtil"
            java.lang.String r12 = java.lang.String.valueOf(r2)
            java.lang.String r2 = " requires Google Play services, but they are missing."
            java.lang.String r12 = r12.concat(r2)
            android.util.Log.w(r10, r12)
        L_0x01c7:
            r10 = r0
        L_0x01c8:
            r12 = 18
            if (r10 != r12) goto L_0x01cd
            goto L_0x0206
        L_0x01cd:
            if (r10 != r0) goto L_0x0205
            android.content.pm.PackageManager r2 = r11.getPackageManager()     // Catch:{ Exception -> 0x0205 }
            android.content.pm.PackageInstaller r2 = r2.getPackageInstaller()     // Catch:{ Exception -> 0x0205 }
            java.util.List r2 = r2.getAllSessions()     // Catch:{ Exception -> 0x0205 }
            java.util.Iterator r2 = r2.iterator()
        L_0x01df:
            boolean r3 = r2.hasNext()
            java.lang.String r4 = "com.google.android.gms"
            if (r3 == 0) goto L_0x01f8
            java.lang.Object r3 = r2.next()
            android.content.pm.PackageInstaller$SessionInfo r3 = (android.content.pm.PackageInstaller.SessionInfo) r3
            java.lang.String r3 = r3.getAppPackageName()
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x01df
            goto L_0x0206
        L_0x01f8:
            android.content.pm.PackageManager r11 = r11.getPackageManager()
            r0 = 8192(0x2000, float:1.14794E-41)
            android.content.pm.ApplicationInfo r11 = r11.getApplicationInfo(r4, r0)     // Catch:{  }
            boolean r0 = r11.enabled     // Catch:{  }
            goto L_0x0206
        L_0x0205:
            r0 = r1
        L_0x0206:
            if (r0 == 0) goto L_0x0209
            return r12
        L_0x0209:
            return r10
        L_0x020a:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.e.b(android.content.Context, int):int");
    }
}
