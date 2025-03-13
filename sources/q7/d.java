package q7;

import java.io.Serializable;

public abstract class d implements u7.a, Serializable {

    /* renamed from: l  reason: collision with root package name */
    public static final Object f6628l = a.f6635f;

    /* renamed from: f  reason: collision with root package name */
    public transient u7.a f6629f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f6630g;

    /* renamed from: h  reason: collision with root package name */
    public final Class f6631h;

    /* renamed from: i  reason: collision with root package name */
    public final String f6632i;

    /* renamed from: j  reason: collision with root package name */
    public final String f6633j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f6634k;

    public static class a implements Serializable {

        /* renamed from: f  reason: collision with root package name */
        public static final a f6635f = new a();
    }

    public d(Object obj, Class cls, String str, String str2, boolean z8) {
        this.f6630g = obj;
        this.f6631h = cls;
        this.f6632i = str;
        this.f6633j = str2;
        this.f6634k = z8;
    }

    public abstract u7.a a();

    public final e b() {
        Class cls = this.f6631h;
        if (cls == null) {
            return null;
        }
        if (!this.f6634k) {
            return q.a(cls);
        }
        q.f6644a.getClass();
        return new m(cls);
    }
}
