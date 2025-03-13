package l7;

import h7.h;
import j7.d;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import l7.f;
import q7.k;

public abstract class a implements d<Object>, d, Serializable {

    /* renamed from: f  reason: collision with root package name */
    public final d<Object> f5328f;

    public a(d<Object> dVar) {
        this.f5328f = dVar;
    }

    public d<h> c(Object obj, d<?> dVar) {
        k.e(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public d e() {
        d<Object> dVar = this.f5328f;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public StackTraceElement f() {
        int i8;
        String str;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int v8 = eVar.v();
        if (v8 <= 1) {
            int i9 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                i8 = (num != null ? num.intValue() : 0) - 1;
            } catch (Exception unused) {
                i8 = -1;
            }
            if (i8 >= 0) {
                i9 = eVar.l()[i8];
            }
            f.a aVar = f.f5333b;
            f.a aVar2 = f.f5332a;
            if (aVar == null) {
                try {
                    f.a aVar3 = new f.a(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                    f.f5333b = aVar3;
                    aVar = aVar3;
                } catch (Exception unused2) {
                    f.f5333b = aVar2;
                    aVar = aVar2;
                }
            }
            if (aVar != aVar2) {
                Method method = aVar.f5334a;
                Object invoke = method != null ? method.invoke(getClass(), new Object[0]) : null;
                if (invoke != null) {
                    Method method2 = aVar.f5335b;
                    Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
                    if (invoke2 != null) {
                        Method method3 = aVar.f5336c;
                        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
                        if (invoke3 instanceof String) {
                            str2 = (String) invoke3;
                        }
                    }
                }
            }
            if (str2 == null) {
                str = eVar.c();
            } else {
                str = str2 + '/' + eVar.c();
            }
            return new StackTraceElement(str, eVar.m(), eVar.f(), i9);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v8 + ". Please update the Kotlin standard library.").toString());
    }

    public abstract Object h(Object obj);

    /* JADX WARNING: type inference failed for: r0v0, types: [j7.d, j7.d<java.lang.Object>, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(java.lang.Object r3) {
        /*
            r2 = this;
        L_0x0000:
            l7.a r2 = (l7.a) r2
            j7.d<java.lang.Object> r0 = r2.f5328f
            q7.k.b(r0)
            java.lang.Object r3 = r2.h(r3)     // Catch:{ all -> 0x0010 }
            k7.a r1 = k7.a.f5217f     // Catch:{ all -> 0x0010 }
            if (r3 != r1) goto L_0x0015
            return
        L_0x0010:
            r3 = move-exception
            java.lang.Object r3 = a1.a.q(r3)
        L_0x0015:
            r2.n()
            boolean r2 = r0 instanceof l7.a
            if (r2 == 0) goto L_0x001e
            r2 = r0
            goto L_0x0000
        L_0x001e:
            r0.i(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.a.i(java.lang.Object):void");
    }

    public void n() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object f9 = f();
        if (f9 == null) {
            f9 = getClass().getName();
        }
        sb.append(f9);
        return sb.toString();
    }
}
