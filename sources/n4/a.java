package n4;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

public final class a extends ViewOutlineProvider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Chip f5952a;

    public a(Chip chip) {
        this.f5952a = chip;
    }

    @TargetApi(21)
    public final void getOutline(View view, Outline outline) {
        com.google.android.material.chip.a aVar = this.f5952a.f3160d;
        if (aVar != null) {
            aVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
