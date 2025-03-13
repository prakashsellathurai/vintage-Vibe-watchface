package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public Random f313a = new Random();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f314b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f315c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f316d = new HashMap();
    public ArrayList<String> e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public final transient HashMap f317f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f318g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final Bundle f319h = new Bundle();

    public static class a<O> {

        /* renamed from: a  reason: collision with root package name */
        public final b<O> f320a;

        /* renamed from: b  reason: collision with root package name */
        public final d.a<?, O> f321b;

        public a(d.a aVar, b bVar) {
            this.f320a = bVar;
            this.f321b = aVar;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final m f322a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<p> f323b = new ArrayList<>();

        public b(m mVar) {
            this.f322a = mVar;
        }
    }

    public final boolean a(int i8, int i9, Intent intent) {
        b<O> bVar;
        String str = (String) this.f314b.get(Integer.valueOf(i8));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.f317f.get(str);
        if (aVar == null || (bVar = aVar.f320a) == null || !this.e.contains(str)) {
            this.f318g.remove(str);
            this.f319h.putParcelable(str, new a(intent, i9));
            return true;
        }
        bVar.a(aVar.f321b.c(intent, i9));
        this.e.remove(str);
        return true;
    }

    public abstract void b(int i8, d.a aVar, @SuppressLint({"UnknownNullness"}) Object obj);

    public final d c(String str, r rVar, d.a aVar, b bVar) {
        m lifecycle = rVar.getLifecycle();
        s sVar = (s) lifecycle;
        if (!(sVar.f1503d.compareTo(m.b.f1494i) >= 0)) {
            e(str);
            HashMap hashMap = this.f316d;
            b bVar2 = (b) hashMap.get(str);
            if (bVar2 == null) {
                bVar2 = new b(lifecycle);
            }
            ActivityResultRegistry$1 activityResultRegistry$1 = new ActivityResultRegistry$1(this, str, bVar, aVar);
            bVar2.f322a.a(activityResultRegistry$1);
            bVar2.f323b.add(activityResultRegistry$1);
            hashMap.put(str, bVar2);
            return new d(this, str, aVar);
        }
        throw new IllegalStateException("LifecycleOwner " + rVar + " is attempting to register while current state is " + sVar.f1503d + ". LifecycleOwners must call register before they are STARTED.");
    }

    public final e d(String str, d.a aVar, b bVar) {
        e(str);
        this.f317f.put(str, new a(aVar, bVar));
        HashMap hashMap = this.f318g;
        if (hashMap.containsKey(str)) {
            Object obj = hashMap.get(str);
            hashMap.remove(str);
            bVar.a(obj);
        }
        Bundle bundle = this.f319h;
        a aVar2 = (a) bundle.getParcelable(str);
        if (aVar2 != null) {
            bundle.remove(str);
            bVar.a(aVar.c(aVar2.f306g, aVar2.f305f));
        }
        return new e(this, str, aVar);
    }

    public final void e(String str) {
        int nextInt;
        HashMap hashMap;
        HashMap hashMap2 = this.f315c;
        if (((Integer) hashMap2.get(str)) == null) {
            do {
                nextInt = this.f313a.nextInt(2147418112) + 65536;
                hashMap = this.f314b;
            } while (hashMap.containsKey(Integer.valueOf(nextInt)));
            hashMap.put(Integer.valueOf(nextInt), str);
            hashMap2.put(str, Integer.valueOf(nextInt));
        }
    }

    public final void f(String str) {
        Integer num;
        if (!this.e.contains(str) && (num = (Integer) this.f315c.remove(str)) != null) {
            this.f314b.remove(num);
        }
        this.f317f.remove(str);
        HashMap hashMap = this.f318g;
        if (hashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + hashMap.get(str));
            hashMap.remove(str);
        }
        Bundle bundle = this.f319h;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + bundle.getParcelable(str));
            bundle.remove(str);
        }
        HashMap hashMap2 = this.f316d;
        b bVar = (b) hashMap2.get(str);
        if (bVar != null) {
            ArrayList<p> arrayList = bVar.f323b;
            Iterator<p> it = arrayList.iterator();
            while (it.hasNext()) {
                bVar.f322a.b(it.next());
            }
            arrayList.clear();
            hashMap2.remove(str);
        }
    }
}
