package com.google.protobuf;

import com.google.protobuf.a;
import com.google.protobuf.a0;
import com.google.protobuf.e;
import com.google.protobuf.r0;
import com.google.protobuf.u;
import com.google.protobuf.y;
import com.google.protobuf.y.a;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class y<MessageType extends y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a<MessageType, BuilderType> {
    private static Map<Object, y<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize = -1;
    protected n1 unknownFields = n1.f3726f;

    public static class b<T extends y<T, ?>> extends b<T> {
        public b(T t8) {
        }
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends y<MessageType, BuilderType> implements s0 {

        /* renamed from: f  reason: collision with root package name */
        public u<d> f3810f = u.f3776d;

        public final /* bridge */ /* synthetic */ r0 getDefaultInstanceForType() {
            return y.super.getDefaultInstanceForType();
        }

        public final /* bridge */ /* synthetic */ r0.a newBuilderForType() {
            return y.super.newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r0.a toBuilder() {
            return y.super.toBuilder();
        }
    }

    public static final class d implements u.a<d> {

        /* renamed from: f  reason: collision with root package name */
        public final a0.d<?> f3811f;

        /* renamed from: g  reason: collision with root package name */
        public final int f3812g;

        /* renamed from: h  reason: collision with root package name */
        public final s1 f3813h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f3814i;

        /* renamed from: j  reason: collision with root package name */
        public final boolean f3815j;

        public d(a0.d<?> dVar, int i8, s1 s1Var, boolean z8, boolean z9) {
            this.f3811f = dVar;
            this.f3812g = i8;
            this.f3813h = s1Var;
            this.f3814i = z8;
            this.f3815j = z9;
        }

        public final boolean a() {
            return this.f3814i;
        }

        public final s1 b() {
            return this.f3813h;
        }

        public final t1 c() {
            return this.f3813h.f3761f;
        }

        public final int compareTo(Object obj) {
            return this.f3812g - ((d) obj).f3812g;
        }

        public final boolean d() {
            return this.f3815j;
        }

        public final int getNumber() {
            return this.f3812g;
        }

        public final a m(r0.a aVar, r0 r0Var) {
            return ((a) aVar).mergeFrom((y) r0Var);
        }
    }

    public static class e<ContainingType extends r0, Type> extends o<ContainingType, Type> {

        /* renamed from: a  reason: collision with root package name */
        public final ContainingType f3816a;

        /* renamed from: b  reason: collision with root package name */
        public final Type f3817b;

        /* renamed from: c  reason: collision with root package name */
        public final r0 f3818c;

        /* renamed from: d  reason: collision with root package name */
        public final d f3819d;

        public e(r0 r0Var, Object obj, r0 r0Var2, d dVar) {
            if (r0Var == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (dVar.f3813h == s1.f3758o && r0Var2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.f3816a = r0Var;
                this.f3817b = obj;
                this.f3818c = r0Var2;
                this.f3819d = dVar;
            }
        }
    }

    public enum f {
        f3820f,
        f3821g,
        f3822h,
        f3823i,
        f3824j,
        f3825k,
        f3826l;

        /* access modifiers changed from: public */
        f() {
        }
    }

    /* access modifiers changed from: private */
    public static <MessageType extends c<MessageType, BuilderType>, BuilderType, T> e<MessageType, T> checkIsLite(o<MessageType, T> oVar) {
        oVar.getClass();
        return (e) oVar;
    }

    private static <T extends y<T, ?>> T checkMessageInitialized(T t8) {
        if (t8 == null || t8.isInitialized()) {
            return t8;
        }
        l1 newUninitializedMessageException = t8.newUninitializedMessageException();
        newUninitializedMessageException.getClass();
        throw new b0(newUninitializedMessageException.getMessage());
    }

    public static a0.a emptyBooleanList() {
        return g.f3635i;
    }

    public static a0.b emptyDoubleList() {
        return n.f3723i;
    }

    public static a0.f emptyFloatList() {
        return w.f3806i;
    }

    public static a0.g emptyIntList() {
        return z.f3830i;
    }

    public static a0.i emptyLongList() {
        return i0.f3654i;
    }

    public static <E> a0.j<E> emptyProtobufList() {
        return c1.f3612i;
    }

    private final void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == n1.f3726f) {
            this.unknownFields = new n1();
        }
    }

    public static <T extends y<?, ?>> T getDefaultInstance(Class<T> cls) {
        T t8 = (y) defaultInstanceMap.get(cls);
        if (t8 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t8 = (y) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException("Class initialization cannot fail.", e4);
            }
        }
        if (t8 == null) {
            t8 = ((y) q1.b(cls)).getDefaultInstanceForType();
            if (t8 != null) {
                defaultInstanceMap.put(cls, t8);
            } else {
                throw new IllegalStateException();
            }
        }
        return t8;
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e4);
        }
    }

    static Object invokeOrDie(Method method, Object obj, Object... objArr) {
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

    public static final <T extends y<T, ?>> boolean isInitialized(T t8, boolean z8) {
        byte byteValue = ((Byte) t8.dynamicMethod(f.f3820f)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        b1 b1Var = b1.f3596c;
        b1Var.getClass();
        boolean c9 = b1Var.a(t8.getClass()).c(t8);
        if (z8) {
            t8.dynamicMethod(f.f3821g, c9 ? t8 : null);
        }
        return c9;
    }

    public static a0.a mutableCopy(a0.a aVar) {
        g gVar = (g) aVar;
        int i8 = gVar.f3637h;
        int i9 = i8 == 0 ? 10 : i8 * 2;
        if (i9 >= i8) {
            return new g(Arrays.copyOf(gVar.f3636g, i9), gVar.f3637h);
        }
        throw new IllegalArgumentException();
    }

    public static <E> a0.j<E> mutableCopy(a0.j<E> jVar) {
        int size = jVar.size();
        return jVar.b(size == 0 ? 10 : size * 2);
    }

    public static Object newMessageInfo(r0 r0Var, String str, Object[] objArr) {
        return new d1(r0Var, str, objArr);
    }

    public static <ContainingType extends r0, Type> e<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, r0 r0Var, a0.d<?> dVar, int i8, s1 s1Var, boolean z8, Class cls) {
        return new e<>(containingtype, Collections.emptyList(), r0Var, new d(dVar, i8, s1Var, true, z8));
    }

    public static <ContainingType extends r0, Type> e<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, r0 r0Var, a0.d<?> dVar, int i8, s1 s1Var, Class cls) {
        return new e<>(containingtype, type, r0Var, new d(dVar, i8, s1Var, false, false));
    }

    public static <T extends y<T, ?>> T parseDelimitedFrom(T t8, InputStream inputStream) {
        return checkMessageInitialized(parsePartialDelimitedFrom(t8, inputStream, q.a()));
    }

    public static <T extends y<T, ?>> T parseDelimitedFrom(T t8, InputStream inputStream, q qVar) {
        return checkMessageInitialized(parsePartialDelimitedFrom(t8, inputStream, qVar));
    }

    public static <T extends y<T, ?>> T parseFrom(T t8, i iVar) {
        return checkMessageInitialized(parseFrom(t8, iVar, q.a()));
    }

    public static <T extends y<T, ?>> T parseFrom(T t8, i iVar, q qVar) {
        return checkMessageInitialized(parsePartialFrom(t8, iVar, qVar));
    }

    public static <T extends y<T, ?>> T parseFrom(T t8, j jVar) {
        return parseFrom(t8, jVar, q.a());
    }

    public static <T extends y<T, ?>> T parseFrom(T t8, j jVar, q qVar) {
        return checkMessageInitialized(parsePartialFrom(t8, jVar, qVar));
    }

    public static <T extends y<T, ?>> T parseFrom(T t8, InputStream inputStream) {
        return checkMessageInitialized(parsePartialFrom(t8, j.g(inputStream), q.a()));
    }

    public static <T extends y<T, ?>> T parseFrom(T t8, InputStream inputStream, q qVar) {
        return checkMessageInitialized(parsePartialFrom(t8, j.g(inputStream), qVar));
    }

    public static <T extends y<T, ?>> T parseFrom(T t8, ByteBuffer byteBuffer) {
        return parseFrom(t8, byteBuffer, q.a());
    }

    public static <T extends y<T, ?>> T parseFrom(T t8, ByteBuffer byteBuffer, q qVar) {
        return checkMessageInitialized(parseFrom(t8, j.h(byteBuffer, false), qVar));
    }

    public static <T extends y<T, ?>> T parseFrom(T t8, byte[] bArr) {
        return checkMessageInitialized(parsePartialFrom(t8, bArr, 0, bArr.length, q.a()));
    }

    public static <T extends y<T, ?>> T parseFrom(T t8, byte[] bArr, q qVar) {
        return checkMessageInitialized(parsePartialFrom(t8, bArr, 0, bArr.length, qVar));
    }

    private static <T extends y<T, ?>> T parsePartialDelimitedFrom(T t8, InputStream inputStream, q qVar) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            j g9 = j.g(new a.C0042a.C0043a(j.t(read, inputStream), inputStream));
            T parsePartialFrom = parsePartialFrom(t8, g9, qVar);
            try {
                g9.a(0);
                return parsePartialFrom;
            } catch (b0 e4) {
                throw e4;
            }
        } catch (b0 e9) {
            e = e9;
            if (e.f3595f) {
                e = new b0((IOException) e);
            }
            throw e;
        } catch (IOException e10) {
            throw new b0(e10);
        }
    }

    private static <T extends y<T, ?>> T parsePartialFrom(T t8, i iVar, q qVar) {
        try {
            j p8 = iVar.p();
            T parsePartialFrom = parsePartialFrom(t8, p8, qVar);
            p8.a(0);
            return parsePartialFrom;
        } catch (b0 e4) {
            throw e4;
        } catch (b0 e9) {
            throw e9;
        }
    }

    public static <T extends y<T, ?>> T parsePartialFrom(T t8, j jVar) {
        return parsePartialFrom(t8, jVar, q.a());
    }

    public static <T extends y<T, ?>> T parsePartialFrom(T t8, j jVar, q qVar) {
        T t9 = (y) t8.dynamicMethod(f.f3823i);
        try {
            b1 b1Var = b1.f3596c;
            b1Var.getClass();
            f1<?> a9 = b1Var.a(t9.getClass());
            k kVar = jVar.f3677d;
            if (kVar == null) {
                kVar = new k(jVar);
            }
            a9.i(t9, kVar, qVar);
            a9.b(t9);
            return t9;
        } catch (b0 e4) {
            e = e4;
            if (e.f3595f) {
                e = new b0((IOException) e);
            }
            throw e;
        } catch (IOException e9) {
            if (e9.getCause() instanceof b0) {
                throw ((b0) e9.getCause());
            }
            throw new b0(e9);
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof b0) {
                throw ((b0) e10.getCause());
            }
            throw e10;
        }
    }

    private static <T extends y<T, ?>> T parsePartialFrom(T t8, byte[] bArr, q qVar) {
        return checkMessageInitialized(parsePartialFrom(t8, bArr, 0, bArr.length, qVar));
    }

    public static <T extends y<?, ?>> void registerDefaultInstance(Class<T> cls, T t8) {
        defaultInstanceMap.put(cls, t8);
    }

    /* access modifiers changed from: package-private */
    public Object buildMessageInfo() {
        return dynamicMethod(f.f3822h);
    }

    public final <MessageType extends y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType createBuilder() {
        return (a) dynamicMethod(f.f3824j);
    }

    public final <MessageType extends y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType createBuilder(MessageType messagetype) {
        return createBuilder().mergeFrom(messagetype);
    }

    public Object dynamicMethod(f fVar) {
        return dynamicMethod(fVar, (Object) null, (Object) null);
    }

    public Object dynamicMethod(f fVar, Object obj) {
        return dynamicMethod(fVar, obj, (Object) null);
    }

    public abstract Object dynamicMethod(f fVar, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b1 b1Var = b1.f3596c;
        b1Var.getClass();
        return b1Var.a(getClass()).d(this, (y) obj);
    }

    public final MessageType getDefaultInstanceForType() {
        return (y) dynamicMethod(f.f3825k);
    }

    /* access modifiers changed from: package-private */
    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize;
    }

    public final z0<MessageType> getParserForType() {
        return (z0) dynamicMethod(f.f3826l);
    }

    public int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            b1 b1Var = b1.f3596c;
            b1Var.getClass();
            this.memoizedSerializedSize = b1Var.a(getClass()).e(this);
        }
        return this.memoizedSerializedSize;
    }

    public int hashCode() {
        int i8 = this.memoizedHashCode;
        if (i8 != 0) {
            return i8;
        }
        b1 b1Var = b1.f3596c;
        b1Var.getClass();
        int g9 = b1Var.a(getClass()).g(this);
        this.memoizedHashCode = g9;
        return g9;
    }

    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public void makeImmutable() {
        b1 b1Var = b1.f3596c;
        b1Var.getClass();
        b1Var.a(getClass()).b(this);
    }

    public void mergeLengthDelimitedField(int i8, i iVar) {
        ensureUnknownFieldsInitialized();
        n1 n1Var = this.unknownFields;
        if (!n1Var.e) {
            throw new UnsupportedOperationException();
        } else if (i8 != 0) {
            n1Var.d((i8 << 3) | 2, iVar);
        } else {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
    }

    public final void mergeUnknownFields(n1 n1Var) {
        this.unknownFields = n1.c(this.unknownFields, n1Var);
    }

    public void mergeVarintField(int i8, int i9) {
        ensureUnknownFieldsInitialized();
        n1 n1Var = this.unknownFields;
        if (!n1Var.e) {
            throw new UnsupportedOperationException();
        } else if (i8 != 0) {
            n1Var.d((i8 << 3) | 0, Long.valueOf((long) i9));
        } else {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
    }

    public final BuilderType newBuilderForType() {
        return (a) dynamicMethod(f.f3824j);
    }

    public boolean parseUnknownField(int i8, j jVar) {
        if ((i8 & 7) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.b(i8, jVar);
    }

    /* access modifiers changed from: package-private */
    public void setMemoizedSerializedSize(int i8) {
        this.memoizedSerializedSize = i8;
    }

    public final BuilderType toBuilder() {
        BuilderType buildertype = (a) dynamicMethod(f.f3824j);
        buildertype.mergeFrom(this);
        return buildertype;
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        t0.c(this, sb, 0);
        return sb.toString();
    }

    public void writeTo(l lVar) {
        b1 b1Var = b1.f3596c;
        b1Var.getClass();
        f1<?> a9 = b1Var.a(getClass());
        m mVar = lVar.f3714a;
        if (mVar == null) {
            mVar = new m(lVar);
        }
        a9.h(this, mVar);
    }

    public static a0.b mutableCopy(a0.b bVar) {
        n nVar = (n) bVar;
        int i8 = nVar.f3725h;
        int i9 = i8 == 0 ? 10 : i8 * 2;
        if (i9 >= i8) {
            return new n(Arrays.copyOf(nVar.f3724g, i9), nVar.f3725h);
        }
        throw new IllegalArgumentException();
    }

    public static a0.f mutableCopy(a0.f fVar) {
        w wVar = (w) fVar;
        int i8 = wVar.f3808h;
        int i9 = i8 == 0 ? 10 : i8 * 2;
        if (i9 >= i8) {
            return new w(wVar.f3808h, Arrays.copyOf(wVar.f3807g, i9));
        }
        throw new IllegalArgumentException();
    }

    public static abstract class a<MessageType extends y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.C0042a<MessageType, BuilderType> {
        private final MessageType defaultInstance;
        protected MessageType instance;
        protected boolean isBuilt = false;

        public a(MessageType messagetype) {
            this.defaultInstance = messagetype;
            this.instance = (y) messagetype.dynamicMethod(f.f3823i);
        }

        private void mergeFromInstance(MessageType messagetype, MessageType messagetype2) {
            b1 b1Var = b1.f3596c;
            b1Var.getClass();
            b1Var.a(messagetype.getClass()).a(messagetype, messagetype2);
        }

        public final MessageType build() {
            MessageType buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw a.C0042a.newUninitializedMessageException(buildPartial);
        }

        public MessageType buildPartial() {
            if (this.isBuilt) {
                return this.instance;
            }
            this.instance.makeImmutable();
            this.isBuilt = true;
            return this.instance;
        }

        public final BuilderType clear() {
            this.instance = (y) this.instance.dynamicMethod(f.f3823i);
            return this;
        }

        public BuilderType clone() {
            BuilderType newBuilderForType = getDefaultInstanceForType().newBuilderForType();
            newBuilderForType.mergeFrom(buildPartial());
            return newBuilderForType;
        }

        public final void copyOnWrite() {
            if (this.isBuilt) {
                copyOnWriteInternal();
                this.isBuilt = false;
            }
        }

        public void copyOnWriteInternal() {
            MessageType messagetype = (y) this.instance.dynamicMethod(f.f3823i);
            mergeFromInstance(messagetype, this.instance);
            this.instance = messagetype;
        }

        public MessageType getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        public BuilderType internalMergeFrom(MessageType messagetype) {
            return mergeFrom(messagetype);
        }

        public final boolean isInitialized() {
            return y.isInitialized(this.instance, false);
        }

        public BuilderType mergeFrom(j jVar, q qVar) {
            copyOnWrite();
            try {
                b1 b1Var = b1.f3596c;
                MessageType messagetype = this.instance;
                b1Var.getClass();
                f1<?> a9 = b1Var.a(messagetype.getClass());
                MessageType messagetype2 = this.instance;
                k kVar = jVar.f3677d;
                if (kVar == null) {
                    kVar = new k(jVar);
                }
                a9.i(messagetype2, kVar, qVar);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        public BuilderType mergeFrom(MessageType messagetype) {
            copyOnWrite();
            mergeFromInstance(this.instance, messagetype);
            return this;
        }

        public BuilderType mergeFrom(byte[] bArr, int i8, int i9) {
            return mergeFrom(bArr, i8, i9, q.a());
        }

        public BuilderType mergeFrom(byte[] bArr, int i8, int i9, q qVar) {
            copyOnWrite();
            try {
                b1 b1Var = b1.f3596c;
                MessageType messagetype = this.instance;
                b1Var.getClass();
                b1Var.a(messagetype.getClass()).j(this.instance, bArr, i8, i8 + i9, new e.a(qVar));
                return this;
            } catch (b0 e) {
                throw e;
            } catch (IndexOutOfBoundsException unused) {
                throw b0.h();
            } catch (IOException e4) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e4);
            }
        }
    }

    public static a0.g mutableCopy(a0.g gVar) {
        z zVar = (z) gVar;
        int i8 = zVar.f3832h;
        int i9 = i8 == 0 ? 10 : i8 * 2;
        if (i9 >= i8) {
            return new z(Arrays.copyOf(zVar.f3831g, i9), zVar.f3832h);
        }
        throw new IllegalArgumentException();
    }

    public static <T extends y<T, ?>> T parsePartialFrom(T t8, byte[] bArr, int i8, int i9, q qVar) {
        T t9 = (y) t8.dynamicMethod(f.f3823i);
        try {
            b1 b1Var = b1.f3596c;
            b1Var.getClass();
            f1<?> a9 = b1Var.a(t9.getClass());
            a9.j(t9, bArr, i8, i8 + i9, new e.a(qVar));
            a9.b(t9);
            if (t9.memoizedHashCode == 0) {
                return t9;
            }
            throw new RuntimeException();
        } catch (b0 e4) {
            e = e4;
            if (e.f3595f) {
                e = new b0((IOException) e);
            }
            throw e;
        } catch (IOException e9) {
            if (e9.getCause() instanceof b0) {
                throw ((b0) e9.getCause());
            }
            throw new b0(e9);
        } catch (IndexOutOfBoundsException unused) {
            throw b0.h();
        }
    }

    public static a0.i mutableCopy(a0.i iVar) {
        i0 i0Var = (i0) iVar;
        int i8 = i0Var.f3656h;
        int i9 = i8 == 0 ? 10 : i8 * 2;
        if (i9 >= i8) {
            return new i0(Arrays.copyOf(i0Var.f3655g, i9), i0Var.f3656h);
        }
        throw new IllegalArgumentException();
    }
}
