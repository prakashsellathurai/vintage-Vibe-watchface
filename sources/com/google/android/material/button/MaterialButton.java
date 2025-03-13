package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.f;
import androidx.health.services.client.R;
import j0.x;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k3.j;
import u4.k;
import u4.n;
import y4.i;
import y4.m;

public class MaterialButton extends f implements Checkable, m {

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f3124p = {16842911};

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f3125q = {16842912};

    /* renamed from: c  reason: collision with root package name */
    public final l4.a f3126c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashSet<a> f3127d = new LinkedHashSet<>();
    public b e;

    /* renamed from: f  reason: collision with root package name */
    public PorterDuff.Mode f3128f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f3129g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f3130h;

    /* renamed from: i  reason: collision with root package name */
    public int f3131i;

    /* renamed from: j  reason: collision with root package name */
    public int f3132j;

    /* renamed from: k  reason: collision with root package name */
    public int f3133k;

    /* renamed from: l  reason: collision with root package name */
    public int f3134l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3135m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f3136n;

    /* renamed from: o  reason: collision with root package name */
    public int f3137o;

    public interface a {
        void a(MaterialButton materialButton, boolean z8);
    }

    public interface b {
    }

    public static class c extends p0.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        public boolean f3138h;

        public static class a implements Parcelable.ClassLoaderCreator<c> {
            public final Object createFromParcel(Parcel parcel) {
                return new c(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i8) {
                return new c[i8];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                c.class.getClassLoader();
            }
            this.f3138h = parcel.readInt() != 1 ? false : true;
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeParcelable(this.f6241f, i8);
            parcel.writeInt(this.f3138h ? 1 : 0);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(d5.a.a(context, attributeSet, R.attr.materialButtonStyle, -2146303345), attributeSet, R.attr.materialButtonStyle);
        boolean z8 = false;
        this.f3135m = false;
        this.f3136n = false;
        Context context2 = getContext();
        TypedArray d9 = k.d(context2, attributeSet, a1.a.U, R.attr.materialButtonStyle, -2146303345, new int[0]);
        this.f3134l = d9.getDimensionPixelSize(12, 0);
        this.f3128f = n.b(d9.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.f3129g = v4.c.a(getContext(), d9, 14);
        this.f3130h = v4.c.c(getContext(), d9, 10);
        this.f3137o = d9.getInteger(11, 1);
        this.f3131i = d9.getDimensionPixelSize(13, 0);
        l4.a aVar = new l4.a(this, new i(i.b(context2, attributeSet, R.attr.materialButtonStyle, -2146303345)));
        this.f3126c = aVar;
        aVar.f5294c = d9.getDimensionPixelOffset(1, 0);
        aVar.f5295d = d9.getDimensionPixelOffset(2, 0);
        aVar.e = d9.getDimensionPixelOffset(3, 0);
        aVar.f5296f = d9.getDimensionPixelOffset(4, 0);
        if (d9.hasValue(8)) {
            int dimensionPixelSize = d9.getDimensionPixelSize(8, -1);
            aVar.f5297g = dimensionPixelSize;
            aVar.c(aVar.f5293b.e((float) dimensionPixelSize));
            aVar.f5306p = true;
        }
        aVar.f5298h = d9.getDimensionPixelSize(20, 0);
        aVar.f5299i = n.b(d9.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        aVar.f5300j = v4.c.a(getContext(), d9, 6);
        aVar.f5301k = v4.c.a(getContext(), d9, 19);
        aVar.f5302l = v4.c.a(getContext(), d9, 16);
        aVar.f5307q = d9.getBoolean(5, false);
        aVar.f5308s = d9.getDimensionPixelSize(9, 0);
        int[] iArr = x.f4957a;
        int f9 = x.d.f(this);
        int paddingTop = getPaddingTop();
        int e4 = x.d.e(this);
        int paddingBottom = getPaddingBottom();
        if (d9.hasValue(0)) {
            aVar.f5305o = true;
            setSupportBackgroundTintList(aVar.f5300j);
            setSupportBackgroundTintMode(aVar.f5299i);
        } else {
            aVar.e();
        }
        x.d.k(this, f9 + aVar.f5294c, paddingTop + aVar.e, e4 + aVar.f5295d, paddingBottom + aVar.f5296f);
        d9.recycle();
        setCompoundDrawablePadding(this.f3134l);
        c(this.f3130h != null ? true : z8);
    }

    private String getA11yClassName() {
        l4.a aVar = this.f3126c;
        return (aVar != null && aVar.f5307q ? CompoundButton.class : Button.class).getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    public final boolean a() {
        l4.a aVar = this.f3126c;
        return aVar != null && !aVar.f5305o;
    }

    public final void b() {
        int i8 = this.f3137o;
        boolean z8 = false;
        if (i8 == 1 || i8 == 2) {
            n0.k.e(this, this.f3130h, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        if (i8 == 3 || i8 == 4) {
            n0.k.e(this, (Drawable) null, (Drawable) null, this.f3130h, (Drawable) null);
            return;
        }
        if (i8 == 16 || i8 == 32) {
            z8 = true;
        }
        if (z8) {
            n0.k.e(this, (Drawable) null, this.f3130h, (Drawable) null, (Drawable) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007c, code lost:
        if (r3 != r6.f3130h) goto L_0x007e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(boolean r7) {
        /*
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.f3130h
            if (r0 == 0) goto L_0x0039
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r6.f3130h = r0
            android.content.res.ColorStateList r1 = r6.f3129g
            d0.b.h(r0, r1)
            android.graphics.PorterDuff$Mode r0 = r6.f3128f
            if (r0 == 0) goto L_0x0018
            android.graphics.drawable.Drawable r1 = r6.f3130h
            d0.b.i(r1, r0)
        L_0x0018:
            int r0 = r6.f3131i
            if (r0 == 0) goto L_0x001d
            goto L_0x0023
        L_0x001d:
            android.graphics.drawable.Drawable r0 = r6.f3130h
            int r0 = r0.getIntrinsicWidth()
        L_0x0023:
            int r1 = r6.f3131i
            if (r1 == 0) goto L_0x0028
            goto L_0x002e
        L_0x0028:
            android.graphics.drawable.Drawable r1 = r6.f3130h
            int r1 = r1.getIntrinsicHeight()
        L_0x002e:
            android.graphics.drawable.Drawable r2 = r6.f3130h
            int r3 = r6.f3132j
            int r4 = r6.f3133k
            int r0 = r0 + r3
            int r1 = r1 + r4
            r2.setBounds(r3, r4, r0, r1)
        L_0x0039:
            if (r7 == 0) goto L_0x003f
            r6.b()
            return
        L_0x003f:
            android.graphics.drawable.Drawable[] r7 = n0.k.a(r6)
            r0 = 0
            r1 = r7[r0]
            r2 = 1
            r3 = r7[r2]
            r4 = 2
            r7 = r7[r4]
            int r5 = r6.f3137o
            if (r5 == r2) goto L_0x0055
            if (r5 != r4) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r4 = r0
            goto L_0x0056
        L_0x0055:
            r4 = r2
        L_0x0056:
            if (r4 == 0) goto L_0x005c
            android.graphics.drawable.Drawable r4 = r6.f3130h
            if (r1 != r4) goto L_0x007e
        L_0x005c:
            r1 = 3
            if (r5 == r1) goto L_0x0065
            r1 = 4
            if (r5 != r1) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r1 = r0
            goto L_0x0066
        L_0x0065:
            r1 = r2
        L_0x0066:
            if (r1 == 0) goto L_0x006c
            android.graphics.drawable.Drawable r1 = r6.f3130h
            if (r7 != r1) goto L_0x007e
        L_0x006c:
            r7 = 16
            if (r5 == r7) goto L_0x0077
            r7 = 32
            if (r5 != r7) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            r7 = r0
            goto L_0x0078
        L_0x0077:
            r7 = r2
        L_0x0078:
            if (r7 == 0) goto L_0x007f
            android.graphics.drawable.Drawable r7 = r6.f3130h
            if (r3 == r7) goto L_0x007f
        L_0x007e:
            r0 = r2
        L_0x007f:
            if (r0 == 0) goto L_0x0084
            r6.b()
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.c(boolean):void");
    }

    public final void d(int i8, int i9) {
        if (this.f3130h != null && getLayout() != null) {
            int i10 = this.f3137o;
            boolean z8 = true;
            if (!(i10 == 1 || i10 == 2)) {
                if (!(i10 == 3 || i10 == 4)) {
                    if (!(i10 == 16 || i10 == 32)) {
                        z8 = false;
                    }
                    if (z8) {
                        this.f3132j = 0;
                        if (i10 == 16) {
                            this.f3133k = 0;
                            c(false);
                            return;
                        }
                        int i11 = this.f3131i;
                        if (i11 == 0) {
                            i11 = this.f3130h.getIntrinsicHeight();
                        }
                        int textHeight = (((((i9 - getTextHeight()) - getPaddingTop()) - i11) - this.f3134l) - getPaddingBottom()) / 2;
                        if (this.f3133k != textHeight) {
                            this.f3133k = textHeight;
                            c(false);
                        }
                        return;
                    }
                    return;
                }
            }
            this.f3133k = 0;
            if (i10 == 1 || i10 == 3) {
                this.f3132j = 0;
                c(false);
                return;
            }
            int i12 = this.f3131i;
            if (i12 == 0) {
                i12 = this.f3130h.getIntrinsicWidth();
            }
            int textWidth = i8 - getTextWidth();
            int[] iArr = x.f4957a;
            int e4 = ((((textWidth - x.d.e(this)) - i12) - this.f3134l) - x.d.f(this)) / 2;
            boolean z9 = x.d.d(this) == 1;
            if (this.f3137o != 4) {
                z8 = false;
            }
            if (z9 != z8) {
                e4 = -e4;
            }
            if (this.f3132j != e4) {
                this.f3132j = e4;
                c(false);
            }
        }
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.f3126c.f5297g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f3130h;
    }

    public int getIconGravity() {
        return this.f3137o;
    }

    public int getIconPadding() {
        return this.f3134l;
    }

    public int getIconSize() {
        return this.f3131i;
    }

    public ColorStateList getIconTint() {
        return this.f3129g;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f3128f;
    }

    public int getInsetBottom() {
        return this.f3126c.f5296f;
    }

    public int getInsetTop() {
        return this.f3126c.e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.f3126c.f5302l;
        }
        return null;
    }

    public i getShapeAppearanceModel() {
        if (a()) {
            return this.f3126c.f5293b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.f3126c.f5301k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.f3126c.f5298h;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        return a() ? this.f3126c.f5300j : super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return a() ? this.f3126c.f5299i : super.getSupportBackgroundTintMode();
    }

    public final boolean isChecked() {
        return this.f3135m;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            j.b0(this, this.f3126c.b(false));
        }
    }

    public final int[] onCreateDrawableState(int i8) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i8 + 2);
        l4.a aVar = this.f3126c;
        if (aVar != null && aVar.f5307q) {
            View.mergeDrawableStates(onCreateDrawableState, f3124p);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f3125q);
        }
        return onCreateDrawableState;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        l4.a aVar = this.f3126c;
        accessibilityNodeInfo.setCheckable(aVar != null && aVar.f5307q);
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public final void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        super.onLayout(z8, i8, i9, i10, i11);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f6241f);
        setChecked(cVar.f3138h);
    }

    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f3138h = this.f3135m;
        return cVar;
    }

    public final void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        d(i8, i9);
    }

    public final void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        super.onTextChanged(charSequence, i8, i9, i10);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public final boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i8) {
        if (a()) {
            l4.a aVar = this.f3126c;
            if (aVar.b(false) != null) {
                aVar.b(false).setTint(i8);
                return;
            }
            return;
        }
        super.setBackgroundColor(i8);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (a()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                l4.a aVar = this.f3126c;
                aVar.f5305o = true;
                ColorStateList colorStateList = aVar.f5300j;
                MaterialButton materialButton = aVar.f5292a;
                materialButton.setSupportBackgroundTintList(colorStateList);
                materialButton.setSupportBackgroundTintMode(aVar.f5299i);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundResource(int i8) {
        setBackgroundDrawable(i8 != 0 ? g.a.a(getContext(), i8) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z8) {
        if (a()) {
            this.f3126c.f5307q = z8;
        }
    }

    public void setChecked(boolean z8) {
        l4.a aVar = this.f3126c;
        if ((aVar != null && aVar.f5307q) && isEnabled() && this.f3135m != z8) {
            this.f3135m = z8;
            refreshDrawableState();
            if (!this.f3136n) {
                this.f3136n = true;
                Iterator<a> it = this.f3127d.iterator();
                while (it.hasNext()) {
                    it.next().a(this, this.f3135m);
                }
                this.f3136n = false;
            }
        }
    }

    public void setCornerRadius(int i8) {
        if (a()) {
            l4.a aVar = this.f3126c;
            if (!aVar.f5306p || aVar.f5297g != i8) {
                aVar.f5297g = i8;
                aVar.f5306p = true;
                aVar.c(aVar.f5293b.e((float) i8));
            }
        }
    }

    public void setCornerRadiusResource(int i8) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i8));
        }
    }

    public void setElevation(float f9) {
        super.setElevation(f9);
        if (a()) {
            this.f3126c.b(false).i(f9);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f3130h != drawable) {
            this.f3130h = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i8) {
        if (this.f3137o != i8) {
            this.f3137o = i8;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i8) {
        if (this.f3134l != i8) {
            this.f3134l = i8;
            setCompoundDrawablePadding(i8);
        }
    }

    public void setIconResource(int i8) {
        setIcon(i8 != 0 ? g.a.a(getContext(), i8) : null);
    }

    public void setIconSize(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f3131i != i8) {
            this.f3131i = i8;
            c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f3129g != colorStateList) {
            this.f3129g = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f3128f != mode) {
            this.f3128f = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i8) {
        Context context = getContext();
        Object obj = g.a.f4440a;
        setIconTint(context.getColorStateList(i8));
    }

    public void setInsetBottom(int i8) {
        l4.a aVar = this.f3126c;
        aVar.d(aVar.e, i8);
    }

    public void setInsetTop(int i8) {
        l4.a aVar = this.f3126c;
        aVar.d(i8, aVar.f5296f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.e = bVar;
    }

    public void setPressed(boolean z8) {
        b bVar = this.e;
        if (bVar != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z8);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            l4.a aVar = this.f3126c;
            if (aVar.f5302l != colorStateList) {
                aVar.f5302l = colorStateList;
                MaterialButton materialButton = aVar.f5292a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    RippleDrawable rippleDrawable = (RippleDrawable) materialButton.getBackground();
                    if (colorStateList == null) {
                        colorStateList = ColorStateList.valueOf(0);
                    }
                    rippleDrawable.setColor(colorStateList);
                }
            }
        }
    }

    public void setRippleColorResource(int i8) {
        if (a()) {
            Context context = getContext();
            Object obj = g.a.f4440a;
            setRippleColor(context.getColorStateList(i8));
        }
    }

    public void setShapeAppearanceModel(i iVar) {
        if (a()) {
            this.f3126c.c(iVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z8) {
        if (a()) {
            l4.a aVar = this.f3126c;
            aVar.f5304n = z8;
            aVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            l4.a aVar = this.f3126c;
            if (aVar.f5301k != colorStateList) {
                aVar.f5301k = colorStateList;
                aVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i8) {
        if (a()) {
            Context context = getContext();
            Object obj = g.a.f4440a;
            setStrokeColor(context.getColorStateList(i8));
        }
    }

    public void setStrokeWidth(int i8) {
        if (a()) {
            l4.a aVar = this.f3126c;
            if (aVar.f5298h != i8) {
                aVar.f5298h = i8;
                aVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i8) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i8));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (a()) {
            l4.a aVar = this.f3126c;
            if (aVar.f5300j != colorStateList) {
                aVar.f5300j = colorStateList;
                if (aVar.b(false) != null) {
                    d0.b.h(aVar.b(false), aVar.f5300j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (a()) {
            l4.a aVar = this.f3126c;
            if (aVar.f5299i != mode) {
                aVar.f5299i = mode;
                if (aVar.b(false) != null && aVar.f5299i != null) {
                    d0.b.i(aVar.b(false), aVar.f5299i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    public final void toggle() {
        setChecked(!this.f3135m);
    }
}
