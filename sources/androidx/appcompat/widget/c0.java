package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import j0.x;
import k.f;
import n0.h;
import n0.i;

public class c0 implements f {

    /* renamed from: a  reason: collision with root package name */
    public final Context f673a;

    /* renamed from: b  reason: collision with root package name */
    public ListAdapter f674b;

    /* renamed from: c  reason: collision with root package name */
    public x f675c;

    /* renamed from: d  reason: collision with root package name */
    public final int f676d = -2;
    public int e = -2;

    /* renamed from: f  reason: collision with root package name */
    public int f677f;

    /* renamed from: g  reason: collision with root package name */
    public int f678g;

    /* renamed from: h  reason: collision with root package name */
    public final int f679h = 1002;

    /* renamed from: i  reason: collision with root package name */
    public boolean f680i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f681j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f682k;

    /* renamed from: l  reason: collision with root package name */
    public int f683l = 0;

    /* renamed from: m  reason: collision with root package name */
    public final int f684m = Integer.MAX_VALUE;

    /* renamed from: n  reason: collision with root package name */
    public DataSetObserver f685n;

    /* renamed from: o  reason: collision with root package name */
    public View f686o;

    /* renamed from: p  reason: collision with root package name */
    public AdapterView.OnItemClickListener f687p;

    /* renamed from: q  reason: collision with root package name */
    public final e f688q = new e();
    public final d r = new d();

    /* renamed from: s  reason: collision with root package name */
    public final c f689s = new c();

    /* renamed from: t  reason: collision with root package name */
    public final a f690t = new a();

    /* renamed from: u  reason: collision with root package name */
    public final Handler f691u;

    /* renamed from: v  reason: collision with root package name */
    public final Rect f692v = new Rect();
    public Rect w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f693x;
    public final PopupWindow y;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            x xVar = c0.this.f675c;
            if (xVar != null) {
                xVar.setListSelectionHidden(true);
                xVar.requestLayout();
            }
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        public final void onChanged() {
            c0 c0Var = c0.this;
            if (c0Var.i()) {
                c0Var.c();
            }
        }

