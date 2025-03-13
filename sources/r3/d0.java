package r3;

import android.os.Bundle;
import o3.a;

public abstract class d0 extends j0<Boolean> {

    /* renamed from: d  reason: collision with root package name */
    public final int f6964d;
    public final Bundle e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c f6965f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d0(c cVar, int i8, Bundle bundle) {
        super(cVar, Boolean.TRUE);
        this.f6965f = cVar;
        this.f6964d = i8;
        this.e = bundle;
    }

    public final void a() {
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void b() {
        /*
            r4 = this;
            r0 = 1
            r3.c r1 = r4.f6965f
            r2 = 0
            int r3 = r4.f6964d
            if (r3 != 0) goto L_0x0019
            boolean r3 = r4.c()
            if (r3 != 0) goto L_0x0031
            r1.z(r0, r2)
            o3.a r0 = new o3.a
            r1 = 8
            r0.<init>(r1, r2)
            goto L_0x002e
        L_0x0019:
            r1.z(r0, r2)
            android.os.Bundle r0 = r4.e
            if (r0 == 0) goto L_0x0029
            java.lang.String r1 = "pendingIntent"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            r2 = r0
            android.app.PendingIntent r2 = (android.app.PendingIntent) r2
        L_0x0029:
            o3.a r0 = new o3.a
            r0.<init>(r3, r2)
        L_0x002e:
            r4.d(r0)
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.d0.b():void");
    }

    public abstract boolean c();

    public abstract void d(a aVar);
}
