package m6;

import g6.a;
import java.util.ArrayList;
import java.util.Comparator;
import n1.c0;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5460a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5461b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5462c;

    public c(int i8, boolean z8, int i9) {
        this.f5460a = z8;
        this.f5461b = i8;
        this.f5462c = i9;
    }

    public final d a(ArrayList arrayList) {
        return (d) arrayList.stream().min(Comparator.comparing(new c0(2, this.f5460a ? a.f4666g : a.f4667h), Comparator.reverseOrder()).thenComparing(new a(this))).orElseThrow(new b());
    }
}
