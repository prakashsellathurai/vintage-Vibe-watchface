package d8;

import y7.b0;

public final class i extends g {

    /* renamed from: h  reason: collision with root package name */
    public final Runnable f4153h;

    public i(Runnable runnable, long j8, h hVar) {
        super(j8, hVar);
        this.f4153h = runnable;
    }

    public final void run() {
        try {
            this.f4153h.run();
        } finally {
            this.f4152g.b();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f4153h;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(b0.l(runnable));
        sb.append(", ");
        sb.append(this.f4151f);
        sb.append(", ");
        sb.append(this.f4152g);
        sb.append(']');
        return sb.toString();
    }
}
