package e1;

import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import j0.x;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final Property<View, Float> f4223a = new a();

    public static class a extends Property<View, Float> {
        public a() {
            super(Float.class, "translationAlpha");
        }

        public final Object get(Object obj) {
            return Float.valueOf(((View) obj).getTransitionAlpha());
        }

        public final void set(Object obj, Object obj2) {
            ((View) obj).setTransitionAlpha(((Float) obj2).floatValue());
        }
    }

    public static class b extends Property<View, Rect> {
        public b() {
            super(Rect.class, "clipBounds");
        }

        public final Object get(Object obj) {
            int[] iArr = x.f4957a;
            return x.e.a((View) obj);
        }

        public final void set(Object obj, Object obj2) {
            int[] iArr = x.f4957a;
            x.e.c((View) obj, (Rect) obj2);
        }
    }

    static {
        new t();
        new b();
    }
}
