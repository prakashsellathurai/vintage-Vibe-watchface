package k0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class a extends ClickableSpan {

    /* renamed from: f  reason: collision with root package name */
    public final int f5082f;

    /* renamed from: g  reason: collision with root package name */
    public final c f5083g;

    /* renamed from: h  reason: collision with root package name */
    public final int f5084h;

    public a(int i8, c cVar, int i9) {
        this.f5082f = i8;
        this.f5083g = cVar;
        this.f5084h = i9;
    }

    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f5082f);
        this.f5083g.f5085a.performAction(this.f5084h, bundle);
    }
}
