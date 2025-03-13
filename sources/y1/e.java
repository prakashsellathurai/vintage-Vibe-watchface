package y1;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import java.util.HashMap;
import java.util.concurrent.Callable;

public final class e implements Callable<r<f>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f8217a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LottieAnimationView f8218b;

    public e(LottieAnimationView lottieAnimationView, String str) {
        this.f8218b = lottieAnimationView;
        this.f8217a = str;
    }

    public final Object call() {
        LottieAnimationView lottieAnimationView = this.f8218b;
        boolean z8 = lottieAnimationView.f2897p;
        Context context = lottieAnimationView.getContext();
        String str = this.f8217a;
        if (!z8) {
            return g.b(context, str, (String) null);
        }
        HashMap hashMap = g.f8233a;
        return g.b(context, str, "asset_" + str);
    }
}
