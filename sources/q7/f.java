package q7;

import h7.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p7.c;
import p7.d;
import p7.e;
import p7.g;
import p7.h;
import p7.i;
import p7.j;
import p7.k;
import p7.l;
import p7.m;
import p7.n;
import p7.o;
import p7.p;
import p7.q;
import p7.r;
import p7.s;
import p7.t;
import p7.u;
import p7.v;
import p7.w;
import u7.b;

public final class f implements b<Object>, e {

    /* renamed from: b  reason: collision with root package name */
    public static final Map<Class<? extends a<?>>, Integer> f6636b;

    /* renamed from: c  reason: collision with root package name */
    public static final HashMap<String, String> f6637c;

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f6638a;

    static {
        int i8 = 0;
        List B = a1.a.B(p7.a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, p7.b.class, c.class, d.class, e.class, p7.f.class, g.class, h.class, i.class, j.class, k.class, m.class, n.class, o.class);
        ArrayList arrayList = new ArrayList(i7.f.M(B));
        for (Object next : B) {
            int i9 = i8 + 1;
            if (i8 >= 0) {
                arrayList.add(new h7.d((Class) next, Integer.valueOf(i8)));
                i8 = i9;
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        f6636b = i7.f.P(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        k.d(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            k.d(str, "kotlinName");
            sb.append(w7.l.u(str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry next2 : f6636b.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            String name = ((Class) next2.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f6637c = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(a1.a.C(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            linkedHashMap.put(entry.getKey(), w7.l.u((String) entry.getValue()));
        }
    }

    public f(Class<?> cls) {
        k.e(cls, "jClass");
        this.f6638a = cls;
    }

    public final Class<?> a() {
        return this.f6638a;
    }

    public final String b() {
        String str;
        Class<?> cls = this.f6638a;
        k.e(cls, "jClass");
        String str2 = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        boolean isArray = cls.isArray();
        HashMap<String, String> hashMap = f6637c;
        if (isArray) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = hashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            return str2 == null ? "kotlin.Array" : str2;
        }
        String str3 = hashMap.get(cls.getName());
        return str3 == null ? cls.getCanonicalName() : str3;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f) && k.a(k3.j.z(this), k3.j.z((b) obj));
    }

    public final int hashCode() {
        return k3.j.z(this).hashCode();
    }

    public final String toString() {
        return this.f6638a.toString() + " (Kotlin reflection is not available)";
    }
}
