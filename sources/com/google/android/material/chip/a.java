package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.health.services.client.R;
import d0.b;
import d0.c;
import d0.d;
import f4.g;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import u4.i;
import u4.n;
import y4.f;
import y4.j;

public final class a extends f implements Drawable.Callback, i.b {
    public static final int[] G0 = {16842910};
    public static final ShapeDrawable H0 = new ShapeDrawable(new OvalShape());
    public float A = -1.0f;
    public ColorStateList A0;
    public ColorStateList B;
    public WeakReference<C0033a> B0 = new WeakReference<>((Object) null);
    public float C;
    public TextUtils.TruncateAt C0;
    public ColorStateList D;
    public boolean D0;
    public CharSequence E;
    public int E0;
    public boolean F;
    public boolean F0;
    public Drawable G;
    public ColorStateList H;
    public float I;
    public boolean J;
    public boolean K;
    public Drawable L;
    public RippleDrawable M;
    public ColorStateList N;
    public float O;
    public SpannableStringBuilder P;
    public boolean Q;
    public boolean R;
    public Drawable S;
    public ColorStateList T;
    public g U;
    public g V;
    public float W;
    public float X;
    public float Y;
    public float Z;

    /* renamed from: a0  reason: collision with root package name */
    public float f3186a0;

    /* renamed from: b0  reason: collision with root package name */
    public float f3187b0;

    /* renamed from: c0  reason: collision with root package name */
    public float f3188c0;

    /* renamed from: d0  reason: collision with root package name */
    public float f3189d0;

    /* renamed from: e0  reason: collision with root package name */
    public final Context f3190e0;

    /* renamed from: f0  reason: collision with root package name */
    public final Paint f3191f0 = new Paint(1);

    /* renamed from: g0  reason: collision with root package name */
    public final Paint.FontMetrics f3192g0 = new Paint.FontMetrics();

    /* renamed from: h0  reason: collision with root package name */
    public final RectF f3193h0 = new RectF();

    /* renamed from: i0  reason: collision with root package name */
    public final PointF f3194i0 = new PointF();

    /* renamed from: j0  reason: collision with root package name */
    public final Path f3195j0 = new Path();

    /* renamed from: k0  reason: collision with root package name */
    public final i f3196k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f3197l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f3198m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f3199n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f3200o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f3201p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f3202q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f3203r0;
    public int s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f3204t0 = 255;
    public ColorFilter u0;

    /* renamed from: v0  reason: collision with root package name */
    public PorterDuffColorFilter f3205v0;

    /* renamed from: w0  reason: collision with root package name */
    public ColorStateList f3206w0;

    /* renamed from: x  reason: collision with root package name */
    public ColorStateList f3207x;

    /* renamed from: x0  reason: collision with root package name */
    public PorterDuff.Mode f3208x0 = PorterDuff.Mode.SRC_IN;
    public ColorStateList y;
    public int[] y0;

    /* renamed from: z  reason: collision with root package name */
    public float f3209z;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f3210z0;

