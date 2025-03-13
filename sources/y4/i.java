package y4;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import k3.j;
import y7.b0;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final b0 f8454a;

    /* renamed from: b  reason: collision with root package name */
    public final b0 f8455b;

    /* renamed from: c  reason: collision with root package name */
    public final b0 f8456c;

    /* renamed from: d  reason: collision with root package name */
    public final b0 f8457d;
    public final c e;

    /* renamed from: f  reason: collision with root package name */
    public final c f8458f;

    /* renamed from: g  reason: collision with root package name */
    public final c f8459g;

    /* renamed from: h  reason: collision with root package name */
    public final c f8460h;

    /* renamed from: i  reason: collision with root package name */
    public final e f8461i;

    /* renamed from: j  reason: collision with root package name */
    public final e f8462j;

    /* renamed from: k  reason: collision with root package name */
    public final e f8463k;

    /* renamed from: l  reason: collision with root package name */
    public final e f8464l;

    public i() {
        this.f8454a = new h();
        this.f8455b = new h();
        this.f8456c = new h();
        this.f8457d = new h();
        this.e = new a(0.0f);
        this.f8458f = new a(0.0f);
        this.f8459g = new a(0.0f);
        this.f8460h = new a(0.0f);
        this.f8461i = new e();
        this.f8462j = new e();
        this.f8463k = new e();
        this.f8464l = new e();
    }

    public static a a(Context context, int i8, int i9, a aVar) {
        if (i9 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i8);
            i8 = i9;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i8, a1.a.f19e0);
        try {
            int i10 = obtainStyledAttributes.getInt(0, 0);
            int i11 = obtainStyledAttributes.getInt(3, i10);
            int i12 = obtainStyledAttributes.getInt(4, i10);
            int i13 = obtainStyledAttributes.getInt(2, i10);
            int i14 = obtainStyledAttributes.getInt(1, i10);
            c c9 = c(obtainStyledAttributes, 5, aVar);
            c c10 = c(obtainStyledAttributes, 8, c9);
            c c11 = c(obtainStyledAttributes, 9, c9);
            c c12 = c(obtainStyledAttributes, 7, c9);
            c c13 = c(obtainStyledAttributes, 6, c9);
            a aVar2 = new a();
            b0 q8 = j.q(i11);
            aVar2.f8465a = q8;
            float b9 = a.b(q8);
            if (b9 != -1.0f) {
                aVar2.e = new a(b9);
            }
            aVar2.e = c10;
            b0 q9 = j.q(i12);
            aVar2.f8466b = q9;
            float b10 = a.b(q9);
            if (b10 != -1.0f) {
                aVar2.f8469f = new a(b10);
            }
            aVar2.f8469f = c11;
            b0 q10 = j.q(i13);
            aVar2.f8467c = q10;
            float b11 = a.b(q10);
            if (b11 != -1.0f) {
                aVar2.f8470g = new a(b11);
            }
            aVar2.f8470g = c12;
            b0 q11 = j.q(i14);
            aVar2.f8468d = q11;
            float b12 = a.b(q11);
            if (b12 != -1.0f) {
                aVar2.f8471h = new a(b12);
            }
            aVar2.f8471h = c13;
            return aVar2;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static a b(Context context, AttributeSet attributeSet, int i8, int i9) {
        a aVar = new a((float) 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.a.Y, i8, i9);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i8, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i8);
        if (peekValue == null) {
            return cVar;
        }
        int i9 = peekValue.type;
        return i9 == 5 ? new a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i9 == 6 ? new g(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public final boolean d(RectF rectF) {
        Class<e> cls = e.class;
        boolean z8 = this.f8464l.getClass().equals(cls) && this.f8462j.getClass().equals(cls) && this.f8461i.getClass().equals(cls) && this.f8463k.getClass().equals(cls);
        float a9 = this.e.a(rectF);
        return z8 && ((this.f8458f.a(rectF) > a9 ? 1 : (this.f8458f.a(rectF) == a9 ? 0 : -1)) == 0 && (this.f8460h.a(rectF) > a9 ? 1 : (this.f8460h.a(rectF) == a9 ? 0 : -1)) == 0 && (this.f8459g.a(rectF) > a9 ? 1 : (this.f8459g.a(rectF) == a9 ? 0 : -1)) == 0) && ((this.f8455b instanceof h) && (this.f8454a instanceof h) && (this.f8456c instanceof h) && (this.f8457d instanceof h));
    }

    public final i e(float f9) {
        a aVar = new a(this);
        aVar.e = new a(f9);
        aVar.f8469f = new a(f9);
        aVar.f8470g = new a(f9);
        aVar.f8471h = new a(f9);
        return new i(aVar);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public b0 f8465a = new h();

        /* renamed from: b  reason: collision with root package name */
        public b0 f8466b = new h();

        /* renamed from: c  reason: collision with root package name */
        public b0 f8467c = new h();

        /* renamed from: d  reason: collision with root package name */
        public b0 f8468d = new h();
        public c e = new a(0.0f);

        /* renamed from: f  reason: collision with root package name */
        public c f8469f = new a(0.0f);

        /* renamed from: g  reason: collision with root package name */
        public c f8470g = new a(0.0f);

        /* renamed from: h  reason: collision with root package name */
        public c f8471h = new a(0.0f);

        /* renamed from: i  reason: collision with root package name */
        public final e f8472i = new e();

        /* renamed from: j  reason: collision with root package name */
        public final e f8473j = new e();

        /* renamed from: k  reason: collision with root package name */
        public final e f8474k = new e();

        /* renamed from: l  reason: collision with root package name */
        public final e f8475l = new e();

        public a() {
        }

        public static float b(b0 b0Var) {
            if (b0Var instanceof h) {
                return ((h) b0Var).f8453b;
            }
            if (b0Var instanceof d) {
                return ((d) b0Var).f8411b;
            }
            return -1.0f;
        }

        public final i a() {
            return new i(this);
        }

        public a(i iVar) {
            this.f8465a = iVar.f8454a;
            this.f8466b = iVar.f8455b;
            this.f8467c = iVar.f8456c;
            this.f8468d = iVar.f8457d;
            this.e = iVar.e;
            this.f8469f = iVar.f8458f;
            this.f8470g = iVar.f8459g;
            this.f8471h = iVar.f8460h;
            this.f8472i = iVar.f8461i;
            this.f8473j = iVar.f8462j;
            this.f8474k = iVar.f8463k;
            this.f8475l = iVar.f8464l;
        }
    }

    public i(a aVar) {
        this.f8454a = aVar.f8465a;
        this.f8455b = aVar.f8466b;
        this.f8456c = aVar.f8467c;
        this.f8457d = aVar.f8468d;
        this.e = aVar.e;
        this.f8458f = aVar.f8469f;
        this.f8459g = aVar.f8470g;
        this.f8460h = aVar.f8471h;
        this.f8461i = aVar.f8472i;
        this.f8462j = aVar.f8473j;
        this.f8463k = aVar.f8474k;
        this.f8464l = aVar.f8475l;
    }
}
