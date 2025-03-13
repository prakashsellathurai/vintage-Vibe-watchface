package androidx.wear.protolayout.protobuf;

import androidx.wear.protolayout.protobuf.a;
import androidx.wear.protolayout.protobuf.a.C0018a;
import androidx.wear.protolayout.protobuf.g;
import androidx.wear.protolayout.protobuf.j;
import androidx.wear.protolayout.protobuf.o0;
import java.io.IOException;
import java.util.logging.Logger;

public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends C0018a<MessageType, BuilderType>> implements o0 {
    protected int memoizedHashCode = 0;

    /* renamed from: androidx.wear.protolayout.protobuf.a$a  reason: collision with other inner class name */
    public static abstract class C0018a<MessageType extends a<MessageType, BuilderType>, BuilderType extends C0018a<MessageType, BuilderType>> implements o0.a {
    }

    /* access modifiers changed from: package-private */
    public int c() {
        throw new UnsupportedOperationException();
    }

    public int d(b1 b1Var) {
        int c9 = c();
        if (c9 != -1) {
            return c9;
        }
        int e = b1Var.e(this);
        f(e);
        return e;
    }

    public final String e(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* access modifiers changed from: package-private */
    public void f(int i8) {
        throw new UnsupportedOperationException();
    }

    public final byte[] g() {
        try {
            int d9 = ((v) this).d((b1) null);
            byte[] bArr = new byte[d9];
            Logger logger = j.f2125b;
            j.a aVar = new j.a(bArr, d9);
            ((v) this).a(aVar);
            if (aVar.Y() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(e("byte array"), e);
        }
    }

    public final g.f toByteString() {
        try {
            int d9 = ((v) this).d((b1) null);
            g.f fVar = g.f2096g;
            byte[] bArr = new byte[d9];
            Logger logger = j.f2125b;
            j.a aVar = new j.a(bArr, d9);
            ((v) this).a(aVar);
            if (aVar.Y() == 0) {
                return new g.f(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(e("ByteString"), e);
        }
    }
}
