package com.samsung.android.wearable.watchfacestudio.editor.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import androidx.health.services.client.R;
import java.util.ArrayList;

public class ColorChip extends ConstraintLayout {

    /* renamed from: s  reason: collision with root package name */
    public int f3952s = 4;

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList<n5.a> f3953t = new ArrayList<>();

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList<a> f3954u = new ArrayList<>();

    /* renamed from: v  reason: collision with root package name */
    public final b f3955v = new b();
    public final View w;

    /* renamed from: x  reason: collision with root package name */
    public final ConstraintLayout f3956x;
    public int y = -1;

    /* renamed from: z  reason: collision with root package name */
    public final int f3957z;

    public final class a {

        /* renamed from: a  reason: collision with root package name */
        public final ImageView f3958a;

        /* renamed from: b  reason: collision with root package name */
        public int f3959b;

        /* renamed from: c  reason: collision with root package name */
        public float f3960c;

        /* renamed from: d  reason: collision with root package name */
        public final float f3961d;
        public float e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f3962f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f3963g = 1.0f;

        public a(ColorChip colorChip, Context context, Drawable drawable, float f9) {
            this.f3961d = f9;
            ImageView imageView = new ImageView(context);
            this.f3958a = imageView;
            imageView.setImageDrawable(drawable);
            imageView.setAdjustViewBounds(true);
            imageView.setId(View.generateViewId());
            imageView.setScaleX(this.e);
            imageView.setScaleY(this.f3962f);
            imageView.setAlpha(this.f3963g);
            imageView.setMaxWidth((int) colorChip.getResources().getDimension(R.dimen.colorchip_width));
            imageView.setMaxHeight((int) colorChip.getResources().getDimension(R.dimen.colorchip_height));
        }
    }

    public ColorChip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, R.layout.color_chip_layout, this);
        this.w = findViewById(R.id.ColorChipCenter);
        this.f3956x = (ConstraintLayout) findViewById(R.id.ColorChipRootConstraint);
        this.f3957z = ((getResources().getDisplayMetrics().widthPixels / 2) - getResources().getDimensionPixelSize(R.dimen.colorchip_dot_size)) - getResources().getDimensionPixelSize(R.dimen.colorchip_outside_margin);
    }

    public float getRotation() {
        return this.f3956x.getRotation();
    }

    public final void h(int i8, int i9, float f9, float f10, float f11, float f12) {
        a aVar = new a(this, getContext(), this.f3953t.get(i9).a(getContext()), f9);
        aVar.f3959b = i9;
        aVar.f3960c = ((float) Math.round(f11 * 100.0f)) / 100.0f;
        ConstraintLayout constraintLayout = this.f3956x;
        float abs = Math.abs(f9 - constraintLayout.getRotation());
        Math.round(abs * 0.142f * 100.0f);
        float f13 = 1.0f - ((abs * 0.1f) * 0.142f);
        aVar.e = f13;
        ImageView imageView = aVar.f3958a;
        imageView.setScaleX(f13);
        aVar.f3962f = f13;
        imageView.setScaleY(f13);
        imageView.setRotation(f12);
        aVar.f3963g = f10;
        imageView.setAlpha(f10);
        constraintLayout.addView(imageView);
        b bVar = this.f3955v;
        bVar.b(constraintLayout);
        bVar.c(aVar.f3960c, imageView.getId(), this.w.getId(), this.f3957z);
        bVar.a(constraintLayout);
        constraintLayout.setConstraintSet((b) null);
        constraintLayout.requestLayout();
        ArrayList<a> arrayList = this.f3954u;
        if (i8 >= arrayList.size()) {
            arrayList.add(aVar);
        } else {
            arrayList.add(i8, aVar);
        }
    }

    public final a i(int i8) {
        ArrayList<a> arrayList;
        a aVar;
        int i9 = 0;
        while (true) {
            arrayList = this.f3954u;
            if (i9 >= arrayList.size()) {
                aVar = null;
                break;
            }
            aVar = arrayList.get(i9);
            if (aVar.f3959b == i8) {
                break;
            }
            i9++;
        }
        if (aVar == null) {
            Log.e("DWF:ColorChip", "item is null for pos " + i8 + "!! mItem.size():" + arrayList.size());
        }
        return aVar;
    }
}
