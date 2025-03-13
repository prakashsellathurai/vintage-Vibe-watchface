package i5;

import android.graphics.Rect;
import android.support.wearable.complications.ComplicationText;
import c7.n;
import com.samsung.android.wearable.watchfacestudio.editor.b0;
import h7.d;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import n1.q;
import q1.r;
import q5.c;
import q7.k;
import r5.a;
import r5.e;
import s5.w;
import u1.m;
import v6.b;
import w5.f;

public final /* synthetic */ class g implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4856a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4857b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f4858c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f4859d;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i8) {
        this.f4856a = i8;
        this.f4857b = obj;
        this.f4858c = obj2;
        this.f4859d = obj3;
    }

    public final void accept(Object obj) {
        int i8 = this.f4856a;
        Object obj2 = this.f4859d;
        Object obj3 = this.f4858c;
        Object obj4 = this.f4857b;
        switch (i8) {
            case 0:
                AtomicInteger atomicInteger = (AtomicInteger) obj2;
                a aVar = (a) obj;
                ((com.samsung.android.wearable.watchfacestudio.a) obj4).getClass();
                Integer valueOf = Integer.valueOf(atomicInteger.getAndIncrement());
                String str = aVar.f7065b;
                k.e(str, "text");
                ComplicationText plainText = ComplicationText.plainText(str);
                k.d(plainText, "plainText(text)");
                r rVar = new r(plainText);
                Rect rect = aVar.f7064a;
                ((Collection) obj3).add(new d(valueOf, new q(rVar, rect)));
                atomicInteger.get();
                rect.toShortString();
                return;
            case 1:
                b0 b0Var = (b0) obj4;
                f fVar = (f) obj;
                b0Var.getClass();
                b0Var.q(((m) obj3).f7641a.f7683a + "." + ((List) obj2).indexOf(fVar), fVar);
                return;
            case 2:
                c cVar = (c) obj4;
                f fVar2 = (f) obj;
                cVar.getClass();
                cVar.q(((String) obj3) + "." + ((List) obj2).indexOf(fVar2), fVar2);
                return;
            case 3:
                w.a((e) obj2, (i6.e) obj, (v6.a) obj3, (x6.g) obj4);
                return;
            case 4:
                w.a((e) obj2, (i6.e) obj, (b) obj3, (x6.g) obj4);
                return;
            default:
                List list = (List) obj3;
                Rect rect2 = (Rect) obj2;
                n nVar = (n) obj;
                ((d7.f) obj4).getClass();
                if (nVar != null) {
                    list.add(nVar);
                    Rect rect3 = nVar.f2819g;
                    Rect rect4 = new Rect(rect2);
                    if (rect3 != null) {
                        rect4.right += rect3.right;
                        if (rect4.height() < 1) {
                            rect4.top = rect3.top;
                            rect4.bottom = rect3.bottom;
                        } else if (rect3.height() > rect4.height()) {
                            int height = (rect3.height() - rect4.height()) / 2;
                            rect4.top -= height;
                            rect4.bottom += height;
                        }
                    }
                    rect2.set(rect4);
                    return;
                }
                return;
        }
    }
}
