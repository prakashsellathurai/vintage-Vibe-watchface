package y7;

import java.util.concurrent.CancellationException;
import q7.k;

public final class a1 extends CancellationException {

    /* renamed from: f  reason: collision with root package name */
    public final transient z0 f8545f;

    public a1(String str, Throwable th, z0 z0Var) {
        super(str);
        this.f8545f = z0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a1) {
                a1 a1Var = (a1) obj;
                if (!k.a(a1Var.getMessage(), getMessage()) || !k.a(a1Var.f8545f, this.f8545f) || !k.a(a1Var.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        k.b(message);
        int hashCode = ((message.hashCode() * 31) + this.f8545f.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    public final String toString() {
        return super.toString() + "; job=" + this.f8545f;
    }
}
