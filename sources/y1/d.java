package y1;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;

public final class d implements Callable<r<f>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8215a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LottieAnimationView f8216b;

    public d(LottieAnimationView lottieAnimationView, int i8) {
        this.f8216b = lottieAnimationView;
        this.f8215a = i8;
    }

    public final Object call() {
        LottieAnimationView lottieAnimationView = this.f8216b;
        boolean z8 = lottieAnimationView.f2897p;
        Context context = lottieAnimationView.getContext();
        int i8 = this.f8215a;
        return z8 ? g.e(context, i8, g.h(context, i8)) : g.e(context, i8, (String) null);
    }
}
