package e7;

import java.util.function.Consumer;

public final /* synthetic */ class j implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4288a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f4289b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f4290c;

    public /* synthetic */ j(k kVar, boolean z8, int i8) {
        this.f4288a = i8;
        this.f4289b = kVar;
        this.f4290c = z8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r4.f4294f == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.f4288a
            r1 = 1
            boolean r2 = r9.f4290c
            e7.k r4 = r9.f4289b
            switch(r0) {
                case 0: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x001c
        L_0x000b:
            e7.h r10 = (e7.h) r10
            if (r2 == 0) goto L_0x0014
            boolean r9 = r4.f4294f
            if (r9 != 0) goto L_0x0017
            goto L_0x0018
        L_0x0014:
            r4.getClass()
        L_0x0017:
            r1 = 0
        L_0x0018:
            r10.p(r1)
            return
        L_0x001c:
            e7.b r10 = (e7.b) r10
            java.util.ArrayList r9 = r4.f4291b
            java.util.stream.Stream r9 = r9.stream()
            e6.a r0 = new e6.a
            r3 = 2
            r0.<init>(r3, r10)
            java.util.stream.Stream r9 = r9.filter(r0)
            java.util.Optional r7 = r9.findAny()
            if (r2 == 0) goto L_0x005f
            r10.f4279g = r4
            r5.f r9 = new r5.f
            r0 = 24
            r9.<init>(r0, r4)
            r7.ifPresent(r9)
            e7.c r9 = r10.f4279g
            e7.i$a r0 = r10.f4280h
            w5.f r9 = r9.a(r0)
            r10.f4264n = r9
            p6.c r9 = r10.f6332b
            r9.h(r1)
            r10.f4282j = r1
            com.samsung.android.wearable.watchfacestudio.editor.n r9 = new com.samsung.android.wearable.watchfacestudio.editor.n
            r9.<init>(r3)
            r10.f4267q = r9
            i0.a<java.lang.Void> r9 = r10.f4265o
            r10 = 0
            r9.accept(r10)
            goto L_0x00b8
        L_0x005f:
            boolean r9 = r7.isPresent()
            r0 = 17
            if (r9 == 0) goto L_0x0090
            java.lang.Object r9 = r7.get()
            r6 = r9
            e7.h r6 = (e7.h) r6
            z5.b r9 = r6.f4281i
            w5.f r9 = r9.b()
            k6.e r2 = new k6.e
            r8 = 3
            r3 = r2
            r5 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            p6.c r3 = r10.f6332b
            r3.h(r1)
            r10.f4282j = r1
            b0.c r1 = new b0.c
            r1.<init>(r10, r0, r2)
            r10.f4267q = r1
            i0.a<w5.f> r10 = r10.f4266p
            r10.accept(r9)
            goto L_0x00b8
        L_0x0090:
            b0.c r9 = new b0.c
            r2 = 18
            r9.<init>(r4, r2, r10)
            w5.f r2 = r10.f4264n
            w5.f r3 = w5.f.f8063k
            if (r2 != r3) goto L_0x00a5
            e7.c r2 = r10.f4279g
            e7.i$a r3 = r10.f4280h
            w5.f r2 = r2.a(r3)
        L_0x00a5:
            p6.c r3 = r10.f6332b
            r3.h(r1)
            r10.f4282j = r1
            b0.c r1 = new b0.c
            r1.<init>(r10, r0, r9)
            r10.f4267q = r1
            i0.a<w5.f> r9 = r10.f4266p
            r9.accept(r2)
        L_0x00b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.j.accept(java.lang.Object):void");
    }
}
