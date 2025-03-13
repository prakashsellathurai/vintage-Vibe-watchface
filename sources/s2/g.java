package s2;

import android.util.Log;
import e2.f;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;
import k3.j;

public final class g implements b {

    /* renamed from: a  reason: collision with root package name */
    public final f<a, Object> f7182a = new f<>();

    /* renamed from: b  reason: collision with root package name */
    public final b f7183b = new b();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f7184c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f7185d = new HashMap();
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public int f7186f;

    public static final class a implements j {

        /* renamed from: a  reason: collision with root package name */
        public final b f7187a;

        /* renamed from: b  reason: collision with root package name */
        public int f7188b;

        /* renamed from: c  reason: collision with root package name */
        public Class<?> f7189c;

        public a(b bVar) {
            this.f7187a = bVar;
        }

        public final void a() {
            this.f7187a.f(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f7188b == aVar.f7188b && this.f7189c == aVar.f7189c;
        }

        public final int hashCode() {
            int i8 = this.f7188b * 31;
            Class<?> cls = this.f7189c;
            return i8 + (cls != null ? cls.hashCode() : 0);
        }

        public final String toString() {
            return "Key{size=" + this.f7188b + "array=" + this.f7189c + '}';
        }
    }

    public static final class b extends f {
        public final j d() {
            return new a(this);
        }
    }

    public g(int i8) {
        this.e = i8;
    }

    public final synchronized void a(int i8) {
        if (i8 >= 40) {
            try {
                b();
            } catch (Throwable th) {
                throw th;
            }
        } else if (i8 >= 20 || i8 == 15) {
            g(this.e / 2);
        }
    }

    public final synchronized void b() {
        g(0);
    }

    public final synchronized <T> void c(T t8) {
        Class<?> cls = t8.getClass();
        a<?> h8 = h(cls);
        int b9 = h8.b(t8);
        int c9 = h8.c() * b9;
        int i8 = 1;
        if (c9 <= this.e / 2) {
            a aVar = (a) this.f7183b.e();
            aVar.f7188b = b9;
            aVar.f7189c = cls;
            this.f7182a.b(aVar, t8);
            NavigableMap<Integer, Integer> j8 = j(cls);
            Integer num = j8.get(Integer.valueOf(aVar.f7188b));
            Integer valueOf = Integer.valueOf(aVar.f7188b);
            if (num != null) {
                i8 = 1 + num.intValue();
            }
            j8.put(valueOf, Integer.valueOf(i8));
            this.f7186f += c9;
            g(this.e);
        }
    }

    public final synchronized <T> T d(int i8, Class<T> cls) {
        a aVar;
        boolean z8;
        Integer ceilingKey = j(cls).ceilingKey(Integer.valueOf(i8));
        boolean z9 = false;
        if (ceilingKey != null) {
            int i9 = this.f7186f;
            if (i9 != 0) {
                if (this.e / i9 < 2) {
                    z8 = false;
                    if (z8 || ceilingKey.intValue() <= i8 * 8) {
                        z9 = true;
                    }
                }
            }
            z8 = true;
            z9 = true;
        }
        if (z9) {
            b bVar = this.f7183b;
            int intValue = ceilingKey.intValue();
            aVar = (a) bVar.e();
            aVar.f7188b = intValue;
            aVar.f7189c = cls;
        } else {
            a aVar2 = (a) this.f7183b.e();
            aVar2.f7188b = i8;
            aVar2.f7189c = cls;
            aVar = aVar2;
        }
        return i(aVar, cls);
    }

    public final synchronized Object e() {
        Object i8;
        Class cls = byte[].class;
        synchronized (this) {
            a aVar = (a) this.f7183b.e();
            aVar.f7188b = 8;
            aVar.f7189c = cls;
            i8 = i(aVar, cls);
        }
        return i8;
    }

    public final void f(int i8, Class<?> cls) {
        NavigableMap<Integer, Integer> j8 = j(cls);
        Integer num = j8.get(Integer.valueOf(i8));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i8 + ", this: " + this);
        } else if (num.intValue() == 1) {
            j8.remove(Integer.valueOf(i8));
        } else {
            j8.put(Integer.valueOf(i8), Integer.valueOf(num.intValue() - 1));
        }
    }

    public final void g(int i8) {
        while (this.f7186f > i8) {
            Object c9 = this.f7182a.c();
            j.l(c9);
            a<?> h8 = h(c9.getClass());
            this.f7186f -= h8.b(c9) * h8.c();
            f(h8.b(c9), c9.getClass());
            if (Log.isLoggable(h8.a(), 2)) {
                h8.a();
                h8.b(c9);
            }
        }
    }

    public final <T> a<T> h(Class<T> cls) {
        HashMap hashMap = this.f7185d;
        a<T> aVar = (a) hashMap.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new e(1);
            } else if (cls.equals(byte[].class)) {
                aVar = new e(0);
            } else {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            hashMap.put(cls, aVar);
        }
        return aVar;
    }

    public final <T> T i(a aVar, Class<T> cls) {
        a<T> h8 = h(cls);
        T a9 = this.f7182a.a(aVar);
        if (a9 != null) {
            this.f7186f -= h8.b(a9) * h8.c();
            f(h8.b(a9), cls);
        }
        if (a9 != null) {
            return a9;
        }
        if (Log.isLoggable(h8.a(), 2)) {
            h8.a();
        }
        return h8.newArray(aVar.f7188b);
    }

    public final NavigableMap<Integer, Integer> j(Class<?> cls) {
        HashMap hashMap = this.f7184c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) hashMap.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        hashMap.put(cls, treeMap);
        return treeMap;
    }

    @Deprecated
    public final void put(Object obj) {
        c(obj);
    }
}
