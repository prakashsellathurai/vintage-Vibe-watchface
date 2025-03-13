package r4;

import android.content.Context;
import android.util.TypedValue;
import androidx.health.services.client.R;
import v4.b;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f7060a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7061b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7062c;

    /* renamed from: d  reason: collision with root package name */
    public final float f7063d;

    public a(Context context) {
        TypedValue a9 = b.a(context, R.attr.elevationOverlayEnabled);
        int i8 = 0;
        this.f7060a = (a9 == null || a9.type != 18 || a9.data == 0) ? false : true;
        TypedValue a10 = b.a(context, R.attr.elevationOverlayColor);
        this.f7061b = a10 != null ? a10.data : 0;
        TypedValue a11 = b.a(context, R.attr.colorSurface);
        this.f7062c = a11 != null ? a11.data : i8;
        this.f7063d = context.getResources().getDisplayMetrics().density;
    }
}
