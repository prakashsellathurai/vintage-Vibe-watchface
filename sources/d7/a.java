package d7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import c7.h;
import c7.n;
import c7.o;
import d7.b;
import e7.d;
import e7.i;
import e7.k;
import java.util.ArrayList;
import java.util.Iterator;
import o6.g;
import w5.f;

public class a extends f implements d {

    /* renamed from: d  reason: collision with root package name */
    public Path.Direction f4090d;
    public RectF e;

    /* renamed from: f  reason: collision with root package name */
    public float f4091f;

    /* renamed from: g  reason: collision with root package name */
    public float f4092g = 1.0f;

    /* renamed from: h  reason: collision with root package name */
    public final g f4093h;

    /* renamed from: i  reason: collision with root package name */
    public float f4094i = 1.0f;

    /* renamed from: j  reason: collision with root package name */
    public float f4095j = 1.0f;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4096k;

    /* renamed from: l  reason: collision with root package name */
    public final b f4097l = new b();

    /* renamed from: m  reason: collision with root package name */
    public final k f4098m;

    /* renamed from: d7.a$a  reason: collision with other inner class name */
    public static /* synthetic */ class C0048a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4099a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f4100b;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004e */
        static {
            /*
                android.graphics.Paint$Align[] r0 = android.graphics.Paint.Align.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4100b = r0
                r1 = 1
                android.graphics.Paint$Align r2 = android.graphics.Paint.Align.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f4100b     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Paint$Align r3 = android.graphics.Paint.Align.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                d7.b$a[] r2 = d7.b.a.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f4099a = r2
                d7.b$a r3 = d7.b.a.START_ANGLE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f4099a     // Catch:{ NoSuchFieldError -> 0x0038 }
                d7.b$a r2 = d7.b.a.END_ANGLE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = f4099a     // Catch:{ NoSuchFieldError -> 0x0043 }
                d7.b$a r1 = d7.b.a.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f4099a     // Catch:{ NoSuchFieldError -> 0x004e }
                d7.b$a r1 = d7.b.a.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f4099a     // Catch:{ NoSuchFieldError -> 0x0059 }
                d7.b$a r1 = d7.b.a.RADIUS     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: d7.a.C0048a.<clinit>():void");
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final float f4101a;

        /* renamed from: b  reason: collision with root package name */
        public final float f4102b;

        /* renamed from: c  reason: collision with root package name */
        public final float f4103c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f4104d;

        public b(float f9, float f10, float f11, boolean z8) {
            this.f4101a = f9;
            this.f4102b = f10;
            this.f4103c = f11;
            this.f4104d = z8;
        }
    }

    public a(b7.a aVar, Paint.Align align, boolean z8, Path.Direction direction, float f9, float f10, float f11, float f12, float f13) {
        super(align, z8);
        this.f4093h = aVar;
        this.f4090d = direction;
        w(b.a.CENTER_X, Float.valueOf(f9));
        w(b.a.CENTER_Y, Float.valueOf(f10));
        v(Float.valueOf(f13));
        u(f11, f12);
        this.f4098m = new k(this);
        h();
        this.f4096k = true;
    }

    public static float t(float f9) {
        float f10 = f9 % 360.0f;
        return f10 < 0.0f ? f10 + 360.0f : f10;
    }

    public final f a(i.a aVar) {
        return this.f4097l.b(aVar);
    }

    public final void b() {
        this.f4098m.m();
    }

    public final void d() {
        if (this.f4096k) {
            h();
            d dVar = this.f4124c;
            if (dVar != null) {
                ((b7.a) dVar).T();
            }
        }
    }

