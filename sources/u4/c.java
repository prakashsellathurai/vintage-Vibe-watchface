package u4;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.animation.LinearInterpolator;
import h0.d;
import j0.x;
import v4.a;

public final class c {
    public float A;
    public float B;
    public int[] C;
    public boolean D;
    public final TextPaint E;
    public final TextPaint F;
    public TimeInterpolator G;
    public TimeInterpolator H;
    public float I;
    public float J;
    public float K;
    public ColorStateList L;
    public float M;
    public StaticLayout N;
    public CharSequence O;

    /* renamed from: a  reason: collision with root package name */
    public final View f7737a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f7738b;

    /* renamed from: c  reason: collision with root package name */
    public float f7739c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f7740d;
    public final Rect e;

    /* renamed from: f  reason: collision with root package name */
    public final RectF f7741f;

    /* renamed from: g  reason: collision with root package name */
    public int f7742g = 16;

    /* renamed from: h  reason: collision with root package name */
    public int f7743h = 16;

    /* renamed from: i  reason: collision with root package name */
    public float f7744i = 15.0f;

    /* renamed from: j  reason: collision with root package name */
    public float f7745j = 15.0f;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f7746k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f7747l;

    /* renamed from: m  reason: collision with root package name */
    public float f7748m;

    /* renamed from: n  reason: collision with root package name */
    public float f7749n;

    /* renamed from: o  reason: collision with root package name */
    public float f7750o;

    /* renamed from: p  reason: collision with root package name */
    public float f7751p;

    /* renamed from: q  reason: collision with root package name */
    public float f7752q;
    public float r;

    /* renamed from: s  reason: collision with root package name */
    public Typeface f7753s;

    /* renamed from: t  reason: collision with root package name */
    public Typeface f7754t;

    /* renamed from: u  reason: collision with root package name */
    public Typeface f7755u;

    /* renamed from: v  reason: collision with root package name */
    public a f7756v;
    public CharSequence w;

    /* renamed from: x  reason: collision with root package name */
    public CharSequence f7757x;
    public boolean y;

    /* renamed from: z  reason: collision with root package name */
    public Bitmap f7758z;

    public c(View view) {
        this.f7737a = view;
        TextPaint textPaint = new TextPaint(129);
        this.E = textPaint;
        this.F = new TextPaint(textPaint);
        this.e = new Rect();
        this.f7740d = new Rect();
        this.f7741f = new RectF();
    }

    public static int a(float f9, int i8, int i9) {
        float f10 = 1.0f - f9;
        return Color.argb((int) ((((float) Color.alpha(i8)) * f10) + (((float) Color.alpha(i9)) * f9)), (int) ((((float) Color.red(i8)) * f10) + (((float) Color.red(i9)) * f9)), (int) ((((float) Color.green(i8)) * f10) + (((float) Color.green(i9)) * f9)), (int) ((((float) Color.blue(i8)) * f10) + (((float) Color.blue(i9)) * f9)));
    }

