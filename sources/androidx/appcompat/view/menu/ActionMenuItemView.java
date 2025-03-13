package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.c;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.z;
import k.f;

public class ActionMenuItemView extends s implements h.a, View.OnClickListener, ActionMenuView.a {
    public e e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f328f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f329g;

    /* renamed from: h  reason: collision with root package name */
    public d.b f330h;

    /* renamed from: i  reason: collision with root package name */
    public a f331i;

    /* renamed from: j  reason: collision with root package name */
    public b f332j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f333k = e();

    /* renamed from: l  reason: collision with root package name */
    public boolean f334l;

    /* renamed from: m  reason: collision with root package name */
    public final int f335m;

    /* renamed from: n  reason: collision with root package name */
    public int f336n;

    /* renamed from: o  reason: collision with root package name */
    public final int f337o;

    public class a extends z {
        public a() {
            super(ActionMenuItemView.this);
        }

        public final f b() {
            c.a aVar;
            b bVar = ActionMenuItemView.this.f332j;
            if (bVar == null || (aVar = c.this.f661s) == null) {
                return null;
            }
            return aVar.a();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r3 = b();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean c() {
            /*
                r3 = this;
                androidx.appcompat.view.menu.ActionMenuItemView r0 = androidx.appcompat.view.menu.ActionMenuItemView.this
                androidx.appcompat.view.menu.d$b r1 = r0.f330h
                r2 = 0
                if (r1 == 0) goto L_0x001c
                androidx.appcompat.view.menu.e r0 = r0.e
                boolean r0 = r1.a(r0)
                if (r0 == 0) goto L_0x001c
                k.f r3 = r3.b()
                if (r3 == 0) goto L_0x001c
                boolean r3 = r3.i()
                if (r3 == 0) goto L_0x001c
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.a.c():boolean");
        }
    }

    public static abstract class b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.a.f38o, 0, 0);
        this.f335m = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f337o = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f336n = -1;
        setSaveEnabled(false);
    }

    public final boolean a() {
        return d();
    }

    public final void b(e eVar) {
        this.e = eVar;
        setIcon(eVar.getIcon());
        setTitle(eVar.getTitleCondensed());
        setId(eVar.f418a);
        setVisibility(eVar.isVisible() ? 0 : 8);
        setEnabled(eVar.isEnabled());
        if (eVar.hasSubMenu() && this.f331i == null) {
            this.f331i = new a();
        }
    }

    public final boolean c() {
        return d() && this.e.getIcon() == null;
    }

    public final boolean d() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i8 = configuration.screenWidthDp;
        return i8 >= 480 || (i8 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void f() {
        boolean z8 = true;
        boolean z9 = !TextUtils.isEmpty(this.f328f);
        if (this.f329g != null) {
            if (!((this.e.y & 4) == 4) || (!this.f333k && !this.f334l)) {
                z8 = false;
            }
        }
        boolean z10 = z9 & z8;
        CharSequence charSequence = null;
        setText(z10 ? this.f328f : null);
        CharSequence charSequence2 = this.e.f433q;
        if (TextUtils.isEmpty(charSequence2)) {
            charSequence2 = z10 ? null : this.e.e;
        }
        setContentDescription(charSequence2);
        CharSequence charSequence3 = this.e.r;
        if (TextUtils.isEmpty(charSequence3)) {
            if (!z10) {
                charSequence = this.e.e;
            }
            setTooltipText(charSequence);
            return;
        }
        setTooltipText(charSequence3);
    }

    public e getItemData() {
        return this.e;
    }

    public final void onClick(View view) {
        d.b bVar = this.f330h;
        if (bVar != null) {
            bVar.a(this.e);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f333k = e();
        f();
    }

    public final void onMeasure(int i8, int i9) {
        int i10;
        boolean d9 = d();
        if (d9 && (i10 = this.f336n) >= 0) {
            super.setPadding(i10, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i8, i9);
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        int measuredWidth = getMeasuredWidth();
        int i11 = this.f335m;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i11) : i11;
        if (mode != 1073741824 && i11 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i9);
        }
        if (!d9 && this.f329g != null) {
            super.setPadding((getMeasuredWidth() - this.f329g.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (!this.e.hasSubMenu() || (aVar = this.f331i) == null || !aVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z8) {
    }

    public void setChecked(boolean z8) {
    }

    public void setExpandedFormat(boolean z8) {
        if (this.f334l != z8) {
            this.f334l = z8;
            e eVar = this.e;
            if (eVar != null) {
                d dVar = eVar.f430n;
                dVar.f408k = true;
                dVar.o(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f329g = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i8 = this.f337o;
            if (intrinsicWidth > i8) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i8) / ((float) intrinsicWidth)));
                intrinsicWidth = i8;
            }
            if (intrinsicHeight > i8) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i8) / ((float) intrinsicHeight)));
            } else {
                i8 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i8);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        f();
    }

    public void setItemInvoker(d.b bVar) {
        this.f330h = bVar;
    }

    public final void setPadding(int i8, int i9, int i10, int i11) {
        this.f336n = i8;
        super.setPadding(i8, i9, i10, i11);
    }

    public void setPopupCallback(b bVar) {
        this.f332j = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f328f = charSequence;
        f();
    }
}
