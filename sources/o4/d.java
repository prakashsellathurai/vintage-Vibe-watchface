package o4;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

public interface d {

    public static class a implements TypeEvaluator<C0098d> {

        /* renamed from: b  reason: collision with root package name */
        public static final TypeEvaluator<C0098d> f6110b = new a();

        /* renamed from: a  reason: collision with root package name */
        public final C0098d f6111a = new C0098d();

        public final Object evaluate(float f9, Object obj, Object obj2) {
            C0098d dVar = (C0098d) obj;
            C0098d dVar2 = (C0098d) obj2;
            float f10 = 1.0f - f9;
            float f11 = (dVar.f6114a * f10) + (dVar2.f6114a * f9);
            float f12 = dVar.f6115b;
            float f13 = dVar.f6116c;
            C0098d dVar3 = this.f6111a;
            dVar3.f6114a = f11;
            dVar3.f6115b = (f12 * f10) + (dVar2.f6115b * f9);
            dVar3.f6116c = (f10 * f13) + (f9 * dVar2.f6116c);
            return dVar3;
        }
    }

    public static class b extends Property<d, C0098d> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<d, C0098d> f6112a = new b();

        public b() {
            super(C0098d.class, "circularReveal");
        }

        public final Object get(Object obj) {
            return ((d) obj).getRevealInfo();
        }

        public final void set(Object obj, Object obj2) {
            ((d) obj).setRevealInfo((C0098d) obj2);
        }
    }

    public static class c extends Property<d, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<d, Integer> f6113a = new c();

        public c() {
            super(Integer.class, "circularRevealScrimColor");
        }

        public final Object get(Object obj) {
            return Integer.valueOf(((d) obj).getCircularRevealScrimColor());
        }

        public final void set(Object obj, Object obj2) {
            ((d) obj).setCircularRevealScrimColor(((Integer) obj2).intValue());
        }
    }

    /* renamed from: o4.d$d  reason: collision with other inner class name */
    public static class C0098d {

        /* renamed from: a  reason: collision with root package name */
        public float f6114a;

        /* renamed from: b  reason: collision with root package name */
        public float f6115b;

        /* renamed from: c  reason: collision with root package name */
        public float f6116c;

        public C0098d() {
        }

        public C0098d(float f9, float f10, float f11) {
            this.f6114a = f9;
            this.f6115b = f10;
            this.f6116c = f11;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    C0098d getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i8);

    void setRevealInfo(C0098d dVar);
}
