package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.GridView;
import androidx.health.services.client.R;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.o;
import j0.x;
import java.util.Calendar;
import java.util.GregorianCalendar;

public final class g<S> extends x<S> {

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ int f3246k0 = 0;

    /* renamed from: a0  reason: collision with root package name */
    public int f3247a0;

    /* renamed from: b0  reason: collision with root package name */
    public d<S> f3248b0;

    /* renamed from: c0  reason: collision with root package name */
    public a f3249c0;

    /* renamed from: d0  reason: collision with root package name */
    public s f3250d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f3251e0;

    /* renamed from: f0  reason: collision with root package name */
    public c f3252f0;

    /* renamed from: g0  reason: collision with root package name */
    public RecyclerView f3253g0;

    /* renamed from: h0  reason: collision with root package name */
    public RecyclerView f3254h0;

    /* renamed from: i0  reason: collision with root package name */
    public View f3255i0;

    /* renamed from: j0  reason: collision with root package name */
    public View f3256j0;

    public class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f3257f;

        public a(int i8) {
            this.f3257f = i8;
        }

        public final void run() {
            g.this.f3254h0.b0(this.f3257f);
        }
    }

    public class b extends j0.a {
        public final void d(View view, k0.c cVar) {
            View.AccessibilityDelegate accessibilityDelegate = this.f4917a;
            AccessibilityNodeInfo accessibilityNodeInfo = cVar.f5085a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) null);
        }
    }

    public class c extends z {
        public final /* synthetic */ int E;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(int i8, int i9) {
            super(i8);
            this.E = i9;
        }

        public final void E0(RecyclerView.x xVar, int[] iArr) {
            int i8 = this.E;
            g gVar = g.this;
            if (i8 == 0) {
                iArr[0] = gVar.f3254h0.getWidth();
                iArr[1] = gVar.f3254h0.getWidth();
                return;
            }
            iArr[0] = gVar.f3254h0.getHeight();
            iArr[1] = gVar.f3254h0.getHeight();
        }
    }

    public class d implements e {
        public d() {
        }
    }

    public interface e {
    }

    public final boolean n(o.c cVar) {
        return super.n(cVar);
    }

    public final void o(int i8) {
        this.f3254h0.post(new a(i8));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = this.f1259g;
        }
        this.f3247a0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f3248b0 = (d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f3249c0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f3250d0 = (s) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i8;
        int i9;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f3247a0);
        this.f3252f0 = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        s sVar = this.f3249c0.f3212f;
        if (o.r(contextThemeWrapper)) {
            i9 = R.layout.mtrl_calendar_vertical;
            i8 = 1;
        } else {
            i9 = R.layout.mtrl_calendar_horizontal;
            i8 = 0;
        }
        View inflate = cloneInContext.inflate(i9, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        x.i(gridView, new b());
        gridView.setAdapter(new f());
        gridView.setNumColumns(sVar.f3289i);
        gridView.setEnabled(false);
        this.f3254h0 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        getContext();
        this.f3254h0.setLayoutManager(new c(i8, i8));
        this.f3254h0.setTag("MONTHS_VIEW_GROUP_TAG");
        v vVar = new v(contextThemeWrapper, this.f3248b0, this.f3249c0, new d());
        this.f3254h0.setAdapter(vVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f3253g0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f3253g0.setLayoutManager(new GridLayoutManager(integer));
            this.f3253g0.setAdapter(new d0(this));
            this.f3253g0.f(new h(this));
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            x.i(materialButton, new i(this));
            MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(R.id.month_navigation_previous);
            materialButton2.setTag("NAVIGATION_PREV_TAG");
            MaterialButton materialButton3 = (MaterialButton) inflate.findViewById(R.id.month_navigation_next);
            materialButton3.setTag("NAVIGATION_NEXT_TAG");
            this.f3255i0 = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.f3256j0 = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            q(1);
            materialButton.setText(this.f3250d0.s(inflate.getContext()));
            this.f3254h0.g(new j(this, vVar, materialButton));
            materialButton.setOnClickListener(new k(this));
            materialButton3.setOnClickListener(new l(this, vVar));
            materialButton2.setOnClickListener(new m(this, vVar));
        }
        if (!o.r(contextThemeWrapper)) {
            new u().a(this.f3254h0);
        }
        RecyclerView recyclerView2 = this.f3254h0;
        s sVar2 = this.f3250d0;
        s sVar3 = vVar.e.f3212f;
        if (sVar3.f3286f instanceof GregorianCalendar) {
            recyclerView2.Z(((sVar2.f3288h - sVar3.f3288h) * 12) + (sVar2.f3287g - sVar3.f3287g));
            return inflate;
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f3247a0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f3248b0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f3249c0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f3250d0);
    }

    public final void p(s sVar) {
        RecyclerView recyclerView;
        int i8;
        s sVar2 = ((v) this.f3254h0.getAdapter()).e.f3212f;
        Calendar calendar = sVar2.f3286f;
        if (calendar instanceof GregorianCalendar) {
            int i9 = sVar.f3288h;
            int i10 = sVar2.f3288h;
            int i11 = sVar.f3287g;
            int i12 = sVar2.f3287g;
            int i13 = ((i9 - i10) * 12) + (i11 - i12);
            s sVar3 = this.f3250d0;
            if (calendar instanceof GregorianCalendar) {
                int i14 = i13 - (((sVar3.f3288h - i10) * 12) + (sVar3.f3287g - i12));
                boolean z8 = true;
                boolean z9 = Math.abs(i14) > 3;
                if (i14 <= 0) {
                    z8 = false;
                }
                this.f3250d0 = sVar;
                if (!z9 || !z8) {
                    if (z9) {
                        recyclerView = this.f3254h0;
                        i8 = i13 + 3;
                    }
                    o(i13);
                    return;
                }
                recyclerView = this.f3254h0;
                i8 = i13 - 3;
                recyclerView.Z(i8);
                o(i13);
                return;
            }
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public final void q(int i8) {
        this.f3251e0 = i8;
        if (i8 == 2) {
            this.f3253g0.getLayoutManager().r0(this.f3250d0.f3288h - ((d0) this.f3253g0.getAdapter()).f3240d.f3249c0.f3212f.f3288h);
            this.f3255i0.setVisibility(0);
            this.f3256j0.setVisibility(8);
        } else if (i8 == 1) {
            this.f3255i0.setVisibility(8);
            this.f3256j0.setVisibility(0);
            p(this.f3250d0);
        }
    }
}
