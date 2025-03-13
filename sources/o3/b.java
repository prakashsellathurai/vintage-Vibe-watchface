package o3;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;

public final class b extends DialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public Dialog f6083a;

    /* renamed from: b  reason: collision with root package name */
    public DialogInterface.OnCancelListener f6084b;

    /* renamed from: c  reason: collision with root package name */
    public AlertDialog f6085c;

    public final void onCancel(@RecentlyNonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f6084b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f6083a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f6085c == null) {
            this.f6085c = new AlertDialog.Builder(getActivity()).create();
        }
        return this.f6085c;
    }

    public final void show(@RecentlyNonNull FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
