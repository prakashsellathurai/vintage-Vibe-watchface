package o2;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import k3.a;
import n2.a;
import p2.g;
import p2.i;
import r2.v;

public final class c implements i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6010a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f6011b;

    public /* synthetic */ c(int i8, Object obj) {
        this.f6010a = i8;
        this.f6011b = obj;
    }

    public final boolean a(Object obj, g gVar) {
        switch (this.f6010a) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                ((i) this.f6011b).getClass();
                ((Boolean) gVar.c(i.e)).booleanValue();
                return false;
            default:
                a aVar = (a) obj;
                return true;
        }
    }

    public final v b(Object obj, int i8, int i9, g gVar) {
        int i10 = this.f6010a;
        Object obj2 = this.f6011b;
        switch (i10) {
            case 0:
                AtomicReference<byte[]> atomicReference = k3.a.f5123a;
                return ((i) obj2).a(new a.C0074a((ByteBuffer) obj), i8, i9, gVar);
            default:
                return y2.c.e(((n2.a) obj).c(), (s2.c) obj2);
        }
    }
}
