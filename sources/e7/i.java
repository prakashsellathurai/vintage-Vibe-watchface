package e7;

import android.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import r5.g;
import w5.f;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f4287a = new HashMap();

    public interface a {
        f e();

        String getKey();
    }

    public static a a(a[] aVarArr, String str) {
        return (a) Arrays.stream(aVarArr).filter(new g(5, str)).findFirst().orElse((Object) null);
    }

    public final f b(a aVar) {
        return (f) this.f4287a.getOrDefault(aVar.getKey(), f.f8063k);
    }

    public final void c(a aVar) {
        HashMap hashMap = this.f4287a;
        if (hashMap.containsKey(aVar.getKey())) {
            Log.w("DWF:Transformable", "Failed to register " + aVar.getKey());
            return;
        }
        hashMap.put(aVar.getKey(), aVar.e());
    }

    public final void d(a aVar, f fVar) {
        HashMap hashMap = this.f4287a;
        if (!hashMap.containsKey(aVar.getKey())) {
            Log.w("DWF:Transformable", aVar.getKey() + " is not registered");
            return;
        }
        hashMap.put(aVar.getKey(), fVar);
    }
}
