package com.samsung.android.wearable.watchfacestudio;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import java.util.Arrays;
import x0.a;

public class PermissionActivity extends Activity {
    public final void onRequestPermissionsResult(int i8, String[] strArr, int[] iArr) {
        Intent intent = new Intent("com.samsung.watchface.ON_REQUEST_PERMISSION_RESULT");
        intent.putExtra("REQUEST_CODE", i8);
        intent.putExtra("PERMISSIONS", strArr);
        intent.putExtra("RESULTS", iArr);
        a.a(this).b(intent);
        finish();
    }

    public final void onStart() {
        String str;
        super.onStart();
        Intent intent = getIntent();
        if (intent == null) {
            str = "no intent";
        } else {
            int intExtra = intent.getIntExtra("REQUEST_CODE", -1);
            String[] stringArrayExtra = intent.getStringArrayExtra("PERMISSIONS");
            if (intExtra == -1 || stringArrayExtra == null) {
                str = "invalid parameters: " + intExtra + ": " + Arrays.toString(stringArrayExtra);
            } else {
                requestPermissions(stringArrayExtra, intExtra);
                return;
            }
        }
        Log.w("DWF:PermissionActivity", str);
    }
}
