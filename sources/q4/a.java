package q4;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

public final class a implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final Dialog f6603a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6604b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6605c;

    public a(Dialog dialog, Rect rect) {
        this.f6603a = dialog;
        this.f6604b = rect.left;
        this.f6605c = rect.top;
        ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f6604b + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.f6605c + findViewById.getTop();
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        view.performClick();
        return this.f6603a.onTouchEvent(obtain);
    }
}
