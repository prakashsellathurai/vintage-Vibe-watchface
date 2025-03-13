package k6;

import android.graphics.Bitmap;
import e7.b;
import e7.h;
import e7.k;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import k6.j;
import z6.a;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f5190f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f5191g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f5192h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Object f5193i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f5194j;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, int i8) {
        this.f5190f = i8;
        this.f5191g = obj;
        this.f5192h = obj2;
        this.f5193i = obj3;
        this.f5194j = obj4;
    }

    public final void run() {
        int i8 = this.f5190f;
        Object obj = this.f5194j;
        Object obj2 = this.f5193i;
        Object obj3 = this.f5192h;
        Object obj4 = this.f5191g;
        switch (i8) {
            case 0:
                AtomicReference atomicReference = (AtomicReference) obj2;
                j.a aVar = (j.a) obj;
                ((j) obj4).f((String) obj3, atomicReference);
                if (aVar != null) {
                    ((a) aVar).a((Bitmap) atomicReference.get());
                    return;
                }
                return;
            case 1:
                AtomicReference atomicReference2 = (AtomicReference) obj2;
                j.a aVar2 = (j.a) obj;
                ((j) obj4).f((String) obj3, atomicReference2);
                if (aVar2 != null) {
                    ((a) aVar2).a((Bitmap) atomicReference2.get());
                    return;
                }
                return;
            case 2:
                AtomicReference atomicReference3 = (AtomicReference) obj2;
                j.a aVar3 = (j.a) obj;
                ((j) obj4).f((String) obj3, atomicReference3);
                if (aVar3 != null) {
                    ((a) aVar3).a((Bitmap) atomicReference3.get());
                    return;
                }
                return;
            default:
                k kVar = (k) obj4;
                ((b) obj3).f4279g = kVar.f4295g;
                ((h) obj2).f4279g = kVar;
                h hVar = (h) ((Optional) obj).get();
                hVar.f4282j = true;
                hVar.p(true);
                return;
        }
    }
}