    public final void e(i.a aVar, f fVar) {
        if (aVar instanceof b.a) {
            int ordinal = ((b.a) aVar).ordinal();
            if (ordinal == 0) {
                w(b.a.START_ANGLE, Float.valueOf(t(Float.valueOf(fVar.d()).floatValue())));
            } else if (ordinal == 1) {
                w(b.a.END_ANGLE, Float.valueOf(t(Float.valueOf(fVar.d()).floatValue())));
            } else if (ordinal == 2) {
                w(b.a.CENTER_X, Float.valueOf(fVar.d()));
            } else if (ordinal == 3) {
                w(b.a.CENTER_Y, Float.valueOf(fVar.d()));
            } else if (ordinal == 4) {
                v(Float.valueOf(fVar.d()));
            }
        }
    }

    public final void f(Canvas canvas, Paint paint, RectF rectF, Rect rect, ArrayList arrayList) {
        n nVar;
        boolean z8;
        o oVar;
        float f9;
        float f10;
        o oVar2;
        Canvas canvas2 = canvas;
        if (this.f4096k) {
            b g9 = g(this.f4122a, rect);
            boolean z9 = false;
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            float f11 = g9.f4101a;
            int compare = Float.compare(o(b.a.START_ANGLE), o(b.a.END_ANGLE));
            float f12 = 0.5f;
            float f13 = g9.f4102b;
            if (compare == 0) {
                float r = r((float) rect.width(), f11, a(b.a.RADIUS).d(), this.f4090d) * 0.5f;
                f11 -= r;
                f13 += r;
            }
            float f14 = f13;
            boolean z10 = g9.f4104d;
            if (z10) {
                Iterator it = arrayList.iterator();
                float f15 = 0.0f;
                while (it.hasNext()) {
                    float height = (float) ((n) it.next()).f2819g.height();
                    if (f15 < height) {
                        f15 = height;
                    }
                }
                Path n8 = n(f15);
                canvas.save();
                canvas2.clipPath(n8);
            }
            Iterator it2 = arrayList.iterator();
            float f16 = g9.f4103c;
            float f17 = f11;
            while (it2.hasNext()) {
                n nVar2 = (n) it2.next();
                if (f17 != Float.MAX_VALUE) {
                    if (f16 < ((float) nVar2.f2819g.width())) {
                        if (nVar2.f2820h != null) {
                            oVar = new o(nVar2.f2820h);
                            Paint paint2 = paint;
                        } else {
                            oVar = new o(paint);
                        }
                        o oVar3 = oVar;
                        float d9 = a(b.a.RADIUS).d();
                        Paint.FontMetrics fontMetrics = oVar3.getFontMetrics();
                        Rect rect2 = nVar2.f2819g;
                        float f18 = -f16;
                        float height2 = (((float) rect2.height()) * f12) - fontMetrics.descent;
                        if (nVar2 instanceof h) {
                            Iterator<Drawable> it3 = ((h) nVar2).f2801j.iterator();
                            float f19 = f17;
                            float f20 = f18;
                            while (true) {
                                if (!it3.hasNext()) {
                                    nVar = nVar2;
                                    f9 = 0.0f;
                                    f17 = f19;
                                    break;
                                }
                                Drawable next = it3.next();
                                Rect c9 = j6.b.c(next);
                                if ((-f20) > ((float) c9.width())) {
                                    f20 += (float) c9.width();
                                } else {
                                    float r8 = r(((float) c9.width()) + f20, f19, d9, this.f4090d) + f19;
                                    if (s(r8)) {
                                        n nVar3 = new n("...");
                                        nVar3.a(oVar3);
                                        nVar = nVar2;
                                        j(canvas, oVar3, f19, r((float) nVar3.f2819g.width(), f19, d9, this.f4090d), f14, f20, height2, nVar3.f2818f);
                                        f17 = Float.MAX_VALUE;
                                        f9 = 0.0f;
                                        break;
                                    }
                                    n nVar4 = nVar2;
                                    float r9 = f19 + r(((float) c9.width()) * f12, f19, d9, this.f4090d);
                                    PointF p8 = p(r9, false);
                                    Matrix matrix = new Matrix();
                                    Iterator<Drawable> it4 = it3;
                                    matrix.setTranslate(((float) c9.width()) * -0.5f, ((float) c9.height()) * -0.5f);
                                    Path.Direction direction = this.f4090d;
                                    float t8 = t(r9);
                                    float f21 = f20;
                                    float f22 = r8;
                                    if ((direction == Path.Direction.CW && t8 > 0.0f && t8 < 180.0f) || (direction == Path.Direction.CCW && t8 > 180.0f && t8 < 360.0f)) {
                                        matrix.postRotate(180.0f);
                                    }
                                    matrix.postRotate(q(r9));
                                    matrix.postTranslate(p8.x, p8.y);
                                    canvas.save();
                                    canvas2.setMatrix(matrix);
                                    next.draw(canvas2);
                                    canvas.restore();
                                    Paint paint3 = paint;
                                    it3 = it4;
                                    f19 = f22;
                                    nVar2 = nVar4;
                                    f20 = f21;
                                    f12 = 0.5f;
                                }
                            }
                        } else {
                            nVar = nVar2;
                            f9 = 0.0f;
                            String str = nVar.f2818f;
                            if (str == null || str.isEmpty()) {
                                f17 = f17;
                            } else {
                                float r10 = r(((float) rect2.width()) + f18, f17, d9, this.f4090d);
                                if (s(f17 + r10)) {
                                    int breakText = oVar3.breakText(str, 0, str.length(), true, k(f17, f14, this.f4090d) - oVar3.measureText("..."), (float[]) null);
                                    j(canvas, oVar3, f17, r10, f14, f18, height2, str.substring(0, breakText) + "...");
                                    f17 = Float.MAX_VALUE;
                                } else {
                                    float f23 = f18;
                                    if (nVar instanceof c7.b) {
                                        c7.b bVar = (c7.b) nVar;
                                        ArrayList e4 = bVar.e(oVar3);
                                        if (bVar.d()) {
                                            oVar2 = (o) e4.get(0);
                                            f10 = f17;
                                            f17 = j(canvas, oVar2, f10, r10, f14, f23, height2, str) + f10;
                                        } else {
                                            Iterator it5 = e4.iterator();
                                            while (it5.hasNext()) {
                                                j(canvas, (o) it5.next(), f17, r10, f14, f23, height2, str);
                                                oVar3 = oVar3;
                                                f17 = f17;
                                            }
                                        }
                                    }
                                    f10 = f17;
                                    oVar2 = oVar3;
                                    f17 = j(canvas, oVar2, f10, r10, f14, f23, height2, str) + f10;
                                }
                            }
                        }
                        f16 = f9;
                    } else {
                        nVar = nVar2;
                        float f24 = f17;
                        f16 -= (float) nVar.f2819g.width();
                    }
                    z8 = false;
                } else {
                    nVar = nVar2;
                    float f25 = f17;
                    z8 = z9;
                }
                nVar.f2821i = z8;
                z9 = z8;
                f12 = 0.5f;
            }
            if (z10) {
                canvas.restore();
            }
        }
    }

