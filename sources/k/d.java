package k;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.b;
import androidx.appcompat.view.menu.c;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;

public abstract class d implements f, g, AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public Rect f5080a;

    public static int m(ListAdapter listAdapter, Context context, int i8) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        c cVar = (c) listAdapter;
        int count = cVar.getCount();
        int i9 = 0;
        int i10 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i11 = 0; i11 < count; i11++) {
            int itemViewType = cVar.getItemViewType(i11);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = cVar.getView(i11, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i8) {
                return i8;
            }
            if (measuredWidth > i9) {
                i9 = measuredWidth;
            }
        }
        return i9;
    }

    public static boolean u(androidx.appcompat.view.menu.d dVar) {
        int size = dVar.size();
        for (int i8 = 0; i8 < size; i8++) {
            MenuItem item = dVar.getItem(i8);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(e eVar) {
        return false;
    }

    public final void d(Context context, androidx.appcompat.view.menu.d dVar) {
    }

    public final boolean k(e eVar) {
        return false;
    }

    public abstract void l(androidx.appcompat.view.menu.d dVar);

    public abstract void n(View view);

    public abstract void o(boolean z8);

    public final void onItemClick(AdapterView<?> adapterView, View view, int i8, long j8) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (c) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (c) listAdapter).f393a.p((MenuItem) listAdapter.getItem(i8), this, (this instanceof b) ^ true ? 0 : 4);
    }

    public abstract void p(int i8);

    public abstract void q(int i8);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z8);

    public abstract void t(int i8);
}
