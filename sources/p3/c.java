package p3;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import java.lang.reflect.InvocationTargetException;
import k3.j;
import p3.a;
import p3.a.c;
import q3.d;
import r3.p;

public abstract class c<O extends a.c> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f6318a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6319b;

    /* renamed from: c  reason: collision with root package name */
    public final a<O> f6320c;

    /* renamed from: d  reason: collision with root package name */
    public final O f6321d;
    public final q3.a<O> e;

    /* renamed from: f  reason: collision with root package name */
    public final int f6322f;

    /* renamed from: g  reason: collision with root package name */
    public final j f6323g;
    @RecentlyNonNull

    /* renamed from: h  reason: collision with root package name */
    public final d f6324h;

    public static class a {
        @RecentlyNonNull

        /* renamed from: b  reason: collision with root package name */
        public static final a f6325b = new a(new j(), Looper.getMainLooper());
        @RecentlyNonNull

        /* renamed from: a  reason: collision with root package name */
        public final j f6326a;

        public a(j jVar, Looper looper) {
            this.f6326a = jVar;
        }
    }

    public c(@RecentlyNonNull Context context, @RecentlyNonNull a aVar, @RecentlyNonNull a aVar2) {
        String str;
        O o8 = p.f7026b;
        if (context == null) {
            throw new NullPointerException("Null context is not permitted.");
        } else if (aVar == null) {
            throw new NullPointerException("Api must not be null.");
        } else if (aVar2 != null) {
            this.f6318a = context.getApplicationContext();
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                str = null;
            }
            this.f6319b = str;
            this.f6320c = aVar;
            this.f6321d = o8;
            this.e = new q3.a<>(aVar, str);
            d c9 = d.c(this.f6318a);
            this.f6324h = c9;
            this.f6322f = c9.f6545h.getAndIncrement();
            this.f6323g = aVar2.f6326a;
            Handler handler = c9.f6549l;
            handler.sendMessage(handler.obtainMessage(7, this));
        } else {
            throw new NullPointerException("Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        r1 = ((p3.a.c.b) r1).b();
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0048  */
    @androidx.annotation.RecentlyNonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final r3.d.a a() {
        /*
            r6 = this;
            r3.d$a r0 = new r3.d$a
            r0.<init>()
            O r1 = r6.f6321d
            boolean r2 = r1 instanceof p3.a.c.b
            if (r2 == 0) goto L_0x0021
            r3 = r1
            p3.a$c$b r3 = (p3.a.c.b) r3
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r3 = r3.b()
            if (r3 == 0) goto L_0x0021
            java.lang.String r3 = r3.f3006i
            if (r3 != 0) goto L_0x0019
            goto L_0x002d
        L_0x0019:
            android.accounts.Account r4 = new android.accounts.Account
            java.lang.String r5 = "com.google"
            r4.<init>(r3, r5)
            goto L_0x002e
        L_0x0021:
            boolean r3 = r1 instanceof p3.a.c.C0107a
            if (r3 == 0) goto L_0x002d
            r3 = r1
            p3.a$c$a r3 = (p3.a.c.C0107a) r3
            android.accounts.Account r4 = r3.a()
            goto L_0x002e
        L_0x002d:
            r4 = 0
        L_0x002e:
            r0.f6960a = r4
            if (r2 == 0) goto L_0x0040
            p3.a$c$b r1 = (p3.a.c.b) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.b()
            if (r1 != 0) goto L_0x003b
            goto L_0x0040
        L_0x003b:
            java.util.HashSet r1 = r1.b()
            goto L_0x0044
        L_0x0040:
            java.util.Set r1 = java.util.Collections.emptySet()
        L_0x0044:
            p.b<com.google.android.gms.common.api.Scope> r2 = r0.f6961b
            if (r2 != 0) goto L_0x0050
            p.b r2 = new p.b
            r3 = 0
            r2.<init>(r3)
            r0.f6961b = r2
        L_0x0050:
            p.b<com.google.android.gms.common.api.Scope> r2 = r0.f6961b
            r2.addAll(r1)
            android.content.Context r6 = r6.f6318a
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            r0.f6963d = r1
            java.lang.String r6 = r6.getPackageName()
            r0.f6962c = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.c.a():r3.d$a");
    }
}
