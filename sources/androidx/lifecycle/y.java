package androidx.lifecycle;

import l.b;

public class y<T> extends LiveData<T> {
    public void i(T t8) {
        super.i(t8);
    }

    public final void j(T t8) {
        boolean z8;
        synchronized (this.f1405a) {
            z8 = this.f1409f == LiveData.f1404k;
            this.f1409f = t8;
        }
        if (z8) {
            b.j().l(this.f1413j);
        }
    }
}
