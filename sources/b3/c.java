package b3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import b3.e;
import java.util.ArrayList;
import k3.j;

public final class c extends Drawable implements e.b, Animatable {

    /* renamed from: a  reason: collision with root package name */
    public final a f2565a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2566b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2567c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2568d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public int f2569f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2570g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2571h;

    /* renamed from: i  reason: collision with root package name */
    public Paint f2572i;

    /* renamed from: j  reason: collision with root package name */
    public Rect f2573j;

    public static final class a extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final e f2574a;

        public a(e eVar) {
            this.f2574a = eVar;
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            return new c(this);
        }

        public final Drawable newDrawable(Resources resources) {
            return new c(this);
        }
    }

    public c() {
        throw null;
    }

    public c(a aVar) {
        this.e = true;
        this.f2570g = -1;
        j.l(aVar);
        this.f2565a = aVar;
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
        e eVar = this.f2565a.f2574a;
        e.a aVar = eVar.f2583i;
        if ((aVar != null ? aVar.e : -1) == eVar.f2576a.f() - 1) {
            this.f2569f++;
        }
        int i8 = this.f2570g;
        if (i8 != -1 && this.f2569f >= i8) {
            stop();
        }
    }

    public final void b() {
        j.j("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f2568d);
        a aVar = this.f2565a;
        if (aVar.f2574a.f2576a.f() != 1) {
            if (!this.f2566b) {
                this.f2566b = true;
                e eVar = aVar.f2574a;
                if (!eVar.f2584j) {
                    ArrayList arrayList = eVar.f2578c;
                    if (!arrayList.contains(this)) {
                        boolean isEmpty = arrayList.isEmpty();
                        arrayList.add(this);
                        if (isEmpty && !eVar.f2580f) {
                            eVar.f2580f = true;
                            eVar.f2584j = false;
                            eVar.a();
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
        if (!this.f2568d) {
            if (this.f2571h) {
                int intrinsicWidth = getIntrinsicWidth();
                int intrinsicHeight = getIntrinsicHeight();
                Rect bounds = getBounds();
                if (this.f2573j == null) {
                    this.f2573j = new Rect();
                }
                Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f2573j);
                this.f2571h = false;
            }
            e eVar = this.f2565a.f2574a;
            e.a aVar = eVar.f2583i;
            Bitmap bitmap = aVar != null ? aVar.f2594g : eVar.f2586l;
            if (this.f2573j == null) {
                this.f2573j = new Rect();
            }
            Rect rect = this.f2573j;
            if (this.f2572i == null) {
                this.f2572i = new Paint(2);
            }
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.f2572i);
        }
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f2565a;
    }

    public final int getIntrinsicHeight() {
        return this.f2565a.f2574a.f2591q;
    }

    public final int getIntrinsicWidth() {
        return this.f2565a.f2574a.f2590p;
    }

    public final int getOpacity() {
        return -2;
    }

    public final boolean isRunning() {
        return this.f2566b;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f2571h = true;
    }

    public final void setAlpha(int i8) {
        if (this.f2572i == null) {
            this.f2572i = new Paint(2);
        }
        this.f2572i.setAlpha(i8);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f2572i == null) {
            this.f2572i = new Paint(2);
        }
        this.f2572i.setColorFilter(colorFilter);
    }

    public final boolean setVisible(boolean z8, boolean z9) {
        j.j("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f2568d);
        this.e = z8;
        if (!z8) {
            this.f2566b = false;
            e eVar = this.f2565a.f2574a;
            ArrayList arrayList = eVar.f2578c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                eVar.f2580f = false;
            }
        } else if (this.f2567c) {
            b();
        }
        return super.setVisible(z8, z9);
    }

    public final void start() {
        this.f2567c = true;
        this.f2569f = 0;
        if (this.e) {
            b();
        }
    }

    public final void stop() {
        this.f2567c = false;
        this.f2566b = false;
        e eVar = this.f2565a.f2574a;
        ArrayList arrayList = eVar.f2578c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            eVar.f2580f = false;
        }
    }
}
