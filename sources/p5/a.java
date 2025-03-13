package p5;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.text.TextUtils;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.health.services.client.R;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f6328a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f6329b;

    /* renamed from: c  reason: collision with root package name */
    public final AnimatorSet f6330c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6331d;
    public int e;

    public a(FrameLayout frameLayout) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f6330c = animatorSet;
        TextView textView = (TextView) frameLayout.findViewById(R.id.guide);
        this.f6328a = textView;
        TextView textView2 = (TextView) frameLayout.findViewById(R.id.guide_prev);
        this.f6329b = textView2;
        LinearLayout linearLayout = (LinearLayout) frameLayout.findViewById(R.id.guide_layout);
        linearLayout.measure(0, 0);
        this.f6331d = Math.max(linearLayout.getMeasuredWidth(), linearLayout.getWidth());
        animatorSet.setDuration(270);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(270);
        layoutTransition.enableTransitionType(4);
        linearLayout.setLayoutTransition(layoutTransition);
        textView.setSelected(true);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textView2.setSelected(true);
        textView2.setSingleLine();
        textView2.setEllipsize(TextUtils.TruncateAt.MARQUEE);
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i8) {
        int i9 = i8;
        int i10 = (i9 - this.e) * this.f6331d;
        TextView textView = this.f6329b;
        TextView textView2 = this.f6328a;
        if (i10 != 0) {
            AnimatorSet animatorSet = this.f6330c;
            if (animatorSet.isRunning()) {
                animatorSet.end();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, "translationX", new float[]{(float) i10, 0.0f});
            ofFloat.setStartDelay(70);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView2, "alpha", new float[]{0.0f, 1.0f});
            ofFloat2.setStartDelay(70);
            animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView, "translationX", new float[]{0.0f, (float) (-i10)}), ObjectAnimator.ofFloat(textView, "alpha", new float[]{1.0f, 0.0f})});
            animatorSet.setInterpolator(new PathInterpolator(0.17f, 0.17f, 0.83f, 0.83f));
            animatorSet.start();
        }
        this.e = i9;
        textView.setText(textView2.getText());
        textView.setContentDescription(textView2.getContentDescription());
        textView2.setText(charSequence);
        textView2.setContentDescription(charSequence2);
    }
}