    public static float f(float f9, float f10, float f11, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f11 = timeInterpolator.getInterpolation(f11);
        }
        LinearInterpolator linearInterpolator = f4.a.f4391a;
        return f9 + (f11 * (f10 - f9));
    }

    public final float b() {
        if (this.w == null) {
            return 0.0f;
        }
        TextPaint textPaint = this.F;
        textPaint.setTextSize(this.f7745j);
        textPaint.setTypeface(this.f7753s);
        textPaint.setLetterSpacing(this.M);
        CharSequence charSequence = this.w;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public final boolean c(CharSequence charSequence) {
        int[] iArr = x.f4957a;
        boolean z8 = true;
        if (x.d.d(this.f7737a) != 1) {
            z8 = false;
        }
        return (z8 ? d.f4732d : d.f4731c).b(charSequence, charSequence.length());
    }

    public final void d(float f9) {
        float f10;
        boolean z8;
        StaticLayout staticLayout;
        if (this.w != null) {
            float width = (float) this.e.width();
            float width2 = (float) this.f7740d.width();
            if (Math.abs(f9 - this.f7745j) < 0.001f) {
                f10 = this.f7745j;
                this.A = 1.0f;
                Typeface typeface = this.f7755u;
                Typeface typeface2 = this.f7753s;
                if (typeface != typeface2) {
                    this.f7755u = typeface2;
                    z8 = true;
                } else {
                    z8 = false;
                }
            } else {
                float f11 = this.f7744i;
                Typeface typeface3 = this.f7755u;
                Typeface typeface4 = this.f7754t;
                if (typeface3 != typeface4) {
                    this.f7755u = typeface4;
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (Math.abs(f9 - f11) < 0.001f) {
                    this.A = 1.0f;
                } else {
                    this.A = f9 / this.f7744i;
                }
                float f12 = this.f7745j / this.f7744i;
                width = width2 * f12 > width ? Math.min(width / f12, width2) : width2;
                f10 = f11;
            }
            if (width > 0.0f) {
                z8 = this.B != f10 || this.D || z8;
                this.B = f10;
                this.D = false;
            }
            if (this.f7757x == null || z8) {
                TextPaint textPaint = this.E;
                textPaint.setTextSize(this.B);
                textPaint.setTypeface(this.f7755u);
                textPaint.setLinearText(this.A != 1.0f);
                boolean c9 = c(this.w);
                this.y = c9;
                try {
                    CharSequence charSequence = this.w;
                    int length = charSequence.length();
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    int max = Math.max(0, (int) width);
                    CharSequence ellipsize = TextUtils.ellipsize(charSequence, textPaint, (float) max, truncateAt);
                    int min = Math.min(ellipsize.length(), length);
                    if (c9) {
                        alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
                    }
                    StaticLayout.Builder obtain = StaticLayout.Builder.obtain(ellipsize, 0, min, textPaint, max);
                    obtain.setAlignment(alignment2);
                    obtain.setIncludePad(false);
                    obtain.setTextDirection(c9 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
                    if (truncateAt != null) {
                        obtain.setEllipsize(truncateAt);
                    }
                    obtain.setMaxLines(1);
                    staticLayout = obtain.build();
                } catch (h e4) {
                    Log.e("CollapsingTextHelper", e4.getCause().getMessage(), e4);
                    staticLayout = null;
                }
                staticLayout.getClass();
                this.N = staticLayout;
                this.f7757x = staticLayout.getText();
            }
        }
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.C;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g() {
        boolean z8;
        Rect rect = this.e;
        if (rect.width() > 0 && rect.height() > 0) {
            Rect rect2 = this.f7740d;
            if (rect2.width() > 0 && rect2.height() > 0) {
                z8 = true;
                this.f7738b = z8;
            }
        }
        z8 = false;
        this.f7738b = z8;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x019a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r16 = this;
            r0 = r16
            android.view.View r1 = r0.f7737a
            int r2 = r1.getHeight()
            if (r2 <= 0) goto L_0x01c7
            int r2 = r1.getWidth()
            if (r2 <= 0) goto L_0x01c7
            float r2 = r0.B
            float r3 = r0.f7745j
            r0.d(r3)
            java.lang.CharSequence r3 = r0.f7757x
            android.text.TextPaint r4 = r0.E
            if (r3 == 0) goto L_0x002e
            android.text.StaticLayout r5 = r0.N
            if (r5 == 0) goto L_0x002e
            int r5 = r5.getWidth()
            float r5 = (float) r5
            android.text.TextUtils$TruncateAt r6 = android.text.TextUtils.TruncateAt.END
            java.lang.CharSequence r3 = android.text.TextUtils.ellipsize(r3, r4, r5, r6)
            r0.O = r3
        L_0x002e:
            java.lang.CharSequence r3 = r0.O
            r6 = 0
            if (r3 == 0) goto L_0x003c
            int r7 = r3.length()
            float r3 = r4.measureText(r3, r6, r7)
            goto L_0x003d
        L_0x003c:
            r3 = 0
        L_0x003d:
            int r7 = r0.f7743h
            boolean r8 = r0.y
            int r7 = android.view.Gravity.getAbsoluteGravity(r7, r8)
            r8 = r7 & 112(0x70, float:1.57E-43)
            android.graphics.Rect r9 = r0.e
            r10 = 80
            r11 = 48
            r12 = 1073741824(0x40000000, float:2.0)
            if (r8 == r11) goto L_0x006f
            if (r8 == r10) goto L_0x0066
            float r8 = r4.descent()
            float r13 = r4.ascent()
            float r8 = r8 - r13
            float r8 = r8 / r12
            int r13 = r9.centerY()
            float r13 = (float) r13
            float r13 = r13 - r8
            r0.f7749n = r13
            goto L_0x0074
        L_0x0066:
            int r8 = r9.bottom
            float r8 = (float) r8
            float r13 = r4.ascent()
            float r8 = r8 + r13
            goto L_0x0072
        L_0x006f:
            int r8 = r9.top
            float r8 = (float) r8
        L_0x0072:
            r0.f7749n = r8
        L_0x0074:
            r8 = 8388615(0x800007, float:1.1754953E-38)
            r7 = r7 & r8
            r13 = 5
            r14 = 1
            if (r7 == r14) goto L_0x0088
            if (r7 == r13) goto L_0x0084
            int r3 = r9.left
            float r3 = (float) r3
            r0.f7751p = r3
            goto L_0x0091
        L_0x0084:
            int r7 = r9.right
            float r7 = (float) r7
            goto L_0x008e
        L_0x0088:
            int r7 = r9.centerX()
            float r7 = (float) r7
            float r3 = r3 / r12
        L_0x008e:
            float r7 = r7 - r3
            r0.f7751p = r7
        L_0x0091:
            float r3 = r0.f7744i
            r0.d(r3)
            android.text.StaticLayout r3 = r0.N
            if (r3 == 0) goto L_0x00a0
            int r3 = r3.getHeight()
            float r3 = (float) r3
            goto L_0x00a1
        L_0x00a0:
            r3 = 0
        L_0x00a1:
            java.lang.CharSequence r7 = r0.f7757x
            if (r7 == 0) goto L_0x00ae
            int r15 = r7.length()
            float r7 = r4.measureText(r7, r6, r15)
            goto L_0x00af
        L_0x00ae:
            r7 = 0
        L_0x00af:
            android.text.StaticLayout r15 = r0.N
            if (r15 == 0) goto L_0x00b6
            r15.getLineLeft(r6)
        L_0x00b6:
            int r6 = r0.f7742g
            boolean r15 = r0.y
            int r6 = android.view.Gravity.getAbsoluteGravity(r6, r15)
            r15 = r6 & 112(0x70, float:1.57E-43)
            android.graphics.Rect r5 = r0.f7740d
            if (r15 == r11) goto L_0x00da
            if (r15 == r10) goto L_0x00ce
            float r3 = r3 / r12
            int r10 = r5.centerY()
            float r10 = (float) r10
            float r10 = r10 - r3
            goto L_0x00d7
        L_0x00ce:
            int r10 = r5.bottom
            float r10 = (float) r10
            float r10 = r10 - r3
            float r3 = r4.descent()
            float r10 = r10 + r3
        L_0x00d7:
            r0.f7748m = r10
            goto L_0x00df
        L_0x00da:
            int r3 = r5.top
            float r3 = (float) r3
            r0.f7748m = r3
        L_0x00df:
            r3 = r6 & r8
            if (r3 == r14) goto L_0x00ed
            if (r3 == r13) goto L_0x00e9
            int r3 = r5.left
            float r3 = (float) r3
            goto L_0x00f4
        L_0x00e9:
            int r3 = r5.right
            float r3 = (float) r3
            goto L_0x00f3
        L_0x00ed:
            int r3 = r5.centerX()
            float r3 = (float) r3
            float r7 = r7 / r12
        L_0x00f3:
            float r3 = r3 - r7
        L_0x00f4:
            r0.f7750o = r3
            android.graphics.Bitmap r3 = r0.f7758z
            r6 = 0
            if (r3 == 0) goto L_0x0100
            r3.recycle()
            r0.f7758z = r6
        L_0x0100:
            r0.k(r2)
            float r2 = r0.f7739c
            android.graphics.RectF r3 = r0.f7741f
            int r7 = r5.left
            float r7 = (float) r7
            int r8 = r9.left
            float r8 = (float) r8
            android.animation.TimeInterpolator r10 = r0.G
            float r7 = f(r7, r8, r2, r10)
            r3.left = r7
            float r7 = r0.f7748m
            float r8 = r0.f7749n
            android.animation.TimeInterpolator r10 = r0.G
            float r7 = f(r7, r8, r2, r10)
            r3.top = r7
            int r7 = r5.right
            float r7 = (float) r7
            int r8 = r9.right
            float r8 = (float) r8
            android.animation.TimeInterpolator r10 = r0.G
            float r7 = f(r7, r8, r2, r10)
            r3.right = r7
            int r5 = r5.bottom
            float r5 = (float) r5
            int r7 = r9.bottom
            float r7 = (float) r7
            android.animation.TimeInterpolator r8 = r0.G
            float r5 = f(r5, r7, r2, r8)
            r3.bottom = r5
            float r3 = r0.f7750o
            float r5 = r0.f7751p
            android.animation.TimeInterpolator r7 = r0.G
            float r3 = f(r3, r5, r2, r7)
            r0.f7752q = r3
            float r3 = r0.f7748m
            float r5 = r0.f7749n
            android.animation.TimeInterpolator r7 = r0.G
            float r3 = f(r3, r5, r2, r7)
            r0.r = r3
            float r3 = r0.f7744i
            float r5 = r0.f7745j
            android.animation.TimeInterpolator r7 = r0.H
            float r3 = f(r3, r5, r2, r7)
            r0.k(r3)
            r3 = 1065353216(0x3f800000, float:1.0)
            float r5 = r3 - r2
            android.animation.TimeInterpolator r7 = f4.a.f4392b
            r8 = 0
            f(r8, r3, r5, r7)
            int[] r5 = j0.x.f4957a
            j0.x.c.k(r1)
            f(r3, r8, r2, r7)
            j0.x.c.k(r1)
            android.content.res.ColorStateList r3 = r0.f7747l
            android.content.res.ColorStateList r5 = r0.f7746k
            if (r3 == r5) goto L_0x018c
            int r3 = r0.e(r5)
            android.content.res.ColorStateList r5 = r0.f7747l
            int r5 = r0.e(r5)
            int r3 = a(r2, r3, r5)
            goto L_0x0190
        L_0x018c:
            int r3 = r0.e(r3)
        L_0x0190:
            r4.setColor(r3)
            float r3 = r0.M
            r5 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x019e
            float r3 = f(r5, r3, r2, r7)
        L_0x019e:
            r4.setLetterSpacing(r3)
            float r3 = r0.I
            float r3 = f(r5, r3, r2, r6)
            float r7 = r0.J
            float r7 = f(r5, r7, r2, r6)
            float r8 = r0.K
            float r5 = f(r5, r8, r2, r6)
            int r6 = r0.e(r6)
            android.content.res.ColorStateList r8 = r0.L
            int r0 = r0.e(r8)
            int r0 = a(r2, r6, r0)
            r4.setShadowLayer(r3, r7, r5, r0)
            j0.x.c.k(r1)
        L_0x01c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.c.h():void");
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f7747l != colorStateList) {
            this.f7747l = colorStateList;
            h();
        }
    }

    public final void j(float f9) {
        if (f9 < 0.0f) {
            f9 = 0.0f;
        } else if (f9 > 1.0f) {
            f9 = 1.0f;
        }
        if (f9 != this.f7739c) {
            this.f7739c = f9;
            RectF rectF = this.f7741f;
            Rect rect = this.f7740d;
            Rect rect2 = this.e;
            rectF.left = f((float) rect.left, (float) rect2.left, f9, this.G);
            rectF.top = f(this.f7748m, this.f7749n, f9, this.G);
            rectF.right = f((float) rect.right, (float) rect2.right, f9, this.G);
            rectF.bottom = f((float) rect.bottom, (float) rect2.bottom, f9, this.G);
            this.f7752q = f(this.f7750o, this.f7751p, f9, this.G);
            this.r = f(this.f7748m, this.f7749n, f9, this.G);
            k(f(this.f7744i, this.f7745j, f9, this.H));
            TimeInterpolator timeInterpolator = f4.a.f4392b;
            f(0.0f, 1.0f, 1.0f - f9, timeInterpolator);
            int[] iArr = x.f4957a;
            View view = this.f7737a;
            x.c.k(view);
            f(1.0f, 0.0f, f9, timeInterpolator);
            x.c.k(view);
            ColorStateList colorStateList = this.f7747l;
            ColorStateList colorStateList2 = this.f7746k;
            TextPaint textPaint = this.E;
            textPaint.setColor(colorStateList != colorStateList2 ? a(f9, e(colorStateList2), e(this.f7747l)) : e(colorStateList));
            float f10 = this.M;
            if (f10 != 0.0f) {
                f10 = f(0.0f, f10, f9, timeInterpolator);
            }
            textPaint.setLetterSpacing(f10);
            textPaint.setShadowLayer(f(0.0f, this.I, f9, (TimeInterpolator) null), f(0.0f, this.J, f9, (TimeInterpolator) null), f(0.0f, this.K, f9, (TimeInterpolator) null), a(f9, e((ColorStateList) null), e(this.L)));
            x.c.k(view);
        }
    }

    public final void k(float f9) {
        d(f9);
        int[] iArr = x.f4957a;
        x.c.k(this.f7737a);
    }
}
