package androidx.viewpager2.adapter;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.a0;
import androidx.fragment.app.b0;
import androidx.fragment.app.c0;
import androidx.fragment.app.h0;
import androidx.fragment.app.n;
import androidx.fragment.app.s;
import androidx.health.services.client.R;
import androidx.lifecycle.l0;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import androidx.lifecycle.y;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.samsung.android.wearable.watchfacestudio.editor.EditorActivity;
import com.samsung.android.wearable.watchfacestudio.editor.e;
import com.samsung.android.wearable.watchfacestudio.editor.f;
import com.samsung.android.wearable.watchfacestudio.editor.t;
import com.samsung.android.wearable.watchfacestudio.editor.w;
import j0.x;
import java.util.ArrayList;
import k3.j;
import p.b;
import p.d;

public abstract class FragmentStateAdapter extends RecyclerView.d<f> implements g {

    /* renamed from: d  reason: collision with root package name */
    public final m f1961d;
    public final b0 e;

    /* renamed from: f  reason: collision with root package name */
    public final d<n> f1962f = new d<>();

    /* renamed from: g  reason: collision with root package name */
    public final d<n.j> f1963g = new d<>();

    /* renamed from: h  reason: collision with root package name */
    public final d<Integer> f1964h = new d<>();

    /* renamed from: i  reason: collision with root package name */
    public b f1965i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1966j = false;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1967k = false;

    public static abstract class a extends RecyclerView.f {
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public d f1973a;

        /* renamed from: b  reason: collision with root package name */
        public e f1974b;

        /* renamed from: c  reason: collision with root package name */
        public p f1975c;

        /* renamed from: d  reason: collision with root package name */
        public ViewPager2 f1976d;
        public long e = -1;

        public b() {
        }

        public static ViewPager2 a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        public final void b(boolean z8) {
            int currentItem;
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            if (!fragmentStateAdapter.e.L() && this.f1976d.getScrollState() == 0) {
                d<n> dVar = fragmentStateAdapter.f1962f;
                if (!(dVar.h() == 0) && fragmentStateAdapter.c() != 0 && (currentItem = this.f1976d.getCurrentItem()) < fragmentStateAdapter.c()) {
                    long j8 = (long) currentItem;
                    if (j8 != this.e || z8) {
                        n nVar = null;
                        n nVar2 = (n) dVar.d(j8, (Long) null);
                        if (nVar2 != null && nVar2.isAdded()) {
                            this.e = j8;
                            b0 b0Var = fragmentStateAdapter.e;
                            b0Var.getClass();
                            androidx.fragment.app.a aVar = new androidx.fragment.app.a(b0Var);
                            for (int i8 = 0; i8 < dVar.h(); i8++) {
                                long e4 = dVar.e(i8);
                                n i9 = dVar.i(i8);
                                if (i9.isAdded()) {
                                    if (e4 != this.e) {
                                        aVar.k(i9, m.b.f1494i);
                                    } else {
                                        nVar = i9;
                                    }
                                    i9.setMenuVisibility(e4 == this.e);
                                }
                            }
                            if (nVar != null) {
                                aVar.k(nVar, m.b.f1495j);
                            }
                            if (!aVar.f1192a.isEmpty()) {
                                aVar.e();
                            }
                        }
                    }
                }
            }
        }
    }

