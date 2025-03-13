package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.l;
import androidx.savedstate.Recreator;
import b1.c;
import java.util.Iterator;
import java.util.Map;
import m.b;
import q7.k;

@SuppressLint({"RestrictedApi"})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final m.b<String, b> f1917a = new m.b<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f1918b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f1919c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1920d;
    public Recreator.a e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1921f = true;

    /* renamed from: androidx.savedstate.a$a  reason: collision with other inner class name */
    public interface C0017a {
        void a(c cVar);
    }

    public interface b {
        Bundle a();
    }

    public final Bundle a(String str) {
        if (this.f1920d) {
            Bundle bundle = this.f1919c;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = this.f1919c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f1919c;
            if (!(bundle4 != null && !bundle4.isEmpty())) {
                this.f1919c = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final b b() {
        Map.Entry entry;
        b bVar;
        Iterator<Map.Entry<String, b>> it = this.f1917a.iterator();
        do {
            b.e eVar = (b.e) it;
            if (!eVar.hasNext()) {
                return null;
            }
            entry = (Map.Entry) eVar.next();
            k.d(entry, "components");
            bVar = (b) entry.getValue();
        } while (!k.a((String) entry.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return bVar;
    }

    public final void c(String str, b bVar) {
        V v8;
        k.e(str, "key");
        k.e(bVar, "provider");
        m.b<String, b> bVar2 = this.f1917a;
        b.c<String, b> i8 = bVar2.i(str);
        boolean z8 = true;
        if (i8 != null) {
            v8 = i8.f5344g;
        } else {
            b.c<K, V> cVar = new b.c<>(str, bVar);
            bVar2.f5342i++;
            b.c<K, V> cVar2 = bVar2.f5340g;
            if (cVar2 == null) {
                bVar2.f5339f = cVar;
            } else {
                cVar2.f5345h = cVar;
                cVar.f5346i = cVar2;
            }
            bVar2.f5340g = cVar;
            v8 = null;
        }
        if (((b) v8) != null) {
            z8 = false;
        }
        if (!z8) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void d() {
        Class<l.a> cls = l.a.class;
        if (this.f1921f) {
            Recreator.a aVar = this.e;
            if (aVar == null) {
                aVar = new Recreator.a(this);
            }
            this.e = aVar;
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.a aVar2 = this.e;
                if (aVar2 != null) {
                    aVar2.f1916a.add(cls.getName());
                }
            } catch (NoSuchMethodException e4) {
                throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
    }
}
