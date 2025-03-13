package androidx.appcompat.view.menu;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.d;

public final class ExpandedMenuView extends ListView implements d.b, h, AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f339a = {16842964, 16843049};

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001c, code lost:
        r0 = r5.getResourceId(0, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExpandedMenuView(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r3.<init>(r4, r5)
            r3.setOnItemClickListener(r3)
            int[] r0 = f339a
            r1 = 16842868(0x1010074, float:2.3693883E-38)
            r2 = 0
            android.content.res.TypedArray r5 = r4.obtainStyledAttributes(r5, r0, r1, r2)
            boolean r0 = r5.hasValue(r2)
            if (r0 == 0) goto L_0x002e
            boolean r0 = r5.hasValue(r2)
            if (r0 == 0) goto L_0x0027
            int r0 = r5.getResourceId(r2, r2)
            if (r0 == 0) goto L_0x0027
            android.graphics.drawable.Drawable r0 = g.a.a(r4, r0)
            goto L_0x002b
        L_0x0027:
            android.graphics.drawable.Drawable r0 = r5.getDrawable(r2)
        L_0x002b:
            r3.setBackgroundDrawable(r0)
        L_0x002e:
            r0 = 1
            boolean r1 = r5.hasValue(r0)
            if (r1 == 0) goto L_0x004d
            boolean r1 = r5.hasValue(r0)
            if (r1 == 0) goto L_0x0046
            int r1 = r5.getResourceId(r0, r2)
            if (r1 == 0) goto L_0x0046
            android.graphics.drawable.Drawable r4 = g.a.a(r4, r1)
            goto L_0x004a
        L_0x0046:
            android.graphics.drawable.Drawable r4 = r5.getDrawable(r0)
        L_0x004a:
            r3.setDivider(r4)
        L_0x004d:
            r5.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ExpandedMenuView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final boolean a(e eVar) {
        throw null;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final void onItemClick(AdapterView adapterView, View view, int i8, long j8) {
        a((e) getAdapter().getItem(i8));
    }
}
