package c5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

public final class l extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2683a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TextView f2684b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f2685c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TextView f2686d;
    public final /* synthetic */ m e;

    public l(m mVar, int i8, TextView textView, int i9, TextView textView2) {
        this.e = mVar;
        this.f2683a = i8;
        this.f2684b = textView;
        this.f2685c = i9;
        this.f2686d = textView2;
    }

    public final void onAnimationEnd(Animator animator) {
        TextView textView;
        m mVar = this.e;
        mVar.f2693h = this.f2683a;
        mVar.f2691f = null;
        TextView textView2 = this.f2684b;
        if (textView2 != null) {
            textView2.setVisibility(4);
            if (this.f2685c == 1 && (textView = mVar.f2697l) != null) {
                textView.setText((CharSequence) null);
            }
        }
        TextView textView3 = this.f2686d;
        if (textView3 != null) {
            textView3.setTranslationY(0.0f);
            textView3.setAlpha(1.0f);
        }
    }

    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f2686d;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }
}
