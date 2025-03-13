package androidx.activity.result;

import android.os.Bundle;
import androidx.activity.result.f;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import d.a;
import java.util.HashMap;

class ActivityResultRegistry$1 implements p {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f301f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ b f302g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ a f303h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ f f304i;

    public ActivityResultRegistry$1(f fVar, String str, b bVar, a aVar) {
        this.f304i = fVar;
        this.f301f = str;
        this.f302g = bVar;
        this.f303h = aVar;
    }

    public final void c(r rVar, m.a aVar) {
        boolean equals = m.a.ON_START.equals(aVar);
        String str = this.f301f;
        f fVar = this.f304i;
        if (equals) {
            HashMap hashMap = fVar.f317f;
            a aVar2 = this.f303h;
            b bVar = this.f302g;
            hashMap.put(str, new f.a(aVar2, bVar));
            HashMap hashMap2 = fVar.f318g;
            if (hashMap2.containsKey(str)) {
                Object obj = hashMap2.get(str);
                hashMap2.remove(str);
                bVar.a(obj);
            }
            Bundle bundle = fVar.f319h;
            a aVar3 = (a) bundle.getParcelable(str);
            if (aVar3 != null) {
                bundle.remove(str);
                bVar.a(aVar2.c(aVar3.f306g, aVar3.f305f));
            }
        } else if (m.a.ON_STOP.equals(aVar)) {
            fVar.f317f.remove(str);
        } else if (m.a.ON_DESTROY.equals(aVar)) {
            fVar.f(str);
        }
    }
}
