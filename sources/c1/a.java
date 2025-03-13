package c1;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.health.services.client.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static volatile a f2640d;
    public static final Object e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f2641a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f2642b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public final Context f2643c;

    public a(Context context) {
        this.f2643c = context.getApplicationContext();
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f2643c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f2642b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, (String) null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e4) {
                throw new c((Throwable) e4);
            }
        }
    }

    public final void b(Class cls, HashSet hashSet) {
        if (d1.a.a()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (!hashSet.contains(cls)) {
            HashMap hashMap = this.f2641a;
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends b<?>>> a9 = bVar.a();
                if (!a9.isEmpty()) {
                    for (Class next : a9) {
                        if (!hashMap.containsKey(next)) {
                            b(next, hashSet);
                        }
                    }
                }
                Object b9 = bVar.b(this.f2643c);
                hashSet.remove(cls);
                hashMap.put(cls, b9);
            } else {
                hashMap.get(cls);
            }
            Trace.endSection();
            return;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
    }
}
