package o2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;
import o2.m;
import s2.c;

public final class j extends Drawable implements m.b, Animatable {

    /* renamed from: a  reason: collision with root package name */
    public final a f6041a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6042b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6043c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6044d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public int f6045f;

    /* renamed from: g  reason: collision with root package name */
    public final int f6046g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6047h;

    /* renamed from: i  reason: collision with root package name */
    public Paint f6048i;

    /* renamed from: j  reason: collision with root package name */
    public Rect f6049j;

    public static class a extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final m f6050a;

        public a(c cVar, m mVar) {
            this.f6050a = mVar;
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            return new j(this);
        }

        public final Drawable newDrawable(Resources resources) {
            return new j(this);
        }
    }

    public j() {
        throw null;
    }

    public j(a aVar) {
        this.f6046g = -1;
        this.e = true;
        this.f6046g = -1;
        k3.j.l(aVar);
        this.f6041a = aVar;
    }

    public final void a() {
        Drawable.Callback callback;
        Drawable drawable = this;
        while (true) {
            callback = drawable.getCallback();
            if (!(callback instanceof Drawable)) {
                break;
            }
            drawable = (Drawable) callback;
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        m mVar = this.f6041a.f6050a;
        m.a aVar = mVar.f6063i;
        if ((aVar != null ? aVar.e : -1) == mVar.f6056a.f() - 1) {
            this.f6045f++;
        }
        int i8 = this.f6046g;
        if (i8 != -1 && this.f6045f >= i8) {
            stop();
        }
    }

    public final void b() {
        k3.j.j("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f6044d);
        a aVar = this.f6041a;
        if (aVar.f6050a.f6056a.f() != 1) {
            if (!this.f6042b) {
                this.f6042b = true;
                m mVar = aVar.f6050a;
                if (!mVar.f6064j) {
                    ArrayList arrayList = mVar.f6058c;
                    if (!arrayList.contains(this)) {
                        boolean isEmpty = arrayList.isEmpty();
                        arrayList.add(this);
                        if (isEmpty && !mVar.f6060f) {
                            mVar.f6060f = true;
                            mVar.f6064j = false;
                            mVar.a();
                        }
                    } else {
                        throw new IllegalStateException("Cannot subscribe twice in a row");
                    }
                } else {
                    throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
                }
            } else {
                return;
            }
        }
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        if (!this.f6044d) {
            if (this.f6047h) {
                int intrinsicWidth = getIntrinsicWidth();
                int intrinsicHeight = getIntrinsicHeight();
                Rect bounds = getBounds();
                if (this.f6049j == null) {
                    this.f6049j = new Rect();
                }
                Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f6049j);
                this.f6047h = false;
            }
            m mVar = this.f6041a.f6050a;
            m.a aVar = mVar.f6063i;
            Bitmap bitmap = aVar != null ? aVar.f6074g : mVar.f6066l;
            if (this.f6049j == null) {
                this.f6049j = new Rect();
            }
            Rect rect = this.f6049j;
            if (this.f6048i == null) {
                this.f6048i = new Paint(2);
            }
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.f6048i);
        }
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f6041a;
    }

    public final int getIntrinsicHeight() {
        return this.f6041a.f6050a.f6071q;
    }

    public final int getIntrinsicWidth() {
        return this.f6041a.f6050a.f6070p;
    }

    @Deprecated
    public final int getOpacity() {
        return -2;
    }

    public final boolean isRunning() {
        return this.f6042b;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f6047h = true;
    }

    public final void setAlpha(int i8) {
        if (this.f6048i == null) {
            this.f6048i = new Paint(2);
        }
        this.f6048i.setAlpha(i8);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f6048i == null) {
            this.f6048i = new Paint(2);
        }
        this.f6048i.setColorFilter(colorFilter);
    }

    public final boolean setVisible(boolean z8, boolean z9) {
        k3.j.j("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f6044d);
        this.e = z8;
        if (!z8) {
            this.f6042b = false;
            m mVar = this.f6041a.f6050a;
            ArrayList arrayList = mVar.f6058c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                mVar.f6060f = false;
            }
        } else if (this.f6043c) {
            b();
        }
        return super.setVisible(z8, z9);
    }

    public final void start() {
        this.f6043c = true;
        this.f6045f = 0;
        if (this.e) {
            b();
        }
    }

    public final void stop() {
        this.f6043c = false;
        this.f6042b = false;
        m mVar = this.f6041a.f6050a;
        ArrayList arrayList = mVar.f6058c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            mVar.f6060f = false;
        }
    }
}
