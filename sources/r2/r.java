package r2;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p2.e;

public final class r extends Exception {

    /* renamed from: k  reason: collision with root package name */
    public static final StackTraceElement[] f6889k = new StackTraceElement[0];

    /* renamed from: f  reason: collision with root package name */
    public final List<Throwable> f6890f;

    /* renamed from: g  reason: collision with root package name */
    public e f6891g;

    /* renamed from: h  reason: collision with root package name */
    public p2.a f6892h;

    /* renamed from: i  reason: collision with root package name */
    public Class<?> f6893i;

    /* renamed from: j  reason: collision with root package name */
    public final String f6894j;

    public static final class a implements Appendable {

        /* renamed from: f  reason: collision with root package name */
        public final Appendable f6895f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f6896g = true;

        public a(Appendable appendable) {
            this.f6895f = appendable;
        }

        public final Appendable append(char c9) {
            boolean z8 = this.f6896g;
            Appendable appendable = this.f6895f;
            boolean z9 = false;
            if (z8) {
                this.f6896g = false;
                appendable.append("  ");
            }
            if (c9 == 10) {
                z9 = true;
            }
            this.f6896g = z9;
            appendable.append(c9);
            return this;
        }

        public final Appendable append(CharSequence charSequence) {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        public final Appendable append(CharSequence charSequence, int i8, int i9) {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z8 = this.f6896g;
            Appendable appendable = this.f6895f;
            boolean z9 = false;
            if (z8) {
                this.f6896g = false;
                appendable.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i9 - 1) == 10) {
                z9 = true;
            }
            this.f6896g = z9;
            appendable.append(charSequence, i8, i9);
            return this;
        }
    }

    public r(String str) {
        this(str, Collections.emptyList());
    }

    public r(String str, List<Throwable> list) {
        this.f6894j = str;
        setStackTrace(f6889k);
        this.f6890f = list;
    }

    public static void a(Throwable th, ArrayList arrayList) {
        if (th instanceof r) {
            for (Throwable a9 : ((r) th).f6890f) {
                a(a9, arrayList);
            }
            return;
        }
        arrayList.add(th);
    }

    public static void b(List<Throwable> list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void c(List<Throwable> list, Appendable appendable) {
        int size = list.size();
        int i8 = 0;
        while (i8 < size) {
            a aVar = (a) appendable;
            aVar.append((CharSequence) "Cause (");
            int i9 = i8 + 1;
            aVar.append((CharSequence) String.valueOf(i9));
            aVar.append(" of ");
            aVar.append(String.valueOf(size));
            aVar.append("): ");
            Throwable th = list.get(i8);
            if (th instanceof r) {
                ((r) th).f(appendable);
            } else {
                d(th, appendable);
            }
            i8 = i9;
        }
    }

    public static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            StringBuilder sb = new StringBuilder("Root cause (");
            int i9 = i8 + 1;
            sb.append(i9);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i("Glide", sb.toString(), (Throwable) arrayList.get(i8));
            i8 = i9;
        }
    }

    public final void f(Appendable appendable) {
        d(this, appendable);
        b(this.f6890f, new a(appendable));
    }

    public final Throwable fillInStackTrace() {
        return this;
    }

    public final String getMessage() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f6894j);
        String str4 = "";
        if (this.f6893i != null) {
            str = ", " + this.f6893i;
        } else {
            str = str4;
        }
        sb.append(str);
        if (this.f6892h != null) {
            str2 = ", " + this.f6892h;
        } else {
            str2 = str4;
        }
        sb.append(str2);
        if (this.f6891g != null) {
            str4 = ", " + this.f6891g;
        }
        sb.append(str4);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            str3 = "\nThere was 1 root cause:";
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            str3 = " root causes:";
        }
        sb.append(str3);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb.append(10);
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public final void printStackTrace() {
        f(System.err);
    }

    public final void printStackTrace(PrintStream printStream) {
        f(printStream);
    }

    public final void printStackTrace(PrintWriter printWriter) {
        f(printWriter);
    }
}
