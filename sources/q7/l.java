package q7;

import java.io.Serializable;

public abstract class l<R> implements h<R>, Serializable {
    private final int arity;

    public l(int i8) {
        this.arity = i8;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        q.f6644a.getClass();
        String a9 = r.a(this);
        k.d(a9, "renderLambdaToString(this)");
        return a9;
    }
}
