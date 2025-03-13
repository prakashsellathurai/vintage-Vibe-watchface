package com.samsung.android.wearable.watchfacestudio.editor;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.appcompat.widget.m;
import r5.k;

class ConfigPreview extends m {

    /* renamed from: c  reason: collision with root package name */
    public final Paint f3861c = new Paint(2);

    /* renamed from: d  reason: collision with root package name */
    public k f3862d;
    public Bitmap e;

    /* renamed from: f  reason: collision with root package name */
    public Canvas f3863f;

    public ConfigPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void onDraw(Canvas canvas) {
        if (this.e == null) {
            this.e = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            this.f3863f = new Canvas(this.e);
            float min = ((float) Math.min(getWidth(), getHeight())) / 2.0f;
            Canvas canvas2 = this.f3863f;
            Path path = new Path();
            path.addCircle(min, min, min, Path.Direction.CCW);
            canvas2.clipPath(path);
        }
        k kVar = this.f3862d;
        if (kVar != null) {
            kVar.b(this.f3863f);
        }
        canvas.drawBitmap(this.e, 0.0f, 0.0f, this.f3861c);
    }
}
