package androidx.lifecycle;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.savedstate.a;
import java.util.ArrayList;
import java.util.HashMap;

public final /* synthetic */ class c0 implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1434a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1435b;

    public /* synthetic */ c0(int i8, Object obj) {
        this.f1434a = i8;
        this.f1435b = obj;
    }

    public final Bundle a() {
        int i8 = this.f1434a;
        Object obj = this.f1435b;
        switch (i8) {
            case 0:
            case 1:
                return d0.a((d0) obj);
            default:
                ComponentActivity componentActivity = (ComponentActivity) obj;
                int i9 = ComponentActivity.f241t;
                componentActivity.getClass();
                Bundle bundle = new Bundle();
                ComponentActivity.b bVar = componentActivity.f251l;
                bVar.getClass();
                HashMap hashMap = bVar.f315c;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(hashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(hashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(bVar.e));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) bVar.f319h.clone());
                bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", bVar.f313a);
                return bundle;
        }
    }
}
