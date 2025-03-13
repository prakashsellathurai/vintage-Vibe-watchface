package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.health.services.client.R;
import c5.g;
import c5.k;
import com.google.android.material.textfield.TextInputLayout;
import java.util.LinkedHashSet;
import u4.j;
import y4.f;
import y4.i;

public final class b extends k {

    /* renamed from: d  reason: collision with root package name */
    public final TextWatcher f3507d = new a();
    public final View.OnFocusChangeListener e = new C0040b();

    /* renamed from: f  reason: collision with root package name */
    public final c f3508f;

    /* renamed from: g  reason: collision with root package name */
    public final d f3509g;
    @SuppressLint({"ClickableViewAccessibility"})

    /* renamed from: h  reason: collision with root package name */
    public final e f3510h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3511i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3512j;

    /* renamed from: k  reason: collision with root package name */
    public long f3513k;

    /* renamed from: l  reason: collision with root package name */
    public StateListDrawable f3514l;

    /* renamed from: m  reason: collision with root package name */
    public y4.f f3515m;

    /* renamed from: n  reason: collision with root package name */
    public AccessibilityManager f3516n;

    /* renamed from: o  reason: collision with root package name */
    public ValueAnimator f3517o;

    /* renamed from: p  reason: collision with root package name */
    public ValueAnimator f3518p;

    public class a extends j {

        /* renamed from: com.google.android.material.textfield.b$a$a  reason: collision with other inner class name */
        public class C0039a implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ AutoCompleteTextView f3520f;

            public C0039a(AutoCompleteTextView autoCompleteTextView) {
                this.f3520f = autoCompleteTextView;
            }

            public final void run() {
                boolean isPopupShowing = this.f3520f.isPopupShowing();
                a aVar = a.this;
                b.this.f(isPopupShowing);
                b.this.f3511i = isPopupShowing;
            }
        }

        public a() {
        }

        public final void afterTextChanged(Editable editable) {
            b bVar = b.this;
            EditText editText = bVar.f2680a.getEditText();
            if (editText instanceof AutoCompleteTextView) {
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
                if (bVar.f3516n.isTouchExplorationEnabled()) {
                    if ((autoCompleteTextView.getKeyListener() != null) && !bVar.f2682c.hasFocus()) {
                        autoCompleteTextView.dismissDropDown();
                    }
                }
                autoCompleteTextView.post(new C0039a(autoCompleteTextView));
                return;
            }
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
    }

    /* renamed from: com.google.android.material.textfield.b$b  reason: collision with other inner class name */
    public class C0040b implements View.OnFocusChangeListener {
        public C0040b() {
        }

        public final void onFocusChange(View view, boolean z8) {
            b bVar = b.this;
            bVar.f2680a.setEndIconActivated(z8);
            if (!z8) {
                bVar.f(false);
                bVar.f3511i = false;
            }
        }
    }