        public final void onInvalidated() {
            c0.this.dismiss();
        }
    }

    public class c implements AbsListView.OnScrollListener {
        public c() {
        }

        public final void onScroll(AbsListView absListView, int i8, int i9, int i10) {
        }

        public final void onScrollStateChanged(AbsListView absListView, int i8) {
            boolean z8 = true;
            if (i8 == 1) {
                c0 c0Var = c0.this;
                if (c0Var.y.getInputMethodMode() != 2) {
                    z8 = false;
                }
                if (!z8 && c0Var.y.getContentView() != null) {
                    Handler handler = c0Var.f691u;
                    e eVar = c0Var.f688q;
                    handler.removeCallbacks(eVar);
                    eVar.run();
                }
            }
        }
    }

    public class d implements View.OnTouchListener {
        public d() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x8 = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            c0 c0Var = c0.this;
            if (action == 0 && (popupWindow = c0Var.y) != null && popupWindow.isShowing() && x8 >= 0 && x8 < c0Var.y.getWidth() && y >= 0 && y < c0Var.y.getHeight()) {
                c0Var.f691u.postDelayed(c0Var.f688q, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                c0Var.f691u.removeCallbacks(c0Var.f688q);
                return false;
            }
        }
    }

    public class e implements Runnable {
        public e() {
        }

        public final void run() {
            c0 c0Var = c0.this;
            x xVar = c0Var.f675c;
            if (xVar != null) {
                int[] iArr = x.f4957a;
                if (x.f.b(xVar) && c0Var.f675c.getCount() > c0Var.f675c.getChildCount() && c0Var.f675c.getChildCount() <= c0Var.f684m) {
                    c0Var.y.setInputMethodMode(2);
                    c0Var.c();
                }
            }
        }
    }

    public c0(Context context, AttributeSet attributeSet, int i8, int i9) {
        this.f673a = context;
        this.f691u = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.a.f49x, i8, i9);
        this.f677f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f678g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f680i = true;
        }
        obtainStyledAttributes.recycle();
        n nVar = new n(context, attributeSet, i8, i9);
        this.y = nVar;
        nVar.setInputMethodMode(1);
    }

    public final void c() {
        int i8;
        x xVar;
        x xVar2 = this.f675c;
        PopupWindow popupWindow = this.y;
        Context context = this.f673a;
        if (xVar2 == null) {
            x d9 = d(context, !this.f693x);
            this.f675c = d9;
            d9.setAdapter(this.f674b);
            this.f675c.setOnItemClickListener(this.f687p);
            this.f675c.setFocusable(true);
            this.f675c.setFocusableInTouchMode(true);
            this.f675c.setOnItemSelectedListener(new b0(this));
            this.f675c.setOnScrollListener(this.f689s);
            popupWindow.setContentView(this.f675c);
        } else {
            ViewGroup viewGroup = (ViewGroup) popupWindow.getContentView();
        }
        Drawable background = popupWindow.getBackground();
        int i9 = 0;
        Rect rect = this.f692v;
        if (background != null) {
            background.getPadding(rect);
            int i10 = rect.top;
            i8 = rect.bottom + i10;
            if (!this.f680i) {
                this.f678g = -i10;
            }
        } else {
            rect.setEmpty();
            i8 = 0;
        }
        int maxAvailableHeight = popupWindow.getMaxAvailableHeight(this.f686o, this.f678g, popupWindow.getInputMethodMode() == 2);
        int i11 = this.f676d;
        if (i11 != -1) {
            int i12 = this.e;
            maxAvailableHeight = this.f675c.a(i12 != -2 ? i12 != -1 ? View.MeasureSpec.makeMeasureSpec(i12, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), maxAvailableHeight + 0);
            i8 = maxAvailableHeight > 0 ? i8 + this.f675c.getPaddingTop() + this.f675c.getPaddingBottom() + 0 : 0;
        }
        int i13 = maxAvailableHeight + i8;
        boolean z8 = popupWindow.getInputMethodMode() == 2;
        i.d(popupWindow, this.f679h);
        if (popupWindow.isShowing()) {
            View view = this.f686o;
            int[] iArr = x.f4957a;
            if (x.f.b(view)) {
                int i14 = this.e;
                if (i14 == -1) {
                    i14 = -1;
                } else if (i14 == -2) {
                    i14 = this.f686o.getWidth();
                }
                if (i11 == -1) {
                    i11 = z8 ? i13 : -1;
                    int i15 = this.e;
                    if (z8) {
                        popupWindow.setWidth(i15 == -1 ? -1 : 0);
                        popupWindow.setHeight(0);
                    } else {
                        if (i15 == -1) {
                            i9 = -1;
                        }
                        popupWindow.setWidth(i9);
                        popupWindow.setHeight(-1);
                    }
                } else if (i11 == -2) {
                    i11 = i13;
                }
                popupWindow.setOutsideTouchable(true);
                View view2 = this.f686o;
                int i16 = this.f677f;
                int i17 = this.f678g;
                if (i14 < 0) {
                    i14 = -1;
                }
                popupWindow.update(view2, i16, i17, i14, i11 < 0 ? -1 : i11);
                return;
            }
            return;
        }
        int i18 = this.e;
        if (i18 == -1) {
            i18 = -1;
        } else if (i18 == -2) {
            i18 = this.f686o.getWidth();
        }
        if (i11 == -1) {
            i11 = -1;
        } else if (i11 == -2) {
            i11 = i13;
        }
        popupWindow.setWidth(i18);
        popupWindow.setHeight(i11);
        popupWindow.setIsClippedToScreen(true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchInterceptor(this.r);
        if (this.f682k) {
            i.c(popupWindow, this.f681j);
        }
        popupWindow.setEpicenterBounds(this.w);
        h.a(popupWindow, this.f686o, this.f677f, this.f678g, this.f683l);
        this.f675c.setSelection(-1);
        if ((!this.f693x || this.f675c.isInTouchMode()) && (xVar = this.f675c) != null) {
            xVar.setListSelectionHidden(true);
            xVar.requestLayout();
        }
        if (!this.f693x) {
            this.f691u.post(this.f690t);
        }
    }

    public x d(Context context, boolean z8) {
        throw null;
    }

    public final void dismiss() {
        PopupWindow popupWindow = this.y;
        popupWindow.dismiss();
        popupWindow.setContentView((View) null);
        this.f675c = null;
        this.f691u.removeCallbacks(this.f688q);
    }

    public final int e() {
        if (!this.f680i) {
            return 0;
        }
        return this.f678g;
    }

    public final ListView f() {
        return this.f675c;
    }

    public void g(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f685n;
        if (dataSetObserver == null) {
            this.f685n = new b();
        } else {
            ListAdapter listAdapter2 = this.f674b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f674b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f685n);
        }
        x xVar = this.f675c;
        if (xVar != null) {
            xVar.setAdapter(this.f674b);
        }
    }

    public final void h(int i8) {
        Drawable background = this.y.getBackground();
        if (background != null) {
            Rect rect = this.f692v;
            background.getPadding(rect);
            this.e = rect.left + rect.right + i8;
            return;
        }
        this.e = i8;
    }

    public final boolean i() {
        return this.y.isShowing();
    }

    public final void j(int i8) {
        this.f678g = i8;
        this.f680i = true;
    }
}
