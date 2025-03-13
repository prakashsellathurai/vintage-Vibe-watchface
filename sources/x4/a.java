package x4;

import android.graphics.Paint;
import android.graphics.Path;

public final class a {

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f8121i = new int[3];

    /* renamed from: j  reason: collision with root package name */
    public static final float[] f8122j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f8123k = new int[4];

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f8124l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public final Paint f8125a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f8126b;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f8127c;

    /* renamed from: d  reason: collision with root package name */
    public int f8128d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f8129f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f8130g = new Path();

    /* renamed from: h  reason: collision with root package name */
    public final Paint f8131h;

    public a() {
        Paint paint = new Paint();
        this.f8131h = paint;
        this.f8125a = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f8126b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f8127c = new Paint(paint2);
    }

    public final void a(int i8) {
        this.f8128d = c0.a.b(i8, 68);
        this.e = c0.a.b(i8, 20);
        this.f8129f = c0.a.b(i8, 0);
        this.f8125a.setColor(this.f8128d);
    }
}
