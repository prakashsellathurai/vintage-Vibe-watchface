package androidx.wear.protolayout.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f2214a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f2215b;

    public interface a {
        int getNumber();
    }

    public interface b {
        boolean a();
    }

    public interface c<E> extends List<E>, RandomAccess {
        void a();

        c<E> b(int i8);

        boolean f();
    }

    static {
        Charset.forName("US-ASCII");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f2215b = bArr;
        ByteBuffer.wrap(bArr);
        h.d(bArr, 0, 0, false);
    }

    public static int a(boolean z8) {
        return z8 ? 1231 : 1237;
    }

    public static int b(long j8) {
        return (int) (j8 ^ (j8 >>> 32));
    }
}
