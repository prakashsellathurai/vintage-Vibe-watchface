package t1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.complications.ComplicationProviderInfo;
import androidx.wear.watchface.ComplicationHelperActivity;
import androidx.wear.watchface.editor.EditorSession;
import androidx.wear.watchface.style.data.UserStyleWireFormat;
import d.a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p1.e;
import q1.d;
import q7.k;

public final class g extends a<h, i> {
    public final Intent a(Context context, Object obj) {
        h hVar = (h) obj;
        k.e(context, "context");
        k.e(hVar, "input");
        EditorSession editorSession = hVar.f7430a;
        Map value = editorSession.p().getValue();
        ComponentName J = editorSession.J();
        int i8 = hVar.f7431b;
        Object obj2 = value.get(Integer.valueOf(i8));
        k.b(obj2);
        o1.a aVar = (o1.a) obj2;
        LinkedHashMap a9 = editorSession.b().getValue().a();
        int i9 = ComplicationHelperActivity.f2236z;
        Intent intent = new Intent(context, ComplicationHelperActivity.class);
        intent.setAction("android.support.wearable.complications.ACTION_START_PROVIDER_CHOOSER");
        intent.putExtra("android.support.wearable.complications.EXTRA_WATCH_FACE_COMPONENT_NAME", J);
        intent.putExtra("android.support.wearable.complications.EXTRA_COMPLICATION_ID", i8);
        String str = hVar.f7432c;
        if (str != null) {
            intent.putExtra("androidx.wear.watchface.complications.EXTRA_WATCHFACE_INSTANCE_ID", str);
        }
        Intent intent2 = hVar.f7433d;
        if (intent2 != null) {
            intent.putExtra("androidx.wear.watchface.complications.EXTRA_COMPLICATION_DENIED", intent2);
        }
        Intent intent3 = hVar.e;
        if (intent3 != null) {
            intent.putExtra("androidx.wear.watchface.complications.EXTRA_COMPLICATION_RATIONALE", intent3);
        }
        intent.putExtra("androidx.wear.watchface.complications.EXTRA_USER_STYLE", new UserStyleWireFormat(a9));
        List<d> list = aVar.f5990c;
        int[] iArr = new int[list.size()];
        int i10 = 0;
        for (d dVar : list) {
            iArr[i10] = dVar.f6450f;
            i10++;
        }
        intent.putExtra("android.support.wearable.complications.EXTRA_SUPPORTED_TYPES", iArr);
        Object obj3 = value.get(Integer.valueOf(i8));
        k.b(obj3);
        Bundle bundle = new Bundle(((o1.a) obj3).f5995i);
        Bundle extras = intent.getExtras();
        k.b(extras);
        bundle.putAll(extras);
        intent.replaceExtras(bundle);
        return intent;
    }

    public final Object c(Intent intent, int i8) {
        Bundle bundle;
        p1.a aVar = null;
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            bundle = new Bundle(extras);
            bundle.remove("android.support.wearable.complications.EXTRA_PROVIDER_INFO");
        } else {
            bundle = Bundle.EMPTY;
        }
        ComplicationProviderInfo complicationProviderInfo = (ComplicationProviderInfo) intent.getParcelableExtra("android.support.wearable.complications.EXTRA_PROVIDER_INFO");
        if (complicationProviderInfo != null) {
            aVar = e.a(complicationProviderInfo);
        }
        k.d(bundle, "extras");
        return new i(aVar, bundle);
    }
}
