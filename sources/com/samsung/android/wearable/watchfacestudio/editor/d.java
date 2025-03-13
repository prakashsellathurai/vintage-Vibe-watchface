package com.samsung.android.wearable.watchfacestudio.editor;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.n;
import androidx.health.services.client.R;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.l0;

public class d extends n {
    public View Z;

    /* renamed from: a0  reason: collision with root package name */
    public ValueAnimator f3881a0;

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = (ConstraintLayout) layoutInflater.inflate(R.layout.configuration_layout, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) constraintLayout.findViewById(R.id.complication_layout);
        Object obj = ((f) new l0(requireActivity()).a(f.class)).f3888d.e;
        if (obj == LiveData.f1404k) {
            obj = null;
        }
        View view = (View) obj;
        this.Z = view;
        if (view == null) {
            Log.e("DWF:ConfigurationFragment", "fail to create frameLayout, view from viewModel is null");
            return constraintLayout;
        }
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        if (viewGroup2 != null) {
            viewGroup2.removeView(this.Z);
        }
        frameLayout.addView(this.Z);
        this.Z.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f3881a0 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        PathInterpolator pathInterpolator = new PathInterpolator(0.17f, 0.17f, 0.83f, 0.83f);
        this.f3881a0.setDuration(1000);
        this.f3881a0.setRepeatCount(-1);
        this.f3881a0.setInterpolator(pathInterpolator);
        this.f3881a0.setRepeatMode(2);
        this.f3881a0.start();
        this.f3881a0.addUpdateListener(new c(this));
        return constraintLayout;
    }

    public final void onDestroy() {
        this.F = true;
        this.f3881a0.cancel();
    }

    public final void onPause() {
        this.F = true;
        this.Z.setAlpha(1.0f);
    }

    public final void onResume() {
        this.F = true;
        this.f3881a0.start();
    }
}
