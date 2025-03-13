package v2;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import k3.j;
import p2.e;

public final class f implements e {

    /* renamed from: b  reason: collision with root package name */
    public final g f7862b;

    /* renamed from: c  reason: collision with root package name */
    public final URL f7863c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7864d;
    public String e;

    /* renamed from: f  reason: collision with root package name */
    public URL f7865f;

    /* renamed from: g  reason: collision with root package name */
    public volatile byte[] f7866g;

    /* renamed from: h  reason: collision with root package name */
    public int f7867h;

    public f(String str) {
        i iVar = g.f7868a;
        this.f7863c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f7864d = str;
            j.l(iVar);
            this.f7862b = iVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public final void a(MessageDigest messageDigest) {
        if (this.f7866g == null) {
            this.f7866g = c().getBytes(e.f6307a);
        }
        messageDigest.update(this.f7866g);
    }

    public final String c() {
        String str = this.f7864d;
        if (str != null) {
            return str;
        }
        URL url = this.f7863c;
        j.l(url);
        return url.toString();
    }

    public final URL d() {
        if (this.f7865f == null) {
            if (TextUtils.isEmpty(this.e)) {
                String str = this.f7864d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.f7863c;
                    j.l(url);
                    str = url.toString();
                }
                this.e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f7865f = new URL(this.e);
        }
        return this.f7865f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return c().equals(fVar.c()) && this.f7862b.equals(fVar.f7862b);
    }

    public final int hashCode() {
        if (this.f7867h == 0) {
            int hashCode = c().hashCode();
            this.f7867h = hashCode;
            this.f7867h = (hashCode * 31) + this.f7862b.hashCode();
        }
        return this.f7867h;
    }

    public final String toString() {
        return c();
    }

    public f(URL url) {
        i iVar = g.f7868a;
        j.l(url);
        this.f7863c = url;
        this.f7864d = null;
        j.l(iVar);
        this.f7862b = iVar;
    }
}
