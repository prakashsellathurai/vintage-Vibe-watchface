package com.samsung.android.wearable.watchfacestudio.editor.tutorial;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import o5.c;
import o5.e;
import o5.f;
import o5.h;

public class TutorialView extends FrameLayout {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ int f3910k = 0;

    /* renamed from: a  reason: collision with root package name */
    public a f3911a;

    /* renamed from: b  reason: collision with root package name */
    public b f3912b;

    /* renamed from: c  reason: collision with root package name */
    public FrameLayout f3913c;

    /* renamed from: d  reason: collision with root package name */
    public FrameLayout f3914d;
    public ImageView e;

    /* renamed from: f  reason: collision with root package name */
    public ImageView f3915f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f3916g;

    /* renamed from: h  reason: collision with root package name */
    public TextView f3917h;

    /* renamed from: i  reason: collision with root package name */
    public LottieAnimationView f3918i;

    /* renamed from: j  reason: collision with root package name */
    public LottieAnimationView f3919j;

    public interface a {
    }

    public enum b {
        f3920f,
        f3921g,
        f3922h,
        f3923i;

        /* access modifiers changed from: public */
        b() {
        }
    }

    public TutorialView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a() {
        b bVar = this.f3912b;
        if (bVar == b.f3921g) {
            Log.i("DWF:TutorialView", "show tutorial 1");
            this.f3913c.setVisibility(0);
            this.e.setAlpha(0.0f);
            this.f3918i.setAlpha(0.0f);
            this.f3916g.setAlpha(0.0f);
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.e, "alpha", new float[]{0.0f, 1.0f}).setDuration(300);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f3916g, "alpha", new float[]{0.0f, 1.0f}).setDuration(300);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{duration, duration2});
            animatorSet.setStartDelay(200);
            animatorSet.start();
            animatorSet.addListener(new c(this));
            LottieAnimationView lottieAnimationView = this.f3918i;
            lottieAnimationView.f2888g.f8252c.addListener(new e(this));
        } else if (bVar == b.f3922h) {
            Log.i("DWF:TutorialView", "show tutorial 2");
            this.f3913c.setVisibility(8);
            this.f3914d.setVisibility(0);
            this.f3915f.setAlpha(0.0f);
            this.f3919j.setAlpha(0.0f);
            this.f3919j.setRotation(90.0f);
            this.f3917h.setAlpha(0.0f);
            ObjectAnimator duration3 = ObjectAnimator.ofFloat(this.f3915f, "alpha", new float[]{0.0f, 1.0f}).setDuration(300);
            ObjectAnimator duration4 = ObjectAnimator.ofFloat(this.f3917h, "alpha", new float[]{0.0f, 1.0f}).setDuration(300);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(new Animator[]{duration3, duration4});
            animatorSet2.setStartDelay(200);
            animatorSet2.start();
            animatorSet2.addListener(new f(this));
            LottieAnimationView lottieAnimationView2 = this.f3919j;
            lottieAnimationView2.f2888g.f8252c.addListener(new h(this));
        } else {
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f3914d, "alpha", new float[]{1.0f, 0.0f})});
            animatorSet3.setDuration(300);
            animatorSet3.start();
            animatorSet3.addListener(new a(this));
        }
    }

    public final boolean b() {
        b bVar = this.f3912b;
        b bVar2 = b.f3923i;
        if (bVar == bVar2) {
            return false;
        }
        b bVar3 = b.f3920f;
        b bVar4 = b.f3921g;
        if (bVar == bVar3) {
            this.f3912b = bVar4;
        } else {
            b bVar5 = b.f3922h;
            if (bVar == bVar4) {
                this.f3912b = bVar5;
            } else if (bVar == bVar5) {
                this.f3912b = bVar2;
            }
        }
        Log.i("DWF:TutorialView", "updateTutorialState, " + this.f3912b);
        return true;
    }

    public b getViState() {
        return this.f3912b;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        Log.i("DWF:TutorialView", "onTouchEvent");
        if (motionEvent.getAction() == 1 && b()) {
            a();
        }
        return true;
    }

    public void setOnTutorialFinished(a aVar) {
        this.f3911a = aVar;
    }
}
