package p1;

import android.content.ComponentName;
import l7.c;
import l7.e;

@e(c = "androidx.wear.watchface.complications.ComplicationDataSourceInfoRetriever", f = "ComplicationDataSourceInfoRetriever.kt", l = {155}, m = "retrieveComplicationDataSourceInfo")
public final class d extends c {

    /* renamed from: i  reason: collision with root package name */
    public ComponentName f6273i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f6274j;

    /* renamed from: k  reason: collision with root package name */
    public Object f6275k;

    /* renamed from: l  reason: collision with root package name */
    public /* synthetic */ Object f6276l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ c f6277m;

    /* renamed from: n  reason: collision with root package name */
    public int f6278n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(c cVar, j7.d<? super d> dVar) {
        super(dVar);
        this.f6277m = cVar;
    }

    public final Object h(Object obj) {
        this.f6276l = obj;
        this.f6278n |= Integer.MIN_VALUE;
        return this.f6277m.c((ComponentName) null, (int[]) null, this);
    }
}
