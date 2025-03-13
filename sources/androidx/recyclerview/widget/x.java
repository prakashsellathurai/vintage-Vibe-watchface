package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import k0.c;
import k0.d;

public final class x extends j0.a {

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f1912d;
    public final a e;

    public static class a extends j0.a {

        /* renamed from: d  reason: collision with root package name */
        public final x f1913d;
        public final WeakHashMap e = new WeakHashMap();

        public a(x xVar) {
            this.f1913d = xVar;
        }

        public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
            j0.a aVar = (j0.a) this.e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        public final d b(View view) {
            j0.a aVar = (j0.a) this.e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            j0.a aVar = (j0.a) this.e.get(view);
            if (aVar != null) {
                aVar.c(view, accessibilityEvent);
            } else {
                super.c(view, accessibilityEvent);
            }
        }

        public final void d(View view, c cVar) {
            x xVar = this.f1913d;
            RecyclerView recyclerView = xVar.f1912d;
            if (!(!recyclerView.f1620t || recyclerView.B || recyclerView.f1591d.g())) {
                RecyclerView recyclerView2 = xVar.f1912d;
                if (recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().X(view, cVar);
                    j0.a aVar = (j0.a) this.e.get(view);
                    if (aVar != null) {
                        aVar.d(view, cVar);
                        return;
                    }
                }
            }
            this.f4917a.onInitializeAccessibilityNodeInfo(view, cVar.f5085a);
        }

        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            j0.a aVar = (j0.a) this.e.get(view);
            if (aVar != null) {
                aVar.e(view, accessibilityEvent);
            } else {
                super.e(view, accessibilityEvent);
            }
        }

        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            j0.a aVar = (j0.a) this.e.get(viewGroup);
            return aVar != null ? aVar.f(viewGroup, view, accessibilityEvent) : super.f(viewGroup, view, accessibilityEvent);
        }

        public final boolean g(View view, int i8, Bundle bundle) {
            x xVar = this.f1913d;
            RecyclerView recyclerView = xVar.f1912d;
            if (!(!recyclerView.f1620t || recyclerView.B || recyclerView.f1591d.g())) {
                RecyclerView recyclerView2 = xVar.f1912d;
                if (recyclerView2.getLayoutManager() != null) {
                    j0.a aVar = (j0.a) this.e.get(view);
                    if (aVar != null) {
                        if (aVar.g(view, i8, bundle)) {
                            return true;
                        }
                    } else if (super.g(view, i8, bundle)) {
                        return true;
                    }
                    RecyclerView.s sVar = recyclerView2.getLayoutManager().f1661b.f1587b;
                    return false;
                }
            }
            return super.g(view, i8, bundle);
        }

        public final void h(View view, int i8) {
            j0.a aVar = (j0.a) this.e.get(view);
            if (aVar != null) {
                aVar.h(view, i8);
            } else {
                super.h(view, i8);
            }
        }

        public final void i(View view, AccessibilityEvent accessibilityEvent) {
            j0.a aVar = (j0.a) this.e.get(view);
            if (aVar != null) {
                aVar.i(view, accessibilityEvent);
            } else {
                super.i(view, accessibilityEvent);
            }
        }
    }

    public x(RecyclerView recyclerView) {
        this.f1912d = recyclerView;
        a aVar = this.e;
        this.e = aVar == null ? new a(this) : aVar;
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = this.f1912d;
            if (!(!recyclerView.f1620t || recyclerView.B || recyclerView.f1591d.g())) {
                RecyclerView recyclerView2 = (RecyclerView) view;
                if (recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().V(accessibilityEvent);
                }
            }
        }
    }

    public final void d(View view, c cVar) {
        this.f4917a.onInitializeAccessibilityNodeInfo(view, cVar.f5085a);
        RecyclerView recyclerView = this.f1912d;
        if (!(!recyclerView.f1620t || recyclerView.B || recyclerView.f1591d.g()) && recyclerView.getLayoutManager() != null) {
            RecyclerView.l layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f1661b;
            layoutManager.W(recyclerView2.f1587b, recyclerView2.f1595f0, cVar);
        }
    }

    public final boolean g(View view, int i8, Bundle bundle) {
        boolean z8 = true;
        if (super.g(view, i8, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f1912d;
        if (recyclerView.f1620t && !recyclerView.B && !recyclerView.f1591d.g()) {
            z8 = false;
        }
        if (z8 || recyclerView.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.l layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f1661b;
        return layoutManager.j0(recyclerView2.f1587b, recyclerView2.f1595f0, i8, bundle);
    }
}
