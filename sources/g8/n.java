package g8;

import java.nio.charset.Charset;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f4713a = Charset.forName("UTF-8");

    public static void a(long j8, long j9, long j10) {
        if ((j9 | j10) < 0 || j9 > j8 || j8 - j9 < j10) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", new Object[]{Long.valueOf(j8), Long.valueOf(j9), Long.valueOf(j10)}));
        }
    }
}
