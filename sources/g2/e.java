package g2;

import e2.a;
import e2.d;
import f2.b;
import java.util.List;
import java.util.Locale;
import s.c;
import y1.f;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final List<b> f4530a;

    /* renamed from: b  reason: collision with root package name */
    public final f f4531b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4532c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4533d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final long f4534f;

    /* renamed from: g  reason: collision with root package name */
    public final String f4535g;

    /* renamed from: h  reason: collision with root package name */
    public final List<f2.f> f4536h;

    /* renamed from: i  reason: collision with root package name */
    public final d f4537i;

    /* renamed from: j  reason: collision with root package name */
    public final int f4538j;

    /* renamed from: k  reason: collision with root package name */
    public final int f4539k;

    /* renamed from: l  reason: collision with root package name */
    public final int f4540l;

    /* renamed from: m  reason: collision with root package name */
    public final float f4541m;

    /* renamed from: n  reason: collision with root package name */
    public final float f4542n;

    /* renamed from: o  reason: collision with root package name */
    public final int f4543o;

    /* renamed from: p  reason: collision with root package name */
    public final int f4544p;

    /* renamed from: q  reason: collision with root package name */
    public final a f4545q;
    public final c r;

    /* renamed from: s  reason: collision with root package name */
    public final e2.b f4546s;

    /* renamed from: t  reason: collision with root package name */
    public final List<l2.a<Float>> f4547t;

    /* renamed from: u  reason: collision with root package name */
    public final int f4548u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f4549v;

    /* JADX WARNING: type inference failed for: r1v4, types: [int] */
    /* JADX WARNING: type inference failed for: r1v19, types: [int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e(java.util.List<f2.b> r4, y1.f r5, java.lang.String r6, long r7, java.lang.Object r9, long r10, java.lang.String r12, java.util.List<f2.f> r13, e2.d r14, int r15, int r16, int r17, float r18, float r19, int r20, int r21, e2.a r22, s.c r23, java.util.List<l2.a<java.lang.Float>> r24, java.lang.Object r25, e2.b r26, boolean r27) {
        /*
            r3 = this;
            r0 = r3
            r3.<init>()
            r1 = r4
            r0.f4530a = r1
            r1 = r5
            r0.f4531b = r1
            r1 = r6
            r0.f4532c = r1
            r1 = r7
            r0.f4533d = r1
            r1 = r9
            r0.e = r1
            r1 = r10
            r0.f4534f = r1
            r1 = r12
            r0.f4535g = r1
            r1 = r13
            r0.f4536h = r1
            r1 = r14
            r0.f4537i = r1
            r1 = r15
            r0.f4538j = r1
            r1 = r16
            r0.f4539k = r1
            r1 = r17
            r0.f4540l = r1
            r1 = r18
            r0.f4541m = r1
            r1 = r19
            r0.f4542n = r1
            r1 = r20
            r0.f4543o = r1
            r1 = r21
            r0.f4544p = r1
            r1 = r22
            r0.f4545q = r1
            r1 = r23
            r0.r = r1
            r1 = r24
            r0.f4547t = r1
            r1 = r25
            r0.f4548u = r1
            r1 = r26
            r0.f4546s = r1
            r1 = r27
            r0.f4549v = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.e.<init>(java.util.List, y1.f, java.lang.String, long, int, long, java.lang.String, java.util.List, e2.d, int, int, int, float, float, int, int, e2.a, s.c, java.util.List, int, e2.b, boolean):void");
    }

    public final String a(String str) {
        int i8;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.f4532c);
        sb.append("\n");
        long j8 = this.f4534f;
        f fVar = this.f4531b;
        e d9 = fVar.d(j8);
        if (d9 != null) {
            String str2 = "\t\tParents: ";
            while (true) {
                sb.append(str2);
                sb.append(d9.f4532c);
                d9 = fVar.d(d9.f4534f);
                if (d9 == null) {
                    break;
                }
                str2 = "->";
            }
            sb.append(str);
            sb.append("\n");
        }
        List<f2.f> list = this.f4536h;
        if (!list.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(list.size());
            sb.append("\n");
        }
        int i9 = this.f4538j;
        if (!(i9 == 0 || (i8 = this.f4539k) == 0)) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", new Object[]{Integer.valueOf(i9), Integer.valueOf(i8), Integer.valueOf(this.f4540l)}));
        }
        List<b> list2 = this.f4530a;
        if (!list2.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (b next : list2) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(next);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return a("");
    }
}
