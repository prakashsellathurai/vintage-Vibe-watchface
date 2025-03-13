package o3;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.util.TypedValue;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.fragment.app.a;
import androidx.fragment.app.c0;
import androidx.health.services.client.R;
import r3.s;
import r3.t;

public final class d extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f6089b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final d f6090c = new d();

    @RecentlyNullable
    public final Intent a(Context context, int i8, String str) {
        return super.a(context, i8, str);
    }

    public final int b(@RecentlyNonNull Context context, int i8) {
        return super.b(context, i8);
    }

    public final int c(@RecentlyNonNull Context context) {
        return super.b(context, e.f6091a);
    }

    public final void d(@RecentlyNonNull Activity activity, int i8, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialog;
        t tVar = new t(activity, super.a(activity, i8, "d"));
        if (i8 == 0) {
            alertDialog = null;
        } else {
            TypedValue typedValue = new TypedValue();
            activity.getTheme().resolveAttribute(16843529, typedValue, true);
            AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
            if (builder == null) {
                builder = new AlertDialog.Builder(activity);
            }
            builder.setMessage(s.b(activity, i8));
            if (onCancelListener != null) {
                builder.setOnCancelListener(onCancelListener);
            }
            String string = activity.getResources().getString(i8 != 1 ? i8 != 2 ? i8 != 3 ? 17039370 : R.string.common_google_play_services_enable_button : R.string.common_google_play_services_update_button : R.string.common_google_play_services_install_button);
            if (string != null) {
                builder.setPositiveButton(string, tVar);
            }
            String a9 = s.a(activity, i8);
            if (a9 != null) {
                builder.setTitle(a9);
            }
            Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[]{Integer.valueOf(i8)}), new IllegalArgumentException());
            alertDialog = builder.create();
        }
        if (alertDialog != null) {
            try {
                if (activity instanceof androidx.fragment.app.s) {
                    c0 h8 = ((androidx.fragment.app.s) activity).h();
                    i iVar = new i();
                    alertDialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
                    alertDialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                    iVar.f6096p0 = alertDialog;
                    if (onCancelListener != null) {
                        iVar.f6097q0 = onCancelListener;
                    }
                    iVar.f1236m0 = false;
                    iVar.f1237n0 = true;
                    h8.getClass();
                    a aVar = new a(h8);
                    aVar.f(0, iVar, "GooglePlayServicesErrorDialog", 1);
                    aVar.d(false);
                    return;
                }
            } catch (NoClassDefFoundError unused) {
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            b bVar = new b();
            alertDialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
            alertDialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            bVar.f6083a = alertDialog;
            if (onCancelListener != null) {
                bVar.f6084b = onCancelListener;
            }
            bVar.show(fragmentManager, "GooglePlayServicesErrorDialog");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x037e  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0382  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x025c A[LOOP:1: B:67:0x0256->B:69:0x025c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x032e A[LOOP:3: B:84:0x0328->B:86:0x032e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x034c  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0363  */
    @android.annotation.TargetApi(20)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(android.content.Context r13, int r14, android.app.PendingIntent r15) {
        /*
            r12 = this;
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r4 = 0
            r1[r2] = r4
            java.lang.String r5 = "GMS core API Availability. ConnectionResult=%s, tag=%s"
            java.lang.String r1 = java.lang.String.format(r5, r1)
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            java.lang.String r6 = "GoogleApiAvailability"
            android.util.Log.w(r6, r1, r5)
            r1 = 18
            if (r14 != r1) goto L_0x002e
            o3.j r14 = new o3.j
            r14.<init>(r12, r13)
            r12 = 120000(0x1d4c0, double:5.9288E-319)
            r14.sendEmptyMessageDelayed(r2, r12)
            return
        L_0x002e:
            r12 = 6
            if (r15 != 0) goto L_0x003b
            if (r14 != r12) goto L_0x003a
            java.lang.String r12 = "GoogleApiAvailability"
            java.lang.String r13 = "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead."
            android.util.Log.w(r12, r13)
        L_0x003a:
            return
        L_0x003b:
            if (r14 != r12) goto L_0x0044
            java.lang.String r1 = "common_google_play_services_resolution_required_title"
            java.lang.String r1 = r3.s.e(r13, r1)
            goto L_0x0048
        L_0x0044:
            java.lang.String r1 = r3.s.a(r13, r14)
        L_0x0048:
            r5 = -2146369478(0xffffffff8011003a, float:-1.561285E-39)
            if (r1 != 0) goto L_0x0055
            android.content.res.Resources r1 = r13.getResources()
            java.lang.String r1 = r1.getString(r5)
        L_0x0055:
            if (r14 == r12) goto L_0x0061
            r12 = 19
            if (r14 != r12) goto L_0x005c
            goto L_0x0061
        L_0x005c:
            java.lang.String r12 = r3.s.b(r13, r14)
            goto L_0x006b
        L_0x0061:
            java.lang.String r12 = r3.s.c(r13)
            java.lang.String r6 = "common_google_play_services_resolution_required_text"
            java.lang.String r12 = r3.s.d(r13, r6, r12)
        L_0x006b:
            android.content.res.Resources r6 = r13.getResources()
            java.lang.String r7 = "notification"
            java.lang.Object r7 = r13.getSystemService(r7)
            r3.b.b(r7)
            android.app.NotificationManager r7 = (android.app.NotificationManager) r7
            z.e r8 = new z.e
            r8.<init>(r13)
            r8.f8641k = r2
            android.app.Notification r9 = r8.f8645o
            int r10 = r9.flags
            r10 = r10 | 16
            r9.flags = r10
            java.lang.CharSequence r1 = z.e.b(r1)
            r8.e = r1
            z.d r1 = new z.d
            r1.<init>()
            java.lang.CharSequence r9 = z.e.b(r12)
            r1.f8631b = r9
            r8.c(r1)
            android.content.pm.PackageManager r1 = r13.getPackageManager()
            java.lang.Boolean r9 = v3.a.f7925a
            if (r9 != 0) goto L_0x00b1
            java.lang.String r9 = "android.hardware.type.watch"
            boolean r1 = r1.hasSystemFeature(r9)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            v3.a.f7925a = r1
        L_0x00b1:
            java.lang.Boolean r1 = v3.a.f7925a
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x00cb
            android.content.pm.ApplicationInfo r12 = r13.getApplicationInfo()
            int r12 = r12.icon
            android.app.Notification r1 = r8.f8645o
            r1.icon = r12
            r8.f8638h = r0
            v3.a.a(r13)
            r8.f8637g = r15
            goto L_0x00ee
        L_0x00cb:
            android.app.Notification r1 = r8.f8645o
            r9 = 17301642(0x108008a, float:2.4979642E-38)
            r1.icon = r9
            java.lang.String r1 = r6.getString(r5)
            android.app.Notification r5 = r8.f8645o
            java.lang.CharSequence r1 = z.e.b(r1)
            r5.tickerText = r1
            long r5 = java.lang.System.currentTimeMillis()
            android.app.Notification r1 = r8.f8645o
            r1.when = r5
            r8.f8637g = r15
            java.lang.CharSequence r12 = z.e.b(r12)
            r8.f8636f = r12
        L_0x00ee:
            java.lang.Object r12 = f6089b
            monitor-enter(r12)
            monitor-exit(r12)     // Catch:{ all -> 0x038e }
            java.lang.String r12 = "com.google.android.gms.availability"
            android.app.NotificationChannel r15 = r7.getNotificationChannel(r12)
            android.content.res.Resources r13 = r13.getResources()
            r1 = -2146369479(0xffffffff80110039, float:-1.561283E-39)
            java.lang.String r13 = r13.getString(r1)
            if (r15 != 0) goto L_0x010c
            android.app.NotificationChannel r15 = new android.app.NotificationChannel
            r1 = 4
            r15.<init>(r12, r13, r1)
            goto L_0x0119
        L_0x010c:
            java.lang.CharSequence r1 = r15.getName()
            boolean r1 = r13.contentEquals(r1)
            if (r1 != 0) goto L_0x011c
            r15.setName(r13)
        L_0x0119:
            r7.createNotificationChannel(r15)
        L_0x011c:
            r8.f8643m = r12
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            android.os.Bundle r12 = new android.os.Bundle
            r12.<init>()
            android.app.Notification$Builder r13 = new android.app.Notification$Builder
            java.lang.String r15 = r8.f8643m
            android.content.Context r1 = r8.f8632a
            r13.<init>(r1, r15)
            android.app.Notification r15 = r8.f8645o
            long r5 = r15.when
            android.app.Notification$Builder r1 = r13.setWhen(r5)
            int r5 = r15.icon
            int r6 = r15.iconLevel
            android.app.Notification$Builder r1 = r1.setSmallIcon(r5, r6)
            android.widget.RemoteViews r5 = r15.contentView
            android.app.Notification$Builder r1 = r1.setContent(r5)
            java.lang.CharSequence r5 = r15.tickerText
            android.app.Notification$Builder r1 = r1.setTicker(r5, r4)
            long[] r5 = r15.vibrate
            android.app.Notification$Builder r1 = r1.setVibrate(r5)
            int r5 = r15.ledARGB
            int r6 = r15.ledOnMS
            int r9 = r15.ledOffMS
            android.app.Notification$Builder r1 = r1.setLights(r5, r6, r9)
            int r5 = r15.flags
            r0 = r0 & r5
            if (r0 == 0) goto L_0x0164
            r0 = r2
            goto L_0x0165
        L_0x0164:
            r0 = r3
        L_0x0165:
            android.app.Notification$Builder r0 = r1.setOngoing(r0)
            int r1 = r15.flags
            r1 = r1 & 8
            if (r1 == 0) goto L_0x0171
            r1 = r2
            goto L_0x0172
        L_0x0171:
            r1 = r3
        L_0x0172:
            android.app.Notification$Builder r0 = r0.setOnlyAlertOnce(r1)
            int r1 = r15.flags
            r1 = r1 & 16
            if (r1 == 0) goto L_0x017e
            r1 = r2
            goto L_0x017f
        L_0x017e:
            r1 = r3
        L_0x017f:
            android.app.Notification$Builder r0 = r0.setAutoCancel(r1)
            int r1 = r15.defaults
            android.app.Notification$Builder r0 = r0.setDefaults(r1)
            java.lang.CharSequence r1 = r8.e
            android.app.Notification$Builder r0 = r0.setContentTitle(r1)
            java.lang.CharSequence r1 = r8.f8636f
            android.app.Notification$Builder r0 = r0.setContentText(r1)
            android.app.Notification$Builder r0 = r0.setContentInfo(r4)
            android.app.PendingIntent r1 = r8.f8637g
            android.app.Notification$Builder r0 = r0.setContentIntent(r1)
            android.app.PendingIntent r1 = r15.deleteIntent
            android.app.Notification$Builder r0 = r0.setDeleteIntent(r1)
            int r1 = r15.flags
            r1 = r1 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x01ac
            goto L_0x01ad
        L_0x01ac:
            r2 = r3
        L_0x01ad:
            android.app.Notification$Builder r0 = r0.setFullScreenIntent(r4, r2)
            android.app.Notification$Builder r0 = r0.setLargeIcon(r4)
            android.app.Notification$Builder r0 = r0.setNumber(r3)
            r0.setProgress(r3, r3, r3)
            android.app.Notification$Builder r0 = r13.setSubText(r4)
            android.app.Notification$Builder r0 = r0.setUsesChronometer(r3)
            int r1 = r8.f8638h
            r0.setPriority(r1)
            java.util.ArrayList<z.c> r0 = r8.f8633b
            java.util.Iterator r0 = r0.iterator()
        L_0x01cf:
            boolean r1 = r0.hasNext()
            java.lang.String r2 = "android.support.allowGeneratedReplies"
            if (r1 == 0) goto L_0x0214
            java.lang.Object r1 = r0.next()
            z.c r1 = (z.c) r1
            r1.getClass()
            android.app.Notification$Action$Builder r1 = new android.app.Notification$Action$Builder
            r1.<init>(r4, r4, r4)
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            r5.putBoolean(r2, r3)
            int r2 = android.os.Build.VERSION.SDK_INT
            r1.setAllowGeneratedReplies(r3)
            java.lang.String r6 = "android.support.action.semanticAction"
            r5.putInt(r6, r3)
            r1.setSemanticAction(r3)
            r1.setContextual(r3)
            r6 = 31
            if (r2 < r6) goto L_0x0204
            r1.setAuthenticationRequired(r3)
        L_0x0204:
            java.lang.String r2 = "android.support.action.showsUserInterface"
            r5.putBoolean(r2, r3)
            r1.addExtras(r5)
            android.app.Notification$Action r1 = r1.build()
            r13.addAction(r1)
            goto L_0x01cf
        L_0x0214:
            android.os.Bundle r0 = r8.f8642l
            if (r0 == 0) goto L_0x021b
            r12.putAll(r0)
        L_0x021b:
            boolean r0 = r8.f8639i
            r13.setShowWhen(r0)
            boolean r0 = r8.f8641k
            android.app.Notification$Builder r0 = r13.setLocalOnly(r0)
            android.app.Notification$Builder r0 = r0.setGroup(r4)
            android.app.Notification$Builder r0 = r0.setGroupSummary(r3)
            r0.setSortKey(r4)
            android.app.Notification$Builder r0 = r13.setCategory(r4)
            android.app.Notification$Builder r0 = r0.setColor(r3)
            android.app.Notification$Builder r0 = r0.setVisibility(r3)
            android.app.Notification$Builder r0 = r0.setPublicVersion(r4)
            android.net.Uri r1 = r15.sound
            android.media.AudioAttributes r15 = r15.audioAttributes
            r0.setSound(r1, r15)
            java.util.ArrayList<java.lang.String> r15 = r8.f8646p
            if (r15 == 0) goto L_0x0266
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x0266
            java.util.Iterator r15 = r15.iterator()
        L_0x0256:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0266
            java.lang.Object r0 = r15.next()
            java.lang.String r0 = (java.lang.String) r0
            r13.addPerson(r0)
            goto L_0x0256
        L_0x0266:
            java.util.ArrayList<z.c> r15 = r8.f8635d
            int r0 = r15.size()
            if (r0 <= 0) goto L_0x02eb
            android.os.Bundle r0 = r8.a()
            java.lang.String r1 = "android.car.EXTENSIONS"
            android.os.Bundle r0 = r0.getBundle(r1)
            if (r0 != 0) goto L_0x027f
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L_0x027f:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r0)
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
        L_0x0289:
            int r6 = r15.size()
            if (r3 >= r6) goto L_0x02d9
            java.lang.String r6 = java.lang.Integer.toString(r3)
            java.lang.Object r9 = r15.get(r3)
            z.c r9 = (z.c) r9
            java.lang.Object r10 = z.g.f8648a
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            r9.getClass()
            r9 = 0
            java.lang.String r11 = "icon"
            r10.putInt(r11, r9)
            java.lang.String r9 = "title"
            r11 = 0
            r10.putCharSequence(r9, r11)
            java.lang.String r9 = "actionIntent"
            r10.putParcelable(r9, r11)
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            r11 = 0
            r9.putBoolean(r2, r11)
            java.lang.String r11 = "extras"
            r10.putBundle(r11, r9)
            java.lang.String r9 = "remoteInputs"
            r11 = 0
            r10.putParcelableArray(r9, r11)
            java.lang.String r9 = "showsUserInterface"
            r11 = 0
            r10.putBoolean(r9, r11)
            java.lang.String r9 = "semanticAction"
            r10.putInt(r9, r11)
            r5.putBundle(r6, r10)
            int r3 = r3 + 1
            goto L_0x0289
        L_0x02d9:
            java.lang.String r15 = "invisible_actions"
            r0.putBundle(r15, r5)
            r4.putBundle(r15, r5)
            android.os.Bundle r15 = r8.a()
            r15.putBundle(r1, r0)
            r12.putBundle(r1, r4)
        L_0x02eb:
            android.os.Bundle r12 = r8.f8642l
            android.app.Notification$Builder r12 = r13.setExtras(r12)
            r15 = 0
            r12.setRemoteInputHistory(r15)
            r12 = 0
            android.app.Notification$Builder r0 = r13.setBadgeIconType(r12)
            android.app.Notification$Builder r0 = r0.setSettingsText(r15)
            android.app.Notification$Builder r0 = r0.setShortcutId(r15)
            r1 = 0
            android.app.Notification$Builder r0 = r0.setTimeoutAfter(r1)
            r0.setGroupAlertBehavior(r12)
            java.lang.String r0 = r8.f8643m
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0322
            android.app.Notification$Builder r0 = r13.setSound(r15)
            android.app.Notification$Builder r0 = r0.setDefaults(r12)
            android.app.Notification$Builder r12 = r0.setLights(r12, r12, r12)
            r12.setVibrate(r15)
        L_0x0322:
            java.util.ArrayList<z.h> r12 = r8.f8634c
            java.util.Iterator r12 = r12.iterator()
        L_0x0328:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto L_0x033f
            java.lang.Object r15 = r12.next()
            z.h r15 = (z.h) r15
            r15.getClass()
            android.app.Person r15 = z.h.a.b(r15)
            r13.addPerson(r15)
            goto L_0x0328
        L_0x033f:
            boolean r12 = r8.f8644n
            r13.setAllowSystemGeneratedContextualActions(r12)
            r12 = 0
            r13.setBubbleMetadata(r12)
            z.f r15 = r8.f8640j
            if (r15 == 0) goto L_0x035d
            r0 = r15
            z.d r0 = (z.d) r0
            android.app.Notification$BigTextStyle r1 = new android.app.Notification$BigTextStyle
            r1.<init>(r13)
            android.app.Notification$BigTextStyle r12 = r1.setBigContentTitle(r12)
            java.lang.CharSequence r0 = r0.f8631b
            r12.bigText(r0)
        L_0x035d:
            android.app.Notification r12 = r13.build()
            if (r15 == 0) goto L_0x0368
            z.f r13 = r8.f8640j
            r13.getClass()
        L_0x0368:
            if (r15 == 0) goto L_0x0375
            android.os.Bundle r13 = r12.extras
            if (r13 == 0) goto L_0x0375
            java.lang.String r15 = "androidx.core.app.extra.COMPAT_TEMPLATE"
            java.lang.String r0 = "androidx.core.app.NotificationCompat$BigTextStyle"
            r13.putString(r15, r0)
        L_0x0375:
            r13 = 1
            if (r14 == r13) goto L_0x0382
            r13 = 2
            if (r14 == r13) goto L_0x0382
            r13 = 3
            if (r14 == r13) goto L_0x0382
            r13 = 39789(0x9b6d, float:5.5756E-41)
            goto L_0x038a
        L_0x0382:
            java.util.concurrent.atomic.AtomicBoolean r13 = o3.g.f6093a
            r14 = 0
            r13.set(r14)
            r13 = 10436(0x28c4, float:1.4624E-41)
        L_0x038a:
            r7.notify(r13, r12)
            return
        L_0x038e:
            r13 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x038e }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.d.e(android.content.Context, int, android.app.PendingIntent):void");
    }
}
