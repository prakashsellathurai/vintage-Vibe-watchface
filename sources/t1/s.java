package t1;

import android.util.Log;
import h7.f;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlinx.coroutines.flow.MutableStateFlow;
import n1.i0;
import q7.k;
import u1.e;
import u1.m;

public final /* synthetic */ class s implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f7454a;

    public /* synthetic */ s(u uVar) {
        this.f7454a = uVar;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        e eVar;
        u uVar = this.f7454a;
        k.e(uVar, "this$0");
        f fVar = uVar.C;
        if (objArr != null) {
            Object invoke = method != null ? method.invoke((MutableStateFlow) fVar.getValue(), Arrays.copyOf(objArr, objArr.length)) : null;
            String name = method != null ? method.getName() : null;
            if (k.a(name, "setValue")) {
                eVar = objArr[0];
            } else {
                if (!k.a(name, "compareAndSet")) {
                    Log.e("OnWatchFaceEditorSessionImpl", "userStyle proxy encountered unexpected method name '" + method.getName() + "' please check your proguard rules.");
                } else if ((invoke instanceof Boolean) && k.a(invoke, Boolean.TRUE)) {
                    eVar = objArr[1];
                }
                return invoke;
            }
            k.c(eVar, "null cannot be cast to non-null type androidx.wear.watchface.style.UserStyle");
            e eVar2 = eVar;
            for (m next : eVar2.keySet()) {
                if (!uVar.e().f7637a.contains(next)) {
                    throw new IllegalArgumentException(("A userStyleSetting (" + next + ") in userStyle does not match references in EditorSession's userStyleSchema.").toString());
                }
            }
            i0.b bVar = uVar.y;
            if (bVar != null) {
                bVar.h(eVar2);
                uVar.j();
                return invoke;
            }
            k.h("editorDelegate");
            throw null;
        } else if (method != null) {
            return method.invoke((MutableStateFlow) fVar.getValue(), new Object[0]);
        } else {
            return null;
        }
    }
}
