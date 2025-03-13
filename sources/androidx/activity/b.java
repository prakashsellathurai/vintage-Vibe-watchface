package androidx.activity;

import android.util.Log;
import androidx.activity.ComponentActivity;
import com.samsung.android.wearable.watchfacestudio.a;
import e7.h;
import java.time.ZonedDateTime;
import o5.c;
import o5.f;
import r5.k;
import y6.e;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f283f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f284g;

    public /* synthetic */ b(int i8, Object obj) {
        this.f283f = i8;
        this.f284g = obj;
    }

    public final void run() {
        Object obj = this.f284g;
        switch (this.f283f) {
            case 0:
                ((ComponentActivity) obj).invalidateOptionsMenu();
                return;
            case 1:
                ComponentActivity.e eVar = (ComponentActivity.e) obj;
                Runnable runnable = eVar.f265g;
                if (runnable != null) {
                    runnable.run();
                    eVar.f265g = null;
                    return;
                }
                return;
            case 4:
                k kVar = ((a) obj).y;
                if (kVar != null) {
                    kVar.h(ZonedDateTime.now());
                    return;
                }
                return;
            case 5:
                com.samsung.android.wearable.watchfacestudio.b bVar = (com.samsung.android.wearable.watchfacestudio.b) obj;
                int i8 = com.samsung.android.wearable.watchfacestudio.b.f3857g;
                bVar.getClass();
                Log.i("DWF:WatchFaceRenderer", "ambientTransition is finished");
                bVar.f3858f.f3853a = false;
                return;
            case 6:
                ((c) obj).f6122a.f3918i.e();
                return;
            case 7:
                ((f) obj).f6126a.f3919j.e();
                return;
            case 8:
                s5.b bVar2 = (s5.b) obj;
                bVar2.getClass();
                Log.i("DWF:AccessibilityManager", "Accessibility content description was updated");
                bVar2.f7211b.f4842a.o();
                bVar2.f7213d = false;
                return;
            case 9:
                ((x6.b) obj).f();
                return;
            case 10:
                y6.b bVar3 = (y6.b) obj;
                bVar3.f8532k = bVar3.f8534m.f8713a.a();
                bVar3.e();
                return;
            case 11:
                e eVar2 = (e) obj;
                int i9 = e.f8543o;
                eVar2.f8532k = eVar2.f8534m.f8713a.a();
                eVar2.e();
                return;
            default:
                h hVar = (h) obj;
                if (hVar.f4283k) {
                    hVar.f6332b.d();
                    return;
                }
                return;
        }
    }
}
