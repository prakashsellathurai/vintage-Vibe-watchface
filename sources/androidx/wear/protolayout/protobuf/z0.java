package androidx.wear.protolayout.protobuf;

public final class z0 implements m0 {

    /* renamed from: a  reason: collision with root package name */
    public final o0 f2232a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2233b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f2234c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2235d;

    public z0(v vVar, String str, Object[] objArr) {
        char charAt;
        this.f2232a = vVar;
        this.f2233b = str;
        this.f2234c = objArr;
        char charAt2 = str.charAt(0);
        if (charAt2 >= 55296) {
            char c9 = charAt2 & 8191;
            int i8 = 1;
            int i9 = 13;
            while (true) {
                int i10 = i8 + 1;
                charAt = str.charAt(i8);
                if (charAt < 55296) {
                    break;
                }
                c9 |= (charAt & 8191) << i9;
                i9 += 13;
                i8 = i10;
            }
            charAt2 = c9 | (charAt << i9);
        }
        this.f2235d = charAt2;
    }

    public final int a() {
        return (this.f2235d & 1) == 1 ? 1 : 2;
    }

    public final boolean b() {
        return (this.f2235d & 2) == 2;
    }

    public final o0 c() {
        return this.f2232a;
    }

    public final Object[] d() {
        return this.f2234c;
    }

    public final String e() {
        return this.f2233b;
    }
}
