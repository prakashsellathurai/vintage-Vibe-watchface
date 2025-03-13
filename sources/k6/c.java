package k6;

import android.graphics.Bitmap;
import k6.j;
import z6.a;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f5183f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ j.a f5184g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Bitmap f5185h;

    public /* synthetic */ c(a aVar, Bitmap bitmap, int i8) {
        this.f5183f = i8;
        this.f5184g = aVar;
        this.f5185h = bitmap;
    }

    public final void run() {
        int i8 = this.f5183f;
        Bitmap bitmap = this.f5185h;
        j.a aVar = this.f5184g;
        switch (i8) {
            case 0:
                ((a) aVar).a(bitmap);
                return;
            case 1:
                ((a) aVar).a(bitmap);
                return;
            default:
                ((a) aVar).a(bitmap);
                return;
        }
    }
}
