package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import androidx.health.services.client.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import j0.x;
import java.util.HashMap;

class TimePickerView extends ConstraintLayout {

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ int f3551t = 0;

    /* renamed from: s  reason: collision with root package name */
    public final MaterialButtonToggleGroup f3552s;

    public class a implements View.OnClickListener {
        public a() {
        }

        public final void onClick(View view) {
            int i8 = TimePickerView.f3551t;
            TimePickerView.this.getClass();
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a aVar = new a();
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.f3552s = materialButtonToggleGroup;
        materialButtonToggleGroup.f3143d.add(new d(this));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        f fVar = new f(new GestureDetector(getContext(), new e(this)));
        chip.setOnTouchListener(fVar);
        chip2.setOnTouchListener(fVar);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(aVar);
        chip2.setOnClickListener(aVar);
    }

    public final void h() {
        if (this.f3552s.getVisibility() == 0) {
            b bVar = new b();
            bVar.b(this);
            int[] iArr = x.f4957a;
            char c9 = 1;
            if (x.d.d(this) == 0) {
                c9 = 2;
            }
            HashMap<Integer, b.a> hashMap = bVar.f928c;
            if (hashMap.containsKey(Integer.valueOf(R.id.material_clock_display))) {
                b.a aVar = hashMap.get(Integer.valueOf(R.id.material_clock_display));
                switch (c9) {
                    case 1:
                        b.C0011b bVar2 = aVar.f932d;
                        bVar2.f948h = -1;
                        bVar2.f946g = -1;
                        bVar2.C = -1;
                        bVar2.I = -1;
                        break;
                    case 2:
                        b.C0011b bVar3 = aVar.f932d;
                        bVar3.f952j = -1;
                        bVar3.f950i = -1;
                        bVar3.D = -1;
                        bVar3.K = -1;
                        break;
                    case 3:
                        b.C0011b bVar4 = aVar.f932d;
                        bVar4.f954l = -1;
                        bVar4.f953k = -1;
                        bVar4.E = -1;
                        bVar4.J = -1;
                        break;
                    case 4:
                        b.C0011b bVar5 = aVar.f932d;
                        bVar5.f955m = -1;
                        bVar5.f956n = -1;
                        bVar5.F = -1;
                        bVar5.L = -1;
                        break;
                    case 5:
                        aVar.f932d.f957o = -1;
                        break;
                    case 6:
                        b.C0011b bVar6 = aVar.f932d;
                        bVar6.f958p = -1;
                        bVar6.f959q = -1;
                        bVar6.H = -1;
                        bVar6.N = -1;
                        break;
                    case 7:
                        b.C0011b bVar7 = aVar.f932d;
                        bVar7.r = -1;
                        bVar7.f960s = -1;
                        bVar7.G = -1;
                        bVar7.M = -1;
                        break;
                    default:
                        throw new IllegalArgumentException("unknown constraint");
                }
            }
            bVar.a(this);
            setConstraintSet((b) null);
            requestLayout();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h();
    }

    public final void onVisibilityChanged(View view, int i8) {
        super.onVisibilityChanged(view, i8);
        if (view == this && i8 == 0) {
            h();
        }
    }
}
