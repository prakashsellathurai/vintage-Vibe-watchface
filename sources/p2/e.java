package p2;

import java.nio.charset.Charset;
import java.security.MessageDigest;

public interface e {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f6307a = Charset.forName("UTF-8");

    void a(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
