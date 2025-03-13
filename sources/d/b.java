package d;

import android.content.Context;
import android.content.Intent;
import d.a;
import i7.f;
import i7.i;
import i7.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import q7.k;

public final class b extends a<String[], Map<String, Boolean>> {
    public final Intent a(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        k.e(context, "context");
        k.e(strArr, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        k.d(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    public final a.C0047a b(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        k.e(context, "context");
        k.e(strArr, "input");
        boolean z8 = true;
        if (strArr.length == 0) {
            return new a.C0047a(l.f4880f);
        }
        int length = strArr.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                break;
            }
            if (!(a0.a.a(context, strArr[i8]) == 0)) {
                z8 = false;
                break;
            }
            i8++;
        }
        if (!z8) {
            return null;
        }
        int C = a1.a.C(strArr.length);
        if (C < 16) {
            C = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C);
        for (String put : strArr) {
            linkedHashMap.put(put, Boolean.TRUE);
        }
        return new a.C0047a(linkedHashMap);
    }

    public final Object c(Intent intent, int i8) {
        l lVar = l.f4880f;
        if (i8 != -1 || intent == null) {
            return lVar;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return lVar;
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        int length = intArrayExtra.length;
        for (int i9 = 0; i9 < length; i9++) {
            arrayList.add(Boolean.valueOf(intArrayExtra[i9] == 0));
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : stringArrayExtra) {
            if (str != null) {
                arrayList2.add(str);
            }
        }
        return f.P(i.e0(arrayList2, arrayList));
    }
}
