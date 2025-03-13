package androidx.lifecycle;

import androidx.lifecycle.e;
import androidx.lifecycle.m;
import java.util.HashMap;
import java.util.List;

@Deprecated
class ReflectiveGenericLifecycleObserver implements p {

    /* renamed from: f  reason: collision with root package name */
    public final Object f1421f;

    /* renamed from: g  reason: collision with root package name */
    public final e.a f1422g;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f1421f = obj;
        this.f1422g = e.f1447c.b(obj.getClass());
    }

    public final void c(r rVar, m.a aVar) {
        HashMap hashMap = this.f1422g.f1450a;
        Object obj = this.f1421f;
        e.a.a((List) hashMap.get(aVar), rVar, aVar, obj);
        e.a.a((List) hashMap.get(m.a.ON_ANY), rVar, aVar, obj);
    }
}
