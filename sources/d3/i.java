package d3;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import com.bumptech.glide.b;
import com.bumptech.glide.k;
import java.util.HashSet;

@Deprecated
public final class i extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public final a f4012a;

    /* renamed from: b  reason: collision with root package name */
    public final a f4013b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final HashSet f4014c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    public k f4015d;
    public i e;

    /* renamed from: f  reason: collision with root package name */
    public Fragment f4016f;

    public class a implements k {
        public a() {
        }

        public final String toString() {
            return super.toString() + "{fragment=" + i.this + "}";
        }
    }

    public i() {
        a aVar = new a();
        this.f4012a = aVar;
    }

    public final void a(Activity activity) {
        i iVar = this.e;
        if (iVar != null) {
            iVar.f4014c.remove(this);
            this.e = null;
        }
        j jVar = b.b(activity).f2917f;
        jVar.getClass();
        i d9 = jVar.d(activity.getFragmentManager());
        this.e = d9;
        if (!equals(d9)) {
            this.e.f4014c.add(this);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (IllegalStateException e4) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e4);
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f4012a.b();
        i iVar = this.e;
        if (iVar != null) {
            iVar.f4014c.remove(this);
            this.e = null;
        }
    }

    public final void onDetach() {
        super.onDetach();
        i iVar = this.e;
        if (iVar != null) {
            iVar.f4014c.remove(this);
            this.e = null;
        }
    }

    public final void onStart() {
        super.onStart();
        this.f4012a.d();
    }

    public final void onStop() {
        super.onStop();
        this.f4012a.e();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f4016f;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }
}
