package y2;

import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import k3.a;
import p2.g;
import p2.i;
import r2.v;
import y2.m;

public final class d implements i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8342a;

    /* renamed from: b  reason: collision with root package name */
    public final h f8343b;

    public /* synthetic */ d(h hVar, int i8) {
        this.f8342a = i8;
        this.f8343b = hVar;
    }

    public final boolean a(Object obj, g gVar) {
        int i8 = this.f8342a;
        h hVar = this.f8343b;
        switch (i8) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                hVar.getClass();
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                hVar.getClass();
                return true;
        }
    }

    public final v b(Object obj, int i8, int i9, g gVar) {
        int i10 = this.f8342a;
        h hVar = this.f8343b;
        switch (i10) {
            case 0:
                AtomicReference<byte[]> atomicReference = a.f5123a;
                a.C0074a aVar = new a.C0074a((ByteBuffer) obj);
                return hVar.a(new m.a(hVar.f8363c, aVar, hVar.f8364d), i8, i9, gVar, h.f8359k);
            default:
                return hVar.a(new m.b((ParcelFileDescriptor) obj, hVar.f8364d, hVar.f8363c), i8, i9, gVar, h.f8359k);
        }
    }
}
