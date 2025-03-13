package r1;

import androidx.wear.watchface.style.data.UserStyleWireFormat;
import j7.d;
import l7.e;
import l7.h;
import p7.l;

@e(c = "androidx.wear.watchface.control.InteractiveWatchFaceImpl$updateWatchfaceInstance$1$1", f = "InteractiveWatchFaceImpl.kt", l = {227}, m = "invokeSuspend")
public final class g0 extends h implements l<d<? super h7.h>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public int f6704j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ h0 f6705k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ String f6706l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ UserStyleWireFormat f6707m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, String str, UserStyleWireFormat userStyleWireFormat, d<? super g0> dVar) {
        super(1, dVar);
        this.f6705k = h0Var;
        this.f6706l = str;
        this.f6707m = userStyleWireFormat;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(java.lang.Object r6) {
        /*
            r5 = this;
            k7.a r0 = k7.a.f5217f
            int r1 = r5.f6704j
            r2 = 1
            java.lang.String r3 = r5.f6706l
            r1.h0 r4 = r5.f6705k
            if (r1 == 0) goto L_0x0019
            if (r1 != r2) goto L_0x0011
            a1.a.I(r6)
            goto L_0x0031
        L_0x0011:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0019:
            a1.a.I(r6)
            java.lang.String r6 = r4.f6709b
            boolean r6 = q7.k.a(r6, r3)
            if (r6 != 0) goto L_0x003b
            n1.t0$c r6 = r4.f6708a
            if (r6 == 0) goto L_0x0031
            r5.f6704j = r2
            java.lang.Object r6 = r6.I(r3, r5)
            if (r6 != r0) goto L_0x0031
            return r0
        L_0x0031:
            r4.getClass()
            java.lang.String r6 = "<set-?>"
            q7.k.e(r3, r6)
            r4.f6709b = r3
        L_0x003b:
            n1.t0$c r6 = r4.f6708a
            if (r6 == 0) goto L_0x0044
            androidx.wear.watchface.style.data.UserStyleWireFormat r5 = r5.f6707m
            r6.G(r5)
        L_0x0044:
            h7.h r5 = h7.h.f4787a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.g0.h(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(Object obj) {
        return new g0(this.f6705k, this.f6706l, this.f6707m, (d) obj).h(h7.h.f4787a);
    }
}
