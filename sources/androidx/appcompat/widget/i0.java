package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.health.services.client.R;

public final class i0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    public class a extends LinearLayout {
        public a() {
            throw null;
        }

        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public final void onMeasure(int i8, int i9) {
            super.onMeasure(i8, i9);
            throw null;
        }

        public final void setSelected(boolean z8) {
            boolean z9 = isSelected() != z8;
            super.setSelected(z8);
            if (z9 && z8) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, a1.a.f34m, R.attr.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(13, 0);
        Resources resources = context.getResources();
        if (!context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs)) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(R.dimen.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public final void onItemSelected(AdapterView<?> adapterView, View view, int i8, long j8) {
        ((a) view).getClass();
        throw null;
    }

    public final void onMeasure(int i8, int i9) {
        setFillViewport(View.MeasureSpec.getMode(i8) == 1073741824);
        throw null;
    }

    public final void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z8) {
    }

    public void setContentHeight(int i8) {
        requestLayout();
    }

    public void setTabSelected(int i8) {
        throw null;
    }
}
