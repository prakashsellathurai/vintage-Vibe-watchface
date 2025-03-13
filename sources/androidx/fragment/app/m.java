package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.b0;
import androidx.fragment.app.n;
import androidx.health.services.client.R;
import androidx.lifecycle.r;
import androidx.lifecycle.z;
import java.util.Objects;
import q7.k;

public class m extends n implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler Z;

    /* renamed from: a0  reason: collision with root package name */
    public final Runnable f1224a0 = new a();

    /* renamed from: b0  reason: collision with root package name */
    public final DialogInterface.OnCancelListener f1225b0 = new b();

    /* renamed from: c0  reason: collision with root package name */
    public final DialogInterface.OnDismissListener f1226c0 = new c();

    /* renamed from: d0  reason: collision with root package name */
    public int f1227d0 = 0;

    /* renamed from: e0  reason: collision with root package name */
    public int f1228e0 = 0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f1229f0 = true;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f1230g0 = true;

    /* renamed from: h0  reason: collision with root package name */
    public int f1231h0 = -1;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f1232i0;

    /* renamed from: j0  reason: collision with root package name */
    public final d f1233j0 = new d();

    /* renamed from: k0  reason: collision with root package name */
    public Dialog f1234k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f1235l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f1236m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f1237n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f1238o0 = false;

    public class a implements Runnable {
        public a() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public final void run() {
            m mVar = m.this;
            ((c) mVar.f1226c0).onDismiss(mVar.f1234k0);
        }
    }

    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public final void onCancel(DialogInterface dialogInterface) {
            m mVar = m.this;
            Dialog dialog = mVar.f1234k0;
            if (dialog != null) {
                mVar.onCancel(dialog);
            }
        }
    }

    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public final void onDismiss(DialogInterface dialogInterface) {
            m mVar = m.this;
            Dialog dialog = mVar.f1234k0;
            if (dialog != null) {
                mVar.onDismiss(dialog);
            }
        }
    }

    public class d implements z<r> {
        public d() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public final void b(Object obj) {
            if (((r) obj) != null) {
                m mVar = m.this;
                if (mVar.f1230g0) {
                    View requireView = mVar.requireView();
                    if (requireView.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    } else if (mVar.f1234k0 != null) {
                        if (b0.H(3)) {
                            Objects.toString(mVar.f1234k0);
                        }
                        mVar.f1234k0.setContentView(requireView);
                    }
                }
            }
        }
    }

    public class e extends u {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u f1243a;

        public e(n.d dVar) {
            this.f1243a = dVar;
        }

        public final View e(int i8) {
            u uVar = this.f1243a;
            if (uVar.h()) {
                return uVar.e(i8);
            }
            Dialog dialog = m.this.f1234k0;
            if (dialog != null) {
                return dialog.findViewById(i8);
            }
            return null;
        }

        public final boolean h() {
            return this.f1243a.h() || m.this.f1238o0;
        }
    }

    public final u c() {
        return new e(new n.d());
    }

    public final void f(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.f(layoutInflater, viewGroup, bundle);
        if (this.H == null && this.f1234k0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f1234k0.onRestoreInstanceState(bundle2);
        }
    }

    public final void n(boolean z8, boolean z9) {
        if (!this.f1236m0) {
            this.f1236m0 = true;
            this.f1237n0 = false;
            Dialog dialog = this.f1234k0;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.f1234k0.dismiss();
                if (!z9) {
                    if (Looper.myLooper() == this.Z.getLooper()) {
                        onDismiss(this.f1234k0);
                    } else {
                        this.Z.post(this.f1224a0);
                    }
                }
            }
            this.f1235l0 = true;
            if (this.f1231h0 >= 0) {
                b0 parentFragmentManager = getParentFragmentManager();
                int i8 = this.f1231h0;
                parentFragmentManager.getClass();
                if (i8 >= 0) {
                    parentFragmentManager.v(new b0.o(i8), false);
                    this.f1231h0 = -1;
                    return;
                }
                throw new IllegalArgumentException("Bad id: " + i8);
            }
            b0 parentFragmentManager2 = getParentFragmentManager();
            parentFragmentManager2.getClass();
            a aVar = new a(parentFragmentManager2);
            aVar.j(this);
            if (z8) {
                aVar.d(true);
            } else {
                aVar.d(false);
            }
        }
    }

    public Dialog o() {
        if (b0.H(3)) {
            toString();
        }
        return new Dialog(requireContext(), this.f1228e0);
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().e(this.f1233j0);
        if (!this.f1237n0) {
            this.f1236m0 = false;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.Z = new Handler();
        this.f1230g0 = this.f1274x == 0;
        if (bundle != null) {
            this.f1227d0 = bundle.getInt("android:style", 0);
            this.f1228e0 = bundle.getInt("android:theme", 0);
            this.f1229f0 = bundle.getBoolean("android:cancelable", true);
            this.f1230g0 = bundle.getBoolean("android:showsDialog", this.f1230g0);
            this.f1231h0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public final void onDestroyView() {
        this.F = true;
        Dialog dialog = this.f1234k0;
        if (dialog != null) {
            this.f1235l0 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.f1234k0.dismiss();
            if (!this.f1236m0) {
                onDismiss(this.f1234k0);
            }
            this.f1234k0 = null;
            this.f1238o0 = false;
        }
    }

    public final void onDetach() {
        this.F = true;
        if (!this.f1237n0 && !this.f1236m0) {
            this.f1236m0 = true;
        }
        getViewLifecycleOwnerLiveData().h(this.f1233j0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f1235l0) {
            if (b0.H(3)) {
                toString();
            }
            n(true, true);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0044 A[Catch:{ all -> 0x0069 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle r7) {
        /*
            r6 = this;
            android.view.LayoutInflater r7 = r6.getLayoutInflater(r7)
            boolean r0 = r6.f1230g0
            r1 = 2
            if (r0 == 0) goto L_0x0083
            boolean r2 = r6.f1232i0
            if (r2 == 0) goto L_0x000f
            goto L_0x0083
        L_0x000f:
            if (r0 != 0) goto L_0x0012
            goto L_0x006d
        L_0x0012:
            boolean r0 = r6.f1238o0
            if (r0 != 0) goto L_0x006d
            r0 = 0
            r2 = 1
            r6.f1232i0 = r2     // Catch:{ all -> 0x0069 }
            android.app.Dialog r3 = r6.o()     // Catch:{ all -> 0x0069 }
            r6.f1234k0 = r3     // Catch:{ all -> 0x0069 }
            boolean r4 = r6.f1230g0     // Catch:{ all -> 0x0069 }
            if (r4 == 0) goto L_0x0063
            int r4 = r6.f1227d0     // Catch:{ all -> 0x0069 }
            if (r4 == r2) goto L_0x0039
            if (r4 == r1) goto L_0x0039
            r5 = 3
            if (r4 == r5) goto L_0x002e
            goto L_0x003c
        L_0x002e:
            android.view.Window r4 = r3.getWindow()     // Catch:{ all -> 0x0069 }
            if (r4 == 0) goto L_0x0039
            r5 = 24
            r4.addFlags(r5)     // Catch:{ all -> 0x0069 }
        L_0x0039:
            r3.requestWindowFeature(r2)     // Catch:{ all -> 0x0069 }
        L_0x003c:
            android.content.Context r3 = r6.getContext()     // Catch:{ all -> 0x0069 }
            boolean r4 = r3 instanceof android.app.Activity     // Catch:{ all -> 0x0069 }
            if (r4 == 0) goto L_0x004b
            android.app.Dialog r4 = r6.f1234k0     // Catch:{ all -> 0x0069 }
            android.app.Activity r3 = (android.app.Activity) r3     // Catch:{ all -> 0x0069 }
            r4.setOwnerActivity(r3)     // Catch:{ all -> 0x0069 }
        L_0x004b:
            android.app.Dialog r3 = r6.f1234k0     // Catch:{ all -> 0x0069 }
            boolean r4 = r6.f1229f0     // Catch:{ all -> 0x0069 }
            r3.setCancelable(r4)     // Catch:{ all -> 0x0069 }
            android.app.Dialog r3 = r6.f1234k0     // Catch:{ all -> 0x0069 }
            android.content.DialogInterface$OnCancelListener r4 = r6.f1225b0     // Catch:{ all -> 0x0069 }
            r3.setOnCancelListener(r4)     // Catch:{ all -> 0x0069 }
            android.app.Dialog r3 = r6.f1234k0     // Catch:{ all -> 0x0069 }
            android.content.DialogInterface$OnDismissListener r4 = r6.f1226c0     // Catch:{ all -> 0x0069 }
            r3.setOnDismissListener(r4)     // Catch:{ all -> 0x0069 }
            r6.f1238o0 = r2     // Catch:{ all -> 0x0069 }
            goto L_0x0066
        L_0x0063:
            r2 = 0
            r6.f1234k0 = r2     // Catch:{ all -> 0x0069 }
        L_0x0066:
            r6.f1232i0 = r0
            goto L_0x006d
        L_0x0069:
            r7 = move-exception
            r6.f1232i0 = r0
            throw r7
        L_0x006d:
            boolean r0 = androidx.fragment.app.b0.H(r1)
            if (r0 == 0) goto L_0x0076
            r6.toString()
        L_0x0076:
            android.app.Dialog r6 = r6.f1234k0
            if (r6 == 0) goto L_0x0082
            android.content.Context r6 = r6.getContext()
            android.view.LayoutInflater r7 = r7.cloneInContext(r6)
        L_0x0082:
            return r7
        L_0x0083:
            boolean r0 = androidx.fragment.app.b0.H(r1)
            if (r0 == 0) goto L_0x008c
            r6.toString()
        L_0x008c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.m.onGetLayoutInflater(android.os.Bundle):android.view.LayoutInflater");
    }

    public void onSaveInstanceState(Bundle bundle) {
        Dialog dialog = this.f1234k0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i8 = this.f1227d0;
        if (i8 != 0) {
            bundle.putInt("android:style", i8);
        }
        int i9 = this.f1228e0;
        if (i9 != 0) {
            bundle.putInt("android:theme", i9);
        }
        boolean z8 = this.f1229f0;
        if (!z8) {
            bundle.putBoolean("android:cancelable", z8);
        }
        boolean z9 = this.f1230g0;
        if (!z9) {
            bundle.putBoolean("android:showsDialog", z9);
        }
        int i10 = this.f1231h0;
        if (i10 != -1) {
            bundle.putInt("android:backStackId", i10);
        }
    }

    public void onStart() {
        this.F = true;
        Dialog dialog = this.f1234k0;
        if (dialog != null) {
            this.f1235l0 = false;
            dialog.show();
            View decorView = this.f1234k0.getWindow().getDecorView();
            k.e(decorView, "<this>");
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    public void onStop() {
        this.F = true;
        Dialog dialog = this.f1234k0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public final void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        this.F = true;
        if (this.f1234k0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f1234k0.onRestoreInstanceState(bundle2);
        }
    }

    public final Dialog p() {
        Dialog dialog = this.f1234k0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }
}
