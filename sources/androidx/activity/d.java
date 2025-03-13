package androidx.activity;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import c.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public final /* synthetic */ class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f286a;

    public /* synthetic */ d(ComponentActivity componentActivity) {
        this.f286a = componentActivity;
    }

    public final void a() {
        ComponentActivity componentActivity = this.f286a;
        Bundle a9 = componentActivity.e.f2512b.a("android:support:activity-result");
        if (a9 != null) {
            ComponentActivity.b bVar = componentActivity.f251l;
            bVar.getClass();
            ArrayList<Integer> integerArrayList = a9.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a9.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                bVar.e = a9.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                bVar.f313a = (Random) a9.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                Bundle bundle = a9.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                Bundle bundle2 = bVar.f319h;
                bundle2.putAll(bundle);
                for (int i8 = 0; i8 < stringArrayList.size(); i8++) {
                    String str = stringArrayList.get(i8);
                    HashMap hashMap = bVar.f315c;
                    boolean containsKey = hashMap.containsKey(str);
                    HashMap hashMap2 = bVar.f314b;
                    if (containsKey) {
                        Integer num = (Integer) hashMap.remove(str);
                        if (!bundle2.containsKey(str)) {
                            hashMap2.remove(num);
                        }
                    }
                    int intValue = integerArrayList.get(i8).intValue();
                    String str2 = stringArrayList.get(i8);
                    hashMap2.put(Integer.valueOf(intValue), str2);
                    hashMap.put(str2, Integer.valueOf(intValue));
                }
            }
        }
    }
}
