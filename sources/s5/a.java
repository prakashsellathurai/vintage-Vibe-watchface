package s5;

import android.graphics.Color;
import android.graphics.RectF;
import b6.c;
import i6.b;
import i6.e;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import o6.g;
import o6.x;
import w5.f;

public final /* synthetic */ class a implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7206a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f7207b;

    public /* synthetic */ a(int i8, List list) {
        this.f7206a = i8;
        this.f7207b = list;
    }

    public final void accept(Object obj) {
        int i8 = this.f7206a;
        List list = this.f7207b;
        switch (i8) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                g gVar = (g) entry.getKey();
                float[] fArr = new float[9];
                gVar.f6139m.getValues(fArr);
                float f9 = fArr[2];
                float f10 = fArr[5];
                list.add(new r5.a(a1.a.o(new RectF(f9, f10, gVar.D().width() + f9, gVar.D().height() + f10)), ((x) entry.getValue()).a()));
                return;
            case 1:
                list.add(((e) obj).b("resource").e(""));
                return;
            case 2:
                list.add((b) ((e) obj));
                return;
            case 3:
                ((c) obj).e.forEach(new a(4, list));
                return;
            default:
                list.add(new f((Color) obj));
                return;
        }
    }
}
