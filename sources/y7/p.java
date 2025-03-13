package y7;

import h7.h;
import java.util.concurrent.CancellationException;
import p7.l;
import q7.k;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final Object f8587a;

    /* renamed from: b  reason: collision with root package name */
    public final e f8588b;

    /* renamed from: c  reason: collision with root package name */
    public final l<Throwable, h> f8589c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f8590d;
    public final Throwable e;

    public p(Object obj, e eVar, l<? super Throwable, h> lVar, Object obj2, Throwable th) {
        this.f8587a = obj;
        this.f8588b = eVar;
        this.f8589c = lVar;
        this.f8590d = obj2;
        this.e = th;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, e eVar, l lVar, CancellationException cancellationException, int i8) {
        this(obj, (i8 & 2) != 0 ? null : eVar, (l<? super Throwable, h>) (i8 & 4) != 0 ? null : lVar, (Object) null, (Throwable) (i8 & 16) != 0 ? null : cancellationException);
    }

    public static p a(p pVar, e eVar, CancellationException cancellationException, int i8) {
        Object obj = null;
        Object obj2 = (i8 & 1) != 0 ? pVar.f8587a : null;
        if ((i8 & 2) != 0) {
            eVar = pVar.f8588b;
        }
        e eVar2 = eVar;
        l<Throwable, h> lVar = (i8 & 4) != 0 ? pVar.f8589c : null;
        if ((i8 & 8) != 0) {
            obj = pVar.f8590d;
        }
        Object obj3 = obj;
        Throwable th = cancellationException;
        if ((i8 & 16) != 0) {
            th = pVar.e;
        }
        pVar.getClass();
        return new p(obj2, eVar2, (l<? super Throwable, h>) lVar, obj3, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return k.a(this.f8587a, pVar.f8587a) && k.a(this.f8588b, pVar.f8588b) && k.a(this.f8589c, pVar.f8589c) && k.a(this.f8590d, pVar.f8590d) && k.a(this.e, pVar.e);
    }

    public final int hashCode() {
        int i8 = 0;
        Object obj = this.f8587a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        e eVar = this.f8588b;
        int hashCode2 = (hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        l<Throwable, h> lVar = this.f8589c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f8590d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        if (th != null) {
            i8 = th.hashCode();
        }
        return hashCode4 + i8;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f8587a + ", cancelHandler=" + this.f8588b + ", onCancellation=" + this.f8589c + ", idempotentResume=" + this.f8590d + ", cancelCause=" + this.e + ')';
    }
}
