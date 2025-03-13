package n1;

import a8.g;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.support.wearable.complications.ComplicationData;
import h7.f;
import i7.i;
import java.time.Instant;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import n1.t0;
import q1.d;
import q1.e;
import q1.n;
import q7.k;

public final class h {
    public static final RectF G = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
    public static final n H = new n();
    public boolean A;
    public q1.b B;
    public b C;
    public final g D;
    public q1.b E;
    public List<ComplicationData> F;

    /* renamed from: a  reason: collision with root package name */
    public final int f5561a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5562b;

    /* renamed from: c  reason: collision with root package name */
    public final f f5563c;

    /* renamed from: d  reason: collision with root package name */
    public final List<d> f5564d;
    public final boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f5565f;

    /* renamed from: g  reason: collision with root package name */
    public final p f5566g;

    /* renamed from: h  reason: collision with root package name */
    public final a f5567h;

    /* renamed from: i  reason: collision with root package name */
    public l f5568i;

    /* renamed from: j  reason: collision with root package name */
    public final Bundle f5569j;

    /* renamed from: k  reason: collision with root package name */
    public final f f5570k = a1.a.z(new j(this));

    /* renamed from: l  reason: collision with root package name */
    public Instant f5571l = Instant.EPOCH;

    /* renamed from: m  reason: collision with root package name */
    public final c f5572m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f5573n;

    /* renamed from: o  reason: collision with root package name */
    public p1.f f5574o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5575p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f5576q;
    public boolean r;

    /* renamed from: s  reason: collision with root package name */
    public final p1.g f5577s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f5578t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f5579u;

    /* renamed from: v  reason: collision with root package name */
    public int f5580v;
    public boolean w;

    /* renamed from: x  reason: collision with root package name */
    public Integer f5581x;
    public boolean y;

    /* renamed from: z  reason: collision with root package name */
    public Integer f5582z;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final q1.b f5583a;

        /* renamed from: b  reason: collision with root package name */
        public final Instant f5584b;

        public a(q1.b bVar, Instant instant) {
            this.f5583a = bVar;
            this.f5584b = instant;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final p1.a f5585a;

        /* renamed from: b  reason: collision with root package name */
        public final p1.a f5586b;

        public b(p1.a aVar, p1.a aVar2) {
            this.f5585a = aVar;
            this.f5586b = aVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return k.a(this.f5585a, bVar.f5585a) && k.a(this.f5586b, bVar.f5586b);
        }

        public final int hashCode() {
            int i8 = 0;
            p1.a aVar = this.f5585a;
            int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            p1.a aVar2 = this.f5586b;
            if (aVar2 != null) {
                i8 = aVar2.hashCode();
            }
            return hashCode + i8;
        }

        public final String toString() {
            return "FrozenDataSourceForEdit(from=" + this.f5585a + ", to=" + this.f5586b + ')';
        }
    }

    public static final class c implements Iterable<a> {

        /* renamed from: f  reason: collision with root package name */
        public final a[] f5587f = new a[50];

        /* renamed from: g  reason: collision with root package name */
        public int f5588g;

        /* renamed from: h  reason: collision with root package name */
        public int f5589h;

        public static final class a implements Iterator<a> {

            /* renamed from: f  reason: collision with root package name */
            public int f5590f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ c f5591g;

            public a(c cVar) {
                this.f5591g = cVar;
                this.f5590f = cVar.f5588g;
            }

            public final boolean hasNext() {
                return this.f5590f != this.f5591g.f5589h;
            }

            public final Object next() {
                c cVar = this.f5591g;
                cVar.getClass();
                int i8 = (this.f5590f + 1) % 50;
                this.f5590f = i8;
                a aVar = cVar.f5587f[i8];
                k.b(aVar);
                return aVar;
            }

            public final void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        public final Iterator<a> iterator() {
            return new a(this);
        }
    }

