package b8;

import a8.f;
import b8.b;
import h7.h;
import j7.d;
import java.util.Arrays;
import q7.k;

public abstract class a<S extends b<?>> {

    /* renamed from: f  reason: collision with root package name */
    public S[] f2615f;

    /* renamed from: g  reason: collision with root package name */
    public int f2616g;

    /* renamed from: h  reason: collision with root package name */
    public int f2617h;

    /* renamed from: i  reason: collision with root package name */
    public i f2618i;

    public final S a() {
        S s8;
        i iVar;
        synchronized (this) {
            S[] sArr = this.f2615f;
            if (sArr == null) {
                sArr = c();
                this.f2615f = sArr;
            } else if (this.f2616g >= sArr.length) {
                S[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                k.d(copyOf, "copyOf(this, newSize)");
                this.f2615f = (b[]) copyOf;
                sArr = (b[]) copyOf;
            }
            int i8 = this.f2617h;
            do {
                s8 = sArr[i8];
                if (s8 == null) {
                    s8 = b();
                    sArr[i8] = s8;
                }
                i8++;
                if (i8 >= sArr.length) {
                    i8 = 0;
                }
                k.c(s8, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            } while (!s8.a(this));
            this.f2617h = i8;
            this.f2616g++;
            iVar = this.f2618i;
        }
        if (iVar != null) {
            synchronized (iVar) {
                Object[] objArr = iVar.f198m;
                k.b(objArr);
                iVar.tryEmit(Integer.valueOf(((Number) objArr[((int) ((iVar.f199n + ((long) ((int) ((iVar.k() + ((long) iVar.f201p)) - iVar.f199n)))) - 1)) & (objArr.length - 1)]).intValue() + 1));
            }
        }
        return s8;
    }

    public abstract S b();

    public abstract b[] c();

    public final void d(S s8) {
        i iVar;
        int i8;
        d[] b9;
        synchronized (this) {
            int i9 = this.f2616g - 1;
            this.f2616g = i9;
            iVar = this.f2618i;
            if (i9 == 0) {
                this.f2617h = 0;
            }
            k.c(s8, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            b9 = s8.b(this);
        }
        for (d dVar : b9) {
            if (dVar != null) {
                dVar.i(h.f4787a);
            }
        }
        if (iVar != null) {
            synchronized (iVar) {
                Object[] objArr = iVar.f198m;
                k.b(objArr);
                iVar.tryEmit(Integer.valueOf(((Number) objArr[((int) ((iVar.f199n + ((long) ((int) ((iVar.k() + ((long) iVar.f201p)) - iVar.f199n)))) - 1)) & (objArr.length - 1)]).intValue() - 1));
            }
        }
    }

    public final f<Integer> getSubscriptionCount() {
        i iVar;
        synchronized (this) {
            iVar = this.f2618i;
            if (iVar == null) {
                iVar = new i(this.f2616g);
                this.f2618i = iVar;
            }
        }
        return iVar;
    }
}
