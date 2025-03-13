package b8;

import a8.d;
import a8.f;
import q7.k;

public final class i extends d<Integer> implements f<Integer> {
    public i(int i8) {
        tryEmit(Integer.valueOf(i8));
    }

    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.f198m;
            k.b(objArr);
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.f199n + ((long) ((int) ((k() + ((long) this.f201p)) - this.f199n)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }
}
