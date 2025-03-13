package com.samsung.android.wearable.watchfacestudio.editor;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class VerticalOptionView extends RecyclerView {
    public static final /* synthetic */ int K0 = 0;
    public final Handler B0 = new Handler(Looper.getMainLooper());
    public final ArrayList C0 = new ArrayList();
    public Vibrator D0 = null;
    public Timer E0 = new Timer("WatchEditor");
    public boolean F0 = false;
    public boolean G0 = false;
    public View.OnGenericMotionListener H0;
    public x I0;
    public RecyclerViewLinearLayoutManager J0;

    public class RecyclerViewLinearLayoutManager extends LinearLayoutManager {
        public RecyclerViewLinearLayoutManager() {
            super(1);
        }

        public final int s0(int i8, RecyclerView.s sVar, RecyclerView.x xVar) {
            int s0 = super.s0(i8, sVar, xVar);
            int i9 = i8 - s0;
            if (i9 != 0 && Math.abs(i9) > 10) {
                int i10 = VerticalOptionView.K0;
                VerticalOptionView.this.f0(true);
            }
            return s0;
        }
    }

    public class a extends TimerTask {
        public a() {
        }

        public final void run() {
            VerticalOptionView.this.B0.post(new f0(this));
        }
    }

    public VerticalOptionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @SuppressLint({"MissingPermission"})
    public final void f0(boolean z8) {
        Vibrator vibrator = this.D0;
        if (vibrator == null) {
            return;
        }
        if (z8) {
            if (!this.F0) {
                vibrator.vibrate(VibrationEffect.createOneShot(7, 255));
                this.F0 = true;
                this.E0.cancel();
                Timer timer = new Timer("WatchEditor");
                this.E0 = timer;
                timer.schedule(new a(), 300);
            }
        } else if (!this.G0) {
            vibrator.vibrate(VibrationEffect.createOneShot(4, 255));
        }
    }

    public List<RecyclerView.d<RecyclerView.a0>> getAdapters() {
        return this.C0;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.D0 = (Vibrator) getContext().getSystemService("vibrator");
    }
}
