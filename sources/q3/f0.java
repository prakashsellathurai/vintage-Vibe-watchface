package q3;

import android.os.Parcel;
import d4.d;
import d4.h;
import o3.c;
import p3.a;
import q3.j;
import r3.o;
import r3.p;

public final class f0 extends j {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j.a f6558c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f0(j.a aVar, c[] cVarArr, boolean z8) {
        super(cVarArr, z8);
        this.f6558c = aVar;
    }

    /* JADX INFO: finally extract failed */
    public final void a(a.e eVar, d dVar) {
        o oVar = (o) this.f6558c.f6566a.f4745b;
        a<p> aVar = t3.c.f7490i;
        t3.a aVar2 = (t3.a) ((t3.d) eVar).v();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(aVar2.f8403b);
        int i8 = y3.c.f8405a;
        if (oVar == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            oVar.writeToParcel(obtain, 0);
        }
        try {
            aVar2.f8402a.transact(1, obtain, (Parcel) null, 1);
            obtain.recycle();
            h<TResult> hVar = dVar.f4036a;
            synchronized (hVar.f4041a) {
                hVar.a();
                hVar.f4043c = true;
                hVar.f4044d = null;
            }
            hVar.f4042b.d(hVar);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }
}
