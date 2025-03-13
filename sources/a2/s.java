package a2;

import b2.a;
import b2.c;
import f2.o;
import g2.b;
import java.util.ArrayList;
import java.util.List;

public final class s implements c, a.C0028a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f161a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f162b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final int f163c;

    /* renamed from: d  reason: collision with root package name */
    public final c f164d;
    public final c e;

    /* renamed from: f  reason: collision with root package name */
    public final c f165f;

    public s(b bVar, o oVar) {
        oVar.getClass();
        this.f161a = oVar.e;
        this.f163c = oVar.f4373a;
        a<Float, Float> a9 = oVar.f4374b.a();
        this.f164d = (c) a9;
        a<Float, Float> a10 = oVar.f4375c.a();
        this.e = (c) a10;
        a<Float, Float> a11 = oVar.f4376d.a();
        this.f165f = (c) a11;
        bVar.e(a9);
        bVar.e(a10);
        bVar.e(a11);
        a9.a(this);
        a10.a(this);
        a11.a(this);
    }

    public final void b() {
        int i8 = 0;
        while (true) {
            ArrayList arrayList = this.f162b;
            if (i8 < arrayList.size()) {
                ((a.C0028a) arrayList.get(i8)).b();
                i8++;
            } else {
                return;
            }
        }
    }

    public final void c(a.C0028a aVar) {
        this.f162b.add(aVar);
    }

    public final void d(List<c> list, List<c> list2) {
    }
}
