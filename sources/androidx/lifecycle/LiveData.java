package androidx.lifecycle;

import androidx.fragment.app.m;
import androidx.lifecycle.m;
import com.samsung.android.wearable.watchfacestudio.editor.h;
import java.util.Map;
import m.b;

public abstract class LiveData<T> {

    /* renamed from: k  reason: collision with root package name */
    public static final Object f1404k = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f1405a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final m.b<z<? super T>, LiveData<T>.c> f1406b = new m.b<>();

    /* renamed from: c  reason: collision with root package name */
    public int f1407c = 0;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1408d;
    public volatile Object e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f1409f;

    /* renamed from: g  reason: collision with root package name */
    public int f1410g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1411h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1412i;

    /* renamed from: j  reason: collision with root package name */
    public final Runnable f1413j;

    public class LifecycleBoundObserver extends LiveData<T>.c implements p {

        /* renamed from: j  reason: collision with root package name */
        public final r f1414j;

        public LifecycleBoundObserver(r rVar, h hVar) {
            super(hVar);
            this.f1414j = rVar;
        }

        public final void c(r rVar, m.a aVar) {
            r rVar2 = this.f1414j;
            m.b bVar = ((s) rVar2.getLifecycle()).f1503d;
            if (bVar == m.b.f1491f) {
                LiveData.this.h(this.f1417f);
                return;
            }
            m.b bVar2 = null;
            while (bVar2 != bVar) {
                d(g());
                bVar2 = bVar;
                bVar = ((s) rVar2.getLifecycle()).f1503d;
            }
        }

        public final void e() {
            this.f1414j.getLifecycle().b(this);
        }

        public final boolean f(r rVar) {
            return this.f1414j == rVar;
        }

        public final boolean g() {
            return ((s) this.f1414j.getLifecycle()).f1503d.e(m.b.f1494i);
        }
    }

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            Object obj;
            synchronized (LiveData.this.f1405a) {
                obj = LiveData.this.f1409f;
                LiveData.this.f1409f = LiveData.f1404k;
            }
            LiveData.this.i(obj);
        }
    }

    public class b extends LiveData<T>.c {
        public b(LiveData liveData, m.d dVar) {
            super(dVar);
        }

        public final boolean g() {
            return true;
        }
    }

    public abstract class c {

        /* renamed from: f  reason: collision with root package name */
        public final z<? super T> f1417f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1418g;

        /* renamed from: h  reason: collision with root package name */
        public int f1419h = -1;

        public c(z<? super T> zVar) {
            this.f1417f = zVar;
        }

        public final void d(boolean z8) {
            if (z8 != this.f1418g) {
                this.f1418g = z8;
                int i8 = z8 ? 1 : -1;
                LiveData liveData = LiveData.this;
                int i9 = liveData.f1407c;
                liveData.f1407c = i8 + i9;
                if (!liveData.f1408d) {
                    liveData.f1408d = true;
                    while (true) {
                        try {
                            int i10 = liveData.f1407c;
                            if (i9 == i10) {
                                break;
                            }
                            boolean z9 = i9 == 0 && i10 > 0;
                            boolean z10 = i9 > 0 && i10 == 0;
                            if (z9) {
                                liveData.f();
                            } else if (z10) {
                                liveData.g();
                            }
                            i9 = i10;
                        } finally {
                            liveData.f1408d = false;
                        }
                    }
                }
                if (this.f1418g) {
                    liveData.c(this);
                }
            }
        }

        public void e() {
        }

        public boolean f(r rVar) {
            return false;
        }

        public abstract boolean g();
    }

    public LiveData() {
        Object obj = f1404k;
        this.f1409f = obj;
        this.f1413j = new a();
        this.e = obj;
        this.f1410g = -1;
    }

    public static void a(String str) {
        if (!l.b.j().k()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    public final void b(LiveData<T>.c cVar) {
        if (cVar.f1418g) {
            if (!cVar.g()) {
                cVar.d(false);
                return;
            }
            int i8 = cVar.f1419h;
            int i9 = this.f1410g;
            if (i8 < i9) {
                cVar.f1419h = i9;
                cVar.f1417f.b(this.e);
            }
        }
    }

    public final void c(LiveData<T>.c cVar) {
        if (this.f1411h) {
            this.f1412i = true;
            return;
        }
        this.f1411h = true;
        do {
            this.f1412i = false;
            if (cVar == null) {
                m.b<z<? super T>, LiveData<T>.c> bVar = this.f1406b;
                bVar.getClass();
                b.d dVar = new b.d();
                bVar.f5341h.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((c) ((Map.Entry) dVar.next()).getValue());
                    if (this.f1412i) {
                        break;
                    }
                }
            } else {
                b(cVar);
                cVar = null;
            }
        } while (this.f1412i);
        this.f1411h = false;
    }

    public final void d(r rVar, h hVar) {
        V v8;
        a("observe");
        if (((s) rVar.getLifecycle()).f1503d != m.b.f1491f) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(rVar, hVar);
            m.b<z<? super T>, LiveData<T>.c> bVar = this.f1406b;
            b.c<z<? super T>, LiveData<T>.c> i8 = bVar.i(hVar);
            if (i8 != null) {
                v8 = i8.f5344g;
            } else {
                b.c<K, V> cVar = new b.c<>(hVar, lifecycleBoundObserver);
                bVar.f5342i++;
                b.c<K, V> cVar2 = bVar.f5340g;
                if (cVar2 == null) {
                    bVar.f5339f = cVar;
                } else {
                    cVar2.f5345h = cVar;
                    cVar.f5346i = cVar2;
                }
                bVar.f5340g = cVar;
                v8 = null;
            }
            c cVar3 = (c) v8;
            if (cVar3 != null && !cVar3.f(rVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (cVar3 == null) {
                rVar.getLifecycle().a(lifecycleBoundObserver);
            }
        }
    }

    public final void e(m.d dVar) {
        V v8;
        a("observeForever");
        b bVar = new b(this, dVar);
        m.b<z<? super T>, LiveData<T>.c> bVar2 = this.f1406b;
        b.c<z<? super T>, LiveData<T>.c> i8 = bVar2.i(dVar);
        if (i8 != null) {
            v8 = i8.f5344g;
        } else {
            b.c<K, V> cVar = new b.c<>(dVar, bVar);
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
        c cVar3 = (c) v8;
        if (cVar3 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (cVar3 == null) {
            bVar.d(true);
        }
    }

    public void f() {
    }

    public void g() {
    }

    public void h(z<? super T> zVar) {
        a("removeObserver");
        c j8 = this.f1406b.j(zVar);
        if (j8 != null) {
            j8.e();
            j8.d(false);
        }
    }

    public void i(T t8) {
        a("setValue");
        this.f1410g++;
        this.e = t8;
        c((LiveData<T>.c) null);
    }
}
