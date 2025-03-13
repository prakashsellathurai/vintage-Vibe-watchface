package y7;

public final class q1 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<q0> f8598a = new ThreadLocal<>();

    public static q0 a() {
        ThreadLocal<q0> threadLocal = f8598a;
        q0 q0Var = threadLocal.get();
        if (q0Var != null) {
            return q0Var;
        }
        d dVar = new d(Thread.currentThread());
        threadLocal.set(dVar);
        return dVar;
    }
}
