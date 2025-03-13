package j1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class c implements RecyclerView.n {
    public final void a(View view) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        if (mVar.width != -1 || mVar.height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }

    public final void b() {
    }
}
