package c8;

import j7.f;

public final class e extends RuntimeException {

    /* renamed from: f  reason: collision with root package name */
    public final transient f f2838f;

    public e(f fVar) {
        this.f2838f = fVar;
    }

    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final String getLocalizedMessage() {
        return this.f2838f.toString();
    }
}
