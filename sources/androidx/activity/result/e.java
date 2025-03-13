package androidx.activity.result;

import d.a;
import java.util.HashMap;

public final class e extends c<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f310a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f311b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f312c;

    public e(f fVar, String str, a aVar) {
        this.f312c = fVar;
        this.f310a = str;
        this.f311b = aVar;
    }

    public final void a(Object obj) {
        f fVar = this.f312c;
        HashMap hashMap = fVar.f315c;
        String str = this.f310a;
        Integer num = (Integer) hashMap.get(str);
        a aVar = this.f311b;
        if (num != null) {
            fVar.e.add(str);
            try {
                fVar.b(num.intValue(), aVar, obj);
            } catch (Exception e) {
                fVar.e.remove(str);
                throw e;
            }
        } else {
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
    }

    public final void b() {
        this.f312c.f(this.f310a);
    }
}
