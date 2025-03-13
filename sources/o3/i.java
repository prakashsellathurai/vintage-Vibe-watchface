package o3;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import androidx.annotation.RecentlyNonNull;
import androidx.fragment.app.m;

public class i extends m {

    /* renamed from: p0  reason: collision with root package name */
    public Dialog f6096p0;

    /* renamed from: q0  reason: collision with root package name */
    public DialogInterface.OnCancelListener f6097q0;

    /* renamed from: r0  reason: collision with root package name */
    public AlertDialog f6098r0;

    public final Dialog o() {
        Dialog dialog = this.f6096p0;
        if (dialog != null) {
            return dialog;
        }
        this.f1230g0 = false;
        if (this.f6098r0 == null) {
            this.f6098r0 = new AlertDialog.Builder(getActivity()).create();
        }
        return this.f6098r0;
    }

    public final void onCancel(@RecentlyNonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f6097q0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