    /* renamed from: com.google.android.material.chip.a$a  reason: collision with other inner class name */
    public interface C0033a {
        void a();
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.chipStyle, -2146303331);
        h(context);
        this.f3190e0 = context;
        i iVar = new i(this);
        this.f3196k0 = iVar;
        this.E = "";
        iVar.f7774a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = G0;
        setState(iArr);
        if (!Arrays.equals(this.y0, iArr)) {
            this.y0 = iArr;
            if (S()) {
                v(getState(), iArr);
            }
        }
        this.D0 = true;
        H0.setTint(-1);
    }

    public static void T(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public static boolean s(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean t(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    @Deprecated
    public final void A(float f9) {
        if (this.A != f9) {
            this.A = f9;
            setShapeAppearanceModel(this.f8412a.f8433a.e(f9));
        }
    }

    public final void B(Drawable drawable) {
        Drawable drawable2 = this.G;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof d) {
            drawable2 = ((d) drawable2).a();
        }
        if (drawable2 != drawable) {
            float p8 = p();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.G = drawable3;
            float p9 = p();
            T(drawable2);
            if (R()) {
                n(this.G);
            }
            invalidateSelf();
            if (p8 != p9) {
                u();
            }
        }
    }

    public final void C(float f9) {
        if (this.I != f9) {
            float p8 = p();
            this.I = f9;
            float p9 = p();
            invalidateSelf();
            if (p8 != p9) {
                u();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        this.J = true;
        if (this.H != colorStateList) {
            this.H = colorStateList;
            if (R()) {
                b.h(this.G, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void E(boolean z8) {
        if (this.F != z8) {
            boolean R2 = R();
            this.F = z8;
            boolean R3 = R();
            if (R2 != R3) {
                if (R3) {
                    n(this.G);
                } else {
                    T(this.G);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            if (this.F0) {
                f.b bVar = this.f8412a;
                if (bVar.f8436d != colorStateList) {
                    bVar.f8436d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void G(float f9) {
        if (this.C != f9) {
            this.C = f9;
            this.f3191f0.setStrokeWidth(f9);
            if (this.F0) {
                this.f8412a.f8442k = f9;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void H(Drawable drawable) {
        Drawable drawable2 = this.L;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof d) {
            drawable2 = ((d) drawable2).a();
        }
        if (drawable2 != drawable) {
            float q8 = q();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.L = drawable3;
            ColorStateList colorStateList = this.D;
            if (colorStateList == null) {
                colorStateList = ColorStateList.valueOf(0);
            }
            this.M = new RippleDrawable(colorStateList, this.L, H0);
            float q9 = q();
            T(drawable2);
            if (S()) {
                n(this.L);
            }
            invalidateSelf();
            if (q8 != q9) {
                u();
            }
        }
    }

    public final void I(float f9) {
        if (this.f3188c0 != f9) {
            this.f3188c0 = f9;
            invalidateSelf();
            if (S()) {
                u();
            }
        }
    }

    public final void J(float f9) {
        if (this.O != f9) {
            this.O = f9;
            invalidateSelf();
            if (S()) {
                u();
            }
        }
    }

    public final void K(float f9) {
        if (this.f3187b0 != f9) {
            this.f3187b0 = f9;
            invalidateSelf();
            if (S()) {
                u();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.N != colorStateList) {
            this.N = colorStateList;
            if (S()) {
                b.h(this.L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void M(boolean z8) {
        if (this.K != z8) {
            boolean S2 = S();
            this.K = z8;
            boolean S3 = S();
            if (S2 != S3) {
                if (S3) {
                    n(this.L);
                } else {
                    T(this.L);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void N(float f9) {
        if (this.Y != f9) {
            float p8 = p();
            this.Y = f9;
            float p9 = p();
            invalidateSelf();
            if (p8 != p9) {
                u();
            }
        }
    }

    public final void O(float f9) {
        if (this.X != f9) {
            float p8 = p();
            this.X = f9;
            float p9 = p();
            invalidateSelf();
            if (p8 != p9) {
                u();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            if (!this.f3210z0) {
                colorStateList = null;
            } else if (colorStateList == null) {
                colorStateList = ColorStateList.valueOf(0);
            }
            this.A0 = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean Q() {
        return this.R && this.S != null && this.f3203r0;
    }

    public final boolean R() {
        return this.F && this.G != null;
    }

    public final boolean S() {
        return this.K && this.L != null;
    }

    public final void a() {
        u();
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        int i8;
        RectF rectF;
        int i9;
        int i10;
        int i11;
        RectF rectF2;
        int i12;
        float f9;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i8 = this.f3204t0) != 0) {
            int saveLayerAlpha = i8 < 255 ? canvas.saveLayerAlpha((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i8) : 0;
            boolean z8 = this.F0;
            Paint paint = this.f3191f0;
            RectF rectF3 = this.f3193h0;
            if (!z8) {
                paint.setColor(this.f3197l0);
                paint.setStyle(Paint.Style.FILL);
                rectF3.set(bounds);
                canvas2.drawRoundRect(rectF3, r(), r(), paint);
            }
            if (!this.F0) {
                paint.setColor(this.f3198m0);
                paint.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.u0;
                if (colorFilter == null) {
                    colorFilter = this.f3205v0;
                }
                paint.setColorFilter(colorFilter);
                rectF3.set(bounds);
                canvas2.drawRoundRect(rectF3, r(), r(), paint);
            }
            if (this.F0) {
                super.draw(canvas);
            }
            if (this.C > 0.0f && !this.F0) {
                paint.setColor(this.f3200o0);
                paint.setStyle(Paint.Style.STROKE);
                if (!this.F0) {
                    ColorFilter colorFilter2 = this.u0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.f3205v0;
                    }
                    paint.setColorFilter(colorFilter2);
                }
                float f10 = this.C / 2.0f;
                rectF3.set(((float) bounds.left) + f10, ((float) bounds.top) + f10, ((float) bounds.right) - f10, ((float) bounds.bottom) - f10);
                float f11 = this.A - (this.C / 2.0f);
                canvas2.drawRoundRect(rectF3, f11, f11, paint);
            }
            paint.setColor(this.f3201p0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            if (!this.F0) {
                canvas2.drawRoundRect(rectF3, r(), r(), paint);
            } else {
                RectF rectF4 = new RectF(bounds);
                Path path = this.f3195j0;
                j jVar = this.r;
                f.b bVar = this.f8412a;
                jVar.a(bVar.f8433a, bVar.f8441j, rectF4, this.f8427q, path);
                f(canvas, paint, path, this.f8412a.f8433a, g());
            }
            if (R()) {
                o(bounds, rectF3);
                float f12 = rectF3.left;
                float f13 = rectF3.top;
                canvas2.translate(f12, f13);
                this.G.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.G.draw(canvas2);
                canvas2.translate(-f12, -f13);
            }
            if (Q()) {
                o(bounds, rectF3);
                float f14 = rectF3.left;
                float f15 = rectF3.top;
                canvas2.translate(f14, f15);
                this.S.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.S.draw(canvas2);
                canvas2.translate(-f14, -f15);
            }
            if (!this.D0 || this.E == null) {
                rectF = rectF3;
                i10 = saveLayerAlpha;
                i9 = 0;
                i11 = 255;
            } else {
                PointF pointF = this.f3194i0;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                CharSequence charSequence = this.E;
                i iVar = this.f3196k0;
                if (charSequence != null) {
                    float p8 = this.W + p() + this.Z;
                    if (c.a(this) == 0) {
                        pointF.x = ((float) bounds.left) + p8;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = ((float) bounds.right) - p8;
                        align = Paint.Align.RIGHT;
                    }
                    TextPaint textPaint = iVar.f7774a;
                    Paint.FontMetrics fontMetrics = this.f3192g0;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = ((float) bounds.centerY()) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                rectF3.setEmpty();
                if (this.E != null) {
                    float p9 = this.W + p() + this.Z;
                    float q8 = this.f3189d0 + q() + this.f3186a0;
                    if (c.a(this) == 0) {
                        rectF3.left = ((float) bounds.left) + p9;
                        f9 = ((float) bounds.right) - q8;
                    } else {
                        rectF3.left = ((float) bounds.left) + q8;
                        f9 = ((float) bounds.right) - p9;
                    }
                    rectF3.right = f9;
                    rectF3.top = (float) bounds.top;
                    rectF3.bottom = (float) bounds.bottom;
                }
                v4.d dVar = iVar.f7778f;
                TextPaint textPaint2 = iVar.f7774a;
                if (dVar != null) {
                    textPaint2.drawableState = getState();
                    iVar.f7778f.c(this.f3190e0, textPaint2, iVar.f7775b);
                }
                textPaint2.setTextAlign(align);
                boolean z9 = Math.round(iVar.a(this.E.toString())) > Math.round(rectF3.width());
                if (z9) {
                    i12 = canvas.save();
                    canvas2.clipRect(rectF3);
                } else {
                    i12 = 0;
                }
                CharSequence charSequence2 = this.E;
                if (z9 && this.C0 != null) {
                    charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF3.width(), this.C0);
                }
                CharSequence charSequence3 = charSequence2;
                rectF = rectF3;
                int length = charSequence3.length();
                i10 = saveLayerAlpha;
                float f16 = pointF.x;
                i9 = 0;
                float f17 = pointF.y;
                i11 = 255;
                canvas.drawText(charSequence3, 0, length, f16, f17, textPaint2);
                if (z9) {
                    canvas2.restoreToCount(i12);
                }
            }
            if (S()) {
                rectF.setEmpty();
                if (S()) {
                    float f18 = this.f3189d0 + this.f3188c0;
                    if (c.a(this) == 0) {
                        float f19 = ((float) bounds.right) - f18;
                        rectF2 = rectF;
                        rectF2.right = f19;
                        rectF2.left = f19 - this.O;
                    } else {
                        rectF2 = rectF;
                        float f20 = ((float) bounds.left) + f18;
                        rectF2.left = f20;
                        rectF2.right = f20 + this.O;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f21 = this.O;
                    float f22 = exactCenterY - (f21 / 2.0f);
                    rectF2.top = f22;
                    rectF2.bottom = f22 + f21;
                } else {
                    rectF2 = rectF;
                }
                float f23 = rectF2.left;
                float f24 = rectF2.top;
                canvas2.translate(f23, f24);
                this.L.setBounds(i9, i9, (int) rectF2.width(), (int) rectF2.height());
                this.M.setBounds(this.L.getBounds());
                this.M.jumpToCurrentState();
                this.M.draw(canvas2);
                canvas2.translate(-f23, -f24);
            }
            if (this.f3204t0 < i11) {
                canvas2.restoreToCount(i10);
            }
        }
    }

    public final int getAlpha() {
        return this.f3204t0;
    }

    public final ColorFilter getColorFilter() {
        return this.u0;
    }

    public final int getIntrinsicHeight() {
        return (int) this.f3209z;
    }

    public final int getIntrinsicWidth() {
        return Math.min(Math.round(this.W + p() + this.Z + this.f3196k0.a(this.E.toString()) + this.f3186a0 + q() + this.f3189d0), this.E0);
    }

    public final int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public final void getOutline(Outline outline) {
        if (this.F0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.A);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f3209z, this.A);
        }
        outline.setAlpha(((float) this.f3204t0) / 255.0f);
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        r0 = r0.f7932a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isStateful() {
        /*
            r3 = this;
            android.content.res.ColorStateList r0 = r3.f3207x
            boolean r0 = s(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0066
            android.content.res.ColorStateList r0 = r3.y
            boolean r0 = s(r0)
            if (r0 != 0) goto L_0x0066
            android.content.res.ColorStateList r0 = r3.B
            boolean r0 = s(r0)
            if (r0 != 0) goto L_0x0066
            boolean r0 = r3.f3210z0
            if (r0 == 0) goto L_0x0025
            android.content.res.ColorStateList r0 = r3.A0
            boolean r0 = s(r0)
            if (r0 != 0) goto L_0x0066
        L_0x0025:
            u4.i r0 = r3.f3196k0
            v4.d r0 = r0.f7778f
            r2 = 0
            if (r0 == 0) goto L_0x0038
            android.content.res.ColorStateList r0 = r0.f7932a
            if (r0 == 0) goto L_0x0038
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0038
            r0 = r1
            goto L_0x0039
        L_0x0038:
            r0 = r2
        L_0x0039:
            if (r0 != 0) goto L_0x0066
            boolean r0 = r3.R
            if (r0 == 0) goto L_0x0049
            android.graphics.drawable.Drawable r0 = r3.S
            if (r0 == 0) goto L_0x0049
            boolean r0 = r3.Q
            if (r0 == 0) goto L_0x0049
            r0 = r1
            goto L_0x004a
        L_0x0049:
            r0 = r2
        L_0x004a:
            if (r0 != 0) goto L_0x0066
            android.graphics.drawable.Drawable r0 = r3.G
            boolean r0 = t(r0)
            if (r0 != 0) goto L_0x0066
            android.graphics.drawable.Drawable r0 = r3.S
            boolean r0 = t(r0)
            if (r0 != 0) goto L_0x0066
            android.content.res.ColorStateList r3 = r3.f3206w0
            boolean r3 = s(r3)
            if (r3 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r1 = r2
        L_0x0066:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.isStateful():boolean");
    }

    public final void n(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            c.b(drawable, c.a(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.L) {
                if (drawable.isStateful()) {
                    drawable.setState(this.y0);
                }
                b.h(drawable, this.N);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.G;
            if (drawable == drawable2 && this.J) {
                b.h(drawable2, this.H);
            }
        }
    }

    public final void o(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (R() || Q()) {
            float f9 = this.W + this.X;
            Drawable drawable = this.f3203r0 ? this.S : this.G;
            float f10 = this.I;
            if (f10 <= 0.0f && drawable != null) {
                f10 = (float) drawable.getIntrinsicWidth();
            }
            if (c.a(this) == 0) {
                float f11 = ((float) rect.left) + f9;
                rectF.left = f11;
                rectF.right = f11 + f10;
            } else {
                float f12 = ((float) rect.right) - f9;
                rectF.right = f12;
                rectF.left = f12 - f10;
            }
            Drawable drawable2 = this.f3203r0 ? this.S : this.G;
            float f13 = this.I;
            if (f13 <= 0.0f && drawable2 != null) {
                float ceil = (float) Math.ceil((double) n.a(this.f3190e0, 24));
                if (((float) drawable2.getIntrinsicHeight()) <= ceil) {
                    ceil = (float) drawable2.getIntrinsicHeight();
                }
                f13 = ceil;
            }
            float exactCenterY = rect.exactCenterY() - (f13 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f13;
        }
    }

    public final boolean onLayoutDirectionChanged(int i8) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i8);
        if (R()) {
            onLayoutDirectionChanged |= c.b(this.G, i8);
        }
        if (Q()) {
            onLayoutDirectionChanged |= c.b(this.S, i8);
        }
        if (S()) {
            onLayoutDirectionChanged |= c.b(this.L, i8);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    public final boolean onLevelChange(int i8) {
        boolean onLevelChange = super.onLevelChange(i8);
        if (R()) {
            onLevelChange |= this.G.setLevel(i8);
        }
        if (Q()) {
            onLevelChange |= this.S.setLevel(i8);
        }
        if (S()) {
            onLevelChange |= this.L.setLevel(i8);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public final boolean onStateChange(int[] iArr) {
        if (this.F0) {
            super.onStateChange(iArr);
        }
        return v(iArr, this.y0);
    }

    public final float p() {
        if (!R() && !Q()) {
            return 0.0f;
        }
        float f9 = this.X;
        Drawable drawable = this.f3203r0 ? this.S : this.G;
        float f10 = this.I;
        if (f10 <= 0.0f && drawable != null) {
            f10 = (float) drawable.getIntrinsicWidth();
        }
        return f9 + f10 + this.Y;
    }

    public final float q() {
        if (S()) {
            return this.f3187b0 + this.O + this.f3188c0;
        }
        return 0.0f;
    }

    public final float r() {
        return this.F0 ? this.f8412a.f8433a.e.a(g()) : this.A;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j8) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j8);
        }
    }

    public final void setAlpha(int i8) {
        if (this.f3204t0 != i8) {
            this.f3204t0 = i8;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.u0 != colorFilter) {
            this.u0 = colorFilter;
            invalidateSelf();
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (this.f3206w0 != colorStateList) {
            this.f3206w0 = colorStateList;
            onStateChange(getState());
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f3208x0 != mode) {
            this.f3208x0 = mode;
            ColorStateList colorStateList = this.f3206w0;
            this.f3205v0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z8, boolean z9) {
        boolean visible = super.setVisible(z8, z9);
        if (R()) {
            visible |= this.G.setVisible(z8, z9);
        }
        if (Q()) {
            visible |= this.S.setVisible(z8, z9);
        }
        if (S()) {
            visible |= this.L.setVisible(z8, z9);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void u() {
        C0033a aVar = this.B0.get();
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final boolean v(int[] iArr, int[] iArr2) {
        boolean z8;
        boolean z9;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f3207x;
        int d9 = d(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f3197l0) : 0);
        boolean z10 = true;
        if (this.f3197l0 != d9) {
            this.f3197l0 = d9;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.y;
        int d10 = d(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f3198m0) : 0);
        if (this.f3198m0 != d10) {
            this.f3198m0 = d10;
            onStateChange = true;
        }
        int a9 = c0.a.a(d10, d9);
        if ((this.f3199n0 != a9) || (this.f8412a.f8435c == null)) {
            this.f3199n0 = a9;
            j(ColorStateList.valueOf(a9));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.B;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f3200o0) : 0;
        if (this.f3200o0 != colorForState) {
            this.f3200o0 = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.A0 == null || !w4.a.b(iArr)) ? 0 : this.A0.getColorForState(iArr, this.f3201p0);
        if (this.f3201p0 != colorForState2) {
            this.f3201p0 = colorForState2;
            if (this.f3210z0) {
                onStateChange = true;
            }
        }
        v4.d dVar = this.f3196k0.f7778f;
        int colorForState3 = (dVar == null || (colorStateList = dVar.f7932a) == null) ? 0 : colorStateList.getColorForState(iArr, this.f3202q0);
        if (this.f3202q0 != colorForState3) {
            this.f3202q0 = colorForState3;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            int length = state.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    break;
                } else if (state[i8] == 16842912) {
                    z8 = true;
                    break;
                } else {
                    i8++;
                }
            }
        }
        z8 = false;
        boolean z11 = z8 && this.Q;
        if (this.f3203r0 == z11 || this.S == null) {
            z9 = false;
        } else {
            float p8 = p();
            this.f3203r0 = z11;
            if (p8 != p()) {
                onStateChange = true;
                z9 = true;
            } else {
                z9 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.f3206w0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.s0) : 0;
        if (this.s0 != colorForState4) {
            this.s0 = colorForState4;
            ColorStateList colorStateList6 = this.f3206w0;
            PorterDuff.Mode mode = this.f3208x0;
            this.f3205v0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            z10 = onStateChange;
        }
        if (t(this.G)) {
            z10 |= this.G.setState(iArr);
        }
        if (t(this.S)) {
            z10 |= this.S.setState(iArr);
        }
        if (t(this.L)) {
            int[] iArr3 = new int[(iArr.length + iArr2.length)];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z10 |= this.L.setState(iArr3);
        }
        if (t(this.M)) {
            z10 |= this.M.setState(iArr2);
        }
        if (z10) {
            invalidateSelf();
        }
        if (z9) {
            u();
        }
        return z10;
    }

    public final void w(boolean z8) {
        if (this.Q != z8) {
            this.Q = z8;
            float p8 = p();
            if (!z8 && this.f3203r0) {
                this.f3203r0 = false;
            }
            float p9 = p();
            invalidateSelf();
            if (p8 != p9) {
                u();
            }
        }
    }

    public final void x(Drawable drawable) {
        if (this.S != drawable) {
            float p8 = p();
            this.S = drawable;
            float p9 = p();
            T(this.S);
            n(this.S);
            invalidateSelf();
            if (p8 != p9) {
                u();
            }
        }
    }

    public final void y(ColorStateList colorStateList) {
        if (this.T != colorStateList) {
            this.T = colorStateList;
            if (this.R && this.S != null && this.Q) {
                b.h(this.S, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void z(boolean z8) {
        if (this.R != z8) {
            boolean Q2 = Q();
            this.R = z8;
            boolean Q3 = Q();
            if (Q2 != Q3) {
                if (Q3) {
                    n(this.S);
                } else {
                    T(this.S);
                }
                invalidateSelf();
                u();
            }
        }
    }
}
