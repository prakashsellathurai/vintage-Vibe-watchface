package k6;

import android.os.Handler;
import android.os.Looper;
import b0.c;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import n6.h;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f5186f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f5187g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f5188h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Object f5189i;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i8) {
        this.f5186f = i8;
        this.f5187g = obj;
        this.f5188h = obj2;
        this.f5189i = obj3;
    }

    public final void run() {
        int i8 = this.f5186f;
        Object obj = this.f5189i;
        Object obj2 = this.f5188h;
        Object obj3 = this.f5187g;
        switch (i8) {
            case 0:
                ((AtomicReference) obj2).set(((j) obj3).c((String) obj));
                return;
            default:
                h hVar = (h) obj3;
                Runnable runnable = (Runnable) obj2;
                Runnable runnable2 = (Runnable) obj;
                HashMap hashMap = h.e;
                hVar.getClass();
                if (runnable != null) {
                    runnable.run();
                }
                new Handler(Looper.getMainLooper()).post(new c(hVar, 14, runnable2));
                return;
        }
    }
}
