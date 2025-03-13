package androidx.lifecycle;

import a1.a;
import android.app.Application;
import i7.b;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import q7.k;

public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public static final List<Class<?>> f1477a;

    /* renamed from: b  reason: collision with root package name */
    public static final List<Class<?>> f1478b;

    static {
        Class<d0> cls = d0.class;
        f1477a = a.B(Application.class, cls);
        f1478b = a.A(cls);
    }

    public static final <T> Constructor<T> a(Class<T> cls, List<? extends Class<?>> list) {
        k.e(list, "signature");
        Constructor<T>[] constructors = cls.getConstructors();
        k.d(constructors, "modelClass.constructors");
        int length = constructors.length;
        int i8 = 0;
        while (i8 < length) {
            Constructor<T> constructor = constructors[i8];
            Class[] parameterTypes = constructor.getParameterTypes();
            k.d(parameterTypes, "constructor.parameterTypes");
            int length2 = parameterTypes.length;
            List arrayList = length2 != 0 ? length2 != 1 ? new ArrayList(new b(parameterTypes)) : a.A(parameterTypes[0]) : i7.k.f4879f;
            if (k.a(list, arrayList)) {
                return constructor;
            }
            if (list.size() != arrayList.size() || !arrayList.containsAll(list)) {
                i8++;
            } else {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final <T extends j0> T b(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        try {
            return (j0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e4) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e4);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e9.getCause());
        }
    }
}
