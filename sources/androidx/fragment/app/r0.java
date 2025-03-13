package androidx.fragment.app;

import java.io.Writer;

public final class r0 extends Writer {

    /* renamed from: f  reason: collision with root package name */
    public final StringBuilder f1317f = new StringBuilder(128);

    public final void a() {
        StringBuilder sb = this.f1317f;
        if (sb.length() > 0) {
            sb.toString();
            sb.delete(0, sb.length());
        }
    }

    public final void close() {
        a();
    }

    public final void flush() {
        a();
    }

    public final void write(char[] cArr, int i8, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            char c9 = cArr[i8 + i10];
            if (c9 == 10) {
                a();
            } else {
                this.f1317f.append(c9);
            }
        }
    }
}
