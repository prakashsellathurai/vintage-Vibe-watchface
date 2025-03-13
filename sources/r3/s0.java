package r3;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;

public final class s0 {
    public static final Uri e = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a  reason: collision with root package name */
    public final String f7030a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7031b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7032c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f7033d;

    public s0(String str, String str2, int i8, boolean z8) {
        if (!TextUtils.isEmpty(str)) {
            this.f7030a = str;
            if (!TextUtils.isEmpty(str2)) {
                this.f7031b = str2;
                this.f7032c = i8;
                this.f7033d = z8;
                return;
            }
            throw new IllegalArgumentException("Given String is empty or null");
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return l.a(this.f7030a, s0Var.f7030a) && l.a(this.f7031b, s0Var.f7031b) && l.a((Object) null, (Object) null) && this.f7032c == s0Var.f7032c && this.f7033d == s0Var.f7033d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7030a, this.f7031b, null, Integer.valueOf(this.f7032c), Boolean.valueOf(this.f7033d)});
    }

    public final String toString() {
        String str = this.f7030a;
        if (str != null) {
            return str;
        }
        b.b((Object) null);
        throw null;
    }
}
