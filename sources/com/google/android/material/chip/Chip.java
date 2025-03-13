package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.g;
import androidx.fragment.app.u;
import androidx.health.services.client.R;
import com.google.android.material.chip.a;
import h0.e;
import j0.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import k0.c;
import k3.j;
import v4.d;
import y4.i;
import y4.m;

public class Chip extends g implements a.C0033a, m {

    /* renamed from: t  reason: collision with root package name */
    public static final Rect f3157t = new Rect();

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f3158u = {16842913};

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f3159v = {16842911};

    /* renamed from: d  reason: collision with root package name */
    public a f3160d;
    public InsetDrawable e;

    /* renamed from: f  reason: collision with root package name */
    public RippleDrawable f3161f;

    /* renamed from: g  reason: collision with root package name */
    public View.OnClickListener f3162g;

    /* renamed from: h  reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f3163h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3164i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3165j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3166k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3167l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3168m;

    /* renamed from: n  reason: collision with root package name */
    public int f3169n;

    /* renamed from: o  reason: collision with root package name */
    public int f3170o;

    /* renamed from: p  reason: collision with root package name */
    public final b f3171p;

    /* renamed from: q  reason: collision with root package name */
    public final Rect f3172q = new Rect();
    public final RectF r = new RectF();

    /* renamed from: s  reason: collision with root package name */
    public final a f3173s = new a();

    public class a extends u {
        public a() {
        }

        public final void f(int i8) {
        }

        public final void g(Typeface typeface, boolean z8) {
            Chip chip = Chip.this;
            a aVar = chip.f3160d;
            chip.setText(aVar.D0 ? aVar.E : chip.getText());
            chip.requestLayout();
            chip.invalidate();
        }
    }

    public class b extends q0.a {
        public b(Chip chip) {
            super(chip);
        }

        public final void l(ArrayList arrayList) {
            boolean z8 = false;
            arrayList.add(0);
            Rect rect = Chip.f3157t;
            Chip chip = Chip.this;
            if (chip.e()) {
                a aVar = chip.f3160d;
                if (aVar != null && aVar.K) {
                    z8 = true;
                }
                if (z8 && chip.f3162g != null) {
                    arrayList.add(1);
                }
            }
        }

        public final boolean o(int i8, int i9) {
            boolean z8 = false;
            if (i9 == 16) {
                Chip chip = Chip.this;
                if (i8 == 0) {
                    return chip.performClick();
                }
                if (i8 == 1) {
                    chip.playSoundEffect(0);
                    View.OnClickListener onClickListener = chip.f3162g;
                    if (onClickListener != null) {
                        onClickListener.onClick(chip);
                        z8 = true;
                    }
                    chip.f3171p.t(1, 1);
                }
            }
            return z8;
        }

        public final void p(c cVar) {
            Chip chip = Chip.this;
            boolean f9 = chip.f();
            AccessibilityNodeInfo accessibilityNodeInfo = cVar.f5085a;
            accessibilityNodeInfo.setCheckable(f9);
            accessibilityNodeInfo.setClickable(chip.isClickable());
            cVar.f((chip.f() || chip.isClickable()) ? chip.f() ? "android.widget.CompoundButton" : "android.widget.Button" : "android.view.View");
            accessibilityNodeInfo.setText(chip.getText());
        }

        public final void q(int i8, c cVar) {
            AccessibilityNodeInfo accessibilityNodeInfo = cVar.f5085a;
            CharSequence charSequence = "";
            if (i8 == 1) {
                Chip chip = Chip.this;
                CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
                if (closeIconContentDescription == null) {
                    CharSequence text = chip.getText();
                    Context context = chip.getContext();
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    closeIconContentDescription = context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim();
                }
                cVar.h(closeIconContentDescription);
                accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
                cVar.b(c.a.e);
                accessibilityNodeInfo.setEnabled(chip.isEnabled());
                return;
            }
            cVar.h(charSequence);
            accessibilityNodeInfo.setBoundsInParent(Chip.f3157t);
        }

        public final void r(int i8, boolean z8) {
            if (i8 == 1) {
                Chip chip = Chip.this;
                chip.f3167l = z8;
                chip.refreshDrawableState();
            }
        }

