package w5;

import android.graphics.Color;
import java.text.DecimalFormat;
import s.g;

public final class f {

    /* renamed from: j  reason: collision with root package name */
    public static final f f8062j = new f("");

    /* renamed from: k  reason: collision with root package name */
    public static final f f8063k = new f();

    /* renamed from: l  reason: collision with root package name */
    public static final f f8064l = new f(0);

    /* renamed from: m  reason: collision with root package name */
    public static final f f8065m = new f(1);

    /* renamed from: n  reason: collision with root package name */
    public static final DecimalFormat f8066n = new DecimalFormat("#.###");

    /* renamed from: a  reason: collision with root package name */
    public final int f8067a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8068b;

    /* renamed from: c  reason: collision with root package name */
    public final float f8069c;

    /* renamed from: d  reason: collision with root package name */
    public final double f8070d;
    public final long e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f8071f;

    /* renamed from: g  reason: collision with root package name */
    public final String f8072g;

    /* renamed from: h  reason: collision with root package name */
    public final Color f8073h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f8074i;

    public f() {
        this.f8067a = 8;
        this.f8074i = null;
    }

    public f(double d9) {
        this.f8067a = 4;
        this.f8070d = d9;
    }

    public f(float f9) {
        this.f8067a = 3;
        this.f8069c = f9;
    }

    public f(int i8) {
        this.f8067a = 1;
        this.f8068b = i8;
    }

    public f(long j8) {
        this.f8067a = 2;
        this.e = j8;
    }

    public f(Color color) {
        this.f8067a = 7;
        this.f8073h = color;
    }

    public f(Object obj) {
        this.f8067a = 8;
        this.f8074i = obj;
    }

    public f(String str) {
        this.f8067a = 6;
        this.f8072g = str;
    }

    public f(boolean z8) {
        this.f8067a = 5;
        this.f8071f = z8;
    }

    public static f j(f fVar) {
        int b9 = g.b(fVar.f8067a);
        return b9 != 0 ? b9 != 1 ? b9 != 2 ? b9 != 3 ? b9 != 4 ? fVar : new f(!fVar.a()) : new f(-fVar.c()) : new f(-fVar.d()) : new f(-fVar.f()) : new f(-fVar.e());
    }

    public final boolean a() {
        switch (g.b(this.f8067a)) {
            case 0:
                return this.f8068b != 0;
            case 1:
                return this.e != 0;
            case 2:
                return this.f8069c != 0.0f;
            case 3:
                return this.f8070d != 0.0d;
            case 4:
                return this.f8071f;
            case 5:
                String str = this.f8072g;
                return str != null && !str.isEmpty();
            case 6:
                return this.f8073h != null;
            case 7:
                return this.f8074i != null;
            default:
                return false;
        }
    }

    public final Color b() {
        int b9 = g.b(this.f8067a);
        if (b9 == 0) {
            return Color.valueOf(this.f8068b);
        }
        if (b9 == 1) {
            return Color.valueOf(this.e);
        }
        if (b9 == 2) {
            return Color.valueOf((int) this.f8069c);
        }
        if (b9 == 3) {
            return Color.valueOf((int) this.f8070d);
        }
        if (b9 == 4) {
            return Color.valueOf(this.f8071f ? -1 : -16777216);
        } else if (b9 != 6) {
            return null;
        } else {
            return this.f8073h;
        }
    }

    public final double c() {
        switch (g.b(this.f8067a)) {
            case 0:
                return (double) this.f8068b;
            case 1:
                return (double) this.e;
            case 2:
                return (double) this.f8069c;
            case 3:
                return this.f8070d;
            case 4:
                return this.f8071f ? 1.0d : 0.0d;
            case 5:
                String str = this.f8072g;
                return (str == null || str.isEmpty()) ? 0.0d : 1.0d;
            case 6:
                Color color = this.f8073h;
                if (color != null) {
                    return (double) color.toArgb();
                }
                return 0.0d;
            case 7:
                return this.f8074i != null ? 1.0d : 0.0d;
            default:
                return 0.0d;
        }
    }

    public final float d() {
        switch (g.b(this.f8067a)) {
            case 0:
                return (float) this.f8068b;
            case 1:
                return (float) this.e;
            case 2:
                return this.f8069c;
            case 3:
                return (float) this.f8070d;
            case 4:
                return this.f8071f ? 1.0f : 0.0f;
            case 5:
                String str = this.f8072g;
                return (str == null || str.isEmpty()) ? 0.0f : 1.0f;
            case 6:
                Color color = this.f8073h;
                if (color != null) {
                    return (float) color.toArgb();
                }
                return 0.0f;
            case 7:
                return this.f8074i != null ? 1.0f : 0.0f;
            default:
                return 0.0f;
        }
    }

    public final int e() {
        switch (g.b(this.f8067a)) {
            case 0:
                return this.f8068b;
            case 1:
                return (int) this.e;
            case 2:
                return (int) this.f8069c;
            case 3:
                return (int) this.f8070d;
            case 4:
                return this.f8071f ? 1 : 0;
            case 5:
                String str = this.f8072g;
                return (str == null || str.isEmpty()) ? 0 : 1;
            case 6:
                Color color = this.f8073h;
                if (color != null) {
                    return color.toArgb();
                }
                return 0;
            case 7:
                return this.f8074i != null ? 1 : 0;
            default:
                return 0;
        }
    }

    public final long f() {
        switch (g.b(this.f8067a)) {
            case 0:
                return (long) this.f8068b;
            case 1:
                return this.e;
            case 2:
                return (long) this.f8069c;
            case 3:
                return (long) this.f8070d;
            case 4:
                return this.f8071f ? 1 : 0;
            case 5:
                String str = this.f8072g;
                return (str == null || str.isEmpty()) ? 0 : 1;
            case 6:
                Color color = this.f8073h;
                if (color != null) {
                    return (long) color.toArgb();
                }
                return 0;
            case 7:
                return this.f8074i != null ? 1 : 0;
            default:
                return 0;
        }
    }

    public final Object g() {
        switch (g.b(this.f8067a)) {
            case 0:
                return Integer.valueOf(this.f8068b);
            case 1:
                return Long.valueOf(this.e);
            case 2:
                return Float.valueOf(this.f8069c);
            case 3:
                return Double.valueOf(this.f8070d);
            case 4:
                return Boolean.valueOf(this.f8071f);
            case 5:
                return this.f8072g;
            case 6:
                return this.f8073h;
            case 7:
                return this.f8074i;
            default:
                return null;
        }
    }

    public final String h() {
        int b9 = g.b(this.f8067a);
        DecimalFormat decimalFormat = f8066n;
        switch (b9) {
            case 0:
                return Integer.toString(this.f8068b);
            case 1:
                return Long.toString(this.e);
            case 2:
                return decimalFormat.format((double) this.f8069c);
            case 3:
                return decimalFormat.format(this.f8070d);
            case 4:
                return Boolean.toString(this.f8071f);
            case 5:
                String str = this.f8072g;
                return str != null ? str : "";
            case 6:
                Color color = this.f8073h;
                return color != null ? color.toString() : "";
            case 7:
                Object obj = this.f8074i;
                return obj != null ? obj.toString() : "";
            default:
                return "";
        }
    }

    public final boolean i() {
        int b9 = g.b(this.f8067a);
        if (b9 == 5) {
            return n6.g.e(this.f8072g);
        }
        if (b9 == 6) {
            return this.f8073h == null;
        }
        if (b9 != 7) {
            return false;
        }
        return this.f8074i == null;
    }
}
