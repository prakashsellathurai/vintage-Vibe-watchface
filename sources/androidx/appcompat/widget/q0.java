package androidx.appcompat.widget;

import a1.a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.c;
import androidx.health.services.client.R;

public final class q0 implements v {

    /* renamed from: a  reason: collision with root package name */
    public final Toolbar f805a;

    /* renamed from: b  reason: collision with root package name */
    public int f806b;

    /* renamed from: c  reason: collision with root package name */
    public View f807c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f808d;
    public Drawable e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f809f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f810g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f811h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f812i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f813j;

    /* renamed from: k  reason: collision with root package name */
    public Window.Callback f814k;

    /* renamed from: l  reason: collision with root package name */
    public int f815l = 0;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f816m;

    public q0(Toolbar toolbar) {
        Drawable drawable;
        this.f805a = toolbar;
        this.f811h = toolbar.getTitle();
        this.f812i = toolbar.getSubtitle();
        this.f810g = this.f811h != null;
        this.f809f = toolbar.getNavigationIcon();
        String str = null;
        o0 l8 = o0.l(toolbar.getContext(), (AttributeSet) null, a.f34m, R.attr.actionBarStyle);
        this.f816m = l8.e(15);
        CharSequence j8 = l8.j(27);
        if (!TextUtils.isEmpty(j8)) {
            this.f810g = true;
            this.f811h = j8;
            if ((this.f806b & 8) != 0) {
                toolbar.setTitle(j8);
            }
        }
        CharSequence j9 = l8.j(25);
        if (!TextUtils.isEmpty(j9)) {
            this.f812i = j9;
            if ((this.f806b & 8) != 0) {
                toolbar.setSubtitle(j9);
            }
        }
        Drawable e4 = l8.e(20);
        if (e4 != null) {
            this.e = e4;
            g();
        }
        Drawable e9 = l8.e(17);
        if (e9 != null) {
            setIcon(e9);
        }
        if (this.f809f == null && (drawable = this.f816m) != null) {
            this.f809f = drawable;
            if ((this.f806b & 4) != 0) {
                toolbar.setNavigationIcon(drawable);
            } else {
                toolbar.setNavigationIcon((Drawable) null);
            }
        }
        f(l8.g(10, 0));
        int h8 = l8.h(9, 0);
        if (h8 != 0) {
            View inflate = LayoutInflater.from(toolbar.getContext()).inflate(h8, toolbar, false);
            View view = this.f807c;
            if (!(view == null || (this.f806b & 16) == 0)) {
                toolbar.removeView(view);
            }
            this.f807c = inflate;
            if (!(inflate == null || (this.f806b & 16) == 0)) {
                toolbar.addView(inflate);
            }
            f(this.f806b | 16);
        }
        int layoutDimension = l8.f782b.getLayoutDimension(13, 0);
        if (layoutDimension > 0) {
            ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
            layoutParams.height = layoutDimension;
            toolbar.setLayoutParams(layoutParams);
        }
        int c9 = l8.c(7, -1);
        int c10 = l8.c(3, -1);
        if (c9 >= 0 || c10 >= 0) {
            int max = Math.max(c9, 0);
            int max2 = Math.max(c10, 0);
            if (toolbar.f613t == null) {
                toolbar.f613t = new h0();
            }
            toolbar.f613t.a(max, max2);
        }
        int h9 = l8.h(28, 0);
        if (h9 != 0) {
            Context context = toolbar.getContext();
            toolbar.f606l = h9;
            TextView textView = toolbar.f597b;
            if (textView != null) {
                textView.setTextAppearance(context, h9);
            }
        }
        int h10 = l8.h(26, 0);
        if (h10 != 0) {
            Context context2 = toolbar.getContext();
            toolbar.f607m = h10;
            TextView textView2 = toolbar.f598c;
            if (textView2 != null) {
                textView2.setTextAppearance(context2, h10);
            }
        }
        int h11 = l8.h(22, 0);
        if (h11 != 0) {
            toolbar.setPopupTheme(h11);
        }
        l8.m();
        if (R.string.abc_action_bar_up_description != this.f815l) {
            this.f815l = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i8 = this.f815l;
                str = i8 != 0 ? e().getString(i8) : str;
                this.f813j = str;
                if ((this.f806b & 4) != 0) {
                    if (TextUtils.isEmpty(str)) {
                        toolbar.setNavigationContentDescription(this.f815l);
                    } else {
                        toolbar.setNavigationContentDescription(this.f813j);
                    }
                }
            }
        }
        this.f813j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new p0(this));
    }

    public final void a() {
        c cVar;
        ActionMenuView actionMenuView = this.f805a.f596a;
        if (actionMenuView != null && (cVar = actionMenuView.f518s) != null) {
            cVar.f();
            c.a aVar = cVar.f661s;
            if (aVar != null && aVar.b()) {
                aVar.f449j.dismiss();
            }
        }
    }

    public final void b(CharSequence charSequence) {
        if (!this.f810g) {
            this.f811h = charSequence;
            if ((this.f806b & 8) != 0) {
                this.f805a.setTitle(charSequence);
            }
        }
    }

    public final void c(Window.Callback callback) {
        this.f814k = callback;
    }

    public final void d(int i8) {
        this.e = i8 != 0 ? g.a.a(e(), i8) : null;
        g();
    }

    public final Context e() {
        return this.f805a.getContext();
    }

    public final void f(int i8) {
        View view;
        int i9 = this.f806b ^ i8;
        this.f806b = i8;
        if (i9 != 0) {
            int i10 = i9 & 4;
            CharSequence charSequence = null;
            Toolbar toolbar = this.f805a;
            if (i10 != 0) {
                if (!((i8 & 4) == 0 || (i8 & 4) == 0)) {
                    if (TextUtils.isEmpty(this.f813j)) {
                        toolbar.setNavigationContentDescription(this.f815l);
                    } else {
                        toolbar.setNavigationContentDescription(this.f813j);
                    }
                }
                if ((this.f806b & 4) != 0) {
                    Drawable drawable = this.f809f;
                    if (drawable == null) {
                        drawable = this.f816m;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i9 & 3) != 0) {
                g();
            }
            if ((i9 & 8) != 0) {
                if ((i8 & 8) != 0) {
                    toolbar.setTitle(this.f811h);
                    charSequence = this.f812i;
                } else {
                    toolbar.setTitle((CharSequence) null);
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i9 & 16) != 0 && (view = this.f807c) != null) {
                if ((i8 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void g() {
        Drawable drawable;
        int i8 = this.f806b;
        if ((i8 & 2) == 0) {
            drawable = null;
        } else if ((i8 & 1) == 0 || (drawable = this.e) == null) {
            drawable = this.f808d;
        }
        this.f805a.setLogo(drawable);
    }

    public final CharSequence getTitle() {
        return this.f805a.getTitle();
    }

    public final void setIcon(int i8) {
        setIcon(i8 != 0 ? g.a.a(e(), i8) : null);
    }

    public final void setIcon(Drawable drawable) {
        this.f808d = drawable;
        g();
    }
}
