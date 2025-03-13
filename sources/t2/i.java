package t2;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final int f7478a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7479b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7480c;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Context f7481a;

        /* renamed from: b  reason: collision with root package name */
        public final ActivityManager f7482b;

        /* renamed from: c  reason: collision with root package name */
        public final b f7483c;

        /* renamed from: d  reason: collision with root package name */
        public final float f7484d = ((float) 1);

        public a(Context context) {
            this.f7481a = context;
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            this.f7482b = activityManager;
            this.f7483c = new b(context.getResources().getDisplayMetrics());
            if (activityManager.isLowRamDevice()) {
                this.f7484d = 0.0f;
            }
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final DisplayMetrics f7485a;

        public b(DisplayMetrics displayMetrics) {
            this.f7485a = displayMetrics;
        }
    }

    public i(a aVar) {
        Context context = aVar.f7481a;
        ActivityManager activityManager = aVar.f7482b;
        int i8 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        this.f7480c = i8;
        int round = Math.round(((float) (activityManager.getMemoryClass() * 1024 * 1024)) * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = aVar.f7483c.f7485a;
        float f9 = (float) (displayMetrics.widthPixels * displayMetrics.heightPixels * 4);
        float f10 = aVar.f7484d;
        int round2 = Math.round(f9 * f10);
        int round3 = Math.round(f9 * 2.0f);
        int i9 = round - i8;
        if (round3 + round2 <= i9) {
            this.f7479b = round3;
            this.f7478a = round2;
        } else {
            float f11 = ((float) i9) / (f10 + 2.0f);
            this.f7479b = Math.round(2.0f * f11);
            this.f7478a = Math.round(f11 * f10);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            Formatter.formatFileSize(context, (long) this.f7479b);
            Formatter.formatFileSize(context, (long) this.f7478a);
            Formatter.formatFileSize(context, (long) i8);
            Formatter.formatFileSize(context, (long) round);
            activityManager.getMemoryClass();
            activityManager.isLowRamDevice();
        }
    }
}
