package androidx.fragment.app;

import androidx.fragment.app.n;
import p.f;

public class x {

    /* renamed from: a  reason: collision with root package name */
    public static final f<ClassLoader, f<String, Class<?>>> f1358a = new f<>();

    public static Class<?> a(ClassLoader classLoader, String str) {
        f<ClassLoader, f<String, Class<?>>> fVar = f1358a;
        f orDefault = fVar.getOrDefault(classLoader, null);
        if (orDefault == null) {
            orDefault = new f();
            fVar.put(classLoader, orDefault);
        }
        Class<?> cls = (Class) orDefault.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        orDefault.put(str, cls2);
        return cls2;
    }

    public static Class<? extends n> b(ClassLoader classLoader, String str) {
        try {
            return a(classLoader, str);
        } catch (ClassNotFoundException e) {
            throw new n.h("Unable to instantiate fragment " + str + ": make sure class name exists", e);
        } catch (ClassCastException e4) {
            throw new n.h("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e4);
        }
    }
}
