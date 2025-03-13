package r3;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

public abstract class u implements DialogInterface.OnClickListener {
    public final void onClick(DialogInterface dialogInterface, int i8) {
        try {
            t tVar = (t) this;
            Intent intent = tVar.f7034a;
            if (intent != null) {
                tVar.f7035b.startActivityForResult(intent, tVar.f7036c);
            }
        } catch (ActivityNotFoundException e) {
            String str = "Failed to start resolution intent.";
            if (true == Build.FINGERPRINT.contains("generic")) {
                str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            Log.e("DialogRedirect", str, e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
