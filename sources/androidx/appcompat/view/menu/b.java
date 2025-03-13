package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.transition.Transition;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.e0;
import androidx.health.services.client.R;
import j0.x;
import java.util.ArrayList;
import java.util.Iterator;

public final class b extends k.d implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean A;

    /* renamed from: b  reason: collision with root package name */
    public final Context f362b;

    /* renamed from: c  reason: collision with root package name */
    public final int f363c;

    /* renamed from: d  reason: collision with root package name */
    public final int f364d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f365f;

    /* renamed from: g  reason: collision with root package name */
    public final Handler f366g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f367h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f368i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f369j = new a();

    /* renamed from: k  reason: collision with root package name */
    public final View.OnAttachStateChangeListener f370k = new C0007b();

    /* renamed from: l  reason: collision with root package name */
    public final c f371l = new c();

    /* renamed from: m  reason: collision with root package name */
    public int f372m;

    /* renamed from: n  reason: collision with root package name */
    public int f373n;

    /* renamed from: o  reason: collision with root package name */
    public View f374o;

    /* renamed from: p  reason: collision with root package name */
    public View f375p;

    /* renamed from: q  reason: collision with root package name */
    public int f376q;
    public boolean r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f377s;

    /* renamed from: t  reason: collision with root package name */
    public int f378t;

    /* renamed from: u  reason: collision with root package name */
    public int f379u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f380v;
    public boolean w;

    /* renamed from: x  reason: collision with root package name */
    public g.a f381x;
    public ViewTreeObserver y;

    /* renamed from: z  reason: collision with root package name */
    public PopupWindow.OnDismissListener f382z;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public final void onGlobalLayout() {
            b bVar = b.this;
            if (bVar.i()) {
                ArrayList arrayList = bVar.f368i;
                if (arrayList.size() > 0 && !((d) arrayList.get(0)).f390a.f693x) {
                    View view = bVar.f375p;
                    if (view == null || !view.isShown()) {
                        bVar.dismiss();
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((d) it.next()).f390a.c();
                    }
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b  reason: collision with other inner class name */
    public class C0007b implements View.OnAttachStateChangeListener {
        public C0007b() {
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            b bVar = b.this;
            ViewTreeObserver viewTreeObserver = bVar.y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    bVar.y = view.getViewTreeObserver();
                }
                bVar.y.removeGlobalOnLayoutListener(bVar.f369j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class c implements d0 {

        public class a implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ d f386f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ MenuItem f387g;

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ d f388h;

            public a(d dVar, MenuItem menuItem, d dVar2) {
                this.f386f = dVar;
                this.f387g = menuItem;
                this.f388h = dVar2;
            }

            public final void run() {
                d dVar = this.f386f;
                if (dVar != null) {
                    c cVar = c.this;
                    b.this.A = true;
                    dVar.f391b.c(false);
                    b.this.A = false;
                }
                MenuItem menuItem = this.f387g;
                if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                    this.f388h.p(menuItem, (g) null, 4);
                }
            }
        }

        public c() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: androidx.appcompat.view.menu.b$d} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(androidx.appcompat.view.menu.d r8, android.view.MenuItem r9) {
            /*
                r7 = this;
                androidx.appcompat.view.menu.b r0 = androidx.appcompat.view.menu.b.this
                android.os.Handler r1 = r0.f366g
                r2 = 0
                r1.removeCallbacksAndMessages(r2)
                java.util.ArrayList r1 = r0.f368i
                int r3 = r1.size()
                r4 = 0
            L_0x000f:
                r5 = -1
                if (r4 >= r3) goto L_0x0020
                java.lang.Object r6 = r1.get(r4)
                androidx.appcompat.view.menu.b$d r6 = (androidx.appcompat.view.menu.b.d) r6
                androidx.appcompat.view.menu.d r6 = r6.f391b
                if (r8 != r6) goto L_0x001d
                goto L_0x0021
            L_0x001d:
                int r4 = r4 + 1
                goto L_0x000f
            L_0x0020:
                r4 = r5
            L_0x0021:
                if (r4 != r5) goto L_0x0024
                return
            L_0x0024:
                int r4 = r4 + 1
                int r3 = r1.size()
                if (r4 >= r3) goto L_0x0033
                java.lang.Object r1 = r1.get(r4)
                r2 = r1
                androidx.appcompat.view.menu.b$d r2 = (androidx.appcompat.view.menu.b.d) r2
            L_0x0033:
                androidx.appcompat.view.menu.b$c$a r1 = new androidx.appcompat.view.menu.b$c$a
                r1.<init>(r2, r9, r8)
                long r2 = android.os.SystemClock.uptimeMillis()
                r4 = 200(0xc8, double:9.9E-322)
                long r2 = r2 + r4
                android.os.Handler r7 = r0.f366g
                r7.postAtTime(r1, r8, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.b.c.a(androidx.appcompat.view.menu.d, android.view.MenuItem):void");
        }

        public final void b(d dVar, MenuItem menuItem) {
            b.this.f366g.removeCallbacksAndMessages(dVar);
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final e0 f390a;

        /* renamed from: b  reason: collision with root package name */
        public final d f391b;

        /* renamed from: c  reason: collision with root package name */
        public final int f392c;

        public d(e0 e0Var, d dVar, int i8) {
            this.f390a = e0Var;
            this.f391b = dVar;
            this.f392c = i8;
        }
    }

    public b(Context context, View view, int i8, int i9, boolean z8) {
        int i10 = 0;
        this.f372m = 0;
        this.f373n = 0;
        this.f362b = context;
        this.f374o = view;
        this.f364d = i8;
        this.e = i9;
        this.f365f = z8;
        this.f380v = false;
        int[] iArr = x.f4957a;
        this.f376q = x.d.d(view) != 1 ? 1 : i10;
        Resources resources = context.getResources();
        this.f363c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f366g = new Handler();
    }

    public final void a(d dVar, boolean z8) {
        int i8;
        ArrayList arrayList = this.f368i;
        int size = arrayList.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                i9 = -1;
                break;
            } else if (dVar == ((d) arrayList.get(i9)).f391b) {
                break;
            } else {
                i9++;
            }
        }
        if (i9 >= 0) {
            int i10 = i9 + 1;
            if (i10 < arrayList.size()) {
                ((d) arrayList.get(i10)).f391b.c(false);
            }
            d dVar2 = (d) arrayList.remove(i9);
            dVar2.f391b.q(this);
            boolean z9 = this.A;
            e0 e0Var = dVar2.f390a;
            if (z9) {
                e0Var.y.setExitTransition((Transition) null);
                e0Var.y.setAnimationStyle(0);
            }
            e0Var.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                i8 = ((d) arrayList.get(size2 - 1)).f392c;
            } else {
                View view = this.f374o;
                int[] iArr = x.f4957a;
                i8 = x.d.d(view) == 1 ? 0 : 1;
            }
            this.f376q = i8;
            if (size2 == 0) {
                dismiss();
                g.a aVar = this.f381x;
                if (aVar != null) {
                    aVar.a(dVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.y;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.y.removeGlobalOnLayoutListener(this.f369j);
                    }
                    this.y = null;
                }
                this.f375p.removeOnAttachStateChangeListener(this.f370k);
                this.f382z.onDismiss();
            } else if (z8) {
                ((d) arrayList.get(0)).f391b.c(false);
            }
        }
    }

    public final void c() {
        if (!i()) {
            ArrayList arrayList = this.f367h;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                v((d) it.next());
            }
            arrayList.clear();
            View view = this.f374o;
            this.f375p = view;
            if (view != null) {
                boolean z8 = this.y == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.y = viewTreeObserver;
                if (z8) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f369j);
                }
                this.f375p.addOnAttachStateChangeListener(this.f370k);
            }
        }
    }

    public final void dismiss() {
        ArrayList arrayList = this.f368i;
        int size = arrayList.size();
        if (size > 0) {
            d[] dVarArr = (d[]) arrayList.toArray(new d[size]);
            while (true) {
                size--;
                if (size >= 0) {
                    d dVar = dVarArr[size];
                    if (dVar.f390a.i()) {
                        dVar.f390a.dismiss();
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void e() {
        Iterator it = this.f368i.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((d) it.next()).f390a.f675c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((c) adapter).notifyDataSetChanged();
        }
    }

    public final ListView f() {
        ArrayList arrayList = this.f368i;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) arrayList.get(arrayList.size() - 1)).f390a.f675c;
    }

    public final boolean g(j jVar) {
        Iterator it = this.f368i.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (jVar == dVar.f391b) {
                dVar.f390a.f675c.requestFocus();
                return true;
            }
        }
        if (!jVar.hasVisibleItems()) {
            return false;
        }
        l(jVar);
        g.a aVar = this.f381x;
        if (aVar != null) {
            aVar.b(jVar);
        }
        return true;
    }

    public final boolean h() {
        return false;
    }

    public final boolean i() {
        ArrayList arrayList = this.f368i;
        return arrayList.size() > 0 && ((d) arrayList.get(0)).f390a.i();
    }

    public final void j(g.a aVar) {
        this.f381x = aVar;
    }

    public final void l(d dVar) {
        dVar.b(this, this.f362b);
        if (i()) {
            v(dVar);
        } else {
            this.f367h.add(dVar);
        }
    }

    public final void n(View view) {
        if (this.f374o != view) {
            this.f374o = view;
            int i8 = this.f372m;
            int[] iArr = x.f4957a;
            this.f373n = Gravity.getAbsoluteGravity(i8, x.d.d(view));
        }
    }

    public final void o(boolean z8) {
        this.f380v = z8;
    }

    public final void onDismiss() {
        d dVar;
        ArrayList arrayList = this.f368i;
        int size = arrayList.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) arrayList.get(i8);
            if (!dVar.f390a.i()) {
                break;
            }
            i8++;
        }
        if (dVar != null) {
            dVar.f391b.c(false);
        }
    }

    public final boolean onKey(View view, int i8, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i8 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public final void p(int i8) {
        if (this.f372m != i8) {
            this.f372m = i8;
            View view = this.f374o;
            int[] iArr = x.f4957a;
            this.f373n = Gravity.getAbsoluteGravity(i8, x.d.d(view));
        }
    }

    public final void q(int i8) {
        this.r = true;
        this.f378t = i8;
    }

    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f382z = onDismissListener;
    }

    public final void s(boolean z8) {
        this.w = z8;
    }

    public final void t(int i8) {
        this.f377s = true;
        this.f379u = i8;
    }

    public final void v(d dVar) {
        d dVar2;
        View view;
        int i8;
        int i9;
        MenuItem menuItem;
        int i10;
        c cVar;
        int firstVisiblePosition;
        d dVar3 = dVar;
        Context context = this.f362b;
        LayoutInflater from = LayoutInflater.from(context);
        c cVar2 = new c(dVar3, from, this.f365f, R.layout.abc_cascading_menu_item_layout);
        if (!i() && this.f380v) {
            cVar2.f395c = true;
        } else if (i()) {
            cVar2.f395c = k.d.u(dVar);
        }
        int m8 = k.d.m(cVar2, context, this.f363c);
        e0 e0Var = new e0(context, this.f364d, this.e);
        e0Var.f707z = this.f371l;
        e0Var.f687p = this;
        PopupWindow popupWindow = e0Var.y;
        popupWindow.setOnDismissListener(this);
        e0Var.f686o = this.f374o;
        e0Var.f683l = this.f373n;
        e0Var.f693x = true;
        popupWindow.setFocusable(true);
        popupWindow.setInputMethodMode(2);
        e0Var.g(cVar2);
        e0Var.h(m8);
        e0Var.f683l = this.f373n;
        ArrayList arrayList = this.f368i;
        if (arrayList.size() > 0) {
            dVar2 = (d) arrayList.get(arrayList.size() - 1);
            d dVar4 = dVar2.f391b;
            int size = dVar4.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = dVar4.getItem(i11);
                if (menuItem.hasSubMenu() && dVar3 == menuItem.getSubMenu()) {
                    break;
                }
                i11++;
            }
            if (menuItem != null) {
                androidx.appcompat.widget.x xVar = dVar2.f390a.f675c;
                ListAdapter adapter = xVar.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i10 = headerViewListAdapter.getHeadersCount();
                    cVar = (c) headerViewListAdapter.getWrappedAdapter();
                } else {
                    cVar = (c) adapter;
                    i10 = 0;
                }
                int count = cVar.getCount();
                int i12 = 0;
                while (true) {
                    if (i12 >= count) {
                        i12 = -1;
                        break;
                    } else if (menuItem == cVar.getItem(i12)) {
                        break;
                    } else {
                        i12++;
                    }
                }
                if (i12 != -1 && (firstVisiblePosition = (i12 + i10) - xVar.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < xVar.getChildCount()) {
                    view = xVar.getChildAt(firstVisiblePosition);
                }
            }
            view = null;
        } else {
            view = null;
            dVar2 = null;
        }
        if (view != null) {
            popupWindow.setTouchModal(false);
            popupWindow.setEnterTransition((Transition) null);
            androidx.appcompat.widget.x xVar2 = ((d) arrayList.get(arrayList.size() - 1)).f390a.f675c;
            int[] iArr = new int[2];
            xVar2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.f375p.getWindowVisibleDisplayFrame(rect);
            int i13 = (this.f376q != 1 ? iArr[0] - m8 >= 0 : (iArr[0] + xVar2.getWidth()) + m8 > rect.right) ? 0 : 1;
            boolean z8 = i13 == 1;
            this.f376q = i13;
            e0Var.f686o = view;
            if ((this.f373n & 5) == 5) {
                i9 = 0;
                if (z8) {
                    i8 = m8 + 0;
                    e0Var.f677f = i8;
                    e0Var.f682k = true;
                    e0Var.f681j = true;
                    e0Var.j(i9);
                } else {
                    m8 = view.getWidth();
                }
            } else {
                i9 = 0;
                if (z8) {
                    i8 = view.getWidth() + 0;
                    e0Var.f677f = i8;
                    e0Var.f682k = true;
                    e0Var.f681j = true;
                    e0Var.j(i9);
                }
            }
            i8 = 0 - m8;
            e0Var.f677f = i8;
            e0Var.f682k = true;
            e0Var.f681j = true;
            e0Var.j(i9);
        } else {
            if (this.r) {
                e0Var.f677f = this.f378t;
            }
            if (this.f377s) {
                e0Var.j(this.f379u);
            }
            Rect rect2 = this.f5080a;
            e0Var.w = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new d(e0Var, dVar3, this.f376q));
        e0Var.c();
        androidx.appcompat.widget.x xVar3 = e0Var.f675c;
        xVar3.setOnKeyListener(this);
        if (dVar2 == null && this.w && dVar3.f410m != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, xVar3, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(dVar3.f410m);
            xVar3.addHeaderView(frameLayout, (Object) null, false);
            e0Var.c();
        }
    }
}
