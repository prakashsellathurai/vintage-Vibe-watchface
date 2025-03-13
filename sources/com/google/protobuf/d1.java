package com.google.protobuf;

public final class d1 implements p0 {

    /* renamed from: a  reason: collision with root package name */
    public final r0 f3619a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3620b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f3621c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3622d;

    public d1(r0 r0Var, String str, Object[] objArr) {
        char charAt;
        this.f3619a = r0Var;
        this.f3620b = str;
        this.f3621c = objArr;
        char charAt2 = str.charAt(0);
        if (charAt2 >= 55296) {
            char c9 = charAt2 & 8191;
            int i8 = 13;
            int i9 = 1;
            while (true) {
                int i10 = i9 + 1;
                charAt = str.charAt(i9);
                if (charAt < 55296) {
                    break;
                }
                c9 |= (charAt & 8191) << i8;
                i8 += 13;
                i9 = i10;
            }
            charAt2 = c9 | (charAt << i8);
        }
        this.f3622d = charAt2;
    }

    public final int a() {
        return (this.f3622d & 1) == 1 ? 1 : 2;
    }

    public final boolean b() {
        return (this.f3622d & 2) == 2;
    }

    public final r0 c() {
        return this.f3619a;
    }

    public final Object[] d() {
        return this.f3621c;
    }

    public final String e() {
        return this.f3620b;
    }
}
