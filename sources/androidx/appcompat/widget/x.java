package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.health.services.client.R;
import java.lang.reflect.Field;
import n0.f;

public class x extends ListView {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f834a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    public int f835b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f836c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f837d = 0;
    public int e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f838f;

    /* renamed from: g  reason: collision with root package name */
    public final Field f839g;

    /* renamed from: h  reason: collision with root package name */
    public a f840h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f841i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f842j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f843k;

    /* renamed from: l  reason: collision with root package name */
    public f f844l;

    /* renamed from: m  reason: collision with root package name */
    public b f845m;

    public static class a extends h.a {

        /* renamed from: b  reason: collision with root package name */
        public boolean f846b = true;

        public a(Drawable drawable) {
            super(drawable);
        }

        public final void draw(Canvas canvas) {
            if (this.f846b) {
                super.draw(canvas);
            }
        }

        public final void setHotspot(float f9, float f10) {
            if (this.f846b) {
                super.setHotspot(f9, f10);
            }
        }

        public final void setHotspotBounds(int i8, int i9, int i10, int i11) {
            if (this.f846b) {
                super.setHotspotBounds(i8, i9, i10, i11);
            }
        }

        public final boolean setState(int[] iArr) {
            if (this.f846b) {
                return super.setState(iArr);
            }
            return false;
        }

        public final boolean setVisible(boolean z8, boolean z9) {
            if (this.f846b) {
                return super.setVisible(z8, z9);
            }
            return false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            x xVar = x.this;
            xVar.f845m = null;
            xVar.drawableStateChanged();
        }
    }

