package androidx.appcompat.app;

import a1.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;

public class AlertController$RecycleListView extends ListView {
    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.C);
        obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
