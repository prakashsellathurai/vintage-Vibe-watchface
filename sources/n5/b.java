package n5;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import androidx.health.services.client.R;

public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public final int f5953a = R.drawable.customize_common_select_color;

    /* renamed from: b  reason: collision with root package name */
    public final String f5954b;

    public b(String str) {
        this.f5954b = str;
    }

    public final BitmapDrawable a(Context context) {
        Resources resources = context.getResources();
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, this.f5953a);
        Bitmap createBitmap = Bitmap.createBitmap(decodeResource.getWidth(), decodeResource.getHeight(), decodeResource.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(Color.parseColor(this.f5954b), PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(decodeResource, new Matrix(), paint);
        canvas.drawBitmap(BitmapFactory.decodeResource(resources, R.drawable.customize_common_select_color_line), 0.0f, 0.0f, (Paint) null);
        return new BitmapDrawable(resources, createBitmap);
    }
}
