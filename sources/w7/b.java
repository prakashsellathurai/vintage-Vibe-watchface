package w7;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p7.p;
import q7.k;
import t7.c;
import v7.d;

public final class b implements d<c> {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f8082a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8083b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8084c;

    /* renamed from: d  reason: collision with root package name */
    public final p<CharSequence, Integer, h7.d<Integer, Integer>> f8085d;

    public static final class a implements Iterator<c> {

        /* renamed from: f  reason: collision with root package name */
        public int f8086f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f8087g;

        /* renamed from: h  reason: collision with root package name */
        public int f8088h;

        /* renamed from: i  reason: collision with root package name */
        public c f8089i;

        /* renamed from: j  reason: collision with root package name */
        public int f8090j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ b f8091k;

        public a(b bVar) {
            this.f8091k = bVar;
            int i8 = bVar.f8083b;
            int length = bVar.f8082a.length();
            if (length >= 0) {
                if (i8 < 0) {
                    i8 = 0;
                } else if (i8 > length) {
                    i8 = length;
                }
                this.f8087g = i8;
                this.f8088h = i8;
                return;
            }
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum 0.");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
            if (r6 < r3) goto L_0x001b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r7 = this;
                int r0 = r7.f8088h
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r7.f8086f = r1
                r0 = 0
                r7.f8089i = r0
                goto L_0x0083
            L_0x000c:
                w7.b r2 = r7.f8091k
                int r3 = r2.f8084c
                r4 = -1
                r5 = 1
                if (r3 <= 0) goto L_0x001b
                int r6 = r7.f8090j
                int r6 = r6 + r5
                r7.f8090j = r6
                if (r6 >= r3) goto L_0x0023
            L_0x001b:
                java.lang.CharSequence r3 = r2.f8082a
                int r3 = r3.length()
                if (r0 <= r3) goto L_0x0035
            L_0x0023:
                t7.c r0 = new t7.c
                int r1 = r7.f8087g
                java.lang.CharSequence r2 = r2.f8082a
                int r2 = w7.l.p(r2)
                r0.<init>(r1, r2)
            L_0x0030:
                r7.f8089i = r0
                r7.f8088h = r4
                goto L_0x0081
            L_0x0035:
                p7.p<java.lang.CharSequence, java.lang.Integer, h7.d<java.lang.Integer, java.lang.Integer>> r0 = r2.f8085d
                java.lang.CharSequence r3 = r2.f8082a
                int r6 = r7.f8088h
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.Object r0 = r0.g(r3, r6)
                h7.d r0 = (h7.d) r0
                if (r0 != 0) goto L_0x0055
                t7.c r0 = new t7.c
                int r1 = r7.f8087g
                java.lang.CharSequence r2 = r2.f8082a
                int r2 = w7.l.p(r2)
                r0.<init>(r1, r2)
                goto L_0x0030
            L_0x0055:
                A r2 = r0.f4781f
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                B r0 = r0.f4782g
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r3 = r7.f8087g
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r2 > r4) goto L_0x006e
                t7.c r3 = t7.c.f7541i
                goto L_0x0076
            L_0x006e:
                t7.c r4 = new t7.c
                int r6 = r2 + -1
                r4.<init>(r3, r6)
                r3 = r4
            L_0x0076:
                r7.f8089i = r3
                int r2 = r2 + r0
                r7.f8087g = r2
                if (r0 != 0) goto L_0x007e
                r1 = r5
            L_0x007e:
                int r2 = r2 + r1
                r7.f8088h = r2
            L_0x0081:
                r7.f8086f = r5
            L_0x0083:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w7.b.a.a():void");
        }

        public final boolean hasNext() {
            if (this.f8086f == -1) {
                a();
            }
            return this.f8086f == 1;
        }

        public final Object next() {
            if (this.f8086f == -1) {
                a();
            }
            if (this.f8086f != 0) {
                c cVar = this.f8089i;
                k.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f8089i = null;
                this.f8086f = -1;
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(CharSequence charSequence, int i8, int i9, p<? super CharSequence, ? super Integer, h7.d<Integer, Integer>> pVar) {
        k.e(charSequence, "input");
        this.f8082a = charSequence;
        this.f8083b = i8;
        this.f8084c = i9;
        this.f8085d = pVar;
    }

    public final Iterator<c> iterator() {
        return new a(this);
    }
}
