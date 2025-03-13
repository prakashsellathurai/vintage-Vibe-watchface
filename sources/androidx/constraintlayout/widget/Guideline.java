package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Guideline extends View {
    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public final void draw(Canvas canvas) {
    }

    public final void onMeasure(int i8, int i9) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i8) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        aVar.f877a = i8;
        setLayoutParams(aVar);
    }

    public void setGuidelineEnd(int i8) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        aVar.f879b = i8;
        setLayoutParams(aVar);
    }

    public void setGuidelinePercent(float f9) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        aVar.f881c = f9;
        setLayoutParams(aVar);
    }

    public void setVisibility(int i8) {
    }
}
