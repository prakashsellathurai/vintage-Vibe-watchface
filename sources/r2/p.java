package r2;

import java.security.MessageDigest;
import java.util.Map;
import k3.j;
import p2.e;
import p2.g;
import p2.k;

public final class p implements e {

    /* renamed from: b  reason: collision with root package name */
    public final Object f6874b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6875c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6876d;
    public final Class<?> e;

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f6877f;

    /* renamed from: g  reason: collision with root package name */
    public final e f6878g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<Class<?>, k<?>> f6879h;

    /* renamed from: i  reason: collision with root package name */
    public final g f6880i;

    /* renamed from: j  reason: collision with root package name */
    public int f6881j;

    public p(Object obj, e eVar, int i8, int i9, Map<Class<?>, k<?>> map, Class<?> cls, Class<?> cls2, g gVar) {
        j.l(obj);
        this.f6874b = obj;
        if (eVar != null) {
            this.f6878g = eVar;
            this.f6875c = i8;
            this.f6876d = i9;
            j.l(map);
            this.f6879h = map;
            if (cls != null) {
                this.e = cls;
                if (cls2 != null) {
                    this.f6877f = cls2;
                    j.l(gVar);
                    this.f6880i = gVar;
                    return;
                }
                throw new NullPointerException("Transcode class must not be null");
            }
            throw new NullPointerException("Resource class must not be null");
        }
        throw new NullPointerException("Signature must not be null");
    }

    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f6874b.equals(pVar.f6874b) && this.f6878g.equals(pVar.f6878g) && this.f6876d == pVar.f6876d && this.f6875c == pVar.f6875c && this.f6879h.equals(pVar.f6879h) && this.e.equals(pVar.e) && this.f6877f.equals(pVar.f6877f) && this.f6880i.equals(pVar.f6880i);
    }

    public final int hashCode() {
        if (this.f6881j == 0) {
            int hashCode = this.f6874b.hashCode();
            this.f6881j = hashCode;
            int hashCode2 = (((((hashCode * 31) + this.f6878g.hashCode()) * 31) + this.f6875c) * 31) + this.f6876d;
            this.f6881j = hashCode2;
            int hashCode3 = (hashCode2 * 31) + this.f6879h.hashCode();
            this.f6881j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.e.hashCode();
            this.f6881j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f6877f.hashCode();
            this.f6881j = hashCode5;
            this.f6881j = (hashCode5 * 31) + this.f6880i.hashCode();
        }
        return this.f6881j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f6874b + ", width=" + this.f6875c + ", height=" + this.f6876d + ", resourceClass=" + this.e + ", transcodeClass=" + this.f6877f + ", signature=" + this.f6878g + ", hashCode=" + this.f6881j + ", transformations=" + this.f6879h + ", options=" + this.f6880i + '}';
    }
}
