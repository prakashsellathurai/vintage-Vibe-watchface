package r3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashMap;

public final class t0 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f7037a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public int f7038b = 2;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7039c;

    /* renamed from: d  reason: collision with root package name */
    public IBinder f7040d;
    public final s0 e;

    /* renamed from: f  reason: collision with root package name */
    public ComponentName f7041f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ v0 f7042g;

    public t0(v0 v0Var, s0 s0Var) {
        this.f7042g = v0Var;
        this.e = s0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r11) {
        /*
            r10 = this;
            r11 = 3
            r10.f7038b = r11
            r3.v0 r11 = r10.f7042g
            u3.a r0 = r11.f7047f
            java.lang.String r1 = "ConnectionStatusConfig"
            r3.s0 r2 = r10.e
            java.lang.String r3 = r2.f7030a
            android.content.Context r4 = r11.f7046d
            r5 = 0
            if (r3 == 0) goto L_0x007e
            boolean r6 = r2.f7033d
            if (r6 == 0) goto L_0x006f
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r7 = "serviceActionBundleKey"
            r6.putString(r7, r3)
            android.content.ContentResolver r7 = r4.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x002d }
            android.net.Uri r8 = r3.s0.e     // Catch:{ IllegalArgumentException -> 0x002d }
            java.lang.String r9 = "serviceIntentCall"
            android.os.Bundle r6 = r7.call(r8, r9, r5, r6)     // Catch:{ IllegalArgumentException -> 0x002d }
            goto L_0x004d
        L_0x002d:
            r6 = move-exception
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r7 = r6.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r7 = r7 + 34
            r8.<init>(r7)
            java.lang.String r7 = "Dynamic intent resolution failed: "
            r8.append(r7)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            android.util.Log.w(r1, r6)
            r6 = r5
        L_0x004d:
            if (r6 != 0) goto L_0x0050
            goto L_0x0058
        L_0x0050:
            java.lang.String r5 = "serviceResponseIntentKey"
            android.os.Parcelable r5 = r6.getParcelable(r5)
            android.content.Intent r5 = (android.content.Intent) r5
        L_0x0058:
            if (r5 != 0) goto L_0x006f
            int r6 = r3.length()
            java.lang.String r7 = "Dynamic lookup for intent failed for action: "
            if (r6 == 0) goto L_0x0067
            java.lang.String r6 = r7.concat(r3)
            goto L_0x006c
        L_0x0067:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r7)
        L_0x006c:
            android.util.Log.w(r1, r6)
        L_0x006f:
            if (r5 == 0) goto L_0x0072
            goto L_0x0087
        L_0x0072:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r3)
            java.lang.String r3 = r2.f7031b
            android.content.Intent r1 = r1.setPackage(r3)
            goto L_0x0088
        L_0x007e:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            android.content.Intent r5 = r1.setComponent(r5)
        L_0x0087:
            r1 = r5
        L_0x0088:
            r0.getClass()
            android.content.ComponentName r0 = r1.getComponent()
            if (r0 != 0) goto L_0x0092
            goto L_0x00b9
        L_0x0092:
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r3 = "com.google.android.gms"
            r3.equals(r0)
            w3.a r3 = w3.b.a(r4)     // Catch:{ NameNotFoundException -> 0x00b9 }
            android.content.Context r3 = r3.f8008a     // Catch:{ NameNotFoundException -> 0x00b9 }
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00b9 }
            r5 = 0
            android.content.pm.ApplicationInfo r0 = r3.getApplicationInfo(r0, r5)     // Catch:{ NameNotFoundException -> 0x00b9 }
            int r0 = r0.flags     // Catch:{ NameNotFoundException -> 0x00b9 }
            r3 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L_0x00b9
            java.lang.String r0 = "Attempted to bind to a service in a STOPPED package."
            java.lang.String r1 = "ConnectionTracker"
            android.util.Log.w(r1, r0)
            goto L_0x00bf
        L_0x00b9:
            int r0 = r2.f7032c
            boolean r5 = r4.bindService(r1, r10, r0)
        L_0x00bf:
            r10.f7039c = r5
            if (r5 == 0) goto L_0x00d0
            android.os.Handler r10 = r11.e
            r0 = 1
            android.os.Message r0 = r10.obtainMessage(r0, r2)
            long r1 = r11.f7049h
            r10.sendMessageDelayed(r0, r1)
            return
        L_0x00d0:
            r0 = 2
            r10.f7038b = r0
            u3.a r11 = r11.f7047f     // Catch:{ IllegalArgumentException -> 0x00d8 }
            r11.a(r4, r10)     // Catch:{ IllegalArgumentException -> 0x00d8 }
        L_0x00d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.t0.a(java.lang.String):void");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f7042g.f7045c) {
            this.f7042g.e.removeMessages(1, this.e);
            this.f7040d = iBinder;
            this.f7041f = componentName;
            for (ServiceConnection onServiceConnected : this.f7037a.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f7038b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f7042g.f7045c) {
            this.f7042g.e.removeMessages(1, this.e);
            this.f7040d = null;
            this.f7041f = componentName;
            for (ServiceConnection onServiceDisconnected : this.f7037a.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f7038b = 2;
        }
    }
}
