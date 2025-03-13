package s5;

import android.graphics.Color;
import c7.a;
import java.util.function.Consumer;

public final /* synthetic */ class j implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7235a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f7236b;

    public /* synthetic */ j(a aVar, int i8) {
        this.f7235a = i8;
        this.f7236b = aVar;
    }

    public final void accept(Object obj) {
        int i8 = this.f7235a;
        a aVar = this.f7236b;
        switch (i8) {
            case 0:
                Color color = (Color) obj;
                if (color != null) {
                    aVar.r = color;
                    aVar.A();
                    return;
                }
                aVar.getClass();
                return;
            default:
                Color color2 = (Color) obj;
                if (color2 != null) {
                    aVar.r = color2;
                    aVar.A();
                    return;
                }
                aVar.getClass();
                return;
        }
    }
}
