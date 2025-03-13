package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.b0;
import androidx.fragment.app.m;
import androidx.health.services.client.R;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import j0.x;
import java.util.Iterator;
import java.util.LinkedHashSet;
import y4.f;

public final class o<S> extends m {
    public static final /* synthetic */ int G0 = 0;
    public boolean A0;
    public int B0;
    public TextView C0;
    public CheckableImageButton D0;
    public f E0;
    public Button F0;

    /* renamed from: p0  reason: collision with root package name */
    public final LinkedHashSet<q<? super S>> f3270p0 = new LinkedHashSet<>();

    /* renamed from: q0  reason: collision with root package name */
    public final LinkedHashSet<View.OnClickListener> f3271q0 = new LinkedHashSet<>();

    /* renamed from: r0  reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f3272r0 = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnDismissListener> s0 = new LinkedHashSet<>();

    /* renamed from: t0  reason: collision with root package name */
    public int f3273t0;
    public d<S> u0;

    /* renamed from: v0  reason: collision with root package name */
    public x<S> f3274v0;

    /* renamed from: w0  reason: collision with root package name */
    public a f3275w0;

    /* renamed from: x0  reason: collision with root package name */
    public g<S> f3276x0;
    public int y0;

    /* renamed from: z0  reason: collision with root package name */
    public CharSequence f3277z0;

    public class a implements View.OnClickListener {
        public a() {
        }

        public final void onClick(View view) {
            o oVar = o.this;
            Iterator<q<? super S>> it = oVar.f3270p0.iterator();
            while (it.hasNext()) {
                oVar.u0.n();
                it.next().a();
            }
            oVar.n(false, false);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        public final void onClick(View view) {
            o oVar = o.this;
            Iterator<View.OnClickListener> it = oVar.f3271q0.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            oVar.n(false, false);
        }
    }

    public class c extends w<S> {
        public c() {
        }

        public final void a(S s8) {
            int i8 = o.G0;
            o oVar = o.this;
            oVar.u();
            oVar.F0.setEnabled(oVar.u0.j());
        }
    }

    public static int q(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        s sVar = new s(b0.c());
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding);
        int i8 = sVar.f3289i;
        return (dimensionPixelOffset * 2) + (dimensionPixelSize * i8) + ((i8 - 1) * dimensionPixelOffset2);
    }

    public static boolean r(Context context) {
        return s(context, 16843277);
    }

    public static boolean s(Context context, int i8) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(v4.b.b(context, R.attr.materialCalendarStyle, g.class.getCanonicalName()), new int[]{i8});
        boolean z8 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z8;
    }

    public final Dialog o() {
        Context requireContext = requireContext();
        requireContext();
        int i8 = this.f3273t0;
        if (i8 == 0) {
            i8 = this.u0.g();
        }
        Dialog dialog = new Dialog(requireContext, i8);
        Context context = dialog.getContext();
        this.A0 = r(context);
        int b9 = v4.b.b(context, R.attr.colorSurface, o.class.getCanonicalName());
        f fVar = new f(context, (AttributeSet) null, R.attr.materialCalendarStyle, -2146303312);
        this.E0 = fVar;
        fVar.h(context);
        this.E0.j(ColorStateList.valueOf(b9));
        f fVar2 = this.E0;
        View decorView = dialog.getWindow().getDecorView();
        int[] iArr = x.f4957a;
        fVar2.i(x.h.i(decorView));
        return dialog;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f3272r0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = this.f1259g;
        }
        this.f3273t0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.u0 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f3275w0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.y0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f3277z0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.B0 = bundle.getInt("INPUT_MODE_KEY");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.A0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.A0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(q(context), -2));
        } else {
            View findViewById = inflate.findViewById(R.id.mtrl_calendar_main_pane);
            View findViewById2 = inflate.findViewById(R.id.mtrl_calendar_frame);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(q(context), -1));
            Resources resources = requireContext().getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
            int i8 = t.f3293f;
            findViewById2.setMinimumHeight(dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i8) + ((i8 - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.C0 = textView;
        int[] iArr = x.f4957a;
        x.f.f(textView, 1);
        this.D0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        CharSequence charSequence = this.f3277z0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.y0);
        }
        this.D0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.D0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, g.a.a(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], g.a.a(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.D0.setChecked(this.B0 != 0);
        x.i(this.D0, (j0.a) null);
        v(this.D0);
        this.D0.setOnClickListener(new p(this));
        this.F0 = (Button) inflate.findViewById(R.id.confirm_button);
        if (this.u0.j()) {
            this.F0.setEnabled(true);
        } else {
            this.F0.setEnabled(false);
        }
        this.F0.setTag("CONFIRM_BUTTON_TAG");
        this.F0.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        button.setOnClickListener(new b());
        return inflate;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.s0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.H;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f3273t0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.u0);
        a.b bVar = new a.b(this.f3275w0);
        s sVar = this.f3276x0.f3250d0;
        if (sVar != null) {
            bVar.f3221c = Long.valueOf(sVar.f3291k);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f3222d);
        s q8 = s.q(bVar.f3219a);
        s q9 = s.q(bVar.f3220b);
        a.c cVar = (a.c) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l8 = bVar.f3221c;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new a(q8, q9, cVar, l8 == null ? null : s.q(l8.longValue())));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.y0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f3277z0);
    }

    public final void onStart() {
        super.onStart();
        Window window = p().getWindow();
        if (this.A0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.E0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable(this.E0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new q4.a(p(), rect));
        }
        t();
    }

    public final void onStop() {
        this.f3274v0.Z.clear();
        super.onStop();
    }

    public final void t() {
        x<S> xVar;
        requireContext();
        int i8 = this.f3273t0;
        if (i8 == 0) {
            i8 = this.u0.g();
        }
        d<S> dVar = this.u0;
        a aVar = this.f3275w0;
        g<S> gVar = new g<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i8);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.f3215i);
        gVar.setArguments(bundle);
        this.f3276x0 = gVar;
        if (this.D0.isChecked()) {
            d<S> dVar2 = this.u0;
            a aVar2 = this.f3275w0;
            xVar = new r<>();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i8);
            bundle2.putParcelable("DATE_SELECTOR_KEY", dVar2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar2);
            xVar.setArguments(bundle2);
        } else {
            xVar = this.f3276x0;
        }
        this.f3274v0 = xVar;
        u();
        b0 childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(childFragmentManager);
        aVar3.f(R.id.mtrl_calendar_frame, this.f3274v0, (String) null, 2);
        aVar3.e();
        this.f3274v0.n(new c());
    }

    public final void u() {
        d<S> dVar = this.u0;
        getContext();
        String f9 = dVar.f();
        this.C0.setContentDescription(String.format(getString(R.string.mtrl_picker_announce_current_selection), new Object[]{f9}));
        this.C0.setText(f9);
    }

    public final void v(CheckableImageButton checkableImageButton) {
        this.D0.setContentDescription(checkableImageButton.getContext().getString(this.D0.isChecked() ? R.string.mtrl_picker_toggle_to_calendar_input_mode : R.string.mtrl_picker_toggle_to_text_input_mode));
    }
}
