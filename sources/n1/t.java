package n1;

import android.util.Printer;
import java.io.PrintWriter;
import java.io.Writer;
import q7.k;

public final class t implements Printer {

    /* renamed from: a  reason: collision with root package name */
    public final String f5728a = "\t";

    /* renamed from: b  reason: collision with root package name */
    public final PrintWriter f5729b;

    /* renamed from: c  reason: collision with root package name */
    public final StringBuilder f5730c;

    /* renamed from: d  reason: collision with root package name */
    public char[] f5731d;
    public boolean e;

    public t(Writer writer) {
        k.e(writer, "writer");
        this.f5729b = new PrintWriter(writer);
        this.f5730c = new StringBuilder();
        this.e = true;
    }

    public final void a() {
        this.f5730c.delete(0, this.f5728a.length());
        this.f5731d = null;
    }

    public final void b() {
        this.f5730c.append(this.f5728a);
        this.f5731d = null;
    }

    public final void c() {
        if (this.e) {
            this.e = false;
            StringBuilder sb = this.f5730c;
            if (sb.length() > 0) {
                if (this.f5731d == null) {
                    String sb2 = sb.toString();
                    k.d(sb2, "indentBuilder.toString()");
                    char[] charArray = sb2.toCharArray();
                    k.d(charArray, "this as java.lang.String).toCharArray()");
                    this.f5731d = charArray;
                }
                PrintWriter printWriter = this.f5729b;
                char[] cArr = this.f5731d;
                k.b(cArr);
                printWriter.write(cArr, 0, cArr.length);
            }
        }
    }

    public final void d(String str) {
        int i8;
        PrintWriter printWriter;
        int i9;
        if (str == null) {
            str = "null";
        }
        int i10 = 0;
        int length = str.length() + 0;
        loop0:
        while (true) {
            i8 = i10;
            while (true) {
                printWriter = this.f5729b;
                if (i8 >= length) {
                    break loop0;
                }
                i9 = i8 + 1;
                if (str.charAt(i8) == 10) {
                    break;
                }
                i8 = i9;
            }
            c();
            printWriter.write(str, i10, i9 - i10);
            this.e = true;
            i10 = i9;
        }
        if (i10 != i8) {
            c();
            printWriter.write(str, i10, i8 - i10);
        }
    }

    public final void println(String str) {
        k.e(str, "string");
        d(str);
        d("\n");
    }
}
