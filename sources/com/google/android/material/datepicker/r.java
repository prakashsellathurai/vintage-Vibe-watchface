package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

public final class r<S> extends x<S> {

    /* renamed from: a0  reason: collision with root package name */
    public int f3282a0;

    /* renamed from: b0  reason: collision with root package name */
    public d<S> f3283b0;

    /* renamed from: c0  reason: collision with root package name */
    public a f3284c0;

    public class a extends w<S> {
        public a() {
        }

        public final void a(S s8) {
            Iterator<w<S>> it = r.this.Z.iterator();
            while (it.hasNext()) {
                it.next().a(s8);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = this.f1259g;
        }
        this.f3282a0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f3283b0 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f3284c0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f3282a0));
        d<S> dVar = this.f3283b0;
        new a();
        return dVar.o();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f3282a0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f3283b0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f3284c0);
    }
}
