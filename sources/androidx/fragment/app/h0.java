package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.n;
import androidx.fragment.app.s0;
import androidx.health.services.client.R;
import androidx.lifecycle.m;
import androidx.lifecycle.s;
import androidx.wear.watchface.style.data.ComplicationOverlayWireFormat;
import j0.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f1180a;

    /* renamed from: b  reason: collision with root package name */
    public final i0 f1181b;

    /* renamed from: c  reason: collision with root package name */
    public final n f1182c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1183d = false;
    public int e = -1;

    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f1184a;

        public a(View view) {
            this.f1184a = view;
        }

        public final void onViewAttachedToWindow(View view) {
            View view2 = this.f1184a;
            view2.removeOnAttachStateChangeListener(this);
            int[] iArr = x.f4957a;
            x.g.c(view2);
        }

        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public h0(a0 a0Var, i0 i0Var, n nVar) {
        this.f1180a = a0Var;
        this.f1181b = i0Var;
        this.f1182c = nVar;
    }

    public h0(a0 a0Var, i0 i0Var, n nVar, g0 g0Var) {
        this.f1180a = a0Var;
        this.f1181b = i0Var;
        this.f1182c = nVar;
        nVar.f1256c = null;
        nVar.f1257d = null;
        nVar.r = 0;
        nVar.f1267o = false;
        nVar.f1264l = false;
        n nVar2 = nVar.f1260h;
        nVar.f1261i = nVar2 != null ? nVar2.f1258f : null;
        nVar.f1260h = null;
        Bundle bundle = g0Var.r;
        nVar.f1255b = bundle == null ? new Bundle() : bundle;
    }

    public h0(a0 a0Var, i0 i0Var, ClassLoader classLoader, x xVar, g0 g0Var) {
        this.f1180a = a0Var;
        this.f1181b = i0Var;
        n instantiate = n.instantiate(b0.this.f1114o.f1360b, g0Var.f1165f, (Bundle) null);
        this.f1182c = instantiate;
        Bundle bundle = g0Var.f1174o;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        instantiate.setArguments(bundle);
        instantiate.f1258f = g0Var.f1166g;
        instantiate.f1266n = g0Var.f1167h;
        instantiate.f1268p = true;
        instantiate.w = g0Var.f1168i;
        instantiate.f1274x = g0Var.f1169j;
        instantiate.y = g0Var.f1170k;
        instantiate.B = g0Var.f1171l;
        instantiate.f1265m = g0Var.f1172m;
        instantiate.A = g0Var.f1173n;
        instantiate.f1275z = g0Var.f1175p;
        instantiate.P = m.b.values()[g0Var.f1176q];
        Bundle bundle2 = g0Var.r;
        instantiate.f1255b = bundle2 == null ? new Bundle() : bundle2;
        if (b0.H(2)) {
            Objects.toString(instantiate);
        }
    }

    public final void a() {
        boolean H = b0.H(3);
        n nVar = this.f1182c;
        if (H) {
            Objects.toString(nVar);
        }
        Bundle bundle = nVar.f1255b;
        nVar.f1272u.N();
        nVar.f1254a = 3;
        nVar.F = false;
        nVar.onActivityCreated(bundle);
        if (nVar.F) {
            if (b0.H(3)) {
                nVar.toString();
            }
            View view = nVar.H;
            if (view != null) {
                Bundle bundle2 = nVar.f1255b;
                SparseArray<Parcelable> sparseArray = nVar.f1256c;
                if (sparseArray != null) {
                    view.restoreHierarchyState(sparseArray);
                    nVar.f1256c = null;
                }
                if (nVar.H != null) {
                    q0 q0Var = nVar.R;
                    q0Var.e.b(nVar.f1257d);
                    nVar.f1257d = null;
                }
                nVar.F = false;
                nVar.onViewStateRestored(bundle2);
                if (!nVar.F) {
                    throw new u0("Fragment " + nVar + " did not call through to super.onViewStateRestored()");
                } else if (nVar.H != null) {
                    nVar.R.b(m.a.ON_CREATE);
                }
            }
            nVar.f1255b = null;
            c0 c0Var = nVar.f1272u;
            c0Var.f1122z = false;
            c0Var.A = false;
            c0Var.G.f1157i = false;
            c0Var.t(4);
            this.f1180a.a(false);
            return;
        }
        throw new u0("Fragment " + nVar + " did not call through to super.onActivityCreated()");
    }

    public final void b() {
        View view;
        View view2;
        i0 i0Var = this.f1181b;
        i0Var.getClass();
        n nVar = this.f1182c;
        ViewGroup viewGroup = nVar.G;
        int i8 = -1;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) i0Var.f1188a;
            int indexOf = arrayList.indexOf(nVar);
            int i9 = indexOf - 1;
            while (true) {
                if (i9 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        n nVar2 = (n) arrayList.get(indexOf);
                        if (nVar2.G == viewGroup && (view = nVar2.H) != null) {
                            i8 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    n nVar3 = (n) arrayList.get(i9);
                    if (nVar3.G == viewGroup && (view2 = nVar3.H) != null) {
                        i8 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i9--;
                }
            }
        }
        nVar.G.addView(nVar.H, i8);
    }

    public final void c() {
        boolean H = b0.H(3);
        n nVar = this.f1182c;
        if (H) {
            Objects.toString(nVar);
        }
        n nVar2 = nVar.f1260h;
        h0 h0Var = null;
        i0 i0Var = this.f1181b;
        if (nVar2 != null) {
            h0 h8 = i0Var.h(nVar2.f1258f);
            if (h8 != null) {
                nVar.f1261i = nVar.f1260h.f1258f;
                nVar.f1260h = null;
                h0Var = h8;
            } else {
                throw new IllegalStateException("Fragment " + nVar + " declared target fragment " + nVar.f1260h + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = nVar.f1261i;
            if (str != null && (h0Var = i0Var.h(str)) == null) {
                throw new IllegalStateException("Fragment " + nVar + " declared target fragment " + nVar.f1261i + " that does not belong to this FragmentManager!");
            }
        }
        if (h0Var != null) {
            h0Var.k();
        }
        b0 b0Var = nVar.f1270s;
        nVar.f1271t = b0Var.f1114o;
        nVar.f1273v = b0Var.f1116q;
        a0 a0Var = this.f1180a;
        a0Var.g(false);
        ArrayList<n.i> arrayList = nVar.X;
        Iterator<n.i> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        arrayList.clear();
        nVar.f1272u.c(nVar.f1271t, nVar.c(), nVar);
        nVar.f1254a = 0;
        nVar.F = false;
        nVar.onAttach(nVar.f1271t.f1360b);
        if (nVar.F) {
            Iterator<f0> it2 = nVar.f1270s.f1112m.iterator();
            while (it2.hasNext()) {
                it2.next().b(nVar);
            }
            c0 c0Var = nVar.f1272u;
            c0Var.f1122z = false;
            c0Var.A = false;
            c0Var.G.f1157i = false;
            c0Var.t(0);
            a0Var.b(false);
            return;
        }
        throw new u0("Fragment " + nVar + " did not call through to super.onAttach()");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009c, code lost:
        if (r10 != null) goto L_0x009e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int d() {
        /*
            r12 = this;
            androidx.fragment.app.n r0 = r12.f1182c
            androidx.fragment.app.b0 r1 = r0.f1270s
            if (r1 != 0) goto L_0x0009
            int r12 = r0.f1254a
            return r12
        L_0x0009:
            int r1 = r12.e
            androidx.lifecycle.m$b r2 = r0.P
            int r2 = r2.ordinal()
            r3 = 0
            r4 = 1
            r5 = -1
            r6 = 5
            r7 = 3
            r8 = 4
            r9 = 2
            if (r2 == r4) goto L_0x002f
            if (r2 == r9) goto L_0x002a
            if (r2 == r7) goto L_0x0025
            if (r2 == r8) goto L_0x0033
            int r1 = java.lang.Math.min(r1, r5)
            goto L_0x0033
        L_0x0025:
            int r1 = java.lang.Math.min(r1, r6)
            goto L_0x0033
        L_0x002a:
            int r1 = java.lang.Math.min(r1, r4)
            goto L_0x0033
        L_0x002f:
            int r1 = java.lang.Math.min(r1, r3)
        L_0x0033:
            boolean r2 = r0.f1266n
            if (r2 == 0) goto L_0x005d
            boolean r2 = r0.f1267o
            int r12 = r12.e
            if (r2 == 0) goto L_0x0050
            int r1 = java.lang.Math.max(r12, r9)
            android.view.View r12 = r0.H
            if (r12 == 0) goto L_0x005d
            android.view.ViewParent r12 = r12.getParent()
            if (r12 != 0) goto L_0x005d
            int r1 = java.lang.Math.min(r1, r9)
            goto L_0x005d
        L_0x0050:
            if (r12 >= r8) goto L_0x0059
            int r12 = r0.f1254a
            int r1 = java.lang.Math.min(r1, r12)
            goto L_0x005d
        L_0x0059:
            int r1 = java.lang.Math.min(r1, r4)
        L_0x005d:
            boolean r12 = r0.f1264l
            if (r12 != 0) goto L_0x0065
            int r1 = java.lang.Math.min(r1, r4)
        L_0x0065:
            android.view.ViewGroup r12 = r0.G
            r2 = 0
            if (r12 == 0) goto L_0x00a0
            androidx.fragment.app.b0 r10 = r0.getParentFragmentManager()
            androidx.fragment.app.s0 r12 = androidx.fragment.app.s0.f(r12, r10)
            r12.getClass()
            androidx.fragment.app.s0$d r10 = r12.d(r0)
            if (r10 == 0) goto L_0x007c
            goto L_0x009e
        L_0x007c:
            java.util.ArrayList<androidx.fragment.app.s0$d> r12 = r12.f1323c
            java.util.Iterator r12 = r12.iterator()
        L_0x0082:
            boolean r10 = r12.hasNext()
            if (r10 == 0) goto L_0x009b
            java.lang.Object r10 = r12.next()
            androidx.fragment.app.s0$d r10 = (androidx.fragment.app.s0.d) r10
            androidx.fragment.app.n r11 = r10.f1332c
            boolean r11 = r11.equals(r0)
            if (r11 == 0) goto L_0x0082
            boolean r11 = r10.f1334f
            if (r11 != 0) goto L_0x0082
            goto L_0x009c
        L_0x009b:
            r10 = r2
        L_0x009c:
            if (r10 == 0) goto L_0x00a0
        L_0x009e:
            androidx.fragment.app.s0$d$b r2 = r10.f1331b
        L_0x00a0:
            androidx.fragment.app.s0$d$b r12 = androidx.fragment.app.s0.d.b.f1338g
            if (r2 != r12) goto L_0x00aa
            r12 = 6
            int r1 = java.lang.Math.min(r1, r12)
            goto L_0x00c7
        L_0x00aa:
            androidx.fragment.app.s0$d$b r12 = androidx.fragment.app.s0.d.b.f1339h
            if (r2 != r12) goto L_0x00b3
            int r1 = java.lang.Math.max(r1, r7)
            goto L_0x00c7
        L_0x00b3:
            boolean r12 = r0.f1265m
            if (r12 == 0) goto L_0x00c7
            int r12 = r0.r
            if (r12 <= 0) goto L_0x00bc
            r3 = r4
        L_0x00bc:
            if (r3 == 0) goto L_0x00c3
            int r1 = java.lang.Math.min(r1, r4)
            goto L_0x00c7
        L_0x00c3:
            int r1 = java.lang.Math.min(r1, r5)
        L_0x00c7:
            boolean r12 = r0.I
            if (r12 == 0) goto L_0x00d3
            int r12 = r0.f1254a
            if (r12 >= r6) goto L_0x00d3
            int r1 = java.lang.Math.min(r1, r8)
        L_0x00d3:
            boolean r12 = androidx.fragment.app.b0.H(r9)
            if (r12 == 0) goto L_0x00dc
            java.util.Objects.toString(r0)
        L_0x00dc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.h0.d():int");
    }

    public final void e() {
        Parcelable parcelable;
        boolean H = b0.H(3);
        n nVar = this.f1182c;
        if (H) {
            Objects.toString(nVar);
        }
        if (!nVar.O) {
            a0 a0Var = this.f1180a;
            a0Var.h(false);
            Bundle bundle = nVar.f1255b;
            nVar.f1272u.N();
            nVar.f1254a = 1;
            nVar.F = false;
            nVar.Q.a(new Fragment$5(nVar));
            nVar.U.b(bundle);
            nVar.onCreate(bundle);
            nVar.O = true;
            if (nVar.F) {
                nVar.Q.e(m.a.ON_CREATE);
                a0Var.c(false);
                return;
            }
            throw new u0("Fragment " + nVar + " did not call through to super.onCreate()");
        }
        Bundle bundle2 = nVar.f1255b;
        if (!(bundle2 == null || (parcelable = bundle2.getParcelable("android:support:fragments")) == null)) {
            nVar.f1272u.S(parcelable);
            c0 c0Var = nVar.f1272u;
            c0Var.f1122z = false;
            c0Var.A = false;
            c0Var.G.f1157i = false;
            c0Var.t(1);
        }
        nVar.f1254a = 1;
    }

    public final void f() {
        String str;
        n nVar = this.f1182c;
        if (!nVar.f1266n) {
            if (b0.H(3)) {
                Objects.toString(nVar);
            }
            LayoutInflater onGetLayoutInflater = nVar.onGetLayoutInflater(nVar.f1255b);
            nVar.N = onGetLayoutInflater;
            ViewGroup viewGroup = nVar.G;
            if (viewGroup == null) {
                int i8 = nVar.f1274x;
                if (i8 == 0) {
                    viewGroup = null;
                } else if (i8 != -1) {
                    viewGroup = (ViewGroup) nVar.f1270s.f1115p.e(i8);
                    if (viewGroup == null && !nVar.f1268p) {
                        try {
                            str = nVar.getResources().getResourceName(nVar.f1274x);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(nVar.f1274x) + " (" + str + ") for fragment " + nVar);
                    }
                } else {
                    throw new IllegalArgumentException("Cannot create fragment " + nVar + " for a container view with no id");
                }
            }
            nVar.G = viewGroup;
            nVar.f(onGetLayoutInflater, viewGroup, nVar.f1255b);
            View view = nVar.H;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                nVar.H.setTag(R.id.fragment_container_view_tag, nVar);
                if (viewGroup != null) {
                    b();
                }
                if (nVar.f1275z) {
                    nVar.H.setVisibility(8);
                }
                View view2 = nVar.H;
                int[] iArr = x.f4957a;
                if (x.f.b(view2)) {
                    x.g.c(nVar.H);
                } else {
                    View view3 = nVar.H;
                    view3.addOnAttachStateChangeListener(new a(view3));
                }
                nVar.onViewCreated(nVar.H, nVar.f1255b);
                nVar.f1272u.t(2);
                this.f1180a.m(nVar, nVar.H, false);
                int visibility = nVar.H.getVisibility();
                nVar.d().f1297q = nVar.H.getAlpha();
                if (nVar.G != null && visibility == 0) {
                    View findFocus = nVar.H.findFocus();
                    if (findFocus != null) {
                        nVar.d().r = findFocus;
                        if (b0.H(2)) {
                            findFocus.toString();
                            Objects.toString(nVar);
                        }
                    }
                    nVar.H.setAlpha(0.0f);
                }
            }
            nVar.f1254a = 2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r9 = this;
            r0 = 3
            boolean r1 = androidx.fragment.app.b0.H(r0)
            androidx.fragment.app.n r2 = r9.f1182c
            if (r1 == 0) goto L_0x000c
            java.util.Objects.toString(r2)
        L_0x000c:
            boolean r1 = r2.f1265m
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x001d
            int r1 = r2.r
            if (r1 <= 0) goto L_0x0018
            r1 = r4
            goto L_0x0019
        L_0x0018:
            r1 = r3
        L_0x0019:
            if (r1 != 0) goto L_0x001d
            r1 = r4
            goto L_0x001e
        L_0x001d:
            r1 = r3
        L_0x001e:
            androidx.fragment.app.i0 r5 = r9.f1181b
            if (r1 != 0) goto L_0x003d
            java.lang.Object r6 = r5.f1190c
            androidx.fragment.app.e0 r6 = (androidx.fragment.app.e0) r6
            java.util.HashMap<java.lang.String, androidx.fragment.app.n> r7 = r6.f1153d
            java.lang.String r8 = r2.f1258f
            boolean r7 = r7.containsKey(r8)
            if (r7 != 0) goto L_0x0032
        L_0x0030:
            r6 = r4
            goto L_0x0038
        L_0x0032:
            boolean r7 = r6.f1155g
            if (r7 == 0) goto L_0x0030
            boolean r6 = r6.f1156h
        L_0x0038:
            if (r6 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r6 = r3
            goto L_0x003e
        L_0x003d:
            r6 = r4
        L_0x003e:
            if (r6 == 0) goto L_0x0103
            androidx.fragment.app.y<?> r6 = r2.f1271t
            boolean r7 = r6 instanceof androidx.lifecycle.o0
            if (r7 == 0) goto L_0x004d
            java.lang.Object r4 = r5.f1190c
            androidx.fragment.app.e0 r4 = (androidx.fragment.app.e0) r4
            boolean r4 = r4.f1156h
            goto L_0x005a
        L_0x004d:
            android.content.Context r6 = r6.f1360b
            boolean r7 = r6 instanceof android.app.Activity
            if (r7 == 0) goto L_0x005a
            android.app.Activity r6 = (android.app.Activity) r6
            boolean r6 = r6.isChangingConfigurations()
            r4 = r4 ^ r6
        L_0x005a:
            if (r1 != 0) goto L_0x005e
            if (r4 == 0) goto L_0x0096
        L_0x005e:
            java.lang.Object r1 = r5.f1190c
            androidx.fragment.app.e0 r1 = (androidx.fragment.app.e0) r1
            r1.getClass()
            boolean r0 = androidx.fragment.app.b0.H(r0)
            if (r0 == 0) goto L_0x006e
            java.util.Objects.toString(r2)
        L_0x006e:
            java.util.HashMap<java.lang.String, androidx.fragment.app.e0> r0 = r1.e
            java.lang.String r4 = r2.f1258f
            java.lang.Object r4 = r0.get(r4)
            androidx.fragment.app.e0 r4 = (androidx.fragment.app.e0) r4
            if (r4 == 0) goto L_0x0082
            r4.b()
            java.lang.String r4 = r2.f1258f
            r0.remove(r4)
        L_0x0082:
            java.util.HashMap<java.lang.String, androidx.lifecycle.n0> r0 = r1.f1154f
            java.lang.String r1 = r2.f1258f
            java.lang.Object r1 = r0.get(r1)
            androidx.lifecycle.n0 r1 = (androidx.lifecycle.n0) r1
            if (r1 == 0) goto L_0x0096
            r1.a()
            java.lang.String r1 = r2.f1258f
            r0.remove(r1)
        L_0x0096:
            androidx.fragment.app.c0 r0 = r2.f1272u
            r0.l()
            androidx.lifecycle.s r0 = r2.Q
            androidx.lifecycle.m$a r1 = androidx.lifecycle.m.a.ON_DESTROY
            r0.e(r1)
            r2.f1254a = r3
            r2.F = r3
            r2.O = r3
            r2.onDestroy()
            boolean r0 = r2.F
            if (r0 == 0) goto L_0x00ea
            androidx.fragment.app.a0 r0 = r9.f1180a
            r0.d(r3)
            java.util.ArrayList r0 = r5.f()
            java.util.Iterator r0 = r0.iterator()
        L_0x00bc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00dc
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.h0 r1 = (androidx.fragment.app.h0) r1
            if (r1 == 0) goto L_0x00bc
            java.lang.String r3 = r2.f1258f
            androidx.fragment.app.n r1 = r1.f1182c
            java.lang.String r4 = r1.f1261i
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00bc
            r1.f1260h = r2
            r3 = 0
            r1.f1261i = r3
            goto L_0x00bc
        L_0x00dc:
            java.lang.String r0 = r2.f1261i
            if (r0 == 0) goto L_0x00e6
            androidx.fragment.app.n r0 = r5.c(r0)
            r2.f1260h = r0
        L_0x00e6:
            r5.l(r9)
            goto L_0x0115
        L_0x00ea:
            androidx.fragment.app.u0 r9 = new androidx.fragment.app.u0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Fragment "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = " did not call through to super.onDestroy()"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L_0x0103:
            java.lang.String r9 = r2.f1261i
            if (r9 == 0) goto L_0x0113
            androidx.fragment.app.n r9 = r5.c(r9)
            if (r9 == 0) goto L_0x0113
            boolean r0 = r9.B
            if (r0 == 0) goto L_0x0113
            r2.f1260h = r9
        L_0x0113:
            r2.f1254a = r3
        L_0x0115:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.h0.g():void");
    }

    public final void h() {
        View view;
        boolean H = b0.H(3);
        n nVar = this.f1182c;
        if (H) {
            Objects.toString(nVar);
        }
        ViewGroup viewGroup = nVar.G;
        if (!(viewGroup == null || (view = nVar.H) == null)) {
            viewGroup.removeView(view);
        }
        nVar.g();
        this.f1180a.n(false);
        nVar.G = null;
        nVar.H = null;
        nVar.R = null;
        nVar.S.i(null);
        nVar.f1267o = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i() {
        /*
            r7 = this;
            r0 = 3
            boolean r1 = androidx.fragment.app.b0.H(r0)
            androidx.fragment.app.n r2 = r7.f1182c
            if (r1 == 0) goto L_0x000c
            java.util.Objects.toString(r2)
        L_0x000c:
            r1 = -1
            r2.f1254a = r1
            r3 = 0
            r2.F = r3
            r2.onDetach()
            r4 = 0
            r2.N = r4
            boolean r5 = r2.F
            if (r5 == 0) goto L_0x00aa
            androidx.fragment.app.c0 r5 = r2.f1272u
            boolean r6 = r5.B
            if (r6 != 0) goto L_0x002c
            r5.l()
            androidx.fragment.app.c0 r5 = new androidx.fragment.app.c0
            r5.<init>()
            r2.f1272u = r5
        L_0x002c:
            androidx.fragment.app.a0 r5 = r7.f1180a
            r5.e(r3)
            r2.f1254a = r1
            r2.f1271t = r4
            r2.f1273v = r4
            r2.f1270s = r4
            boolean r1 = r2.f1265m
            r5 = 1
            if (r1 == 0) goto L_0x0049
            int r1 = r2.r
            if (r1 <= 0) goto L_0x0044
            r1 = r5
            goto L_0x0045
        L_0x0044:
            r1 = r3
        L_0x0045:
            if (r1 != 0) goto L_0x0049
            r1 = r5
            goto L_0x004a
        L_0x0049:
            r1 = r3
        L_0x004a:
            if (r1 != 0) goto L_0x0065
            androidx.fragment.app.i0 r7 = r7.f1181b
            java.lang.Object r7 = r7.f1190c
            androidx.fragment.app.e0 r7 = (androidx.fragment.app.e0) r7
            java.util.HashMap<java.lang.String, androidx.fragment.app.n> r1 = r7.f1153d
            java.lang.String r6 = r2.f1258f
            boolean r1 = r1.containsKey(r6)
            if (r1 != 0) goto L_0x005d
            goto L_0x0063
        L_0x005d:
            boolean r1 = r7.f1155g
            if (r1 == 0) goto L_0x0063
            boolean r5 = r7.f1156h
        L_0x0063:
            if (r5 == 0) goto L_0x00a9
        L_0x0065:
            boolean r7 = androidx.fragment.app.b0.H(r0)
            if (r7 == 0) goto L_0x006e
            java.util.Objects.toString(r2)
        L_0x006e:
            androidx.lifecycle.s r7 = new androidx.lifecycle.s
            r7.<init>(r2)
            r2.Q = r7
            b1.b r7 = new b1.b
            r7.<init>(r2)
            r2.U = r7
            r2.T = r4
            java.util.UUID r7 = java.util.UUID.randomUUID()
            java.lang.String r7 = r7.toString()
            r2.f1258f = r7
            r2.f1264l = r3
            r2.f1265m = r3
            r2.f1266n = r3
            r2.f1267o = r3
            r2.f1268p = r3
            r2.r = r3
            r2.f1270s = r4
            androidx.fragment.app.c0 r7 = new androidx.fragment.app.c0
            r7.<init>()
            r2.f1272u = r7
            r2.f1271t = r4
            r2.w = r3
            r2.f1274x = r3
            r2.y = r4
            r2.f1275z = r3
            r2.A = r3
        L_0x00a9:
            return
        L_0x00aa:
            androidx.fragment.app.u0 r7 = new androidx.fragment.app.u0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Fragment "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = " did not call through to super.onDetach()"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.h0.i():void");
    }

    public final void j() {
        n nVar = this.f1182c;
        if (nVar.f1266n && nVar.f1267o && !nVar.f1269q) {
            if (b0.H(3)) {
                Objects.toString(nVar);
            }
            LayoutInflater onGetLayoutInflater = nVar.onGetLayoutInflater(nVar.f1255b);
            nVar.N = onGetLayoutInflater;
            nVar.f(onGetLayoutInflater, (ViewGroup) null, nVar.f1255b);
            View view = nVar.H;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                nVar.H.setTag(R.id.fragment_container_view_tag, nVar);
                if (nVar.f1275z) {
                    nVar.H.setVisibility(8);
                }
                nVar.onViewCreated(nVar.H, nVar.f1255b);
                nVar.f1272u.t(2);
                this.f1180a.m(nVar, nVar.H, false);
                nVar.f1254a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z8 = this.f1183d;
        n nVar = this.f1182c;
        if (!z8) {
            boolean z9 = true;
            z9 = false;
            try {
                while (true) {
                    int d9 = d();
                    int i8 = nVar.f1254a;
                    if (d9 != i8) {
                        if (d9 <= i8) {
                            switch (i8 - 1) {
                                case ComplicationOverlayWireFormat.ENABLED_UNKNOWN /*-1*/:
                                    i();
                                    break;
                                case 0:
                                    g();
                                    break;
                                case 1:
                                    h();
                                    nVar.f1254a = z9 ? 1 : 0;
                                    break;
                                case 2:
                                    nVar.f1267o = z9;
                                    nVar.f1254a = 2;
                                    break;
                                case 3:
                                    if (b0.H(3)) {
                                        Objects.toString(nVar);
                                    }
                                    if (nVar.H != null && nVar.f1256c == null) {
                                        p();
                                    }
                                    if (!(nVar.H == null || (viewGroup2 = nVar.G) == null)) {
                                        s0 f9 = s0.f(viewGroup2, nVar.getParentFragmentManager());
                                        f9.getClass();
                                        if (b0.H(2)) {
                                            Objects.toString(nVar);
                                        }
                                        f9.a(s0.d.c.f1341f, s0.d.b.f1339h, this);
                                    }
                                    nVar.f1254a = 3;
                                    break;
                                case 4:
                                    r();
                                    break;
                                case 5:
                                    nVar.f1254a = 5;
                                    break;
                                case 6:
                                    l();
                                    break;
                            }
                        } else {
                            switch (i8 + 1) {
                                case 0:
                                    c();
                                    break;
                                case 1:
                                    e();
                                    break;
                                case 2:
                                    j();
                                    f();
                                    break;
                                case 3:
                                    a();
                                    break;
                                case 4:
                                    if (!(nVar.H == null || (viewGroup3 = nVar.G) == null)) {
                                        s0 f10 = s0.f(viewGroup3, nVar.getParentFragmentManager());
                                        s0.d.c f11 = s0.d.c.f(nVar.H.getVisibility());
                                        f10.getClass();
                                        if (b0.H(2)) {
                                            Objects.toString(nVar);
                                        }
                                        f10.a(f11, s0.d.b.f1338g, this);
                                    }
                                    nVar.f1254a = 4;
                                    break;
                                case 5:
                                    q();
                                    break;
                                case 6:
                                    nVar.f1254a = 6;
                                    break;
                                case 7:
                                    n();
                                    break;
                            }
                        }
                    } else {
                        if (nVar.M) {
                            if (!(nVar.H == null || (viewGroup = nVar.G) == null)) {
                                s0 f12 = s0.f(viewGroup, nVar.getParentFragmentManager());
                                boolean z10 = nVar.f1275z;
                                s0.d.b bVar = s0.d.b.f1337f;
                                if (z10) {
                                    f12.getClass();
                                    if (b0.H(2)) {
                                        Objects.toString(nVar);
                                    }
                                    f12.a(s0.d.c.f1343h, bVar, this);
                                } else {
                                    f12.getClass();
                                    if (b0.H(2)) {
                                        Objects.toString(nVar);
                                    }
                                    f12.a(s0.d.c.f1342g, bVar, this);
                                }
                            }
                            b0 b0Var = nVar.f1270s;
                            if (b0Var != null && nVar.f1264l && b0.I(nVar)) {
                                b0Var.y = z9;
                            }
                            nVar.M = z9;
                            nVar.onHiddenChanged(nVar.f1275z);
                        }
                        this.f1183d = z9;
                        return;
                    }
                }
            } finally {
                this.f1183d = z9;
            }
        } else if (b0.H(2)) {
            Objects.toString(nVar);
        }
    }

    public final void l() {
        boolean H = b0.H(3);
        n nVar = this.f1182c;
        if (H) {
            Objects.toString(nVar);
        }
        nVar.f1272u.t(5);
        if (nVar.H != null) {
            nVar.R.b(m.a.ON_PAUSE);
        }
        nVar.Q.e(m.a.ON_PAUSE);
        nVar.f1254a = 6;
        nVar.F = false;
        nVar.onPause();
        if (nVar.F) {
            this.f1180a.f(false);
            return;
        }
        throw new u0("Fragment " + nVar + " did not call through to super.onPause()");
    }

    public final void m(ClassLoader classLoader) {
        n nVar = this.f1182c;
        Bundle bundle = nVar.f1255b;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            nVar.f1256c = nVar.f1255b.getSparseParcelableArray("android:view_state");
            nVar.f1257d = nVar.f1255b.getBundle("android:view_registry_state");
            nVar.f1261i = nVar.f1255b.getString("android:target_state");
            if (nVar.f1261i != null) {
                nVar.f1262j = nVar.f1255b.getInt("android:target_req_state", 0);
            }
            Boolean bool = nVar.e;
            if (bool != null) {
                nVar.J = bool.booleanValue();
                nVar.e = null;
            } else {
                nVar.J = nVar.f1255b.getBoolean("android:user_visible_hint", true);
            }
            if (!nVar.J) {
                nVar.I = true;
            }
        }
    }

    public final void n() {
        boolean z8;
        boolean H = b0.H(3);
        n nVar = this.f1182c;
        if (H) {
            Objects.toString(nVar);
        }
        n.g gVar = nVar.K;
        View view = gVar == null ? null : gVar.r;
        if (view != null) {
            if (view != nVar.H) {
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent == null) {
                        z8 = false;
                        break;
                    } else if (parent == nVar.H) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
            }
            z8 = true;
            if (z8) {
                view.requestFocus();
                if (b0.H(2)) {
                    view.toString();
                    Objects.toString(nVar);
                    Objects.toString(nVar.H.findFocus());
                }
            }
        }
        nVar.d().r = null;
        nVar.f1272u.N();
        nVar.f1272u.x(true);
        nVar.f1254a = 7;
        nVar.F = false;
        nVar.onResume();
        if (nVar.F) {
            s sVar = nVar.Q;
            m.a aVar = m.a.ON_RESUME;
            sVar.e(aVar);
            if (nVar.H != null) {
                nVar.R.f1315d.e(aVar);
            }
            c0 c0Var = nVar.f1272u;
            c0Var.f1122z = false;
            c0Var.A = false;
            c0Var.G.f1157i = false;
            c0Var.t(7);
            this.f1180a.i(false);
            nVar.f1255b = null;
            nVar.f1256c = null;
            nVar.f1257d = null;
            return;
        }
        throw new u0("Fragment " + nVar + " did not call through to super.onResume()");
    }

    public final Bundle o() {
        Bundle bundle = new Bundle();
        n nVar = this.f1182c;
        nVar.onSaveInstanceState(bundle);
        nVar.U.c(bundle);
        Parcelable T = nVar.f1272u.T();
        if (T != null) {
            bundle.putParcelable("android:support:fragments", T);
        }
        this.f1180a.j(false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (nVar.H != null) {
            p();
        }
        if (nVar.f1256c != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", nVar.f1256c);
        }
        if (nVar.f1257d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", nVar.f1257d);
        }
        if (!nVar.J) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", nVar.J);
        }
        return bundle;
    }

    public final void p() {
        n nVar = this.f1182c;
        if (nVar.H != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            nVar.H.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                nVar.f1256c = sparseArray;
            }
            Bundle bundle = new Bundle();
            nVar.R.e.c(bundle);
            if (!bundle.isEmpty()) {
                nVar.f1257d = bundle;
            }
        }
    }

    public final void q() {
        boolean H = b0.H(3);
        n nVar = this.f1182c;
        if (H) {
            Objects.toString(nVar);
        }
        nVar.f1272u.N();
        nVar.f1272u.x(true);
        nVar.f1254a = 5;
        nVar.F = false;
        nVar.onStart();
        if (nVar.F) {
            s sVar = nVar.Q;
            m.a aVar = m.a.ON_START;
            sVar.e(aVar);
            if (nVar.H != null) {
                nVar.R.f1315d.e(aVar);
            }
            c0 c0Var = nVar.f1272u;
            c0Var.f1122z = false;
            c0Var.A = false;
            c0Var.G.f1157i = false;
            c0Var.t(5);
            this.f1180a.k(false);
            return;
        }
        throw new u0("Fragment " + nVar + " did not call through to super.onStart()");
    }

    public final void r() {
        boolean H = b0.H(3);
        n nVar = this.f1182c;
        if (H) {
            Objects.toString(nVar);
        }
        c0 c0Var = nVar.f1272u;
        c0Var.A = true;
        c0Var.G.f1157i = true;
        c0Var.t(4);
        if (nVar.H != null) {
            nVar.R.b(m.a.ON_STOP);
        }
        nVar.Q.e(m.a.ON_STOP);
        nVar.f1254a = 4;
        nVar.F = false;
        nVar.onStop();
        if (nVar.F) {
            this.f1180a.l(false);
            return;
        }
        throw new u0("Fragment " + nVar + " did not call through to super.onStop()");
    }
}
