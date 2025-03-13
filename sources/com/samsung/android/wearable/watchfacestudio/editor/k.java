package com.samsung.android.wearable.watchfacestudio.editor;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import l5.a;

public final /* synthetic */ class k implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3896a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3897b;

    public /* synthetic */ k(int i8, Object obj) {
        this.f3896a = i8;
        this.f3897b = obj;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i8 = this.f3896a;
        Object obj = this.f3897b;
        switch (i8) {
            case 0:
                return ((ConstraintLayout) obj).dispatchTouchEvent(motionEvent);
            default:
                w wVar = (w) obj;
                wVar.getClass();
                int action = motionEvent.getAction();
                if (action != 0) {
                    ArrayList arrayList = wVar.f3941m0;
                    if (action == 1) {
                        MotionEvent motionEvent2 = wVar.f3943o0;
                        if (motionEvent2 != null && motionEvent2.getAction() == 0) {
                            if (((double) (motionEvent.getRawX() - wVar.f3943o0.getRawX())) >= ((double) wVar.f3946r0) * 0.2d) {
                                Log.i("DWF:EditorFragment", "onFinish by swipe back " + wVar.f3942n0.getCurrentItem());
                                r5.k kVar = wVar.f3931c0;
                                if (kVar != null) {
                                    kVar.a();
                                    wVar.f3931c0 = null;
                                }
                                wVar.f3929a0.finish();
                            }
                            wVar.f3943o0 = null;
                        }
                        wVar.f3950x0.dispatchTouchEvent(motionEvent);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((a) it.next()).setClickable(true);
                        }
                        wVar.f3944p0 = null;
                    } else if (action == 2) {
                        if (wVar.f3944p0 != null) {
                            if (Math.abs(motionEvent.getRawY() - wVar.f3944p0.getRawY()) >= Math.abs(motionEvent.getRawX() - wVar.f3944p0.getRawX())) {
                                wVar.f3950x0.dispatchTouchEvent(motionEvent);
                            }
                        }
                        int scrollState = wVar.f3942n0.getScrollState();
                        if (scrollState == 1 && scrollState != wVar.f3945q0) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                ((a) it2.next()).setClickable(false);
                            }
                        }
                    }
                } else {
                    if (((double) motionEvent.getRawX()) <= ((double) wVar.f3946r0) * 0.15d) {
                        wVar.f3943o0 = MotionEvent.obtain(motionEvent);
                    }
                    wVar.f3944p0 = MotionEvent.obtain(motionEvent);
                    wVar.f3950x0.dispatchTouchEvent(motionEvent);
                }
                wVar.f3945q0 = wVar.f3942n0.getScrollState();
                return false;
        }
    }
}
