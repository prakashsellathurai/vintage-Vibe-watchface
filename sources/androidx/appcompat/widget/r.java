package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;

public final class r implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TextView f817f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Typeface f818g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f819h;

    public r(TextView textView, Typeface typeface, int i8) {
        this.f817f = textView;
        this.f818g = typeface;
        this.f819h = i8;
    }

    public final void run() {
        this.f817f.setTypeface(this.f818g, this.f819h);
    }
}
