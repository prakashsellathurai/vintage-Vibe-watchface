package r5;

import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.util.Log;
import c7.d;
import c7.k;
import c7.n;
import com.samsung.android.wearable.watchfacestudio.editor.r;
import d7.b;
import i6.b;
import i6.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.function.Consumer;
import o6.g;
import o6.h;
import o6.u;
import o6.v;
import s6.f;
import s6.h;
import t6.b;
import t6.f;
import t6.i;
import t6.k;
import u6.a;
import u6.c;
import x5.b;
import x6.c;

public final /* synthetic */ class f implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7084a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f7085b;

    public /* synthetic */ f(int i8, Object obj) {
        this.f7084a = i8;
        this.f7085b = obj;
    }

    public final void accept(Object obj) {
        int argb;
        int i8 = this.f7084a;
        Object obj2 = this.f7085b;
        switch (i8) {
            case 0:
                b bVar = (b) obj;
                ((h) obj2).getClass();
                e eVar = bVar.f4864c;
                while (eVar != null && !"ComplicationSlot".equals(eVar.f4862a)) {
                    eVar = eVar.f4864c;
                }
                String d9 = (eVar == null || !eVar.c("slotId")) ? null : eVar.b("slotId").d();
                if (d9 != null) {
                    Arrays.stream(b.a.values()).forEach(new r(bVar, 2, d9));
                    return;
                } else {
                    Log.i("DWF:WatchFaceDocument", "DataSource value has COMPLICATION prefix, but it is not belong to ComplicationSlot");
                    return;
                }
            case 1:
                ((g) obj2).M(((Color) obj).toArgb());
                return;
            case 2:
                ((u6.b) obj2).b((Color) obj);
                return;
            case 3:
                ((a) obj2).b((Color) obj);
                return;
            case 4:
                ((EnumSet) obj2).add(c.a.valueOf((String) obj));
                return;
            case 5:
                k kVar = (k) obj2;
                Color color = (Color) obj;
                kVar.getClass();
                if (color != null && kVar.f2814t != (argb = color.toArgb())) {
                    kVar.f2814t = argb;
                    kVar.A();
                    return;
                }
                return;
            case 6:
                ((c7.e) obj2).c((Color) obj);
                return;
            case 7:
                ((c7.g) obj2).c((Color) obj);
                return;
            case 8:
                ((d) obj2).c((Color) obj);
                return;
            case 9:
                u uVar = (u) obj2;
                uVar.getClass();
                uVar.f6182c.d(v.a.f6185h, new w5.f((Color) obj));
                return;
            case 10:
                ((h) obj2).c((h.a) obj);
                return;
            case 11:
                ((v) obj2).c((v.a) obj);
                return;
            case 12:
                ((s6.f) obj2).c((f.a) obj);
                return;
            case 13:
                ((s6.h) obj2).c((h.a) obj);
                return;
            case 14:
                ((t6.b) obj2).c((b.a) obj);
                return;
            case 15:
                ((t6.f) obj2).c((f.a) obj);
                return;
            case 16:
                ((i) obj2).c((i.a) obj);
                return;
            case 17:
                ((t6.k) obj2).c((k.a) obj);
                return;
            case 18:
                ((u6.c) obj2).c((c.a) obj);
                return;
            case 19:
                ((ColorMatrix) obj2).preConcat(((w6.b) obj).a());
                return;
            case EXERCISE_TYPE_DUMBBELL_FRONT_RAISE_VALUE:
                int i9 = x6.c.e;
                ((x6.e) obj).h(c.a.valueOf((String) obj2));
                return;
            case EXERCISE_TYPE_DUMBBELL_LATERAL_RAISE_VALUE:
                Void voidR = (Void) obj;
                ((c7.f) obj2).A();
                return;
            case EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_LEFT_ARM_VALUE:
                ((ArrayList) obj2).add(((n) obj).f2818f);
                return;
            case EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_RIGHT_ARM_VALUE:
                ((d7.b) obj2).c((b.a) obj);
                return;
            default:
                e7.h hVar = (e7.h) obj;
                hVar.f4279g = ((e7.k) obj2).f4295g;
                hVar.f4282j = false;
                hVar.p(false);
                return;
        }
    }
}