    public x(Context context, boolean z8) {
        super(context, (AttributeSet) null, R.attr.dropDownListViewStyle);
        this.f842j = z8;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f839g = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e4) {
            e4.printStackTrace();
        }
    }

    private void setSelectorEnabled(boolean z8) {
        a aVar = this.f840h;
        if (aVar != null) {
            aVar.f846b = z8;
        }
    }

    public final int a(int i8, int i9) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i10 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i10;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i11 = 0;
        View view = null;
        for (int i12 = 0; i12 < count; i12++) {
            int itemViewType = adapter.getItemViewType(i12);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            view = adapter.getView(i12, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i13 = layoutParams.height;
            view.measure(i8, i13 > 0 ? View.MeasureSpec.makeMeasureSpec(i13, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i12 > 0) {
                i10 += dividerHeight;
            }
            i10 += view.getMeasuredHeight();
            if (i10 >= i9) {
                return i9;
            }
        }
        return i10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0159  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(android.view.MotionEvent r17, int r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            int r3 = r17.getActionMasked()
            r4 = 1
            r5 = 0
            if (r3 == r4) goto L_0x0017
            r0 = 2
            if (r3 == r0) goto L_0x0015
            r0 = 3
            if (r3 == r0) goto L_0x001e
            r0 = r4
            goto L_0x0124
        L_0x0015:
            r0 = r4
            goto L_0x0018
        L_0x0017:
            r0 = r5
        L_0x0018:
            int r6 = r17.findPointerIndex(r18)
            if (r6 >= 0) goto L_0x0021
        L_0x001e:
            r0 = r5
            goto L_0x0124
        L_0x0021:
            float r7 = r2.getX(r6)
            int r7 = (int) r7
            float r6 = r2.getY(r6)
            int r6 = (int) r6
            int r8 = r1.pointToPosition(r7, r6)
            r9 = -1
            if (r8 != r9) goto L_0x0035
            r5 = r4
            goto L_0x0124
        L_0x0035:
            int r0 = r16.getFirstVisiblePosition()
            int r0 = r8 - r0
            android.view.View r10 = r1.getChildAt(r0)
            float r7 = (float) r7
            float r6 = (float) r6
            r1.f843k = r4
            r1.drawableHotspotChanged(r7, r6)
            boolean r0 = r16.isPressed()
            if (r0 != 0) goto L_0x004f
            r1.setPressed(r4)
        L_0x004f:
            r16.layoutChildren()
            int r0 = r1.f838f
            if (r0 == r9) goto L_0x006c
            int r11 = r16.getFirstVisiblePosition()
            int r0 = r0 - r11
            android.view.View r0 = r1.getChildAt(r0)
            if (r0 == 0) goto L_0x006c
            if (r0 == r10) goto L_0x006c
            boolean r11 = r0.isPressed()
            if (r11 == 0) goto L_0x006c
            r0.setPressed(r5)
        L_0x006c:
            r1.f838f = r8
            int r0 = r10.getLeft()
            float r0 = (float) r0
            float r0 = r7 - r0
            int r11 = r10.getTop()
            float r11 = (float) r11
            float r11 = r6 - r11
            r10.drawableHotspotChanged(r0, r11)
            boolean r0 = r10.isPressed()
            if (r0 != 0) goto L_0x0088
            r10.setPressed(r4)
        L_0x0088:
            android.graphics.drawable.Drawable r11 = r16.getSelector()
            if (r11 == 0) goto L_0x0092
            if (r8 == r9) goto L_0x0092
            r12 = r4
            goto L_0x0093
        L_0x0092:
            r12 = r5
        L_0x0093:
            if (r12 == 0) goto L_0x0098
            r11.setVisible(r5, r5)
        L_0x0098:
            java.lang.reflect.Field r0 = r1.f839g
            int r13 = r10.getLeft()
            int r14 = r10.getTop()
            int r15 = r10.getRight()
            int r4 = r10.getBottom()
            android.graphics.Rect r5 = r1.f834a
            r5.set(r13, r14, r15, r4)
            int r4 = r5.left
            int r13 = r1.f835b
            int r4 = r4 - r13
            r5.left = r4
            int r4 = r5.top
            int r13 = r1.f836c
            int r4 = r4 - r13
            r5.top = r4
            int r4 = r5.right
            int r13 = r1.f837d
            int r4 = r4 + r13
            r5.right = r4
            int r4 = r5.bottom
            int r13 = r1.e
            int r4 = r4 + r13
            r5.bottom = r4
            boolean r4 = r0.getBoolean(r1)     // Catch:{ IllegalAccessException -> 0x00e7 }
            boolean r13 = r10.isEnabled()     // Catch:{ IllegalAccessException -> 0x00e7 }
            if (r13 == r4) goto L_0x00eb
            if (r4 != 0) goto L_0x00d9
            r4 = 1
            goto L_0x00da
        L_0x00d9:
            r4 = 0
        L_0x00da:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ IllegalAccessException -> 0x00e7 }
            r0.set(r1, r4)     // Catch:{ IllegalAccessException -> 0x00e7 }
            if (r8 == r9) goto L_0x00eb
            r16.refreshDrawableState()     // Catch:{ IllegalAccessException -> 0x00e7 }
            goto L_0x00eb
        L_0x00e7:
            r0 = move-exception
            r0.printStackTrace()
        L_0x00eb:
            if (r12 == 0) goto L_0x0106
            float r0 = r5.exactCenterX()
            float r4 = r5.exactCenterY()
            int r5 = r16.getVisibility()
            if (r5 != 0) goto L_0x00fd
            r5 = 1
            goto L_0x00fe
        L_0x00fd:
            r5 = 0
        L_0x00fe:
            r12 = 0
            r11.setVisible(r5, r12)
            d0.b.e(r11, r0, r4)
            goto L_0x0107
        L_0x0106:
            r12 = 0
        L_0x0107:
            android.graphics.drawable.Drawable r0 = r16.getSelector()
            if (r0 == 0) goto L_0x0112
            if (r8 == r9) goto L_0x0112
            d0.b.e(r0, r7, r6)
        L_0x0112:
            r1.setSelectorEnabled(r12)
            r16.refreshDrawableState()
            r4 = 1
            if (r3 != r4) goto L_0x0122
            long r3 = r1.getItemIdAtPosition(r8)
            r1.performItemClick(r10, r8, r3)
        L_0x0122:
            r0 = 1
            r5 = 0
        L_0x0124:
            if (r0 == 0) goto L_0x0128
            if (r5 == 0) goto L_0x0141
        L_0x0128:
            r3 = 0
            r1.f843k = r3
            r1.setPressed(r3)
            r16.drawableStateChanged()
            int r4 = r1.f838f
            int r5 = r16.getFirstVisiblePosition()
            int r4 = r4 - r5
            android.view.View r4 = r1.getChildAt(r4)
            if (r4 == 0) goto L_0x0141
            r4.setPressed(r3)
        L_0x0141:
            if (r0 == 0) goto L_0x0159
            n0.f r3 = r1.f844l
            if (r3 != 0) goto L_0x014e
            n0.f r3 = new n0.f
            r3.<init>(r1)
            r1.f844l = r3
        L_0x014e:
            n0.f r3 = r1.f844l
            boolean r4 = r3.f5484p
            r4 = 1
            r3.f5484p = r4
            r3.onTouch(r1, r2)
            goto L_0x0167
        L_0x0159:
            n0.f r1 = r1.f844l
            if (r1 == 0) goto L_0x0167
            boolean r2 = r1.f5484p
            if (r2 == 0) goto L_0x0164
            r1.d()
        L_0x0164:
            r2 = 0
            r1.f5484p = r2
        L_0x0167:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.x.b(android.view.MotionEvent, int):boolean");
    }

    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f834a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public final void drawableStateChanged() {
        if (this.f845m == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            Drawable selector = getSelector();
            if (selector != null && this.f843k && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
    }

    public final boolean hasFocus() {
        return this.f842j || super.hasFocus();
    }

    public final boolean hasWindowFocus() {
        return this.f842j || super.hasWindowFocus();
    }

    public final boolean isFocused() {
        return this.f842j || super.isFocused();
    }

    public final boolean isInTouchMode() {
        return (this.f842j && this.f841i) || super.isInTouchMode();
    }

    public final void onDetachedFromWindow() {
        this.f845m = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f845m == null) {
            b bVar = new b();
            this.f845m = bVar;
            post(bVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                Drawable selector = getSelector();
                if (selector != null && this.f843k && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f838f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.f845m;
        if (bVar != null) {
            x xVar = x.this;
            xVar.f845m = null;
            xVar.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z8) {
        this.f841i = z8;
    }

    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.f840h = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f835b = rect.left;
        this.f836c = rect.top;
        this.f837d = rect.right;
        this.e = rect.bottom;
    }
}