    public class c extends TextInputLayout.e {
        public c(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        public final void d(View view, k0.c cVar) {
            super.d(view, cVar);
            if (!(b.this.f2680a.getEditText().getKeyListener() != null)) {
                cVar.f(Spinner.class.getName());
            }
            AccessibilityNodeInfo accessibilityNodeInfo = cVar.f5085a;
            if (accessibilityNodeInfo.isShowingHintText()) {
                accessibilityNodeInfo.setHintText((CharSequence) null);
            }
        }

        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            super.e(view, accessibilityEvent);
            b bVar = b.this;
            EditText editText = bVar.f2680a.getEditText();
            if (editText instanceof AutoCompleteTextView) {
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
                boolean z8 = true;
                if (accessibilityEvent.getEventType() == 1 && bVar.f3516n.isTouchExplorationEnabled()) {
                    if (bVar.f2680a.getEditText().getKeyListener() == null) {
                        z8 = false;
                    }
                    if (!z8) {
                        b.d(bVar, autoCompleteTextView);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
    }

    public class d implements TextInputLayout.f {
        public d() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x00f2  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00f5  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(com.google.android.material.textfield.TextInputLayout r12) {
            /*
                r11 = this;
                android.widget.EditText r0 = r12.getEditText()
                boolean r1 = r0 instanceof android.widget.AutoCompleteTextView
                if (r1 == 0) goto L_0x0105
                android.widget.AutoCompleteTextView r0 = (android.widget.AutoCompleteTextView) r0
                com.google.android.material.textfield.b r11 = com.google.android.material.textfield.b.this
                com.google.android.material.textfield.TextInputLayout r1 = r11.f2680a
                int r1 = r1.getBoxBackgroundMode()
                r2 = 2
                r3 = 1
                if (r1 != r2) goto L_0x0019
                y4.f r1 = r11.f3515m
                goto L_0x001d
            L_0x0019:
                if (r1 != r3) goto L_0x0020
                android.graphics.drawable.StateListDrawable r1 = r11.f3514l
            L_0x001d:
                r0.setDropDownBackgroundDrawable(r1)
            L_0x0020:
                android.text.method.KeyListener r1 = r0.getKeyListener()
                r4 = 0
                if (r1 == 0) goto L_0x0029
                r1 = r3
                goto L_0x002a
            L_0x0029:
                r1 = r4
            L_0x002a:
                if (r1 == 0) goto L_0x002e
                goto L_0x00c5
            L_0x002e:
                com.google.android.material.textfield.TextInputLayout r1 = r11.f2680a
                int r5 = r1.getBoxBackgroundMode()
                y4.f r6 = r1.getBoxBackground()
                r7 = -2147221281(0xffffffff800400df, float:-3.67654E-40)
                int r7 = k3.j.x(r0, r7)
                int[][] r8 = new int[r2][]
                int[] r9 = new int[r3]
                r10 = 16842919(0x10100a7, float:2.3694026E-38)
                r9[r4] = r10
                r8[r4] = r9
                int[] r9 = new int[r4]
                r8[r3] = r9
                r9 = 1036831949(0x3dcccccd, float:0.1)
                if (r5 != r2) goto L_0x00a6
                r1 = -2147221264(0xffffffff800400f0, float:-3.67678E-40)
                int r1 = k3.j.x(r0, r1)
                y4.f r5 = new y4.f
                y4.f$b r10 = r6.f8412a
                y4.i r10 = r10.f8433a
                r5.<init>((y4.i) r10)
                int r7 = k3.j.L(r9, r7, r1)
                int[] r9 = new int[r2]
                r9[r4] = r7
                r9[r3] = r4
                android.content.res.ColorStateList r10 = new android.content.res.ColorStateList
                r10.<init>(r8, r9)
                r5.j(r10)
                r5.setTint(r1)
                int[] r9 = new int[r2]
                r9[r4] = r7
                r9[r3] = r1
                android.content.res.ColorStateList r1 = new android.content.res.ColorStateList
                r1.<init>(r8, r9)
                y4.f r7 = new y4.f
                y4.f$b r8 = r6.f8412a
                y4.i r8 = r8.f8433a
                r7.<init>((y4.i) r8)
                r8 = -1
                r7.setTint(r8)
                android.graphics.drawable.RippleDrawable r8 = new android.graphics.drawable.RippleDrawable
                r8.<init>(r1, r5, r7)
                android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r2]
                r1[r4] = r8
                r1[r3] = r6
                android.graphics.drawable.LayerDrawable r5 = new android.graphics.drawable.LayerDrawable
                r5.<init>(r1)
                int[] r1 = j0.x.f4957a
                j0.x.c.q(r0, r5)
                goto L_0x00c5
            L_0x00a6:
                if (r5 != r3) goto L_0x00c5
                int r1 = r1.getBoxBackgroundColor()
                int r5 = k3.j.L(r9, r7, r1)
                int[] r7 = new int[r2]
                r7[r4] = r5
                r7[r3] = r1
                android.content.res.ColorStateList r1 = new android.content.res.ColorStateList
                r1.<init>(r8, r7)
                android.graphics.drawable.RippleDrawable r5 = new android.graphics.drawable.RippleDrawable
                r5.<init>(r1, r6, r6)
                int[] r1 = j0.x.f4957a
                j0.x.c.q(r0, r5)
            L_0x00c5:
                c5.h r1 = new c5.h
                r1.<init>(r11, r0)
                r0.setOnTouchListener(r1)
                android.view.View$OnFocusChangeListener r1 = r11.e
                r0.setOnFocusChangeListener(r1)
                c5.i r1 = new c5.i
                r1.<init>(r11)
                r0.setOnDismissListener(r1)
                r0.setThreshold(r4)
                android.text.TextWatcher r1 = r11.f3507d
                r0.removeTextChangedListener(r1)
                r0.addTextChangedListener(r1)
                r12.setEndIconCheckable(r3)
                r1 = 0
                r12.setErrorIconDrawable((android.graphics.drawable.Drawable) r1)
                android.text.method.KeyListener r0 = r0.getKeyListener()
                if (r0 == 0) goto L_0x00f3
                r4 = r3
            L_0x00f3:
                if (r4 != 0) goto L_0x00fc
                int[] r0 = j0.x.f4957a
                com.google.android.material.internal.CheckableImageButton r0 = r11.f2682c
                j0.x.c.s(r0, r2)
            L_0x00fc:
                com.google.android.material.textfield.b$c r11 = r11.f3508f
                r12.setTextInputAccessibilityDelegate(r11)
                r12.setEndIconVisible(r3)
                return
            L_0x0105:
                java.lang.RuntimeException r11 = new java.lang.RuntimeException
                java.lang.String r12 = "EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used."
                r11.<init>(r12)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.b.d.a(com.google.android.material.textfield.TextInputLayout):void");
        }
    }

    public class e implements TextInputLayout.g {

        public class a implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ AutoCompleteTextView f3525f;

            public a(AutoCompleteTextView autoCompleteTextView) {
                this.f3525f = autoCompleteTextView;
            }

            public final void run() {
                this.f3525f.removeTextChangedListener(b.this.f3507d);
            }
        }

        public e() {
        }

        public final void a(TextInputLayout textInputLayout, int i8) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i8 == 3) {
                autoCompleteTextView.post(new a(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == b.this.e) {
                    autoCompleteTextView.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
                autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
                autoCompleteTextView.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
            }
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        public final void onClick(View view) {
            b bVar = b.this;
            b.d(bVar, (AutoCompleteTextView) bVar.f2680a.getEditText());
        }
    }

    public b(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f3508f = new c(textInputLayout);
        this.f3509g = new d();
        this.f3510h = new e();
        this.f3511i = false;
        this.f3512j = false;
        this.f3513k = Long.MAX_VALUE;
    }

    public static void d(b bVar, AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            bVar.getClass();
            return;
        }
        bVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() - bVar.f3513k;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            bVar.f3511i = false;
        }
        if (!bVar.f3511i) {
            bVar.f(!bVar.f3512j);
            if (bVar.f3512j) {
                autoCompleteTextView.requestFocus();
                autoCompleteTextView.showDropDown();
                return;
            }
            autoCompleteTextView.dismissDropDown();
            return;
        }
        bVar.f3511i = false;
    }

    public final void a() {
        Context context = this.f2681b;
        float dimensionPixelOffset = (float) context.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) context.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        y4.f e4 = e(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        y4.f e9 = e(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f3515m = e4;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f3514l = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, e4);
        this.f3514l.addState(new int[0], e9);
        Drawable a9 = g.a.a(context, R.drawable.mtrl_dropdown_arrow);
        TextInputLayout textInputLayout = this.f2680a;
        textInputLayout.setEndIconDrawable(a9);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        textInputLayout.setEndIconOnClickListener(new f());
        LinkedHashSet<TextInputLayout.f> linkedHashSet = textInputLayout.f3443b0;
        d dVar = this.f3509g;
        linkedHashSet.add(dVar);
        if (textInputLayout.e != null) {
            dVar.a(textInputLayout);
        }
        textInputLayout.f3450f0.add(this.f3510h);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        LinearInterpolator linearInterpolator = f4.a.f4391a;
        ofFloat.setInterpolator(linearInterpolator);
        ofFloat.setDuration((long) 67);
        ofFloat.addUpdateListener(new g(this));
        this.f3518p = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat2.setInterpolator(linearInterpolator);
        ofFloat2.setDuration((long) 50);
        ofFloat2.addUpdateListener(new g(this));
        this.f3517o = ofFloat2;
        ofFloat2.addListener(new c5.j(this));
        this.f3516n = (AccessibilityManager) context.getSystemService("accessibility");
    }

    public final boolean b(int i8) {
        return i8 != 0;
    }

    public final y4.f e(float f9, float f10, float f11, int i8) {
        i.a aVar = new i.a();
        aVar.e = new y4.a(f9);
        aVar.f8469f = new y4.a(f9);
        aVar.f8471h = new y4.a(f10);
        aVar.f8470g = new y4.a(f10);
        i iVar = new i(aVar);
        Paint paint = y4.f.w;
        String simpleName = y4.f.class.getSimpleName();
        Context context = this.f2681b;
        int b9 = v4.b.b(context, R.attr.colorSurface, simpleName);
        y4.f fVar = new y4.f();
        fVar.h(context);
        fVar.j(ColorStateList.valueOf(b9));
        fVar.i(f11);
        fVar.setShapeAppearanceModel(iVar);
        f.b bVar = fVar.f8412a;
        if (bVar.f8439h == null) {
            bVar.f8439h = new Rect();
        }
        fVar.f8412a.f8439h.set(0, i8, 0, i8);
        fVar.invalidateSelf();
        return fVar;
    }

    public final void f(boolean z8) {
        if (this.f3512j != z8) {
            this.f3512j = z8;
            this.f3518p.cancel();
            this.f3517o.start();
        }
    }
}
