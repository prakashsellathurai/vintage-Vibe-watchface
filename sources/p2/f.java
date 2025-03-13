package p2;

import android.text.TextUtils;
import java.security.MessageDigest;

public final class f<T> {
    public static final a e = new a();

    /* renamed from: a  reason: collision with root package name */
    public final T f6308a;

    /* renamed from: b  reason: collision with root package name */
    public final b<T> f6309b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6310c;

    /* renamed from: d  reason: collision with root package name */
    public volatile byte[] f6311d;

    public class a implements b<Object> {
        public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    public interface b<T> {
        void a(byte[] bArr, T t8, MessageDigest messageDigest);
    }

    public f(String str, T t8, b<T> bVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f6310c = str;
            this.f6308a = t8;
            this.f6309b = bVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public static f a(Object obj, String str) {
        return new f(str, obj, e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f6310c.equals(((f) obj).f6310c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6310c.hashCode();
    }

    public final String toString() {
        return "Option{key='" + this.f6310c + "'}";
    }
}
