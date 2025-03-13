package n5;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.health.services.client.R;

public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f5955a;

    public c(Drawable drawable) {
        this.f5955a = drawable;
    }

    public final BitmapDrawable a(Context context) {
        Resources resources = context.getResources();
        Drawable drawable = this.f5955a;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int ceil = (int) Math.ceil((double) (((float) intrinsicWidth) * 0.05f));
        drawable.setBounds(ceil, ceil, intrinsicWidth - ceil, intrinsicHeight - ceil);
        drawable.setFilterBitmap(true);
        drawable.draw(canvas);
        canvas.drawBitmap(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(resources, R.drawable.customize_common_select_color_line), intrinsicWidth, intrinsicHeight, true), 0.0f, 0.0f, (Paint) null);
        return new BitmapDrawable(resources, createBitmap);
    }
}