        public final int v(float f9, float f10) {
            Rect rect = Chip.f3157t;
            Chip chip = Chip.this;
            return (!chip.e() || !chip.getCloseIconTouchBounds().contains(f9, f10)) ? 0 : 1;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x026f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r18, android.util.AttributeSet r19) {
        /*
            r17 = this;
            r0 = r17
            r7 = r19
            r1 = -2146303331(0xffffffff8012029d, float:-1.653976E-39)
            r2 = -2147221314(0xffffffff800400be, float:-3.67608E-40)
            r3 = r18
            android.content.Context r1 = d5.a.a(r3, r7, r2, r1)
            r0.<init>(r1, r7, r2)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f3172q = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.r = r1
            com.google.android.material.chip.Chip$a r1 = new com.google.android.material.chip.Chip$a
            r1.<init>()
            r0.f3173s = r1
            android.content.Context r8 = r17.getContext()
            r9 = 8388627(0x800013, float:1.175497E-38)
            r10 = 1
            if (r7 != 0) goto L_0x0033
            goto L_0x0093
        L_0x0033:
            java.lang.String r1 = "http://schemas.android.com/apk/res/android"
            java.lang.String r2 = "background"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            java.lang.String r3 = "Chip"
            if (r2 == 0) goto L_0x0044
            java.lang.String r2 = "Do not set the background; Chip manages its own background drawable."
            android.util.Log.w(r3, r2)
        L_0x0044:
            java.lang.String r2 = "drawableLeft"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x03a7
            java.lang.String r2 = "drawableStart"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x039f
            java.lang.String r2 = "drawableEnd"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            java.lang.String r4 = "Please set end drawable using R.attr#closeIcon."
            if (r2 != 0) goto L_0x0399
            java.lang.String r2 = "drawableRight"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x0393
            java.lang.String r2 = "singleLine"
            boolean r2 = r7.getAttributeBooleanValue(r1, r2, r10)
            if (r2 == 0) goto L_0x038b
            java.lang.String r2 = "lines"
            int r2 = r7.getAttributeIntValue(r1, r2, r10)
            if (r2 != r10) goto L_0x038b
            java.lang.String r2 = "minLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r10)
            if (r2 != r10) goto L_0x038b
            java.lang.String r2 = "maxLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r10)
            if (r2 != r10) goto L_0x038b
            java.lang.String r2 = "gravity"
            int r1 = r7.getAttributeIntValue(r1, r2, r9)
            if (r1 == r9) goto L_0x0093
            java.lang.String r1 = "Chip text must be vertically center and start aligned"
            android.util.Log.w(r3, r1)
        L_0x0093:
            com.google.android.material.chip.a r11 = new com.google.android.material.chip.a
            r11.<init>(r8, r7)
            android.content.Context r1 = r11.f3190e0
            int[] r12 = a1.a.M
            r13 = 0
            int[] r6 = new int[r13]
            r5 = -2146303331(0xffffffff8012029d, float:-1.653976E-39)
            r4 = -2147221314(0xffffffff800400be, float:-3.67608E-40)
            r2 = r19
            r3 = r12
            android.content.res.TypedArray r1 = u4.k.d(r1, r2, r3, r4, r5, r6)
            r14 = 37
            boolean r2 = r1.hasValue(r14)
            r11.F0 = r2
            r2 = 24
            android.content.Context r3 = r11.f3190e0
            android.content.res.ColorStateList r2 = v4.c.a(r3, r1, r2)
            android.content.res.ColorStateList r4 = r11.f3207x
            if (r4 == r2) goto L_0x00c9
            r11.f3207x = r2
            int[] r2 = r11.getState()
            r11.onStateChange(r2)
        L_0x00c9:
            r2 = 11
            android.content.res.ColorStateList r2 = v4.c.a(r3, r1, r2)
            android.content.res.ColorStateList r4 = r11.y
            if (r4 == r2) goto L_0x00dc
            r11.y = r2
            int[] r2 = r11.getState()
            r11.onStateChange(r2)
        L_0x00dc:
            r2 = 19
            r4 = 0
            float r2 = r1.getDimension(r2, r4)
            float r5 = r11.f3209z
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x00f1
            r11.f3209z = r2
            r11.invalidateSelf()
            r11.u()
        L_0x00f1:
            r2 = 12
            boolean r5 = r1.hasValue(r2)
            if (r5 == 0) goto L_0x0100
            float r2 = r1.getDimension(r2, r4)
            r11.A(r2)
        L_0x0100:
            r2 = 22
            android.content.res.ColorStateList r2 = v4.c.a(r3, r1, r2)
            r11.F(r2)
            r2 = 23
            float r2 = r1.getDimension(r2, r4)
            r11.G(r2)
            r2 = 36
            android.content.res.ColorStateList r2 = v4.c.a(r3, r1, r2)
            r11.P(r2)
            r2 = 5
            java.lang.CharSequence r2 = r1.getText(r2)
            if (r2 != 0) goto L_0x0124
            java.lang.String r2 = ""
        L_0x0124:
            java.lang.CharSequence r5 = r11.E
            boolean r5 = android.text.TextUtils.equals(r5, r2)
            u4.i r6 = r11.f3196k0
            if (r5 != 0) goto L_0x0138
            r11.E = r2
            r6.f7777d = r10
            r11.invalidateSelf()
            r11.u()
        L_0x0138:
            boolean r2 = r1.hasValue(r13)
            r5 = 0
            if (r2 == 0) goto L_0x014b
            int r2 = r1.getResourceId(r13, r13)
            if (r2 == 0) goto L_0x014b
            v4.d r15 = new v4.d
            r15.<init>(r3, r2)
            goto L_0x014c
        L_0x014b:
            r15 = r5
        L_0x014c:
            float r2 = r15.f7941k
            float r2 = r1.getDimension(r10, r2)
            r15.f7941k = r2
            r6.b(r15, r3)
            r2 = 3
            int r6 = r1.getInt(r2, r13)
            if (r6 == r10) goto L_0x016a
            r15 = 2
            if (r6 == r15) goto L_0x0167
            if (r6 == r2) goto L_0x0164
            goto L_0x016e
        L_0x0164:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            goto L_0x016c
        L_0x0167:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L_0x016c
        L_0x016a:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.START
        L_0x016c:
            r11.C0 = r2
        L_0x016e:
            r2 = 18
            boolean r2 = r1.getBoolean(r2, r13)
            r11.E(r2)
            java.lang.String r2 = "http://schemas.android.com/apk/res-auto"
            if (r7 == 0) goto L_0x0194
            java.lang.String r6 = "chipIconEnabled"
            java.lang.String r6 = r7.getAttributeValue(r2, r6)
            if (r6 == 0) goto L_0x0194
            java.lang.String r6 = "chipIconVisible"
            java.lang.String r6 = r7.getAttributeValue(r2, r6)
            if (r6 != 0) goto L_0x0194
            r6 = 15
            boolean r6 = r1.getBoolean(r6, r13)
            r11.E(r6)
        L_0x0194:
            r6 = 14
            android.graphics.drawable.Drawable r6 = v4.c.c(r3, r1, r6)
            r11.B(r6)
            r6 = 17
            boolean r15 = r1.hasValue(r6)
            if (r15 == 0) goto L_0x01ac
            android.content.res.ColorStateList r6 = v4.c.a(r3, r1, r6)
            r11.D(r6)
        L_0x01ac:
            r6 = 16
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r6 = r1.getDimension(r6, r15)
            r11.C(r6)
            r6 = 31
            boolean r6 = r1.getBoolean(r6, r13)
            r11.M(r6)
            if (r7 == 0) goto L_0x01db
            java.lang.String r6 = "closeIconEnabled"
            java.lang.String r6 = r7.getAttributeValue(r2, r6)
            if (r6 == 0) goto L_0x01db
            java.lang.String r6 = "closeIconVisible"
            java.lang.String r6 = r7.getAttributeValue(r2, r6)
            if (r6 != 0) goto L_0x01db
            r6 = 26
            boolean r6 = r1.getBoolean(r6, r13)
            r11.M(r6)
        L_0x01db:
            r6 = 25
            android.graphics.drawable.Drawable r6 = v4.c.c(r3, r1, r6)
            r11.H(r6)
            r6 = 30
            android.content.res.ColorStateList r6 = v4.c.a(r3, r1, r6)
            r11.L(r6)
            r6 = 28
            float r6 = r1.getDimension(r6, r4)
            r11.J(r6)
            r6 = 6
            boolean r6 = r1.getBoolean(r6, r13)
            r11.w(r6)
            r6 = 10
            boolean r6 = r1.getBoolean(r6, r13)
            r11.z(r6)
            if (r7 == 0) goto L_0x0222
            java.lang.String r6 = "checkedIconEnabled"
            java.lang.String r6 = r7.getAttributeValue(r2, r6)
            if (r6 == 0) goto L_0x0222
            java.lang.String r6 = "checkedIconVisible"
            java.lang.String r2 = r7.getAttributeValue(r2, r6)
            if (r2 != 0) goto L_0x0222
            r2 = 8
            boolean r2 = r1.getBoolean(r2, r13)
            r11.z(r2)
        L_0x0222:
            r2 = 7
            android.graphics.drawable.Drawable r2 = v4.c.c(r3, r1, r2)
            r11.x(r2)
            r2 = 9
            boolean r6 = r1.hasValue(r2)
            if (r6 == 0) goto L_0x0239
            android.content.res.ColorStateList r2 = v4.c.a(r3, r1, r2)
            r11.y(r2)
        L_0x0239:
            r2 = 39
            boolean r6 = r1.hasValue(r2)
            if (r6 == 0) goto L_0x024c
            int r2 = r1.getResourceId(r2, r13)
            if (r2 == 0) goto L_0x024c
            f4.g r2 = f4.g.a(r3, r2)
            goto L_0x024d
        L_0x024c:
            r2 = r5
        L_0x024d:
            r11.U = r2
            r2 = 33
            boolean r6 = r1.hasValue(r2)
            if (r6 == 0) goto L_0x0261
            int r2 = r1.getResourceId(r2, r13)
            if (r2 == 0) goto L_0x0261
            f4.g r5 = f4.g.a(r3, r2)
        L_0x0261:
            r11.V = r5
            r2 = 21
            float r2 = r1.getDimension(r2, r4)
            float r3 = r11.W
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x0277
            r11.W = r2
            r11.invalidateSelf()
            r11.u()
        L_0x0277:
            r2 = 35
            float r2 = r1.getDimension(r2, r4)
            r11.O(r2)
            r2 = 34
            float r2 = r1.getDimension(r2, r4)
            r11.N(r2)
            r2 = 41
            float r2 = r1.getDimension(r2, r4)
            float r3 = r11.Z
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x029d
            r11.Z = r2
            r11.invalidateSelf()
            r11.u()
        L_0x029d:
            r2 = 40
            float r2 = r1.getDimension(r2, r4)
            float r3 = r11.f3186a0
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x02b1
            r11.f3186a0 = r2
            r11.invalidateSelf()
            r11.u()
        L_0x02b1:
            r2 = 29
            float r2 = r1.getDimension(r2, r4)
            r11.K(r2)
            r2 = 27
            float r2 = r1.getDimension(r2, r4)
            r11.I(r2)
            r2 = 13
            float r2 = r1.getDimension(r2, r4)
            float r3 = r11.f3189d0
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x02d7
            r11.f3189d0 = r2
            r11.invalidateSelf()
            r11.u()
        L_0x02d7:
            r2 = 4
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r11.E0 = r2
            r1.recycle()
            r15 = -2146303331(0xffffffff8012029d, float:-1.653976E-39)
            int[] r6 = new int[r13]
            r16 = -2147221314(0xffffffff800400be, float:-3.67608E-40)
            r4 = -2147221314(0xffffffff800400be, float:-3.67608E-40)
            r5 = -2146303331(0xffffffff8012029d, float:-1.653976E-39)
            r1 = r8
            r2 = r19
            r3 = r12
            android.content.res.TypedArray r1 = u4.k.d(r1, r2, r3, r4, r5, r6)
            r2 = 32
            boolean r2 = r1.getBoolean(r2, r13)
            r0.f3168m = r2
            android.content.Context r2 = r17.getContext()
            r3 = 48
            float r2 = u4.n.a(r2, r3)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            float r2 = (float) r2
            r3 = 20
            float r2 = r1.getDimension(r3, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            r0.f3170o = r2
            r1.recycle()
            r0.setChipDrawable(r11)
            int[] r1 = j0.x.f4957a
            float r1 = j0.x.h.i(r17)
            r11.i(r1)
            int[] r6 = new int[r13]
            r1 = r8
            r2 = r19
            r3 = r12
            r4 = r16
            r5 = r15
            android.content.res.TypedArray r1 = u4.k.d(r1, r2, r3, r4, r5, r6)
            boolean r2 = r1.hasValue(r14)
            r1.recycle()
            com.google.android.material.chip.Chip$b r1 = new com.google.android.material.chip.Chip$b
            r1.<init>(r0)
            r0.f3171p = r1
            r17.g()
            if (r2 != 0) goto L_0x0357
            n4.a r1 = new n4.a
            r1.<init>(r0)
            r0.setOutlineProvider(r1)
        L_0x0357:
            boolean r1 = r0.f3164i
            r0.setChecked(r1)
            java.lang.CharSequence r1 = r11.E
            r0.setText(r1)
            android.text.TextUtils$TruncateAt r1 = r11.C0
            r0.setEllipsize(r1)
            r17.j()
            com.google.android.material.chip.a r1 = r0.f3160d
            boolean r1 = r1.D0
            if (r1 != 0) goto L_0x0375
            r0.setLines(r10)
            r0.setHorizontallyScrolling(r10)
        L_0x0375:
            r0.setGravity(r9)
            r17.i()
            boolean r1 = r0.f3168m
            if (r1 == 0) goto L_0x0384
            int r1 = r0.f3170o
            r0.setMinHeight(r1)
        L_0x0384:
            int r1 = j0.x.d.d(r17)
            r0.f3169n = r1
            return
        L_0x038b:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Chip does not support multi-line text"
            r0.<init>(r1)
            throw r0
        L_0x0393:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r4)
            throw r0
        L_0x0399:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r4)
            throw r0
        L_0x039f:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Please set start drawable using R.attr#chipIcon."
            r0.<init>(r1)
            throw r0
        L_0x03a7:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Please set left drawable using R.attr#chipIcon."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.r;
        rectF.setEmpty();
        if (e() && this.f3162g != null) {
            a aVar = this.f3160d;
            Rect bounds = aVar.getBounds();
            rectF.setEmpty();
            if (aVar.S()) {
                float f9 = aVar.f3189d0 + aVar.f3188c0 + aVar.O + aVar.f3187b0 + aVar.f3186a0;
                if (d0.c.a(aVar) == 0) {
                    float f10 = (float) bounds.right;
                    rectF.right = f10;
                    rectF.left = f10 - f9;
                } else {
                    float f11 = (float) bounds.left;
                    rectF.left = f11;
                    rectF.right = f11 + f9;
                }
                rectF.top = (float) bounds.top;
                rectF.bottom = (float) bounds.bottom;
            }
        }
        return rectF;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        Rect rect = this.f3172q;
        rect.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return rect;
    }

    private d getTextAppearance() {
        a aVar = this.f3160d;
        if (aVar != null) {
            return aVar.f3196k0.f7778f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z8) {
        if (this.f3166k != z8) {
            this.f3166k = z8;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z8) {
        if (this.f3165j != z8) {
            this.f3165j = z8;
            refreshDrawableState();
        }
    }

    public final void a() {
        d(this.f3170o);
        requestLayout();
        invalidateOutline();
    }

    public final void d(int i8) {
        this.f3170o = i8;
        int i9 = 0;
        if (!this.f3168m) {
            InsetDrawable insetDrawable = this.e;
            if (insetDrawable == null) {
                h();
            } else if (insetDrawable != null) {
                this.e = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                h();
            }
        } else {
            int max = Math.max(0, i8 - ((int) this.f3160d.f3209z));
            int max2 = Math.max(0, i8 - this.f3160d.getIntrinsicWidth());
            if (max2 > 0 || max > 0) {
                int i10 = max2 > 0 ? max2 / 2 : 0;
                if (max > 0) {
                    i9 = max / 2;
                }
                int i11 = i9;
                if (this.e != null) {
                    Rect rect = new Rect();
                    this.e.getPadding(rect);
                    if (rect.top == i11 && rect.bottom == i11 && rect.left == i10 && rect.right == i10) {
                        h();
                        return;
                    }
                }
                if (getMinHeight() != i8) {
                    setMinHeight(i8);
                }
                if (getMinWidth() != i8) {
                    setMinWidth(i8);
                }
                this.e = new InsetDrawable(this.f3160d, i10, i11, i10, i11);
                h();
                return;
            }
            InsetDrawable insetDrawable2 = this.e;
            if (insetDrawable2 == null) {
                h();
            } else if (insetDrawable2 != null) {
                this.e = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                h();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0080, code lost:
        if (r0 != Integer.MIN_VALUE) goto L_0x0082;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            java.lang.Class<q0.a> r0 = q0.a.class
            int r1 = r10.getAction()
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 10
            com.google.android.material.chip.Chip$b r4 = r9.f3171p
            r5 = 1
            r6 = 0
            if (r1 != r3) goto L_0x0049
            java.lang.String r1 = "m"
            java.lang.reflect.Field r1 = r0.getDeclaredField(r1)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0041 }
            r1.setAccessible(r5)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0041 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0041 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0041 }
            int r1 = r1.intValue()     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0041 }
            if (r1 == r2) goto L_0x0049
            java.lang.String r1 = "u"
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0041 }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0041 }
            r7[r6] = r8     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0041 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r7)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0041 }
            r0.setAccessible(r5)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0041 }
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0041 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0041 }
            r1[r6] = r7     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0041 }
            r0.invoke(r4, r1)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0041 }
            r0 = r5
            goto L_0x004a
        L_0x0041:
            r0 = move-exception
            java.lang.String r1 = "Chip"
            java.lang.String r7 = "Unable to send Accessibility Exit event"
            android.util.Log.e(r1, r7, r0)
        L_0x0049:
            r0 = r6
        L_0x004a:
            if (r0 != 0) goto L_0x008f
            android.view.accessibility.AccessibilityManager r0 = r4.f6384h
            boolean r1 = r0.isEnabled()
            if (r1 == 0) goto L_0x0084
            boolean r0 = r0.isTouchExplorationEnabled()
            if (r0 != 0) goto L_0x005b
            goto L_0x0084
        L_0x005b:
            int r0 = r10.getAction()
            r1 = 7
            if (r0 == r1) goto L_0x0071
            r1 = 9
            if (r0 == r1) goto L_0x0071
            if (r0 == r3) goto L_0x0069
            goto L_0x0084
        L_0x0069:
            int r0 = r4.f6389m
            if (r0 == r2) goto L_0x0084
            r4.u(r2)
            goto L_0x0082
        L_0x0071:
            float r0 = r10.getX()
            float r1 = r10.getY()
            int r0 = r4.v(r0, r1)
            r4.u(r0)
            if (r0 == r2) goto L_0x0084
        L_0x0082:
            r0 = r5
            goto L_0x0085
        L_0x0084:
            r0 = r6
        L_0x0085:
            if (r0 != 0) goto L_0x008f
            boolean r9 = super.dispatchHoverEvent(r10)
            if (r9 == 0) goto L_0x008e
            goto L_0x008f
        L_0x008e:
            r5 = r6
        L_0x008f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        b bVar = this.f3171p;
        bVar.getClass();
        int i8 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i9 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case EXERCISE_TYPE_DUMBBELL_FRONT_RAISE_VALUE:
                        case EXERCISE_TYPE_DUMBBELL_LATERAL_RAISE_VALUE:
                        case EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_LEFT_ARM_VALUE:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i9 = 33;
                                } else if (keyCode == 21) {
                                    i9 = 17;
                                } else if (keyCode != 22) {
                                    i9 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                int i10 = 0;
                                while (i8 < repeatCount && bVar.m(i9, (Rect) null)) {
                                    i8++;
                                    i10 = 1;
                                }
                                i8 = i10;
                                break;
                            }
                            break;
                        case EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_RIGHT_ARM_VALUE:
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i11 = bVar.f6388l;
                    if (i11 != Integer.MIN_VALUE) {
                        bVar.o(i11, 16);
                    }
                    i8 = 1;
                }
            } else if (keyEvent.hasNoModifiers()) {
                i8 = bVar.m(2, (Rect) null);
            } else if (keyEvent.hasModifiers(1)) {
                i8 = bVar.m(1, (Rect) null);
            }
        }
        if (i8 == 0 || bVar.f6388l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public final void drawableStateChanged() {
        int i8;
        super.drawableStateChanged();
        a aVar = this.f3160d;
        boolean z8 = false;
        if (aVar != null && a.t(aVar.L)) {
            a aVar2 = this.f3160d;
            int isEnabled = isEnabled();
            if (this.f3167l) {
                isEnabled++;
            }
            if (this.f3166k) {
                isEnabled++;
            }
            if (this.f3165j) {
                isEnabled++;
            }
            if (isChecked()) {
                isEnabled++;
            }
            int[] iArr = new int[isEnabled];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i8 = 1;
            } else {
                i8 = 0;
            }
            if (this.f3167l) {
                iArr[i8] = 16842908;
                i8++;
            }
            if (this.f3166k) {
                iArr[i8] = 16843623;
                i8++;
            }
            if (this.f3165j) {
                iArr[i8] = 16842919;
                i8++;
            }
            if (isChecked()) {
                iArr[i8] = 16842913;
            }
            if (!Arrays.equals(aVar2.y0, iArr)) {
                aVar2.y0 = iArr;
                if (aVar2.S()) {
                    z8 = aVar2.v(aVar2.getState(), iArr);
                }
            }
        }
        if (z8) {
            invalidate();
        }
    }

    public final boolean e() {
        a aVar = this.f3160d;
        if (aVar != null) {
            Drawable drawable = aVar.L;
            if (drawable == null) {
                drawable = null;
            } else if (drawable instanceof d0.d) {
                drawable = ((d0.d) drawable).a();
            }
            if (drawable != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        a aVar = this.f3160d;
        return aVar != null && aVar.Q;
    }

    public final void g() {
        b bVar;
        if (e()) {
            a aVar = this.f3160d;
            if ((aVar != null && aVar.K) && this.f3162g != null) {
                bVar = this.f3171p;
                x.i(this, bVar);
            }
        }
        bVar = null;
        x.i(this, bVar);
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.e;
        return insetDrawable == null ? this.f3160d : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        a aVar = this.f3160d;
        if (aVar != null) {
            return aVar.S;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        a aVar = this.f3160d;
        if (aVar != null) {
            return aVar.T;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        a aVar = this.f3160d;
        if (aVar != null) {
            return aVar.y;
        }
        return null;
    }

    public float getChipCornerRadius() {
        a aVar = this.f3160d;
        if (aVar != null) {
            return Math.max(0.0f, aVar.r());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f3160d;
    }

    public float getChipEndPadding() {
        a aVar = this.f3160d;
        if (aVar != null) {
            return aVar.f3189d0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        a aVar = this.f3160d;
        if (aVar == null || (drawable = aVar.G) == null) {
            return null;
        }
        if (drawable instanceof d0.d) {
            drawable = ((d0.d) drawable).a();
        }
        return drawable;
    }

    public float getChipIconSize() {
        a aVar = this.f3160d;
        if (aVar != null) {
            return aVar.I;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        a aVar = this.f3160d;
        if (aVar != null) {
            return aVar.H;
        }
        return null;
    }

    public float getChipMinHeight() {
        a aVar = this.f3160d;
        if (aVar != null) {
            return aVar.f3209z;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        a aVar = this.f3160d;
        if (aVar != null) {
            return aVar.W;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        a aVar = this.f3160d;
        if (aVar != null) {
            return aVar.B;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        a aVar = this.f3160d;
        if (aVar != null) {
            return aVar.C;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        a aVar = this.f3160d;
        if (aVar == null || (drawable = aVar.L) == null) {
            return null;
        }
        if (drawable instanceof d0.d) {
            drawable = ((d0.d) drawable).a();
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        a aVar = this.f3160d;
        if (aVar != null) {
            return aVar.P;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        a aVar = this.f3160d;
        if (aVar != null) {
            return aVar.f3188c0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        a aVar = this.f3160d;
        if (aVar != null) {
            return aVar.O;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        a aVar = this.f3160d;
        if (aVar != null) {
            return aVar.f3187b0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        a aVar = this.f3160d;
        if (aVar != null) {
            return aVar.N;
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        a aVar = this.f3160d;
        if (aVar != null) {
            return aVar.C0;
        }
        return null;
    }

    public final void getFocusedRect(Rect rect) {
        b bVar = this.f3171p;
        if (bVar.f6388l == 1 || bVar.f6387k == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public f4.g getHideMotionSpec() {
        a aVar = this.f3160d;
        if (aVar != null) {
            return aVar.V;
        }
        return null;
    }

    public float getIconEndPadding() {
        a aVar = this.f3160d;
        if (aVar != null) {
            return aVar.Y;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        a aVar = this.f3160d;
        if (aVar != null) {
            return aVar.X;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        a aVar = this.f3160d;
        if (aVar != null) {
            return aVar.D;
        }
        return null;
    }

    public i getShapeAppearanceModel() {
        return this.f3160d.f8412a.f8433a;
    }

    public f4.g getShowMotionSpec() {
        a aVar = this.f3160d;
        if (aVar != null) {
            return aVar.U;
        }
        return null;
    }

    public float getTextEndPadding() {
        a aVar = this.f3160d;
        if (aVar != null) {
            return aVar.f3186a0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        a aVar = this.f3160d;
        if (aVar != null) {
            return aVar.Z;
        }
        return 0.0f;
    }

    public final void h() {
        ColorStateList colorStateList = this.f3160d.D;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f3161f = new RippleDrawable(colorStateList, getBackgroundDrawable(), (Drawable) null);
        a aVar = this.f3160d;
        if (aVar.f3210z0) {
            aVar.f3210z0 = false;
            aVar.A0 = null;
            aVar.onStateChange(aVar.getState());
        }
        RippleDrawable rippleDrawable = this.f3161f;
        int[] iArr = x.f4957a;
        x.c.q(this, rippleDrawable);
        i();
    }

    public final void i() {
        a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f3160d) != null) {
            int q8 = (int) (aVar.f3189d0 + aVar.f3186a0 + aVar.q());
            a aVar2 = this.f3160d;
            int p8 = (int) (aVar2.W + aVar2.Z + aVar2.p());
            if (this.e != null) {
                Rect rect = new Rect();
                this.e.getPadding(rect);
                p8 += rect.left;
                q8 += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int[] iArr = x.f4957a;
            x.d.k(this, p8, paddingTop, q8, paddingBottom);
        }
    }

    public final void j() {
        TextPaint paint = getPaint();
        a aVar = this.f3160d;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.c(getContext(), paint, this.f3173s);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        j.b0(this, this.f3160d);
    }

    public final int[] onCreateDrawableState(int i8) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i8 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f3158u);
        }
        if (f()) {
            View.mergeDrawableStates(onCreateDrawableState, f3159v);
        }
        return onCreateDrawableState;
    }

    public final void onFocusChanged(boolean z8, int i8, Rect rect) {
        super.onFocusChanged(z8, i8, rect);
        b bVar = this.f3171p;
        int i9 = bVar.f6388l;
        if (i9 != Integer.MIN_VALUE) {
            bVar.j(i9);
        }
        if (z8) {
            bVar.m(i8, rect);
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        boolean z8;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                z8 = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        z8 = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(z8);
        return super.onHoverEvent(motionEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i8;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((f() || isClickable()) ? f() ? "android.widget.CompoundButton" : "android.widget.Button" : "android.view.View");
        accessibilityNodeInfo.setCheckable(f());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            int i9 = -1;
            if (chipGroup.f7763c) {
                int i10 = 0;
                i8 = 0;
                while (true) {
                    if (i10 >= chipGroup.getChildCount()) {
                        break;
                    }
                    if (chipGroup.getChildAt(i10) instanceof Chip) {
                        if (((Chip) chipGroup.getChildAt(i10)) == this) {
                            break;
                        }
                        i8++;
                    }
                    i10++;
                }
            }
            i8 = -1;
            Object tag = getTag(R.id.row_index_key);
            if (tag instanceof Integer) {
                i9 = ((Integer) tag).intValue();
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) c.C0072c.a(i9, 1, i8, 1, isChecked()).f5100a);
        }
    }

    @TargetApi(24)
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i8) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    @TargetApi(17)
    public final void onRtlPropertiesChanged(int i8) {
        super.onRtlPropertiesChanged(i8);
        if (this.f3169n != i8) {
            this.f3169n = i8;
            i();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x004c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0045
            if (r0 == r2) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0040
            goto L_0x004c
        L_0x0021:
            boolean r0 = r5.f3165j
            if (r0 == 0) goto L_0x004c
            if (r1 != 0) goto L_0x004a
            r5.setCloseIconPressed(r3)
            goto L_0x004a
        L_0x002b:
            boolean r0 = r5.f3165j
            if (r0 == 0) goto L_0x0040
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.f3162g
            if (r0 == 0) goto L_0x0039
            r0.onClick(r5)
        L_0x0039:
            com.google.android.material.chip.Chip$b r0 = r5.f3171p
            r0.t(r2, r2)
            r0 = r2
            goto L_0x0041
        L_0x0040:
            r0 = r3
        L_0x0041:
            r5.setCloseIconPressed(r3)
            goto L_0x004d
        L_0x0045:
            if (r1 == 0) goto L_0x004c
            r5.setCloseIconPressed(r2)
        L_0x004a:
            r0 = r2
            goto L_0x004d
        L_0x004c:
            r0 = r3
        L_0x004d:
            if (r0 != 0) goto L_0x0057
            boolean r5 = super.onTouchEvent(r6)
            if (r5 == 0) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r2 = r3
        L_0x0057:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f3161f) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i8) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f3161f) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i8) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z8) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.w(z8);
        }
    }

    public void setCheckableResource(int i8) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.w(aVar.f3190e0.getResources().getBoolean(i8));
        }
    }

    public void setChecked(boolean z8) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        a aVar = this.f3160d;
        if (aVar == null) {
            this.f3164i = z8;
        } else if (aVar.Q) {
            boolean isChecked = isChecked();
            super.setChecked(z8);
            if (isChecked != z8 && (onCheckedChangeListener = this.f3163h) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z8);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.x(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z8) {
        setCheckedIconVisible(z8);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i8) {
        setCheckedIconVisible(i8);
    }

    public void setCheckedIconResource(int i8) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.x(g.a.a(aVar.f3190e0, i8));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.y(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i8) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.getClass();
            Object obj = g.a.f4440a;
            aVar.y(aVar.f3190e0.getColorStateList(i8));
        }
    }

    public void setCheckedIconVisible(int i8) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.z(aVar.f3190e0.getResources().getBoolean(i8));
        }
    }

    public void setCheckedIconVisible(boolean z8) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.z(z8);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        a aVar = this.f3160d;
        if (aVar != null && aVar.y != colorStateList) {
            aVar.y = colorStateList;
            aVar.onStateChange(aVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i8) {
        a aVar = this.f3160d;
        if (aVar != null) {
            Object obj = g.a.f4440a;
            ColorStateList colorStateList = aVar.f3190e0.getColorStateList(i8);
            if (aVar.y != colorStateList) {
                aVar.y = colorStateList;
                aVar.onStateChange(aVar.getState());
            }
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f9) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.A(f9);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i8) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.A(aVar.f3190e0.getResources().getDimension(i8));
        }
    }

    public void setChipDrawable(a aVar) {
        a aVar2 = this.f3160d;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.B0 = new WeakReference<>((Object) null);
            }
            this.f3160d = aVar;
            aVar.D0 = false;
            aVar.B0 = new WeakReference<>(this);
            d(this.f3170o);
        }
    }

    public void setChipEndPadding(float f9) {
        a aVar = this.f3160d;
        if (aVar != null && aVar.f3189d0 != f9) {
            aVar.f3189d0 = f9;
            aVar.invalidateSelf();
            aVar.u();
        }
    }

    public void setChipEndPaddingResource(int i8) {
        a aVar = this.f3160d;
        if (aVar != null) {
            float dimension = aVar.f3190e0.getResources().getDimension(i8);
            if (aVar.f3189d0 != dimension) {
                aVar.f3189d0 = dimension;
                aVar.invalidateSelf();
                aVar.u();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.B(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z8) {
        setChipIconVisible(z8);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i8) {
        setChipIconVisible(i8);
    }

    public void setChipIconResource(int i8) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.B(g.a.a(aVar.f3190e0, i8));
        }
    }

    public void setChipIconSize(float f9) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.C(f9);
        }
    }

    public void setChipIconSizeResource(int i8) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.C(aVar.f3190e0.getResources().getDimension(i8));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.D(colorStateList);
        }
    }

    public void setChipIconTintResource(int i8) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.getClass();
            Object obj = g.a.f4440a;
            aVar.D(aVar.f3190e0.getColorStateList(i8));
        }
    }

    public void setChipIconVisible(int i8) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.E(aVar.f3190e0.getResources().getBoolean(i8));
        }
    }

    public void setChipIconVisible(boolean z8) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.E(z8);
        }
    }

    public void setChipMinHeight(float f9) {
        a aVar = this.f3160d;
        if (aVar != null && aVar.f3209z != f9) {
            aVar.f3209z = f9;
            aVar.invalidateSelf();
            aVar.u();
        }
    }

    public void setChipMinHeightResource(int i8) {
        a aVar = this.f3160d;
        if (aVar != null) {
            float dimension = aVar.f3190e0.getResources().getDimension(i8);
            if (aVar.f3209z != dimension) {
                aVar.f3209z = dimension;
                aVar.invalidateSelf();
                aVar.u();
            }
        }
    }

    public void setChipStartPadding(float f9) {
        a aVar = this.f3160d;
        if (aVar != null && aVar.W != f9) {
            aVar.W = f9;
            aVar.invalidateSelf();
            aVar.u();
        }
    }

    public void setChipStartPaddingResource(int i8) {
        a aVar = this.f3160d;
        if (aVar != null) {
            float dimension = aVar.f3190e0.getResources().getDimension(i8);
            if (aVar.W != dimension) {
                aVar.W = dimension;
                aVar.invalidateSelf();
                aVar.u();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.F(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i8) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.getClass();
            Object obj = g.a.f4440a;
            aVar.F(aVar.f3190e0.getColorStateList(i8));
        }
    }

    public void setChipStrokeWidth(float f9) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.G(f9);
        }
    }

    public void setChipStrokeWidthResource(int i8) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.G(aVar.f3190e0.getResources().getDimension(i8));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i8) {
        setText(getResources().getString(i8));
    }

    public void setCloseIcon(Drawable drawable) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.H(drawable);
        }
        g();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        a aVar = this.f3160d;
        if (aVar != null && aVar.P != charSequence) {
            String str = h0.a.f4715d;
            Locale locale = Locale.getDefault();
            int i8 = e.f4736a;
            boolean z8 = true;
            if (e.a.a(locale) != 1) {
                z8 = false;
            }
            h0.a aVar2 = z8 ? h0.a.f4717g : h0.a.f4716f;
            aVar.P = aVar2.c(charSequence, aVar2.f4720c);
            aVar.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z8) {
        setCloseIconVisible(z8);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i8) {
        setCloseIconVisible(i8);
    }

    public void setCloseIconEndPadding(float f9) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.I(f9);
        }
    }

    public void setCloseIconEndPaddingResource(int i8) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.I(aVar.f3190e0.getResources().getDimension(i8));
        }
    }

    public void setCloseIconResource(int i8) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.H(g.a.a(aVar.f3190e0, i8));
        }
        g();
    }

    public void setCloseIconSize(float f9) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.J(f9);
        }
    }

    public void setCloseIconSizeResource(int i8) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.J(aVar.f3190e0.getResources().getDimension(i8));
        }
    }

    public void setCloseIconStartPadding(float f9) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.K(f9);
        }
    }

    public void setCloseIconStartPaddingResource(int i8) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.K(aVar.f3190e0.getResources().getDimension(i8));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.L(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i8) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.getClass();
            Object obj = g.a.f4440a;
            aVar.L(aVar.f3190e0.getColorStateList(i8));
        }
    }

    public void setCloseIconVisible(int i8) {
        setCloseIconVisible(getResources().getBoolean(i8));
    }

    public void setCloseIconVisible(boolean z8) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.M(z8);
        }
        g();
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i8, int i9, int i10, int i11) {
        if (i8 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i10 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i8, i9, i10, i11);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i8, int i9, int i10, int i11) {
        if (i8 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i10 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i8, i9, i10, i11);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f9) {
        super.setElevation(f9);
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.i(f9);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f3160d != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                a aVar = this.f3160d;
                if (aVar != null) {
                    aVar.C0 = truncateAt;
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z8) {
        this.f3168m = z8;
        d(this.f3170o);
    }

    public void setGravity(int i8) {
        if (i8 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i8);
        }
    }

    public void setHideMotionSpec(f4.g gVar) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.V = gVar;
        }
    }

    public void setHideMotionSpecResource(int i8) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.V = f4.g.a(aVar.f3190e0, i8);
        }
    }

    public void setIconEndPadding(float f9) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.N(f9);
        }
    }

    public void setIconEndPaddingResource(int i8) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.N(aVar.f3190e0.getResources().getDimension(i8));
        }
    }

    public void setIconStartPadding(float f9) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.O(f9);
        }
    }

    public void setIconStartPaddingResource(int i8) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.O(aVar.f3190e0.getResources().getDimension(i8));
        }
    }

    public void setLayoutDirection(int i8) {
        if (this.f3160d != null) {
            super.setLayoutDirection(i8);
        }
    }

    public void setLines(int i8) {
        if (i8 <= 1) {
            super.setLines(i8);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i8) {
        if (i8 <= 1) {
            super.setMaxLines(i8);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i8) {
        super.setMaxWidth(i8);
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.E0 = i8;
        }
    }

    public void setMinLines(int i8) {
        if (i8 <= 1) {
            super.setMinLines(i8);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f3163h = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f3162g = onClickListener;
        g();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.P(colorStateList);
        }
        if (!this.f3160d.f3210z0) {
            h();
        }
    }

    public void setRippleColorResource(int i8) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.getClass();
            Object obj = g.a.f4440a;
            aVar.P(aVar.f3190e0.getColorStateList(i8));
            if (!this.f3160d.f3210z0) {
                h();
            }
        }
    }

    public void setShapeAppearanceModel(i iVar) {
        this.f3160d.setShapeAppearanceModel(iVar);
    }

    public void setShowMotionSpec(f4.g gVar) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.U = gVar;
        }
    }

    public void setShowMotionSpecResource(int i8) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.U = f4.g.a(aVar.f3190e0, i8);
        }
    }

    public void setSingleLine(boolean z8) {
        if (z8) {
            super.setSingleLine(z8);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        a aVar = this.f3160d;
        if (aVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            super.setText(aVar.D0 ? null : charSequence, bufferType);
            a aVar2 = this.f3160d;
            if (aVar2 != null && !TextUtils.equals(aVar2.E, charSequence)) {
                aVar2.E = charSequence;
                aVar2.f3196k0.f7777d = true;
                aVar2.invalidateSelf();
                aVar2.u();
            }
        }
    }

    public void setTextAppearance(int i8) {
        super.setTextAppearance(i8);
        a aVar = this.f3160d;
        if (aVar != null) {
            Context context = aVar.f3190e0;
            aVar.f3196k0.b(new d(context, i8), context);
        }
        j();
    }

    public void setTextAppearanceResource(int i8) {
        setTextAppearance(getContext(), i8);
    }

    public void setTextEndPadding(float f9) {
        a aVar = this.f3160d;
        if (aVar != null && aVar.f3186a0 != f9) {
            aVar.f3186a0 = f9;
            aVar.invalidateSelf();
            aVar.u();
        }
    }

    public void setTextEndPaddingResource(int i8) {
        a aVar = this.f3160d;
        if (aVar != null) {
            float dimension = aVar.f3190e0.getResources().getDimension(i8);
            if (aVar.f3186a0 != dimension) {
                aVar.f3186a0 = dimension;
                aVar.invalidateSelf();
                aVar.u();
            }
        }
    }

    public void setTextStartPadding(float f9) {
        a aVar = this.f3160d;
        if (aVar != null && aVar.Z != f9) {
            aVar.Z = f9;
            aVar.invalidateSelf();
            aVar.u();
        }
    }

    public void setTextStartPaddingResource(int i8) {
        a aVar = this.f3160d;
        if (aVar != null) {
            float dimension = aVar.f3190e0.getResources().getDimension(i8);
            if (aVar.Z != dimension) {
                aVar.Z = dimension;
                aVar.invalidateSelf();
                aVar.u();
            }
        }
    }

    public final void setTextAppearance(Context context, int i8) {
        super.setTextAppearance(context, i8);
        a aVar = this.f3160d;
        if (aVar != null) {
            Context context2 = aVar.f3190e0;
            aVar.f3196k0.b(new d(context2, i8), context2);
        }
        j();
    }

    public void setTextAppearance(d dVar) {
        a aVar = this.f3160d;
        if (aVar != null) {
            aVar.f3196k0.b(dVar, aVar.f3190e0);
        }
        j();
    }
}
