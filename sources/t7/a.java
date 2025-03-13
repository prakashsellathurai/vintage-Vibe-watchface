package t7;

import java.util.Iterator;

public class a implements Iterable<Integer> {

    /* renamed from: f  reason: collision with root package name */
    public final int f7534f;

    /* renamed from: g  reason: collision with root package name */
    public final int f7535g;

    /* renamed from: h  reason: collision with root package name */
    public final int f7536h;

    public a(int i8, int i9, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i10 != Integer.MIN_VALUE) {
            this.f7534f = i8;
            if (i10 > 0) {
                if (i8 < i9) {
                    int i11 = i9 % i10;
                    int i12 = i8 % i10;
                    int i13 = ((i11 < 0 ? i11 + i10 : i11) - (i12 < 0 ? i12 + i10 : i12)) % i10;
                    i9 -= i13 < 0 ? i13 + i10 : i13;
                }
            } else if (i10 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            } else if (i8 > i9) {
                int i14 = -i10;
                int i15 = i8 % i14;
                int i16 = i9 % i14;
                int i17 = ((i15 < 0 ? i15 + i14 : i15) - (i16 < 0 ? i16 + i14 : i16)) % i14;
                i9 += i17 < 0 ? i17 + i14 : i17;
            }
            this.f7535g = i9;
            this.f7536h = i10;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r3 = (t7.a) r3;
        r0 = r3.f7534f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof t7.a
            if (r0 == 0) goto L_0x0029
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0013
            r0 = r3
            t7.a r0 = (t7.a) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0027
        L_0x0013:
            t7.a r3 = (t7.a) r3
            int r0 = r3.f7534f
            int r1 = r2.f7534f
            if (r1 != r0) goto L_0x0029
            int r0 = r2.f7535g
            int r1 = r3.f7535g
            if (r0 != r1) goto L_0x0029
            int r2 = r2.f7536h
            int r3 = r3.f7536h
            if (r2 != r3) goto L_0x0029
        L_0x0027:
            r2 = 1
            goto L_0x002a
        L_0x0029:
            r2 = 0
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return this.f7536h + (((this.f7534f * 31) + this.f7535g) * 31);
    }

    public boolean isEmpty() {
        int i8 = this.f7536h;
        int i9 = this.f7535g;
        int i10 = this.f7534f;
        if (i8 > 0) {
            if (i10 > i9) {
                return true;
            }
        } else if (i10 < i9) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return new b(this.f7534f, this.f7535g, this.f7536h);
    }

    public String toString() {
        StringBuilder sb;
        int i8 = this.f7535g;
        int i9 = this.f7534f;
        int i10 = this.f7536h;
        if (i10 > 0) {
            sb.append(i9);
            sb.append("..");
            sb.append(i8);
            sb.append(" step ");
        } else {
            sb = new StringBuilder();
            sb.append(i9);
            sb.append(" downTo ");
            sb.append(i8);
            sb.append(" step ");
            i10 = -i10;
        }
        sb.append(i10);
        return sb.toString();
    }
}
