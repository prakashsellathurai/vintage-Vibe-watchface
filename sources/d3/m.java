package d3;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.b0;
import androidx.fragment.app.n;
import com.bumptech.glide.b;
import com.bumptech.glide.k;
import java.util.HashSet;

public class m extends n {
    public final a Z;

    /* renamed from: a0  reason: collision with root package name */
    public final a f4028a0 = new a();

    /* renamed from: b0  reason: collision with root package name */
    public final HashSet f4029b0 = new HashSet();

    /* renamed from: c0  reason: collision with root package name */
    public m f4030c0;

    /* renamed from: d0  reason: collision with root package name */
    public k f4031d0;

    /* renamed from: e0  reason: collision with root package name */
    public n f4032e0;

    public class a implements k {
        public a() {
        }

        public final String toString() {
            return super.toString() + "{fragment=" + m.this + "}";
        }
    }

    public m() {
        a aVar = new a();
        this.Z = aVar;
    }

    public final void n(Context context, b0 b0Var) {
        m mVar = this.f4030c0;
        if (mVar != null) {
            mVar.f4029b0.remove(this);
            this.f4030c0 = null;
        }
        m e = b.b(context).f2917f.e(b0Var);
        this.f4030c0 = e;
        if (!equals(e)) {
            this.f4030c0.f4029b0.add(this);
        }
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        n nVar = this;
        while (nVar.getParentFragment() != null) {
            nVar = nVar.getParentFragment();
        }
        b0 fragmentManager = nVar.getFragmentManager();
        if (fragmentManager != null) {
            try {
                n(getContext(), fragmentManager);
            } catch (IllegalStateException e) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e);
                }
            }
        } else if (Log.isLoggable("SupportRMFragment", 5)) {
            Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
        }
    }

    public final void onDestroy() {
        this.F = true;
        this.Z.b();
        m mVar = this.f4030c0;
        if (mVar != null) {
            mVar.f4029b0.remove(this);
            this.f4030c0 = null;
        }
    }

    public final void onDetach() {
        this.F = true;
        this.f4032e0 = null;
        m mVar = this.f4030c0;
        if (mVar != null) {
            mVar.f4029b0.remove(this);
            this.f4030c0 = null;
        }
    }

    public final void onStart() {
        this.F = true;
        this.Z.d();
    }

    public final void onStop() {
        this.F = true;
        this.Z.e();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        n parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f4032e0;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }
}
