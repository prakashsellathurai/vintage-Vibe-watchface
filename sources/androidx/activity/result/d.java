package androidx.activity.result;

import d.a;
import java.util.HashMap;

public final class d extends c<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f307a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f308b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f309c;

    public d(f fVar, String str, a aVar) {
        this.f309c = fVar;
        this.f307a = str;
        this.f308b = aVar;
    }

    public final void a(Object obj) {
        f fVar = this.f309c;
        HashMap hashMap = fVar.f315c;
        String str = this.f307a;
        Integer num = (Integer) hashMap.get(str);
        a aVar = this.f308b;
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
}
