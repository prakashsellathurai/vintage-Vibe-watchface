package androidx.fragment.app;

import android.view.View;
import j0.x;
import java.util.ArrayList;

public final class o0 implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f1305f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1306g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1307h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1308i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1309j;

    public o0(int i8, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f1305f = i8;
        this.f1306g = arrayList;
        this.f1307h = arrayList2;
        this.f1308i = arrayList3;
        this.f1309j = arrayList4;
    }

    public final void run() {
        for (int i8 = 0; i8 < this.f1305f; i8++) {
            int[] iArr = x.f4957a;
            x.h.v((View) this.f1306g.get(i8), (String) this.f1307h.get(i8));
            x.h.v((View) this.f1308i.get(i8), (String) this.f1309j.get(i8));
        }
    }
}
