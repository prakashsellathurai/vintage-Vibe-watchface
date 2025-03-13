package t5;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Log;
import n6.g;
import o6.o;
import r5.e;
import s5.d;
import w5.c;
import w5.f;

public final class a extends d implements o {

    /* renamed from: b  reason: collision with root package name */
    public final e f7493b;

    /* renamed from: c  reason: collision with root package name */
    public PendingIntent f7494c;

    /* renamed from: d  reason: collision with root package name */
    public String f7495d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final String f7496f;

    /* renamed from: g  reason: collision with root package name */
    public final String f7497g;

    /* renamed from: t5.a$a  reason: collision with other inner class name */
    public class C0125a extends f6.a {
        public C0125a(v5.b bVar, c cVar) {
            super(bVar, cVar);
        }

        public final void b(f fVar) {
            a.this.f7494c = (PendingIntent) fVar.g();
        }
    }

    public enum b {
        ;
        

        /* renamed from: f  reason: collision with root package name */
        public final String f7499f;

        /* renamed from: g  reason: collision with root package name */
        public final String f7500g;

        /* renamed from: h  reason: collision with root package name */
        public final String f7501h;

        /* access modifiers changed from: public */
        b(String str, String str2) {
            this(r7, r8, str, str2, (String) null);
        }

        /* access modifiers changed from: public */
        b(String str, String str2, String str3) {
            this.f7499f = str;
            this.f7500g = str2;
            this.f7501h = str3;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(r5.e r5, java.lang.String r6) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.e = r0
            java.lang.String r0 = ""
            r4.f7496f = r0
            r0 = 0
            r4.f7497g = r0
            r4.f7493b = r5
            java.lang.String r1 = "COMPLICATION\\..+"
            boolean r1 = r6.matches(r1)
            if (r1 == 0) goto L_0x003d
            t5.a$a r1 = new t5.a$a
            v5.b r5 = r5.f7077h
            w5.c r2 = new w5.c
            java.lang.String r3 = ".TAP_ACTION"
            java.lang.String r3 = r6.concat(r3)
            r2.<init>(r3)
            r1.<init>(r5, r2)
            s5.f r5 = new s5.f
            r2 = 4
            r5.<init>(r1, r2)
            r4.k(r5)
            java.lang.String r5 = "complication: "
            java.lang.String r5 = r5.concat(r6)
            r4.f7495d = r5
        L_0x003a:
            r4.f7496f = r6
            goto L_0x0067
        L_0x003d:
            java.lang.String r5 = "[0-9a-zA-Z_\\-]+:.+"
            boolean r5 = r6.matches(r5)
            if (r5 == 0) goto L_0x005c
            java.lang.String r5 = "deep link: "
            java.lang.String r5 = r5.concat(r6)
            r4.f7495d = r5
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r5 = "android.intent.action.VIEW"
            r0.<init>(r5)
            android.net.Uri r5 = android.net.Uri.parse(r6)
            r0.setData(r5)
            goto L_0x003a
        L_0x005c:
            android.content.Intent r0 = r4.m(r6)
            r4.f7497g = r6
            r5 = -2146369503(0xffffffff80110021, float:-1.56125E-39)
            r4.e = r5
        L_0x0067:
            java.lang.String r5 = r4.f7495d
            boolean r5 = n6.g.d(r5)
            if (r5 == 0) goto L_0x0076
            java.lang.String r5 = "DWF:Launch"
            java.lang.String r6 = r4.f7495d
            android.util.Log.i(r5, r6)
        L_0x0076:
            r4.l(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.a.<init>(r5.e, java.lang.String):void");
    }

    public final void b() {
        PendingIntent pendingIntent = this.f7494c;
        String str = this.f7497g;
        if (pendingIntent == null && str != null) {
            l(m(str));
        }
        PendingIntent pendingIntent2 = this.f7494c;
        if (pendingIntent2 != null) {
            try {
                pendingIntent2.send();
                if (g.d(this.f7495d)) {
                    Log.i("DWF:Launch", "[Launch::onTap] " + this.f7495d);
                }
            } catch (PendingIntent.CanceledException e4) {
                Log.e("DWF:Launch", e4.getMessage());
            }
        } else {
            Log.w("DWF:Launch", "there is no intent to launch");
        }
    }

    public final void l(Intent intent) {
        if (intent != null) {
            intent.setFlags(intent.getFlags() | 268435456);
            this.f7494c = PendingIntent.getActivity(this.f7493b.f7071a, 0, intent, 67108864);
        }
    }

    public final Intent m(String str) {
        boolean z8;
        Intent intent;
        String[] split = str.split("/");
        if (split.length > 0) {
            e eVar = this.f7493b;
            Context context = eVar.f7071a;
            String str2 = split[0];
            try {
                context.getPackageManager().getPackageInfo(str2, 0);
                z8 = true;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.i("DWF:Launch", "no package: " + str2);
                z8 = false;
            }
            if (!z8) {
                this.f7495d = "market: ".concat(str);
                intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + split[0]));
            } else if (split.length == 1) {
                this.f7495d = "package: ".concat(str);
                intent = eVar.f7071a.getPackageManager().getLaunchIntentForPackage(split[0]);
            } else if (split.length != 2) {
                return null;
            } else {
                this.f7495d = "package/class: ".concat(str);
                intent = new Intent();
                intent.setClassName(split[0], split[1]);
            }
            return intent;
        }
        Log.w("DWF:Launch", "invalid target: ".concat(str));
        return null;
    }

    public a(e eVar, b bVar) {
        this.e = 0;
        this.f7496f = "";
        this.f7497g = null;
        this.f7493b = eVar;
        String str = "system shortcut: " + bVar;
        this.f7495d = str;
        Log.i("DWF:Launch", str);
        bVar.getClass();
        Intent intent = new Intent();
        String str2 = bVar.f7499f;
        if (str2 != null) {
            intent.setAction(str2);
        }
        String str3 = bVar.f7500g;
        if (str3 != null) {
            intent.addCategory(str3);
        }
        String str4 = bVar.f7501h;
        if (str4 != null) {
            intent.setData(Uri.parse(str4));
        }
        l(intent);
        this.f7496f = bVar.name();
    }
}
