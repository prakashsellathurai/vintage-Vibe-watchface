package com.samsung.android.wearable.watchfacestudio.editor;

import c7.n;
import i6.b;
import i6.e;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import o6.g;
import u1.m;
import v6.a;

public final /* synthetic */ class q implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3904a;

    public /* synthetic */ q(int i8) {
        this.f3904a = i8;
    }

    public final boolean test(Object obj) {
        switch (this.f3904a) {
            case 0:
                return ((m) obj).f7641a.f7683a.equals("themeColor");
            case 1:
                return ((Map.Entry) obj).getValue() != null;
            case 2:
                return ((b) obj).d("COMPLICATION.");
            case 3:
                return ((g) ((Map.Entry) obj).getKey()).isEnabled();
            case 4:
                return ((o6.q) obj) instanceof a;
            case 5:
                return s.g.a(((a6.a) obj).f171a, 12);
            case 6:
                return s.g.a(((a6.a) obj).f171a, 9);
            case 7:
                return s.g.a(((a6.a) obj).f171a, 12);
            case 8:
                return ((e) obj).f4862a.equals("Transform");
            case 9:
                return ((e) obj).b("value").d().contains("[");
            case 10:
                return ((e) obj).f4862a.equals("Transform");
            case 11:
                String d9 = ((e) obj).b("target").d();
                return d9.equals("width") || d9.equals("height");
            case 12:
                String str = (String) obj;
                return str != null && !str.isEmpty();
            case 13:
                return ((o6.q) obj).isEnabled();
            case 14:
                return ((o6.q) obj).isEnabled();
            case 15:
                o6.q qVar = (o6.q) obj;
                return true;
            case 16:
                return ((o6.q) obj).isEnabled();
            case 17:
                return ((o6.q) obj).isEnabled();
            case 18:
                return ((o6.q) obj).isEnabled();
            default:
                return Objects.nonNull((n) obj);
        }
    }
}
