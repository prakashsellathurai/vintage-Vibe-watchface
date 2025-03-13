package j4;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public final class b extends FloatingActionButton.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4984a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f4985b;

    public class a extends FloatingActionButton.a {
        public a() {
        }

        public final void b() {
            BottomAppBar bottomAppBar = b.this.f4985b;
            int i8 = BottomAppBar.T;
            bottomAppBar.getClass();
        }
    }

    public b(BottomAppBar bottomAppBar, int i8) {
        this.f4985b = bottomAppBar;
        this.f4984a = i8;
    }

    public final void a(FloatingActionButton floatingActionButton) {
        floatingActionButton.setTranslationX(this.f4985b.t(this.f4984a));
        floatingActionButton.k(new a(), true);
    }
}