    public b g(Paint.Align align, Rect rect) {
        float f9;
        float f10;
        float o8 = o(b.a.START_ANGLE);
        float o9 = o(b.a.END_ANGLE);
        float d9 = a(b.a.RADIUS).d();
        boolean z8 = false;
        float f11 = 0.0f;
        if (rect == null || Float.compare(o8, o9) == 0) {
            return new b(o8, o9, 0.0f, false);
        }
        float width = ((float) rect.width()) / this.f4092g;
        float f12 = width > 1.0f ? this.f4091f : width * this.f4091f;
        int i8 = C0048a.f4100b[align.ordinal()];
        float f13 = 359.9999f;
        boolean z9 = this.f4123b;
        if (i8 != 1) {
            if (i8 != 2) {
                if (((float) rect.width()) < this.f4092g) {
                    o8 = t(o8 + ((this.f4091f - f12) * 0.5f));
                    o9 = t(f12 + o8);
                } else if (!z9) {
                    if (((float) rect.width()) > this.f4095j) {
                        if (this.f4090d != Path.Direction.CW) {
                            f13 = -359.9999f;
                        }
                        float t8 = t(f13 + o8);
                        f10 = (((float) rect.width()) - this.f4092g) * 0.5f;
                        o9 = t8;
                    } else {
                        float r = (r((float) rect.width(), o8, d9, this.f4090d) - f12) * 0.5f;
                        float t9 = t(o8 - r);
                        o9 = t(o9 + r);
                        o8 = t9;
                    }
                }
                return new b(o8, o9, f11, z8);
            }
            if (((float) rect.width()) < this.f4092g) {
                o8 = t(o9 - f12);
            } else if (!z9) {
                if (((float) rect.width()) > this.f4095j) {
                    if (this.f4090d != Path.Direction.CW) {
                        f13 = -359.9999f;
                    }
                    float t10 = t(o9 - f13);
                    f10 = ((float) rect.width()) - this.f4095j;
                    o8 = t10;
                } else {
                    o8 = t(o8 - (r((float) rect.width(), o8, d9, this.f4090d) - f12));
                }
            }
            return new b(o8, o9, f11, z8);
            f11 = f10;
        } else {
            if (!z9 && ((float) rect.width()) > this.f4092g) {
                if (((float) rect.width()) > this.f4095j) {
                    if (this.f4090d != Path.Direction.CW) {
                        f13 = -359.9999f;
                    }
                    f9 = t(f13 + o8);
                } else {
                    f9 = t(r((float) rect.width(), o8, d9, this.f4090d) + o8);
                }
                o9 = f9;
            }
            return new b(o8, o9, f11, z8);
        }
        z8 = true;
        return new b(o8, o9, f11, z8);
    }

