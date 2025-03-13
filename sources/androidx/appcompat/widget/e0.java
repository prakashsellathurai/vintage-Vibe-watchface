package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.c;
import androidx.appcompat.view.menu.d;

public final class e0 extends c0 implements d0 {

    /* renamed from: z  reason: collision with root package name */
    public d0 f707z;

    public static class a extends x {

        /* renamed from: n  reason: collision with root package name */
        public final int f708n;

        /* renamed from: o  reason: collision with root package name */
        public final int f709o;

        /* renamed from: p  reason: collision with root package name */
        public d0 f710p;

        /* renamed from: q  reason: collision with root package name */
        public MenuItem f711q;

        public a(Context context, boolean z8) {
            super(context, z8);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f708n = 21;
                this.f709o = 22;
                return;
            }
            this.f708n = 22;
            this.f709o = 21;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
            r2 = (r2 = pointToPosition((int) r5.getX(), (int) r5.getY())) - r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onHoverEvent(android.view.MotionEvent r5) {
            /*
                r4 = this;
                androidx.appcompat.widget.d0 r0 = r4.f710p
                if (r0 == 0) goto L_0x005a
                android.widget.ListAdapter r0 = r4.getAdapter()
                boolean r1 = r0 instanceof android.widget.HeaderViewListAdapter
                if (r1 == 0) goto L_0x0019
                android.widget.HeaderViewListAdapter r0 = (android.widget.HeaderViewListAdapter) r0
                int r1 = r0.getHeadersCount()
                android.widget.ListAdapter r0 = r0.getWrappedAdapter()
                androidx.appcompat.view.menu.c r0 = (androidx.appcompat.view.menu.c) r0
                goto L_0x001c
            L_0x0019:
                androidx.appcompat.view.menu.c r0 = (androidx.appcompat.view.menu.c) r0
                r1 = 0
            L_0x001c:
                int r2 = r5.getAction()
                r3 = 10
                if (r2 == r3) goto L_0x0043
                float r2 = r5.getX()
                int r2 = (int) r2
                float r3 = r5.getY()
                int r3 = (int) r3
                int r2 = r4.pointToPosition(r2, r3)
                r3 = -1
                if (r2 == r3) goto L_0x0043
                int r2 = r2 - r1
                if (r2 < 0) goto L_0x0043
                int r1 = r0.getCount()
                if (r2 >= r1) goto L_0x0043
                androidx.appcompat.view.menu.e r1 = r0.getItem(r2)
                goto L_0x0044
            L_0x0043:
                r1 = 0
            L_0x0044:
                android.view.MenuItem r2 = r4.f711q
                if (r2 == r1) goto L_0x005a
                androidx.appcompat.view.menu.d r0 = r0.f393a
                if (r2 == 0) goto L_0x0051
                androidx.appcompat.widget.d0 r3 = r4.f710p
                r3.b(r0, r2)
            L_0x0051:
                r4.f711q = r1
                if (r1 == 0) goto L_0x005a
                androidx.appcompat.widget.d0 r2 = r4.f710p
                r2.a(r0, r1)
            L_0x005a:
                boolean r4 = super.onHoverEvent(r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.e0.a.onHoverEvent(android.view.MotionEvent):boolean");
        }

        public final boolean onKeyDown(int i8, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i8 == this.f708n) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i8 != this.f709o) {
                return super.onKeyDown(i8, keyEvent);
            } else {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                }
                ((c) adapter).f393a.c(false);
                return true;
            }
        }

        public void setHoverListener(d0 d0Var) {
            this.f710p = d0Var;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    public e0(Context context, int i8, int i9) {
        super(context, (AttributeSet) null, i8, i9);
    }

    public final void a(d dVar, MenuItem menuItem) {
        d0 d0Var = this.f707z;
        if (d0Var != null) {
            d0Var.a(dVar, menuItem);
        }
    }

    public final void b(d dVar, MenuItem menuItem) {
        d0 d0Var = this.f707z;
        if (d0Var != null) {
            d0Var.b(dVar, menuItem);
        }
    }

    public final x d(Context context, boolean z8) {
        a aVar = new a(context, z8);
        aVar.setHoverListener(this);
        return aVar;
    }
}
