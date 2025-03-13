package a6;

import android.graphics.Color;
import java.util.List;
import java.util.Stack;
import s.g;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f171a;

    public a(int i8) {
        this.f171a = i8;
    }

    public boolean a() {
        return false;
    }

    public Color b() {
        return Color.valueOf(-16777216);
    }

    public void c(Stack<a> stack, List<a> list) {
        list.add(this);
    }

    public double d() {
        return 0.0d;
    }

    public float e() {
        return 0.0f;
    }

    public int f() {
        return 0;
    }

    public long g() {
        return 0;
    }

    public a h(l lVar) {
        int b9 = g.b(lVar.f189c);
        return b9 != 1 ? b9 != 8 ? new k() : new b(Boolean.valueOf(!a())) : this;
    }

    public a i(l lVar, a aVar) {
        int b9 = g.b(lVar.f189c);
        boolean z8 = true;
        if (b9 == 9) {
            if (!a() || !aVar.a()) {
                z8 = false;
            }
            return new b(Boolean.valueOf(z8));
        } else if (b9 != 10) {
            switch (b9) {
                case 14:
                    if (Double.compare(d(), aVar.d()) != 0) {
                        z8 = false;
                    }
                    return new b(Boolean.valueOf(z8));
                case 15:
                    if (Double.compare(d(), aVar.d()) == 0) {
                        z8 = false;
                    }
                    return new b(Boolean.valueOf(z8));
                case 16:
                    if (d() >= aVar.d()) {
                        z8 = false;
                    }
                    return new b(Boolean.valueOf(z8));
                case 17:
                    if (d() <= aVar.d()) {
                        z8 = false;
                    }
                    return new b(Boolean.valueOf(z8));
                case 18:
                    if (d() > aVar.d()) {
                        z8 = false;
                    }
                    return new b(Boolean.valueOf(z8));
                case 19:
                    if (d() < aVar.d()) {
                        z8 = false;
                    }
                    return new b(Boolean.valueOf(z8));
                default:
                    return this;
            }
        } else {
            if (!a() && !aVar.a()) {
                z8 = false;
            }
            return new b(Boolean.valueOf(z8));
        }
    }

    public a j(Stack<a> stack) {
        return this;
    }

    public String k() {
        return "";
    }
}
