package s5;

import android.graphics.Color;
import c7.i;
import java.util.function.Consumer;

public final /* synthetic */ class k implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7243a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f7244b;

    public /* synthetic */ k(i iVar, int i8) {
        this.f7243a = i8;
        this.f7244b = iVar;
    }

    public final void accept(Object obj) {
        int i8 = this.f7243a;
        i iVar = this.f7244b;
        switch (i8) {
            case 0:
                Color color = (Color) obj;
                if (color != null) {
                    iVar.f2808u = color;
                    iVar.A();
                    return;
                }
                iVar.getClass();
                return;
            default:
                Color color2 = (Color) obj;
                if (color2 != null) {
                    iVar.f2808u = color2;
                    iVar.A();
                    return;
                }
                iVar.getClass();
                return;
        }
    }
}
