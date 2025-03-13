package g4;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class d<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public e f4616a;

    /* renamed from: b  reason: collision with root package name */
    public int f4617b = 0;

    public d() {
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean h(CoordinatorLayout coordinatorLayout, V v8, int i8) {
        t(coordinatorLayout, v8, i8);
        if (this.f4616a == null) {
            this.f4616a = new e(v8);
        }
        e eVar = this.f4616a;
        View view = eVar.f4618a;
        eVar.f4619b = view.getTop();
        eVar.f4620c = view.getLeft();
        this.f4616a.a();
        int i9 = this.f4617b;
        if (i9 == 0) {
            return true;
        }
        e eVar2 = this.f4616a;
        if (eVar2.f4621d != i9) {
            eVar2.f4621d = i9;
            eVar2.a();
        }
        this.f4617b = 0;
        return true;
    }

    public final int s() {
        e eVar = this.f4616a;
        if (eVar != null) {
            return eVar.f4621d;
        }
        return 0;
    }

    public void t(CoordinatorLayout coordinatorLayout, V v8, int i8) {
        coordinatorLayout.q(v8, i8);
    }
}
