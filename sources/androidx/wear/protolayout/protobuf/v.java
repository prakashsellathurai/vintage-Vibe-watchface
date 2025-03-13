package androidx.wear.protolayout.protobuf;

import androidx.fragment.app.u;
import androidx.wear.protolayout.protobuf.a;
import androidx.wear.protolayout.protobuf.o0;
import androidx.wear.protolayout.protobuf.r;
import androidx.wear.protolayout.protobuf.v;
import androidx.wear.protolayout.protobuf.v.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class v<MessageType extends v<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, v<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected i1 unknownFields = i1.f2120f;

    public static abstract class a<MessageType extends v<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.C0018a<MessageType, BuilderType> {

        /* renamed from: f  reason: collision with root package name */
        public final MessageType f2201f;

        /* renamed from: g  reason: collision with root package name */
        public MessageType f2202g;

        public a(MessageType messagetype) {
            this.f2201f = messagetype;
            if (!messagetype.o()) {
                this.f2202g = (v) messagetype.k();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        public static <MessageType> void g(MessageType messagetype, MessageType messagetype2) {
            y0 y0Var = y0.f2217c;
            y0Var.getClass();
            y0Var.a(messagetype.getClass()).a(messagetype, messagetype2);
        }

        public final v b() {
            return this.f2201f;
        }

        public final MessageType c() {
            MessageType d9 = d();
            d9.getClass();
            if (v.n(d9, true)) {
                return d9;
            }
            throw new g1();
        }

        public final Object clone() {
            a aVar = (a) this.f2201f.j(f.f2207j);
            aVar.f2202g = d();
            return aVar;
        }

        public final MessageType d() {
            if (!this.f2202g.o()) {
                return this.f2202g;
            }
            MessageType messagetype = this.f2202g;
            messagetype.getClass();
            y0 y0Var = y0.f2217c;
            y0Var.getClass();
            y0Var.a(messagetype.getClass()).b(messagetype);
            messagetype.p();
            return this.f2202g;
        }

        public final void e() {
            if (!this.f2202g.o()) {
                MessageType messagetype = (v) this.f2201f.k();
                g(messagetype, this.f2202g);
                this.f2202g = messagetype;
            }
        }

        public final void f(v vVar) {
            if (!this.f2201f.equals(vVar)) {
                e();
                g(this.f2202g, vVar);
            }
        }

        public final boolean isInitialized() {
            return v.n(this.f2202g, false);
        }
    }

    public static class b<T extends v<T, ?>> extends b<T> {
        public b(T t8) {
        }
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends v<MessageType, BuilderType> implements p0 {
        protected r<d> extensions = r.f2168d;

        public final v b() {
            return (v) j(f.f2208k);
        }

        public final a newBuilderForType() {
            return (a) j(f.f2207j);
        }

        public final a toBuilder() {
            a aVar = (a) j(f.f2207j);
            aVar.f(this);
            return aVar;
        }
    }

    public static final class d implements r.a<d> {
        public final void a() {
        }

        public final void b() {
        }

        public final o1 c() {
            throw null;
        }

        public final int compareTo(Object obj) {
            ((d) obj).getClass();
            return 0;
        }

        public final void d() {
        }

        public final void getNumber() {
        }

        public final a k(o0.a aVar, o0 o0Var) {
            a aVar2 = (a) aVar;
            aVar2.f((v) o0Var);
            return aVar2;
        }
    }

    public static class e<ContainingType extends o0, Type> extends u {
    }

    public enum f {
        f2203f,
        f2204g,
        f2205h,
        f2206i,
        f2207j,
        f2208k;

        /* access modifiers changed from: public */
        f() {
        }
    }

    public static <T extends v<?, ?>> T l(Class<T> cls) {
        T t8 = (v) defaultInstanceMap.get(cls);
        if (t8 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t8 = (v) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException("Class initialization cannot fail.", e4);
            }
        }
        if (t8 == null) {
            t8 = (v) ((v) l1.b(cls)).j(f.f2208k);
            if (t8 != null) {
                defaultInstanceMap.put(cls, t8);
            } else {
                throw new IllegalStateException();
            }
        }
        return t8;
    }

    static Object m(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e4);
        } catch (InvocationTargetException e9) {
            Throwable cause = e9.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public static final <T extends v<T, ?>> boolean n(T t8, boolean z8) {
        byte byteValue = ((Byte) t8.j(f.f2203f)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        y0 y0Var = y0.f2217c;
        y0Var.getClass();
        boolean c9 = y0Var.a(t8.getClass()).c(t8);
        if (z8) {
            t8.j(f.f2204g);
        }
        return c9;
    }

    public static <T extends v<T, ?>> T q(T t8, h hVar, n nVar) {
        T t9 = (v) t8.k();
        try {
            y0 y0Var = y0.f2217c;
            y0Var.getClass();
            b1<?> a9 = y0Var.a(t9.getClass());
            i iVar = hVar.f2107c;
            if (iVar == null) {
                iVar = new i(hVar);
            }
            a9.h(t9, iVar, nVar);
            a9.b(t9);
            return t9;
        } catch (y e4) {
            throw e4;
        } catch (g1 e9) {
            throw new y(e9.getMessage());
        } catch (IOException e10) {
            if (e10.getCause() instanceof y) {
                throw ((y) e10.getCause());
            }
            throw new y(e10);
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof y) {
                throw ((y) e11.getCause());
            }
            throw e11;
        }
    }

    public static <T extends v<?, ?>> void r(Class<T> cls, T t8) {
        t8.p();
        defaultInstanceMap.put(cls, t8);
    }

    public final void a(j jVar) {
        y0 y0Var = y0.f2217c;
        y0Var.getClass();
        b1<?> a9 = y0Var.a(getClass());
        k kVar = jVar.f2127a;
        if (kVar == null) {
            kVar = new k(jVar);
        }
        a9.i(this, kVar);
    }

    public v b() {
        return (v) j(f.f2208k);
    }

    /* access modifiers changed from: package-private */
    public final int c() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    public final int d(b1<?> b1Var) {
        if (o()) {
            if (b1Var == null) {
                y0 y0Var = y0.f2217c;
                y0Var.getClass();
                b1Var = y0Var.a(getClass());
            }
            int e4 = b1Var.e(this);
            if (e4 >= 0) {
                return e4;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + e4);
        } else if (c() != Integer.MAX_VALUE) {
            return c();
        } else {
            if (b1Var == null) {
                y0 y0Var2 = y0.f2217c;
                y0Var2.getClass();
                b1Var = y0Var2.a(getClass());
            }
            int e9 = b1Var.e(this);
            f(e9);
            return e9;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        y0 y0Var = y0.f2217c;
        y0Var.getClass();
        return y0Var.a(getClass()).d(this, (v) obj);
    }

    /* access modifiers changed from: package-private */
    public final void f(int i8) {
        if (i8 >= 0) {
            this.memoizedSerializedSize = (i8 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
            return;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i8);
    }

    public final int getSerializedSize() {
        return d((b1) null);
    }

    public final void h() {
        this.memoizedHashCode = 0;
    }

    public final int hashCode() {
        if (o()) {
            y0 y0Var = y0.f2217c;
            y0Var.getClass();
            return y0Var.a(getClass()).g(this);
        }
        if (this.memoizedHashCode == 0) {
            y0 y0Var2 = y0.f2217c;
            y0Var2.getClass();
            this.memoizedHashCode = y0Var2.a(getClass()).g(this);
        }
        return this.memoizedHashCode;
    }

    public final void i() {
        f(Integer.MAX_VALUE);
    }

    public final boolean isInitialized() {
        return n(this, true);
    }

    public abstract Object j(f fVar);

    public final Object k() {
        return j(f.f2206i);
    }

    public a newBuilderForType() {
        return (a) j(f.f2207j);
    }

    /* access modifiers changed from: package-private */
    public final boolean o() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void p() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public a toBuilder() {
        a aVar = (a) j(f.f2207j);
        aVar.f(this);
        return aVar;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = q0.f2167a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        q0.c(this, sb, 0);
        return sb.toString();
    }
}
