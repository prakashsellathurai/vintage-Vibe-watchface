package w1;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.animation.LinearInterpolator;

public final class b extends Drawable {

    /* renamed from: f  reason: collision with root package name */
    public static final Property<b, Integer> f7976f = new a();

    /* renamed from: g  reason: collision with root package name */
    public static final TimeInterpolator f7977g = a.f7973a;

    /* renamed from: a  reason: collision with root package name */
    public final RectF f7978a = new RectF();

    /* renamed from: b  reason: collision with root package name */
    public final Paint f7979b;

    /* renamed from: c  reason: collision with root package name */
    public final ObjectAnimator f7980c;

    /* renamed from: d  reason: collision with root package name */
    public float f7981d;
    public int e;

    public class a extends Property<b, Integer> {
        public a() {
            super(Integer.class, "level");
        }

        public final Object get(Object obj) {
            return Integer.valueOf(((b) obj).getLevel());
        }

        public final void set(Object obj, Object obj2) {
            b bVar = (b) obj;
            bVar.setLevel(((Integer) obj2).intValue());
            bVar.invalidateSelf();
        }
    }

    public b() {
        Paint paint = new Paint();
        this.f7979b = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, f7976f, new int[]{0, 10000});
        this.f7980c = ofInt;
        ofInt.setRepeatCount(-1);
        ofInt.setRepeatMode(1);
        ofInt.setDuration(6000);
        ofInt.setInterpolator(new LinearInterpolator());
    }

    public final void draw(Canvas canvas) {
        canvas.save();
        RectF rectF = this.f7978a;
        rectF.set(getBounds());
        float f9 = this.f7981d / 2.0f;
        rectF.inset(f9, f9);
        Paint paint = this.f7979b;
        paint.setStrokeWidth(this.f7981d);
        paint.setColor(this.e);
        int level = getLevel();
        float f10 = ((float) (level - ((level / 2000) * 2000))) / 2000.0f;
        boolean z8 = f10 < 0.5f;
        float f11 = 54.0f * f10;
        TimeInterpolator timeInterpolator = f7977g;
        float max = Math.max(1.0f, (z8 ? ((a) timeInterpolator).getInterpolation((f10 - 0.0f) / 0.5f) : 1.0f - ((a) timeInterpolator).getInterpolation((f10 - 0.5f) / 0.5f)) * 306.0f);
        canvas.rotate(((((((float) level) * 1.0E-4f) * 2.0f) * 360.0f) - 0.049804688f) + f11, rectF.centerX(), rectF.centerY());
        canvas.drawArc(rectF, z8 ? 0.0f : 306.0f - max, max, false, paint);
        canvas.restore();
    }

    public final int getOpacity() {
        return -1;
    }

    public final boolean onLevelChange(int i8) {
        return true;
    }

    public final void setAlpha(int i8) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
