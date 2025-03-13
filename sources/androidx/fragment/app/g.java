package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.l;
import f0.a;

public final class g implements a.C0054a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f1162a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1163b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ l.a f1164c;

    public g(View view, ViewGroup viewGroup, l.a aVar) {
        this.f1162a = view;
        this.f1163b = viewGroup;
        this.f1164c = aVar;
    }

    public final void onCancel() {
        View view = this.f1162a;
        view.clearAnimation();
        this.f1163b.endViewTransition(view);
        this.f1164c.a();
    }
}
