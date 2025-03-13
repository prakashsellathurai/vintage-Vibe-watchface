package com.google.android.material.textfield;

import a0.a;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.w;
import androidx.health.services.client.R;
import c5.k;
import c5.m;
import com.google.android.material.internal.CheckableImageButton;
import h0.e;
import j0.x;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import y4.i;

public class TextInputLayout extends LinearLayout {
    public boolean A;
    public int A0;
    public y4.f B;
    public int B0;
    public y4.f C;
    public boolean C0;
    public final i D;
    public final u4.c D0;
    public final int E;
    public boolean E0;
    public int F;
    public boolean F0;
    public int G;
    public ValueAnimator G0;
    public int H;
    public boolean H0;
    public int I;
    public boolean I0;
    public int J;
    public int K;
    public int L;
    public final Rect M = new Rect();
    public final Rect N = new Rect();
    public final RectF O = new RectF();
    public Typeface P;
    public final CheckableImageButton Q;
    public ColorStateList R;
    public boolean S;
    public PorterDuff.Mode T;
    public boolean U;
    public ColorDrawable V;
    public int W;

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f3440a;

    /* renamed from: a0  reason: collision with root package name */
    public View.OnLongClickListener f3441a0;

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayout f3442b;

    /* renamed from: b0  reason: collision with root package name */
    public final LinkedHashSet<f> f3443b0 = new LinkedHashSet<>();

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f3444c;

    /* renamed from: c0  reason: collision with root package name */
    public int f3445c0 = 0;

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f3446d;

    /* renamed from: d0  reason: collision with root package name */
    public final SparseArray<k> f3447d0;
    public EditText e;

    /* renamed from: e0  reason: collision with root package name */
    public final CheckableImageButton f3448e0;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f3449f;

    /* renamed from: f0  reason: collision with root package name */
    public final LinkedHashSet<g> f3450f0;

    /* renamed from: g  reason: collision with root package name */
    public final m f3451g = new m(this);

    /* renamed from: g0  reason: collision with root package name */
    public ColorStateList f3452g0;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3453h;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f3454h0;

    /* renamed from: i  reason: collision with root package name */
    public int f3455i;

    /* renamed from: i0  reason: collision with root package name */
    public PorterDuff.Mode f3456i0;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3457j;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f3458j0;

    /* renamed from: k  reason: collision with root package name */
    public TextView f3459k;

    /* renamed from: k0  reason: collision with root package name */
    public ColorDrawable f3460k0;

    /* renamed from: l  reason: collision with root package name */
    public int f3461l;

    /* renamed from: l0  reason: collision with root package name */
    public int f3462l0;

    /* renamed from: m  reason: collision with root package name */
    public int f3463m;

    /* renamed from: m0  reason: collision with root package name */
    public Drawable f3464m0;

    /* renamed from: n  reason: collision with root package name */
    public CharSequence f3465n;

    /* renamed from: n0  reason: collision with root package name */
    public View.OnLongClickListener f3466n0;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3467o;

    /* renamed from: o0  reason: collision with root package name */
    public View.OnLongClickListener f3468o0;

    /* renamed from: p  reason: collision with root package name */
    public TextView f3469p;

    /* renamed from: p0  reason: collision with root package name */
    public final CheckableImageButton f3470p0;

    /* renamed from: q  reason: collision with root package name */
    public ColorStateList f3471q;

    /* renamed from: q0  reason: collision with root package name */
    public ColorStateList f3472q0;
    public int r;

    /* renamed from: r0  reason: collision with root package name */
    public ColorStateList f3473r0;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f3474s;
    public ColorStateList s0;

    /* renamed from: t  reason: collision with root package name */
    public ColorStateList f3475t;

    /* renamed from: t0  reason: collision with root package name */
    public int f3476t0;

    /* renamed from: u  reason: collision with root package name */
    public CharSequence f3477u;
    public int u0;

    /* renamed from: v  reason: collision with root package name */
    public final TextView f3478v;

    /* renamed from: v0  reason: collision with root package name */
    public int f3479v0;
    public CharSequence w;

    /* renamed from: w0  reason: collision with root package name */
    public ColorStateList f3480w0;

    /* renamed from: x  reason: collision with root package name */
    public final TextView f3481x;

    /* renamed from: x0  reason: collision with root package name */
    public int f3482x0;
    public boolean y;
    public int y0;

    /* renamed from: z  reason: collision with root package name */
    public CharSequence f3483z;

    /* renamed from: z0  reason: collision with root package name */
    public int f3484z0;

    public class a implements TextWatcher {
        public a() {
        }

        public final void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.t(!textInputLayout.I0, false);
            if (textInputLayout.f3453h) {
                textInputLayout.o(editable.length());
            }
            if (textInputLayout.f3467o) {
                textInputLayout.u(editable.length());
            }
        }

