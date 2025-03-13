package x3;

import androidx.annotation.RecentlyNonNull;
import java.lang.reflect.Field;
import x3.a;

public final class b<T> extends a.C0155a {

    /* renamed from: b  reason: collision with root package name */
    public final T f8120b;

    public b(T t8) {
        this.f8120b = t8;
    }

    @RecentlyNonNull
    public static <T> T x(@RecentlyNonNull a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f8120b;
        }
        y3.b bVar = (y3.b) aVar;
        Field[] declaredFields = bVar.getClass().getDeclaredFields();
        Field field = null;
        int i8 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i8++;
                field = field2;
            }
        }
        if (i8 == 1) {
            r3.b.b(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(bVar);
                } catch (NullPointerException e) {
                    throw new IllegalArgumentException("Binder object is null.", e);
                } catch (IllegalAccessException e4) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e4);
                }
            } else {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
        } else {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
