package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;

public final class i implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ p0 f1185f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ View f1186g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Rect f1187h;

    public i(p0 p0Var, View view, Rect rect) {
        this.f1185f = p0Var;
        this.f1186g = view;
        this.f1187h = rect;
    }

    public final void run() {
        this.f1185f.getClass();
        p0.g(this.f1186g, this.f1187h);
    }
}
