package z6;

import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicReference;
import k6.j;
import z6.b;

public final /* synthetic */ class a implements j.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8703a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f8704b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f8705c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b f8706d;

    public /* synthetic */ a(b bVar, AtomicReference atomicReference, long j8, int i8) {
        this.f8703a = i8;
        this.f8706d = bVar;
        this.f8704b = atomicReference;
        this.f8705c = j8;
    }

    public final void a(Bitmap bitmap) {
        int i8 = this.f8703a;
        AtomicReference atomicReference = this.f8704b;
        long j8 = this.f8705c;
        b bVar = this.f8706d;
        switch (i8) {
            case 0:
                bVar.getClass();
                if (bitmap != null) {
                    atomicReference.set(new b.a(bitmap, j8));
                    b.a aVar = bVar.f8710g;
                    b.a aVar2 = (b.a) atomicReference.get();
                    if (aVar.f8712b < aVar2.f8712b) {
                        aVar = aVar2;
                    }
                    bVar.f8710g = aVar;
                    bVar.d();
                    Runnable runnable = bVar.f8709f;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                d dVar = (d) bVar;
                dVar.getClass();
                if (bitmap != null) {
                    atomicReference.set(new b.a(bitmap, j8));
                    b.a aVar3 = dVar.f8710g;
                    b.a aVar4 = (b.a) atomicReference.get();
                    if (aVar3.f8712b < aVar4.f8712b) {
                        aVar3 = aVar4;
                    }
                    dVar.f8710g = aVar3;
                    dVar.d();
                    Runnable runnable2 = dVar.f8709f;
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                e eVar = (e) bVar;
                eVar.getClass();
                if (bitmap != null) {
                    atomicReference.set(new b.a(bitmap, j8));
                    b.a aVar5 = eVar.f8710g;
                    b.a aVar6 = (b.a) atomicReference.get();
                    if (aVar5.f8712b < aVar6.f8712b) {
                        aVar5 = aVar6;
                    }
                    eVar.f8710g = aVar5;
                    eVar.d();
                    Runnable runnable3 = eVar.f8709f;
                    if (runnable3 != null) {
                        runnable3.run();
                        return;
                    }
                    return;
                }
                return;
            default:
                f fVar = (f) bVar;
                fVar.getClass();
                if (bitmap != null) {
                    atomicReference.set(new b.a(bitmap, j8));
                    b.a aVar7 = fVar.f8710g;
                    b.a aVar8 = (b.a) atomicReference.get();
                    if (aVar7.f8712b < aVar8.f8712b) {
                        aVar7 = aVar8;
                    }
                    fVar.f8710g = aVar7;
                    fVar.d();
                    Runnable runnable4 = fVar.f8709f;
                    if (runnable4 != null) {
                        runnable4.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