    public h(int i8, int i9, int i10, p1.f fVar, f fVar2, List list, p1.g gVar, d dVar, boolean z8, Bundle bundle, boolean z9, p pVar, a aVar) {
        k.e(fVar, "bounds");
        k.e(fVar2, "canvasComplicationFactory");
        k.e(list, "supportedTypes");
        k.e(gVar, "defaultPolicy");
        k.e(dVar, "defaultDataSourceType");
        k.e(bundle, "configExtras");
        k.e(pVar, "tapFilter");
        this.f5561a = i8;
        this.f5562b = i10;
        this.f5563c = fVar2;
        this.f5564d = list;
        this.e = z8;
        this.f5565f = z9;
        this.f5566g = pVar;
        this.f5567h = aVar;
        this.f5569j = bundle;
        this.f5572m = Build.TYPE.equals("userdebug") ? new c() : null;
        boolean z10 = false;
        if (i8 >= 0) {
            if (i9 >= 0 ? true : z10) {
                this.f5573n = true;
                this.f5574o = fVar;
                this.f5575p = true;
                this.f5576q = z8;
                this.r = true;
                this.f5577s = gVar;
                this.f5578t = true;
                this.f5579u = true;
                this.f5580v = i9;
                this.w = true;
                this.f5581x = null;
                this.y = true;
                this.f5582z = null;
                this.A = true;
                n nVar = new n();
                this.B = nVar;
                this.D = a1.a.c(nVar);
                this.E = new n();
                return;
            }
            throw new IllegalArgumentException("accessibilityTraversalIndex must be >= 0".toString());
        }
        throw new IllegalArgumentException("id must be >= 0".toString());
    }

    public final Rect a(Rect rect, d dVar, boolean z8) {
        k.e(rect, "screen");
        k.e(dVar, "complicationType");
        RectF rectF = this.f5574o.f6279a.get(dVar);
        k.b(rectF);
        RectF rectF2 = new RectF(rectF);
        if (z8) {
            RectF rectF3 = this.f5574o.f6280b.get(dVar);
            k.b(rectF3);
            RectF rectF4 = rectF3;
            rectF2.set(rectF2.left - rectF4.left, rectF2.top - rectF4.top, rectF2.right + rectF4.right, rectF2.bottom + rectF4.bottom);
        }
        rectF2.intersect(G);
        return new Rect((int) ((rectF2.left * ((float) rect.width())) + 0.5f), (int) ((rectF2.top * ((float) rect.height())) + 0.5f), (int) ((rectF2.right * ((float) rect.width())) + 0.5f), (int) ((rectF2.bottom * ((float) rect.height())) + 0.5f));
    }

    public final Rect b(Rect rect, boolean z8) {
        k.e(rect, "screen");
        return a(rect, ((q1.b) this.D.getValue()).f6418a, z8);
    }

    public final e c() {
        return (e) this.f5570k.getValue();
    }