    public FragmentStateAdapter(EditorActivity editorActivity) {
        c0 h8 = editorActivity.h();
        this.e = h8;
        this.f1961d = editorActivity.f244d;
        if (!this.f1649a.a()) {
            this.f1650b = true;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public static void l(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        } else if (view.getParent() != frameLayout) {
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
        }
    }

    public final Bundle a() {
        d<n> dVar = this.f1962f;
        int h8 = dVar.h();
        d<n.j> dVar2 = this.f1963g;
        Bundle bundle = new Bundle(h8 + dVar2.h());
        for (int i8 = 0; i8 < dVar.h(); i8++) {
            long e4 = dVar.e(i8);
            n nVar = (n) dVar.d(e4, (Long) null);
            if (nVar != null && nVar.isAdded()) {
                String str = "f#" + e4;
                b0 b0Var = this.e;
                b0Var.getClass();
                if (nVar.f1270s == b0Var) {
                    bundle.putString(str, nVar.f1258f);
                } else {
                    b0Var.a0(new IllegalStateException("Fragment " + nVar + " is not currently in the FragmentManager"));
                    throw null;
                }
            }
        }
        for (int i9 = 0; i9 < dVar2.h(); i9++) {
            long e9 = dVar2.e(i9);
            if (m(e9)) {
                bundle.putParcelable("s#" + e9, (Parcelable) dVar2.d(e9, (Long) null));
            }
        }
        return bundle;
    }

    public final void b(Parcelable parcelable) {
        d<n.j> dVar = this.f1963g;
        boolean z8 = false;
        if (dVar.h() == 0) {
            d<n> dVar2 = this.f1962f;
            if (dVar2.h() == 0) {
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(getClass().getClassLoader());
                }
                for (String next : bundle.keySet()) {
                    if (next.startsWith("f#") && next.length() > 2) {
                        long parseLong = Long.parseLong(next.substring(2));
                        b0 b0Var = this.e;
                        b0Var.getClass();
                        String string = bundle.getString(next);
                        n nVar = null;
                        if (string != null) {
                            n B = b0Var.B(string);
                            if (B != null) {
                                nVar = B;
                            } else {
                                b0Var.a0(new IllegalStateException("Fragment no longer exists for key " + next + ": unique id " + string));
                                throw null;
                            }
                        }
                        dVar2.f(parseLong, nVar);
                    } else {
                        if (next.startsWith("s#") && next.length() > 2) {
                            long parseLong2 = Long.parseLong(next.substring(2));
                            n.j jVar = (n.j) bundle.getParcelable(next);
                            if (m(parseLong2)) {
                                dVar.f(parseLong2, jVar);
                            }
                        } else {
                            throw new IllegalArgumentException("Unexpected key in savedState: ".concat(next));
                        }
                    }
                }
                if (dVar2.h() == 0) {
                    z8 = true;
                }
                if (!z8) {
                    this.f1967k = true;
                    this.f1966j = true;
                    n();
                    final Handler handler = new Handler(Looper.getMainLooper());
                    final c cVar = new c(this);
                    this.f1961d.a(new p() {
                        public final void c(r rVar, m.a aVar) {
                            if (aVar == m.a.ON_DESTROY) {
                                handler.removeCallbacks(cVar);
                                rVar.getLifecycle().b(this);
                            }
                        }
                    });
                    handler.postDelayed(cVar, 10000);
                    return;
                }
                return;
            }
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    public final long d(int i8) {
        return (long) i8;
    }

    public final void e(RecyclerView recyclerView) {
        if (this.f1965i == null) {
            b bVar = new b();
            this.f1965i = bVar;
            bVar.f1976d = b.a(recyclerView);
            d dVar = new d(bVar);
            bVar.f1973a = dVar;
            bVar.f1976d.f1990c.f2019a.add(dVar);
            e eVar = new e(bVar);
            bVar.f1974b = eVar;
            this.f1649a.registerObserver(eVar);
            FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3 fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3 = new FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3(bVar);
            bVar.f1975c = fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3;
            this.f1961d.a(fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3);
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void f(RecyclerView.a0 a0Var, int i8) {
        f fVar = (f) a0Var;
        long j8 = fVar.e;
        FrameLayout frameLayout = (FrameLayout) fVar.f1631a;
        int id = frameLayout.getId();
        Long o8 = o(id);
        d<Integer> dVar = this.f1964h;
        if (!(o8 == null || o8.longValue() == j8)) {
            q(o8.longValue());
            dVar.g(o8.longValue());
        }
        dVar.f(j8, Integer.valueOf(id));
        long j9 = (long) i8;
        d<n> dVar2 = this.f1962f;
        if (dVar2.f6221f) {
            dVar2.c();
        }
        if (!(j.i(dVar2.f6222g, dVar2.f6224i, j9) >= 0)) {
            w wVar = ((t) this).f3909l;
            s activity = wVar.getActivity();
            if (activity != null) {
                int size = wVar.f3940l0.f7637a.size();
                y<View> yVar = ((f) new l0(activity).a(f.class)).f3888d;
                if (size == i8) {
                    EditorActivity editorActivity = wVar.f3929a0;
                    ArrayList arrayList = wVar.f3941m0;
                    FrameLayout frameLayout2 = new FrameLayout(editorActivity);
                    arrayList.forEach(new e(0, frameLayout2));
                    yVar.i(frameLayout2);
                } else {
                    EditorActivity editorActivity2 = wVar.f3929a0;
                    ImageView imageView = new ImageView(editorActivity2);
                    imageView.setImageDrawable(editorActivity2.getDrawable(R.drawable.focus_dial_01));
                    imageView.setColorFilter(editorActivity2.getResources().getColor(R.color.colorPrimary, (Resources.Theme) null), PorterDuff.Mode.MULTIPLY);
                    yVar.i(imageView);
                }
            }
            com.samsung.android.wearable.watchfacestudio.editor.d dVar3 = new com.samsung.android.wearable.watchfacestudio.editor.d();
            dVar3.setInitialSavedState((n.j) this.f1963g.d(j9, (Long) null));
            dVar2.f(j9, dVar3);
        }
        int[] iArr = x.f4957a;
        if (x.f.b(frameLayout)) {
            if (frameLayout.getParent() == null) {
                frameLayout.addOnLayoutChangeListener(new a(this, frameLayout, fVar));
            } else {
                throw new IllegalStateException("Design assumption violated.");
            }
        }
        n();
    }

    public final RecyclerView.a0 g(ViewGroup viewGroup) {
        int i8 = f.f1987u;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        int[] iArr = x.f4957a;
        frameLayout.setId(x.d.a());
        frameLayout.setSaveEnabled(false);
        return new f(frameLayout);
    }

    public final void h(RecyclerView recyclerView) {
        b bVar = this.f1965i;
        bVar.getClass();
        ViewPager2 a9 = b.a(recyclerView);
        a9.f1990c.f2019a.remove(bVar.f1973a);
        e eVar = bVar.f1974b;
        FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
        fragmentStateAdapter.f1649a.unregisterObserver(eVar);
        fragmentStateAdapter.f1961d.b(bVar.f1975c);
        bVar.f1976d = null;
        this.f1965i = null;
    }

    public final /* bridge */ /* synthetic */ boolean i(RecyclerView.a0 a0Var) {
        f fVar = (f) a0Var;
        return true;
    }

    public final void j(RecyclerView.a0 a0Var) {
        p((f) a0Var);
        n();
    }

    public final void k(RecyclerView.a0 a0Var) {
        Long o8 = o(((FrameLayout) ((f) a0Var).f1631a).getId());
        if (o8 != null) {
            q(o8.longValue());
            this.f1964h.g(o8.longValue());
        }
    }

    public final boolean m(long j8) {
        return j8 >= 0 && j8 < ((long) c());
    }

    public final void n() {
        d<n> dVar;
        d<Integer> dVar2;
        n nVar;
        View view;
        if (this.f1967k && !this.e.L()) {
            p.b bVar = new p.b(0);
            int i8 = 0;
            while (true) {
                dVar = this.f1962f;
                int h8 = dVar.h();
                dVar2 = this.f1964h;
                if (i8 >= h8) {
                    break;
                }
                long e4 = dVar.e(i8);
                if (!m(e4)) {
                    bVar.add(Long.valueOf(e4));
                    dVar2.g(e4);
                }
                i8++;
            }
            if (!this.f1966j) {
                this.f1967k = false;
                for (int i9 = 0; i9 < dVar.h(); i9++) {
                    long e9 = dVar.e(i9);
                    if (dVar2.f6221f) {
                        dVar2.c();
                    }
                    boolean z8 = true;
                    if (!(j.i(dVar2.f6222g, dVar2.f6224i, e9) >= 0) && ((nVar = (n) dVar.d(e9, (Long) null)) == null || (view = nVar.getView()) == null || view.getParent() == null)) {
                        z8 = false;
                    }
                    if (!z8) {
                        bVar.add(Long.valueOf(e9));
                    }
                }
            }
            b.a aVar = new b.a();
            while (aVar.hasNext()) {
                q(((Long) aVar.next()).longValue());
            }
        }
    }

    public final Long o(int i8) {
        Long l8 = null;
        int i9 = 0;
        while (true) {
            d<Integer> dVar = this.f1964h;
            if (i9 >= dVar.h()) {
                return l8;
            }
            if (dVar.i(i9).intValue() == i8) {
                if (l8 == null) {
                    l8 = Long.valueOf(dVar.e(i9));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
            i9++;
        }
    }

    public final void p(final f fVar) {
        n nVar = (n) this.f1962f.d(fVar.e, (Long) null);
        if (nVar != null) {
            FrameLayout frameLayout = (FrameLayout) fVar.f1631a;
            View view = nVar.getView();
            if (nVar.isAdded() || view == null) {
                boolean isAdded = nVar.isAdded();
                b0 b0Var = this.e;
                if (isAdded && view == null) {
                    b0Var.f1111l.f1084a.add(new a0.a(new b(this, nVar, frameLayout)));
                } else if (!nVar.isAdded() || view.getParent() == null) {
                    if (nVar.isAdded()) {
                        l(view, frameLayout);
                    } else if (!b0Var.L()) {
                        b0Var.f1111l.f1084a.add(new a0.a(new b(this, nVar, frameLayout)));
                        b0Var.getClass();
                        androidx.fragment.app.a aVar = new androidx.fragment.app.a(b0Var);
                        aVar.f(0, nVar, "f" + fVar.e, 1);
                        aVar.k(nVar, m.b.f1494i);
                        aVar.e();
                        this.f1965i.b(false);
                    } else if (!b0Var.B) {
                        this.f1961d.a(new p() {
                            public final void c(r rVar, m.a aVar) {
                                FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
                                if (!fragmentStateAdapter.e.L()) {
                                    rVar.getLifecycle().b(this);
                                    f fVar = fVar;
                                    int[] iArr = x.f4957a;
                                    if (x.f.b((FrameLayout) fVar.f1631a)) {
                                        fragmentStateAdapter.p(fVar);
                                    }
                                }
                            }
                        });
                    }
                } else if (view.getParent() != frameLayout) {
                    l(view, frameLayout);
                }
            } else {
                throw new IllegalStateException("Design assumption violated.");
            }
        } else {
            throw new IllegalStateException("Design assumption violated.");
        }
    }

    public final void q(long j8) {
        Bundle o8;
        ViewParent parent;
        d<n> dVar = this.f1962f;
        n.j jVar = null;
        n nVar = (n) dVar.d(j8, (Long) null);
        if (nVar != null) {
            if (!(nVar.getView() == null || (parent = nVar.getView().getParent()) == null)) {
                ((FrameLayout) parent).removeAllViews();
            }
            boolean m8 = m(j8);
            d<n.j> dVar2 = this.f1963g;
            if (!m8) {
                dVar2.g(j8);
            }
            if (!nVar.isAdded()) {
                dVar.g(j8);
                return;
            }
            b0 b0Var = this.e;
            if (b0Var.L()) {
                this.f1967k = true;
                return;
            }
            if (nVar.isAdded() && m(j8)) {
                b0Var.getClass();
                h0 h8 = b0Var.f1103c.h(nVar.f1258f);
                if (h8 != null) {
                    n nVar2 = h8.f1182c;
                    if (nVar2.equals(nVar)) {
                        if (nVar2.f1254a > -1 && (o8 = h8.o()) != null) {
                            jVar = new n.j(o8);
                        }
                        dVar2.f(j8, jVar);
                    }
                }
                b0Var.a0(new IllegalStateException("Fragment " + nVar + " is not currently in the FragmentManager"));
                throw null;
            }
            b0Var.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(b0Var);
            aVar.j(nVar);
            aVar.e();
            dVar.g(j8);
        }
    }
}
