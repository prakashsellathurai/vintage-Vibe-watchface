package e6;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import d6.b;
import f7.a;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import w5.c;
import w5.f;
import x5.b;

public abstract class d extends b {

    /* renamed from: j  reason: collision with root package name */
    public final HashMap f4258j = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    public b f4259k;

    public d(Context context) {
        super(context);
    }

    public final f c(c cVar) {
        f fVar;
        String str = cVar.f8018a;
        e eVar = new e(str);
        HashMap hashMap = this.f4258j;
        if (!hashMap.containsKey(eVar)) {
            return new f();
        }
        f fVar2 = (f) hashMap.get(eVar);
        if (!this.f4052f || fVar2 == null || fVar2.i()) {
            return fVar2;
        }
        char c9 = 65535;
        if (!this.f4053g) {
            a aVar = (a) this;
            Optional findAny = aVar.f4259k.f4255a.entrySet().stream().filter(new a(0, eVar)).findAny();
            Integer num = (Integer) aVar.f4422n.get(Integer.valueOf(findAny.isPresent() ? ((Integer) ((Map.Entry) findAny.get()).getKey()).intValue() : -1));
            if (!(num == null || num.intValue() == 1)) {
                return fVar2;
            }
        }
        int lastIndexOf = str.lastIndexOf(".");
        String substring = lastIndexOf == -1 ? null : str.substring(lastIndexOf + 1);
        if (substring != null) {
            switch (substring.hashCode()) {
                case -1760221213:
                    if (substring.equals("SMALL_IMAGE")) {
                        c9 = 0;
                        break;
                    }
                    break;
                case -1522736277:
                    if (substring.equals("RANGED_VALUE_VALUE")) {
                        c9 = 1;
                        break;
                    }
                    break;
                case -926731810:
                    if (substring.equals("RANGED_VALUE_MAX")) {
                        c9 = 2;
                        break;
                    }
                    break;
                case -926731572:
                    if (substring.equals("RANGED_VALUE_MIN")) {
                        c9 = 3;
                        break;
                    }
                    break;
                case -547251350:
                    if (substring.equals("MONOCHROMATIC_IMAGE_AMBIENT")) {
                        c9 = 4;
                        break;
                    }
                    break;
                case 2571565:
                    if (substring.equals("TEXT")) {
                        c9 = 5;
                        break;
                    }
                    break;
                case 79833656:
                    if (substring.equals("TITLE")) {
                        c9 = 6;
                        break;
                    }
                    break;
                case 208798926:
                    if (substring.equals("PHOTO_IMAGE")) {
                        c9 = 7;
                        break;
                    }
                    break;
                case 423704369:
                    if (substring.equals("MONOCHROMATIC_IMAGE")) {
                        c9 = 8;
                        break;
                    }
                    break;
                case 433764892:
                    if (substring.equals("SMALL_IMAGE_AMBIENT")) {
                        c9 = 9;
                        break;
                    }
                    break;
            }
            switch (c9) {
                case 0:
                case 4:
                case 7:
                case 8:
                case 9:
                    fVar = f.f8063k;
                    break;
                case 1:
                case 3:
                    fVar = f.f8064l;
                    break;
                case 2:
                    fVar = new f(100);
                    break;
                case 5:
                case 6:
                    fVar = new f("--");
                    break;
                default:
                    return fVar2;
            }
            return fVar;
        }
        Log.e("DWF:ComplicationProvider", "Wrong data type : " + eVar);
        return fVar2;
    }

    public final String d() {
        return "COMPLICATION.";
    }

    public final void h(boolean z8) {
    }

    public final void i(boolean z8) {
        for (String str : this.f4049b.keySet()) {
            g(str, c(new c(str)), z8);
        }
    }

    public final void j(boolean z8) {
        for (String str : this.f4049b.keySet()) {
            g(str, c(new c(str)), z8);
        }
    }

    public final void m() {
    }

    public final void n() {
    }

    public final void o(c cVar, f fVar) {
        HashMap hashMap = this.f4258j;
        String str = cVar.f8018a;
        hashMap.put(new e(str), fVar);
        g(str, fVar, false);
    }

    public final Drawable q(Icon icon) {
        if (icon == null) {
            return null;
        }
        return icon.loadDrawable(this.f4051d);
    }

    public final void r(int i8, b.a aVar, Icon icon) {
        e a9 = this.f4259k.a(i8, aVar.name());
        if (icon == null) {
            f fVar = f.f8063k;
            this.f4258j.put(a9, fVar);
            g(a9.f4261a, fVar, false);
            return;
        }
        Handler handler = new Handler(Looper.getMainLooper());
        icon.loadDrawableAsync(this.f4051d, new c((a) this, a9), handler);
    }

    public abstract void s(Instant instant, boolean z8);
}
