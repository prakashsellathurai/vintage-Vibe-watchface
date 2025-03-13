package j5;

import android.util.Log;
import r5.c;

public final /* synthetic */ class d implements c {
    public final void a(String[] strArr, int[] iArr) {
        for (int i8 = 0; i8 < strArr.length; i8++) {
            Log.i("DWF:WearHealthProvider", "onRequestPermissionResult," + strArr[i8] + ", " + iArr[i8]);
        }
    }
}
