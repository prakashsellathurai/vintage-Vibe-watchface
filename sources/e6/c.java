package e6;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import f7.a;
import java.util.HashMap;
import w5.f;

public final /* synthetic */ class c implements Icon.OnDrawableLoadedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f4256a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f4257b;

    public /* synthetic */ c(a aVar, e eVar) {
        this.f4256a = aVar;
        this.f4257b = eVar;
    }

    public final void onDrawableLoaded(Drawable drawable) {
        d dVar = this.f4256a;
        dVar.getClass();
        f fVar = new f((Object) drawable);
        HashMap hashMap = dVar.f4258j;
        e eVar = this.f4257b;
        hashMap.put(eVar, fVar);
        dVar.g(eVar.f4261a, fVar, false);
    }
}
