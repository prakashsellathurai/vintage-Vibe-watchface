package i5;

import com.samsung.android.wearable.watchfacestudio.WatchFaceStudioRuntime;
import com.samsung.android.wearable.watchfacestudio.editor.w;
import e7.h;
import f7.b;
import java.util.function.Consumer;
import l5.a;
import o6.o;
import o6.q;
import x5.c;
import x6.d;

public final /* synthetic */ class j implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4860a;

    public /* synthetic */ j(int i8) {
        this.f4860a = i8;
    }

    public final void accept(Object obj) {
        switch (this.f4860a) {
            case 0:
                c cVar = (c) obj;
                int i8 = WatchFaceStudioRuntime.f3833j;
                cVar.f8150d = new b(cVar.e);
                return;
            case 1:
                c cVar2 = (c) obj;
                int i9 = w.A0;
                cVar2.f8150d = new b(cVar2.e);
                return;
            case 2:
                int i10 = w.A0;
                ((a) obj).setContentDescription("complication");
                return;
            case 3:
                ((Runnable) obj).run();
                return;
            case 4:
                ((q) obj).r();
                return;
            case 5:
                ((v6.a) ((q) obj)).K.forEach(new j(9));
                return;
            case 6:
                ((o) obj).b();
                return;
            case 7:
                ((q) obj).r();
                return;
            case 8:
                t6.j jVar = (t6.j) obj;
                jVar.f7522a.m();
                u6.b bVar = jVar.f7523b;
                if (bVar != null) {
                    s6.a aVar = bVar.f7812c;
                    if (aVar != null) {
                        aVar.f7259g.m();
                    }
                    bVar.f7805g.m();
                    return;
                }
                return;
            case 9:
                ((d) obj).a();
                return;
            case 10:
                y6.a aVar2 = (y6.a) obj;
                aVar2.g();
                aVar2.f8529h = false;
                return;
            case 11:
                ((a7.b) obj).f191a = null;
                return;
            case 12:
                h hVar = (h) obj;
                hVar.f6332b.h(false);
                hVar.f7217a.forEach(new j(3));
                return;
            default:
                e7.b bVar2 = (e7.b) obj;
                bVar2.f6332b.h(false);
                bVar2.f7217a.forEach(new j(3));
                return;
        }
    }
}
