package k4;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import k0.g;

public final class c implements g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5175a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f5176b;

    public c(BottomSheetBehavior bottomSheetBehavior, int i8) {
        this.f5176b = bottomSheetBehavior;
        this.f5175a = i8;
    }

    public final boolean a(View view) {
        this.f5176b.B(this.f5175a);
        return true;
    }
}
