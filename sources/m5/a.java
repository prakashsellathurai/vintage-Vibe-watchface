package m5;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

public final class a extends View {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f5447a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(d dVar, Context context) {
        super(context);
        this.f5447a = dVar;
    }

    public final void onDraw(Canvas canvas) {
        float width = ((float) getWidth()) / 2.0f;
        canvas.drawCircle(width, width, width, this.f5447a.f5457b);
    }
}