    public final void h() {
        float f9;
        float o8 = o(b.a.START_ANGLE);
        float o9 = o(b.a.END_ANGLE);
        if (Float.compare(o9, o8) != 0) {
            float f10 = o9 - o8;
            this.f4091f = f10;
            Path.Direction direction = this.f4090d;
            if (direction == Path.Direction.CW && o9 < o8) {
                f9 = f10 + 360.0f;
            } else if (direction == Path.Direction.CCW && o9 > o8) {
                f9 = f10 - 360.0f;
            }
            this.f4091f = f9;
        } else if (o8 >= 0.0f && o8 < 180.0f) {
            this.f4090d = Path.Direction.CCW;
        }
        RectF i8 = i();
        this.e = i8;
        this.f4092g = l(i8, o8, this.f4091f);
        this.f4094i = k(o9, o8, this.f4090d);
        this.f4095j = m();
    }

    public RectF i() {
        PointF B = this.f4093h.B();
        float d9 = a(b.a.CENTER_X).d();
        float d10 = a(b.a.CENTER_Y).d();
        float d11 = a(b.a.RADIUS).d();
        float f9 = B.x;
        float f10 = B.y;
        return new RectF((d9 - d11) * f9, (d10 - d11) * f10, (d9 + d11) * f9, (d10 + d11) * f10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float j(android.graphics.Canvas r13, c7.o r14, float r15, float r16, float r17, float r18, float r19, java.lang.String r20) {
        /*
            r12 = this;
            r0 = r12
            r5 = r14
            r1 = r15
            r2 = r18
            r3 = r20
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r7 = 0
            r8 = 1
            r9 = 0
            if (r6 >= 0) goto L_0x003e
            float r2 = -r2
            int r6 = r14.breakText(r3, r8, r2, r7)
            int r10 = r20.length()
            if (r6 >= r10) goto L_0x0030
            java.lang.String r10 = r3.substring(r9, r6)
            float r10 = r14.measureText(r10)
            float r10 = r2 - r10
            int r11 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r11 <= 0) goto L_0x0030
            float r11 = r0.f4094i
            int r10 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r10 >= 0) goto L_0x0030
            int r6 = r6 + 1
        L_0x0030:
            java.lang.String r10 = r3.substring(r9, r6)
            float r10 = r14.measureText(r10)
            float r2 = r10 - r2
            java.lang.String r3 = r3.substring(r6)
        L_0x003e:
            r6 = r2
            android.graphics.Paint$Align r2 = r0.f4122a
            android.graphics.Paint$Align r10 = android.graphics.Paint.Align.RIGHT
            if (r2 != r10) goto L_0x0046
            goto L_0x0067
        L_0x0046:
            float r2 = r1 + r16
            d7.b$a r10 = d7.b.a.START_ANGLE
            float r10 = r12.o(r10)
            float r2 = r2 - r10
            android.graphics.Path$Direction r10 = r0.f4090d
            android.graphics.Path$Direction r11 = android.graphics.Path.Direction.CCW
            if (r10 != r11) goto L_0x005b
            float r11 = r0.f4091f
            int r11 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r11 < 0) goto L_0x0065
        L_0x005b:
            android.graphics.Path$Direction r11 = android.graphics.Path.Direction.CW
            if (r10 != r11) goto L_0x0067
            float r10 = r0.f4091f
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x0067
        L_0x0065:
            r2 = r8
            goto L_0x0068
        L_0x0067:
            r2 = r9
        L_0x0068:
            if (r2 == 0) goto L_0x00ab
            android.graphics.Path$Direction r2 = r0.f4090d
            r10 = r17
            float r2 = r12.k(r15, r10, r2)
            float r2 = r2 - r6
            int r7 = r14.breakText(r3, r8, r2, r7)
            int r8 = r3.length()
            if (r7 >= r8) goto L_0x0091
            int r8 = r7 + 1
            java.lang.String r10 = r3.substring(r9, r8)
            float r10 = r14.measureText(r10)
            float r10 = r10 - r2
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0091
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0091
            r7 = r8
        L_0x0091:
            java.lang.String r2 = r3.substring(r9, r7)
            float r3 = r14.measureText(r2)
            float r3 = r3 + r6
            d7.b$a r4 = d7.b.a.RADIUS
            w5.f r4 = r12.a(r4)
            float r4 = r4.d()
            android.graphics.Path$Direction r7 = r0.f4090d
            float r3 = r12.r(r3, r15, r4, r7)
            goto L_0x00ae
        L_0x00ab:
            r2 = r3
            r3 = r16
        L_0x00ae:
            r4 = -1011613699(0xffffffffc3b3fffd, float:-359.9999)
            r7 = 1135869949(0x43b3fffd, float:359.9999)
            float r7 = a1.a.k(r3, r4, r7)
            android.graphics.RectF r0 = r0.e
            r14.getClass()
            android.graphics.Path r3 = new android.graphics.Path
            r3.<init>()
            r3.addArc(r0, r15, r7)
            r0 = r13
            r1 = r2
            r2 = r3
            r3 = r6
            r4 = r19
            r5 = r14
            r0.drawTextOnPath(r1, r2, r3, r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.a.j(android.graphics.Canvas, c7.o, float, float, float, float, float, java.lang.String):float");
    }

    public final float k(float f9, float f10, Path.Direction direction) {
        float f11 = f10 - f9;
        if (direction == Path.Direction.CW && f10 < f9) {
            f11 += 360.0f;
        } else if (direction == Path.Direction.CCW && f10 > f9) {
            f11 -= 360.0f;
        }
        return l(this.e, f9, f11);
    }

    public float l(RectF rectF, float f9, float f10) {
        return (float) (((double) a(b.a.RADIUS).d()) * 6.283185307179586d * ((double) (Math.abs(f10) / 360.0f)));
    }

    public float m() {
        return (float) (((double) a(b.a.RADIUS).d()) * 6.283185307179586d);
    }

    public Path n(float f9) {
        float o8 = o(b.a.START_ANGLE);
        float d9 = a(b.a.CENTER_X).d();
        float d10 = a(b.a.CENTER_Y).d();
        float d11 = a(b.a.RADIUS).d() + (f9 * 0.5f);
        RectF rectF = new RectF(d9 - d11, d10 - d11, d9 + d11, d11 + d10);
        Path path = new Path();
        path.moveTo(d9, d10);
        path.arcTo(rectF, o8, this.f4091f);
        return path;
    }

    public final float o(b.a aVar) {
        return t(this.f4097l.b(aVar).d() - 0.049804688f);
    }

    public PointF p(float f9, boolean z8) {
        float d9 = a(b.a.CENTER_X).d();
        float d10 = a(b.a.CENTER_Y).d();
        float d11 = a(b.a.RADIUS).d();
        double d12 = (double) (d11 - 0.0f);
        double d13 = (double) (-((float) Math.toRadians((double) f9)));
        float cos = (float) (Math.cos(d13) * d12);
        float sin = (float) (d12 * Math.sin(d13));
        if (!z8) {
            cos += d9;
            sin = d10 - sin;
        }
        return new PointF(cos, sin);
    }

    public float q(float f9) {
        PointF p8 = p(f9, true);
        return (float) (-Math.toDegrees(Math.atan((double) (-(p8.x / p8.y)))));
    }

    public float r(float f9, float f10, float f11, Path.Direction direction) {
        float f12 = (float) (((double) (f9 * 360.0f)) / (((double) f11) * 6.283185307179586d));
        return direction == Path.Direction.CCW ? f12 * -1.0f : f12;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = r2.f4090d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean s(float r3) {
        /*
            r2 = this;
            d7.b$a r0 = d7.b.a.START_ANGLE
            float r0 = r2.o(r0)
            float r3 = r3 - r0
            boolean r0 = r2.f4123b
            if (r0 == 0) goto L_0x0023
            android.graphics.Path$Direction r0 = r2.f4090d
            android.graphics.Path$Direction r1 = android.graphics.Path.Direction.CCW
            if (r0 != r1) goto L_0x0017
            float r1 = r2.f4091f
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0021
        L_0x0017:
            android.graphics.Path$Direction r1 = android.graphics.Path.Direction.CW
            if (r0 != r1) goto L_0x0023
            float r2 = r2.f4091f
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0023
        L_0x0021:
            r2 = 1
            goto L_0x0024
        L_0x0023:
            r2 = 0
        L_0x0024:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.a.s(float):boolean");
    }

    public final void u(float f9, float f10) {
        float t8 = t(f9);
        float t9 = t(f10);
        b.a aVar = b.a.START_ANGLE;
        if (Float.compare(o(aVar), t8) != 0 || Float.compare(o(b.a.END_ANGLE), t9) != 0) {
            f fVar = new f(t8);
            b bVar = this.f4097l;
            bVar.d(aVar, fVar);
            bVar.d(b.a.END_ANGLE, new f(t9));
            d();
        }
    }

    public final void v(Float f9) {
        if (!Float.isNaN(f9.floatValue())) {
            w(b.a.RADIUS, f9);
        }
    }

    public final void w(b.a aVar, Float f9) {
        b bVar = this.f4097l;
        if (Float.compare(bVar.b(aVar).d(), f9.floatValue()) != 0) {
            bVar.d(aVar, new f(f9.floatValue()));
            d();
        }
    }

    public a(b7.a aVar, Paint.Align align, boolean z8, Path.Direction direction, float f9, float f10, float f11, float f12, float f13, float f14) {
        super(align, z8);
        this.f4093h = aVar;
        this.f4090d = direction;
        w(b.a.CENTER_X, Float.valueOf(f9));
        w(b.a.CENTER_Y, Float.valueOf(f10));
        v(Float.valueOf(Math.max(f13 / 2.0f, f14 / 2.0f)));
        u(f11, f12);
        this.f4098m = new k(this);
    }
}
