package androidx.fragment.app;

import android.view.View;
import e1.f;
import java.util.ArrayList;

public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    public static final m0 f1215a = new m0();

    /* renamed from: b  reason: collision with root package name */
    public static final p0 f1216b;

    static {
        p0 p0Var;
        try {
            p0Var = f.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            p0Var = null;
        }
        f1216b = p0Var;
    }

    public static void a(n nVar, n nVar2, boolean z8) {
        if (z8) {
            nVar2.getClass();
        } else {
            nVar.getClass();
        }
    }

    public static void b(ArrayList<View> arrayList, int i8) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i8);
            }
        }
    }
}
