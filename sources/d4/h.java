package d4;

import d3.l;
import r3.b;

public final class h<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f4041a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final l f4042b = new l(1);

    /* renamed from: c  reason: collision with root package name */
    public boolean f4043c;

    /* renamed from: d  reason: collision with root package name */
    public TResult f4044d;
    public Exception e;

    public final void a() {
        boolean z8;
        Throwable th;
        Exception exc;
        String str;
        boolean z9;
        TResult tresult;
        if (this.f4043c) {
            int i8 = a.f4035f;
            synchronized (this.f4041a) {
                z8 = this.f4043c;
            }
            if (z8) {
                synchronized (this.f4041a) {
                    exc = this.e;
                }
                if (exc != null) {
                    str = "failure";
                } else {
                    synchronized (this.f4041a) {
                        z9 = this.f4043c && this.e == null;
                    }
                    if (z9) {
                        synchronized (this.f4041a) {
                            b.d(this.f4043c, "Task is not yet complete");
                            Exception exc2 = this.e;
                            if (exc2 == null) {
                                tresult = this.f4044d;
                            } else {
                                throw new c(exc2);
                            }
                        }
                        String valueOf = String.valueOf(tresult);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 7);
                        sb.append("result ");
                        sb.append(valueOf);
                        str = sb.toString();
                    } else {
                        str = "unknown issue";
                    }
                }
                String valueOf2 = String.valueOf(str);
                th = new a(valueOf2.length() != 0 ? "Complete with: ".concat(valueOf2) : new String("Complete with: "), exc);
            } else {
                th = new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            throw th;
        }
    }
}
