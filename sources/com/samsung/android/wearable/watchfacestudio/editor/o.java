package com.samsung.android.wearable.watchfacestudio.editor;

import java.util.function.Predicate;
import l5.a;
import x5.c;

public final /* synthetic */ class o implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3901a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Integer f3902b;

    public /* synthetic */ o(int i8, Integer num) {
        this.f3901a = i8;
        this.f3902b = num;
    }

    public final boolean test(Object obj) {
        int i8 = this.f3901a;
        Integer num = this.f3902b;
        switch (i8) {
            case 0:
                return ((c) obj).f8147a == num.intValue();
            case 1:
                return ((c) obj).f8147a == num.intValue();
            default:
                return ((a) obj).getKey().equals(num);
        }
    }
}
