package n1;

import i7.l;
import java.util.Map;
import java.util.Set;
import q7.k;
import u1.m;
import u1.s;

public final class z {

    /* renamed from: f  reason: collision with root package name */
    public static final z f5890f = new z(s.f5711f, s.f7715f, (a) null, l.f4880f);

    /* renamed from: a  reason: collision with root package name */
    public final s f5891a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<s> f5892b;

    /* renamed from: c  reason: collision with root package name */
    public final a f5893c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<Integer, h0> f5894d;
    public boolean e;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final b f5895a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5896b;

        /* renamed from: c  reason: collision with root package name */
        public final int f5897c;

        public a(b bVar, int i8, int i9) {
            k.e(bVar, "highlightedElement");
            this.f5895a = bVar;
            this.f5896b = i8;
            this.f5897c = i9;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!k.a(a.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            k.c(obj, "null cannot be cast to non-null type androidx.wear.watchface.RenderParameters.HighlightLayer");
            a aVar = (a) obj;
            return k.a(this.f5895a, aVar.f5895a) && this.f5896b == aVar.f5896b && this.f5897c == aVar.f5897c;
        }

        public final int hashCode() {
            return (((this.f5895a.hashCode() * 31) + this.f5896b) * 31) + this.f5897c;
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f5898a = new a();
        }

        /* renamed from: n1.z$b$b  reason: collision with other inner class name */
        public static final class C0093b extends b {

            /* renamed from: a  reason: collision with root package name */
            public final int f5899a;

            public C0093b(int i8) {
                this.f5899a = i8;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!k.a(C0093b.class, obj != null ? obj.getClass() : null)) {
                    return false;
                }
                k.c(obj, "null cannot be cast to non-null type androidx.wear.watchface.RenderParameters.HighlightedElement.ComplicationSlot");
                return this.f5899a == ((C0093b) obj).f5899a;
            }

            public final int hashCode() {
                return this.f5899a;
            }
        }

        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            public final m.e f5900a;

            public c(m.e eVar) {
                this.f5900a = eVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!k.a(c.class, obj != null ? obj.getClass() : null)) {
                    return false;
                }
                k.c(obj, "null cannot be cast to non-null type androidx.wear.watchface.RenderParameters.HighlightedElement.UserStyle");
                return k.a(this.f5900a, ((c) obj).f5900a);
            }

            public final int hashCode() {
                return this.f5900a.hashCode();
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public z(androidx.wear.watchface.data.RenderParametersWireFormat r12) {
        /*
            r11 = this;
            n1.s[] r0 = n1.s.values()
            int r1 = r12.f2351f
            r0 = r0[r1]
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            u1.s[] r2 = u1.s.values()
            int r3 = r2.length
            r4 = 0
            r5 = r4
        L_0x0014:
            r6 = 1
            if (r4 >= r3) goto L_0x0029
            r7 = r2[r4]
            int r8 = r5 + 1
            int r9 = r12.f2352g
            int r5 = r6 << r5
            r5 = r5 & r9
            if (r5 == 0) goto L_0x0025
            r1.add(r7)
        L_0x0025:
            int r4 = r4 + 1
            r5 = r8
            goto L_0x0014
        L_0x0029:
            h7.h r2 = h7.h.f4787a
            int r2 = r12.f2353h
            if (r2 != 0) goto L_0x0030
            goto L_0x006e
        L_0x0030:
            if (r2 != r6) goto L_0x003e
            n1.z$a r2 = new n1.z$a
            n1.z$b$a r3 = n1.z.b.a.f5898a
            int r4 = r12.f2356k
            int r5 = r12.f2357l
            r2.<init>(r3, r4, r5)
            goto L_0x006f
        L_0x003e:
            r3 = 2
            if (r2 != r3) goto L_0x0052
            n1.z$a r2 = new n1.z$a
            n1.z$b$b r3 = new n1.z$b$b
            int r4 = r12.f2354i
            r3.<init>(r4)
            int r4 = r12.f2356k
            int r5 = r12.f2357l
            r2.<init>(r3, r4, r5)
            goto L_0x006f
        L_0x0052:
            r3 = 3
            if (r2 != r3) goto L_0x006e
            n1.z$a r2 = new n1.z$a
            n1.z$b$c r3 = new n1.z$b$c
            u1.m$e r4 = new u1.m$e
            java.lang.String r5 = r12.f2355j
            q7.k.b(r5)
            r4.<init>(r5)
            r3.<init>(r4)
            int r4 = r12.f2356k
            int r5 = r12.f2357l
            r2.<init>(r3, r4, r5)
            goto L_0x006f
        L_0x006e:
            r2 = 0
        L_0x006f:
            java.util.List<androidx.wear.watchface.data.IdAndTapEventWireFormat> r12 = r12.f2358m
            if (r12 == 0) goto L_0x00b3
            int r3 = i7.f.M(r12)
            int r3 = a1.a.C(r3)
            r4 = 16
            if (r3 >= r4) goto L_0x0080
            r3 = r4
        L_0x0080:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r3)
            java.util.Iterator r12 = r12.iterator()
        L_0x0089:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L_0x00b5
            java.lang.Object r3 = r12.next()
            androidx.wear.watchface.data.IdAndTapEventWireFormat r3 = (androidx.wear.watchface.data.IdAndTapEventWireFormat) r3
            int r5 = r3.f2345f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            n1.h0 r6 = new n1.h0
            int r7 = r3.f2346g
            int r8 = r3.f2347h
            long r9 = r3.f2348i
            java.time.Instant r3 = java.time.Instant.ofEpochMilli(r9)
            java.lang.String r9 = "ofEpochMilli(it.calendarTapTimeMillis)"
            q7.k.d(r3, r9)
            r6.<init>(r7, r8, r3)
            r4.put(r5, r6)
            goto L_0x0089
        L_0x00b3:
            i7.l r4 = i7.l.f4880f
        L_0x00b5:
            r11.<init>(r0, r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.z.<init>(androidx.wear.watchface.data.RenderParametersWireFormat):void");
    }

    public z(s sVar, Set<? extends s> set, a aVar, Map<Integer, h0> map) {
        k.e(sVar, "drawMode");
        k.e(set, "watchFaceLayers");
        k.e(map, "lastComplicationTapDownEvents");
        this.f5891a = sVar;
        this.f5892b = set;
        this.f5893c = aVar;
        this.f5894d = map;
        boolean z8 = true;
        if (!(!set.isEmpty()) && aVar == null) {
            z8 = false;
        }
        if (!z8) {
            throw new IllegalArgumentException("Either watchFaceLayers must be non empty or renderParameters.highlightLayer must be non-null.".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.a(z.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        k.c(obj, "null cannot be cast to non-null type androidx.wear.watchface.RenderParameters");
        z zVar = (z) obj;
        return this.f5891a == zVar.f5891a && k.a(this.f5892b, zVar.f5892b) && k.a(this.f5893c, zVar.f5893c) && k.a(this.f5894d, zVar.f5894d) && this.e == zVar.e;
    }

    public final int hashCode() {
        int hashCode = ((this.f5891a.hashCode() * 31) + this.f5892b.hashCode()) * 31;
        a aVar = this.f5893c;
        return ((((hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.f5894d.hashCode()) * 31) + Boolean.hashCode(this.e);
    }
}