        public final void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        public final void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.f3448e0.performClick();
            textInputLayout.f3448e0.jumpDrawablesToCurrentState();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public final void run() {
            TextInputLayout.this.e.requestLayout();
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.D0.j(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends j0.a {

        /* renamed from: d  reason: collision with root package name */
        public final TextInputLayout f3489d;

        public e(TextInputLayout textInputLayout) {
            this.f3489d = textInputLayout;
        }

        public void d(View view, k0.c cVar) {
            View.AccessibilityDelegate accessibilityDelegate = this.f4917a;
            AccessibilityNodeInfo accessibilityNodeInfo = cVar.f5085a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            TextInputLayout textInputLayout = this.f3489d;
            EditText editText = textInputLayout.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = textInputLayout.getHint();
            CharSequence error = textInputLayout.getError();
            CharSequence placeholderText = textInputLayout.getPlaceholderText();
            int counterMaxLength = textInputLayout.getCounterMaxLength();
            CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
            boolean z8 = !TextUtils.isEmpty(text);
            boolean z9 = !TextUtils.isEmpty(hint);
            boolean z10 = !textInputLayout.C0;
            boolean z11 = !TextUtils.isEmpty(error);
            boolean z12 = z11 || !TextUtils.isEmpty(counterOverflowDescription);
            String charSequence = z9 ? hint.toString() : "";
            if (z8) {
                accessibilityNodeInfo.setText(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                accessibilityNodeInfo.setText(charSequence);
                if (z10 && placeholderText != null) {
                    accessibilityNodeInfo.setText(charSequence + ", " + placeholderText);
                }
            } else if (placeholderText != null) {
                accessibilityNodeInfo.setText(placeholderText);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                accessibilityNodeInfo.setHintText(charSequence);
                accessibilityNodeInfo.setShowingHintText(!z8);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
            if (z12) {
                if (!z11) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfo.setError(error);
            }
            if (editText != null) {
                editText.setLabelFor(R.id.textinput_helper_text);
            }
        }
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public interface g {
        void a(TextInputLayout textInputLayout, int i8);
    }

    public static class h extends p0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f3490h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f3491i;

        /* renamed from: j  reason: collision with root package name */
        public CharSequence f3492j;

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f3493k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f3494l;

        public static class a implements Parcelable.ClassLoaderCreator<h> {
            public final Object createFromParcel(Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i8) {
                return new h[i8];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3490h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f3491i = parcel.readInt() != 1 ? false : true;
            this.f3492j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f3493k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f3494l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.f3490h + " hint=" + this.f3492j + " helperText=" + this.f3493k + " placeholderText=" + this.f3494l + "}";
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeParcelable(this.f6241f, i8);
            TextUtils.writeToParcel(this.f3490h, parcel, i8);
            parcel.writeInt(this.f3491i ? 1 : 0);
            TextUtils.writeToParcel(this.f3492j, parcel, i8);
            TextUtils.writeToParcel(this.f3493k, parcel, i8);
            TextUtils.writeToParcel(this.f3494l, parcel, i8);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x05a7  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x05b6  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x05c5  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x05d4  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x05e3  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x057a  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0589  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0598  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r31, android.util.AttributeSet r32) {
        /*
            r30 = this;
            r0 = r30
            r7 = r32
            r8 = -2147220531(0xffffffff800403cd, float:-3.68705E-40)
            r9 = -2146303366(0xffffffff8012027a, float:-1.653927E-39)
            r1 = r31
            android.content.Context r1 = d5.a.a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            c5.m r1 = new c5.m
            r1.<init>(r0)
            r0.f3451g = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.M = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.N = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.O = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f3443b0 = r1
            r10 = 0
            r0.f3445c0 = r10
            android.util.SparseArray r11 = new android.util.SparseArray
            r11.<init>()
            r0.f3447d0 = r11
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f3450f0 = r1
            u4.c r1 = new u4.c
            r1.<init>(r0)
            r0.D0 = r1
            android.content.Context r12 = r30.getContext()
            r13 = 1
            r0.setOrientation(r13)
            r0.setWillNotDraw(r10)
            r0.setAddStatesFromChildren(r13)
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r12)
            r0.f3440a = r2
            r2.setAddStatesFromChildren(r13)
            r0.addView(r2)
            android.widget.LinearLayout r14 = new android.widget.LinearLayout
            r14.<init>(r12)
            r0.f3442b = r14
            r14.setOrientation(r10)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r15 = -2
            r6 = -1
            r4 = 8388611(0x800003, float:1.1754948E-38)
            r3.<init>(r15, r6, r4)
            r14.setLayoutParams(r3)
            r2.addView(r14)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r12)
            r0.f3444c = r5
            r5.setOrientation(r10)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = 8388613(0x800005, float:1.175495E-38)
            r3.<init>(r15, r6, r4)
            r5.setLayoutParams(r3)
            r2.addView(r5)
            android.widget.FrameLayout r4 = new android.widget.FrameLayout
            r4.<init>(r12)
            r0.f3446d = r4
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r15, r6)
            r4.setLayoutParams(r2)
            android.view.animation.LinearInterpolator r2 = f4.a.f4391a
            r1.H = r2
            r1.h()
            r1.G = r2
            r1.h()
            int r2 = r1.f7743h
            r3 = 8388659(0x800033, float:1.1755015E-38)
            if (r2 == r3) goto L_0x00c2
            r1.f7743h = r3
            r1.h()
        L_0x00c2:
            int[] r3 = a1.a.f29j0
            r2 = 5
            int[] r1 = new int[r2]
            r1 = {18, 16, 31, 36, 40} // fill-array
            u4.k.a(r12, r7, r8, r9)
            r16 = -2146303366(0xffffffff8012027a, float:-1.653927E-39)
            r17 = -2147220531(0xffffffff800403cd, float:-3.68705E-40)
            r18 = r1
            r1 = r12
            r15 = r2
            r2 = r32
            r19 = r3
            r20 = r4
            r4 = r17
            r21 = r5
            r5 = r16
            r6 = r18
            u4.k.b(r1, r2, r3, r4, r5, r6)
            androidx.appcompat.widget.o0 r1 = new androidx.appcompat.widget.o0
            r2 = r19
            android.content.res.TypedArray r2 = r12.obtainStyledAttributes(r7, r2, r8, r9)
            r1.<init>(r12, r2)
            r3 = 39
            boolean r3 = r1.a(r3, r13)
            r0.y = r3
            r3 = 2
            java.lang.CharSequence r4 = r1.j(r3)
            r0.setHint((java.lang.CharSequence) r4)
            r4 = 38
            boolean r4 = r1.a(r4, r13)
            r0.F0 = r4
            r4 = 33
            boolean r4 = r1.a(r4, r13)
            r0.E0 = r4
            y4.i$a r4 = y4.i.b(r12, r7, r8, r9)
            y4.i r5 = new y4.i
            r5.<init>(r4)
            r0.D = r5
            android.content.res.Resources r4 = r12.getResources()
            r6 = -2147024493(0xffffffff80070193, float:-6.43413E-40)
            int r4 = r4.getDimensionPixelOffset(r6)
            r0.E = r4
            int r4 = r1.c(r15, r10)
            r0.G = r4
            android.content.res.Resources r4 = r12.getResources()
            r6 = -2147024492(0xffffffff80070194, float:-6.43415E-40)
            int r4 = r4.getDimensionPixelSize(r6)
            r6 = 12
            int r4 = r1.d(r6, r4)
            r0.I = r4
            android.content.res.Resources r4 = r12.getResources()
            r6 = -2147024491(0xffffffff80070195, float:-6.43416E-40)
            int r4 = r4.getDimensionPixelSize(r6)
            r6 = 13
            int r4 = r1.d(r6, r4)
            r0.J = r4
            int r4 = r0.I
            r0.H = r4
            r4 = 9
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r2.getDimension(r4, r6)
            r7 = 8
            float r8 = r2.getDimension(r7, r6)
            r9 = 6
            float r9 = r2.getDimension(r9, r6)
            r15 = 7
            float r6 = r2.getDimension(r15, r6)
            y4.i$a r15 = new y4.i$a
            r15.<init>(r5)
            r5 = 0
            int r16 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r16 < 0) goto L_0x0184
            y4.a r7 = new y4.a
            r7.<init>(r4)
            r15.e = r7
        L_0x0184:
            int r4 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x018f
            y4.a r4 = new y4.a
            r4.<init>(r8)
            r15.f8469f = r4
        L_0x018f:
            int r4 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x019a
            y4.a r4 = new y4.a
            r4.<init>(r9)
            r15.f8470g = r4
        L_0x019a:
            int r4 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x01a5
            y4.a r4 = new y4.a
            r4.<init>(r6)
            r15.f8471h = r4
        L_0x01a5:
            y4.i r4 = new y4.i
            r4.<init>(r15)
            r0.D = r4
            r4 = 3
            android.content.res.ColorStateList r5 = v4.c.b(r12, r1, r4)
            if (r5 == 0) goto L_0x020a
            int r6 = r5.getDefaultColor()
            r0.f3482x0 = r6
            r0.L = r6
            boolean r6 = r5.isStateful()
            r7 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r6 == 0) goto L_0x01e4
            int[] r6 = new int[r13]
            r6[r10] = r7
            r8 = -1
            int r6 = r5.getColorForState(r6, r8)
            r0.y0 = r6
            int[] r6 = new int[r3]
            r6 = {16842908, 16842910} // fill-array
            int r6 = r5.getColorForState(r6, r8)
            r0.f3484z0 = r6
            int[] r6 = new int[r3]
            r6 = {16843623, 16842910} // fill-array
            int r5 = r5.getColorForState(r6, r8)
            goto L_0x0207
        L_0x01e4:
            r8 = -1
            int r5 = r0.f3482x0
            r0.f3484z0 = r5
            java.lang.Object r5 = g.a.f4440a
            r5 = -2147090250(0xffffffff800600b6, float:-5.51268E-40)
            android.content.res.ColorStateList r5 = r12.getColorStateList(r5)
            int[] r6 = new int[r13]
            r6[r10] = r7
            int r6 = r5.getColorForState(r6, r8)
            r0.y0 = r6
            int[] r6 = new int[r13]
            r7 = 16843623(0x1010367, float:2.3696E-38)
            r6[r10] = r7
            int r5 = r5.getColorForState(r6, r8)
        L_0x0207:
            r0.A0 = r5
            goto L_0x0215
        L_0x020a:
            r8 = -1
            r0.L = r10
            r0.f3482x0 = r10
            r0.y0 = r10
            r0.f3484z0 = r10
            r0.A0 = r10
        L_0x0215:
            boolean r5 = r1.k(r13)
            if (r5 == 0) goto L_0x0223
            android.content.res.ColorStateList r5 = r1.b(r13)
            r0.s0 = r5
            r0.f3473r0 = r5
        L_0x0223:
            r5 = 10
            android.content.res.ColorStateList r6 = v4.c.b(r12, r1, r5)
            int r2 = r2.getColor(r5, r10)
            r0.f3479v0 = r2
            java.lang.Object r2 = a0.a.f10a
            r2 = -2147090231(0xffffffff800600c9, float:-5.51295E-40)
            int r2 = a0.a.c.a(r12, r2)
            r0.f3476t0 = r2
            r2 = -2147090230(0xffffffff800600ca, float:-5.51296E-40)
            int r2 = a0.a.c.a(r12, r2)
            r0.B0 = r2
            r2 = -2147090227(0xffffffff800600cd, float:-5.513E-40)
            int r2 = a0.a.c.a(r12, r2)
            r0.u0 = r2
            if (r6 == 0) goto L_0x0251
            r0.setBoxStrokeColorStateList(r6)
        L_0x0251:
            r2 = 11
            boolean r5 = r1.k(r2)
            if (r5 == 0) goto L_0x0260
            android.content.res.ColorStateList r2 = v4.c.b(r12, r1, r2)
            r0.setBoxStrokeErrorColor(r2)
        L_0x0260:
            r2 = 40
            int r5 = r1.h(r2, r8)
            if (r5 == r8) goto L_0x026f
            int r2 = r1.h(r2, r10)
            r0.setHintTextAppearance(r2)
        L_0x026f:
            r2 = 31
            int r2 = r1.h(r2, r10)
            r5 = 26
            java.lang.CharSequence r5 = r1.j(r5)
            r6 = 27
            boolean r6 = r1.a(r6, r10)
            android.content.Context r7 = r30.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r9 = -2146566098(0xffffffff800e002e, float:-1.285761E-39)
            r15 = r21
            android.view.View r7 = r7.inflate(r9, r15, r10)
            com.google.android.material.internal.CheckableImageButton r7 = (com.google.android.material.internal.CheckableImageButton) r7
            r0.f3470p0 = r7
            r4 = -2146762289(0xffffffff800b01cf, float:-1.010839E-39)
            r7.setId(r4)
            r4 = 8
            r7.setVisibility(r4)
            boolean r4 = v4.c.d(r12)
            if (r4 == 0) goto L_0x02b0
            android.view.ViewGroup$LayoutParams r4 = r7.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            j0.g.h(r4, r10)
        L_0x02b0:
            r4 = 28
            boolean r17 = r1.k(r4)
            if (r17 == 0) goto L_0x02bf
            android.graphics.drawable.Drawable r4 = r1.e(r4)
            r0.setErrorIconDrawable((android.graphics.drawable.Drawable) r4)
        L_0x02bf:
            r4 = 29
            boolean r17 = r1.k(r4)
            if (r17 == 0) goto L_0x02ce
            android.content.res.ColorStateList r4 = v4.c.b(r12, r1, r4)
            r0.setErrorIconTintList(r4)
        L_0x02ce:
            r4 = 30
            boolean r17 = r1.k(r4)
            r9 = 0
            if (r17 == 0) goto L_0x02e2
            int r4 = r1.g(r4, r8)
            android.graphics.PorterDuff$Mode r4 = u4.n.b(r4, r9)
            r0.setErrorIconTintMode(r4)
        L_0x02e2:
            android.content.res.Resources r4 = r30.getResources()
            r13 = -2146369456(0xffffffff80110050, float:-1.561316E-39)
            java.lang.CharSequence r4 = r4.getText(r13)
            r7.setContentDescription(r4)
            int[] r4 = j0.x.f4957a
            j0.x.c.s(r7, r3)
            r7.setClickable(r10)
            r7.setPressable(r10)
            r7.setFocusable(r10)
            r4 = 36
            int r4 = r1.h(r4, r10)
            r13 = 35
            boolean r13 = r1.a(r13, r10)
            r3 = 34
            java.lang.CharSequence r3 = r1.j(r3)
            r9 = 48
            int r9 = r1.h(r9, r10)
            r8 = 47
            java.lang.CharSequence r8 = r1.j(r8)
            r22 = r9
            r9 = 51
            int r9 = r1.h(r9, r10)
            r10 = 50
            java.lang.CharSequence r10 = r1.j(r10)
            r23 = r9
            r9 = 61
            r24 = r10
            r10 = 0
            int r9 = r1.h(r9, r10)
            r10 = 60
            java.lang.CharSequence r10 = r1.j(r10)
            r25 = r9
            r9 = 14
            r26 = r10
            r10 = 0
            boolean r9 = r1.a(r9, r10)
            r10 = 15
            r27 = r9
            r9 = -1
            int r10 = r1.g(r10, r9)
            r0.setCounterMaxLength(r10)
            r9 = 18
            r10 = 0
            int r9 = r1.h(r9, r10)
            r0.f3463m = r9
            r9 = 16
            int r9 = r1.h(r9, r10)
            r0.f3461l = r9
            android.content.Context r9 = r30.getContext()
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
            r28 = r8
            r8 = -2146566097(0xffffffff800e002f, float:-1.285763E-39)
            android.view.View r8 = r9.inflate(r8, r14, r10)
            com.google.android.material.internal.CheckableImageButton r8 = (com.google.android.material.internal.CheckableImageButton) r8
            r0.Q = r8
            r9 = 8
            r8.setVisibility(r9)
            boolean r9 = v4.c.d(r12)
            if (r9 == 0) goto L_0x038c
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            j0.g.g(r9, r10)
        L_0x038c:
            r9 = 0
            r0.setStartIconOnClickListener(r9)
            r0.setStartIconOnLongClickListener(r9)
            r9 = 57
            boolean r10 = r1.k(r9)
            if (r10 == 0) goto L_0x03bb
            android.graphics.drawable.Drawable r9 = r1.e(r9)
            r0.setStartIconDrawable((android.graphics.drawable.Drawable) r9)
            r9 = 56
            boolean r10 = r1.k(r9)
            if (r10 == 0) goto L_0x03b1
            java.lang.CharSequence r9 = r1.j(r9)
            r0.setStartIconContentDescription((java.lang.CharSequence) r9)
        L_0x03b1:
            r9 = 55
            r10 = 1
            boolean r9 = r1.a(r9, r10)
            r0.setStartIconCheckable(r9)
        L_0x03bb:
            r9 = 58
            boolean r10 = r1.k(r9)
            if (r10 == 0) goto L_0x03ca
            android.content.res.ColorStateList r9 = v4.c.b(r12, r1, r9)
            r0.setStartIconTintList(r9)
        L_0x03ca:
            r9 = 59
            boolean r10 = r1.k(r9)
            if (r10 == 0) goto L_0x03df
            r10 = -1
            int r9 = r1.g(r9, r10)
            r10 = 0
            android.graphics.PorterDuff$Mode r9 = u4.n.b(r9, r10)
            r0.setStartIconTintMode(r9)
        L_0x03df:
            r9 = 4
            r10 = 0
            int r9 = r1.g(r9, r10)
            r0.setBoxBackgroundMode(r9)
            android.content.Context r9 = r30.getContext()
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
            r18 = r2
            r29 = r5
            r5 = r20
            r2 = -2146566098(0xffffffff800e002e, float:-1.285761E-39)
            android.view.View r2 = r9.inflate(r2, r5, r10)
            com.google.android.material.internal.CheckableImageButton r2 = (com.google.android.material.internal.CheckableImageButton) r2
            r0.f3448e0 = r2
            r5.addView(r2)
            r9 = 8
            r2.setVisibility(r9)
            boolean r9 = v4.c.d(r12)
            if (r9 == 0) goto L_0x0418
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            j0.g.h(r2, r10)
        L_0x0418:
            c5.e r2 = new c5.e
            r2.<init>(r0)
            r9 = -1
            r11.append(r9, r2)
            c5.n r2 = new c5.n
            r2.<init>(r0)
            r11.append(r10, r2)
            com.google.android.material.textfield.c r2 = new com.google.android.material.textfield.c
            r2.<init>(r0)
            r9 = 1
            r11.append(r9, r2)
            com.google.android.material.textfield.a r2 = new com.google.android.material.textfield.a
            r2.<init>(r0)
            r9 = 2
            r11.append(r9, r2)
            com.google.android.material.textfield.b r2 = new com.google.android.material.textfield.b
            r2.<init>(r0)
            r9 = 3
            r11.append(r9, r2)
            r2 = 23
            boolean r9 = r1.k(r2)
            r10 = 44
            if (r9 == 0) goto L_0x047f
            r9 = 0
            int r2 = r1.g(r2, r9)
            r0.setEndIconMode(r2)
            r2 = 22
            boolean r9 = r1.k(r2)
            if (r9 == 0) goto L_0x0465
            android.graphics.drawable.Drawable r2 = r1.e(r2)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r2)
        L_0x0465:
            r2 = 21
            boolean r9 = r1.k(r2)
            if (r9 == 0) goto L_0x0474
            java.lang.CharSequence r2 = r1.j(r2)
            r0.setEndIconContentDescription((java.lang.CharSequence) r2)
        L_0x0474:
            r2 = 20
            r9 = 1
            boolean r2 = r1.a(r2, r9)
            r0.setEndIconCheckable(r2)
            goto L_0x04c3
        L_0x047f:
            boolean r2 = r1.k(r10)
            if (r2 == 0) goto L_0x04c3
            r2 = 0
            boolean r9 = r1.a(r10, r2)
            r0.setEndIconMode(r9)
            r2 = 43
            android.graphics.drawable.Drawable r2 = r1.e(r2)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r2)
            r2 = 42
            java.lang.CharSequence r2 = r1.j(r2)
            r0.setEndIconContentDescription((java.lang.CharSequence) r2)
            r2 = 45
            boolean r9 = r1.k(r2)
            if (r9 == 0) goto L_0x04ae
            android.content.res.ColorStateList r2 = v4.c.b(r12, r1, r2)
            r0.setEndIconTintList(r2)
        L_0x04ae:
            r2 = 46
            boolean r9 = r1.k(r2)
            if (r9 == 0) goto L_0x04c3
            r9 = -1
            int r2 = r1.g(r2, r9)
            r9 = 0
            android.graphics.PorterDuff$Mode r2 = u4.n.b(r2, r9)
            r0.setEndIconTintMode(r2)
        L_0x04c3:
            boolean r2 = r1.k(r10)
            if (r2 != 0) goto L_0x04ee
            r2 = 24
            boolean r9 = r1.k(r2)
            if (r9 == 0) goto L_0x04d8
            android.content.res.ColorStateList r2 = v4.c.b(r12, r1, r2)
            r0.setEndIconTintList(r2)
        L_0x04d8:
            r2 = 25
            boolean r9 = r1.k(r2)
            if (r9 == 0) goto L_0x04ee
            r9 = -1
            int r2 = r1.g(r2, r9)
            r9 = 0
            android.graphics.PorterDuff$Mode r2 = u4.n.b(r2, r9)
            r0.setEndIconTintMode(r2)
            goto L_0x04ef
        L_0x04ee:
            r9 = 0
        L_0x04ef:
            androidx.appcompat.widget.s r2 = new androidx.appcompat.widget.s
            r2.<init>(r12, r9)
            r0.f3478v = r2
            r10 = -2146762283(0xffffffff800b01d5, float:-1.010848E-39)
            r2.setId(r10)
            android.widget.FrameLayout$LayoutParams r10 = new android.widget.FrameLayout$LayoutParams
            r11 = -2
            r10.<init>(r11, r11)
            r2.setLayoutParams(r10)
            r10 = 1
            j0.x.f.f(r2, r10)
            r14.addView(r8)
            r14.addView(r2)
            androidx.appcompat.widget.s r2 = new androidx.appcompat.widget.s
            r2.<init>(r12, r9)
            r0.f3481x = r2
            r8 = -2146762282(0xffffffff800b01d6, float:-1.010849E-39)
            r2.setId(r8)
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r9 = 80
            r10 = -2
            r8.<init>(r10, r10, r9)
            r2.setLayoutParams(r8)
            r8 = 1
            j0.x.f.f(r2, r8)
            r15.addView(r2)
            r15.addView(r7)
            r15.addView(r5)
            r0.setHelperTextEnabled(r13)
            r0.setHelperText(r3)
            r0.setHelperTextTextAppearance(r4)
            r0.setErrorEnabled(r6)
            r2 = r18
            r0.setErrorTextAppearance(r2)
            r2 = r29
            r0.setErrorContentDescription(r2)
            int r2 = r0.f3463m
            r0.setCounterTextAppearance(r2)
            int r2 = r0.f3461l
            r0.setCounterOverflowTextAppearance(r2)
            r2 = r28
            r0.setPlaceholderText(r2)
            r2 = r22
            r0.setPlaceholderTextAppearance(r2)
            r2 = r24
            r0.setPrefixText(r2)
            r2 = r23
            r0.setPrefixTextAppearance(r2)
            r2 = r26
            r0.setSuffixText(r2)
            r2 = r25
            r0.setSuffixTextAppearance(r2)
            r2 = 32
            boolean r3 = r1.k(r2)
            if (r3 == 0) goto L_0x0581
            android.content.res.ColorStateList r2 = r1.b(r2)
            r0.setErrorTextColor(r2)
        L_0x0581:
            r2 = 37
            boolean r3 = r1.k(r2)
            if (r3 == 0) goto L_0x0590
            android.content.res.ColorStateList r2 = r1.b(r2)
            r0.setHelperTextColor(r2)
        L_0x0590:
            r2 = 41
            boolean r3 = r1.k(r2)
            if (r3 == 0) goto L_0x059f
            android.content.res.ColorStateList r2 = r1.b(r2)
            r0.setHintTextColor(r2)
        L_0x059f:
            r2 = 19
            boolean r3 = r1.k(r2)
            if (r3 == 0) goto L_0x05ae
            android.content.res.ColorStateList r2 = r1.b(r2)
            r0.setCounterTextColor(r2)
        L_0x05ae:
            r2 = 17
            boolean r3 = r1.k(r2)
            if (r3 == 0) goto L_0x05bd
            android.content.res.ColorStateList r2 = r1.b(r2)
            r0.setCounterOverflowTextColor(r2)
        L_0x05bd:
            r2 = 49
            boolean r3 = r1.k(r2)
            if (r3 == 0) goto L_0x05cc
            android.content.res.ColorStateList r2 = r1.b(r2)
            r0.setPlaceholderTextColor(r2)
        L_0x05cc:
            r2 = 52
            boolean r3 = r1.k(r2)
            if (r3 == 0) goto L_0x05db
            android.content.res.ColorStateList r2 = r1.b(r2)
            r0.setPrefixTextColor(r2)
        L_0x05db:
            r2 = 62
            boolean r3 = r1.k(r2)
            if (r3 == 0) goto L_0x05ea
            android.content.res.ColorStateList r2 = r1.b(r2)
            r0.setSuffixTextColor(r2)
        L_0x05ea:
            r2 = r27
            r0.setCounterEnabled(r2)
            r2 = 0
            r3 = 1
            boolean r2 = r1.a(r2, r3)
            r0.setEnabled(r2)
            r1.m()
            r1 = 2
            j0.x.c.s(r0, r1)
            j0.x.k.l(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static void d(CheckableImageButton checkableImageButton, boolean z8, ColorStateList colorStateList, boolean z9, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z8 || z9)) {
            drawable = drawable.mutate();
            if (z8) {
                d0.b.h(drawable, colorStateList);
            }
            if (z9) {
                d0.b.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private k getEndIconDelegate() {
        SparseArray<k> sparseArray = this.f3447d0;
        k kVar = sparseArray.get(this.f3445c0);
        return kVar != null ? kVar : sparseArray.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        CheckableImageButton checkableImageButton = this.f3470p0;
        if (checkableImageButton.getVisibility() == 0) {
            return checkableImageButton;
        }
        if (!(this.f3445c0 != 0) || !h()) {
            return null;
        }
        return this.f3448e0;
    }

    public static void k(ViewGroup viewGroup, boolean z8) {
        int childCount = viewGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = viewGroup.getChildAt(i8);
            childAt.setEnabled(z8);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z8);
            }
        }
    }

    public static void m(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        int[] iArr = x.f4957a;
        boolean a9 = x.b.a(checkableImageButton);
        boolean z8 = false;
        int i8 = 1;
        boolean z9 = onLongClickListener != null;
        if (a9 || z9) {
            z8 = true;
        }
        checkableImageButton.setFocusable(z8);
        checkableImageButton.setClickable(a9);
        checkableImageButton.setPressable(a9);
        checkableImageButton.setLongClickable(z9);
        if (!z8) {
            i8 = 2;
        }
        x.c.s(checkableImageButton, i8);
    }

    private void setEditText(EditText editText) {
        boolean z8;
        boolean z9;
        if (this.e == null) {
            if (this.f3445c0 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.e = editText;
            i();
            setTextInputAccessibilityDelegate(new e(this));
            Typeface typeface = this.e.getTypeface();
            u4.c cVar = this.D0;
            v4.a aVar = cVar.f7756v;
            if (aVar != null) {
                aVar.f7931c = true;
            }
            if (cVar.f7753s != typeface) {
                cVar.f7753s = typeface;
                z8 = true;
            } else {
                z8 = false;
            }
            if (cVar.f7754t != typeface) {
                cVar.f7754t = typeface;
                z9 = true;
            } else {
                z9 = false;
            }
            if (z8 || z9) {
                cVar.h();
            }
            float textSize = this.e.getTextSize();
            if (cVar.f7744i != textSize) {
                cVar.f7744i = textSize;
                cVar.h();
            }
            int gravity = this.e.getGravity();
            int i8 = (gravity & -113) | 48;
            if (cVar.f7743h != i8) {
                cVar.f7743h = i8;
                cVar.h();
            }
            if (cVar.f7742g != gravity) {
                cVar.f7742g = gravity;
                cVar.h();
            }
            this.e.addTextChangedListener(new a());
            if (this.f3473r0 == null) {
                this.f3473r0 = this.e.getHintTextColors();
            }
            if (this.y) {
                if (TextUtils.isEmpty(this.f3483z)) {
                    CharSequence hint = this.e.getHint();
                    this.f3449f = hint;
                    setHint(hint);
                    this.e.setHint((CharSequence) null);
                }
                this.A = true;
            }
            if (this.f3459k != null) {
                o(this.e.getText().length());
            }
            r();
            this.f3451g.b();
            this.f3442b.bringToFront();
            this.f3444c.bringToFront();
            this.f3446d.bringToFront();
            this.f3470p0.bringToFront();
            Iterator<f> it = this.f3443b0.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            v();
            y();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            t(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z8) {
        boolean z9 = false;
        int i8 = 8;
        this.f3470p0.setVisibility(z8 ? 0 : 8);
        FrameLayout frameLayout = this.f3446d;
        if (!z8) {
            i8 = 0;
        }
        frameLayout.setVisibility(i8);
        y();
        if (this.f3445c0 != 0) {
            z9 = true;
        }
        if (!z9) {
            q();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f3483z)) {
            this.f3483z = charSequence;
            u4.c cVar = this.D0;
            if (charSequence == null || !TextUtils.equals(cVar.w, charSequence)) {
                cVar.w = charSequence;
                cVar.f7757x = null;
                Bitmap bitmap = cVar.f7758z;
                if (bitmap != null) {
                    bitmap.recycle();
                    cVar.f7758z = null;
                }
                cVar.h();
            }
            if (!this.C0) {
                j();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z8) {
        if (this.f3467o != z8) {
            if (z8) {
                s sVar = new s(getContext(), (AttributeSet) null);
                this.f3469p = sVar;
                sVar.setId(R.id.textinput_placeholder);
                TextView textView = this.f3469p;
                int[] iArr = x.f4957a;
                x.f.f(textView, 1);
                setPlaceholderTextAppearance(this.r);
                setPlaceholderTextColor(this.f3471q);
                TextView textView2 = this.f3469p;
                if (textView2 != null) {
                    this.f3440a.addView(textView2);
                    this.f3469p.setVisibility(0);
                }
            } else {
                TextView textView3 = this.f3469p;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                this.f3469p = null;
            }
            this.f3467o = z8;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r7.e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A() {
        /*
            r7 = this;
            y4.f r0 = r7.B
            if (r0 == 0) goto L_0x00f7
            int r0 = r7.F
            if (r0 != 0) goto L_0x000a
            goto L_0x00f7
        L_0x000a:
            boolean r0 = r7.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r7.e
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = r1
            goto L_0x0020
        L_0x001f:
            r0 = r2
        L_0x0020:
            boolean r3 = r7.isHovered()
            if (r3 != 0) goto L_0x0033
            android.widget.EditText r3 = r7.e
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = r1
            goto L_0x0034
        L_0x0033:
            r3 = r2
        L_0x0034:
            boolean r4 = r7.isEnabled()
            c5.m r5 = r7.f3451g
            if (r4 != 0) goto L_0x003f
            int r4 = r7.B0
            goto L_0x0070
        L_0x003f:
            boolean r4 = r5.e()
            if (r4 == 0) goto L_0x004f
            android.content.res.ColorStateList r4 = r7.f3480w0
            if (r4 == 0) goto L_0x004a
            goto L_0x005b
        L_0x004a:
            int r4 = r5.g()
            goto L_0x0070
        L_0x004f:
            boolean r4 = r7.f3457j
            if (r4 == 0) goto L_0x0064
            android.widget.TextView r4 = r7.f3459k
            if (r4 == 0) goto L_0x0064
            android.content.res.ColorStateList r6 = r7.f3480w0
            if (r6 == 0) goto L_0x005f
        L_0x005b:
            r7.x(r0, r3)
            goto L_0x0072
        L_0x005f:
            int r4 = r4.getCurrentTextColor()
            goto L_0x0070
        L_0x0064:
            if (r0 == 0) goto L_0x0069
            int r4 = r7.f3479v0
            goto L_0x0070
        L_0x0069:
            if (r3 == 0) goto L_0x006e
            int r4 = r7.u0
            goto L_0x0070
        L_0x006e:
            int r4 = r7.f3476t0
        L_0x0070:
            r7.K = r4
        L_0x0072:
            android.graphics.drawable.Drawable r4 = r7.getErrorIconDrawable()
            if (r4 == 0) goto L_0x0083
            boolean r4 = r5.f2696k
            if (r4 == 0) goto L_0x0083
            boolean r4 = r5.e()
            if (r4 == 0) goto L_0x0083
            r1 = r2
        L_0x0083:
            r7.setErrorIconVisible(r1)
            com.google.android.material.internal.CheckableImageButton r1 = r7.f3470p0
            android.content.res.ColorStateList r4 = r7.f3472q0
            r7.l(r1, r4)
            com.google.android.material.internal.CheckableImageButton r1 = r7.Q
            android.content.res.ColorStateList r4 = r7.R
            r7.l(r1, r4)
            android.content.res.ColorStateList r1 = r7.f3452g0
            com.google.android.material.internal.CheckableImageButton r4 = r7.f3448e0
            r7.l(r4, r1)
            c5.k r1 = r7.getEndIconDelegate()
            r1.getClass()
            boolean r1 = r1 instanceof com.google.android.material.textfield.b
            if (r1 == 0) goto L_0x00c8
            boolean r1 = r5.e()
            if (r1 == 0) goto L_0x00c5
            android.graphics.drawable.Drawable r1 = r7.getEndIconDrawable()
            if (r1 == 0) goto L_0x00c5
            android.graphics.drawable.Drawable r1 = r7.getEndIconDrawable()
            android.graphics.drawable.Drawable r1 = r1.mutate()
            int r5 = r5.g()
            d0.b.g(r1, r5)
            r4.setImageDrawable(r1)
            goto L_0x00c8
        L_0x00c5:
            r7.c()
        L_0x00c8:
            if (r0 == 0) goto L_0x00d3
            boolean r1 = r7.isEnabled()
            if (r1 == 0) goto L_0x00d3
            int r1 = r7.J
            goto L_0x00d5
        L_0x00d3:
            int r1 = r7.I
        L_0x00d5:
            r7.H = r1
            int r1 = r7.F
            if (r1 != r2) goto L_0x00f4
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x00e4
            int r0 = r7.y0
            goto L_0x00f2
        L_0x00e4:
            if (r3 == 0) goto L_0x00eb
            if (r0 != 0) goto L_0x00eb
            int r0 = r7.A0
            goto L_0x00f2
        L_0x00eb:
            if (r0 == 0) goto L_0x00f0
            int r0 = r7.f3484z0
            goto L_0x00f2
        L_0x00f0:
            int r0 = r7.f3482x0
        L_0x00f2:
            r7.L = r0
        L_0x00f4:
            r7.b()
        L_0x00f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A():void");
    }

    public final void a(float f9) {
        u4.c cVar = this.D0;
        if (cVar.f7739c != f9) {
            if (this.G0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.G0 = valueAnimator;
                valueAnimator.setInterpolator(f4.a.f4392b);
                this.G0.setDuration(167);
                this.G0.addUpdateListener(new d());
            }
            this.G0.setFloatValues(new float[]{cVar.f7739c, f9});
            this.G0.start();
        }
    }

    public final void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            FrameLayout frameLayout = this.f3440a;
            frameLayout.addView(view, layoutParams2);
            frameLayout.setLayoutParams(layoutParams);
            s();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i8, layoutParams);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r7 = this;
            y4.f r0 = r7.B
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            y4.i r1 = r7.D
            r0.setShapeAppearanceModel(r1)
            int r0 = r7.F
            r1 = 2
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != r1) goto L_0x0021
            int r0 = r7.H
            if (r0 <= r2) goto L_0x001c
            int r0 = r7.K
            if (r0 == 0) goto L_0x001c
            r0 = r3
            goto L_0x001d
        L_0x001c:
            r0 = r4
        L_0x001d:
            if (r0 == 0) goto L_0x0021
            r0 = r3
            goto L_0x0022
        L_0x0021:
            r0 = r4
        L_0x0022:
            if (r0 == 0) goto L_0x0045
            y4.f r0 = r7.B
            int r1 = r7.H
            float r1 = (float) r1
            int r5 = r7.K
            y4.f$b r6 = r0.f8412a
            r6.f8442k = r1
            r0.invalidateSelf()
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r5)
            y4.f$b r5 = r0.f8412a
            android.content.res.ColorStateList r6 = r5.f8436d
            if (r6 == r1) goto L_0x0045
            r5.f8436d = r1
            int[] r1 = r0.getState()
            r0.onStateChange(r1)
        L_0x0045:
            int r0 = r7.L
            int r1 = r7.F
            if (r1 != r3) goto L_0x0062
            android.content.Context r0 = r7.getContext()
            r1 = -2147221264(0xffffffff800400f0, float:-3.67678E-40)
            android.util.TypedValue r0 = v4.b.a(r0, r1)
            if (r0 == 0) goto L_0x005b
            int r0 = r0.data
            goto L_0x005c
        L_0x005b:
            r0 = r4
        L_0x005c:
            int r1 = r7.L
            int r0 = c0.a.a(r1, r0)
        L_0x0062:
            r7.L = r0
            y4.f r1 = r7.B
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.j(r0)
            int r0 = r7.f3445c0
            r1 = 3
            if (r0 != r1) goto L_0x007b
            android.widget.EditText r0 = r7.e
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r0.invalidateSelf()
        L_0x007b:
            y4.f r0 = r7.C
            if (r0 != 0) goto L_0x0080
            goto L_0x0098
        L_0x0080:
            int r1 = r7.H
            if (r1 <= r2) goto L_0x0089
            int r1 = r7.K
            if (r1 == 0) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r3 = r4
        L_0x008a:
            if (r3 == 0) goto L_0x0095
            int r1 = r7.K
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.j(r1)
        L_0x0095:
            r7.invalidate()
        L_0x0098:
            r7.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.b():void");
    }

    public final void c() {
        d(this.f3448e0, this.f3454h0, this.f3452g0, this.f3458j0, this.f3456i0);
    }

    @TargetApi(26)
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i8) {
        EditText editText = this.e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i8);
            return;
        }
        if (this.f3449f != null) {
            boolean z8 = this.A;
            this.A = false;
            CharSequence hint = editText.getHint();
            this.e.setHint(this.f3449f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i8);
            } finally {
                this.e.setHint(hint);
                this.A = z8;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i8);
            onProvideAutofillVirtualStructure(viewStructure, i8);
            FrameLayout frameLayout = this.f3440a;
            viewStructure.setChildCount(frameLayout.getChildCount());
            for (int i9 = 0; i9 < frameLayout.getChildCount(); i9++) {
                View childAt = frameLayout.getChildAt(i9);
                ViewStructure newChild = viewStructure.newChild(i9);
                childAt.dispatchProvideAutofillStructure(newChild, i8);
                if (childAt == this.e) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.I0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.I0 = false;
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.y) {
            u4.c cVar = this.D0;
            cVar.getClass();
            int save = canvas.save();
            if (cVar.f7757x != null && cVar.f7738b) {
                cVar.N.getLineLeft(0);
                cVar.E.setTextSize(cVar.B);
                float f9 = cVar.f7752q;
                float f10 = cVar.r;
                float f11 = cVar.A;
                if (f11 != 1.0f) {
                    canvas.scale(f11, f11, f9, f10);
                }
                canvas.translate(f9, f10);
                cVar.N.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        y4.f fVar = this.C;
        if (fVar != null) {
            Rect bounds = fVar.getBounds();
            bounds.top = bounds.bottom - this.H;
            this.C.draw(canvas);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r1 = r3.f7746k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.H0
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r4.H0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            u4.c r3 = r4.D0
            if (r3 == 0) goto L_0x0037
            r3.C = r1
            android.content.res.ColorStateList r1 = r3.f7747l
            if (r1 == 0) goto L_0x0020
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L_0x002a
        L_0x0020:
            android.content.res.ColorStateList r1 = r3.f7746k
            if (r1 == 0) goto L_0x002c
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L_0x002c
        L_0x002a:
            r1 = r0
            goto L_0x002d
        L_0x002c:
            r1 = r2
        L_0x002d:
            if (r1 == 0) goto L_0x0034
            r3.h()
            r1 = r0
            goto L_0x0035
        L_0x0034:
            r1 = r2
        L_0x0035:
            r1 = r1 | r2
            goto L_0x0038
        L_0x0037:
            r1 = r2
        L_0x0038:
            android.widget.EditText r3 = r4.e
            if (r3 == 0) goto L_0x004f
            int[] r3 = j0.x.f4957a
            boolean r3 = j0.x.f.c(r4)
            if (r3 == 0) goto L_0x004b
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r0 = r2
        L_0x004c:
            r4.t(r0, r2)
        L_0x004f:
            r4.r()
            r4.A()
            if (r1 == 0) goto L_0x005a
            r4.invalidate()
        L_0x005a:
            r4.H0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final int e() {
        float f9;
        if (!this.y) {
            return 0;
        }
        int i8 = this.F;
        u4.c cVar = this.D0;
        if (i8 == 0 || i8 == 1) {
            TextPaint textPaint = cVar.F;
            textPaint.setTextSize(cVar.f7745j);
            textPaint.setTypeface(cVar.f7753s);
            textPaint.setLetterSpacing(cVar.M);
            f9 = -textPaint.ascent();
        } else if (i8 != 2) {
            return 0;
        } else {
            TextPaint textPaint2 = cVar.F;
            textPaint2.setTextSize(cVar.f7745j);
            textPaint2.setTypeface(cVar.f7753s);
            textPaint2.setLetterSpacing(cVar.M);
            f9 = (-textPaint2.ascent()) / 2.0f;
        }
        return (int) f9;
    }

    public final boolean f() {
        return this.y && !TextUtils.isEmpty(this.f3483z) && (this.B instanceof c5.f);
    }

    public final int g(int i8, boolean z8) {
        int compoundPaddingRight = i8 - this.e.getCompoundPaddingRight();
        if (this.f3477u == null || !z8) {
            return compoundPaddingRight;
        }
        TextView textView = this.f3478v;
        return compoundPaddingRight + (textView.getMeasuredWidth() - textView.getPaddingRight());
    }

    public int getBaseline() {
        EditText editText = this.e;
        return editText != null ? editText.getBaseline() + getPaddingTop() + e() : super.getBaseline();
    }

    public y4.f getBoxBackground() {
        int i8 = this.F;
        if (i8 == 1 || i8 == 2) {
            return this.B;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.L;
    }

    public int getBoxBackgroundMode() {
        return this.F;
    }

    public float getBoxCornerRadiusBottomEnd() {
        y4.f fVar = this.B;
        return fVar.f8412a.f8433a.f8460h.a(fVar.g());
    }

    public float getBoxCornerRadiusBottomStart() {
        y4.f fVar = this.B;
        return fVar.f8412a.f8433a.f8459g.a(fVar.g());
    }

    public float getBoxCornerRadiusTopEnd() {
        y4.f fVar = this.B;
        return fVar.f8412a.f8433a.f8458f.a(fVar.g());
    }

    public float getBoxCornerRadiusTopStart() {
        y4.f fVar = this.B;
        return fVar.f8412a.f8433a.e.a(fVar.g());
    }

    public int getBoxStrokeColor() {
        return this.f3479v0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f3480w0;
    }

    public int getBoxStrokeWidth() {
        return this.I;
    }

    public int getBoxStrokeWidthFocused() {
        return this.J;
    }

    public int getCounterMaxLength() {
        return this.f3455i;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.f3453h || !this.f3457j || (textView = this.f3459k) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f3474s;
    }

    public ColorStateList getCounterTextColor() {
        return this.f3474s;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f3473r0;
    }

    public EditText getEditText() {
        return this.e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f3448e0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f3448e0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f3445c0;
    }

    public CheckableImageButton getEndIconView() {
        return this.f3448e0;
    }

    public CharSequence getError() {
        m mVar = this.f3451g;
        if (mVar.f2696k) {
            return mVar.f2695j;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f3451g.f2698m;
    }

    public int getErrorCurrentTextColors() {
        return this.f3451g.g();
    }

    public Drawable getErrorIconDrawable() {
        return this.f3470p0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.f3451g.g();
    }

    public CharSequence getHelperText() {
        m mVar = this.f3451g;
        if (mVar.f2702q) {
            return mVar.f2701p;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        TextView textView = this.f3451g.r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.y) {
            return this.f3483z;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        u4.c cVar = this.D0;
        TextPaint textPaint = cVar.F;
        textPaint.setTextSize(cVar.f7745j);
        textPaint.setTypeface(cVar.f7753s);
        textPaint.setLetterSpacing(cVar.M);
        return -textPaint.ascent();
    }

    public final int getHintCurrentCollapsedTextColor() {
        u4.c cVar = this.D0;
        return cVar.e(cVar.f7747l);
    }

    public ColorStateList getHintTextColor() {
        return this.s0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f3448e0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f3448e0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f3467o) {
            return this.f3465n;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.r;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f3471q;
    }

    public CharSequence getPrefixText() {
        return this.f3477u;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f3478v.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f3478v;
    }

    public CharSequence getStartIconContentDescription() {
        return this.Q.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.Q.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.w;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f3481x.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f3481x;
    }

    public Typeface getTypeface() {
        return this.P;
    }

    public final boolean h() {
        return this.f3446d.getVisibility() == 0 && this.f3448e0.getVisibility() == 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i() {
        /*
            r6 = this;
            int r0 = r6.F
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x004d
            y4.i r3 = r6.D
            if (r0 == r1) goto L_0x003e
            r4 = 2
            if (r0 != r4) goto L_0x0025
            boolean r0 = r6.y
            if (r0 == 0) goto L_0x001d
            y4.f r0 = r6.B
            boolean r0 = r0 instanceof c5.f
            if (r0 != 0) goto L_0x001d
            c5.f r0 = new c5.f
            r0.<init>(r3)
            goto L_0x0022
        L_0x001d:
            y4.f r0 = new y4.f
            r0.<init>((y4.i) r3)
        L_0x0022:
            r6.B = r0
            goto L_0x004f
        L_0x0025:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r6 = r6.F
            r1.append(r6)
            java.lang.String r6 = " is illegal; only @BoxBackgroundMode constants are supported."
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L_0x003e:
            y4.f r0 = new y4.f
            r0.<init>((y4.i) r3)
            r6.B = r0
            y4.f r0 = new y4.f
            r0.<init>()
            r6.C = r0
            goto L_0x0051
        L_0x004d:
            r6.B = r2
        L_0x004f:
            r6.C = r2
        L_0x0051:
            android.widget.EditText r0 = r6.e
            r2 = 0
            if (r0 == 0) goto L_0x0066
            y4.f r3 = r6.B
            if (r3 == 0) goto L_0x0066
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 != 0) goto L_0x0066
            int r0 = r6.F
            if (r0 == 0) goto L_0x0066
            r0 = r1
            goto L_0x0067
        L_0x0066:
            r0 = r2
        L_0x0067:
            if (r0 == 0) goto L_0x0072
            android.widget.EditText r0 = r6.e
            y4.f r3 = r6.B
            int[] r4 = j0.x.f4957a
            j0.x.c.q(r0, r3)
        L_0x0072:
            r6.A()
            int r0 = r6.F
            r3 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L_0x00b1
            android.content.Context r0 = r6.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            float r0 = r0.fontScale
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x008f
            r0 = r1
            goto L_0x0090
        L_0x008f:
            r0 = r2
        L_0x0090:
            if (r0 == 0) goto L_0x009a
            android.content.res.Resources r0 = r6.getResources()
            r4 = -2147024670(0xffffffff800700e2, float:-6.43165E-40)
            goto L_0x00ab
        L_0x009a:
            android.content.Context r0 = r6.getContext()
            boolean r0 = v4.c.d(r0)
            if (r0 == 0) goto L_0x00b1
            android.content.res.Resources r0 = r6.getResources()
            r4 = -2147024671(0xffffffff800700e1, float:-6.43164E-40)
        L_0x00ab:
            int r0 = r0.getDimensionPixelSize(r4)
            r6.G = r0
        L_0x00b1:
            android.widget.EditText r0 = r6.e
            if (r0 == 0) goto L_0x0122
            int r0 = r6.F
            if (r0 == r1) goto L_0x00ba
            goto L_0x0122
        L_0x00ba:
            android.content.Context r0 = r6.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            float r0 = r0.fontScale
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x00cd
            goto L_0x00ce
        L_0x00cd:
            r1 = r2
        L_0x00ce:
            if (r1 == 0) goto L_0x00f1
            android.widget.EditText r0 = r6.e
            int[] r1 = j0.x.f4957a
            int r1 = j0.x.d.f(r0)
            android.content.res.Resources r2 = r6.getResources()
            r3 = -2147024672(0xffffffff800700e0, float:-6.43162E-40)
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.EditText r3 = r6.e
            int r3 = j0.x.d.e(r3)
            android.content.res.Resources r4 = r6.getResources()
            r5 = -2147024673(0xffffffff800700df, float:-6.43161E-40)
            goto L_0x011b
        L_0x00f1:
            android.content.Context r0 = r6.getContext()
            boolean r0 = v4.c.d(r0)
            if (r0 == 0) goto L_0x0122
            android.widget.EditText r0 = r6.e
            int[] r1 = j0.x.f4957a
            int r1 = j0.x.d.f(r0)
            android.content.res.Resources r2 = r6.getResources()
            r3 = -2147024674(0xffffffff800700de, float:-6.4316E-40)
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.EditText r3 = r6.e
            int r3 = j0.x.d.e(r3)
            android.content.res.Resources r4 = r6.getResources()
            r5 = -2147024675(0xffffffff800700dd, float:-6.43158E-40)
        L_0x011b:
            int r4 = r4.getDimensionPixelSize(r5)
            j0.x.d.k(r0, r1, r2, r3, r4)
        L_0x0122:
            int r0 = r6.F
            if (r0 == 0) goto L_0x0129
            r6.s()
        L_0x0129:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.i():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j() {
        /*
            r12 = this;
            boolean r0 = r12.f()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            android.graphics.RectF r0 = r12.O
            android.widget.EditText r1 = r12.e
            int r1 = r1.getWidth()
            android.widget.EditText r2 = r12.e
            int r2 = r2.getGravity()
            u4.c r3 = r12.D0
            java.lang.CharSequence r4 = r3.w
            boolean r4 = r3.c(r4)
            r3.y = r4
            r5 = 5
            r6 = 8388613(0x800005, float:1.175495E-38)
            r7 = 1
            r8 = 1073741824(0x40000000, float:2.0)
            r9 = 17
            android.graphics.Rect r10 = r3.e
            if (r2 == r9) goto L_0x004b
            r11 = r2 & 7
            if (r11 != r7) goto L_0x0031
            goto L_0x004b
        L_0x0031:
            r11 = r2 & r6
            if (r11 == r6) goto L_0x003d
            r11 = r2 & 5
            if (r11 != r5) goto L_0x003a
            goto L_0x003d
        L_0x003a:
            if (r4 == 0) goto L_0x003f
            goto L_0x0043
        L_0x003d:
            if (r4 == 0) goto L_0x0043
        L_0x003f:
            int r4 = r10.left
            float r4 = (float) r4
            goto L_0x0053
        L_0x0043:
            int r4 = r10.right
            float r4 = (float) r4
            float r11 = r3.b()
            goto L_0x0052
        L_0x004b:
            float r4 = (float) r1
            float r4 = r4 / r8
            float r11 = r3.b()
            float r11 = r11 / r8
        L_0x0052:
            float r4 = r4 - r11
        L_0x0053:
            r0.left = r4
            int r11 = r10.top
            float r11 = (float) r11
            r0.top = r11
            if (r2 == r9) goto L_0x007d
            r9 = r2 & 7
            if (r9 != r7) goto L_0x0061
            goto L_0x007d
        L_0x0061:
            r1 = r2 & r6
            if (r1 == r6) goto L_0x006f
            r1 = r2 & 5
            if (r1 != r5) goto L_0x006a
            goto L_0x006f
        L_0x006a:
            boolean r1 = r3.y
            if (r1 == 0) goto L_0x0073
            goto L_0x0079
        L_0x006f:
            boolean r1 = r3.y
            if (r1 == 0) goto L_0x0079
        L_0x0073:
            float r1 = r3.b()
            float r1 = r1 + r4
            goto L_0x0085
        L_0x0079:
            int r1 = r10.right
            float r1 = (float) r1
            goto L_0x0085
        L_0x007d:
            float r1 = (float) r1
            float r1 = r1 / r8
            float r2 = r3.b()
            float r2 = r2 / r8
            float r1 = r1 + r2
        L_0x0085:
            r0.right = r1
            int r1 = r10.top
            float r1 = (float) r1
            android.text.TextPaint r2 = r3.F
            float r4 = r3.f7745j
            r2.setTextSize(r4)
            android.graphics.Typeface r4 = r3.f7753s
            r2.setTypeface(r4)
            float r3 = r3.M
            r2.setLetterSpacing(r3)
            float r2 = r2.ascent()
            float r2 = -r2
            float r1 = r1 + r2
            float r2 = r0.left
            int r3 = r12.E
            float r3 = (float) r3
            float r2 = r2 - r3
            r0.left = r2
            float r2 = r0.top
            float r2 = r2 - r3
            r0.top = r2
            float r2 = r0.right
            float r2 = r2 + r3
            r0.right = r2
            float r1 = r1 + r3
            r0.bottom = r1
            int r1 = r12.getPaddingLeft()
            int r1 = -r1
            float r1 = (float) r1
            int r2 = r12.getPaddingTop()
            int r2 = -r2
            float r2 = (float) r2
            r0.offset(r1, r2)
            y4.f r12 = r12.B
            c5.f r12 = (c5.f) r12
            r12.getClass()
            float r1 = r0.left
            float r2 = r0.top
            float r3 = r0.right
            float r0 = r0.bottom
            r12.n(r1, r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.j():void");
    }

    public final void l(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
            System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable mutate = drawable.mutate();
            d0.b.h(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    public final void n(TextView textView, int i8) {
        boolean z8 = true;
        try {
            textView.setTextAppearance(i8);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z8 = false;
            }
        } catch (Exception unused) {
        }
        if (z8) {
            textView.setTextAppearance(-2146303660);
            Context context = getContext();
            Object obj = a0.a.f10a;
            textView.setTextColor(a.c.a(context, R.color.design_error));
        }
    }

    public final void o(int i8) {
        boolean z8 = this.f3457j;
        int i9 = this.f3455i;
        String str = null;
        if (i9 == -1) {
            this.f3459k.setText(String.valueOf(i8));
            this.f3459k.setContentDescription((CharSequence) null);
            this.f3457j = false;
        } else {
            this.f3457j = i8 > i9;
            this.f3459k.setContentDescription(getContext().getString(this.f3457j ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, new Object[]{Integer.valueOf(i8), Integer.valueOf(this.f3455i)}));
            if (z8 != this.f3457j) {
                p();
            }
            String str2 = h0.a.f4715d;
            Locale locale = Locale.getDefault();
            int i10 = h0.e.f4736a;
            h0.a aVar = e.a.a(locale) == 1 ? h0.a.f4717g : h0.a.f4716f;
            TextView textView = this.f3459k;
            String string = getContext().getString(R.string.character_counter_pattern, new Object[]{Integer.valueOf(i8), Integer.valueOf(this.f3455i)});
            if (string == null) {
                aVar.getClass();
            } else {
                str = aVar.c(string, aVar.f4720c).toString();
            }
            textView.setText(str);
        }
        if (this.e != null && z8 != this.f3457j) {
            t(false, false);
            A();
            r();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
        /*
            r6 = this;
            super.onLayout(r7, r8, r9, r10, r11)
            android.widget.EditText r7 = r6.e
            if (r7 == 0) goto L_0x01b6
            android.graphics.Rect r8 = r6.M
            u4.d.a(r6, r7, r8)
            y4.f r7 = r6.C
            if (r7 == 0) goto L_0x001d
            int r9 = r8.bottom
            int r10 = r6.J
            int r10 = r9 - r10
            int r11 = r8.left
            int r0 = r8.right
            r7.setBounds(r11, r10, r0, r9)
        L_0x001d:
            boolean r7 = r6.y
            if (r7 == 0) goto L_0x01b6
            android.widget.EditText r7 = r6.e
            float r7 = r7.getTextSize()
            u4.c r9 = r6.D0
            float r10 = r9.f7744i
            int r10 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r10 == 0) goto L_0x0034
            r9.f7744i = r7
            r9.h()
        L_0x0034:
            android.widget.EditText r7 = r6.e
            int r7 = r7.getGravity()
            r10 = r7 & -113(0xffffffffffffff8f, float:NaN)
            r10 = r10 | 48
            int r11 = r9.f7743h
            if (r11 == r10) goto L_0x0047
            r9.f7743h = r10
            r9.h()
        L_0x0047:
            int r10 = r9.f7742g
            if (r10 == r7) goto L_0x0050
            r9.f7742g = r7
            r9.h()
        L_0x0050:
            android.widget.EditText r7 = r6.e
            if (r7 == 0) goto L_0x01b0
            int[] r7 = j0.x.f4957a
            int r7 = j0.x.d.d(r6)
            r10 = 0
            r11 = 1
            if (r7 != r11) goto L_0x0060
            r7 = r11
            goto L_0x0061
        L_0x0060:
            r7 = r10
        L_0x0061:
            int r0 = r8.bottom
            android.graphics.Rect r1 = r6.N
            r1.bottom = r0
            int r0 = r6.F
            android.widget.TextView r2 = r6.f3478v
            if (r0 == r11) goto L_0x00ae
            r3 = 2
            if (r0 == r3) goto L_0x0090
            int r0 = r8.left
            android.widget.EditText r3 = r6.e
            int r3 = r3.getCompoundPaddingLeft()
            int r0 = r0 + r3
            java.lang.CharSequence r3 = r6.f3477u
            if (r3 == 0) goto L_0x0089
            if (r7 != 0) goto L_0x0089
            int r3 = r2.getMeasuredWidth()
            int r0 = r0 - r3
            int r2 = r2.getPaddingLeft()
            int r0 = r0 + r2
        L_0x0089:
            r1.left = r0
            int r0 = r6.getPaddingTop()
            goto L_0x00ce
        L_0x0090:
            int r7 = r8.left
            android.widget.EditText r0 = r6.e
            int r0 = r0.getPaddingLeft()
            int r7 = r7 + r0
            r1.left = r7
            int r7 = r8.top
            int r0 = r6.e()
            int r7 = r7 - r0
            r1.top = r7
            int r7 = r8.right
            android.widget.EditText r0 = r6.e
            int r0 = r0.getPaddingRight()
            int r7 = r7 - r0
            goto L_0x00d6
        L_0x00ae:
            int r0 = r8.left
            android.widget.EditText r3 = r6.e
            int r3 = r3.getCompoundPaddingLeft()
            int r0 = r0 + r3
            java.lang.CharSequence r3 = r6.f3477u
            if (r3 == 0) goto L_0x00c7
            if (r7 != 0) goto L_0x00c7
            int r3 = r2.getMeasuredWidth()
            int r0 = r0 - r3
            int r2 = r2.getPaddingLeft()
            int r0 = r0 + r2
        L_0x00c7:
            r1.left = r0
            int r0 = r8.top
            int r2 = r6.G
            int r0 = r0 + r2
        L_0x00ce:
            r1.top = r0
            int r0 = r8.right
            int r7 = r6.g(r0, r7)
        L_0x00d6:
            r1.right = r7
            int r0 = r1.left
            int r2 = r1.top
            int r3 = r1.bottom
            android.graphics.Rect r4 = r9.e
            int r5 = r4.left
            if (r5 != r0) goto L_0x00f2
            int r5 = r4.top
            if (r5 != r2) goto L_0x00f2
            int r5 = r4.right
            if (r5 != r7) goto L_0x00f2
            int r5 = r4.bottom
            if (r5 != r3) goto L_0x00f2
            r5 = r11
            goto L_0x00f3
        L_0x00f2:
            r5 = r10
        L_0x00f3:
            if (r5 != 0) goto L_0x00fd
            r4.set(r0, r2, r7, r3)
            r9.D = r11
            r9.g()
        L_0x00fd:
            android.widget.EditText r7 = r6.e
            if (r7 == 0) goto L_0x01aa
            android.text.TextPaint r7 = r9.F
            float r0 = r9.f7744i
            r7.setTextSize(r0)
            android.graphics.Typeface r0 = r9.f7754t
            r7.setTypeface(r0)
            r0 = 0
            r7.setLetterSpacing(r0)
            float r7 = r7.ascent()
            float r7 = -r7
            int r0 = r8.left
            android.widget.EditText r2 = r6.e
            int r2 = r2.getCompoundPaddingLeft()
            int r0 = r0 + r2
            r1.left = r0
            int r0 = r6.F
            if (r0 != r11) goto L_0x012f
            android.widget.EditText r0 = r6.e
            int r0 = r0.getMinLines()
            if (r0 > r11) goto L_0x012f
            r0 = r11
            goto L_0x0130
        L_0x012f:
            r0 = r10
        L_0x0130:
            if (r0 == 0) goto L_0x013e
            int r0 = r8.centerY()
            float r0 = (float) r0
            r2 = 1073741824(0x40000000, float:2.0)
            float r2 = r7 / r2
            float r0 = r0 - r2
            int r0 = (int) r0
            goto L_0x0147
        L_0x013e:
            int r0 = r8.top
            android.widget.EditText r2 = r6.e
            int r2 = r2.getCompoundPaddingTop()
            int r0 = r0 + r2
        L_0x0147:
            r1.top = r0
            int r0 = r8.right
            android.widget.EditText r2 = r6.e
            int r2 = r2.getCompoundPaddingRight()
            int r0 = r0 - r2
            r1.right = r0
            int r0 = r6.F
            if (r0 != r11) goto L_0x0162
            android.widget.EditText r0 = r6.e
            int r0 = r0.getMinLines()
            if (r0 > r11) goto L_0x0162
            r0 = r11
            goto L_0x0163
        L_0x0162:
            r0 = r10
        L_0x0163:
            if (r0 == 0) goto L_0x016b
            int r8 = r1.top
            float r8 = (float) r8
            float r8 = r8 + r7
            int r7 = (int) r8
            goto L_0x0174
        L_0x016b:
            int r7 = r8.bottom
            android.widget.EditText r8 = r6.e
            int r8 = r8.getCompoundPaddingBottom()
            int r7 = r7 - r8
        L_0x0174:
            r1.bottom = r7
            int r8 = r1.left
            int r0 = r1.top
            int r1 = r1.right
            android.graphics.Rect r2 = r9.f7740d
            int r3 = r2.left
            if (r3 != r8) goto L_0x018f
            int r3 = r2.top
            if (r3 != r0) goto L_0x018f
            int r3 = r2.right
            if (r3 != r1) goto L_0x018f
            int r3 = r2.bottom
            if (r3 != r7) goto L_0x018f
            r10 = r11
        L_0x018f:
            if (r10 != 0) goto L_0x0199
            r2.set(r8, r0, r1, r7)
            r9.D = r11
            r9.g()
        L_0x0199:
            r9.h()
            boolean r7 = r6.f()
            if (r7 == 0) goto L_0x01b6
            boolean r7 = r6.C0
            if (r7 != 0) goto L_0x01b6
            r6.j()
            goto L_0x01b6
        L_0x01aa:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>()
            throw r6
        L_0x01b0:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>()
            throw r6
        L_0x01b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onLayout(boolean, int, int, int, int):void");
    }

    public final void onMeasure(int i8, int i9) {
        EditText editText;
        int max;
        super.onMeasure(i8, i9);
        boolean z8 = false;
        if (this.e != null && this.e.getMeasuredHeight() < (max = Math.max(this.f3444c.getMeasuredHeight(), this.f3442b.getMeasuredHeight()))) {
            this.e.setMinimumHeight(max);
            z8 = true;
        }
        boolean q8 = q();
        if (z8 || q8) {
            this.e.post(new c());
        }
        if (!(this.f3469p == null || (editText = this.e) == null)) {
            this.f3469p.setGravity(editText.getGravity());
            this.f3469p.setPadding(this.e.getCompoundPaddingLeft(), this.e.getCompoundPaddingTop(), this.e.getCompoundPaddingRight(), this.e.getCompoundPaddingBottom());
        }
        v();
        y();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f6241f);
        setError(hVar.f3490h);
        if (hVar.f3491i) {
            this.f3448e0.post(new b());
        }
        setHint(hVar.f3492j);
        setHelperText(hVar.f3493k);
        setPlaceholderText(hVar.f3494l);
        requestLayout();
    }

    public final Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (this.f3451g.e()) {
            hVar.f3490h = getError();
        }
        boolean z8 = true;
        if (!(this.f3445c0 != 0) || !this.f3448e0.isChecked()) {
            z8 = false;
        }
        hVar.f3491i = z8;
        hVar.f3492j = getHint();
        hVar.f3493k = getHelperText();
        hVar.f3494l = getPlaceholderText();
        return hVar;
    }

    public final void p() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f3459k;
        if (textView != null) {
            n(textView, this.f3457j ? this.f3461l : this.f3463m);
            if (!this.f3457j && (colorStateList2 = this.f3474s) != null) {
                this.f3459k.setTextColor(colorStateList2);
            }
            if (this.f3457j && (colorStateList = this.f3475t) != null) {
                this.f3459k.setTextColor(colorStateList);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0087, code lost:
        if (h() != false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008b, code lost:
        if (r10.w != null) goto L_0x008d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.e
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            android.graphics.drawable.Drawable r0 = r10.getStartIconDrawable()
            android.widget.LinearLayout r2 = r10.f3442b
            r3 = 1
            if (r0 != 0) goto L_0x0013
            java.lang.CharSequence r0 = r10.f3477u
            if (r0 == 0) goto L_0x001b
        L_0x0013:
            int r0 = r2.getMeasuredWidth()
            if (r0 <= 0) goto L_0x001b
            r0 = r3
            goto L_0x001c
        L_0x001b:
            r0 = r1
        L_0x001c:
            r4 = 0
            r5 = 2
            r6 = 3
            if (r0 == 0) goto L_0x0058
            int r0 = r2.getMeasuredWidth()
            android.widget.EditText r2 = r10.e
            int r2 = r2.getPaddingLeft()
            int r0 = r0 - r2
            android.graphics.drawable.ColorDrawable r2 = r10.V
            if (r2 == 0) goto L_0x0034
            int r2 = r10.W
            if (r2 == r0) goto L_0x0040
        L_0x0034:
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r2.<init>()
            r10.V = r2
            r10.W = r0
            r2.setBounds(r1, r1, r0, r3)
        L_0x0040:
            android.widget.EditText r0 = r10.e
            android.graphics.drawable.Drawable[] r0 = n0.k.a(r0)
            r2 = r0[r1]
            android.graphics.drawable.ColorDrawable r7 = r10.V
            if (r2 == r7) goto L_0x0071
            android.widget.EditText r2 = r10.e
            r8 = r0[r3]
            r9 = r0[r5]
            r0 = r0[r6]
            n0.k.e(r2, r7, r8, r9, r0)
            goto L_0x006f
        L_0x0058:
            android.graphics.drawable.ColorDrawable r0 = r10.V
            if (r0 == 0) goto L_0x0071
            android.widget.EditText r0 = r10.e
            android.graphics.drawable.Drawable[] r0 = n0.k.a(r0)
            android.widget.EditText r2 = r10.e
            r7 = r0[r3]
            r8 = r0[r5]
            r0 = r0[r6]
            n0.k.e(r2, r4, r7, r8, r0)
            r10.V = r4
        L_0x006f:
            r0 = r3
            goto L_0x0072
        L_0x0071:
            r0 = r1
        L_0x0072:
            com.google.android.material.internal.CheckableImageButton r2 = r10.f3470p0
            int r2 = r2.getVisibility()
            if (r2 == 0) goto L_0x008d
            int r2 = r10.f3445c0
            if (r2 == 0) goto L_0x0080
            r2 = r3
            goto L_0x0081
        L_0x0080:
            r2 = r1
        L_0x0081:
            if (r2 == 0) goto L_0x0089
            boolean r2 = r10.h()
            if (r2 != 0) goto L_0x008d
        L_0x0089:
            java.lang.CharSequence r2 = r10.w
            if (r2 == 0) goto L_0x0097
        L_0x008d:
            android.widget.LinearLayout r2 = r10.f3444c
            int r2 = r2.getMeasuredWidth()
            if (r2 <= 0) goto L_0x0097
            r2 = r3
            goto L_0x0098
        L_0x0097:
            r2 = r1
        L_0x0098:
            if (r2 == 0) goto L_0x0102
            android.widget.TextView r2 = r10.f3481x
            int r2 = r2.getMeasuredWidth()
            android.widget.EditText r4 = r10.e
            int r4 = r4.getPaddingRight()
            int r2 = r2 - r4
            com.google.android.material.internal.CheckableImageButton r4 = r10.getEndIconToUpdateDummyDrawable()
            if (r4 == 0) goto L_0x00bd
            int r7 = r4.getMeasuredWidth()
            int r2 = r2 + r7
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            int r4 = j0.g.c(r4)
            int r2 = r2 + r4
        L_0x00bd:
            android.widget.EditText r4 = r10.e
            android.graphics.drawable.Drawable[] r4 = n0.k.a(r4)
            android.graphics.drawable.ColorDrawable r7 = r10.f3460k0
            if (r7 == 0) goto L_0x00de
            int r8 = r10.f3462l0
            if (r8 == r2) goto L_0x00de
            r10.f3462l0 = r2
            r7.setBounds(r1, r1, r2, r3)
            android.widget.EditText r0 = r10.e
            r1 = r4[r1]
            r2 = r4[r3]
            android.graphics.drawable.ColorDrawable r10 = r10.f3460k0
            r4 = r4[r6]
            n0.k.e(r0, r1, r2, r10, r4)
            goto L_0x0123
        L_0x00de:
            if (r7 != 0) goto L_0x00ec
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.f3460k0 = r7
            r10.f3462l0 = r2
            r7.setBounds(r1, r1, r2, r3)
        L_0x00ec:
            r2 = r4[r5]
            android.graphics.drawable.ColorDrawable r5 = r10.f3460k0
            if (r2 == r5) goto L_0x0100
            r10.f3464m0 = r2
            android.widget.EditText r10 = r10.e
            r0 = r4[r1]
            r1 = r4[r3]
            r2 = r4[r6]
            n0.k.e(r10, r0, r1, r5, r2)
            goto L_0x0123
        L_0x0100:
            r3 = r0
            goto L_0x0123
        L_0x0102:
            android.graphics.drawable.ColorDrawable r2 = r10.f3460k0
            if (r2 == 0) goto L_0x0124
            android.widget.EditText r2 = r10.e
            android.graphics.drawable.Drawable[] r2 = n0.k.a(r2)
            r5 = r2[r5]
            android.graphics.drawable.ColorDrawable r7 = r10.f3460k0
            if (r5 != r7) goto L_0x0120
            android.widget.EditText r0 = r10.e
            r1 = r2[r1]
            r5 = r2[r3]
            android.graphics.drawable.Drawable r7 = r10.f3464m0
            r2 = r2[r6]
            n0.k.e(r0, r1, r5, r7, r2)
            goto L_0x0121
        L_0x0120:
            r3 = r0
        L_0x0121:
            r10.f3460k0 = r4
        L_0x0123:
            r0 = r3
        L_0x0124:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.q():boolean");
    }

    public final void r() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.e;
        if (editText != null && this.F == 0 && (background = editText.getBackground()) != null) {
            if (w.a(background)) {
                background = background.mutate();
            }
            m mVar = this.f3451g;
            if (mVar.e()) {
                currentTextColor = mVar.g();
            } else if (!this.f3457j || (textView = this.f3459k) == null) {
                background.clearColorFilter();
                this.e.refreshDrawableState();
                return;
            } else {
                currentTextColor = textView.getCurrentTextColor();
            }
            background.setColorFilter(androidx.appcompat.widget.i.c(currentTextColor, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void s() {
        if (this.F != 1) {
            FrameLayout frameLayout = this.f3440a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int e4 = e();
            if (e4 != layoutParams.topMargin) {
                layoutParams.topMargin = e4;
                frameLayout.requestLayout();
            }
        }
    }

    public void setBoxBackgroundColor(int i8) {
        if (this.L != i8) {
            this.L = i8;
            this.f3482x0 = i8;
            this.f3484z0 = i8;
            this.A0 = i8;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i8) {
        Context context = getContext();
        Object obj = a0.a.f10a;
        setBoxBackgroundColor(a.c.a(context, i8));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f3482x0 = defaultColor;
        this.L = defaultColor;
        this.y0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f3484z0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.A0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i8) {
        if (i8 != this.F) {
            this.F = i8;
            if (this.e != null) {
                i();
            }
        }
    }

    public void setBoxStrokeColor(int i8) {
        if (this.f3479v0 != i8) {
            this.f3479v0 = i8;
            A();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (colorStateList.isStateful()) {
            this.f3476t0 = colorStateList.getDefaultColor();
            this.B0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.u0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else {
            if (this.f3479v0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            A();
        }
        this.f3479v0 = defaultColor;
        A();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f3480w0 != colorStateList) {
            this.f3480w0 = colorStateList;
            A();
        }
    }

    public void setBoxStrokeWidth(int i8) {
        this.I = i8;
        A();
    }

    public void setBoxStrokeWidthFocused(int i8) {
        this.J = i8;
        A();
    }

    public void setBoxStrokeWidthFocusedResource(int i8) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i8));
    }

    public void setBoxStrokeWidthResource(int i8) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i8));
    }

    public void setCounterEnabled(boolean z8) {
        if (this.f3453h != z8) {
            m mVar = this.f3451g;
            if (z8) {
                s sVar = new s(getContext(), (AttributeSet) null);
                this.f3459k = sVar;
                sVar.setId(R.id.textinput_counter);
                Typeface typeface = this.P;
                if (typeface != null) {
                    this.f3459k.setTypeface(typeface);
                }
                this.f3459k.setMaxLines(1);
                mVar.a(this.f3459k, 2);
                j0.g.h((ViewGroup.MarginLayoutParams) this.f3459k.getLayoutParams(), getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                p();
                if (this.f3459k != null) {
                    EditText editText = this.e;
                    o(editText == null ? 0 : editText.getText().length());
                }
            } else {
                mVar.i(this.f3459k, 2);
                this.f3459k = null;
            }
            this.f3453h = z8;
        }
    }

    public void setCounterMaxLength(int i8) {
        if (this.f3455i != i8) {
            if (i8 <= 0) {
                i8 = -1;
            }
            this.f3455i = i8;
            if (this.f3453h && this.f3459k != null) {
                EditText editText = this.e;
                o(editText == null ? 0 : editText.getText().length());
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i8) {
        if (this.f3461l != i8) {
            this.f3461l = i8;
            p();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f3475t != colorStateList) {
            this.f3475t = colorStateList;
            p();
        }
    }

    public void setCounterTextAppearance(int i8) {
        if (this.f3463m != i8) {
            this.f3463m = i8;
            p();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f3474s != colorStateList) {
            this.f3474s = colorStateList;
            p();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f3473r0 = colorStateList;
        this.s0 = colorStateList;
        if (this.e != null) {
            t(false, false);
        }
    }

    public void setEnabled(boolean z8) {
        k(this, z8);
        super.setEnabled(z8);
    }

    public void setEndIconActivated(boolean z8) {
        this.f3448e0.setActivated(z8);
    }

    public void setEndIconCheckable(boolean z8) {
        this.f3448e0.setCheckable(z8);
    }

    public void setEndIconContentDescription(int i8) {
        setEndIconContentDescription(i8 != 0 ? getResources().getText(i8) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f3448e0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i8) {
        setEndIconDrawable(i8 != 0 ? g.a.a(getContext(), i8) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f3448e0;
        checkableImageButton.setImageDrawable(drawable);
        l(checkableImageButton, this.f3452g0);
    }

    public void setEndIconMode(int i8) {
        int i9 = this.f3445c0;
        this.f3445c0 = i8;
        Iterator<g> it = this.f3450f0.iterator();
        while (it.hasNext()) {
            it.next().a(this, i9);
        }
        setEndIconVisible(i8 != 0);
        if (getEndIconDelegate().b(this.F)) {
            getEndIconDelegate().a();
            c();
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.F + " is not supported by the end icon mode " + i8);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.f3466n0;
        CheckableImageButton checkableImageButton = this.f3448e0;
        checkableImageButton.setOnClickListener(onClickListener);
        m(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f3466n0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f3448e0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f3452g0 != colorStateList) {
            this.f3452g0 = colorStateList;
            this.f3454h0 = true;
            c();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f3456i0 != mode) {
            this.f3456i0 = mode;
            this.f3458j0 = true;
            c();
        }
    }

    public void setEndIconVisible(boolean z8) {
        if (h() != z8) {
            this.f3448e0.setVisibility(z8 ? 0 : 8);
            y();
            q();
        }
    }

    public void setError(CharSequence charSequence) {
        m mVar = this.f3451g;
        if (!mVar.f2696k) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            mVar.c();
            mVar.f2695j = charSequence;
            mVar.f2697l.setText(charSequence);
            int i8 = mVar.f2693h;
            if (i8 != 1) {
                mVar.f2694i = 1;
            }
            mVar.k(i8, mVar.j(mVar.f2697l, charSequence), mVar.f2694i);
            return;
        }
        mVar.h();
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        m mVar = this.f3451g;
        mVar.f2698m = charSequence;
        TextView textView = mVar.f2697l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z8) {
        m mVar = this.f3451g;
        if (mVar.f2696k != z8) {
            mVar.c();
            TextInputLayout textInputLayout = mVar.f2688b;
            if (z8) {
                s sVar = new s(mVar.f2687a, (AttributeSet) null);
                mVar.f2697l = sVar;
                sVar.setId(R.id.textinput_error);
                mVar.f2697l.setTextAlignment(5);
                Typeface typeface = mVar.f2705u;
                if (typeface != null) {
                    mVar.f2697l.setTypeface(typeface);
                }
                int i8 = mVar.f2699n;
                mVar.f2699n = i8;
                TextView textView = mVar.f2697l;
                if (textView != null) {
                    textInputLayout.n(textView, i8);
                }
                ColorStateList colorStateList = mVar.f2700o;
                mVar.f2700o = colorStateList;
                TextView textView2 = mVar.f2697l;
                if (!(textView2 == null || colorStateList == null)) {
                    textView2.setTextColor(colorStateList);
                }
                CharSequence charSequence = mVar.f2698m;
                mVar.f2698m = charSequence;
                TextView textView3 = mVar.f2697l;
                if (textView3 != null) {
                    textView3.setContentDescription(charSequence);
                }
                mVar.f2697l.setVisibility(4);
                TextView textView4 = mVar.f2697l;
                int[] iArr = x.f4957a;
                x.f.f(textView4, 1);
                mVar.a(mVar.f2697l, 0);
            } else {
                mVar.h();
                mVar.i(mVar.f2697l, 0);
                mVar.f2697l = null;
                textInputLayout.r();
                textInputLayout.A();
            }
            mVar.f2696k = z8;
        }
    }

    public void setErrorIconDrawable(int i8) {
        setErrorIconDrawable(i8 != 0 ? g.a.a(getContext(), i8) : null);
        l(this.f3470p0, this.f3472q0);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.f3468o0;
        CheckableImageButton checkableImageButton = this.f3470p0;
        checkableImageButton.setOnClickListener(onClickListener);
        m(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f3468o0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f3470p0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f3472q0 = colorStateList;
        CheckableImageButton checkableImageButton = this.f3470p0;
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            d0.b.h(drawable, colorStateList);
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        CheckableImageButton checkableImageButton = this.f3470p0;
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            d0.b.i(drawable, mode);
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i8) {
        m mVar = this.f3451g;
        mVar.f2699n = i8;
        TextView textView = mVar.f2697l;
        if (textView != null) {
            mVar.f2688b.n(textView, i8);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        m mVar = this.f3451g;
        mVar.f2700o = colorStateList;
        TextView textView = mVar.f2697l;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z8) {
        if (this.E0 != z8) {
            this.E0 = z8;
            t(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        m mVar = this.f3451g;
        if (!isEmpty) {
            if (!mVar.f2702q) {
                setHelperTextEnabled(true);
            }
            mVar.c();
            mVar.f2701p = charSequence;
            mVar.r.setText(charSequence);
            int i8 = mVar.f2693h;
            if (i8 != 2) {
                mVar.f2694i = 2;
            }
            mVar.k(i8, mVar.j(mVar.r, charSequence), mVar.f2694i);
        } else if (mVar.f2702q) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        m mVar = this.f3451g;
        mVar.f2704t = colorStateList;
        TextView textView = mVar.r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z8) {
        m mVar = this.f3451g;
        if (mVar.f2702q != z8) {
            mVar.c();
            if (z8) {
                s sVar = new s(mVar.f2687a, (AttributeSet) null);
                mVar.r = sVar;
                sVar.setId(R.id.textinput_helper_text);
                mVar.r.setTextAlignment(5);
                Typeface typeface = mVar.f2705u;
                if (typeface != null) {
                    mVar.r.setTypeface(typeface);
                }
                mVar.r.setVisibility(4);
                TextView textView = mVar.r;
                int[] iArr = x.f4957a;
                x.f.f(textView, 1);
                int i8 = mVar.f2703s;
                mVar.f2703s = i8;
                TextView textView2 = mVar.r;
                if (textView2 != null) {
                    textView2.setTextAppearance(i8);
                }
                ColorStateList colorStateList = mVar.f2704t;
                mVar.f2704t = colorStateList;
                TextView textView3 = mVar.r;
                if (!(textView3 == null || colorStateList == null)) {
                    textView3.setTextColor(colorStateList);
                }
                mVar.a(mVar.r, 1);
            } else {
                mVar.c();
                int i9 = mVar.f2693h;
                if (i9 == 2) {
                    mVar.f2694i = 0;
                }
                mVar.k(i9, mVar.j(mVar.r, (CharSequence) null), mVar.f2694i);
                mVar.i(mVar.r, 1);
                mVar.r = null;
                TextInputLayout textInputLayout = mVar.f2688b;
                textInputLayout.r();
                textInputLayout.A();
            }
            mVar.f2702q = z8;
        }
    }

    public void setHelperTextTextAppearance(int i8) {
        m mVar = this.f3451g;
        mVar.f2703s = i8;
        TextView textView = mVar.r;
        if (textView != null) {
            textView.setTextAppearance(i8);
        }
    }

    public void setHint(int i8) {
        setHint(i8 != 0 ? getResources().getText(i8) : null);
    }

    public void setHint(CharSequence charSequence) {
        if (this.y) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z8) {
        this.F0 = z8;
    }

    public void setHintEnabled(boolean z8) {
        if (z8 != this.y) {
            this.y = z8;
            if (!z8) {
                this.A = false;
                if (!TextUtils.isEmpty(this.f3483z) && TextUtils.isEmpty(this.e.getHint())) {
                    this.e.setHint(this.f3483z);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f3483z)) {
                        setHint(hint);
                    }
                    this.e.setHint((CharSequence) null);
                }
                this.A = true;
            }
            if (this.e != null) {
                s();
            }
        }
    }

    public void setHintTextAppearance(int i8) {
        u4.c cVar = this.D0;
        View view = cVar.f7737a;
        v4.d dVar = new v4.d(view.getContext(), i8);
        ColorStateList colorStateList = dVar.f7932a;
        if (colorStateList != null) {
            cVar.f7747l = colorStateList;
        }
        float f9 = dVar.f7941k;
        if (f9 != 0.0f) {
            cVar.f7745j = f9;
        }
        ColorStateList colorStateList2 = dVar.f7933b;
        if (colorStateList2 != null) {
            cVar.L = colorStateList2;
        }
        cVar.J = dVar.f7936f;
        cVar.K = dVar.f7937g;
        cVar.I = dVar.f7938h;
        cVar.M = dVar.f7940j;
        v4.a aVar = cVar.f7756v;
        if (aVar != null) {
            aVar.f7931c = true;
        }
        u4.b bVar = new u4.b(cVar);
        dVar.a();
        cVar.f7756v = new v4.a(bVar, dVar.f7944n);
        dVar.b(view.getContext(), cVar.f7756v);
        cVar.h();
        this.s0 = cVar.f7747l;
        if (this.e != null) {
            t(false, false);
            s();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.s0 != colorStateList) {
            if (this.f3473r0 == null) {
                this.D0.i(colorStateList);
            }
            this.s0 = colorStateList;
            if (this.e != null) {
                t(false, false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i8) {
        setPasswordVisibilityToggleContentDescription(i8 != 0 ? getResources().getText(i8) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f3448e0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i8) {
        setPasswordVisibilityToggleDrawable(i8 != 0 ? g.a.a(getContext(), i8) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f3448e0.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z8) {
        if (z8 && this.f3445c0 != 1) {
            setEndIconMode(1);
        } else if (!z8) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f3452g0 = colorStateList;
        this.f3454h0 = true;
        c();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f3456i0 = mode;
        this.f3458j0 = true;
        c();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        int i8 = 0;
        if (!this.f3467o || !TextUtils.isEmpty(charSequence)) {
            if (!this.f3467o) {
                setPlaceholderTextEnabled(true);
            }
            this.f3465n = charSequence;
        } else {
            setPlaceholderTextEnabled(false);
        }
        EditText editText = this.e;
        if (editText != null) {
            i8 = editText.getText().length();
        }
        u(i8);
    }

    public void setPlaceholderTextAppearance(int i8) {
        this.r = i8;
        TextView textView = this.f3469p;
        if (textView != null) {
            textView.setTextAppearance(i8);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f3471q != colorStateList) {
            this.f3471q = colorStateList;
            TextView textView = this.f3469p;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f3477u = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f3478v.setText(charSequence);
        w();
    }

    public void setPrefixTextAppearance(int i8) {
        this.f3478v.setTextAppearance(i8);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f3478v.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z8) {
        this.Q.setCheckable(z8);
    }

    public void setStartIconContentDescription(int i8) {
        setStartIconContentDescription(i8 != 0 ? getResources().getText(i8) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.Q.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i8) {
        setStartIconDrawable(i8 != 0 ? g.a.a(getContext(), i8) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.Q;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            l(checkableImageButton, this.R);
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener((View.OnClickListener) null);
        setStartIconOnLongClickListener((View.OnLongClickListener) null);
        setStartIconContentDescription((CharSequence) null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.f3441a0;
        CheckableImageButton checkableImageButton = this.Q;
        checkableImageButton.setOnClickListener(onClickListener);
        m(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f3441a0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.Q;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.R != colorStateList) {
            this.R = colorStateList;
            this.S = true;
            d(this.Q, true, colorStateList, this.U, this.T);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.T != mode) {
            this.T = mode;
            this.U = true;
            d(this.Q, this.S, this.R, true, mode);
        }
    }

    public void setStartIconVisible(boolean z8) {
        CheckableImageButton checkableImageButton = this.Q;
        int i8 = 0;
        if ((checkableImageButton.getVisibility() == 0) != z8) {
            if (!z8) {
                i8 = 8;
            }
            checkableImageButton.setVisibility(i8);
            v();
            q();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.w = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f3481x.setText(charSequence);
        z();
    }

    public void setSuffixTextAppearance(int i8) {
        this.f3481x.setTextAppearance(i8);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f3481x.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.e;
        if (editText != null) {
            x.i(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        boolean z8;
        if (typeface != this.P) {
            this.P = typeface;
            u4.c cVar = this.D0;
            v4.a aVar = cVar.f7756v;
            boolean z9 = true;
            if (aVar != null) {
                aVar.f7931c = true;
            }
            if (cVar.f7753s != typeface) {
                cVar.f7753s = typeface;
                z8 = true;
            } else {
                z8 = false;
            }
            if (cVar.f7754t != typeface) {
                cVar.f7754t = typeface;
            } else {
                z9 = false;
            }
            if (z8 || z9) {
                cVar.h();
            }
            m mVar = this.f3451g;
            if (typeface != mVar.f2705u) {
                mVar.f2705u = typeface;
                TextView textView = mVar.f2697l;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                TextView textView2 = mVar.r;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            TextView textView3 = this.f3459k;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0088, code lost:
        if (r0 != null) goto L_0x008a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(boolean r11, boolean r12) {
        /*
            r10 = this;
            boolean r0 = r10.isEnabled()
            android.widget.EditText r1 = r10.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0016
            android.text.Editable r1 = r1.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0016
            r1 = r2
            goto L_0x0017
        L_0x0016:
            r1 = r3
        L_0x0017:
            android.widget.EditText r4 = r10.e
            if (r4 == 0) goto L_0x0023
            boolean r4 = r4.hasFocus()
            if (r4 == 0) goto L_0x0023
            r4 = r2
            goto L_0x0024
        L_0x0023:
            r4 = r3
        L_0x0024:
            c5.m r5 = r10.f3451g
            boolean r6 = r5.e()
            android.content.res.ColorStateList r7 = r10.f3473r0
            u4.c r8 = r10.D0
            if (r7 == 0) goto L_0x003e
            r8.i(r7)
            android.content.res.ColorStateList r7 = r10.f3473r0
            android.content.res.ColorStateList r9 = r8.f7746k
            if (r9 == r7) goto L_0x003e
            r8.f7746k = r7
            r8.h()
        L_0x003e:
            r7 = 0
            if (r0 != 0) goto L_0x006a
            android.content.res.ColorStateList r0 = r10.f3473r0
            if (r0 == 0) goto L_0x0053
            int[] r5 = new int[r2]
            r6 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            r5[r3] = r6
            int r6 = r10.B0
            int r0 = r0.getColorForState(r5, r6)
            goto L_0x0055
        L_0x0053:
            int r0 = r10.B0
        L_0x0055:
            android.content.res.ColorStateList r5 = android.content.res.ColorStateList.valueOf(r0)
            r8.i(r5)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            android.content.res.ColorStateList r5 = r8.f7746k
            if (r5 == r0) goto L_0x008d
            r8.f7746k = r0
            r8.h()
            goto L_0x008d
        L_0x006a:
            if (r6 == 0) goto L_0x0077
            android.widget.TextView r0 = r5.f2697l
            if (r0 == 0) goto L_0x0075
            android.content.res.ColorStateList r0 = r0.getTextColors()
            goto L_0x008a
        L_0x0075:
            r0 = r7
            goto L_0x008a
        L_0x0077:
            boolean r0 = r10.f3457j
            if (r0 == 0) goto L_0x0084
            android.widget.TextView r0 = r10.f3459k
            if (r0 == 0) goto L_0x0084
            android.content.res.ColorStateList r0 = r0.getTextColors()
            goto L_0x008a
        L_0x0084:
            if (r4 == 0) goto L_0x008d
            android.content.res.ColorStateList r0 = r10.s0
            if (r0 == 0) goto L_0x008d
        L_0x008a:
            r8.i(r0)
        L_0x008d:
            if (r1 != 0) goto L_0x00f9
            boolean r0 = r10.E0
            if (r0 == 0) goto L_0x00f9
            boolean r0 = r10.isEnabled()
            if (r0 == 0) goto L_0x009c
            if (r4 == 0) goto L_0x009c
            goto L_0x00f9
        L_0x009c:
            if (r12 != 0) goto L_0x00a2
            boolean r12 = r10.C0
            if (r12 != 0) goto L_0x013e
        L_0x00a2:
            android.animation.ValueAnimator r12 = r10.G0
            if (r12 == 0) goto L_0x00b1
            boolean r12 = r12.isRunning()
            if (r12 == 0) goto L_0x00b1
            android.animation.ValueAnimator r12 = r10.G0
            r12.cancel()
        L_0x00b1:
            r12 = 0
            if (r11 == 0) goto L_0x00bc
            boolean r11 = r10.F0
            if (r11 == 0) goto L_0x00bc
            r10.a(r12)
            goto L_0x00bf
        L_0x00bc:
            r8.j(r12)
        L_0x00bf:
            boolean r11 = r10.f()
            if (r11 == 0) goto L_0x00df
            y4.f r11 = r10.B
            c5.f r11 = (c5.f) r11
            android.graphics.RectF r11 = r11.y
            boolean r11 = r11.isEmpty()
            r11 = r11 ^ r2
            if (r11 == 0) goto L_0x00df
            boolean r11 = r10.f()
            if (r11 == 0) goto L_0x00df
            y4.f r11 = r10.B
            c5.f r11 = (c5.f) r11
            r11.n(r12, r12, r12, r12)
        L_0x00df:
            r10.C0 = r2
            android.widget.TextView r11 = r10.f3469p
            if (r11 == 0) goto L_0x00f2
            boolean r12 = r10.f3467o
            if (r12 == 0) goto L_0x00f2
            r11.setText(r7)
            android.widget.TextView r11 = r10.f3469p
            r12 = 4
            r11.setVisibility(r12)
        L_0x00f2:
            r10.w()
            r10.z()
            goto L_0x013e
        L_0x00f9:
            if (r12 != 0) goto L_0x00ff
            boolean r12 = r10.C0
            if (r12 == 0) goto L_0x013e
        L_0x00ff:
            android.animation.ValueAnimator r12 = r10.G0
            if (r12 == 0) goto L_0x010e
            boolean r12 = r12.isRunning()
            if (r12 == 0) goto L_0x010e
            android.animation.ValueAnimator r12 = r10.G0
            r12.cancel()
        L_0x010e:
            r12 = 1065353216(0x3f800000, float:1.0)
            if (r11 == 0) goto L_0x011a
            boolean r11 = r10.F0
            if (r11 == 0) goto L_0x011a
            r10.a(r12)
            goto L_0x011d
        L_0x011a:
            r8.j(r12)
        L_0x011d:
            r10.C0 = r3
            boolean r11 = r10.f()
            if (r11 == 0) goto L_0x0128
            r10.j()
        L_0x0128:
            android.widget.EditText r11 = r10.e
            if (r11 != 0) goto L_0x012d
            goto L_0x0135
        L_0x012d:
            android.text.Editable r11 = r11.getText()
            int r3 = r11.length()
        L_0x0135:
            r10.u(r3)
            r10.w()
            r10.z()
        L_0x013e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.t(boolean, boolean):void");
    }

    public final void u(int i8) {
        if (i8 != 0 || this.C0) {
            TextView textView = this.f3469p;
            if (textView != null && this.f3467o) {
                textView.setText((CharSequence) null);
                this.f3469p.setVisibility(4);
                return;
            }
            return;
        }
        TextView textView2 = this.f3469p;
        if (textView2 != null && this.f3467o) {
            textView2.setText(this.f3465n);
            this.f3469p.setVisibility(0);
            this.f3469p.bringToFront();
        }
    }

    public final void v() {
        if (this.e != null) {
            int i8 = 0;
            if (!(this.Q.getVisibility() == 0)) {
                EditText editText = this.e;
                int[] iArr = x.f4957a;
                i8 = x.d.f(editText);
            }
            TextView textView = this.f3478v;
            int compoundPaddingTop = this.e.getCompoundPaddingTop();
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
            int compoundPaddingBottom = this.e.getCompoundPaddingBottom();
            int[] iArr2 = x.f4957a;
            x.d.k(textView, i8, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
        }
    }

    public final void w() {
        this.f3478v.setVisibility((this.f3477u == null || this.C0) ? 8 : 0);
        q();
    }

    public final void x(boolean z8, boolean z9) {
        int defaultColor = this.f3480w0.getDefaultColor();
        int colorForState = this.f3480w0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f3480w0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z8) {
            this.K = colorForState2;
        } else if (z9) {
            this.K = colorForState;
        } else {
            this.K = defaultColor;
        }
    }

    public final void y() {
        if (this.e != null) {
            int i8 = 0;
            if (!h()) {
                if (!(this.f3470p0.getVisibility() == 0)) {
                    EditText editText = this.e;
                    int[] iArr = x.f4957a;
                    i8 = x.d.e(editText);
                }
            }
            TextView textView = this.f3481x;
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
            int paddingTop = this.e.getPaddingTop();
            int paddingBottom = this.e.getPaddingBottom();
            int[] iArr2 = x.f4957a;
            x.d.k(textView, dimensionPixelSize, paddingTop, i8, paddingBottom);
        }
    }

    public final void z() {
        TextView textView = this.f3481x;
        int visibility = textView.getVisibility();
        int i8 = 0;
        boolean z8 = this.w != null && !this.C0;
        if (!z8) {
            i8 = 8;
        }
        textView.setVisibility(i8);
        if (visibility != textView.getVisibility()) {
            getEndIconDelegate().c(z8);
        }
        q();
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f3470p0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f3451g.f2696k);
    }
}
