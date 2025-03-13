package n1;

import h7.i;
import i7.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p1.g;
import q1.d;
import q7.k;
import u1.j;
import u1.l;

public final class k1 {

    /* renamed from: a  reason: collision with root package name */
    public final l f5645a;

    /* renamed from: b  reason: collision with root package name */
    public final List<a> f5646b;

    /* renamed from: c  reason: collision with root package name */
    public final j f5647c;

    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final i f5648b;

        /* renamed from: a  reason: collision with root package name */
        public final List<d> f5649a;

        /* renamed from: n1.k1$a$a  reason: collision with other inner class name */
        public static final class C0089a extends q7.l implements p7.a<Map<String, ? extends d>> {

            /* renamed from: f  reason: collision with root package name */
            public static final C0089a f5650f = new C0089a();

            public C0089a() {
                super(0);
            }

            public final Object invoke() {
                return f.O(new h7.d("SHORT_TEXT", d.SHORT_TEXT), new h7.d("LONG_TEXT", d.LONG_TEXT), new h7.d("RANGED_VALUE", d.RANGED_VALUE), new h7.d("MONOCHROMATIC_IMAGE", d.MONOCHROMATIC_IMAGE), new h7.d("SMALL_IMAGE", d.SMALL_IMAGE), new h7.d("PHOTO_IMAGE", d.PHOTO_IMAGE), new h7.d("GOAL_PROGRESS", d.GOAL_PROGRESS), new h7.d("WEIGHTED_ELEMENTS", d.WEIGHTED_ELEMENTS));
            }
        }

        static {
            C0089a aVar = C0089a.f5650f;
            k.e(aVar, "initializer");
            f5648b = new i(aVar);
        }

        public a(int i8, Integer num, int i9, p1.f fVar, ArrayList arrayList, g gVar, boolean z8, boolean z9, Integer num2, Integer num3, a aVar) {
            k.e(fVar, "bounds");
            this.f5649a = arrayList;
        }
    }

    public k1(l lVar, List<a> list, j jVar) {
        this.f5645a = lVar;
        this.f5646b = list;
        this.f5647c = jVar;
    }
}
