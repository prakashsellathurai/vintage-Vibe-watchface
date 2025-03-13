package n6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntConsumer;

public final /* synthetic */ class f implements IntConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ List f5963a;

    public /* synthetic */ f(ArrayList arrayList) {
        this.f5963a = arrayList;
    }

    public final void accept(int i8) {
        this.f5963a.add(Character.valueOf((char) i8));
    }
}
