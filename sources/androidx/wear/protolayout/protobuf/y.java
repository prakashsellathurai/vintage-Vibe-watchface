package androidx.wear.protolayout.protobuf;

import java.io.IOException;

public class y extends IOException {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f2216f = 0;

    public static class a extends y {
        public a() {
            super("Protocol message tag had invalid wire type.");
        }
    }

    public y(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public y(String str) {
        super(str);
    }

    public static y a() {
        return new y("Protocol message had invalid UTF-8.");
    }

    public static a b() {
        return new a();
    }

    public static y c() {
        return new y("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
