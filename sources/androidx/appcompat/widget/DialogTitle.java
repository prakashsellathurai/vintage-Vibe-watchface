package androidx.appcompat.widget;

import a1.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;

public class DialogTitle extends s {
    public DialogTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void onMeasure(int i8, int i9) {
        int lineCount;
        super.onMeasure(i8, i9);
        Layout layout = getLayout();
        if (layout != null && (lineCount = layout.getLineCount()) > 0 && layout.getEllipsisCount(lineCount - 1) > 0) {
            setSingleLine(false);
            setMaxLines(2);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, a.F, 16842817, 16973892);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                setTextSize(0, (float) dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            super.onMeasure(i8, i9);
        }
    }
}
