package c6;

import android.content.Context;
import android.util.Log;
import d6.c;
import j5.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import w5.d;
import w5.f;

public abstract class b extends d {

    public enum a {
        f2709f,
        f2710g,
        f2711h,
        f2712i,
        f2713j,
        f2714k;

        /* access modifiers changed from: public */
        a() {
        }
    }

    public b(Context context) {
        super(context, false, (c) null);
    }

    public static a o(d dVar) {
        switch (dVar.ordinal()) {
            case EXERCISE_TYPE_YOGA_VALUE:
                return a.f2712i;
            case EXERCISE_TYPE_BACKPACKING_VALUE:
                return a.f2714k;
            case EXERCISE_TYPE_MOUNTAIN_BIKING_VALUE:
                return a.f2713j;
            case EXERCISE_TYPE_HORSE_RIDING_VALUE:
                return a.f2710g;
            case EXERCISE_TYPE_ROLLER_SKATING_VALUE:
                return a.f2711h;
            default:
                return a.f2709f;
        }
    }

    public final void b(d dVar, f fVar) {
    }

    public final f e(d dVar) {
        f fVar;
        e eVar = (e) this;
        int ordinal = o(dVar).ordinal();
        if (ordinal == 1) {
            fVar = new f(eVar.f5030q);
        } else if (ordinal == 2) {
            int i8 = eVar.f5030q;
            fVar = new f(String.format(Locale.getDefault(), "%02d", new Object[]{Integer.valueOf(i8)}));
        } else if (ordinal == 3) {
            fVar = new f(eVar.r);
        } else if (ordinal == 4) {
            fVar = new f(eVar.f5031s);
        } else if (ordinal != 5) {
            return null;
        } else {
            fVar = new f((int) a1.a.k((((float) eVar.r) / ((float) eVar.f5031s)) * 100.0f, 0.0f, 100.0f));
        }
        return fVar;
    }

    public final boolean f(d dVar) {
        HashMap hashMap = this.f2720f;
        return hashMap.containsKey(dVar) && ((Boolean) hashMap.get(dVar)).booleanValue();
    }

    public final void i(d dVar) {
        a o8 = o(dVar);
        e eVar = (e) this;
        Log.i("DWF:WearHealthProvider", "onDataConnected:" + o8);
        if (o8 == a.f2710g || o8 == a.f2711h) {
            eVar.s(eVar.f5023j);
        }
    }

    public final void j(d dVar) {
    }

    public final void n(List<a> list) {
        ArrayList arrayList = new ArrayList();
        for (a ordinal : list) {
            int ordinal2 = ordinal.ordinal();
            arrayList.add(ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? ordinal2 != 4 ? ordinal2 != 5 ? d.f8025g : d.L0 : d.M0 : d.K0 : d.Q0 : d.P0);
        }
        this.f2717b.a(arrayList);
    }
}