    public final void d(t0.c.i iVar, boolean z8) {
        if (z8) {
            this.E = new q1.h();
            this.B = new q1.h();
            g gVar = this.D;
            k.c(gVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableStateFlow<androidx.wear.watchface.complications.data.ComplicationData>");
            gVar.setValue(new q1.h());
        }
    }

    public final void e(q1.b bVar, boolean z8) {
        c().c(bVar, z8);
        g gVar = this.D;
        k.c(gVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableStateFlow<androidx.wear.watchface.complications.data.ComplicationData>");
        gVar.setValue(bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.a(h.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        k.c(obj, "null cannot be cast to non-null type androidx.wear.watchface.ComplicationSlot");
        h hVar = (h) obj;
        if (this.f5561a != hVar.f5561a || this.f5580v != hVar.f5580v || this.f5562b != hVar.f5562b || !k.a(this.f5574o, hVar.f5574o)) {
            return false;
        }
        List<d> list = this.f5564d;
        int size = list.size();
        List<d> list2 = hVar.f5564d;
        return size == list2.size() && list.containsAll(list2) && k.a(this.f5577s, hVar.f5577s) && this.e == hVar.e && this.f5565f == hVar.f5565f && k.a(this.f5581x, hVar.f5581x) && k.a(this.f5582z, hVar.f5582z) && k.a(this.f5567h, hVar.f5567h);
    }

    public final void f(Instant instant, boolean z8, boolean z9) {
        k.e(instant, "instant");
        long epochSecond = instant.getEpochSecond();
        q1.b bVar = this.E;
        List<ComplicationData> list = this.F;
        if (list != null) {
            long j8 = Long.MAX_VALUE;
            for (ComplicationData next : list) {
                Long timelineStartEpochSecond = next.getTimelineStartEpochSecond();
                Long timelineEndEpochSecond = next.getTimelineEndEpochSecond();
                if (timelineStartEpochSecond != null && timelineEndEpochSecond != null && epochSecond >= timelineStartEpochSecond.longValue() && epochSecond < timelineEndEpochSecond.longValue()) {
                    long longValue = timelineEndEpochSecond.longValue() - timelineStartEpochSecond.longValue();
                    if (longValue < j8) {
                        bVar = e.i(next, false);
                        j8 = longValue;
                    }
                }
            }
        }
        if ((bVar.f6423g & 1) != 0) {
            l lVar = this.f5568i;
            if (lVar != null) {
                j1 j1Var = lVar.f5652b;
                if (j1Var == null) {
                    k.h("watchState");
                    throw null;
                } else if (j1Var.f5641l.getValue().booleanValue()) {
                    bVar = H;
                }
            } else {
                k.h("complicationSlotsManager");
                throw null;
            }
        }
        if (z8 || !k.a(this.B, bVar)) {
            if (!(this.C != null) || z9) {
                e(bVar, !z9);
            } else {
                e(new q1.h(), false);
            }
            this.B = bVar;
            if (!z8) {
                this.A = true;
            }
        }
    }

    public final void g(int i8) {
        if (!(i8 >= 0)) {
            throw new IllegalArgumentException("accessibilityTraversalIndex must be >= 0".toString());
        } else if (this.f5580v != i8) {
            this.f5580v = i8;
            this.f5579u = true;
        }
    }

    public final void h(q1.b bVar, Instant instant) {
        c cVar = this.f5572m;
        if (cVar != null) {
            a aVar = new a(bVar, instant);
            int i8 = (cVar.f5589h + 1) % 50;
            cVar.f5589h = i8;
            int i9 = cVar.f5588g;
            if (i8 == i9) {
                cVar.f5588g = (i9 + 1) % 50;
            }
            cVar.f5587f[i8] = aVar;
        }
        k(bVar, instant);
        f(instant, true, false);
    }

    public final int hashCode() {
        List<T> list;
        Object[] objArr = new Object[11];
        objArr[0] = Integer.valueOf(this.f5561a);
        objArr[1] = Integer.valueOf(this.f5580v);
        objArr[2] = Integer.valueOf(this.f5562b);
        objArr[3] = this.f5574o;
        List<d> list2 = this.f5564d;
        k.e(list2, "<this>");
        if (list2.size() <= 1) {
            list = i.c0(list2);
        } else {
            Object[] array = list2.toArray(new Comparable[0]);
            Comparable[] comparableArr = (Comparable[]) array;
            k.e(comparableArr, "<this>");
            if (comparableArr.length > 1) {
                Arrays.sort(comparableArr);
            }
            list = i7.f.L(array);
        }
        objArr[4] = list;
        objArr[5] = this.f5577s;
        objArr[6] = Boolean.valueOf(this.e);
        objArr[7] = Boolean.valueOf(this.f5565f);
        objArr[8] = this.f5581x;
        objArr[9] = this.f5582z;
        objArr[10] = this.f5567h;
        return Objects.hash(objArr);
    }

    public final void i(p1.f fVar) {
        k.e(fVar, "value");
        if (!(this.f5562b != 1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!k.a(this.f5574o, fVar)) {
            this.f5574o = fVar;
            this.f5573n = true;
        }
    }

    public final void j(Integer num) {
        if (!(num == null || num.intValue() != 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!k.a(this.f5581x, num)) {
            this.f5581x = num;
            this.w = true;
        }
    }

    public final void k(q1.b bVar, Instant instant) {
        this.f5571l = instant;
        this.E = bVar;
        List<ComplicationData> timelineEntries = bVar.a().getTimelineEntries();
        this.F = timelineEntries != null ? i.c0(timelineEntries) : null;
    }
}
