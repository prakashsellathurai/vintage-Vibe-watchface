package androidx.appcompat.widget;

import android.view.View;
import android.widget.PopupWindow;

public final class n extends PopupWindow {
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        r4 = r3.getResourceId(0, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
        /*
            r1 = this;
            r1.<init>(r2, r3, r4, r5)
            int[] r0 = a1.a.B
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r3, r0, r4, r5)
            r4 = 2
            boolean r5 = r3.hasValue(r4)
            r0 = 0
            if (r5 == 0) goto L_0x0018
            boolean r4 = r3.getBoolean(r4, r0)
            n0.i.c(r1, r4)
        L_0x0018:
            boolean r4 = r3.hasValue(r0)
            if (r4 == 0) goto L_0x0029
            int r4 = r3.getResourceId(r0, r0)
            if (r4 == 0) goto L_0x0029
            android.graphics.drawable.Drawable r2 = g.a.a(r2, r4)
            goto L_0x002d
        L_0x0029:
            android.graphics.drawable.Drawable r2 = r3.getDrawable(r0)
        L_0x002d:
            r1.setBackgroundDrawable(r2)
            r3.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.n.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    public final void showAsDropDown(View view, int i8, int i9) {
        super.showAsDropDown(view, i8, i9);
    }

    public final void showAsDropDown(View view, int i8, int i9, int i10) {
        super.showAsDropDown(view, i8, i9, i10);
    }

    public final void update(View view, int i8, int i9, int i10, int i11) {
        super.update(view, i8, i9, i10, i11);
    }
}
